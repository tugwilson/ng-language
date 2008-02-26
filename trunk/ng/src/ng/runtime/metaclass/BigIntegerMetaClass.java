package ng.runtime.metaclass;


public interface BigIntegerMetaClass extends MetaClass {

  void modifyConvert(BigIntegerConversion modifiedConvert);
  BigIntegerConversion getOriginalConvert();
  BigIntegerConversion convert(BaseConversionOperation conversionOperation);

  void modifyAdd(BigIntegerBinaryArithmeticOperation modifiedAdd);
  BigIntegerBinaryArithmeticOperation getOriginalAdd();
  BigIntegerBinaryArithmeticOperation add(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(BigIntegerBinaryArithmeticOperation modifiedSubtract);
  BigIntegerBinaryArithmeticOperation getOriginalSubtract();
  BigIntegerBinaryArithmeticOperation subtract(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(BigIntegerBinaryArithmeticOperation modifiedMultiply);
  BigIntegerBinaryArithmeticOperation getOriginalMultiply();
  BigIntegerBinaryArithmeticOperation multiply(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(BigIntegerBinaryArithmeticOperation modifiedDivide);
  BigIntegerBinaryArithmeticOperation getOriginalDivide();
  BigIntegerBinaryArithmeticOperation divide(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(BigIntegerBinaryArithmeticOperation modifiedModulo);
  BigIntegerBinaryArithmeticOperation getOriginalModulo();
  BigIntegerBinaryArithmeticOperation modulo(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(BigIntegerBinaryArithmeticOperation modifiedRemainderDivide);
  BigIntegerBinaryArithmeticOperation getOriginalRemainderDivide();
  BigIntegerBinaryArithmeticOperation remainderDivide(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(BigIntegerBinaryArithmeticOperation modifiedPower);
  BigIntegerBinaryArithmeticOperation getOriginalPower();
  BigIntegerBinaryArithmeticOperation power(BaseBinaryArithmeticOperation binaryArithmeticOperation);

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
