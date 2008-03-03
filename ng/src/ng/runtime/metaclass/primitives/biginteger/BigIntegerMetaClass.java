package ng.runtime.metaclass.primitives.biginteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BinaryArithmeticCategorySupport;
import ng.runtime.threadcontext.BinaryLogicalCategorySupport;
import ng.runtime.threadcontext.BooleanComparisonCategorySupport;
import ng.runtime.threadcontext.ConversionOperationCategorySupport;
import ng.runtime.threadcontext.IntegerComparisonCategorySupport;
import ng.runtime.threadcontext.ShiftCategorySupport;


public interface BigIntegerMetaClass extends MetaClass {

  void modifyConvert(BigIntegerConversion modifiedConvert);
  BigIntegerConversion getOriginalConvert();
  BigIntegerConversion convert(ConversionOperationCategorySupport conversionOperation);

  void modifyAdd(BigIntegerBinaryArithmeticOperation modifiedAdd);
  BigIntegerBinaryArithmeticOperation getOriginalAdd();
  BigIntegerBinaryArithmeticOperation add(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifySubtract(BigIntegerBinaryArithmeticOperation modifiedSubtract);
  BigIntegerBinaryArithmeticOperation getOriginalSubtract();
  BigIntegerBinaryArithmeticOperation subtract(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyMultiply(BigIntegerBinaryArithmeticOperation modifiedMultiply);
  BigIntegerBinaryArithmeticOperation getOriginalMultiply();
  BigIntegerBinaryArithmeticOperation multiply(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyDivide(BigIntegerBinaryArithmeticOperation modifiedDivide);
  BigIntegerBinaryArithmeticOperation getOriginalDivide();
  BigIntegerBinaryArithmeticOperation divide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyModulo(BigIntegerBinaryArithmeticOperation modifiedModulo);
  BigIntegerBinaryArithmeticOperation getOriginalModulo();
  BigIntegerBinaryArithmeticOperation modulo(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyRemainderDivide(BigIntegerBinaryArithmeticOperation modifiedRemainderDivide);
  BigIntegerBinaryArithmeticOperation getOriginalRemainderDivide();
  BigIntegerBinaryArithmeticOperation remainderDivide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyPower(BigIntegerBinaryArithmeticOperation modifiedPower);
  BigIntegerBinaryArithmeticOperation getOriginalPower();
  BigIntegerBinaryArithmeticOperation power(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyAnd(BigIntegerBinaryLogicalOperation modifiedAnd);
  BigIntegerBinaryLogicalOperation getOriginalAnd();
  BigIntegerBinaryLogicalOperation and(BinaryLogicalCategorySupport binaryLogicalOperation);

  void modifyOr(BigIntegerBinaryLogicalOperation modifiedOr);
  BigIntegerBinaryLogicalOperation getOriginalOr();
  BigIntegerBinaryLogicalOperation or(BinaryLogicalCategorySupport binaryLogicalOperation);

  void modifyXor(BigIntegerBinaryLogicalOperation modifiedXor);
  BigIntegerBinaryLogicalOperation getOriginalXor();
  BigIntegerBinaryLogicalOperation xor(BinaryLogicalCategorySupport binaryLogicalOperation);

  void modifyLeftShift(BigIntegerShiftOperation modifiedLeftShift);
  BigIntegerShiftOperation getOriginalLeftShift();
  BigIntegerShiftOperation leftShift(ShiftCategorySupport shiftOperation);

  void modifyRightShift(BigIntegerShiftOperation modifiedRightShift);
  BigIntegerShiftOperation getOriginalRightShift();
  BigIntegerShiftOperation rightShift(ShiftCategorySupport shiftOperation);

  void modifyUnsignedRightShift(BigIntegerShiftOperation modifiedUnsignedRightShift);
  BigIntegerShiftOperation getOriginalUnsignedRightShift();
  BigIntegerShiftOperation unsignedRightShift(ShiftCategorySupport shiftOperation);

  void modifyCompare(BigIntegerIntegerComparison modifiedCompare);
  BigIntegerIntegerComparison getOriginalCompare();
  BigIntegerIntegerComparison compare(IntegerComparisonCategorySupport integerComparison);

  void modifyEquals(BigIntegerBooleanComparison modifiedEquals);
  BigIntegerBooleanComparison getOriginalEquals();
  BigIntegerBooleanComparison equals(BooleanComparisonCategorySupport booleanComparison);

  void modifyNotEquals(BigIntegerBooleanComparison modifiedNotEquals);
  BigIntegerBooleanComparison getOriginalNotEquals();
  BigIntegerBooleanComparison notEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThan(BigIntegerBooleanComparison modifiedLessThan);
  BigIntegerBooleanComparison getOriginalLessThan();
  BigIntegerBooleanComparison lessThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThan(BigIntegerBooleanComparison modifiedGreaterThan);
  BigIntegerBooleanComparison getOriginalGreaterThan();
  BigIntegerBooleanComparison greaterThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThanOrEquals(BigIntegerBooleanComparison modifiedLessThanOrEquals);
  BigIntegerBooleanComparison getOriginalLessThanOrEquals();
  BigIntegerBooleanComparison lessThanOrEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThanOrEquals(BigIntegerBooleanComparison modifiedGreaterThanOrEquals);
  BigIntegerBooleanComparison getOriginalGreaterThanOrEquals();
  BigIntegerBooleanComparison greaterThanOrEquals(BooleanComparisonCategorySupport booleanComparison);
}
