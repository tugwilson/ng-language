package ng.runtime.metaclass;

import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;

public interface MetaClass {
  Class getTheClass();

  MetaClass createMetaClassFor(Class<?> type);

  Misc misc();

  DoStaticMethodCall staticMethodCall(StaticMethodCallCategorySupport doStaticMethodCall);

  void modifyConvert(Conversion modifiedConvert);
  Conversion getOriginalConvert();
  Conversion convert(ConversionOperationCategorySupport conversionOperation);

  void modifyAdd(BinaryOperation modifiedAdd);
  BinaryOperation getOriginalAdd();
  BinaryOperation add(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifySubtract(BinaryOperation modifiedSubtract);
  BinaryOperation getOriginalSubtract();
  BinaryOperation subtract(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyMultiply(BinaryOperation modifiedMultiply);
  BinaryOperation getOriginalMultiply();
  BinaryOperation multiply(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyDivide(BinaryOperation modifiedDivide);
  BinaryOperation getOriginalDivide();
  BinaryOperation divide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyModulo(BinaryOperation modifiedModulo);
  BinaryOperation getOriginalModulo();
  BinaryOperation modulo(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyRemainderDivide(BinaryOperation modifiedRemainderDivide);
  BinaryOperation getOriginalRemainderDivide();
  BinaryOperation remainderDivide(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyPower(BinaryOperation modifiedPower);
  BinaryOperation getOriginalPower();
  BinaryOperation power(BinaryArithmeticCategorySupport binaryArithmeticOperation);

  void modifyAnd(LogicalBinaryOperation modifiedAnd);
  LogicalBinaryOperation getOriginalAnd();
  BinaryOperation and(BinaryLogicalCategorySupport binaryLogicalOperation);

  void modifyOr(LogicalBinaryOperation modifiedOr);
  LogicalBinaryOperation getOriginalOr();
  LogicalBinaryOperation or(BinaryLogicalCategorySupport binaryLogicalOperation);

  void modifyXor(LogicalBinaryOperation modifiedXor);
  LogicalBinaryOperation getOriginalXor();
  LogicalBinaryOperation xor(BinaryLogicalCategorySupport binaryLogicalOperation);

  void modifyLeftShift(ShiftOperation modifiedLeftShift);
  BinaryOperation getOriginalLeftShift();
  BinaryOperation leftShift(ShiftCategorySupport shiftOperation);

  void modifyRightShift(ShiftOperation modifiedRightShift);
  BinaryOperation getOriginalRightShift();
  BinaryOperation rightShift(ShiftCategorySupport shiftOperation);

  void modifyUnsignedRightShift(ShiftOperation modifiedUnsignedRightShift);
  BinaryOperation getOriginalUnsignedRightShift();
  BinaryOperation unsignedRightShift(ShiftCategorySupport shiftOperation);

  void modifyCompare(IntBinaryComparison modifiedCompare);
  IntBinaryComparison getOriginalCompare();
  IntBinaryComparison compare(IntegerComparisonCategorySupport integerComparison);

  void modifyEquals(BooleanBinaryComparison modifiedEquals);
  BooleanBinaryComparison getOriginalEquals();
  BooleanBinaryComparison equals(BooleanComparisonCategorySupport booleanComparison);

  void modifyNotEquals(BooleanBinaryComparison modifiedNotEquals);
  BooleanBinaryComparison getOriginalNotEquals();
  BooleanBinaryComparison notEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThan(BooleanBinaryComparison modifiedLessThan);
  BooleanBinaryComparison getOriginalLessThan();
  BooleanBinaryComparison lessThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThan(BooleanBinaryComparison modifiedGreaterThan);
  BooleanBinaryComparison getOriginalGreaterThan();
  BooleanBinaryComparison greaterThan(BooleanComparisonCategorySupport booleanComparison);

  void modifyLessThanOrEquals(BooleanBinaryComparison modifiedLessThanOrEquals);
  BooleanBinaryComparison getOriginalLessThanOrEquals();
  BooleanBinaryComparison lessThanOrEquals(BooleanComparisonCategorySupport booleanComparison);

  void modifyGreaterThanOrEquals(BooleanBinaryComparison modifiedGreaterThanOrEquals);
  BooleanBinaryComparison getOriginalGreaterThanOrEquals();
  BooleanBinaryComparison greaterThanOrEquals(BooleanComparisonCategorySupport booleanComparison);
}
