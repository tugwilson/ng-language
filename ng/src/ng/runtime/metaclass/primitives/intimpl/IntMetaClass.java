package ng.runtime.metaclass.primitives.intimpl;

import ng.runtime.metaclass.BinaryArithmeticCategorySupport;
import ng.runtime.metaclass.BooleanComparisonCategorySupport;
import ng.runtime.metaclass.ConversionOperationCategorySupport;
import ng.runtime.metaclass.IntegerComparisonCategorySupport;
import ng.runtime.metaclass.BinaryLogicalCategorySupport;
import ng.runtime.metaclass.ShiftCategorySupport;
import ng.runtime.metaclass.MetaClass;



public interface IntMetaClass extends MetaClass {

  void modifyConvert(IntConversion modifiedConvert);
  IntConversion getOriginalConvert();
  IntConversion convert(ConversionOperationCategorySupport conversionOperation);

  void modifyAdd(IntBinaryArithmeticOperation modifiedAdd);
  IntBinaryArithmeticOperation getOriginalAdd();
  IntBinaryArithmeticOperation add(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifySubtract(IntBinaryArithmeticOperation modifiedSubtract);
  IntBinaryArithmeticOperation getOriginalSubtract();
  IntBinaryArithmeticOperation subtract(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyMultiply(IntBinaryArithmeticOperation modifiedMultiply);
  IntBinaryArithmeticOperation getOriginalMultiply();
  IntBinaryArithmeticOperation multiply(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyDivide(IntBinaryArithmeticOperation modifiedDivide);
  IntBinaryArithmeticOperation getOriginalDivide();
  IntBinaryArithmeticOperation divide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyModulo(IntBinaryArithmeticOperation modifiedModulo);
  IntBinaryArithmeticOperation getOriginalModulo();
  IntBinaryArithmeticOperation modulo(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyRemainderDivide(IntBinaryArithmeticOperation modifiedRemainderDivide);
  IntBinaryArithmeticOperation getOriginalRemainderDivide();
  IntBinaryArithmeticOperation remainderDivide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyPower(IntBinaryArithmeticOperation modifiedPower);
  IntBinaryArithmeticOperation getOriginalPower();
  IntBinaryArithmeticOperation power(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyAnd(IntBinaryLogicalOperation modifiedAnd);
  IntBinaryLogicalOperation getOriginalAnd();
  IntBinaryLogicalOperation and(BinaryLogicalCategorySupport binaryArithmeticOperation);

  void modifyOr(IntBinaryLogicalOperation modifiedOr);
  IntBinaryLogicalOperation getOriginalOr();
  IntBinaryLogicalOperation or(BinaryLogicalCategorySupport binaryArithmeticOperation);

  void modifyXor(IntBinaryLogicalOperation modifiedXor);
  IntBinaryLogicalOperation getOriginalXor();
  IntBinaryLogicalOperation xor(BinaryLogicalCategorySupport binaryArithmeticOperation);

  void modifyLeftShift(IntShiftOperation modifiedLeftShift);
  IntShiftOperation getOriginalLeftShift();
  IntShiftOperation leftShift(ShiftCategorySupport binaryArithmeticOperation);

  void modifyRightShift(IntShiftOperation modifiedRightShift);
  IntShiftOperation getOriginalRightShift();
  IntShiftOperation rightShift(ShiftCategorySupport binaryArithmeticOperation);

  void modifyUnsignedRightShift(IntShiftOperation modifiedUnsignedRightShift);
  IntShiftOperation getOriginalUnsignedRightShift();
  IntShiftOperation unsignedRightShift(ShiftCategorySupport binaryArithmeticOperation);

  void modifyCompare(IntIntegerComparison modifiedCompare);
  IntIntegerComparison getOriginalCompare();
  IntIntegerComparison compare(IntegerComparisonCategorySupport integerComparison);

  void modifyEquals(IntBooleanComparison modifiedEquals);
  IntBooleanComparison getOriginalEquals();
  IntBooleanComparison equals(BooleanComparisonCategorySupport booleanComparison);

  void modifyNotEquals(IntBooleanComparison modifiedNotEquals);
  IntBooleanComparison getOriginalNotEquals();
  IntBooleanComparison notEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThan(IntBooleanComparison modifiedLessThan);
  IntBooleanComparison getOriginalLessThan();
  IntBooleanComparison lessThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThan(IntBooleanComparison modifiedGreaterThan);
  IntBooleanComparison getOriginalGreaterThan();
  IntBooleanComparison greaterThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThanOrEquals(IntBooleanComparison modifiedLessThanOrEquals);
  IntBooleanComparison getOriginalLessThanOrEquals();
  IntBooleanComparison lessThanOrEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThanOrEquals(IntBooleanComparison modifiedGreaterThanOrEquals);
  IntBooleanComparison getOriginalGreaterThanOrEquals();
  IntBooleanComparison greaterThanOrEquals(BooleanComparisonCategorySupport booleanComparison);
}
