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

public class ArithmeticTest extends TestCase {
  MetaClassRegistry registry = NgSystem.metaClassRegistry;
  
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
  Object complementOneInt = new NgInt(~1);
  
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
  
  Object minusOneBigInt = BigInteger.valueOf(-1);
  Object zeroBigInt = BigInteger.ZERO;
  Object oneBigInt = BigInteger.ONE;
  Object twoBigInt = BigInteger.valueOf(2);
  
  Object minusOneBigDecimal = BigDecimal.valueOf(-1);
  Object zeroBigDecimal = BigDecimal.valueOf(0);
  Object oneBigDecimal = BigDecimal.valueOf(1);
  Object twoBigDecimal = BigDecimal.valueOf(2);
  
  Object[] ones = new Object[] {oneByte, oneChar, oneShort, oneInt, oneLong, oneFloat, oneDouble, oneBigInt, oneBigDecimal};
  Object[] twos = new Object[] {twoByte, twoChar, twoShort, twoInt, twoLong, twoFloat, twoDouble, twoBigInt, twoBigDecimal};
  
  Object[] integralOnes = new Object[] {oneByte, oneChar, oneShort, oneInt, oneLong, oneBigInt};
  Object[] integralTwos = new Object[] {twoByte, twoChar, twoShort, twoInt, twoLong, twoBigInt};
   
  Map integralType = new HashMap();
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
  
  Map longType = new HashMap();
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
  
  Map integerDivideFloatType = new HashMap();
  {
    integerDivideFloatType.put(byte.class, float.class);
    integerDivideFloatType.put(char.class, float.class);
    integerDivideFloatType.put(short.class, float.class);
    integerDivideFloatType.put(int.class, float.class);
    integerDivideFloatType.put(long.class, float.class);
    integerDivideFloatType.put(float.class, float.class);
    integerDivideFloatType.put(double.class, double.class);
    integerDivideFloatType.put(BigInteger.class, BigDecimal.class);
    integerDivideFloatType.put(BigDecimal.class, BigDecimal.class);
  }
  
  Map floatType = new HashMap();
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
  
  Map integerDivideDoubleType = new HashMap();
  {
    integerDivideDoubleType.put(byte.class, double.class);
    integerDivideDoubleType.put(char.class, double.class);
    integerDivideDoubleType.put(short.class, double.class);
    integerDivideDoubleType.put(int.class, double.class);
    integerDivideDoubleType.put(long.class, double.class);
    integerDivideDoubleType.put(float.class, double.class);
    integerDivideDoubleType.put(double.class, double.class);
    integerDivideDoubleType.put(BigInteger.class, BigDecimal.class);
    integerDivideDoubleType.put(BigDecimal.class, BigDecimal.class);
  }
  
  Map doubleType = new HashMap();
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
  
  Map integerDivideBigIntegerType = new HashMap();
  {
    integerDivideBigIntegerType.put(byte.class, BigInteger.class);
    integerDivideBigIntegerType.put(char.class, BigInteger.class);
    integerDivideBigIntegerType.put(short.class, BigInteger.class);
    integerDivideBigIntegerType.put(int.class, BigInteger.class);
    integerDivideBigIntegerType.put(long.class, BigInteger.class);
    integerDivideBigIntegerType.put(float.class, BigDecimal.class);
    integerDivideBigIntegerType.put(double.class, BigDecimal.class);
    integerDivideBigIntegerType.put(BigInteger.class, BigInteger.class);
    integerDivideBigIntegerType.put(BigDecimal.class, BigDecimal.class);
  }
  
  Map bigIntegerType = new HashMap();
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
  
  Map bigDecimalType = new HashMap();
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

  Map typeConverter = new HashMap();
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

  Map integerDivideTypeConverter = new HashMap();
  {
    integerDivideTypeConverter.put(byte.class, integralType);
    integerDivideTypeConverter.put(char.class, integralType);
    integerDivideTypeConverter.put(short.class, integralType);
    integerDivideTypeConverter.put(int.class, integralType);
    integerDivideTypeConverter.put(long.class, longType);
    integerDivideTypeConverter.put(float.class, integerDivideFloatType);
    integerDivideTypeConverter.put(double.class, integerDivideDoubleType);
    integerDivideTypeConverter.put(BigInteger.class, integerDivideBigIntegerType);
    integerDivideTypeConverter.put(BigDecimal.class, bigDecimalType);
  }
  
