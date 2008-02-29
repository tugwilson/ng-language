package ng.runtime.metaclass;


public interface ByteMetaClass extends MetaClass {

  void modifyConvert(ByteConversion modifiedConvert);
  ByteConversion getOriginalConvert();
  ByteConversion convert(BaseConversionOperation conversionOperation);

  void modifyAdd(ByteBinaryArithmeticOperation modifiedAdd);
  ByteBinaryArithmeticOperation getOriginalAdd();
  ByteBinaryArithmeticOperation add(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifySubtract(ByteBinaryArithmeticOperation modifiedSubtract);
  ByteBinaryArithmeticOperation getOriginalSubtract();
  ByteBinaryArithmeticOperation subtract(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyMultiply(ByteBinaryArithmeticOperation modifiedMultiply);
  ByteBinaryArithmeticOperation getOriginalMultiply();
  ByteBinaryArithmeticOperation multiply(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyDivide(ByteBinaryArithmeticOperation modifiedDivide);
  ByteBinaryArithmeticOperation getOriginalDivide();
  ByteBinaryArithmeticOperation divide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyModulo(ByteBinaryArithmeticOperation modifiedModulo);
  ByteBinaryArithmeticOperation getOriginalModulo();
  ByteBinaryArithmeticOperation modulo(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyRemainderDivide(ByteBinaryArithmeticOperation modifiedRemainderDivide);
  ByteBinaryArithmeticOperation getOriginalRemainderDivide();
  ByteBinaryArithmeticOperation remainderDivide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyAnd(ByteBinaryLogicalOperation modifiedAnd);
  ByteBinaryLogicalOperation getOriginalAnd();
  ByteBinaryLogicalOperation and(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyOr(ByteBinaryLogicalOperation modifiedOr);
  ByteBinaryLogicalOperation getOriginalOr();
  ByteBinaryLogicalOperation or(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyXor(ByteBinaryLogicalOperation modifiedXor);
  ByteBinaryLogicalOperation getOriginalXor();
  ByteBinaryLogicalOperation xor(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyLeftShift(ByteShiftOperation modifiedLeftShift);
  ByteShiftOperation getOriginalLeftShift();
  ByteShiftOperation leftShift(BaseShiftOperation shiftOperation);

  void modifyRightShift(ByteShiftOperation modifiedRightShift);
  ByteShiftOperation getOriginalRightShift();
  ByteShiftOperation rightShift(BaseShiftOperation shiftOperation);

  void modifyUnsignedRightShift(ByteShiftOperation modifiedUnsignedRightShift);
  ByteShiftOperation getOriginalUnsignedRightShift();
  ByteShiftOperation unsignedRightShift(BaseShiftOperation shiftOperation);

  void modifyPower(ByteBinaryArithmeticOperation modifiedPower);
  ByteBinaryArithmeticOperation getOriginalPower();
  ByteBinaryArithmeticOperation power(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyCompare(ByteIntegerComparison modifiedCompare);
  ByteIntegerComparison getOriginalCompare();
  ByteIntegerComparison compare(BaseIntegerComparison integerComparison);

  void modifyEquals(ByteBooleanComparison modifiedEquals);
  ByteBooleanComparison getOriginalEquals();
  ByteBooleanComparison equals(BaseBooleanComparison booleanComparison);

  void modifyNotEquals(ByteBooleanComparison modifiedNotEquals);
  ByteBooleanComparison getOriginalNotEquals();
  ByteBooleanComparison notEquals(BaseBooleanComparison booleanComparison);

  void modifyLessThan(ByteBooleanComparison modifiedLessThan);
  ByteBooleanComparison getOriginalLessThan();
  ByteBooleanComparison lessThan(BaseBooleanComparison booleanComparison);

  void modifyGreaterThan(ByteBooleanComparison modifiedGreaterThan);
  ByteBooleanComparison getOriginalGreaterThan();
  ByteBooleanComparison greaterThan(BaseBooleanComparison booleanComparison);

  void modifyLessThanOrEquals(ByteBooleanComparison modifiedLessThanOrEquals);
  ByteBooleanComparison getOriginalLessThanOrEquals();
  ByteBooleanComparison lessThanOrEquals(BaseBooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(ByteBooleanComparison modifiedGreaterThanOrEquals);
  ByteBooleanComparison getOriginalGreaterThanOrEquals();
  ByteBooleanComparison greaterThanOrEquals(BaseBooleanComparison booleanComparison);
}
