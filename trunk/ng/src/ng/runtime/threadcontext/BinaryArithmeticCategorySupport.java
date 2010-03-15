package ng.runtime.threadcontext;

import java.util.Map;

import ng.runtime.metaclass.BinaryOperation;
import ng.runtime.metaclass.primitives.bigdecimal.BigDecimalBinaryArithmeticOperation;
import ng.runtime.metaclass.primitives.biginteger.BigIntegerBinaryArithmeticOperation;
import ng.runtime.metaclass.primitives.byteimpl.ByteBinaryArithmeticOperation;
import ng.runtime.metaclass.primitives.charimpl.CharBinaryArithmeticOperation;
import ng.runtime.metaclass.primitives.doubleimpl.DoubleBinaryArithmeticOperation;
import ng.runtime.metaclass.primitives.floatimpl.FloatBinaryArithmeticOperation;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryArithmeticOperation;
import ng.runtime.metaclass.primitives.longimpl.LongBinaryArithmeticOperation;
import ng.runtime.metaclass.primitives.shortimpl.ShortBinaryArithmeticOperation;

/**
 * @author John
 * 
 */
public interface BinaryArithmeticCategorySupport {
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
