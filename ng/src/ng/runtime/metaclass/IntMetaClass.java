package ng.runtime.metaclass;



public interface IntMetaClass extends MetaClass {

  void modifyConvert(IntConversion modifiedConvert);
  IntConversion getOriginalConvert();
  IntConversion convert(BaseConversionOperation conversionOperation);

  void modifyAdd(IntBinaryArithmeticOperation modifiedAdd);
  IntBinaryArithmeticOperation getOriginalAdd();
  IntBinaryArithmeticOperation add(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifySubtract(IntBinaryArithmeticOperation modifiedSubtract);
  IntBinaryArithmeticOperation getOriginalSubtract();
  IntBinaryArithmeticOperation subtract(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyMultiply(IntBinaryArithmeticOperation modifiedMultiply);
  IntBinaryArithmeticOperation getOriginalMultiply();
  IntBinaryArithmeticOperation multiply(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyDivide(IntBinaryArithmeticOperation modifiedDivide);
  IntBinaryArithmeticOperation getOriginalDivide();
  IntBinaryArithmeticOperation divide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyModulo(IntBinaryArithmeticOperation modifiedModulo);
  IntBinaryArithmeticOperation getOriginalModulo();
  IntBinaryArithmeticOperation modulo(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyRemainderDivide(IntBinaryArithmeticOperation modifiedRemainderDivide);
  IntBinaryArithmeticOperation getOriginalRemainderDivide();
  IntBinaryArithmeticOperation remainderDivide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyPower(IntBinaryArithmeticOperation modifiedPower);
  IntBinaryArithmeticOperation getOriginalPower();
  IntBinaryArithmeticOperation power(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyAnd(IntBinaryLogicalOperation modifiedAnd);
  IntBinaryLogicalOperation getOriginalAnd();
  IntBinaryLogicalOperation and(BaseLogicalBinaryOperation binaryArithmeticOperation);

  void modifyOr(IntBinaryLogicalOperation modifiedOr);
  IntBinaryLogicalOperation getOriginalOr();
  IntBinaryLogicalOperation or(BaseLogicalBinaryOperation binaryArithmeticOperation);

  void modifyXor(IntBinaryLogicalOperation modifiedXor);
  IntBinaryLogicalOperation getOriginalXor();
  IntBinaryLogicalOperation xor(BaseLogicalBinaryOperation binaryArithmeticOperation);

  void modifyLeftShift(IntShiftOperation modifiedLeftShift);
  IntShiftOperation getOriginalLeftShift();
  IntShiftOperation leftShift(BaseShiftOperation binaryArithmeticOperation);

  void modifyRightShift(IntShiftOperation modifiedRightShift);
  IntShiftOperation getOriginalRightShift();
  IntShiftOperation rightShift(BaseShiftOperation binaryArithmeticOperation);

  void modifyUnsignedRightShift(IntShiftOperation modifiedUnsignedRightShift);
  IntShiftOperation getOriginalUnsignedRightShift();
  IntShiftOperation unsignedRightShift(BaseShiftOperation binaryArithmeticOperation);

  void modifyCompare(IntIntegerComparison modifiedCompare);
  IntIntegerComparison getOriginalCompare();
  IntIntegerComparison compare(BaseIntegerComparison integerComparison);

  void modifyEquals(IntBooleanComparison modifiedEquals);
  IntBooleanComparison getOriginalEquals();
  IntBooleanComparison equals(BaseBooleanComparison booleanComparison);

  void modifyNotEquals(IntBooleanComparison modifiedNotEquals);
  IntBooleanComparison getOriginalNotEquals();
  IntBooleanComparison notEquals(BaseBooleanComparison booleanComparison);

  void modifyLessThan(IntBooleanComparison modifiedLessThan);
  IntBooleanComparison getOriginalLessThan();
  IntBooleanComparison lessThan(BaseBooleanComparison booleanComparison);

  void modifyGreaterThan(IntBooleanComparison modifiedGreaterThan);
  IntBooleanComparison getOriginalGreaterThan();
  IntBooleanComparison greaterThan(BaseBooleanComparison booleanComparison);

  void modifyLessThanOrEquals(IntBooleanComparison modifiedLessThanOrEquals);
  IntBooleanComparison getOriginalLessThanOrEquals();
  IntBooleanComparison lessThanOrEquals(BaseBooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(IntBooleanComparison modifiedGreaterThanOrEquals);
  IntBooleanComparison getOriginalGreaterThanOrEquals();
  IntBooleanComparison greaterThanOrEquals(BaseBooleanComparison booleanComparison);
}
