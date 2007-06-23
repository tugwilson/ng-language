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

public class ArithmeticTest extends TestCase {
  MetaClassRegistry registry = NgSystem.metaClassRegistry;
  
  Object minusOneByte = NgByte.valueOf((byte) -1);
  Object zeroByte = NgByte.valueOf((byte) 0);
  Object oneByte = NgByte.valueOf((byte) 1);
  Object twoByte = NgByte.valueOf((byte) 2);
  
  Object zeroChar = NgChar.valueOf((char) 0);
  Object oneChar = NgChar.valueOf((char) 1);
  Object twoChar = NgChar.valueOf((char) 2);
  
  Object minusOneShort = NgShort.valueOf((byte) -1);
  Object zeroShort = NgShort.valueOf((byte) 0);
  Object oneShort = NgShort.valueOf((byte) 1);
  Object twoShort = NgShort.valueOf((byte) 2);
  
  Object minusOneInt = NgInt.valueOf(-1);
  Object zeroInt = NgInt.valueOf(0);
  Object oneInt = NgInt.valueOf(1);
  Object twoInt = NgInt.valueOf(2);
  Object complementOneInt = NgInt.valueOf(~1);
  
  Object minusOneLong = NgLong.valueOf(-1);
  Object zeroLong = NgLong.valueOf(0);
  Object oneLong = NgLong.valueOf(1);
  Object twoLong = NgLong.valueOf(2);
  
  Object minusOneFloat = NgFloat.valueOf(-1);
  Object zeroFloat = NgFloat.valueOf(0);
  Object oneFloat = NgFloat.valueOf(1);
  Object twoFloat = NgFloat.valueOf(2);
  
  Object minusOneDouble = NgDouble.valueOf(-1);
  Object zeroDouble = NgDouble.valueOf(0);
  Object oneDouble = NgDouble.valueOf(1);
  Object twoDouble = NgDouble.valueOf(2);
  
  Object minusOneBigInt = BigInteger.valueOf(-1);
  Object zeroBigInt = BigInteger.ZERO;
  Object oneBigInt = BigInteger.ONE;
  Object twoBigInt = BigInteger.valueOf(2);
  
  Object minusOneBigDecimal = BigDecimal.valueOf(-1);
  Object zeroBigDecimal = BigDecimal.valueOf(0);
  Object oneBigDecimal = BigDecimal.valueOf(1);
  Object twoBigDecimal = BigDecimal.valueOf(2);
  
  Object[] ones = new Object[] {this.oneByte, this.oneChar, this.oneShort, this.oneInt, this.oneLong, this.oneFloat, this.oneDouble, this.oneBigInt, this.oneBigDecimal};
  Object[] twos = new Object[] {this.twoByte, this.twoChar, this.twoShort, this.twoInt, this.twoLong, this.twoFloat, this.twoDouble, this.twoBigInt, this.twoBigDecimal};
  
  Object[] integralOnes = new Object[] {this.oneByte, this.oneChar, this.oneShort, this.oneInt, this.oneLong, this.oneBigInt};
  Object[] integralTwos = new Object[] {this.twoByte, this.twoChar, this.twoShort, this.twoInt, this.twoLong, this.twoBigInt};
   
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
  
