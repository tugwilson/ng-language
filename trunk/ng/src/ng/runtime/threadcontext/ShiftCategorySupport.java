package ng.runtime.threadcontext;

import java.util.Map;

import ng.runtime.metaclass.ShiftOperation;
import ng.runtime.metaclass.primitives.biginteger.BigIntegerShiftOperation;
import ng.runtime.metaclass.primitives.byteimpl.ByteShiftOperation;
import ng.runtime.metaclass.primitives.charimpl.CharShiftOperation;
import ng.runtime.metaclass.primitives.intimpl.IntShiftOperation;
import ng.runtime.metaclass.primitives.longimpl.LongShiftOperation;
import ng.runtime.metaclass.primitives.shortimpl.ShortShiftOperation;

/**
 * @author John
 * 
 */
public interface ShiftCategorySupport {
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
