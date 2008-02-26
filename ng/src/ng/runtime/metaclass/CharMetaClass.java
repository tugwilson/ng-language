package ng.runtime.metaclass;


public interface CharMetaClass extends MetaClass {

  void modifyConvert(CharConversion modifiedConvert);
  CharConversion getOriginalConvert();
  CharConversion convert(BaseConversionOperation conversionOperation);

  void modifyAdd(CharBinaryArithmeticOperation modifiedAdd);
  CharBinaryArithmeticOperation getOriginalAdd();
  CharBinaryArithmeticOperation add(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(CharBinaryArithmeticOperation modifiedSubtract);
  CharBinaryArithmeticOperation getOriginalSubtract();
  CharBinaryArithmeticOperation subtract(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(CharBinaryArithmeticOperation modifiedMultiply);
  CharBinaryArithmeticOperation getOriginalMultiply();
  CharBinaryArithmeticOperation multiply(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(CharBinaryArithmeticOperation modifiedDivide);
  CharBinaryArithmeticOperation getOriginalDivide();
  CharBinaryArithmeticOperation divide(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(CharBinaryArithmeticOperation modifiedModulo);
  CharBinaryArithmeticOperation getOriginalModulo();
  CharBinaryArithmeticOperation modulo(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(CharBinaryArithmeticOperation modifiedRemainderDivide);
  CharBinaryArithmeticOperation getOriginalRemainderDivide();
  CharBinaryArithmeticOperation remainderDivide(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(CharBinaryArithmeticOperation modifiedPower);
  CharBinaryArithmeticOperation getOriginalPower();
  CharBinaryArithmeticOperation power(BaseBinaryArithmeticOperation binaryArithmeticOperation);

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
