package ng.runtime.metaclass;

import java.util.Map;

/**
 * @author John
 *
 */
public interface BaseBooleanComparison {
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
}
