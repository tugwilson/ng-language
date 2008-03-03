package ng.runtime.metaclass.primitives.charimpl;

import ng.runtime.metaclass.BinaryArithmeticCategorySupport;
import ng.runtime.metaclass.BooleanComparisonCategorySupport;
import ng.runtime.metaclass.ConversionOperationCategorySupport;
import ng.runtime.metaclass.IntegerComparisonCategorySupport;
import ng.runtime.metaclass.BinaryLogicalCategorySupport;
import ng.runtime.metaclass.ShiftCategorySupport;
import ng.runtime.metaclass.MetaClass;


public interface CharMetaClass extends MetaClass {

  void modifyConvert(CharConversion modifiedConvert);
  CharConversion getOriginalConvert();
  CharConversion convert(ConversionOperationCategorySupport conversionOperation);

  void modifyAdd(CharBinaryArithmeticOperation modifiedAdd);
  CharBinaryArithmeticOperation getOriginalAdd();
  CharBinaryArithmeticOperation add(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifySubtract(CharBinaryArithmeticOperation modifiedSubtract);
  CharBinaryArithmeticOperation getOriginalSubtract();
  CharBinaryArithmeticOperation subtract(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyMultiply(CharBinaryArithmeticOperation modifiedMultiply);
  CharBinaryArithmeticOperation getOriginalMultiply();
  CharBinaryArithmeticOperation multiply(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyDivide(CharBinaryArithmeticOperation modifiedDivide);
  CharBinaryArithmeticOperation getOriginalDivide();
  CharBinaryArithmeticOperation divide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyModulo(CharBinaryArithmeticOperation modifiedModulo);
  CharBinaryArithmeticOperation getOriginalModulo();
  CharBinaryArithmeticOperation modulo(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyRemainderDivide(CharBinaryArithmeticOperation modifiedRemainderDivide);
  CharBinaryArithmeticOperation getOriginalRemainderDivide();
  CharBinaryArithmeticOperation remainderDivide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyPower(CharBinaryArithmeticOperation modifiedPower);
  CharBinaryArithmeticOperation getOriginalPower();
  CharBinaryArithmeticOperation power(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyAnd(CharBinaryLogicalOperation modifiedAnd);
  CharBinaryLogicalOperation getOriginalAnd();
  CharBinaryLogicalOperation and(BinaryLogicalCategorySupport binaryLogicalOperation);

  void modifyOr(CharBinaryLogicalOperation modifiedOr);
  CharBinaryLogicalOperation getOriginalOr();
  CharBinaryLogicalOperation or(BinaryLogicalCategorySupport binaryLogicalOperation);

  void modifyXor(CharBinaryLogicalOperation modifiedXor);
  CharBinaryLogicalOperation getOriginalXor();
  CharBinaryLogicalOperation xor(BinaryLogicalCategorySupport binaryLogicalOperation);

  void modifyLeftShift(CharShiftOperation modifiedLeftShift);
  CharShiftOperation getOriginalLeftShift();
  CharShiftOperation leftShift(ShiftCategorySupport shiftOperation);

  void modifyRightShift(CharShiftOperation modifiedRightShift);
  CharShiftOperation getOriginalRightShift();
  CharShiftOperation rightShift(ShiftCategorySupport shiftOperation);

  void modifyUnsignedRightShift(CharShiftOperation modifiedUnsignedRightShift);
  CharShiftOperation getOriginalUnsignedRightShift();
  CharShiftOperation unsignedRightShift(ShiftCategorySupport shiftOperation);

  void modifyCompare(CharIntegerComparison modifiedCompare);
  CharIntegerComparison getOriginalCompare();
  CharIntegerComparison compare(IntegerComparisonCategorySupport integerComparison);

  void modifyEquals(CharBooleanComparison modifiedEquals);
  CharBooleanComparison getOriginalEquals();
  CharBooleanComparison equals(BooleanComparisonCategorySupport booleanComparison);

  void modifyNotEquals(CharBooleanComparison modifiedNotEquals);
  CharBooleanComparison getOriginalNotEquals();
  CharBooleanComparison notEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThan(CharBooleanComparison modifiedLessThan);
  CharBooleanComparison getOriginalLessThan();
  CharBooleanComparison lessThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThan(CharBooleanComparison modifiedGreaterThan);
  CharBooleanComparison getOriginalGreaterThan();
  CharBooleanComparison greaterThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThanOrEquals(CharBooleanComparison modifiedLessThanOrEquals);
  CharBooleanComparison getOriginalLessThanOrEquals();
  CharBooleanComparison lessThanOrEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThanOrEquals(CharBooleanComparison modifiedGreaterThanOrEquals);
  CharBooleanComparison getOriginalGreaterThanOrEquals();
  CharBooleanComparison greaterThanOrEquals(BooleanComparisonCategorySupport booleanComparison);
}
