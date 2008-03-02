package ng.runtime.metaclass.primitives.bigdecimal;

import ng.runtime.metaclass.BaseArithmeticBinaryOperation;
import ng.runtime.metaclass.BaseBooleanComparison;
import ng.runtime.metaclass.BaseConversionOperation;
import ng.runtime.metaclass.BaseIntegerComparison;
import ng.runtime.metaclass.MetaClass;


public interface BigDecimalMetaClass extends MetaClass {

  void modifyConvert(BigDecimalConversion modifiedConvert);
  BigDecimalConversion getOriginalConvert();
  BigDecimalConversion convert(BaseConversionOperation conversionOperation);

  void modifyAdd(BigDecimalBinaryArithmeticOperation modifiedAdd);
  BigDecimalBinaryArithmeticOperation getOriginalAdd();
  BigDecimalBinaryArithmeticOperation add(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifySubtract(BigDecimalBinaryArithmeticOperation modifiedSubtract);
  BigDecimalBinaryArithmeticOperation getOriginalSubtract();
  BigDecimalBinaryArithmeticOperation subtract(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyMultiply(BigDecimalBinaryArithmeticOperation modifiedMultiply);
  BigDecimalBinaryArithmeticOperation getOriginalMultiply();
  BigDecimalBinaryArithmeticOperation multiply(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyDivide(BigDecimalBinaryArithmeticOperation modifiedDivide);
  BigDecimalBinaryArithmeticOperation getOriginalDivide();
  BigDecimalBinaryArithmeticOperation divide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyModulo(BigDecimalBinaryArithmeticOperation modifiedModulo);
  BigDecimalBinaryArithmeticOperation getOriginalModulo();
  BigDecimalBinaryArithmeticOperation modulo(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyRemainderDivide(BigDecimalBinaryArithmeticOperation modifiedRemainderDivide);
  BigDecimalBinaryArithmeticOperation getOriginalRemainderDivide();
  BigDecimalBinaryArithmeticOperation remainderDivide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyPower(BigDecimalBinaryArithmeticOperation modifiedPower);
  BigDecimalBinaryArithmeticOperation getOriginalPower();
  BigDecimalBinaryArithmeticOperation power(BaseArithmeticBinaryOperation binaryArithmeticOperation);

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