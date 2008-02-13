package ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.MetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal.BigDecimalBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.biginteger.BigIntegerBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl.ByteBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.charimpl.CharBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl.DoubleBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl.FloatBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.intimpl.IntBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.longimpl.LongBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl.ShortBooleanComparison;

public interface BooleanComparison  extends BinaryOperation {

  CharBooleanComparison getCharCategoryOperation();
  void setCharCategoryOperation(CharBooleanComparison charCategoryOperation);

  ByteBooleanComparison getByteCategoryOperation();
  void setByteCategoryOperation(ByteBooleanComparison byteCategoryOperation);

  ShortBooleanComparison getShortCategoryOperation();
  void setShortCategoryOperation(ShortBooleanComparison shortCategoryOperation);

  IntBooleanComparison getIntCategoryOperation();
  void setIntCategoryOperation(IntBooleanComparison intCategoryOperation);

  LongBooleanComparison getLongCategoryOperation();
  void setLongCategoryOperation(LongBooleanComparison longCategoryOperation);

  FloatBooleanComparison getFloatCategoryOperation();
  void setFloatCategoryOperation(FloatBooleanComparison floatCategoryOperation);

  DoubleBooleanComparison getDoubleCategoryOperation();
  void setDoubleCategoryOperation(DoubleBooleanComparison doubleCategoryOperation);

  BigIntegerBooleanComparison getBigIntegerCategoryOperation();
  void setBigIntegerCategoryOperation(BigIntegerBooleanComparison bigIntegerCategoryOperation);

  BigDecimalBooleanComparison getBigDecimalCategoryOperation();
  void setBigDecimalCategoryOperation(BigDecimalBooleanComparison bigDecimalCategoryOperation);

  Map<Object, BooleanBinaryComparison> getCategoryOperationMap();
  void setCategoryOperationMap(Map<Object, BooleanBinaryComparison> categoryOperationMap);

  boolean applyBoolean(Object lhs, Object rhs);
  boolean applyBoolean(MetaClass lhsMetaClass, Object lhs, Object rhs);
  boolean applyBoolean(Object lhs, MetaClass rhsMetaClass, Object rhs);
  boolean applyBoolean(MetaClass lhsMetaClass, Object lhs, MetaClass rhsMetaClass, Object rhs);

  boolean applyBoolean(MetaClass lhsMetaClass, Object lhs, char rhs);
  boolean applyBoolean(MetaClass lhsMetaClass, Object lhs, byte rhs);
  boolean applyBoolean(MetaClass lhsMetaClass, Object lhs, short rhs);
  boolean applyBoolean(MetaClass lhsMetaClass, Object lhs, int rhs);
  boolean applyBoolean(MetaClass lhsMetaClass, Object lhs, long rhs);
  boolean applyBoolean(MetaClass lhsMetaClass, Object lhs, float rhs);
  boolean applyBoolean(MetaClass lhsMetaClass, Object lhs, double rhs);
  boolean applyBoolean(MetaClass lhsMetaClass, Object lhs, BigInteger rhs);
  boolean applyBoolean(MetaClass lhsMetaClass, Object lhs, BigDecimal rhs);

  boolean applyBoolean(Object lhs, char rhs);
  boolean applyBoolean(Object lhs, byte rhs);
  boolean applyBoolean(Object lhs, short rhs);
  boolean applyBoolean(Object lhs, int rhs);
  boolean applyBoolean(Object lhs, long rhs);
  boolean applyBoolean(Object lhs, float rhs);
  boolean applyBoolean(Object lhs, double rhs);
  boolean applyBoolean(Object lhs, BigInteger rhs);
  boolean applyBoolean(Object lhs, BigDecimal rhs);

  boolean applyBoolean(char lhs, MetaClass rhsMetaClass, Object rhs);
  boolean applyBoolean(byte lhs, MetaClass rhsMetaClass, Object rhs);
  boolean applyBoolean(short lhs, MetaClass rhsMetaClass, Object rhs);
  boolean applyBoolean(int lhs, MetaClass rhsMetaClass, Object rhs);
  boolean applyBoolean(long lhs, MetaClass rhsMetaClass, Object rhs);
  boolean applyBoolean(float lhs, MetaClass rhsMetaClass, Object rhs);
  boolean applyBoolean(double lhs, MetaClass rhsMetaClass, Object rhs);
  boolean applyBoolean(BigInteger lhs, MetaClass rhsMetaClass, Object rhs);
  boolean applyBoolean(BigDecimal lhs, MetaClass rhsMetaClass, Object rhs);

  boolean applyBoolean(char lhs, Object rhs);
  boolean applyBoolean(byte lhs, Object rhs);
  boolean applyBoolean(short lhs, Object rhs);
  boolean applyBoolean(int lhs, Object rhs);
  boolean applyBoolean(long lhs, Object rhs);
  boolean applyBoolean(float lhs, Object rhs);
  boolean applyBoolean(double lhs, Object rhs);
  boolean applyBoolean(BigInteger lhs, Object rhs);
  boolean applyBoolean(BigDecimal lhs, Object rhs);

