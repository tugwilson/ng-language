package ng.runtime.metaclass.primitives.longimpl;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BinaryArithmeticCategorySupport;
import ng.runtime.threadcontext.BinaryLogicalCategorySupport;
import ng.runtime.threadcontext.BooleanComparisonCategorySupport;
import ng.runtime.threadcontext.ConversionOperationCategorySupport;
import ng.runtime.threadcontext.IntegerComparisonCategorySupport;
import ng.runtime.threadcontext.ShiftCategorySupport;


public interface LongMetaClass extends MetaClass {

  void modifyConvert(LongConversion modifiedConvert);
  LongConversion getOriginalConvert();
  LongConversion convert(ConversionOperationCategorySupport conversionOperation);

  void modifyAdd(LongBinaryArithmeticOperation modifiedAdd);
  LongBinaryArithmeticOperation getOriginalAdd();
  LongBinaryArithmeticOperation add(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifySubtract(LongBinaryArithmeticOperation modifiedSubtract);
  LongBinaryArithmeticOperation getOriginalSubtract();
  LongBinaryArithmeticOperation subtract(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyMultiply(LongBinaryArithmeticOperation modifiedMultiply);
  LongBinaryArithmeticOperation getOriginalMultiply();
  LongBinaryArithmeticOperation multiply(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyDivide(LongBinaryArithmeticOperation modifiedDivide);
  LongBinaryArithmeticOperation getOriginalDivide();
  LongBinaryArithmeticOperation divide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyModulo(LongBinaryArithmeticOperation modifiedModulo);
  LongBinaryArithmeticOperation getOriginalModulo();
  LongBinaryArithmeticOperation modulo(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyRemainderDivide(LongBinaryArithmeticOperation modifiedRemainderDivide);
  LongBinaryArithmeticOperation getOriginalRemainderDivide();
  LongBinaryArithmeticOperation remainderDivide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyPower(LongBinaryArithmeticOperation modifiedPower);
  LongBinaryArithmeticOperation getOriginalPower();
  LongBinaryArithmeticOperation power(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyAnd(LongBinaryLogicalOperation modifiedAnd);
  LongBinaryLogicalOperation getOriginalAnd();
  LongBinaryLogicalOperation and(BinaryLogicalCategorySupport binaryLogicalOperation);

  void modifyOr(LongBinaryLogicalOperation modifiedOr);
  LongBinaryLogicalOperation getOriginalOr();
  LongBinaryLogicalOperation or(BinaryLogicalCategorySupport binaryLogicalOperation);

  void modifyXor(LongBinaryLogicalOperation modifiedXor);
  LongBinaryLogicalOperation getOriginalXor();
  LongBinaryLogicalOperation xor(BinaryLogicalCategorySupport binaryLogicalOperation);

  void modifyLeftShift(LongShiftOperation modifiedLeftShift);
  LongShiftOperation getOriginalLeftShift();
  LongShiftOperation leftShift(ShiftCategorySupport shiftOperation);

  void modifyRightShift(LongShiftOperation modifiedRightShift);
  LongShiftOperation getOriginalRightShift();
  LongShiftOperation rightShift(ShiftCategorySupport shiftOperation);

  void modifyUnsignedRightShift(LongShiftOperation modifiedUnsignedRightShift);
  LongShiftOperation getOriginalUnsignedRightShift();
  LongShiftOperation unsignedRightShift(ShiftCategorySupport shiftOperation);

  void modifyCompare(LongIntegerComparison modifiedCompare);
  LongIntegerComparison getOriginalCompare();
  LongIntegerComparison compare(IntegerComparisonCategorySupport integerComparison);

  void modifyEquals(LongBooleanComparison modifiedEquals);
  LongBooleanComparison getOriginalEquals();
  LongBooleanComparison equals(BooleanComparisonCategorySupport booleanComparison);

  void modifyNotEquals(LongBooleanComparison modifiedNotEquals);
  LongBooleanComparison getOriginalNotEquals();
  LongBooleanComparison notEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThan(LongBooleanComparison modifiedLessThan);
  LongBooleanComparison getOriginalLessThan();
  LongBooleanComparison lessThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThan(LongBooleanComparison modifiedGreaterThan);
  LongBooleanComparison getOriginalGreaterThan();
  LongBooleanComparison greaterThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThanOrEquals(LongBooleanComparison modifiedLessThanOrEquals);
  LongBooleanComparison getOriginalLessThanOrEquals();
  LongBooleanComparison lessThanOrEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThanOrEquals(LongBooleanComparison modifiedGreaterThanOrEquals);
  LongBooleanComparison getOriginalGreaterThanOrEquals();
  LongBooleanComparison greaterThanOrEquals(BooleanComparisonCategorySupport booleanComparison);
}