  public void testComplement() {
  Object o;
    
    o = registry.getRuntimeMetaClass(byte.class).complement((byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, complementOneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).complement((char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, complementOneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).complement((short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, complementOneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).complement((int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, complementOneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).complement((long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, complementOneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
     o = registry.getRuntimeMetaClass(BigInteger.class).complement(((BigInteger)oneBigInt));   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, complementOneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    
    o = registry.getRuntimeMetaClass(byte.class).complement(oneByte);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, complementOneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).complement(oneChar);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, complementOneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).complement(oneShort);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, complementOneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).complement(oneInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, complementOneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).complement(oneLong);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, complementOneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).complement(oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, complementOneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    
    try {
      registry.getRuntimeMetaClass(Object.class).complement((byte)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).complement((char)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).complement((short)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).complement((int)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).complement((long)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).complement(((BigInteger)oneBigInt));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).complement(((BigDecimal)oneBigDecimal));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).complement(oneByte);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).complement(oneChar);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).complement(oneShort);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).complement(oneInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).complement(oneLong);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).complement(oneFloat);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).complement(oneDouble);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).complement(oneBigInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).complement(oneBigDecimal);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testUnaryPlus() {
  Object o;
    
    o = registry.getRuntimeMetaClass(byte.class).unaryPlus((byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).unaryPlus((char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).unaryPlus((short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).unaryPlus((int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).unaryPlus((long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).unaryPlus((float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).unaryPlus((double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).unaryPlus((BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).unaryPlus((BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    
    o = registry.getRuntimeMetaClass(byte.class).unaryPlus(oneByte);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).unaryPlus(oneChar);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).unaryPlus(oneShort);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).unaryPlus(oneInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).unaryPlus(oneLong);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).unaryPlus(oneFloat);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).unaryPlus(oneDouble);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).unaryPlus(oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).unaryPlus(oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
        
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus((byte)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus((char)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus((short)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus((int)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus((long)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus((float)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus((double)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus(((BigInteger)oneBigInt));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus(((BigDecimal)oneBigDecimal));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus(oneByte);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus(oneChar);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus(oneShort);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus(oneInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus(oneLong);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus(oneFloat);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus(oneDouble);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus(oneBigInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryPlus(oneBigDecimal);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testUnaryMinus() {
  Object o;
    
    o = registry.getRuntimeMetaClass(byte.class).unaryMinus((byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).unaryMinus((char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).unaryMinus((short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).unaryMinus((int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).unaryMinus((long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).unaryMinus((float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).unaryMinus((double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).unaryMinus((BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).unaryMinus((BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    
    o = registry.getRuntimeMetaClass(byte.class).unaryMinus(oneByte);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).unaryMinus(oneChar);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).unaryMinus(oneShort);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).unaryMinus(oneInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).unaryMinus(oneLong);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).unaryMinus(oneFloat);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).unaryMinus(oneDouble);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).unaryMinus(oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).unaryMinus(oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, minusOneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus((byte)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus((char)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus((short)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus((int)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus((long)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus((float)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus((double)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus(((BigInteger)oneBigInt));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus(((BigDecimal)oneBigDecimal));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus(oneByte);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus(oneChar);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus(oneShort);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus(oneInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus(oneLong);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus(oneFloat);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus(oneDouble);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus(oneBigInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).unaryMinus(oneBigDecimal);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testPostfixIncrement() {
  Object o;
    
    o = registry.getRuntimeMetaClass(byte.class).postfixIncrement((byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).postfixIncrement((char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).postfixIncrement((short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).postfixIncrement((int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).postfixIncrement((long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).postfixIncrement((float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).postfixIncrement((double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).postfixIncrement((BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).postfixIncrement((BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    
    o = registry.getRuntimeMetaClass(byte.class).postfixIncrement(oneByte);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).postfixIncrement(oneChar);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).postfixIncrement(oneShort);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).postfixIncrement(oneInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).postfixIncrement(oneLong);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).postfixIncrement(oneFloat);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).postfixIncrement(oneDouble);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).postfixIncrement(oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).postfixIncrement(oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));   
    
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement((byte)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement((char)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement((short)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement((int)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement((long)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement((float)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement((double)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement(((BigInteger)oneBigInt));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement(((BigDecimal)oneBigDecimal));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement(oneByte);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement(oneChar);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement(oneShort);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement(oneInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement(oneLong);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement(oneFloat);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement(oneDouble);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement(oneBigInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixIncrement(oneBigDecimal);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testPostfixDecrement() {
  Object o;
    
    o = registry.getRuntimeMetaClass(byte.class).postfixDecrement((byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).postfixDecrement((char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).postfixDecrement((short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).postfixDecrement((int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).postfixDecrement((long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).postfixDecrement((float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).postfixDecrement((double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).postfixDecrement((BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).postfixDecrement((BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    
    o = registry.getRuntimeMetaClass(byte.class).postfixDecrement(oneByte);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).postfixDecrement(oneChar);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).postfixDecrement(oneShort);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).postfixDecrement(oneInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).postfixDecrement(oneLong);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).postfixDecrement(oneFloat);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).postfixDecrement(oneDouble);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).postfixDecrement(oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).postfixDecrement(oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));   
       
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement((byte)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement((char)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement((short)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement((int)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement((long)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement((float)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement((double)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement(((BigInteger)oneBigInt));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement(((BigDecimal)oneBigDecimal));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement(oneByte);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement(oneChar);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement(oneShort);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement(oneInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement(oneLong);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement(oneFloat);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement(oneDouble);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement(oneBigInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).postfixDecrement(oneBigDecimal);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testPrefixIncrement() {
  Object o;
    
    o = registry.getRuntimeMetaClass(byte.class).prefixIncrement((byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).prefixIncrement((char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).prefixIncrement((short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).prefixIncrement((int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).prefixIncrement((long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).prefixIncrement((float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).prefixIncrement((double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).prefixIncrement((BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).prefixIncrement((BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    
    o = registry.getRuntimeMetaClass(byte.class).prefixIncrement(oneByte);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).prefixIncrement(oneChar);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).prefixIncrement(oneShort);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).prefixIncrement(oneInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).prefixIncrement(oneLong);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).prefixIncrement(oneFloat);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).prefixIncrement(oneDouble);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).prefixIncrement(oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).prefixIncrement(oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));   
    
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement((byte)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement((char)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement((short)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement((int)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement((long)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement((float)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement((double)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement(((BigInteger)oneBigInt));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement(((BigDecimal)oneBigDecimal));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement(oneByte);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement(oneChar);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement(oneShort);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement(oneInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement(oneLong);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement(oneFloat);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement(oneDouble);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement(oneBigInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixIncrement(oneBigDecimal);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testPrefixDecrement() {
  Object o;
    
    o = registry.getRuntimeMetaClass(byte.class).prefixDecrement((byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).prefixDecrement((char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).prefixDecrement((short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).prefixDecrement((int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).prefixDecrement((long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).prefixDecrement((float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).prefixDecrement((double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).prefixDecrement((BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).prefixDecrement((BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    
    o = registry.getRuntimeMetaClass(byte.class).prefixDecrement(oneByte);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).prefixDecrement(oneChar);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).prefixDecrement(oneShort);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).prefixDecrement(oneInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).prefixDecrement(oneLong);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).prefixDecrement(oneFloat);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).prefixDecrement(oneDouble);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).prefixDecrement(oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).prefixDecrement(oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));   
    
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement((byte)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement((char)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement((short)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement((int)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement((long)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement((float)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement((double)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement(((BigInteger)oneBigInt));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement(((BigDecimal)oneBigDecimal));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement(oneByte);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement(oneChar);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement(oneShort);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement(oneInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement(oneLong);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement(oneFloat);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement(oneDouble);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement(oneBigInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).prefixDecrement(oneBigDecimal);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testAdd() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).add((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).add((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).add((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).add((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).add((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).add((float)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).add((double)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).add((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).add((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).add((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).add((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).add((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).add((float)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).add((double)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).add((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).add((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).add((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).add((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).add((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).add((float)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).add((double)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).add((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).add((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).add((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).add((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).add((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).add((float)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).add((double)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).add((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).add((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).add((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).add((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).add((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).add((float)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).add((double)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).add((byte)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).add((char)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).add((short)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).add((int)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).add((long)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).add((float)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).add((double)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).add((byte)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).add((char)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).add((short)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).add((int)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).add((long)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).add((float)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).add((double)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).add((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).add((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).add((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).add((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).add((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).add((float)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).add((double)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).add((byte)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).add((char)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).add((short)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).add((int)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).add((long)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).add((float)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).add((double)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)oneBigInt, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)oneBigInt, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)oneBigInt, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)oneBigDecimal, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)oneBigDecimal, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)oneBigDecimal, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).add((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).add((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).add((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).add((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigInteger)oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigDecimal)oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigInteger)oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigDecimal)oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((float) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((double) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((byte) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((char) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((short) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((int) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((long) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((float) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add((double) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).add((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != ones.length; i++) {
      
      o = registry.getRuntimeMetaClass(ones[i]).add(ones[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
                    registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).add(ones[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).add(ones[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).add(ones[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).add(ones[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).add(ones[i], (float)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).add(ones[i], (double)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).add(ones[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).add(ones[i], (BigDecimal)oneBigDecimal);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(ones[i]).reverseAdd((byte)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseAdd((char)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseAdd((short)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseAdd((int)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseAdd((long)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseAdd((float)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseAdd((double)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseAdd((BigInteger)oneBigInt, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseAdd((BigDecimal)oneBigDecimal, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != twos.length; j++) {
        o = registry.getRuntimeMetaClass(ones[i]).add(ones[i], ones[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
        assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(ones[j]).getTheClass(o)),
            registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).add(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).add(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAdd((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAdd((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAdd((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAdd((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAdd((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAdd((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAdd((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAdd((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAdd((BigDecimal)oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testAddEquals() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).addEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).addEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).addEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).addEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).addEquals((float)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).addEquals((double)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).addEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).addEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).addEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).addEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).addEquals((float)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).addEquals((double)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).addEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).addEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).addEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).addEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).addEquals((float)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).addEquals((double)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).addEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).addEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).addEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).addEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).addEquals((float)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).addEquals((double)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).addEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).addEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).addEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).addEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).addEquals((float)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).addEquals((double)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).addEquals((char)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).addEquals((short)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).addEquals((int)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).addEquals((long)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).addEquals((float)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).addEquals((double)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).addEquals((char)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).addEquals((short)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).addEquals((int)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).addEquals((long)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).addEquals((float)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).addEquals((double)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).addEquals((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).addEquals((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).addEquals((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).addEquals((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).addEquals((float)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).addEquals((double)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).addEquals((char)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).addEquals((short)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).addEquals((int)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).addEquals((long)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).addEquals((float)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).addEquals((double)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)oneBigInt, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)oneBigInt, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)oneBigInt, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)oneBigDecimal, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)oneBigDecimal, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)oneBigDecimal, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger)oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal)oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger)oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal)oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((int) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != ones.length; i++) {
      
      o = registry.getRuntimeMetaClass(ones[i]).addEquals(ones[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
                    registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).addEquals(ones[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).addEquals(ones[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).addEquals(ones[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).addEquals(ones[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).addEquals(ones[i], (float)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).addEquals(ones[i], (double)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).addEquals(ones[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).addEquals(ones[i], (BigDecimal)oneBigDecimal);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(ones[i]).reverseAddEquals((byte)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseAddEquals((char)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseAddEquals((short)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseAddEquals((int)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseAddEquals((long)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseAddEquals((float)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseAddEquals((double)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseAddEquals((BigInteger)oneBigInt, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseAddEquals((BigDecimal)oneBigDecimal, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != twos.length; j++) {
        o = registry.getRuntimeMetaClass(ones[i]).addEquals(ones[i], ones[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, twoInt)).getBooleanValue());
        assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(ones[j]).getTheClass(o)),
            registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAddEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAddEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAddEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAddEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAddEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAddEquals((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAddEquals((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAddEquals((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseAddEquals((BigDecimal)oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
 }
  
  public void testSubtract() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtract((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtract((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtract((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtract((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtract((float)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtract((double)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtract((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtract((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtract((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtract((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtract((float)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtract((double)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtract((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtract((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtract((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtract((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtract((float)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtract((double)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtract((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtract((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtract((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtract((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtract((float)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtract((double)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtract((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtract((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtract((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtract((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtract((float)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtract((double)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtract((char)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtract((short)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtract((int)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtract((long)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtract((float)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtract((double)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtract((char)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtract((short)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtract((int)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtract((long)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtract((float)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtract((double)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtract((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtract((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtract((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtract((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtract((float)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtract((double)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtract((char)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtract((short)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtract((int)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtract((long)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtract((float)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtract((double)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)oneBigInt, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)oneBigInt, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)oneBigInt, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)oneBigDecimal, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)oneBigDecimal, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)oneBigDecimal, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigInteger)oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal)oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigInteger)oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal)oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((int) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != ones.length; i++) {
      
      o = registry.getRuntimeMetaClass(ones[i]).subtract(ones[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
                    registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).subtract(ones[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).subtract(ones[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).subtract(ones[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).subtract(ones[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).subtract(ones[i], (float)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).subtract(ones[i], (double)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).subtract(ones[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).subtract(ones[i], (BigDecimal)oneBigDecimal);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtract((byte)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtract((char)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtract((short)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtract((int)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtract((long)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtract((float)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtract((double)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtract((BigInteger)oneBigInt, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtract((BigDecimal)oneBigDecimal, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != twos.length; j++) {
        o = registry.getRuntimeMetaClass(ones[i]).subtract(ones[i], ones[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
        assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(ones[j]).getTheClass(o)),
            registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).subtract(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtract((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtract((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtract((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtract((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtract((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtract((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtract((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtract((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtract((BigDecimal)oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testSubtractEquals() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtractEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtractEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtractEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtractEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtractEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtractEquals((int)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtractEquals((int)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtractEquals((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).subtractEquals((int)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)oneBigInt, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)oneBigInt, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)oneBigInt, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)oneBigDecimal, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)oneBigDecimal, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)oneBigDecimal, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger)oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal)oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger)oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal)oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((int) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != ones.length; i++) {
      
      o = registry.getRuntimeMetaClass(ones[i]).subtractEquals(ones[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
                    registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).subtractEquals(ones[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).subtractEquals(ones[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).subtractEquals(ones[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).subtractEquals(ones[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).subtractEquals(ones[i], (float)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).subtractEquals(ones[i], (double)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).subtractEquals(ones[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).subtractEquals(ones[i], (BigDecimal)oneBigDecimal);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtractEquals((byte)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtractEquals((char)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtractEquals((short)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtractEquals((int)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtractEquals((long)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtractEquals((float)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtractEquals((double)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtractEquals((BigInteger)oneBigInt, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseSubtractEquals((BigDecimal)oneBigDecimal, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != twos.length; j++) {
        o = registry.getRuntimeMetaClass(ones[i]).subtractEquals(ones[i], ones[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
        assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(ones[j]).getTheClass(o)),
            registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((BigDecimal)oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testMultiply() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiply((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiply((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiply((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiply((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiply((float)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiply((double)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiply((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiply((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiply((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiply((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiply((float)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiply((double)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiply((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiply((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiply((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiply((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiply((float)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiply((double)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiply((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiply((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiply((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiply((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiply((float)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiply((double)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiply((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiply((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiply((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiply((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiply((float)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiply((double)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiply((char)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiply((short)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiply((int)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiply((long)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiply((float)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiply((double)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiply((char)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiply((short)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiply((int)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiply((long)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiply((float)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiply((double)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiply((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiply((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiply((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiply((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiply((float)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiply((double)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiply((char)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiply((short)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiply((int)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiply((long)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiply((float)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiply((double)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)oneBigInt, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)oneBigInt, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)oneBigInt, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)oneBigDecimal, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)oneBigDecimal, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)oneBigDecimal, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigInteger)oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal)oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigInteger)oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal)oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((int) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != ones.length; i++) {
      
      o = registry.getRuntimeMetaClass(ones[i]).multiply(ones[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
                    registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).multiply(ones[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).multiply(ones[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).multiply(ones[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).multiply(ones[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).multiply(ones[i], (float)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).multiply(ones[i], (double)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).multiply(ones[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).multiply(ones[i], (BigDecimal)oneBigDecimal);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiply((byte)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiply((char)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiply((short)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiply((int)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiply((long)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiply((float)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiply((double)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiply((BigInteger)oneBigInt, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiply((BigDecimal)oneBigDecimal, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != twos.length; j++) {
        o = registry.getRuntimeMetaClass(ones[i]).multiply(ones[i], ones[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
        assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(ones[j]).getTheClass(o)),
            registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).multiply(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiply((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiply((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiply((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiply((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiply((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiply((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiply((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiply((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiply((BigDecimal)oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testMultiplyEquals() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)oneBigInt, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)oneBigInt, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)oneBigInt, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)oneBigDecimal, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)oneBigDecimal, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)oneBigDecimal, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger)oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal)oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger)oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal)oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != ones.length; i++) {
      
      o = registry.getRuntimeMetaClass(ones[i]).multiplyEquals(ones[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
                    registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).multiplyEquals(ones[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).multiplyEquals(ones[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).multiplyEquals(ones[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).multiplyEquals(ones[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).multiplyEquals(ones[i], (float)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).multiplyEquals(ones[i], (double)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).multiplyEquals(ones[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).multiplyEquals(ones[i], (BigDecimal)oneBigDecimal);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiplyEquals((byte)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiplyEquals((char)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiplyEquals((short)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiplyEquals((int)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiplyEquals((long)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiplyEquals((float)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiplyEquals((double)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiplyEquals((BigInteger)oneBigInt, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseMultiplyEquals((BigDecimal)oneBigDecimal, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != twos.length; j++) {
        o = registry.getRuntimeMetaClass(ones[i]).multiplyEquals(ones[i], ones[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
        assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(ones[j]).getTheClass(o)),
            registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((BigDecimal)oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testDivide() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).divide((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divide((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divide((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divide((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divide((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divide((float)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divide((double)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).divide((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divide((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divide((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divide((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divide((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divide((float)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divide((double)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).divide((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divide((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divide((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divide((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divide((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divide((float)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divide((double)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).divide((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divide((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divide((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divide((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divide((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divide((float)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divide((double)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).divide((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divide((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divide((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divide((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divide((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divide((float)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divide((double)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).divide((byte)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divide((char)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divide((short)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divide((int)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divide((long)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divide((float)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divide((double)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).divide((byte)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divide((char)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divide((short)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divide((int)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divide((long)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divide((float)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divide((double)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divide((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).divide((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divide((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divide((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divide((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divide((float)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divide((double)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divide((char)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).divide((byte)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divide((short)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divide((int)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divide((long)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divide((float)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divide((double)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)oneBigInt, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)oneBigInt, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)oneBigInt, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)oneBigDecimal, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)oneBigDecimal, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)oneBigDecimal, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).divide((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).divide((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).divide((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigInteger)oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigDecimal)oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigInteger)oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigDecimal)oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((float) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((double) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((char) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((short) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((int) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((long) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((float) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide((double) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).divide((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != ones.length; i++) {
      
      o = registry.getRuntimeMetaClass(ones[i]).divide(ones[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
                    registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).divide(ones[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).divide(ones[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).divide(ones[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).divide(ones[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).divide(ones[i], (float)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).divide(ones[i], (double)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).divide(ones[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).divide(ones[i], (BigDecimal)oneBigDecimal);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivide((byte)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivide((char)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivide((short)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivide((int)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivide((long)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivide((float)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivide((double)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivide((BigInteger)oneBigInt, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivide((BigDecimal)oneBigDecimal, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != twos.length; j++) {
        o = registry.getRuntimeMetaClass(ones[i]).divide(ones[i], ones[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
        assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(ones[j]).getTheClass(o)),
            registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).divide(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divide(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivide((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivide((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivide((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivide((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivide((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivide((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivide((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivide((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivide((BigDecimal)oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testDivideEquals() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)oneBigInt, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)oneBigInt, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)oneBigInt, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)oneBigDecimal, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)oneBigDecimal, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)oneBigDecimal, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger)oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal)oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger)oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal)oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != ones.length; i++) {
      
      o = registry.getRuntimeMetaClass(ones[i]).divideEquals(ones[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
                    registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).divideEquals(ones[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).divideEquals(ones[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).divideEquals(ones[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).divideEquals(ones[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).divideEquals(ones[i], (float)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).divideEquals(ones[i], (double)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).divideEquals(ones[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).divideEquals(ones[i], (BigDecimal)oneBigDecimal);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivideEquals((byte)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivideEquals((char)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivideEquals((short)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivideEquals((int)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivideEquals((long)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivideEquals((float)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivideEquals((double)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivideEquals((BigInteger)oneBigInt, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseDivideEquals((BigDecimal)oneBigDecimal, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != twos.length; j++) {
        o = registry.getRuntimeMetaClass(ones[i]).divideEquals(ones[i], ones[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
        assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(ones[j]).getTheClass(o)),
            registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((BigDecimal)oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testIntegerDivide() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)oneBigInt, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)oneBigInt, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)oneBigInt, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)oneBigDecimal, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)oneBigDecimal, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)oneBigDecimal, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger)oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal)oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger)oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal)oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != ones.length; i++) {
      
      o = registry.getRuntimeMetaClass(ones[i]).integerDivide(ones[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
                    registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).integerDivide(ones[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).integerDivide(ones[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).integerDivide(ones[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).integerDivide(ones[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).integerDivide(ones[i], (float)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).integerDivide(ones[i], (double)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).integerDivide(ones[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).integerDivide(ones[i], (BigDecimal)oneBigDecimal);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivide((byte)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivide((char)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivide((short)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivide((int)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivide((long)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivide((float)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivide((double)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivide((BigInteger)oneBigInt, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivide((BigDecimal)oneBigDecimal, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != twos.length; j++) {
        o = registry.getRuntimeMetaClass(ones[i]).integerDivide(ones[i], ones[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
        assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(ones[j]).getTheClass(o)),
            registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((BigDecimal)oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testIntegerDivideEquals() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(float.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(double.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)oneBigInt, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)oneBigInt, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)oneBigInt, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)oneBigDecimal, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)oneBigDecimal, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)oneBigDecimal, (BigDecimal)oneBigDecimal);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger)oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal)oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger)oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal)oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal) oneBigDecimal, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != ones.length; i++) {
      
      o = registry.getRuntimeMetaClass(ones[i]).integerDivideEquals(ones[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
                    registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).integerDivideEquals(ones[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).integerDivideEquals(ones[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).integerDivideEquals(ones[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).integerDivideEquals(ones[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).integerDivideEquals(ones[i], (float)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).integerDivideEquals(ones[i], (double)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).integerDivideEquals(ones[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).integerDivideEquals(ones[i], (BigDecimal)oneBigDecimal);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivideEquals((byte)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(byte.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivideEquals((char)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(char.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivideEquals((short)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(short.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivideEquals((int)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(int.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivideEquals((long)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(long.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivideEquals((float)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(float.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivideEquals((double)1, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(double.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivideEquals((BigInteger)oneBigInt, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigInteger.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(ones[i]).reverseIntegerDivideEquals((BigDecimal)oneBigDecimal, ones[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
      assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(BigDecimal.class),
          registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != twos.length; j++) {
        o = registry.getRuntimeMetaClass(ones[i]).integerDivideEquals(ones[i], ones[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, oneInt)).getBooleanValue());
        assertEquals(((Map)integerDivideTypeConverter.get(registry.getRuntimeMetaClass(ones[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(ones[j]).getTheClass(o)),
            registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (BigDecimal)oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((BigDecimal)oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }

  public void testRemainder() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).remainder((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).remainder((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).remainder((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).remainder((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).remainder((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).remainder((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).remainder((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).remainder((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).remainder((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).remainder((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).remainder((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).remainder((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).remainder((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).remainder((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).remainder((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).remainder((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).remainder((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).remainder((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).remainder((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).remainder((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).remainder((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).remainder((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).remainder((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).remainder((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).remainder((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).remainder((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).remainder((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).remainder((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).remainder((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).remainder((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).remainder((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).remainder((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).remainder((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).remainder((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).remainder((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).remainder((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).remainder((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).remainder((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != integralOnes.length; i++) {
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).remainder(integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).remainder(integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).remainder(integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class),  registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).remainder(integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).remainder(integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).remainder(integralOnes[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseRemainder((byte)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseRemainder((char)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseRemainder((short)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseRemainder((int)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseRemainder((long)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseRemainder((BigInteger)oneBigInt, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != integralTwos.length; j++) {
        o = registry.getRuntimeMetaClass(integralOnes[i]).remainder(integralOnes[i], integralOnes[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
        assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(integralOnes[j]).getTheClass(o)),  registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).remainder(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainder(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseRemainder((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseRemainder((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseRemainder((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseRemainder((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseRemainder((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseRemainder((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testRemainderEquals() {
  Object o;
  
    o = registry.getRuntimeMetaClass(byte.class).remainderEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).remainderEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).remainderEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).remainderEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).remainderEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).remainderEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).remainderEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).remainderEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).remainderEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).remainderEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).remainderEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).remainderEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).remainderEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).remainderEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).remainderEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).remainderEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).remainderEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).remainderEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).remainderEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(int.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).remainderEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).remainderEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).remainderEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).remainderEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).remainderEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).remainderEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(long.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(byte.class).remainderEquals((byte)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(char.class).remainderEquals((char)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(short.class).remainderEquals((short)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(int.class).remainderEquals((int)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(long.class).remainderEquals((long)1, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    o = registry.getRuntimeMetaClass(BigInteger.class).remainderEquals((BigInteger)oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).remainderEquals((BigInteger)oneBigInt, (char)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).remainderEquals((BigInteger)oneBigInt, (short)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).remainderEquals((BigInteger)oneBigInt, (int)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).remainderEquals((BigInteger)oneBigInt, (long)1);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));
    o = registry.getRuntimeMetaClass(BigInteger.class).remainderEquals((BigInteger)oneBigInt, (BigInteger)oneBigInt);   
    assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((BigInteger)oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((BigDecimal)oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((BigInteger)oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((BigDecimal)oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((BigInteger)oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((BigDecimal)oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((BigInteger)oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((BigDecimal)oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((BigInteger)oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((BigDecimal)oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((byte) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((char) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((short) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((int) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((long) 1, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((BigInteger) oneBigInt, (BigInteger) oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((BigInteger) oneBigInt, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals((BigDecimal) oneBigDecimal, (BigDecimal) oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != integralOnes.length; i++) {
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).remainderEquals(integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).remainderEquals(integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).remainderEquals(integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class),  registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).remainderEquals(integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).remainderEquals(integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).remainderEquals(integralOnes[i], (BigInteger)oneBigInt);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseRemainderEquals((byte)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(byte.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseRemainderEquals((char)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(char.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseRemainderEquals((short)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(short.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseRemainderEquals((int)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(int.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseRemainderEquals((long)1, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(long.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      o = registry.getRuntimeMetaClass(integralOnes[i]).reverseRemainderEquals((BigInteger)oneBigInt, integralOnes[i]);   
      assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
      assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(BigInteger.class), registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != integralTwos.length; j++) {
        o = registry.getRuntimeMetaClass(integralOnes[i]).remainderEquals(integralOnes[i], integralOnes[j]);   
        assertTrue(((NgBoolean)registry.getRuntimeMetaClass(o).equals(o, zeroInt)).getBooleanValue());
        assertEquals(((Map)typeConverter.get(registry.getRuntimeMetaClass(integralOnes[i]).getTheClass(o))).get(registry.getRuntimeMetaClass(integralOnes[j]).getTheClass(o)),  registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).remainderEquals(new Object(), (BigInteger)oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      registry.getRuntimeMetaClass(Object.class).reverseRemainderEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseRemainderEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseRemainderEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseRemainderEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseRemainderEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      registry.getRuntimeMetaClass(Object.class).reverseRemainderEquals((BigInteger)oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testPower() {
    // TODO: Implement
  }
  
  public void testReversePower() {
    // TODO: Implement
  }
}
