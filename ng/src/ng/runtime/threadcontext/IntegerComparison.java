package ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

import ng.lang.MetaClass;
import ng.runtime.metaclass.*;

/**
 * @author John
 *
 */
public interface IntegerComparison extends BinaryOperation {

  CharIntegerComparison getCharCategoryOperation();
  void setCharCategoryOperation(CharIntegerComparison charCategoryOperation);

  ByteIntegerComparison getByteCategoryOperation();
  void setByteCategoryOperation(ByteIntegerComparison byteCategoryOperation);

  ShortIntegerComparison getShortCategoryOperation();
  void setShortCategoryOperation(ShortIntegerComparison shortCategoryOperation);

  IntIntegerComparison getIntCategoryOperation();
  void setIntCategoryOperation(IntIntegerComparison intCategoryOperation);

  LongIntegerComparison getLongCategoryOperation();
  void setLongCategoryOperation(LongIntegerComparison longCategoryOperation);

  FloatIntegerComparison getFloatCategoryOperation();
  void setFloatCategoryOperation(FloatIntegerComparison floatCategoryOperation);

  DoubleIntegerComparison getDoubleCategoryOperation();
  void setDoubleCategoryOperation(DoubleIntegerComparison doubleCategoryOperation);

  BigIntegerIntegerComparison getBigIntegerCategoryOperation();
  void setBigIntegerCategoryOperation(BigIntegerIntegerComparison bigIntegerCategoryOperation);

  BigDecimalIntegerComparison getBigDecimalCategoryOperation();
  void setBigDecimalCategoryOperation(BigDecimalIntegerComparison bigDecimalCategoryOperation);

  Map<Object, IntegerBinaryComparison> getCategoryOperationMap();
  void setCategoryOperationMap(Map<Object, IntegerBinaryComparison> categoryOperationMap);

  int intApply(Object lhs, Object rhs);
  int intApply(MetaClass lhsMetaClass, Object lhs, Object rhs);
  int intApply(Object lhs, MetaClass rhsMetaClass, Object rhs);
  int intApply(MetaClass lhsMetaClass, Object lhs, MetaClass rhsMetaClass, Object rhs);

  int intApply(MetaClass lhsMetaClass, Object lhs, char rhs);
  int intApply(MetaClass lhsMetaClass, Object lhs, byte rhs);
  int intApply(MetaClass lhsMetaClass, Object lhs, short rhs);
  int intApply(MetaClass lhsMetaClass, Object lhs, int rhs);
  int intApply(MetaClass lhsMetaClass, Object lhs, long rhs);
  int intApply(MetaClass lhsMetaClass, Object lhs, float rhs);
  int intApply(MetaClass lhsMetaClass, Object lhs, double rhs);
  int intApply(MetaClass lhsMetaClass, Object lhs, BigInteger rhs);
  int intApply(MetaClass lhsMetaClass, Object lhs, BigDecimal rhs);

  int intApply(Object lhs, char rhs);
  int intApply(Object lhs, byte rhs);
  int intApply(Object lhs, short rhs);
  int intApply(Object lhs, int rhs);
  int intApply(Object lhs, long rhs);
  int intApply(Object lhs, float rhs);
  int intApply(Object lhs, double rhs);
  int intApply(Object lhs, BigInteger rhs);
  int intApply(Object lhs, BigDecimal rhs);

  int intApply(char lhs, MetaClass rhsMetaClass, Object rhs);
  int intApply(byte lhs, MetaClass rhsMetaClass, Object rhs);
  int intApply(short lhs, MetaClass rhsMetaClass, Object rhs);
  int intApply(int lhs, MetaClass rhsMetaClass, Object rhs);
  int intApply(long lhs, MetaClass rhsMetaClass, Object rhs);
  int intApply(float lhs, MetaClass rhsMetaClass, Object rhs);
  int intApply(double lhs, MetaClass rhsMetaClass, Object rhs);
  int intApply(BigInteger lhs, MetaClass rhsMetaClass, Object rhs);
  int intApply(BigDecimal lhs, MetaClass rhsMetaClass, Object rhs);

