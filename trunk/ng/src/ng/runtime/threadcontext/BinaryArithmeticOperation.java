package ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.metaclass.MetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.ByteBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.DoubleBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortBinaryArithmeticOperation;

public interface BinaryArithmeticOperation extends BinaryOperation {

  CharBinaryArithmeticOperation getCharCategoryOperation();
  void setCharCategoryOperation(CharBinaryArithmeticOperation charCategoryOperation);

  ByteBinaryArithmeticOperation getByteCategoryOperation();
  void setByteCategoryOperation(ByteBinaryArithmeticOperation byteCategoryOperation);

  ShortBinaryArithmeticOperation getShortCategoryOperation();
  void setShortCategoryOperation(ShortBinaryArithmeticOperation shortCategoryOperation);

  IntBinaryArithmeticOperation getIntCategoryOperation();
  void setIntCategoryOperation(IntBinaryArithmeticOperation intCategoryOperation);

  LongBinaryArithmeticOperation getLongCategoryOperation();
  void setLongCategoryOperation(LongBinaryArithmeticOperation longCategoryOperation);

  FloatBinaryArithmeticOperation getFloatCategoryOperation();
  void setFloatCategoryOperation(FloatBinaryArithmeticOperation floatCategoryOperation);

  DoubleBinaryArithmeticOperation getDoubleCategoryOperation();
  void setDoubleCategoryOperation(DoubleBinaryArithmeticOperation doubleCategoryOperation);

  BigIntegerBinaryArithmeticOperation getBigIntegerCategoryOperation();
  void setBigIntegerCategoryOperation(BigIntegerBinaryArithmeticOperation bigIntegerCategoryOperation);

  BigDecimalBinaryArithmeticOperation getBigDecimalCategoryOperation();
  void setBigDecimalCategoryOperation(BigDecimalBinaryArithmeticOperation bigDecimalCategoryOperation);

  Map<MetaClass, ArithmeticBinaryOperation> getCategoryBinaryOperationMap();
  void setCategoryBinaryOperationMap(Map<MetaClass, ArithmeticBinaryOperation> categoryBinaryOperationMap);
  
