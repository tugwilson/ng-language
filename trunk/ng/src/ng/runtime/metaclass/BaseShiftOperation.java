package ng.runtime.metaclass;

import java.util.Map;

/**
 * @author John
 *
 */
public interface BaseShiftOperation {
  CharShiftOperation getCharCategoryOperation();
  void setCharCategoryOperation(CharShiftOperation charCategoryOperation);

  ByteShiftOperation getByteCategoryOperation();
  void setByteCategoryOperation(ByteShiftOperation byteCategoryOperation);

  ShortShiftOperation getShortCategoryOperation();
  void setShortCategoryOperation(ShortShiftOperation shortCategoryOperation);

  IntShiftOperation getIntCategoryOperation();
  void setIntCategoryOperation(IntShiftOperation intCategoryOperation);

  LongShiftOperation getLongCategoryOperation();
  void setLongCategoryOperation(LongShiftOperation longCategoryOperation);

  ShiftOperation getFloatCategoryOperation();
  void setFloatCategoryOperation(ShiftOperation floatCategoryOperation);

  ShiftOperation getDoubleCategoryOperation();
  void setDoubleCategoryOperation(ShiftOperation doubleCategoryOperation);

  BigIntegerShiftOperation getBigIntegerCategoryOperation();
  void setBigIntegerCategoryOperation(BigIntegerShiftOperation bigIntegerCategoryOperation);

  ShiftOperation getBigDecimalCategoryOperation();
  void setBigDecimalCategoryOperation(ShiftOperation bigDecimalCategoryOperation);

  Map<Object, ShiftOperation> getCategoryBinaryOperationMap();
  void setCategoryBinaryOperationMap(Map<Object, ShiftOperation> categoryBinaryOperationMap);
}
