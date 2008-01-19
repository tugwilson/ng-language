package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public class ArithmeticTest extends TestCase {

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

  Map<Class<?>, Class<?>> integralType = new HashMap<Class<?>, Class<?>>();
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

  Map<Class<?>, Class<?>> longType = new HashMap<Class<?>, Class<?>>();
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

  Map<Class<?>, Class<?>> integerDivideFloatType = new HashMap<Class<?>, Class<?>>();
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

  Map<Class<?>, Class<?>> floatType = new HashMap<Class<?>, Class<?>>();
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

  Map<Class<?>, Class<?>> integerDivideDoubleType = new HashMap<Class<?>, Class<?>>();
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

  Map<Class<?>, Class<?>> doubleType = new HashMap<Class<?>, Class<?>>();
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

  Map<Class<?>, Class<?>> integerDivideBigIntegerType = new HashMap<Class<?>, Class<?>>();
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

  Map<Class<?>, Class<?>> bigIntegerType = new HashMap<Class<?>, Class<?>>();
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

  Map<Class<?>, Class<?>> bigDecimalType = new HashMap<Class<?>, Class<?>>();
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

  Map<Class<?>, Map<Class<?>, Class<?>>> typeConverter = new HashMap<Class<?>, Map<Class<?>, Class<?>>>();
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

  Map<Class<?>, Map<Class<?>, Class<?>>> integerDivideTypeConverter = new HashMap<Class<?>, Map<Class<?>, Class<?>>>();
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
  
  private static void doNormalTest(final ThreadContext tc, BinaryArithmeticOperation op, int result) throws NotPerformed {
    assertTrue(op.intApply((byte)6, (byte)2) == result);    
    assertTrue(op.intApply((char)6, (byte)2) == result);    
    assertTrue(op.intApply((short)6, (byte)2) == result);    
    assertTrue(op.intApply((int)6, (byte)2) == result);    
    assertTrue(op.longApply((long)6, (byte)2) == result);    
    assertTrue(op.floatApply((float)6, (byte)2) == result);    
    assertTrue(op.doubleApply((double)6, (byte)2) == result);    
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(6), (byte)2).longValue() == result);    
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(6), (byte)2).doubleValue() == result);
    
    assertTrue(tc.unwrapToInt(op.apply((byte)6, (byte)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply((char)6, (byte)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply((short)6, (byte)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply((int)6, (byte)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply((long)6, (byte)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((float)6, (byte)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((double)6, (byte)2)) == result);    
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), (byte)2)).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), (byte)2)).doubleValue() == result);
    
    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)6), (byte)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)6), (byte)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)6), (byte)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf((int)6), (byte)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf((long)6), (byte)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)6), (byte)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)6), (byte)2)) == result); 
    
    assertTrue(tc.unwrapToInt(op.apply((Object)NgByte.valueOf((byte)6), (byte)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply((Object)NgChar.valueOf((char)6), (byte)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply((Object)NgShort.valueOf((short)6), (byte)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply((Object)NgInt.valueOf((int)6), (byte)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply((Object)NgLong.valueOf((long)6), (byte)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgFloat.valueOf((float)6), (byte)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgDouble.valueOf((double)6), (byte)2)) == result); 
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(6), (byte)2)).longValue() == result);    
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(6), (byte)2)).doubleValue() == result);
    
    assertTrue(tc.unwrapToInt(op.apply((byte)6, NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((char)6, NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((short)6, NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((int)6, NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply((long)6, NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((float)6, NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((double)6, NgByte.valueOf((byte)2))) == result);    
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), NgByte.valueOf((byte)2))).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), NgByte.valueOf((byte)2))).doubleValue() == result);
    
    assertTrue(tc.unwrapToInt(op.apply((byte)6, (Object)NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((char)6, (Object)NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((short)6, (Object)NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((int)6, (Object)NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply((long)6, (Object)NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((float)6, (Object)NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((double)6, (Object)NgByte.valueOf((byte)2))) == result);    
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), (Object)NgByte.valueOf((byte)2))).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), (Object)NgByte.valueOf((byte)2))).doubleValue() == result);
    
    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)6), NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)6), NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)6), NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf((int)6), NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf((long)6), NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)6), NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)6), NgByte.valueOf((byte)2))) == result); 
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), NgByte.valueOf((byte)2))).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), NgByte.valueOf((byte)2))).doubleValue() == result);
    
    assertTrue(tc.unwrapToInt(op.apply((Object)NgByte.valueOf((byte)6), (Object)NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((Object)NgChar.valueOf((char)6), (Object)NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((Object)NgShort.valueOf((short)6), (Object)NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((Object)NgInt.valueOf((int)6), (Object)NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply((Object)NgLong.valueOf((long)6), (Object)NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgFloat.valueOf((float)6), (Object)NgByte.valueOf((byte)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgDouble.valueOf((double)6), (Object)NgByte.valueOf((byte)2))) == result); 
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(6), (Object)NgByte.valueOf((byte)2))).longValue() == result);    
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(6), (Object)NgByte.valueOf((byte)2))).doubleValue() == result);
    
    assertTrue(op.intApply((byte)6, (char)2) == result);    
    assertTrue(op.intApply((char)6, (char)2) == result);    
    assertTrue(op.intApply((short)6, (char)2) == result);    
    assertTrue(op.intApply((int)6, (char)2) == result);    
    assertTrue(op.longApply((long)6, (char)2) == result);    
    assertTrue(op.floatApply((float)6, (char)2) == result);    
    assertTrue(op.doubleApply((double)6, (char)2) == result);    
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(6), (char)2).longValue() == result);    
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(6), (char)2).doubleValue() == result);
       
    assertTrue(tc.unwrapToInt(op.apply((byte)6, (char)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply((char)6, (char)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply((short)6, (char)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply((int)6, (char)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply((long)6, (char)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((float)6, (char)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((double)6, (char)2)) == result);    
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), (char)2)).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), (char)2)).doubleValue() == result);
    
    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)6), (char)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)6), (char)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)6), (char)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf((int)6), (char)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf((long)6), (char)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)6), (char)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)6), (char)2)) == result);    
    
    assertTrue(tc.unwrapToInt(op.apply((byte)6, NgChar.valueOf((char)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((char)6, NgChar.valueOf((char)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((short)6, NgChar.valueOf((char)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((int)6, NgChar.valueOf((char)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply((long)6, NgChar.valueOf((char)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((float)6, NgChar.valueOf((char)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((double)6, NgChar.valueOf((char)2))) == result);    
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), NgChar.valueOf((char)2))).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), NgChar.valueOf((char)2))).doubleValue() == result);
    
    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)6), NgChar.valueOf((char)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)6), NgChar.valueOf((char)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)6), NgChar.valueOf((char)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf((int)6), NgChar.valueOf((char)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf((long)6), NgChar.valueOf((char)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)6), NgChar.valueOf((char)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)6), NgChar.valueOf((char)2))) == result); 
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), NgChar.valueOf((char)2))).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), NgChar.valueOf((char)2))).doubleValue() == result);
    
    assertTrue(op.intApply((byte)6, (short)2) == result);    
    assertTrue(op.intApply((char)6, (short)2) == result);    
    assertTrue(op.intApply((short)6, (short)2) == result);    
    assertTrue(op.intApply((int)6, (short)2) == result);    
    assertTrue(op.longApply((long)6, (short)2) == result);    
    assertTrue(op.floatApply((float)6, (short)2) == result);    
    assertTrue(op.doubleApply((double)6, (short)2) == result);    
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(6), (short)2).longValue() == result);    
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(6), (short)2).doubleValue() == result);
    
    assertTrue(tc.unwrapToInt(op.apply((byte)6, (short)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply((char)6, (short)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply((short)6, (short)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply((int)6, (short)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply((long)6, (short)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((float)6, (short)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((double)6, (short)2)) == result);    
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), (short)2)).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), (short)2)).doubleValue() == result);
    
    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)6), (short)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)6), (short)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)6), (short)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf((int)6), (short)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf((long)6), (short)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)6), (short)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)6), (short)2)) == result);    
    
    assertTrue(tc.unwrapToInt(op.apply((byte)6, NgShort.valueOf((short)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((char)6, NgShort.valueOf((short)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((short)6, NgShort.valueOf((short)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((int)6, NgShort.valueOf((short)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply((long)6, NgShort.valueOf((short)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((float)6, NgShort.valueOf((short)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((double)6, NgShort.valueOf((short)2))) == result);    
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), NgShort.valueOf((short)2))).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), NgShort.valueOf((short)2))).doubleValue() == result);
    
    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)6), NgShort.valueOf((short)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)6), NgShort.valueOf((short)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)6), NgShort.valueOf((short)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf((int)6), NgShort.valueOf((short)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf((long)6), NgShort.valueOf((short)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)6), NgShort.valueOf((short)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)6), NgShort.valueOf((short)2))) == result); 
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), NgShort.valueOf((short)2))).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), NgShort.valueOf((short)2))).doubleValue() == result);
    
    assertTrue(op.intApply((byte)6, (int)2) == result);    
    assertTrue(op.intApply((char)6, (int)2) == result);    
    assertTrue(op.intApply((short)6, (int)2) == result);    
    assertTrue(op.intApply((int)6, (int)2) == result);    
    assertTrue(op.longApply((long)6, (int)2) == result);    
    assertTrue(op.floatApply((float)6, (int)2) == result);    
    assertTrue(op.doubleApply((double)6, (int)2) == result);    
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(6), (int)2).longValue() == result);    
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(6), (int)2).doubleValue() == result);
    
    assertTrue(tc.unwrapToInt(op.apply((byte)6, (int)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply((char)6, (int)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply((short)6, (int)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply((int)6, (int)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply((long)6, (int)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((float)6, (int)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((double)6, (int)2)) == result);    
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), (int)2)).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), (int)2)).doubleValue() == result);
    
    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)6), (int)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)6), (int)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)6), (int)2)) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf((int)6), (int)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf((long)6), (int)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)6), (int)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)6), (int)2)) == result);    
    
    assertTrue(tc.unwrapToInt(op.apply((byte)6, NgInt.valueOf((int)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((char)6, NgInt.valueOf((int)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((short)6, NgInt.valueOf((int)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply((int)6, NgInt.valueOf((int)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply((long)6, NgInt.valueOf((int)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((float)6, NgInt.valueOf((int)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((double)6, NgInt.valueOf((int)2))) == result);    
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), NgInt.valueOf((int)2))).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), NgInt.valueOf((int)2))).doubleValue() == result);
    
    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)6), NgInt.valueOf((int)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)6), NgInt.valueOf((int)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)6), NgInt.valueOf((int)2))) == result);    
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf((int)6), NgInt.valueOf((int)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf((long)6), NgInt.valueOf((int)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)6), NgInt.valueOf((int)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)6), NgInt.valueOf((int)2))) == result); 
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), NgInt.valueOf((int)2))).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), NgInt.valueOf((int)2))).doubleValue() == result);
    
    assertTrue(op.longApply((byte)6, (long)2) == result);    
    assertTrue(op.longApply((char)6, (long)2) == result);    
    assertTrue(op.longApply((short)6, (long)2) == result);    
    assertTrue(op.longApply((int)6, (long)2) == result);    
    assertTrue(op.longApply((long)6, (long)2) == result);    
    assertTrue(op.floatApply((float)6, (long)2) == result);    
    assertTrue(op.doubleApply((double)6, (long)2) == result);    
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(6), (long)2).longValue() == result);    
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(6), (long)2).doubleValue() == result);
    
    assertTrue(tc.unwrapToLong(op.apply((byte)6, (long)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply((char)6, (long)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply((short)6, (long)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply((int)6, (long)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply((long)6, (long)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((float)6, (long)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((double)6, (long)2)) == result);    
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), (long)2)).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), (long)2)).doubleValue() == result);
    
    assertTrue(tc.unwrapToLong(op.apply(NgByte.valueOf((byte)6), (long)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply(NgChar.valueOf((char)6), (long)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply(NgShort.valueOf((short)6), (long)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply(NgInt.valueOf((int)6), (long)2)) == result);    
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf((long)6), (long)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)6), (long)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)6), (long)2)) == result);    
    
    assertTrue(tc.unwrapToLong(op.apply((byte)6, NgLong.valueOf((long)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply((char)6, NgLong.valueOf((long)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply((short)6, NgLong.valueOf((long)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply((int)6, NgLong.valueOf((long)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply((long)6, NgLong.valueOf((long)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((float)6, NgLong.valueOf((long)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((double)6, NgLong.valueOf((long)2))) == result);    
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), NgLong.valueOf((long)2))).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), NgLong.valueOf((long)2))).doubleValue() == result);
    
    assertTrue(tc.unwrapToLong(op.apply(NgByte.valueOf((byte)6), NgLong.valueOf((long)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply(NgChar.valueOf((char)6), NgLong.valueOf((long)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply(NgShort.valueOf((short)6), NgLong.valueOf((long)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply(NgInt.valueOf((int)6), NgLong.valueOf((long)2))) == result);    
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf((long)6), NgLong.valueOf((long)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)6), NgLong.valueOf((long)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)6), NgLong.valueOf((long)2))) == result); 
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), NgLong.valueOf((long)2))).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), NgLong.valueOf((long)2))).doubleValue() == result);
    
    assertTrue(op.floatApply((byte)6, (float)2) == result);    
    assertTrue(op.floatApply((char)6, (float)2) == result);    
    assertTrue(op.floatApply((short)6, (float)2) == result);    
    assertTrue(op.floatApply((int)6, (float)2) == result);    
    assertTrue(op.floatApply((long)6, (float)2) == result);    
    assertTrue(op.floatApply((float)6, (float)2) == result);    
    assertTrue(op.doubleApply((double)6, (float)2) == result);    
    assertTrue(op.floatApply(BigInteger.valueOf(6), (float)2) == result);    
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(6), (float)2).doubleValue() == result);
    
    assertTrue(tc.unwrapToFloat(op.apply((byte)6, (float)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((char)6, (float)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((short)6, (float)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((int)6, (float)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((long)6, (float)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((float)6, (float)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((double)6, (float)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(BigInteger.valueOf(6), (float)2)) == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), (float)2)).doubleValue() == result);  
    
    assertTrue(tc.unwrapToFloat(op.apply(NgByte.valueOf((byte)6), (float)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgChar.valueOf((char)6), (float)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgShort.valueOf((short)6), (float)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgInt.valueOf((int)6), (float)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgLong.valueOf((long)6), (float)2)) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)6), (float)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)6), (float)2)) == result);    
    
    assertTrue(tc.unwrapToFloat(op.apply((byte)6, NgFloat.valueOf((float)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((char)6, NgFloat.valueOf((float)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((short)6, NgFloat.valueOf((float)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((int)6, NgFloat.valueOf((float)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((long)6, NgFloat.valueOf((float)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply((float)6, NgFloat.valueOf((float)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((double)6, NgFloat.valueOf((float)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(BigInteger.valueOf(6), NgFloat.valueOf((float)2))) == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), NgFloat.valueOf((float)2))).doubleValue() == result);  
    
    assertTrue(tc.unwrapToFloat(op.apply(NgByte.valueOf((byte)6), NgFloat.valueOf((float)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgChar.valueOf((char)6), NgFloat.valueOf((float)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgShort.valueOf((short)6), NgFloat.valueOf((float)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgInt.valueOf((int)6), NgFloat.valueOf((float)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgLong.valueOf((long)6), NgFloat.valueOf((float)2))) == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)6), NgFloat.valueOf((float)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)6), NgFloat.valueOf((float)2))) == result); 
    assertTrue(tc.unwrapToFloat(op.apply(BigInteger.valueOf(6), NgFloat.valueOf((float)2))) == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), NgFloat.valueOf((float)2))).doubleValue() == result);
    
    assertTrue(op.doubleApply((byte)6, (double)2) == result);    
    assertTrue(op.doubleApply((char)6, (double)2) == result);    
    assertTrue(op.doubleApply((short)6, (double)2) == result);    
    assertTrue(op.doubleApply((int)6, (double)2) == result);    
    assertTrue(op.doubleApply((long)6, (double)2) == result);    
    assertTrue(op.doubleApply((float)6, (double)2) == result);    
    assertTrue(op.doubleApply((double)6, (double)2) == result);    
    assertTrue(op.doubleApply(BigInteger.valueOf(6), (double)2) == result);    
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(6), (double)2).doubleValue() == result);
    
    assertTrue(tc.unwrapToDouble(op.apply((byte)6, (double)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((char)6, (double)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((short)6, (double)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((int)6, (double)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((long)6, (double)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((float)6, (double)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((double)6, (double)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(BigInteger.valueOf(6), (double)2)) == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), (double)2)).doubleValue() == result);
    
    assertTrue(tc.unwrapToDouble(op.apply(NgByte.valueOf((byte)6), (double)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgChar.valueOf((char)6), (double)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgShort.valueOf((short)6), (double)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgInt.valueOf((int)6), (double)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgLong.valueOf((long)6), (double)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgFloat.valueOf((float)6), (double)2)) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)6), (double)2)) == result);    
    
    assertTrue(tc.unwrapToDouble(op.apply((byte)6, NgDouble.valueOf((double)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((char)6, NgDouble.valueOf((double)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((short)6, NgDouble.valueOf((double)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((int)6, NgDouble.valueOf((double)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((long)6, NgDouble.valueOf((double)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((float)6, NgDouble.valueOf((double)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((double)6, NgDouble.valueOf((double)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(BigInteger.valueOf(6), NgDouble.valueOf((double)2))) == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), NgDouble.valueOf((double)2))).doubleValue() == result);
    
    assertTrue(tc.unwrapToDouble(op.apply(NgByte.valueOf((byte)6), NgDouble.valueOf((double)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgChar.valueOf((char)6), NgDouble.valueOf((double)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgShort.valueOf((short)6), NgDouble.valueOf((double)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgInt.valueOf((int)6), NgDouble.valueOf((double)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgLong.valueOf((long)6), NgDouble.valueOf((double)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgFloat.valueOf((float)6), NgDouble.valueOf((double)2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)6), NgDouble.valueOf((double)2))) == result); 
    assertTrue(tc.unwrapToDouble(op.apply(BigInteger.valueOf(6), NgDouble.valueOf((double)2))) == result); 
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), NgDouble.valueOf((double)2))).doubleValue() == result);
    
    assertTrue(op.bigIntegerApply((byte)6, BigInteger.valueOf(2)).longValue() == result);    
    assertTrue(op.bigIntegerApply((char)6, BigInteger.valueOf(2)).longValue() == result);    
    assertTrue(op.bigIntegerApply((short)6, BigInteger.valueOf(2)).longValue() == result);    
    assertTrue(op.bigIntegerApply((int)6, BigInteger.valueOf(2)).longValue() == result);    
    assertTrue(op.bigIntegerApply((long)6, BigInteger.valueOf(2)).longValue() == result);    
    assertTrue(op.floatApply((float)6, BigInteger.valueOf(2)) == result);    
    assertTrue(op.doubleApply((double)6, BigInteger.valueOf(2)) == result);    
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(6), BigInteger.valueOf(2)).longValue() == result);    
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(6), BigInteger.valueOf(2)).doubleValue() == result);
    
    assertTrue(((BigInteger)op.apply((byte)6, BigInteger.valueOf(2))).longValue() == result);    
    assertTrue(((BigInteger)op.apply((char)6, BigInteger.valueOf(2))).longValue() == result);    
    assertTrue(((BigInteger)op.apply((short)6, BigInteger.valueOf(2))).longValue() == result);    
    assertTrue(((BigInteger)op.apply((int)6, BigInteger.valueOf(2))).longValue() == result);    
    assertTrue(((BigInteger)op.apply((long)6, BigInteger.valueOf(2))).longValue() == result);    
    assertTrue(tc.unwrapToFloat(op.apply((float)6, BigInteger.valueOf(2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply((double)6, BigInteger.valueOf(2))) == result);    
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(6), BigInteger.valueOf(2))).longValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), BigInteger.valueOf(2))).doubleValue() == result);   
    
    assertTrue(((BigInteger)op.apply(NgByte.valueOf((byte)6), BigInteger.valueOf(2))).longValue() == result);    
    assertTrue(((BigInteger)op.apply(NgChar.valueOf((char)6), BigInteger.valueOf(2))).longValue() == result);    
    assertTrue(((BigInteger)op.apply(NgShort.valueOf((short)6), BigInteger.valueOf(2))).longValue() == result);    
    assertTrue(((BigInteger)op.apply(NgInt.valueOf((int)6), BigInteger.valueOf(2))).longValue() == result);    
    assertTrue(((BigInteger)op.apply(NgLong.valueOf((long)6), BigInteger.valueOf(2))).longValue() == result);    
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)6), BigInteger.valueOf(2))) == result);    
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)6), BigInteger.valueOf(2))) == result);    
    
    assertTrue(op.bigDecimalApply((byte)6, BigDecimal.valueOf(2)).doubleValue() == result);    
    assertTrue(op.bigDecimalApply((char)6, BigDecimal.valueOf(2)).doubleValue() == result);    
    assertTrue(op.bigDecimalApply((short)6, BigDecimal.valueOf(2)).doubleValue() == result);    
    assertTrue(op.bigDecimalApply((int)6, BigDecimal.valueOf(2)).doubleValue() == result);    
    assertTrue(op.bigDecimalApply((long)6, BigDecimal.valueOf(2)).doubleValue() == result);    
    assertTrue(op.bigDecimalApply((float)6, BigDecimal.valueOf(2)).doubleValue() == result);    
    assertTrue(op.bigDecimalApply((double)6, BigDecimal.valueOf(2)).doubleValue() == result);    
    assertTrue(op.bigDecimalApply(BigInteger.valueOf(6), BigDecimal.valueOf(2)).doubleValue() == result);    
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(6), BigDecimal.valueOf(2)).doubleValue() == result);
    
    assertTrue(((BigDecimal)op.apply((byte)6, BigDecimal.valueOf(2))).doubleValue() == result);    
    assertTrue(((BigDecimal)op.apply((char)6, BigDecimal.valueOf(2))).doubleValue() == result);    
    assertTrue(((BigDecimal)op.apply((short)6, BigDecimal.valueOf(2))).doubleValue() == result);    
    assertTrue(((BigDecimal)op.apply((int)6, BigDecimal.valueOf(2))).doubleValue() == result);    
    assertTrue(((BigDecimal)op.apply((long)6, BigDecimal.valueOf(2))).doubleValue() == result);    
    assertTrue(((BigDecimal)op.apply((float)6, BigDecimal.valueOf(2))).doubleValue() == result);    
    assertTrue(((BigDecimal)op.apply((double)6, BigDecimal.valueOf(2))).doubleValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigInteger.valueOf(6), BigDecimal.valueOf(2))).doubleValue() == result);    
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(6), BigDecimal.valueOf(2))).doubleValue() == result);   
    
    assertTrue(((BigDecimal)op.apply(NgByte.valueOf((byte)6), BigDecimal.valueOf(2))).doubleValue() == result);    
    assertTrue(((BigDecimal)op.apply(NgChar.valueOf((char)6), BigDecimal.valueOf(2))).doubleValue() == result);    
    assertTrue(((BigDecimal)op.apply(NgShort.valueOf((short)6), BigDecimal.valueOf(2))).doubleValue() == result);    
    assertTrue(((BigDecimal)op.apply(NgInt.valueOf((int)6), BigDecimal.valueOf(2))).doubleValue() == result);    
    assertTrue(((BigDecimal)op.apply(NgLong.valueOf((long)6), BigDecimal.valueOf(2))).doubleValue() == result);    
    assertTrue(((BigDecimal)op.apply(NgFloat.valueOf((float)6), BigDecimal.valueOf(2))).doubleValue() == result);    
    assertTrue(((BigDecimal)op.apply(NgDouble.valueOf((double)6), BigDecimal.valueOf(2))).doubleValue() == result);    
  }
  
  public void testAdd() throws Throwable {
    final ThreadContext tc = ThreadContext.getThreadContext();
    doNormalTest(tc, tc.add(), 8);
  }
  
  public void testSubtract() throws Throwable {
    final ThreadContext tc = ThreadContext.getThreadContext();
    doNormalTest(tc, tc.subtract(), 4);
  }
  
  public void testMultiply() throws Throwable {
    final ThreadContext tc = ThreadContext.getThreadContext();
    doNormalTest(tc, tc.multiply(), 12);
  }
  
  public void testDivide() throws Throwable {
    final ThreadContext tc = ThreadContext.getThreadContext();
    doNormalTest(tc, tc.divide(), 3);
  }
}