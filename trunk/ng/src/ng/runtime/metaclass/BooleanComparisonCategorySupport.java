package ng.runtime.metaclass;

import java.util.Map;

import ng.runtime.metaclass.primitives.bigdecimal.BigDecimalBooleanComparison;
import ng.runtime.metaclass.primitives.biginteger.BigIntegerBooleanComparison;
import ng.runtime.metaclass.primitives.byteimpl.ByteBooleanComparison;
import ng.runtime.metaclass.primitives.charimpl.CharBooleanComparison;
import ng.runtime.metaclass.primitives.doubleimpl.DoubleBooleanComparison;
import ng.runtime.metaclass.primitives.floatimpl.FloatBooleanComparison;
import ng.runtime.metaclass.primitives.intimpl.IntBooleanComparison;
import ng.runtime.metaclass.primitives.longimpl.LongBooleanComparison;
import ng.runtime.metaclass.primitives.shortimpl.ShortBooleanComparison;

/**
 * @author John
 *
 */
public interface BooleanComparisonCategorySupport {
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
