package ng.runtime.metaclass;


public interface BigDecimalMetaClass extends MetaClass {

  void modifyConvert(BigDecimalConversion modifiedConvert);
  BigDecimalConversion getOriginalConvert();
  BigDecimalConversion convert(BaseConversionOperation conversionOperation);

  void modifyAdd(BigDecimalBinaryArithmeticOperation modifiedAdd);
  BigDecimalBinaryArithmeticOperation getOriginalAdd();
  BigDecimalBinaryArithmeticOperation add(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(BigDecimalBinaryArithmeticOperation modifiedSubtract);
  BigDecimalBinaryArithmeticOperation getOriginalSubtract();
  BigDecimalBinaryArithmeticOperation subtract(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(BigDecimalBinaryArithmeticOperation modifiedMultiply);
  BigDecimalBinaryArithmeticOperation getOriginalMultiply();
  BigDecimalBinaryArithmeticOperation multiply(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(BigDecimalBinaryArithmeticOperation modifiedDivide);
  BigDecimalBinaryArithmeticOperation getOriginalDivide();
  BigDecimalBinaryArithmeticOperation divide(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(BigDecimalBinaryArithmeticOperation modifiedModulo);
  BigDecimalBinaryArithmeticOperation getOriginalModulo();
  BigDecimalBinaryArithmeticOperation modulo(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(BigDecimalBinaryArithmeticOperation modifiedRemainderDivide);
  BigDecimalBinaryArithmeticOperation getOriginalRemainderDivide();
  BigDecimalBinaryArithmeticOperation remainderDivide(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(BigDecimalBinaryArithmeticOperation modifiedPower);
  BigDecimalBinaryArithmeticOperation getOriginalPower();
  BigDecimalBinaryArithmeticOperation power(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyCompare(BigDecimalIntegerComparison modifiedCompare);
  BigDecimalIntegerComparison getOriginalCompare();
  BigDecimalIntegerComparison compare(BaseIntegerComparison booleanComparison);

  void modifyEquals(BigDecimalBooleanComparison modifiedEquals);
  BigDecimalBooleanComparison getOriginalEquals();
  BigDecimalBooleanComparison equals(BaseBooleanComparison booleanComparison);

  void modifyNotEquals(BigDecimalBooleanComparison modifiedNotEquals);
  BigDecimalBooleanComparison getOriginalNotEquals();
  BigDecimalBooleanComparison notEquals(BaseBooleanComparison booleanComparison);

  void modifyLessThan(BigDecimalBooleanComparison modifiedLessThan);
  BigDecimalBooleanComparison getOriginalLessThan();
  BigDecimalBooleanComparison lessThan(BaseBooleanComparison booleanComparison);

  void modifyGreaterThan(BigDecimalBooleanComparison modifiedGreaterThan);
  BigDecimalBooleanComparison getOriginalGreaterThan();
  BigDecimalBooleanComparison greaterThan(BaseBooleanComparison booleanComparison);

  void modifyLessThanOrEquals(BigDecimalBooleanComparison modifiedLessThanOrEquals);
  BigDecimalBooleanComparison getOriginalLessThanOrEquals();
  BigDecimalBooleanComparison lessThanOrEquals(BaseBooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(BigDecimalBooleanComparison modifiedGreaterThanOrEquals);
  BigDecimalBooleanComparison getOriginalGreaterThanOrEquals();
  BigDecimalBooleanComparison greaterThanOrEquals(BaseBooleanComparison booleanComparison);
}
