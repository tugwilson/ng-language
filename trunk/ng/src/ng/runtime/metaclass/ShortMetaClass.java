package ng.runtime.metaclass;


public interface ShortMetaClass extends MetaClass {

  void modifyConvert(ShortConversion modifiedConvert);
  ShortConversion getOriginalConvert();
  ShortConversion convert(BaseConversionOperation conversionOperation);

  void modifyAdd(ShortBinaryArithmeticOperation modifiedAdd);
  ShortBinaryArithmeticOperation getOriginalAdd();
  ShortBinaryArithmeticOperation add(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifySubtract(ShortBinaryArithmeticOperation modifiedSubtract);
  ShortBinaryArithmeticOperation getOriginalSubtract();
  ShortBinaryArithmeticOperation subtract(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyMultiply(ShortBinaryArithmeticOperation modifiedMultiply);
  ShortBinaryArithmeticOperation getOriginalMultiply();
  ShortBinaryArithmeticOperation multiply(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyDivide(ShortBinaryArithmeticOperation modifiedDivide);
  ShortBinaryArithmeticOperation getOriginalDivide();
  ShortBinaryArithmeticOperation divide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyModulo(ShortBinaryArithmeticOperation modifiedModulo);
  ShortBinaryArithmeticOperation getOriginalModulo();
  ShortBinaryArithmeticOperation modulo(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyRemainderDivide(ShortBinaryArithmeticOperation modifiedRemainderDivide);
  ShortBinaryArithmeticOperation getOriginalRemainderDivide();
  ShortBinaryArithmeticOperation remainderDivide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyAnd(ShortBinaryLogicalOperation modifiedAnd);
  ShortBinaryLogicalOperation getOriginalAnd();
  ShortBinaryLogicalOperation and(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyOr(ShortBinaryLogicalOperation modifiedOr);
  ShortBinaryLogicalOperation getOriginalOr();
  ShortBinaryLogicalOperation or(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyXor(ShortBinaryLogicalOperation modifiedXor);
  ShortBinaryLogicalOperation getOriginalXor();
  ShortBinaryLogicalOperation xor(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyLeftShift(ShortShiftOperation modifiedLeftShift);
  ShortShiftOperation getOriginalLeftShift();
  ShortShiftOperation leftShift(BaseShiftOperation shiftOperation);

  void modifyRightShift(ShortShiftOperation modifiedRightShift);
  ShortShiftOperation getOriginalRightShift();
  ShortShiftOperation rightShift(BaseShiftOperation shiftOperation);

  void modifyUnsignedRightShift(ShortShiftOperation modifiedUnsignedRightShift);
  ShortShiftOperation getOriginalUnsignedRightShift();
  ShortShiftOperation unsignedRightShift(BaseShiftOperation shiftOperation);

  void modifyPower(ShortBinaryArithmeticOperation modifiedPower);
  ShortBinaryArithmeticOperation getOriginalPower();
  ShortBinaryArithmeticOperation power(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyCompare(ShortIntegerComparison modifiedCompare);
  ShortIntegerComparison getOriginalCompare();
  ShortIntegerComparison compare(BaseIntegerComparison integerComparison);

  void modifyEquals(ShortBooleanComparison modifiedEquals);
  ShortBooleanComparison getOriginalEquals();
  ShortBooleanComparison equals(BaseBooleanComparison booleanComparison);

  void modifyNotEquals(ShortBooleanComparison modifiedNotEquals);
  ShortBooleanComparison getOriginalNotEquals();
  ShortBooleanComparison notEquals(BaseBooleanComparison booleanComparison);

  void modifyLessThan(ShortBooleanComparison modifiedLessThan);
  ShortBooleanComparison getOriginalLessThan();
  ShortBooleanComparison lessThan(BaseBooleanComparison booleanComparison);

  void modifyGreaterThan(ShortBooleanComparison modifiedGreaterThan);
  ShortBooleanComparison getOriginalGreaterThan();
  ShortBooleanComparison greaterThan(BaseBooleanComparison booleanComparison);

  void modifyLessThanOrEquals(ShortBooleanComparison modifiedLessThanOrEquals);
  ShortBooleanComparison getOriginalLessThanOrEquals();
  ShortBooleanComparison lessThanOrEquals(BaseBooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(ShortBooleanComparison modifiedGreaterThanOrEquals);
  ShortBooleanComparison getOriginalGreaterThanOrEquals();
  ShortBooleanComparison greaterThanOrEquals(BaseBooleanComparison booleanComparison);
}