  int intApply(char lhs, Object rhs);
  int intApply(byte lhs, Object rhs);
  int intApply(short lhs, Object rhs);
  int intApply(int lhs, Object rhs);
  int intApply(long lhs, Object rhs);
  int intApply(float lhs, Object rhs);
  int intApply(double lhs, Object rhs);
  int intApply(BigInteger lhs, Object rhs);
  int intApply(BigDecimal lhs, Object rhs);

  int intApply(char lhs, char rhs);
  int intApply(char lhs, byte rhs);
  int intApply(char lhs, short rhs);
  int intApply(char lhs, int rhs);
  int intApply(char lhs, long rhs);
  int intApply(char lhs, float rhs);
  int intApply(char lhs, double rhs);
  int intApply(char lhs, BigInteger rhs);
  int intApply(char lhs, BigDecimal rhs);

  int intApply(byte lhs, char rhs);
  int intApply(byte lhs, byte rhs);
  int intApply(byte lhs, short rhs);
  int intApply(byte lhs, int rhs);
  int intApply(byte lhs, long rhs);
  int intApply(byte lhs, float rhs);
  int intApply(byte lhs, double rhs);
  int intApply(byte lhs, BigInteger rhs);
  int intApply(byte lhs, BigDecimal rhs);

  int intApply(short lhs, char rhs);
  int intApply(short lhs, byte rhs);
  int intApply(short lhs, short rhs);
  int intApply(short lhs, int rhs);
  int intApply(short lhs, long rhs);
  int intApply(short lhs, float rhs);
  int intApply(short lhs, double rhs);
  int intApply(short lhs, BigInteger rhs);
  int intApply(short lhs, BigDecimal rhs);

  int intApply(int lhs, char rhs);
  int intApply(int lhs, byte rhs);
  int intApply(int lhs, short rhs);
  int intApply(int lhs, int rhs);
  int intApply(int lhs, long rhs);
  int intApply(int lhs, float rhs);
  int intApply(int lhs, double rhs);
  int intApply(int lhs, BigInteger rhs);
  int intApply(int lhs, BigDecimal rhs);

  int intApply(long lhs, char rhs);
  int intApply(long lhs, byte rhs);
  int intApply(long lhs, short rhs);
  int intApply(long lhs, int rhs);
  int intApply(long lhs, long rhs);
  int intApply(long lhs, float rhs);
  int intApply(long lhs, double rhs);
  int intApply(long lhs, BigInteger rhs);
  int intApply(long lhs, BigDecimal rhs);

  int intApply(float lhs, char rhs);
  int intApply(float lhs, byte rhs);
  int intApply(float lhs, short rhs);
  int intApply(float lhs, int rhs);
  int intApply(float lhs, long rhs);
  int intApply(float lhs, float rhs);
  int intApply(float lhs, double rhs);
  int intApply(float lhs, BigInteger rhs);
  int intApply(float lhs, BigDecimal rhs);

  int intApply(double lhs, char rhs);
  int intApply(double lhs, byte rhs);
  int intApply(double lhs, short rhs);
  int intApply(double lhs, int rhs);
  int intApply(double lhs, long rhs);
  int intApply(double lhs, float rhs);
  int intApply(double lhs, double rhs);
  int intApply(double lhs, BigInteger rhs);
  int intApply(double lhs, BigDecimal rhs);

  int intApply(BigInteger lhs, char rhs);
  int intApply(BigInteger lhs, byte rhs);
  int intApply(BigInteger lhs, short rhs);
  int intApply(BigInteger lhs, int rhs);
  int intApply(BigInteger lhs, long rhs);
  int intApply(BigInteger lhs, float rhs);
  int intApply(BigInteger lhs, double rhs);
  int intApply(BigInteger lhs, BigInteger rhs);
  int intApply(BigInteger lhs, BigDecimal rhs);

  int intApply(BigDecimal lhs, char rhs);
  int intApply(BigDecimal lhs, byte rhs);
  int intApply(BigDecimal lhs, short rhs);
  int intApply(BigDecimal lhs, int rhs);
  int intApply(BigDecimal lhs, long rhs);
  int intApply(BigDecimal lhs, float rhs);
  int intApply(BigDecimal lhs, double rhs);
  int intApply(BigDecimal lhs, BigInteger rhs);
  int intApply(BigDecimal lhs, BigDecimal rhs);
}
