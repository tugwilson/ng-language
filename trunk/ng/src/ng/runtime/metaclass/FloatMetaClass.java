package ng.runtime.metaclass;


public interface FloatMetaClass extends MetaClass {

  void modifyConvert(FloatConversion modifiedConvert);
  FloatConversion getOriginalConvert();
  FloatConversion convert(BaseConversionOperation conversionOperation);

  void modifyAdd(FloatBinaryArithmeticOperation modifiedAdd);
  FloatBinaryArithmeticOperation getOriginalAdd();
  FloatBinaryArithmeticOperation add(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifySubtract(FloatBinaryArithmeticOperation modifiedSubtract);
  FloatBinaryArithmeticOperation getOriginalSubtract();
  FloatBinaryArithmeticOperation subtract(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyMultiply(FloatBinaryArithmeticOperation modifiedMultiply);
  FloatBinaryArithmeticOperation getOriginalMultiply();
  FloatBinaryArithmeticOperation multiply(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyDivide(FloatBinaryArithmeticOperation modifiedDivide);
  FloatBinaryArithmeticOperation getOriginalDivide();
  FloatBinaryArithmeticOperation divide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyModulo(FloatBinaryArithmeticOperation modifiedModulo);
  FloatBinaryArithmeticOperation getOriginalModulo();
  FloatBinaryArithmeticOperation modulo(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyRemainderDivide(FloatBinaryArithmeticOperation modifiedRemainderDivide);
  FloatBinaryArithmeticOperation getOriginalRemainderDivide();
  FloatBinaryArithmeticOperation remainderDivide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyPower(FloatBinaryArithmeticOperation modifiedPower);
  FloatBinaryArithmeticOperation getOriginalPower();
  FloatBinaryArithmeticOperation power(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyCompare(FloatIntegerComparison modifiedCompare);
  FloatIntegerComparison getOriginalCompare();
  FloatIntegerComparison compare(BaseIntegerComparison integerComparison);

  void modifyEquals(FloatBooleanComparison modifiedEquals);
  FloatBooleanComparison getOriginalEquals();
  FloatBooleanComparison equals(BaseBooleanComparison booleanComparison);

  void modifyNotEquals(FloatBooleanComparison modifiedNotEquals);
  FloatBooleanComparison getOriginalNotEquals();
  FloatBooleanComparison notEquals(BaseBooleanComparison booleanComparison);

  void modifyLessThan(FloatBooleanComparison modifiedLessThan);
  FloatBooleanComparison getOriginalLessThan();
  FloatBooleanComparison lessThan(BaseBooleanComparison booleanComparison);

  void modifyGreaterThan(FloatBooleanComparison modifiedGreaterThan);
  FloatBooleanComparison getOriginalGreaterThan();
  FloatBooleanComparison greaterThan(BaseBooleanComparison booleanComparison);

  void modifyLessThanOrEquals(FloatBooleanComparison modifiedLessThanOrEquals);
  FloatBooleanComparison getOriginalLessThanOrEquals();
  FloatBooleanComparison lessThanOrEquals(BaseBooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(FloatBooleanComparison modifiedGreaterThanOrEquals);
  FloatBooleanComparison getOriginalGreaterThanOrEquals();
  FloatBooleanComparison greaterThanOrEquals(BaseBooleanComparison booleanComparison);
}
