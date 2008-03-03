package ng.runtime.metaclass.primitives.shortimpl;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BinaryArithmeticCategorySupport;
import ng.runtime.threadcontext.BinaryLogicalCategorySupport;
import ng.runtime.threadcontext.BooleanComparisonCategorySupport;
import ng.runtime.threadcontext.ConversionOperationCategorySupport;
import ng.runtime.threadcontext.IntegerComparisonCategorySupport;
import ng.runtime.threadcontext.ShiftCategorySupport;


public interface ShortMetaClass extends MetaClass {

  void modifyConvert(ShortConversion modifiedConvert);
  ShortConversion getOriginalConvert();
  ShortConversion convert(ConversionOperationCategorySupport conversionOperation);

  void modifyAdd(ShortBinaryArithmeticOperation modifiedAdd);
  ShortBinaryArithmeticOperation getOriginalAdd();
  ShortBinaryArithmeticOperation add(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifySubtract(ShortBinaryArithmeticOperation modifiedSubtract);
  ShortBinaryArithmeticOperation getOriginalSubtract();
  ShortBinaryArithmeticOperation subtract(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyMultiply(ShortBinaryArithmeticOperation modifiedMultiply);
  ShortBinaryArithmeticOperation getOriginalMultiply();
  ShortBinaryArithmeticOperation multiply(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyDivide(ShortBinaryArithmeticOperation modifiedDivide);
  ShortBinaryArithmeticOperation getOriginalDivide();
  ShortBinaryArithmeticOperation divide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyModulo(ShortBinaryArithmeticOperation modifiedModulo);
  ShortBinaryArithmeticOperation getOriginalModulo();
  ShortBinaryArithmeticOperation modulo(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyRemainderDivide(ShortBinaryArithmeticOperation modifiedRemainderDivide);
  ShortBinaryArithmeticOperation getOriginalRemainderDivide();
  ShortBinaryArithmeticOperation remainderDivide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyAnd(ShortBinaryLogicalOperation modifiedAnd);
  ShortBinaryLogicalOperation getOriginalAnd();
  ShortBinaryLogicalOperation and(BinaryLogicalCategorySupport binaryLogicalOperation);

  void modifyOr(ShortBinaryLogicalOperation modifiedOr);
  ShortBinaryLogicalOperation getOriginalOr();
  ShortBinaryLogicalOperation or(BinaryLogicalCategorySupport binaryLogicalOperation);

  void modifyXor(ShortBinaryLogicalOperation modifiedXor);
  ShortBinaryLogicalOperation getOriginalXor();
  ShortBinaryLogicalOperation xor(BinaryLogicalCategorySupport binaryLogicalOperation);

  void modifyLeftShift(ShortShiftOperation modifiedLeftShift);
  ShortShiftOperation getOriginalLeftShift();
  ShortShiftOperation leftShift(ShiftCategorySupport shiftOperation);

  void modifyRightShift(ShortShiftOperation modifiedRightShift);
  ShortShiftOperation getOriginalRightShift();
  ShortShiftOperation rightShift(ShiftCategorySupport shiftOperation);

  void modifyUnsignedRightShift(ShortShiftOperation modifiedUnsignedRightShift);
  ShortShiftOperation getOriginalUnsignedRightShift();
  ShortShiftOperation unsignedRightShift(ShiftCategorySupport shiftOperation);

  void modifyPower(ShortBinaryArithmeticOperation modifiedPower);
  ShortBinaryArithmeticOperation getOriginalPower();
  ShortBinaryArithmeticOperation power(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyCompare(ShortIntegerComparison modifiedCompare);
  ShortIntegerComparison getOriginalCompare();
  ShortIntegerComparison compare(IntegerComparisonCategorySupport integerComparison);

  void modifyEquals(ShortBooleanComparison modifiedEquals);
  ShortBooleanComparison getOriginalEquals();
  ShortBooleanComparison equals(BooleanComparisonCategorySupport booleanComparison);

  void modifyNotEquals(ShortBooleanComparison modifiedNotEquals);
  ShortBooleanComparison getOriginalNotEquals();
  ShortBooleanComparison notEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThan(ShortBooleanComparison modifiedLessThan);
  ShortBooleanComparison getOriginalLessThan();
  ShortBooleanComparison lessThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThan(ShortBooleanComparison modifiedGreaterThan);
  ShortBooleanComparison getOriginalGreaterThan();
  ShortBooleanComparison greaterThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThanOrEquals(ShortBooleanComparison modifiedLessThanOrEquals);
  ShortBooleanComparison getOriginalLessThanOrEquals();
  ShortBooleanComparison lessThanOrEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThanOrEquals(ShortBooleanComparison modifiedGreaterThanOrEquals);
  ShortBooleanComparison getOriginalGreaterThanOrEquals();
  ShortBooleanComparison greaterThanOrEquals(BooleanComparisonCategorySupport booleanComparison);
}
