package ng.runtime.metaclass;

import java.util.Map;

/**
 * @author John
 *
 */
public interface BaseIntegerComparison {
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
}