  boolean applyBoolean(char lhs, char rhs);
  boolean applyBoolean(char lhs, byte rhs);
  boolean applyBoolean(char lhs, short rhs);
  boolean applyBoolean(char lhs, int rhs);
  boolean applyBoolean(char lhs, long rhs);
  boolean applyBoolean(char lhs, float rhs);
  boolean applyBoolean(char lhs, double rhs);
  boolean applyBoolean(char lhs, BigInteger rhs);
  boolean applyBoolean(char lhs, BigDecimal rhs);

  boolean applyBoolean(byte lhs, char rhs);
  boolean applyBoolean(byte lhs, byte rhs);
  boolean applyBoolean(byte lhs, short rhs);
  boolean applyBoolean(byte lhs, int rhs);
  boolean applyBoolean(byte lhs, long rhs);
  boolean applyBoolean(byte lhs, float rhs);
  boolean applyBoolean(byte lhs, double rhs);
  boolean applyBoolean(byte lhs, BigInteger rhs);
  boolean applyBoolean(byte lhs, BigDecimal rhs);

  boolean applyBoolean(short lhs, char rhs);
  boolean applyBoolean(short lhs, byte rhs);
  boolean applyBoolean(short lhs, short rhs);
  boolean applyBoolean(short lhs, int rhs);
  boolean applyBoolean(short lhs, long rhs);
  boolean applyBoolean(short lhs, float rhs);
  boolean applyBoolean(short lhs, double rhs);
  boolean applyBoolean(short lhs, BigInteger rhs);
  boolean applyBoolean(short lhs, BigDecimal rhs);

  boolean applyBoolean(int lhs, char rhs);
  boolean applyBoolean(int lhs, byte rhs);
  boolean applyBoolean(int lhs, short rhs);
  boolean applyBoolean(int lhs, int rhs);
  boolean applyBoolean(int lhs, long rhs);
  boolean applyBoolean(int lhs, float rhs);
  boolean applyBoolean(int lhs, double rhs);
  boolean applyBoolean(int lhs, BigInteger rhs);
  boolean applyBoolean(int lhs, BigDecimal rhs);

  boolean applyBoolean(long lhs, char rhs);
  boolean applyBoolean(long lhs, byte rhs);
  boolean applyBoolean(long lhs, short rhs);
  boolean applyBoolean(long lhs, int rhs);
  boolean applyBoolean(long lhs, long rhs);
  boolean applyBoolean(long lhs, float rhs);
  boolean applyBoolean(long lhs, double rhs);
  boolean applyBoolean(long lhs, BigInteger rhs);
  boolean applyBoolean(long lhs, BigDecimal rhs);

  boolean applyBoolean(float lhs, char rhs);
  boolean applyBoolean(float lhs, byte rhs);
  boolean applyBoolean(float lhs, short rhs);
  boolean applyBoolean(float lhs, int rhs);
  boolean applyBoolean(float lhs, long rhs);
  boolean applyBoolean(float lhs, float rhs);
  boolean applyBoolean(float lhs, double rhs);
  boolean applyBoolean(float lhs, BigInteger rhs);
  boolean applyBoolean(float lhs, BigDecimal rhs);

  boolean applyBoolean(double lhs, char rhs);
  boolean applyBoolean(double lhs, byte rhs);
  boolean applyBoolean(double lhs, short rhs);
  boolean applyBoolean(double lhs, int rhs);
  boolean applyBoolean(double lhs, long rhs);
  boolean applyBoolean(double lhs, float rhs);
  boolean applyBoolean(double lhs, double rhs);
  boolean applyBoolean(double lhs, BigInteger rhs);
  boolean applyBoolean(double lhs, BigDecimal rhs);

  boolean applyBoolean(BigInteger lhs, char rhs);
  boolean applyBoolean(BigInteger lhs, byte rhs);
  boolean applyBoolean(BigInteger lhs, short rhs);
  boolean applyBoolean(BigInteger lhs, int rhs);
  boolean applyBoolean(BigInteger lhs, long rhs);
  boolean applyBoolean(BigInteger lhs, float rhs);
  boolean applyBoolean(BigInteger lhs, double rhs);
  boolean applyBoolean(BigInteger lhs, BigInteger rhs);
  boolean applyBoolean(BigInteger lhs, BigDecimal rhs);

  boolean applyBoolean(BigDecimal lhs, char rhs);
  boolean applyBoolean(BigDecimal lhs, byte rhs);
  boolean applyBoolean(BigDecimal lhs, short rhs);
  boolean applyBoolean(BigDecimal lhs, int rhs);
  boolean applyBoolean(BigDecimal lhs, long rhs);
  boolean applyBoolean(BigDecimal lhs, float rhs);
  boolean applyBoolean(BigDecimal lhs, double rhs);
  boolean applyBoolean(BigDecimal lhs, BigInteger rhs);
  boolean applyBoolean(BigDecimal lhs, BigDecimal rhs);

}
