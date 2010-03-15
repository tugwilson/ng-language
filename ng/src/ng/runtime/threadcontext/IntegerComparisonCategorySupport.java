package ng.runtime.threadcontext;

import java.util.Map;

import ng.runtime.metaclass.primitives.bigdecimal.BigDecimalIntegerComparison;
import ng.runtime.metaclass.primitives.biginteger.BigIntegerIntegerComparison;
import ng.runtime.metaclass.primitives.byteimpl.ByteIntegerComparison;
import ng.runtime.metaclass.primitives.charimpl.CharIntegerComparison;
import ng.runtime.metaclass.primitives.doubleimpl.DoubleIntegerComparison;
import ng.runtime.metaclass.primitives.floatimpl.FloatIntegerComparison;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;
import ng.runtime.metaclass.primitives.intimpl.IntIntegerComparison;
import ng.runtime.metaclass.primitives.longimpl.LongIntegerComparison;
import ng.runtime.metaclass.primitives.shortimpl.ShortIntegerComparison;

/**
 * @author John
 * 
 */
public interface IntegerComparisonCategorySupport {
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

  Map<Object, IntBinaryComparison> getCategoryOperationMap();

  void setCategoryOperationMap(Map<Object, IntBinaryComparison> categoryOperationMap);
}