  int intApply(char lhs, char rhs) throws NotPerformed;
  int intApply(char lhs, byte rhs) throws NotPerformed;
  int intApply(char lhs, short rhs) throws NotPerformed;
  int intApply(char lhs, int rhs) throws NotPerformed;
  long longApply(char lhs, long rhs) throws NotPerformed;
  float floatApply(char lhs, float rhs) throws NotPerformed;
  double doubleApply(char lhs, double rhs) throws NotPerformed;
  BigInteger bigIntegerApply(char lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal bigDecimalApply(char lhs, BigDecimal rhs) throws NotPerformed;

  int intApply(byte lhs, char rhs) throws NotPerformed;
  int intApply(byte lhs, byte rhs) throws NotPerformed;
  int intApply(byte lhs, short rhs) throws NotPerformed;
  int intApply(byte lhs, int rhs) throws NotPerformed;
  long longApply(byte lhs, long rhs) throws NotPerformed;
  float floatApply(byte lhs, float rhs) throws NotPerformed;
  double doubleApply(byte lhs, double rhs) throws NotPerformed;
  BigInteger bigIntegerApply(byte lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal bigDecimalApply(byte lhs, BigDecimal rhs) throws NotPerformed;

  int intApply(short lhs, char rhs) throws NotPerformed;
  int intApply(short lhs, byte rhs) throws NotPerformed;
  int intApply(short lhs, short rhs) throws NotPerformed;
  int intApply(short lhs, int rhs) throws NotPerformed;
  long longApply(short lhs, long rhs) throws NotPerformed;
  float floatApply(short lhs, float rhs) throws NotPerformed;
  double doubleApply(short lhs, double rhs) throws NotPerformed;
  BigInteger bigIntegerApply(short lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal bigDecimalApply(short lhs, BigDecimal rhs) throws NotPerformed;

  int intApply(int lhs, char rhs) throws NotPerformed;
  int intApply(int lhs, byte rhs) throws NotPerformed;
  int intApply(int lhs, short rhs) throws NotPerformed;
  int intApply(int lhs, int rhs) throws NotPerformed;
  long longApply(int lhs, long rhs) throws NotPerformed;
  float floatApply(int lhs, float rhs) throws NotPerformed;
  double doubleApply(int lhs, double rhs) throws NotPerformed;
  BigInteger bigIntegerApply(int lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal bigDecimalApply(int lhs, BigDecimal rhs) throws NotPerformed;

  long longApply(long lhs, char rhs) throws NotPerformed;
  long longApply(long lhs, byte rhs) throws NotPerformed;
  long longApply(long lhs, short rhs) throws NotPerformed;
  long longApply(long lhs, int rhs) throws NotPerformed;
  long longApply(long lhs, long rhs) throws NotPerformed;
  float floatApply(long lhs, float rhs) throws NotPerformed;
  double doubleApply(long lhs, double rhs) throws NotPerformed;
  BigInteger bigIntegerApply(long lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal bigDecimalApply(long lhs, BigDecimal rhs) throws NotPerformed;

  float floatApply(float lhs, char rhs) throws NotPerformed;
  float floatApply(float lhs, byte rhs) throws NotPerformed;
  float floatApply(float lhs, short rhs) throws NotPerformed;
  float floatApply(float lhs, int rhs) throws NotPerformed;
  float floatApply(float lhs, long rhs) throws NotPerformed;
  float floatApply(float lhs, float rhs) throws NotPerformed;
  double doubleApply(float lhs, double rhs) throws NotPerformed;
  float floatApply(float lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal bigDecimalApply(float lhs, BigDecimal rhs) throws NotPerformed;

  double doubleApply(double lhs, char rhs) throws NotPerformed;
  double doubleApply(double lhs, byte rhs) throws NotPerformed;
  double doubleApply(double lhs, short rhs) throws NotPerformed;
  double doubleApply(double lhs, int rhs) throws NotPerformed;
  double doubleApply(double lhs, long rhs) throws NotPerformed;
  double doubleApply(double lhs, float rhs) throws NotPerformed;
  double doubleApply(double lhs, double rhs) throws NotPerformed;
  double doubleApply(double lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal bigDecimalApply(double lhs, BigDecimal rhs) throws NotPerformed;

  BigInteger bigIntegerApply(BigInteger lhs, char rhs) throws NotPerformed;
  BigInteger bigIntegerApply(BigInteger lhs, byte rhs) throws NotPerformed;
  BigInteger bigIntegerApply(BigInteger lhs, short rhs) throws NotPerformed;
  BigInteger bigIntegerApply(BigInteger lhs, int rhs) throws NotPerformed;
  BigInteger bigIntegerApply(BigInteger lhs, long rhs) throws NotPerformed;
  float floatApply(BigInteger lhs, float rhs) throws NotPerformed;
  double doubleApply(BigInteger lhs, double rhs) throws NotPerformed;
  BigInteger bigIntegerApply(BigInteger lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal bigDecimalApply(BigInteger lhs, BigDecimal rhs) throws NotPerformed;

  BigDecimal bigDecimalApply(BigDecimal lhs, char rhs) throws NotPerformed;
  BigDecimal bigDecimalApply(BigDecimal lhs, byte rhs) throws NotPerformed;
  BigDecimal bigDecimalApply(BigDecimal lhs, short rhs) throws NotPerformed;
  BigDecimal bigDecimalApply(BigDecimal lhs, int rhs) throws NotPerformed;
  BigDecimal bigDecimalApply(BigDecimal lhs, long rhs) throws NotPerformed;
  BigDecimal bigDecimalApply(BigDecimal lhs, float rhs) throws NotPerformed;
  BigDecimal bigDecimalApply(BigDecimal lhs, double rhs) throws NotPerformed;
  BigDecimal bigDecimalApply(BigDecimal lhs, BigInteger rhs) throws NotPerformed;
  BigDecimal bigDecimalApply(BigDecimal lhs, BigDecimal rhs) throws NotPerformed;
}
