package ng.runtime.metaclass.primitives.floatimpl;

import ng.runtime.metaclass.BinaryArithmeticCategorySupport;
import ng.runtime.metaclass.BooleanComparisonCategorySupport;
import ng.runtime.metaclass.ConversionOperationCategorySupport;
import ng.runtime.metaclass.IntegerComparisonCategorySupport;
import ng.runtime.metaclass.MetaClass;


public interface FloatMetaClass extends MetaClass {

  void modifyConvert(FloatConversion modifiedConvert);
  FloatConversion getOriginalConvert();
  FloatConversion convert(ConversionOperationCategorySupport conversionOperation);

  void modifyAdd(FloatBinaryArithmeticOperation modifiedAdd);
  FloatBinaryArithmeticOperation getOriginalAdd();
  FloatBinaryArithmeticOperation add(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifySubtract(FloatBinaryArithmeticOperation modifiedSubtract);
  FloatBinaryArithmeticOperation getOriginalSubtract();
  FloatBinaryArithmeticOperation subtract(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyMultiply(FloatBinaryArithmeticOperation modifiedMultiply);
  FloatBinaryArithmeticOperation getOriginalMultiply();
  FloatBinaryArithmeticOperation multiply(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyDivide(FloatBinaryArithmeticOperation modifiedDivide);
  FloatBinaryArithmeticOperation getOriginalDivide();
  FloatBinaryArithmeticOperation divide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyModulo(FloatBinaryArithmeticOperation modifiedModulo);
  FloatBinaryArithmeticOperation getOriginalModulo();
  FloatBinaryArithmeticOperation modulo(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyRemainderDivide(FloatBinaryArithmeticOperation modifiedRemainderDivide);
  FloatBinaryArithmeticOperation getOriginalRemainderDivide();
  FloatBinaryArithmeticOperation remainderDivide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyPower(FloatBinaryArithmeticOperation modifiedPower);
  FloatBinaryArithmeticOperation getOriginalPower();
  FloatBinaryArithmeticOperation power(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyCompare(FloatIntegerComparison modifiedCompare);
  FloatIntegerComparison getOriginalCompare();
  FloatIntegerComparison compare(IntegerComparisonCategorySupport integerComparison);

  void modifyEquals(FloatBooleanComparison modifiedEquals);
  FloatBooleanComparison getOriginalEquals();
  FloatBooleanComparison equals(BooleanComparisonCategorySupport booleanComparison);

  void modifyNotEquals(FloatBooleanComparison modifiedNotEquals);
  FloatBooleanComparison getOriginalNotEquals();
  FloatBooleanComparison notEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThan(FloatBooleanComparison modifiedLessThan);
  FloatBooleanComparison getOriginalLessThan();
  FloatBooleanComparison lessThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThan(FloatBooleanComparison modifiedGreaterThan);
  FloatBooleanComparison getOriginalGreaterThan();
  FloatBooleanComparison greaterThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThanOrEquals(FloatBooleanComparison modifiedLessThanOrEquals);
  FloatBooleanComparison getOriginalLessThanOrEquals();
  FloatBooleanComparison lessThanOrEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThanOrEquals(FloatBooleanComparison modifiedGreaterThanOrEquals);
  FloatBooleanComparison getOriginalGreaterThanOrEquals();
  FloatBooleanComparison greaterThanOrEquals(BooleanComparisonCategorySupport booleanComparison);
}
