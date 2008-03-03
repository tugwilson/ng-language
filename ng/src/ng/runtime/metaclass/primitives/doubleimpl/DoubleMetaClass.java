package ng.runtime.metaclass.primitives.doubleimpl;

import ng.runtime.metaclass.BinaryArithmeticCategorySupport;
import ng.runtime.metaclass.BooleanComparisonCategorySupport;
import ng.runtime.metaclass.ConversionOperationCategorySupport;
import ng.runtime.metaclass.IntegerComparisonCategorySupport;
import ng.runtime.metaclass.MetaClass;


public interface DoubleMetaClass extends MetaClass {

  void modifyConvert(DoubleConversion modifiedConvert);
  DoubleConversion getOriginalConvert();
  DoubleConversion convert(ConversionOperationCategorySupport conversionOperation);

  void modifyAdd(DoubleBinaryArithmeticOperation modifiedAdd);
  DoubleBinaryArithmeticOperation getOriginalAdd();
  DoubleBinaryArithmeticOperation add(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifySubtract(DoubleBinaryArithmeticOperation modifiedSubtract);
  DoubleBinaryArithmeticOperation getOriginalSubtract();
  DoubleBinaryArithmeticOperation subtract(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyMultiply(DoubleBinaryArithmeticOperation modifiedMultiply);
  DoubleBinaryArithmeticOperation getOriginalMultiply();
  DoubleBinaryArithmeticOperation multiply(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyDivide(DoubleBinaryArithmeticOperation modifiedDivide);
  DoubleBinaryArithmeticOperation getOriginalDivide();
  DoubleBinaryArithmeticOperation divide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyModulo(DoubleBinaryArithmeticOperation modifiedModulo);
  DoubleBinaryArithmeticOperation getOriginalModulo();
  DoubleBinaryArithmeticOperation modulo(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyRemainderDivide(DoubleBinaryArithmeticOperation modifiedRemainderDivide);
  DoubleBinaryArithmeticOperation getOriginalRemainderDivide();
  DoubleBinaryArithmeticOperation remainderDivide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyPower(DoubleBinaryArithmeticOperation modifiedPower);
  DoubleBinaryArithmeticOperation getOriginalPower();
  DoubleBinaryArithmeticOperation power(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyCompare(DoubleIntegerComparison modifiedCompare);
  DoubleIntegerComparison getOriginalCompare();
  DoubleIntegerComparison compare(IntegerComparisonCategorySupport integerComparison);

  void modifyEquals(DoubleBooleanComparison modifiedEquals);
  DoubleBooleanComparison getOriginalEquals();
  DoubleBooleanComparison equals(BooleanComparisonCategorySupport booleanComparison);

  void modifyNotEquals(DoubleBooleanComparison modifiedNotEquals);
  DoubleBooleanComparison getOriginalNotEquals();
  DoubleBooleanComparison notEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThan(DoubleBooleanComparison modifiedLessThan);
  DoubleBooleanComparison getOriginalLessThan();
  DoubleBooleanComparison lessThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThan(DoubleBooleanComparison modifiedGreaterThan);
  DoubleBooleanComparison getOriginalGreaterThan();
  DoubleBooleanComparison greaterThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThanOrEquals(DoubleBooleanComparison modifiedLessThanOrEquals);
  DoubleBooleanComparison getOriginalLessThanOrEquals();
  DoubleBooleanComparison lessThanOrEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThanOrEquals(DoubleBooleanComparison modifiedGreaterThanOrEquals);
  DoubleBooleanComparison getOriginalGreaterThanOrEquals();
  DoubleBooleanComparison greaterThanOrEquals(BooleanComparisonCategorySupport booleanComparison);
}
