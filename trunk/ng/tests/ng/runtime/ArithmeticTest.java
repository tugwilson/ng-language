package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;
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
  public void testAdd() throws Throwable {
    final ThreadContext tc = ThreadContext.getThreadContext();
    Object o;

      o = tc.add().apply((byte)1, (byte)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(int.class, tc.misc().getTheClass(o));
      o = tc.add().apply((char)1, (byte)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(int.class, tc.misc().getTheClass(o));
      o = tc.add().apply((short)1, (byte)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(int.class, tc.misc().getTheClass(o));
      o = tc.add().apply(1, (byte)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(int.class, tc.misc().getTheClass(o));
      o = tc.add().apply((long)1, (byte)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(long.class, tc.misc().getTheClass(o));
      o = tc.add().apply((float)1, (byte)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(float.class, tc.misc().getTheClass(o));
      o = tc.add().apply((double)1, (byte)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(double.class, tc.misc().getTheClass(o));
      o = tc.add().apply((byte)1, (char)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(int.class, tc.misc().getTheClass(o));
      o = tc.add().apply((char)1, (char)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(int.class, tc.misc().getTheClass(o));
      o = tc.add().apply((short)1, (char)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(int.class, tc.misc().getTheClass(o));
      o = tc.add().apply(1, (char)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(int.class, tc.misc().getTheClass(o));
      o = tc.add().apply((long)1, (char)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(long.class, tc.misc().getTheClass(o));
      o = tc.add().apply((float)1, (char)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(float.class, tc.misc().getTheClass(o));
      o = tc.add().apply((double)1, (char)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(double.class, tc.misc().getTheClass(o));
      o = tc.add().apply((byte)1, (short)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(int.class, tc.misc().getTheClass(o));
      o = tc.add().apply((char)1, (short)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(int.class, tc.misc().getTheClass(o));
      o = tc.add().apply((short)1, (short)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(int.class, tc.misc().getTheClass(o));
      o = tc.add().apply(1, (short)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(int.class, tc.misc().getTheClass(o));
      o = tc.add().apply((long)1, (short)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(long.class, tc.misc().getTheClass(o));
      o = tc.add().apply((float)1, (short)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(float.class, tc.misc().getTheClass(o));
      o = tc.add().apply((double)1, (short)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(double.class, tc.misc().getTheClass(o));
      o = tc.add().apply((byte)1, 1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(int.class, tc.misc().getTheClass(o));
      o = tc.add().apply((char)1, 1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(int.class, tc.misc().getTheClass(o));
      o = tc.add().apply((short)1, 1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(int.class, tc.misc().getTheClass(o));
      o = tc.add().apply(1, 1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(int.class, tc.misc().getTheClass(o));
      o = tc.add().apply((long)1, 1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(long.class, tc.misc().getTheClass(o));
      o = tc.add().apply((float)1, 1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(float.class, tc.misc().getTheClass(o));
      o = tc.add().apply((double)1, 1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(double.class, tc.misc().getTheClass(o));
      o = tc.add().apply((byte)1, (long)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(long.class, tc.misc().getTheClass(o));
      o = tc.add().apply((char)1, (long)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(long.class, tc.misc().getTheClass(o));
      o = tc.add().apply((short)1, (long)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(long.class, tc.misc().getTheClass(o));
      o = tc.add().apply(1, (long)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(long.class, tc.misc().getTheClass(o));
      o = tc.add().apply((long)1, (long)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(long.class, tc.misc().getTheClass(o));
      o = tc.add().apply((float)1, (long)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(float.class, tc.misc().getTheClass(o));
      o = tc.add().apply((double)1, (long)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(double.class, tc.misc().getTheClass(o));
      o = tc.add().apply((byte)1, (float)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(float.class, tc.misc().getTheClass(o));
      o = tc.add().apply((char)1, (float)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(float.class, tc.misc().getTheClass(o));
      o = tc.add().apply((short)1, (float)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(float.class, tc.misc().getTheClass(o));
      o = tc.add().apply(1, (float)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(float.class, tc.misc().getTheClass(o));
      o = tc.add().apply((long)1, (float)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(float.class, tc.misc().getTheClass(o));
      o = tc.add().apply((float)1, (float)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(float.class, tc.misc().getTheClass(o));
      o = tc.add().apply((double)1, (float)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(double.class, tc.misc().getTheClass(o));
      o = tc.add().apply((byte)1, (double)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(double.class, tc.misc().getTheClass(o));
      o = tc.add().apply((char)1, (double)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(double.class, tc.misc().getTheClass(o));
      o = tc.add().apply((short)1, (double)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(double.class, tc.misc().getTheClass(o));
      o = tc.add().apply(1, (double)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(double.class, tc.misc().getTheClass(o));
      o = tc.add().apply((long)1, (double)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(double.class, tc.misc().getTheClass(o));
      o = tc.add().apply((float)1, (double)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(double.class, tc.misc().getTheClass(o));
      o = tc.add().apply((double)1, (double)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(double.class, tc.misc().getTheClass(o));
      o = tc.add().apply((byte)1, (BigInteger)this.oneBigInt);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigInteger.class, tc.misc().getTheClass(o));
      o = tc.add().apply((char)1, (BigInteger)this.oneBigInt);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigInteger.class, tc.misc().getTheClass(o));
      o = tc.add().apply((short)1, (BigInteger)this.oneBigInt);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigInteger.class, tc.misc().getTheClass(o));
      o = tc.add().apply(1, (BigInteger)this.oneBigInt);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigInteger.class, tc.misc().getTheClass(o));
      o = tc.add().apply((long)1, (BigInteger)this.oneBigInt);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigInteger.class, tc.misc().getTheClass(o));
      o = tc.add().apply((float)1, (BigInteger)this.oneBigInt);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(float.class, tc.misc().getTheClass(o));
      o = tc.add().apply((double)1, (BigInteger)this.oneBigInt);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(double.class, tc.misc().getTheClass(o));
      o = tc.add().apply((byte)1, (BigDecimal)this.oneBigDecimal);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));
      o = tc.add().apply((char)1, (BigDecimal)this.oneBigDecimal);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));
      o = tc.add().apply((short)1, (BigDecimal)this.oneBigDecimal);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));
      o = tc.add().apply(1, (BigDecimal)this.oneBigDecimal);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));
      o = tc.add().apply((long)1, (BigDecimal)this.oneBigDecimal);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));
      o = tc.add().apply((float)1, (BigDecimal)this.oneBigDecimal);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));
      o = tc.add().apply((double)1, (BigDecimal)this.oneBigDecimal);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));

      o = tc.add().apply((BigInteger)this.oneBigInt, (byte)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigInteger.class, tc.misc().getTheClass(o));
      o = tc.add().apply((BigInteger)this.oneBigInt, (char)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigInteger.class, tc.misc().getTheClass(o));
      o = tc.add().apply((BigInteger)this.oneBigInt, (short)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigInteger.class, tc.misc().getTheClass(o));
      o = tc.add().apply((BigInteger)this.oneBigInt, 1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigInteger.class, tc.misc().getTheClass(o));
      o = tc.add().apply((BigInteger)this.oneBigInt, (long)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigInteger.class, tc.misc().getTheClass(o));
      o = tc.add().apply((BigInteger)this.oneBigInt, (float)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(float.class, tc.misc().getTheClass(o));
      o = tc.add().apply((BigInteger)this.oneBigInt, (double)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(double.class, tc.misc().getTheClass(o));
      o = tc.add().apply((BigInteger)this.oneBigInt, (BigInteger)this.oneBigInt);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigInteger.class, tc.misc().getTheClass(o));
      o = tc.add().apply((BigInteger)this.oneBigInt, (BigDecimal)this.oneBigDecimal);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));

      o = tc.add().apply((BigDecimal)this.oneBigDecimal, (byte)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));
      o = tc.add().apply((BigDecimal)this.oneBigDecimal, (char)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));
      o = tc.add().apply((BigDecimal)this.oneBigDecimal, (short)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));
      o = tc.add().apply((BigDecimal)this.oneBigDecimal, 1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));
      o = tc.add().apply((BigDecimal)this.oneBigDecimal, (long)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));
      o = tc.add().apply((BigDecimal)this.oneBigDecimal, (float)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));
      o = tc.add().apply((BigDecimal)this.oneBigDecimal, (double)1);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));
      o = tc.add().apply((BigDecimal)this.oneBigDecimal, (BigInteger)this.oneBigInt);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));
      o = tc.add().apply((BigDecimal)this.oneBigDecimal, (BigDecimal)this.oneBigDecimal);
      assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
      assertEquals(BigDecimal.class, tc.misc().getTheClass(o));
/*
      try {
        tc.add().apply((byte) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((char) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((short) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((long) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((float) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((double) 1, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigInteger)this.oneBigInt, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigDecimal)this.oneBigDecimal, (byte) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((byte) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((char) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((short) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((long) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((float) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((double) 1, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigInteger)this.oneBigInt, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigDecimal)this.oneBigDecimal, (char) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((byte) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((char) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((short) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((long) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((float) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((double) 1, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigInteger)this.oneBigInt, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigDecimal)this.oneBigDecimal, (short) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((byte) 1, 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((char) 1, 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {
      }
      try {
        tc.add().apply((short) 1, 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {
      }
      try {
        tc.add().apply(1, 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {
      }
      try {
        tc.add().apply((long) 1, 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((float) 1, 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((double) 1, 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigInteger)this.oneBigInt, 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigDecimal)this.oneBigDecimal, 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((byte) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((char) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((short) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((long) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((float) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((double) 1, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigInteger)this.oneBigInt, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigDecimal)this.oneBigDecimal, (long) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((byte) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((char) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((short) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((long) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((float) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((double) 1, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigInteger)this.oneBigInt, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigDecimal)this.oneBigDecimal, (float) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((byte) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((char) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((short) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((long) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((float) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((double) 1, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigInteger)this.oneBigInt, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigDecimal)this.oneBigDecimal, (double) 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((byte) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((char) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((short) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((long) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((float) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((double) 1, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((byte) 1, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((char) 1, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((short) 1, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(1, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((long) 1, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((float) 1, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((double) 1, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigInteger) this.oneBigInt, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigInteger) this.oneBigInt, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigDecimal) this.oneBigDecimal, (BigInteger) this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigDecimal) this.oneBigDecimal, (BigDecimal) this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
*/
      for (int i = 0; i != this.ones.length; i++) {

        o = tc.add().apply(this.ones[i], (byte)1);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(byte.class),
                      tc.misc().getTheClass(o));
        o = tc.add().apply(this.ones[i], (char)1);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(char.class),
            tc.misc().getTheClass(o));
        o = tc.add().apply(this.ones[i], (short)1);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(short.class),
            tc.misc().getTheClass(o));
        o = tc.add().apply(this.ones[i], 1);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(int.class),
            tc.misc().getTheClass(o));
        o = tc.add().apply(this.ones[i], (long)1);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(long.class),
            tc.misc().getTheClass(o));
        o = tc.add().apply(this.ones[i], (float)1);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(float.class),
            tc.misc().getTheClass(o));
        o = tc.add().apply(this.ones[i], (double)1);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(double.class),
            tc.misc().getTheClass(o));
        o = tc.add().apply(this.ones[i], (BigInteger)this.oneBigInt);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(BigInteger.class),
            tc.misc().getTheClass(o));
        o = tc.add().apply(this.ones[i], (BigDecimal)this.oneBigDecimal);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(BigDecimal.class),
            tc.misc().getTheClass(o));

        o = tc.add().apply((byte)1, this.ones[i]);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(byte.class),
            tc.misc().getTheClass(o));
        o = tc.add().apply((char)1, this.ones[i]);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(char.class),
            tc.misc().getTheClass(o));
        o = tc.add().apply((short)1, this.ones[i]);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(short.class),
            tc.misc().getTheClass(o));
        o = tc.add().apply(1, this.ones[i]);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(int.class),
            tc.misc().getTheClass(o));
        o = tc.add().apply((long)1, this.ones[i]);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(long.class),
            tc.misc().getTheClass(o));
        o = tc.add().apply((float)1, this.ones[i]);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(float.class),
            tc.misc().getTheClass(o));
        o = tc.add().apply((double)1, this.ones[i]);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(double.class),
            tc.misc().getTheClass(o));
        o = tc.add().apply((BigInteger)this.oneBigInt, this.ones[i]);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(BigInteger.class),
            tc.misc().getTheClass(o));
        o = tc.add().apply((BigDecimal)this.oneBigDecimal, this.ones[i]);
        assertTrue(tc.convert().asBoolean(tc.equals().apply(o, this.twoInt)));
        assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(BigDecimal.class),
            tc.misc().getTheClass(o));
/*
        for (int j = 0; j != this.ones.length; j++) {
          o = tc.add().apply(this.ones[i], this.ones[j]);
          assertTrue(tc.convert().asBoolen(tc.equals().apply(o, this.twoInt)));
          assertEquals(((Map)this.typeConverter.get(tc.misc().getTheClass(o))).get(this.registry.getRuntimeMetaClass(this.ones[j]).getTheClass(o)),
              tc.misc().getTheClass(o));
        }
        */
      }
/*
      try {
        tc.add().apply(new Object(), new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(new Object(), (byte)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(new Object(), (char)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(new Object(), (short)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(new Object(), 1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(new Object(), (long)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(new Object(), (float)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(new Object(), (double)1);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(new Object(), (BigInteger)this.oneBigInt);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(new Object(), (BigDecimal)this.oneBigDecimal);
        assertTrue(false);
      } catch (final NgRuntimeException e) {}

      try {
        tc.add().apply((byte)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((char)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((short)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply(1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((long)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((float)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((double)1, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigInteger)this.oneBigInt, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      try {
        tc.add().apply((BigDecimal)this.oneBigDecimal, new Object());
        assertTrue(false);
      } catch (final NgRuntimeException e) {}
      */
    }
}
