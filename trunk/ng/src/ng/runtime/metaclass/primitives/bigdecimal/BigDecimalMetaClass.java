package ng.runtime.metaclass.primitives.bigdecimal;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BinaryArithmeticCategorySupport;
import ng.runtime.threadcontext.BooleanComparisonCategorySupport;
import ng.runtime.threadcontext.ConversionOperationCategorySupport;
import ng.runtime.threadcontext.IntegerComparisonCategorySupport;


public interface BigDecimalMetaClass extends MetaClass {

  void modifyConvert(BigDecimalConversion modifiedConvert);
  BigDecimalConversion getOriginalConvert();
  BigDecimalConversion convert(ConversionOperationCategorySupport conversionOperation);

  void modifyAdd(BigDecimalBinaryArithmeticOperation modifiedAdd);
  BigDecimalBinaryArithmeticOperation getOriginalAdd();
  BigDecimalBinaryArithmeticOperation add(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifySubtract(BigDecimalBinaryArithmeticOperation modifiedSubtract);
  BigDecimalBinaryArithmeticOperation getOriginalSubtract();
  BigDecimalBinaryArithmeticOperation subtract(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyMultiply(BigDecimalBinaryArithmeticOperation modifiedMultiply);
  BigDecimalBinaryArithmeticOperation getOriginalMultiply();
  BigDecimalBinaryArithmeticOperation multiply(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyDivide(BigDecimalBinaryArithmeticOperation modifiedDivide);
  BigDecimalBinaryArithmeticOperation getOriginalDivide();
  BigDecimalBinaryArithmeticOperation divide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyModulo(BigDecimalBinaryArithmeticOperation modifiedModulo);
  BigDecimalBinaryArithmeticOperation getOriginalModulo();
  BigDecimalBinaryArithmeticOperation modulo(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyRemainderDivide(BigDecimalBinaryArithmeticOperation modifiedRemainderDivide);
  BigDecimalBinaryArithmeticOperation getOriginalRemainderDivide();
  BigDecimalBinaryArithmeticOperation remainderDivide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyPower(BigDecimalBinaryArithmeticOperation modifiedPower);
  BigDecimalBinaryArithmeticOperation getOriginalPower();
  BigDecimalBinaryArithmeticOperation power(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyCompare(BigDecimalIntegerComparison modifiedCompare);
  BigDecimalIntegerComparison getOriginalCompare();
  BigDecimalIntegerComparison compare(IntegerComparisonCategorySupport booleanComparison);

  void modifyEquals(BigDecimalBooleanComparison modifiedEquals);
  BigDecimalBooleanComparison getOriginalEquals();
  BigDecimalBooleanComparison equals(BooleanComparisonCategorySupport booleanComparison);

  void modifyNotEquals(BigDecimalBooleanComparison modifiedNotEquals);
  BigDecimalBooleanComparison getOriginalNotEquals();
  BigDecimalBooleanComparison notEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThan(BigDecimalBooleanComparison modifiedLessThan);
  BigDecimalBooleanComparison getOriginalLessThan();
  BigDecimalBooleanComparison lessThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThan(BigDecimalBooleanComparison modifiedGreaterThan);
  BigDecimalBooleanComparison getOriginalGreaterThan();
  BigDecimalBooleanComparison greaterThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThanOrEquals(BigDecimalBooleanComparison modifiedLessThanOrEquals);
  BigDecimalBooleanComparison getOriginalLessThanOrEquals();
  BigDecimalBooleanComparison lessThanOrEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThanOrEquals(BigDecimalBooleanComparison modifiedGreaterThanOrEquals);
  BigDecimalBooleanComparison getOriginalGreaterThanOrEquals();
  BigDecimalBooleanComparison greaterThanOrEquals(BooleanComparisonCategorySupport booleanComparison);
}
