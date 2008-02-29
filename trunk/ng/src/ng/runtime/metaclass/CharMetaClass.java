package ng.runtime.metaclass;


public interface CharMetaClass extends MetaClass {

  void modifyConvert(CharConversion modifiedConvert);
  CharConversion getOriginalConvert();
  CharConversion convert(BaseConversionOperation conversionOperation);

  void modifyAdd(CharBinaryArithmeticOperation modifiedAdd);
  CharBinaryArithmeticOperation getOriginalAdd();
  CharBinaryArithmeticOperation add(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifySubtract(CharBinaryArithmeticOperation modifiedSubtract);
  CharBinaryArithmeticOperation getOriginalSubtract();
  CharBinaryArithmeticOperation subtract(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyMultiply(CharBinaryArithmeticOperation modifiedMultiply);
  CharBinaryArithmeticOperation getOriginalMultiply();
  CharBinaryArithmeticOperation multiply(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyDivide(CharBinaryArithmeticOperation modifiedDivide);
  CharBinaryArithmeticOperation getOriginalDivide();
  CharBinaryArithmeticOperation divide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyModulo(CharBinaryArithmeticOperation modifiedModulo);
  CharBinaryArithmeticOperation getOriginalModulo();
  CharBinaryArithmeticOperation modulo(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyRemainderDivide(CharBinaryArithmeticOperation modifiedRemainderDivide);
  CharBinaryArithmeticOperation getOriginalRemainderDivide();
  CharBinaryArithmeticOperation remainderDivide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyPower(CharBinaryArithmeticOperation modifiedPower);
  CharBinaryArithmeticOperation getOriginalPower();
  CharBinaryArithmeticOperation power(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyAnd(CharBinaryLogicalOperation modifiedAnd);
  CharBinaryLogicalOperation getOriginalAnd();
  CharBinaryLogicalOperation and(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyOr(CharBinaryLogicalOperation modifiedOr);
  CharBinaryLogicalOperation getOriginalOr();
  CharBinaryLogicalOperation or(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyXor(CharBinaryLogicalOperation modifiedXor);
  CharBinaryLogicalOperation getOriginalXor();
  CharBinaryLogicalOperation xor(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyLeftShift(CharShiftOperation modifiedLeftShift);
  CharShiftOperation getOriginalLeftShift();
  CharShiftOperation leftShift(BaseShiftOperation shiftOperation);

  void modifyRightShift(CharShiftOperation modifiedRightShift);
  CharShiftOperation getOriginalRightShift();
  CharShiftOperation rightShift(BaseShiftOperation shiftOperation);

  void modifyUnsignedRightShift(CharShiftOperation modifiedUnsignedRightShift);
  CharShiftOperation getOriginalUnsignedRightShift();
  CharShiftOperation unsignedRightShift(BaseShiftOperation shiftOperation);

  void modifyCompare(CharIntegerComparison modifiedCompare);
  CharIntegerComparison getOriginalCompare();
  CharIntegerComparison compare(BaseIntegerComparison integerComparison);

  void modifyEquals(CharBooleanComparison modifiedEquals);
  CharBooleanComparison getOriginalEquals();
  CharBooleanComparison equals(BaseBooleanComparison booleanComparison);

  void modifyNotEquals(CharBooleanComparison modifiedNotEquals);
  CharBooleanComparison getOriginalNotEquals();
  CharBooleanComparison notEquals(BaseBooleanComparison booleanComparison);

  void modifyLessThan(CharBooleanComparison modifiedLessThan);
  CharBooleanComparison getOriginalLessThan();
  CharBooleanComparison lessThan(BaseBooleanComparison booleanComparison);

  void modifyGreaterThan(CharBooleanComparison modifiedGreaterThan);
  CharBooleanComparison getOriginalGreaterThan();
  CharBooleanComparison greaterThan(BaseBooleanComparison booleanComparison);

  void modifyLessThanOrEquals(CharBooleanComparison modifiedLessThanOrEquals);
  CharBooleanComparison getOriginalLessThanOrEquals();
  CharBooleanComparison lessThanOrEquals(BaseBooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(CharBooleanComparison modifiedGreaterThanOrEquals);
  CharBooleanComparison getOriginalGreaterThanOrEquals();
  CharBooleanComparison greaterThanOrEquals(BaseBooleanComparison booleanComparison);
}
