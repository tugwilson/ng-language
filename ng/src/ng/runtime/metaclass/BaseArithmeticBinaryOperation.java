package ng.runtime.metaclass;

import java.util.Map;

/**
 * @author John
 *
 */
public interface BaseArithmeticBinaryOperation {
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

  Map<Object, BinaryOperation> getCategoryBinaryOperationMap();
  void setCategoryBinaryOperationMap(Map<Object, BinaryOperation> categoryBinaryOperationMap);
}
