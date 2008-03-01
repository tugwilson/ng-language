package ng.runtime.metaclass;

import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;

public interface MetaClass {
  Class getTheClass();

  MetaClass createMetaClassFor(Class<?> type);

  Misc misc();

  DoStaticMethodCall staticMethodCall(BaseStaticMethodCall doStaticMethodCall);

  void modifyConvert(Conversion modifiedConvert);
  Conversion getOriginalConvert();
  Conversion convert(BaseConversionOperation conversionOperation);

  void modifyAdd(BinaryOperation modifiedAdd);
  BinaryOperation getOriginalAdd();
  BinaryOperation add(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifySubtract(BinaryOperation modifiedSubtract);
  BinaryOperation getOriginalSubtract();
  BinaryOperation subtract(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyMultiply(BinaryOperation modifiedMultiply);
  BinaryOperation getOriginalMultiply();
  BinaryOperation multiply(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyDivide(BinaryOperation modifiedDivide);
  BinaryOperation getOriginalDivide();
  BinaryOperation divide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyModulo(BinaryOperation modifiedModulo);
  BinaryOperation getOriginalModulo();
  BinaryOperation modulo(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyRemainderDivide(BinaryOperation modifiedRemainderDivide);
  BinaryOperation getOriginalRemainderDivide();
  BinaryOperation remainderDivide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyPower(BinaryOperation modifiedPower);
  BinaryOperation getOriginalPower();
  BinaryOperation power(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyAnd(LogicalBinaryOperation modifiedAnd);
  LogicalBinaryOperation getOriginalAnd();
  BinaryOperation and(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyOr(LogicalBinaryOperation modifiedOr);
  LogicalBinaryOperation getOriginalOr();
  LogicalBinaryOperation or(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyXor(LogicalBinaryOperation modifiedXor);
  LogicalBinaryOperation getOriginalXor();
  LogicalBinaryOperation xor(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyLeftShift(ShiftOperation modifiedLeftShift);
  BinaryOperation getOriginalLeftShift();
  BinaryOperation leftShift(BaseShiftOperation shiftOperation);

  void modifyRightShift(ShiftOperation modifiedRightShift);
  BinaryOperation getOriginalRightShift();
  BinaryOperation rightShift(BaseShiftOperation shiftOperation);

  void modifyUnsignedRightShift(ShiftOperation modifiedUnsignedRightShift);
  BinaryOperation getOriginalUnsignedRightShift();
  BinaryOperation unsignedRightShift(BaseShiftOperation shiftOperation);

  void modifyCompare(IntBinaryComparison modifiedCompare);
  IntBinaryComparison getOriginalCompare();
  IntBinaryComparison compare(BaseIntegerComparison integerComparison);

  void modifyEquals(BooleanBinaryComparison modifiedEquals);
  BooleanBinaryComparison getOriginalEquals();
  BooleanBinaryComparison equals(BaseBooleanComparison booleanComparison);

  void modifyNotEquals(BooleanBinaryComparison modifiedNotEquals);
  BooleanBinaryComparison getOriginalNotEquals();
  BooleanBinaryComparison notEquals(BaseBooleanComparison booleanComparison);

  void modifyLessThan(BooleanBinaryComparison modifiedLessThan);
  BooleanBinaryComparison getOriginalLessThan();
  BooleanBinaryComparison lessThan(BaseBooleanComparison booleanComparison);

  void modifyGreaterThan(BooleanBinaryComparison modifiedGreaterThan);
  BooleanBinaryComparison getOriginalGreaterThan();
  BooleanBinaryComparison greaterThan(BaseBooleanComparison booleanComparison);

  void modifyLessThanOrEquals(BooleanBinaryComparison modifiedLessThanOrEquals);
  BooleanBinaryComparison getOriginalLessThanOrEquals();
  BooleanBinaryComparison lessThanOrEquals(BaseBooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(BooleanBinaryComparison modifiedGreaterThanOrEquals);
  BooleanBinaryComparison getOriginalGreaterThanOrEquals();
  BooleanBinaryComparison greaterThanOrEquals(BaseBooleanComparison booleanComparison);
}
