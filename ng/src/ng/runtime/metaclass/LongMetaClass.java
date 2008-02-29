package ng.runtime.metaclass;


public interface LongMetaClass extends MetaClass {

  void modifyConvert(LongConversion modifiedConvert);
  LongConversion getOriginalConvert();
  LongConversion convert(BaseConversionOperation conversionOperation);

  void modifyAdd(LongBinaryArithmeticOperation modifiedAdd);
  LongBinaryArithmeticOperation getOriginalAdd();
  LongBinaryArithmeticOperation add(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifySubtract(LongBinaryArithmeticOperation modifiedSubtract);
  LongBinaryArithmeticOperation getOriginalSubtract();
  LongBinaryArithmeticOperation subtract(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyMultiply(LongBinaryArithmeticOperation modifiedMultiply);
  LongBinaryArithmeticOperation getOriginalMultiply();
  LongBinaryArithmeticOperation multiply(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyDivide(LongBinaryArithmeticOperation modifiedDivide);
  LongBinaryArithmeticOperation getOriginalDivide();
  LongBinaryArithmeticOperation divide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyModulo(LongBinaryArithmeticOperation modifiedModulo);
  LongBinaryArithmeticOperation getOriginalModulo();
  LongBinaryArithmeticOperation modulo(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyRemainderDivide(LongBinaryArithmeticOperation modifiedRemainderDivide);
  LongBinaryArithmeticOperation getOriginalRemainderDivide();
  LongBinaryArithmeticOperation remainderDivide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyPower(LongBinaryArithmeticOperation modifiedPower);
  LongBinaryArithmeticOperation getOriginalPower();
  LongBinaryArithmeticOperation power(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyAnd(LongBinaryLogicalOperation modifiedAnd);
  LongBinaryLogicalOperation getOriginalAnd();
  LongBinaryLogicalOperation and(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyOr(LongBinaryLogicalOperation modifiedOr);
  LongBinaryLogicalOperation getOriginalOr();
  LongBinaryLogicalOperation or(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyXor(LongBinaryLogicalOperation modifiedXor);
  LongBinaryLogicalOperation getOriginalXor();
  LongBinaryLogicalOperation xor(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyLeftShift(LongShiftOperation modifiedLeftShift);
  LongShiftOperation getOriginalLeftShift();
  LongShiftOperation leftShift(BaseShiftOperation shiftOperation);

  void modifyRightShift(LongShiftOperation modifiedRightShift);
  LongShiftOperation getOriginalRightShift();
  LongShiftOperation rightShift(BaseShiftOperation shiftOperation);

  void modifyUnsignedRightShift(LongShiftOperation modifiedUnsignedRightShift);
  LongShiftOperation getOriginalUnsignedRightShift();
  LongShiftOperation unsignedRightShift(BaseShiftOperation shiftOperation);

  void modifyCompare(LongIntegerComparison modifiedCompare);
  LongIntegerComparison getOriginalCompare();
  LongIntegerComparison compare(BaseIntegerComparison integerComparison);

  void modifyEquals(LongBooleanComparison modifiedEquals);
  LongBooleanComparison getOriginalEquals();
  LongBooleanComparison equals(BaseBooleanComparison booleanComparison);

  void modifyNotEquals(LongBooleanComparison modifiedNotEquals);
  LongBooleanComparison getOriginalNotEquals();
  LongBooleanComparison notEquals(BaseBooleanComparison booleanComparison);

  void modifyLessThan(LongBooleanComparison modifiedLessThan);
  LongBooleanComparison getOriginalLessThan();
  LongBooleanComparison lessThan(BaseBooleanComparison booleanComparison);

  void modifyGreaterThan(LongBooleanComparison modifiedGreaterThan);
  LongBooleanComparison getOriginalGreaterThan();
  LongBooleanComparison greaterThan(BaseBooleanComparison booleanComparison);

  void modifyLessThanOrEquals(LongBooleanComparison modifiedLessThanOrEquals);
  LongBooleanComparison getOriginalLessThanOrEquals();
  LongBooleanComparison lessThanOrEquals(BaseBooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(LongBooleanComparison modifiedGreaterThanOrEquals);
  LongBooleanComparison getOriginalGreaterThanOrEquals();
  LongBooleanComparison greaterThanOrEquals(BaseBooleanComparison booleanComparison);
}