  Map<Class, Class> integerDivideFloatType = new HashMap<Class, Class>();
  {
    this.integerDivideFloatType.put(byte.class, float.class);
    this.integerDivideFloatType.put(char.class, float.class);
    this.integerDivideFloatType.put(short.class, float.class);
    this.integerDivideFloatType.put(int.class, float.class);
    this.integerDivideFloatType.put(long.class, float.class);
    this.integerDivideFloatType.put(float.class, float.class);
    this.integerDivideFloatType.put(double.class, double.class);
    this.integerDivideFloatType.put(BigInteger.class, BigDecimal.class);
    this.integerDivideFloatType.put(BigDecimal.class, BigDecimal.class);
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
  
  Map<Class, Class> integerDivideDoubleType = new HashMap<Class, Class>();
  {
    this.integerDivideDoubleType.put(byte.class, double.class);
    this.integerDivideDoubleType.put(char.class, double.class);
    this.integerDivideDoubleType.put(short.class, double.class);
    this.integerDivideDoubleType.put(int.class, double.class);
    this.integerDivideDoubleType.put(long.class, double.class);
    this.integerDivideDoubleType.put(float.class, double.class);
    this.integerDivideDoubleType.put(double.class, double.class);
    this.integerDivideDoubleType.put(BigInteger.class, BigDecimal.class);
    this.integerDivideDoubleType.put(BigDecimal.class, BigDecimal.class);
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
  
  Map<Class, Class> integerDivideBigIntegerType = new HashMap<Class, Class>();
  {
    this.integerDivideBigIntegerType.put(byte.class, BigInteger.class);
    this.integerDivideBigIntegerType.put(char.class, BigInteger.class);
    this.integerDivideBigIntegerType.put(short.class, BigInteger.class);
    this.integerDivideBigIntegerType.put(int.class, BigInteger.class);
    this.integerDivideBigIntegerType.put(long.class, BigInteger.class);
    this.integerDivideBigIntegerType.put(float.class, BigDecimal.class);
    this.integerDivideBigIntegerType.put(double.class, BigDecimal.class);
    this.integerDivideBigIntegerType.put(BigInteger.class, BigInteger.class);
    this.integerDivideBigIntegerType.put(BigDecimal.class, BigDecimal.class);
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

  Map<Class, Map<Class, Class>> integerDivideTypeConverter = new HashMap<Class, Map<Class, Class>>();
  {
    this.integerDivideTypeConverter.put(byte.class, this.integralType);
    this.integerDivideTypeConverter.put(char.class, this.integralType);
    this.integerDivideTypeConverter.put(short.class, this.integralType);
    this.integerDivideTypeConverter.put(int.class, this.integralType);
    this.integerDivideTypeConverter.put(long.class, this.longType);
    this.integerDivideTypeConverter.put(float.class, this.integerDivideFloatType);
    this.integerDivideTypeConverter.put(double.class, this.integerDivideDoubleType);
    this.integerDivideTypeConverter.put(BigInteger.class, this.integerDivideBigIntegerType);
    this.integerDivideTypeConverter.put(BigDecimal.class, this.bigDecimalType);
  }
  
  public void testComplement() throws Throwable {
  Object o;
    
    o = this.registry.getRuntimeMetaClass(byte.class).complement((byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.complementOneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).complement((char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.complementOneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).complement((short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.complementOneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).complement(1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.complementOneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).complement((long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.complementOneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
     o = this.registry.getRuntimeMetaClass(BigInteger.class).complement(((BigInteger)this.oneBigInt));   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.complementOneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    
    o = this.registry.getRuntimeMetaClass(byte.class).complement(this.oneByte);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.complementOneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).complement(this.oneChar);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.complementOneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).complement(this.oneShort);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.complementOneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).complement(this.oneInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.complementOneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).complement(this.oneLong);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.complementOneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).complement(this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.complementOneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).complement((byte)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).complement((char)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).complement((short)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).complement(1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).complement((long)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).complement(((BigInteger)this.oneBigInt));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).complement((this.oneBigDecimal));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).complement(this.oneByte);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).complement(this.oneChar);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).complement(this.oneShort);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).complement(this.oneInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).complement(this.oneLong);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).complement(this.oneFloat);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).complement(this.oneDouble);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).complement(this.oneBigInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).complement(this.oneBigDecimal);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testUnaryPlus() throws Throwable {
  Object o;
    
    o = this.registry.getRuntimeMetaClass(byte.class).unaryPlus((byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).unaryPlus((char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).unaryPlus((short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).unaryPlus(1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).unaryPlus((long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).unaryPlus((float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).unaryPlus((double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).unaryPlus((BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).unaryPlus((BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    
    o = this.registry.getRuntimeMetaClass(byte.class).unaryPlus(this.oneByte);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).unaryPlus(this.oneChar);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).unaryPlus(this.oneShort);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).unaryPlus(this.oneInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).unaryPlus(this.oneLong);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).unaryPlus(this.oneFloat);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).unaryPlus(this.oneDouble);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).unaryPlus(this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).unaryPlus(this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
        
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus((byte)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus((char)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus((short)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus(1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus((long)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus((float)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus((double)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus(((BigInteger)this.oneBigInt));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus(((BigDecimal)this.oneBigDecimal));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus(this.oneByte);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus(this.oneChar);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus(this.oneShort);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus(this.oneInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus(this.oneLong);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus(this.oneFloat);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus(this.oneDouble);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus(this.oneBigInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryPlus(this.oneBigDecimal);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testUnaryMinus() throws Throwable {
  Object o;
    
    o = this.registry.getRuntimeMetaClass(byte.class).unaryMinus((byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).unaryMinus((char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).unaryMinus((short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).unaryMinus(1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).unaryMinus((long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).unaryMinus((float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).unaryMinus((double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).unaryMinus((BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).unaryMinus((BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    
    o = this.registry.getRuntimeMetaClass(byte.class).unaryMinus(this.oneByte);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).unaryMinus(this.oneChar);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).unaryMinus(this.oneShort);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).unaryMinus(this.oneInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).unaryMinus(this.oneLong);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).unaryMinus(this.oneFloat);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).unaryMinus(this.oneDouble);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).unaryMinus(this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).unaryMinus(this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.minusOneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus((byte)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus((char)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus((short)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus(1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus((long)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus((float)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus((double)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus(((BigInteger)this.oneBigInt));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus(((BigDecimal)this.oneBigDecimal));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus(this.oneByte);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus(this.oneChar);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus(this.oneShort);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus(this.oneInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus(this.oneLong);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus(this.oneFloat);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus(this.oneDouble);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus(this.oneBigInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).unaryMinus(this.oneBigDecimal);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testPostfixIncrement() throws Throwable {
  Object o;
    
    o = this.registry.getRuntimeMetaClass(byte.class).postfixIncrement((byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).postfixIncrement((char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).postfixIncrement((short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).postfixIncrement(1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).postfixIncrement((long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).postfixIncrement((float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).postfixIncrement((double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).postfixIncrement((BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).postfixIncrement((BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    
    o = this.registry.getRuntimeMetaClass(byte.class).postfixIncrement(this.oneByte);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).postfixIncrement(this.oneChar);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).postfixIncrement(this.oneShort);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).postfixIncrement(this.oneInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).postfixIncrement(this.oneLong);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).postfixIncrement(this.oneFloat);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).postfixIncrement(this.oneDouble);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).postfixIncrement(this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).postfixIncrement(this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));   
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement((byte)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement((char)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement((short)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement(1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement((long)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement((float)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement((double)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement(((BigInteger)this.oneBigInt));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement(((BigDecimal)this.oneBigDecimal));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement(this.oneByte);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement(this.oneChar);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement(this.oneShort);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement(this.oneInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement(this.oneLong);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement(this.oneFloat);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement(this.oneDouble);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement(this.oneBigInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixIncrement(this.oneBigDecimal);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testPostfixDecrement() throws Throwable {
  Object o;
    
    o = this.registry.getRuntimeMetaClass(byte.class).postfixDecrement((byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).postfixDecrement((char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).postfixDecrement((short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).postfixDecrement(1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).postfixDecrement((long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).postfixDecrement((float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).postfixDecrement((double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).postfixDecrement((BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).postfixDecrement((BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    
    o = this.registry.getRuntimeMetaClass(byte.class).postfixDecrement(this.oneByte);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).postfixDecrement(this.oneChar);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).postfixDecrement(this.oneShort);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).postfixDecrement(this.oneInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).postfixDecrement(this.oneLong);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).postfixDecrement(this.oneFloat);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).postfixDecrement(this.oneDouble);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).postfixDecrement(this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).postfixDecrement(this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));   
       
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement((byte)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement((char)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement((short)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement(1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement((long)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement((float)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement((double)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement(((BigInteger)this.oneBigInt));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement(((BigDecimal)this.oneBigDecimal));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement(this.oneByte);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement(this.oneChar);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement(this.oneShort);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement(this.oneInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement(this.oneLong);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement(this.oneFloat);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement(this.oneDouble);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement(this.oneBigInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).postfixDecrement(this.oneBigDecimal);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testPrefixIncrement() throws Throwable {
  Object o;
    
    o = this.registry.getRuntimeMetaClass(byte.class).prefixIncrement((byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).prefixIncrement((char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).prefixIncrement((short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).prefixIncrement(1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).prefixIncrement((long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).prefixIncrement((float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).prefixIncrement((double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).prefixIncrement((BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).prefixIncrement((BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    
    o = this.registry.getRuntimeMetaClass(byte.class).prefixIncrement(this.oneByte);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).prefixIncrement(this.oneChar);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).prefixIncrement(this.oneShort);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).prefixIncrement(this.oneInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).prefixIncrement(this.oneLong);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).prefixIncrement(this.oneFloat);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).prefixIncrement(this.oneDouble);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).prefixIncrement(this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).prefixIncrement(this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));   
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement((byte)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement((char)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement((short)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement(1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement((long)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement((float)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement((double)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement(((BigInteger)this.oneBigInt));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement(((BigDecimal)this.oneBigDecimal));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement(this.oneByte);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement(this.oneChar);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement(this.oneShort);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement(this.oneInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement(this.oneLong);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement(this.oneFloat);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement(this.oneDouble);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement(this.oneBigInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixIncrement(this.oneBigDecimal);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testPrefixDecrement() throws Throwable {
  Object o;
    
    o = this.registry.getRuntimeMetaClass(byte.class).prefixDecrement((byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).prefixDecrement((char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).prefixDecrement((short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).prefixDecrement(1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).prefixDecrement((long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).prefixDecrement((float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).prefixDecrement((double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).prefixDecrement((BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).prefixDecrement((BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    
    o = this.registry.getRuntimeMetaClass(byte.class).prefixDecrement(this.oneByte);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).prefixDecrement(this.oneChar);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).prefixDecrement(this.oneShort);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).prefixDecrement(this.oneInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).prefixDecrement(this.oneLong);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).prefixDecrement(this.oneFloat);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).prefixDecrement(this.oneDouble);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).prefixDecrement(this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).prefixDecrement(this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));   
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement((byte)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement((char)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement((short)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement(1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement((long)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement((float)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement((double)1);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement(((BigInteger)this.oneBigInt));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement(((BigDecimal)this.oneBigDecimal));   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement(this.oneByte);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement(this.oneChar);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement(this.oneShort);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement(this.oneInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement(this.oneLong);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement(this.oneFloat);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement(this.oneDouble);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement(this.oneBigInt);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).prefixDecrement(this.oneBigDecimal);   
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testAdd() throws Throwable {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).add((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).add((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).add((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).add(1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).add((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).add((float)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).add((double)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).add((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).add((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).add((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).add(1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).add((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).add((float)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).add((double)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).add((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).add((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).add((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).add(1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).add((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).add((float)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).add((double)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).add((byte)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).add((char)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).add((short)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).add(1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).add((long)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).add((float)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).add((double)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).add((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).add((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).add((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).add(1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).add((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).add((float)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).add((double)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).add((byte)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).add((char)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).add((short)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).add(1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).add((long)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).add((float)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).add((double)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).add((byte)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).add((char)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).add((short)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).add(1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).add((long)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).add((float)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).add((double)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).add((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).add((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).add((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).add(1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).add((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).add((float)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).add((double)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).add((byte)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).add((char)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).add((short)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).add(1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).add((long)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).add((float)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).add((double)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)this.oneBigInt, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)this.oneBigInt, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)this.oneBigInt, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).add((BigInteger)this.oneBigInt, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)this.oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)this.oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)this.oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)this.oneBigDecimal, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)this.oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)this.oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)this.oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)this.oneBigDecimal, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).add((BigDecimal)this.oneBigDecimal, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).add((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((byte) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((char) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((short) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((long) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((float) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((double) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigInteger)this.oneBigInt, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigDecimal)this.oneBigDecimal, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigInteger)this.oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigDecimal)this.oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigInteger)this.oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigDecimal)this.oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((float) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((double) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((byte) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((char) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((short) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((long) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((float) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((double) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).add((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != this.ones.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).add(this.ones[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
                    this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).add(this.ones[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).add(this.ones[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).add(this.ones[i], 1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).add(this.ones[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).add(this.ones[i], (float)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).add(this.ones[i], (double)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).add(this.ones[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).add(this.ones[i], (BigDecimal)this.oneBigDecimal);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAdd((byte)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAdd((char)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAdd((short)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAdd(1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAdd((long)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAdd((float)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAdd((double)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAdd((BigInteger)this.oneBigInt, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAdd((BigDecimal)this.oneBigDecimal, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.twos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.ones[i]).add(this.ones[i], this.ones[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
        assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.ones[j]).getTheClass(o)),
            this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(new Object(), 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).add(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAdd((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAdd((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAdd((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAdd(1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAdd((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAdd((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAdd((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAdd((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAdd((BigDecimal)this.oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testAddEquals() throws Throwable {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).addEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).addEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).addEquals(1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).addEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).addEquals((float)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).addEquals((double)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).addEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).addEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).addEquals(1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).addEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).addEquals((float)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).addEquals((double)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).addEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).addEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).addEquals(1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).addEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).addEquals((float)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).addEquals((double)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).addEquals((char)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).addEquals((short)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).addEquals(1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).addEquals((long)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).addEquals((float)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).addEquals((double)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).addEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).addEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).addEquals(1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).addEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).addEquals((float)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).addEquals((double)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).addEquals((char)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).addEquals((short)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).addEquals(1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).addEquals((long)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).addEquals((float)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).addEquals((double)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).addEquals((char)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).addEquals((short)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).addEquals(1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).addEquals((long)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).addEquals((float)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).addEquals((double)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).addEquals((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).addEquals((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).addEquals(1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).addEquals((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).addEquals((float)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).addEquals((double)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).addEquals((byte)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).addEquals((char)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).addEquals((short)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).addEquals(1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).addEquals((long)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).addEquals((float)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).addEquals((double)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)this.oneBigInt, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)this.oneBigInt, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)this.oneBigInt, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).addEquals((BigInteger)this.oneBigInt, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)this.oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)this.oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)this.oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)this.oneBigDecimal, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)this.oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)this.oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)this.oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)this.oneBigDecimal, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).addEquals((BigDecimal)this.oneBigDecimal, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger)this.oneBigInt, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal)this.oneBigDecimal, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger)this.oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal)this.oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger)this.oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal)this.oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((byte) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((char) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((short) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((long) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((float) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((double) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != this.ones.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).addEquals(this.ones[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
                    this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).addEquals(this.ones[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).addEquals(this.ones[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).addEquals(this.ones[i], 1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).addEquals(this.ones[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).addEquals(this.ones[i], (float)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).addEquals(this.ones[i], (double)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).addEquals(this.ones[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).addEquals(this.ones[i], (BigDecimal)this.oneBigDecimal);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAddEquals((byte)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAddEquals((char)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAddEquals((short)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAddEquals(1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAddEquals((long)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAddEquals((float)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAddEquals((double)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAddEquals((BigInteger)this.oneBigInt, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseAddEquals((BigDecimal)this.oneBigDecimal, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.twos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.ones[i]).addEquals(this.ones[i], this.ones[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.twoInt)).getBooleanValue());
        assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.ones[j]).getTheClass(o)),
            this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).addEquals(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAddEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAddEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAddEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAddEquals(1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAddEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAddEquals((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAddEquals((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAddEquals((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseAddEquals((BigDecimal)this.oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
 }
  
  public void testSubtract() throws Throwable {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtract((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtract((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtract(1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtract((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtract((float)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtract((double)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtract((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtract((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtract(1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtract((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtract((float)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtract((double)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtract((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtract((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtract(1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtract((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtract((float)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtract((double)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).subtract((byte)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtract((char)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtract((short)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtract(1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtract((long)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtract((float)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtract((double)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtract((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtract((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtract(1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtract((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtract((float)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtract((double)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtract((char)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtract((short)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtract(1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtract((long)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtract((float)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtract((double)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtract((char)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtract((short)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtract(1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtract((long)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtract((float)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtract((double)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtract((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtract((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtract(1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtract((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtract((float)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtract((double)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).subtract((byte)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtract((char)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtract((short)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtract(1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtract((long)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtract((float)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtract((double)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)this.oneBigInt, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)this.oneBigInt, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)this.oneBigInt, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtract((BigInteger)this.oneBigInt, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)this.oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)this.oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)this.oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)this.oneBigDecimal, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)this.oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)this.oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)this.oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)this.oneBigDecimal, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtract((BigDecimal)this.oneBigDecimal, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((char) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((short) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((long) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((float) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((double) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigInteger)this.oneBigInt, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal)this.oneBigDecimal, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigInteger)this.oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal)this.oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigInteger)this.oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal)this.oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((byte) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((char) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((short) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((long) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((float) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((double) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != this.ones.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtract(this.ones[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
                    this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtract(this.ones[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtract(this.ones[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtract(this.ones[i], 1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtract(this.ones[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtract(this.ones[i], (float)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtract(this.ones[i], (double)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtract(this.ones[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtract(this.ones[i], (BigDecimal)this.oneBigDecimal);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtract((byte)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtract((char)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtract((short)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtract(1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtract((long)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtract((float)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtract((double)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtract((BigInteger)this.oneBigInt, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtract((BigDecimal)this.oneBigDecimal, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.twos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.ones[i]).subtract(this.ones[i], this.ones[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
        assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.ones[j]).getTheClass(o)),
            this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(new Object(), 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtract(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtract((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtract((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtract((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtract(1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtract((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtract((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtract((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtract((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtract((BigDecimal)this.oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testSubtractEquals() throws Throwable {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtractEquals(1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtractEquals(1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtractEquals(1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtractEquals(1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtractEquals(1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtractEquals(1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtractEquals(1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtractEquals(1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).subtractEquals((byte)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).subtractEquals((char)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).subtractEquals((short)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).subtractEquals(1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).subtractEquals((long)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).subtractEquals((float)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).subtractEquals((double)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)this.oneBigInt, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)this.oneBigInt, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)this.oneBigInt, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).subtractEquals((BigInteger)this.oneBigInt, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)this.oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)this.oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)this.oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)this.oneBigDecimal, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)this.oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)this.oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)this.oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)this.oneBigDecimal, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).subtractEquals((BigDecimal)this.oneBigDecimal, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger)this.oneBigInt, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal)this.oneBigDecimal, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger)this.oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal)this.oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger)this.oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal)this.oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((byte) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((char) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((short) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((long) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((float) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((double) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != this.ones.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtractEquals(this.ones[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
                    this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtractEquals(this.ones[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtractEquals(this.ones[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtractEquals(this.ones[i], 1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtractEquals(this.ones[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtractEquals(this.ones[i], (float)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtractEquals(this.ones[i], (double)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtractEquals(this.ones[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).subtractEquals(this.ones[i], (BigDecimal)this.oneBigDecimal);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtractEquals((byte)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtractEquals((char)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtractEquals((short)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtractEquals(1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtractEquals((long)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtractEquals((float)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtractEquals((double)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtractEquals((BigInteger)this.oneBigInt, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseSubtractEquals((BigDecimal)this.oneBigDecimal, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.twos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.ones[i]).subtractEquals(this.ones[i], this.ones[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
        assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.ones[j]).getTheClass(o)),
            this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).subtractEquals(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals(1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseSubtractEquals((BigDecimal)this.oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testMultiply() throws Throwable {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiply((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiply((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiply(1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiply((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiply((float)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiply((double)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiply((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiply((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiply(1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiply((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiply((float)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiply((double)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiply((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiply((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiply(1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiply((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiply((float)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiply((double)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).multiply((byte)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiply((char)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiply((short)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiply(1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiply((long)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiply((float)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiply((double)1, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiply((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiply((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiply(1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiply((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiply((float)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiply((double)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiply((char)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiply((short)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiply(1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiply((long)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiply((float)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiply((double)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiply((char)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiply((short)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiply(1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiply((long)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiply((float)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiply((double)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiply((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiply((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiply(1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiply((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiply((float)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiply((double)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).multiply((byte)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiply((char)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiply((short)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiply(1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiply((long)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiply((float)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiply((double)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)this.oneBigInt, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)this.oneBigInt, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)this.oneBigInt, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiply((BigInteger)this.oneBigInt, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)this.oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)this.oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)this.oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)this.oneBigDecimal, 1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)this.oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)this.oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)this.oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)this.oneBigDecimal, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiply((BigDecimal)this.oneBigDecimal, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply(1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply(1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply(1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((char) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((short) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((int) 1, 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigInteger)this.oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal)this.oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigInteger)this.oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal)this.oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((byte) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((char) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((short) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((int) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((long) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((float) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((double) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != this.ones.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiply(this.ones[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
                    this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiply(this.ones[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiply(this.ones[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiply(this.ones[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiply(this.ones[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiply(this.ones[i], (float)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiply(this.ones[i], (double)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiply(this.ones[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiply(this.ones[i], (BigDecimal)this.oneBigDecimal);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiply((byte)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiply((char)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiply((short)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiply((int)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiply((long)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiply((float)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiply((double)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiply((BigInteger)this.oneBigInt, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiply((BigDecimal)this.oneBigDecimal, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.twos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.ones[i]).multiply(this.ones[i], this.ones[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
        assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.ones[j]).getTheClass(o)),
            this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiply(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiply((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiply((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiply((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiply((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiply((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiply((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiply((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiply((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiply((BigDecimal)this.oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testMultiplyEquals() throws Throwable {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).multiplyEquals((char)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).multiplyEquals((byte)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).multiplyEquals((short)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).multiplyEquals((int)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).multiplyEquals((long)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).multiplyEquals((float)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).multiplyEquals((double)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)this.oneBigInt, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)this.oneBigInt, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)this.oneBigInt, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).multiplyEquals((BigInteger)this.oneBigInt, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)this.oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)this.oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)this.oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)this.oneBigDecimal, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)this.oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)this.oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)this.oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)this.oneBigDecimal, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).multiplyEquals((BigDecimal)this.oneBigDecimal, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger)this.oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal)this.oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger)this.oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal)this.oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((byte) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((char) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((short) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((int) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((long) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((float) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((double) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != this.ones.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiplyEquals(this.ones[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
                    this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiplyEquals(this.ones[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiplyEquals(this.ones[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiplyEquals(this.ones[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiplyEquals(this.ones[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiplyEquals(this.ones[i], (float)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiplyEquals(this.ones[i], (double)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiplyEquals(this.ones[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).multiplyEquals(this.ones[i], (BigDecimal)this.oneBigDecimal);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiplyEquals((byte)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiplyEquals((char)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiplyEquals((short)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiplyEquals((int)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiplyEquals((long)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiplyEquals((float)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiplyEquals((double)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiplyEquals((BigInteger)this.oneBigInt, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseMultiplyEquals((BigDecimal)this.oneBigDecimal, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.twos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.ones[i]).multiplyEquals(this.ones[i], this.ones[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
        assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.ones[j]).getTheClass(o)),
            this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).multiplyEquals(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseMultiplyEquals((BigDecimal)this.oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testDivide() throws Throwable {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).divide((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divide((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divide((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divide((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divide((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divide((float)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divide((double)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).divide((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divide((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divide((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divide((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divide((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divide((float)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divide((double)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).divide((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divide((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divide((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divide((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divide((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divide((float)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divide((double)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).divide((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divide((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divide((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divide((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divide((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divide((float)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divide((double)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).divide((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divide((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divide((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divide((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divide((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divide((float)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divide((double)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).divide((byte)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divide((char)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divide((short)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divide((int)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divide((long)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divide((float)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divide((double)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).divide((byte)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divide((char)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divide((short)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divide((int)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divide((long)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divide((float)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divide((double)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divide((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).divide((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divide((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divide((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divide((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divide((float)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divide((double)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divide((char)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).divide((byte)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divide((short)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divide((int)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divide((long)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divide((float)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divide((double)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)this.oneBigInt, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)this.oneBigInt, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)this.oneBigInt, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).divide((BigInteger)this.oneBigInt, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)this.oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)this.oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)this.oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)this.oneBigDecimal, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)this.oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)this.oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)this.oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)this.oneBigDecimal, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divide((BigDecimal)this.oneBigDecimal, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigInteger)this.oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigDecimal)this.oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigInteger)this.oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigDecimal)this.oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((float) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((double) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((byte) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((char) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((short) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((int) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((long) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((float) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((double) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != this.ones.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divide(this.ones[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
                    this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divide(this.ones[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divide(this.ones[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divide(this.ones[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divide(this.ones[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divide(this.ones[i], (float)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divide(this.ones[i], (double)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divide(this.ones[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divide(this.ones[i], (BigDecimal)this.oneBigDecimal);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivide((byte)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivide((char)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivide((short)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivide((int)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivide((long)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivide((float)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivide((double)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivide((BigInteger)this.oneBigInt, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivide((BigDecimal)this.oneBigDecimal, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.twos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.ones[i]).divide(this.ones[i], this.ones[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
        assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.ones[j]).getTheClass(o)),
            this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divide(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivide((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivide((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivide((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivide((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivide((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivide((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivide((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivide((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivide((BigDecimal)this.oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testDivideEquals() throws Throwable {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).divideEquals((byte)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).divideEquals((char)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).divideEquals((short)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).divideEquals((int)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).divideEquals((long)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).divideEquals((float)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).divideEquals((double)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)this.oneBigInt, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)this.oneBigInt, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)this.oneBigInt, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).divideEquals((BigInteger)this.oneBigInt, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)this.oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)this.oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)this.oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)this.oneBigDecimal, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)this.oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)this.oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)this.oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)this.oneBigDecimal, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).divideEquals((BigDecimal)this.oneBigDecimal, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger)this.oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal)this.oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger)this.oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal)this.oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((byte) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((char) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((short) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((int) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((long) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((float) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((double) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != this.ones.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divideEquals(this.ones[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
                    this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divideEquals(this.ones[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divideEquals(this.ones[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divideEquals(this.ones[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divideEquals(this.ones[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divideEquals(this.ones[i], (float)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divideEquals(this.ones[i], (double)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divideEquals(this.ones[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).divideEquals(this.ones[i], (BigDecimal)this.oneBigDecimal);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivideEquals((byte)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivideEquals((char)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivideEquals((short)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivideEquals((int)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivideEquals((long)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivideEquals((float)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivideEquals((double)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivideEquals((BigInteger)this.oneBigInt, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseDivideEquals((BigDecimal)this.oneBigDecimal, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.twos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.ones[i]).divideEquals(this.ones[i], this.ones[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
        assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.ones[j]).getTheClass(o)),
            this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).divideEquals(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseDivideEquals((BigDecimal)this.oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testIntegerDivide() throws Throwable {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivide((char)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivide((byte)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivide((short)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivide((int)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivide((long)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivide((float)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivide((double)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)this.oneBigInt, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)this.oneBigInt, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)this.oneBigInt, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivide((BigInteger)this.oneBigInt, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)this.oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)this.oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)this.oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)this.oneBigDecimal, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)this.oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)this.oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)this.oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)this.oneBigDecimal, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivide((BigDecimal)this.oneBigDecimal, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger)this.oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal)this.oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger)this.oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal)this.oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((byte) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((char) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((short) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((int) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((long) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((float) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((double) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != this.ones.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivide(this.ones[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
                    this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivide(this.ones[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivide(this.ones[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivide(this.ones[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivide(this.ones[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivide(this.ones[i], (float)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivide(this.ones[i], (double)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivide(this.ones[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivide(this.ones[i], (BigDecimal)this.oneBigDecimal);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivide((byte)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivide((char)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivide((short)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivide((int)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivide((long)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivide((float)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivide((double)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivide((BigInteger)this.oneBigInt, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivide((BigDecimal)this.oneBigDecimal, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.twos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivide(this.ones[i], this.ones[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
        assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.ones[j]).getTheClass(o)),
            this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivide(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivide((BigDecimal)this.oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testIntegerDivideEquals() throws Throwable {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(float.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(double.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).integerDivideEquals((byte)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).integerDivideEquals((char)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).integerDivideEquals((short)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).integerDivideEquals((int)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).integerDivideEquals((long)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(float.class).integerDivideEquals((float)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(double.class).integerDivideEquals((double)1, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)this.oneBigInt, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)this.oneBigInt, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)this.oneBigInt, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).integerDivideEquals((BigInteger)this.oneBigInt, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)this.oneBigDecimal, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)this.oneBigDecimal, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)this.oneBigDecimal, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)this.oneBigDecimal, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)this.oneBigDecimal, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)this.oneBigDecimal, (float)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)this.oneBigDecimal, (double)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)this.oneBigDecimal, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigDecimal.class).integerDivideEquals((BigDecimal)this.oneBigDecimal, (BigDecimal)this.oneBigDecimal);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
    assertEquals(BigDecimal.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger)this.oneBigInt, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal)this.oneBigDecimal, (float) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger)this.oneBigInt, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal)this.oneBigDecimal, (double) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((byte) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((char) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((short) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((int) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((long) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((float) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((double) 1, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    
    for (int i = 0; i != this.ones.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivideEquals(this.ones[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
                    this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivideEquals(this.ones[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivideEquals(this.ones[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivideEquals(this.ones[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivideEquals(this.ones[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivideEquals(this.ones[i], (float)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivideEquals(this.ones[i], (double)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivideEquals(this.ones[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivideEquals(this.ones[i], (BigDecimal)this.oneBigDecimal);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivideEquals((byte)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(byte.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivideEquals((char)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(char.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivideEquals((short)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(short.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivideEquals((int)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(int.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivideEquals((long)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(long.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivideEquals((float)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(float.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivideEquals((double)1, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(double.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivideEquals((BigInteger)this.oneBigInt, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigInteger.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.ones[i]).reverseIntegerDivideEquals((BigDecimal)this.oneBigDecimal, this.ones[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
      assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(BigDecimal.class),
          this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.twos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.ones[i]).integerDivideEquals(this.ones[i], this.ones[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.oneInt)).getBooleanValue());
        assertEquals(((Map)this.integerDivideTypeConverter.get(this.registry.getRuntimeMetaClass(this.ones[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.ones[j]).getTheClass(o)),
            this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (float)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (double)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).integerDivideEquals(new Object(), (BigDecimal)this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((float)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((double)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseIntegerDivideEquals((BigDecimal)this.oneBigDecimal, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }

  public void testRemainder() throws Throwable {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).remainder((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).remainder((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).remainder((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).remainder((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).remainder((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).remainder((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).remainder((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).remainder((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).remainder((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).remainder((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).remainder((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).remainder((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).remainder((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).remainder((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).remainder((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).remainder((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).remainder((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).remainder((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).remainder((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).remainder((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).remainder((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).remainder((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).remainder((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).remainder((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).remainder((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).remainder((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).remainder((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).remainder((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).remainder((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).remainder((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).remainder((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).remainder((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).remainder((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).remainder((BigInteger)this.oneBigInt, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).remainder((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).remainder((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != this.integralOnes.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).remainder(this.integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).remainder(this.integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).remainder(this.integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).remainder(this.integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).remainder(this.integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).remainder(this.integralOnes[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseRemainder((byte)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseRemainder((char)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseRemainder((short)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseRemainder((int)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseRemainder((long)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseRemainder((BigInteger)this.oneBigInt, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.integralTwos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).remainder(this.integralOnes[i], this.integralOnes[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
        assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.integralOnes[j]).getTheClass(o)),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainder(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseRemainder((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseRemainder((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseRemainder((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseRemainder((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseRemainder((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseRemainder((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testRemainderEquals() throws Throwable {
  Object o;
  
    o = this.registry.getRuntimeMetaClass(byte.class).remainderEquals((byte)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).remainderEquals((char)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).remainderEquals((short)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).remainderEquals((int)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).remainderEquals((long)1, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).remainderEquals((byte)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).remainderEquals((char)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).remainderEquals((short)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).remainderEquals((int)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).remainderEquals((long)1, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).remainderEquals((byte)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).remainderEquals((char)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).remainderEquals((short)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).remainderEquals((int)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).remainderEquals((long)1, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).remainderEquals((byte)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).remainderEquals((char)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).remainderEquals((short)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).remainderEquals((int)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(int.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).remainderEquals((long)1, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).remainderEquals((byte)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).remainderEquals((char)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).remainderEquals((short)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).remainderEquals((int)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).remainderEquals((long)1, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(long.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(byte.class).remainderEquals((byte)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(char.class).remainderEquals((char)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(short.class).remainderEquals((short)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(int.class).remainderEquals((int)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(long.class).remainderEquals((long)1, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    o = this.registry.getRuntimeMetaClass(BigInteger.class).remainderEquals((BigInteger)this.oneBigInt, (byte)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).remainderEquals((BigInteger)this.oneBigInt, (char)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).remainderEquals((BigInteger)this.oneBigInt, (short)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).remainderEquals((BigInteger)this.oneBigInt, (int)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).remainderEquals((BigInteger)this.oneBigInt, (long)1);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));
    o = this.registry.getRuntimeMetaClass(BigInteger.class).remainderEquals((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);   
    assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
    assertEquals(BigInteger.class, this.registry.getRuntimeMetaClass(o).getTheClass(o));

    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((byte) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((char) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((short) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((int) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((long) 1, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((BigInteger)this.oneBigInt, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((BigDecimal)this.oneBigDecimal, (byte) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((byte) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((char) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((short) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((int) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((long) 1, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((BigInteger)this.oneBigInt, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((BigDecimal)this.oneBigDecimal, (char) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((byte) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((char) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((short) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((int) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((long) 1, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((BigInteger)this.oneBigInt, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((BigDecimal)this.oneBigDecimal, (short) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((byte) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((char) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((short) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((int) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {
    }
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((long) 1, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((BigInteger)this.oneBigInt, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((BigDecimal)this.oneBigDecimal, (int) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((byte) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((char) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((short) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((int) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((long) 1, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((BigInteger)this.oneBigInt, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((BigDecimal)this.oneBigDecimal, (long) 1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((byte) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((char) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((short) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((int) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((long) 1, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
      assertTrue(false);
    } catch (final NgRuntimeException e) {} 

    for (int i = 0; i != this.integralOnes.length; i++) {
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).remainderEquals(this.integralOnes[i], (byte)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).remainderEquals(this.integralOnes[i], (char)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).remainderEquals(this.integralOnes[i], (short)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).remainderEquals(this.integralOnes[i], (int)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).remainderEquals(this.integralOnes[i], (long)1);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).remainderEquals(this.integralOnes[i], (BigInteger)this.oneBigInt);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseRemainderEquals((byte)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(byte.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseRemainderEquals((char)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(char.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseRemainderEquals((short)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(short.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseRemainderEquals((int)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(int.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseRemainderEquals((long)1, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(long.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).reverseRemainderEquals((BigInteger)this.oneBigInt, this.integralOnes[i]);   
      assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
      assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(BigInteger.class), this.registry.getRuntimeMetaClass(o).getTheClass(o));
      
      for (int j = 0; j != this.integralTwos.length; j++) {
        o = this.registry.getRuntimeMetaClass(this.integralOnes[i]).remainderEquals(this.integralOnes[i], this.integralOnes[j]);   
        assertTrue(((NgBoolean)this.registry.getRuntimeMetaClass(o).equals(o, this.zeroInt)).getBooleanValue());
        assertEquals(((Map)this.typeConverter.get(this.registry.getRuntimeMetaClass(this.integralOnes[i]).getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.integralOnes[j]).getTheClass(o)),  this.registry.getRuntimeMetaClass(o).getTheClass(o));
      }      
    }
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals(new Object(), new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals(new Object(), (byte)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals(new Object(), (char)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals(new Object(), (short)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals(new Object(), (int)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals(new Object(), (long)1);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).remainderEquals(new Object(), (BigInteger)this.oneBigInt);
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseRemainderEquals((byte)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseRemainderEquals((char)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseRemainderEquals((short)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseRemainderEquals((int)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseRemainderEquals((long)1, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
    try {
      this.registry.getRuntimeMetaClass(Object.class).reverseRemainderEquals((BigInteger)this.oneBigInt, new Object());
      assertTrue(false);
    } catch (final NgRuntimeException e) {}
  }
  
  public void testPower() throws Throwable {
    // TODO: Implement
  }
  
  public void testReversePower() throws Throwable {
    // TODO: Implement
  }
}
