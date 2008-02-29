package ng.runtime.metaclass.primitives.biginteger;

import ng.runtime.metaclass.BaseArithmeticBinaryOperation;
import ng.runtime.metaclass.BaseBooleanComparison;
import ng.runtime.metaclass.BaseConversionOperation;
import ng.runtime.metaclass.BaseIntegerComparison;
import ng.runtime.metaclass.BaseLogicalBinaryOperation;
import ng.runtime.metaclass.BaseShiftOperation;
import ng.runtime.metaclass.MetaClass;


public interface BigIntegerMetaClass extends MetaClass {

  void modifyConvert(BigIntegerConversion modifiedConvert);
  BigIntegerConversion getOriginalConvert();
  BigIntegerConversion convert(BaseConversionOperation conversionOperation);

  void modifyAdd(BigIntegerBinaryArithmeticOperation modifiedAdd);
  BigIntegerBinaryArithmeticOperation getOriginalAdd();
  BigIntegerBinaryArithmeticOperation add(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifySubtract(BigIntegerBinaryArithmeticOperation modifiedSubtract);
  BigIntegerBinaryArithmeticOperation getOriginalSubtract();
  BigIntegerBinaryArithmeticOperation subtract(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyMultiply(BigIntegerBinaryArithmeticOperation modifiedMultiply);
  BigIntegerBinaryArithmeticOperation getOriginalMultiply();
  BigIntegerBinaryArithmeticOperation multiply(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyDivide(BigIntegerBinaryArithmeticOperation modifiedDivide);
  BigIntegerBinaryArithmeticOperation getOriginalDivide();
  BigIntegerBinaryArithmeticOperation divide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyModulo(BigIntegerBinaryArithmeticOperation modifiedModulo);
  BigIntegerBinaryArithmeticOperation getOriginalModulo();
  BigIntegerBinaryArithmeticOperation modulo(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyRemainderDivide(BigIntegerBinaryArithmeticOperation modifiedRemainderDivide);
  BigIntegerBinaryArithmeticOperation getOriginalRemainderDivide();
  BigIntegerBinaryArithmeticOperation remainderDivide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyPower(BigIntegerBinaryArithmeticOperation modifiedPower);
  BigIntegerBinaryArithmeticOperation getOriginalPower();
  BigIntegerBinaryArithmeticOperation power(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyAnd(BigIntegerBinaryLogicalOperation modifiedAnd);
  BigIntegerBinaryLogicalOperation getOriginalAnd();
  BigIntegerBinaryLogicalOperation and(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyOr(BigIntegerBinaryLogicalOperation modifiedOr);
  BigIntegerBinaryLogicalOperation getOriginalOr();
  BigIntegerBinaryLogicalOperation or(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyXor(BigIntegerBinaryLogicalOperation modifiedXor);
  BigIntegerBinaryLogicalOperation getOriginalXor();
  BigIntegerBinaryLogicalOperation xor(BaseLogicalBinaryOperation binaryLogicalOperation);

  void modifyLeftShift(BigIntegerShiftOperation modifiedLeftShift);
  BigIntegerShiftOperation getOriginalLeftShift();
  BigIntegerShiftOperation leftShift(BaseShiftOperation shiftOperation);

  void modifyRightShift(BigIntegerShiftOperation modifiedRightShift);
  BigIntegerShiftOperation getOriginalRightShift();
  BigIntegerShiftOperation rightShift(BaseShiftOperation shiftOperation);

  void modifyUnsignedRightShift(BigIntegerShiftOperation modifiedUnsignedRightShift);
  BigIntegerShiftOperation getOriginalUnsignedRightShift();
  BigIntegerShiftOperation unsignedRightShift(BaseShiftOperation shiftOperation);

  void modifyCompare(BigIntegerIntegerComparison modifiedCompare);
  BigIntegerIntegerComparison getOriginalCompare();
  BigIntegerIntegerComparison compare(BaseIntegerComparison integerComparison);

  void modifyEquals(BigIntegerBooleanComparison modifiedEquals);
  BigIntegerBooleanComparison getOriginalEquals();
  BigIntegerBooleanComparison equals(BaseBooleanComparison booleanComparison);

  void modifyNotEquals(BigIntegerBooleanComparison modifiedNotEquals);
  BigIntegerBooleanComparison getOriginalNotEquals();
  BigIntegerBooleanComparison notEquals(BaseBooleanComparison booleanComparison);

  void modifyLessThan(BigIntegerBooleanComparison modifiedLessThan);
  BigIntegerBooleanComparison getOriginalLessThan();
  BigIntegerBooleanComparison lessThan(BaseBooleanComparison booleanComparison);

  void modifyGreaterThan(BigIntegerBooleanComparison modifiedGreaterThan);
  BigIntegerBooleanComparison getOriginalGreaterThan();
  BigIntegerBooleanComparison greaterThan(BaseBooleanComparison booleanComparison);

  void modifyLessThanOrEquals(BigIntegerBooleanComparison modifiedLessThanOrEquals);
  BigIntegerBooleanComparison getOriginalLessThanOrEquals();
  BigIntegerBooleanComparison lessThanOrEquals(BaseBooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(BigIntegerBooleanComparison modifiedGreaterThanOrEquals);
  BigIntegerBooleanComparison getOriginalGreaterThanOrEquals();
  BigIntegerBooleanComparison greaterThanOrEquals(BaseBooleanComparison booleanComparison);
}
