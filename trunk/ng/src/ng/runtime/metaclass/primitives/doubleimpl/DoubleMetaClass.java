package ng.runtime.metaclass.primitives.doubleimpl;

import ng.runtime.metaclass.BaseArithmeticBinaryOperation;
import ng.runtime.metaclass.BaseBooleanComparison;
import ng.runtime.metaclass.BaseConversionOperation;
import ng.runtime.metaclass.BaseIntegerComparison;
import ng.runtime.metaclass.MetaClass;


public interface DoubleMetaClass extends MetaClass {

  void modifyConvert(DoubleConversion modifiedConvert);
  DoubleConversion getOriginalConvert();
  DoubleConversion convert(BaseConversionOperation conversionOperation);

  void modifyAdd(DoubleBinaryArithmeticOperation modifiedAdd);
  DoubleBinaryArithmeticOperation getOriginalAdd();
  DoubleBinaryArithmeticOperation add(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifySubtract(DoubleBinaryArithmeticOperation modifiedSubtract);
  DoubleBinaryArithmeticOperation getOriginalSubtract();
  DoubleBinaryArithmeticOperation subtract(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyMultiply(DoubleBinaryArithmeticOperation modifiedMultiply);
  DoubleBinaryArithmeticOperation getOriginalMultiply();
  DoubleBinaryArithmeticOperation multiply(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyDivide(DoubleBinaryArithmeticOperation modifiedDivide);
  DoubleBinaryArithmeticOperation getOriginalDivide();
  DoubleBinaryArithmeticOperation divide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyModulo(DoubleBinaryArithmeticOperation modifiedModulo);
  DoubleBinaryArithmeticOperation getOriginalModulo();
  DoubleBinaryArithmeticOperation modulo(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyRemainderDivide(DoubleBinaryArithmeticOperation modifiedRemainderDivide);
  DoubleBinaryArithmeticOperation getOriginalRemainderDivide();
  DoubleBinaryArithmeticOperation remainderDivide(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyPower(DoubleBinaryArithmeticOperation modifiedPower);
  DoubleBinaryArithmeticOperation getOriginalPower();
  DoubleBinaryArithmeticOperation power(BaseArithmeticBinaryOperation binaryArithmeticOperation);

  void modifyCompare(DoubleIntegerComparison modifiedCompare);
  DoubleIntegerComparison getOriginalCompare();
  DoubleIntegerComparison compare(BaseIntegerComparison integerComparison);

  void modifyEquals(DoubleBooleanComparison modifiedEquals);
  DoubleBooleanComparison getOriginalEquals();
  DoubleBooleanComparison equals(BaseBooleanComparison booleanComparison);

  void modifyNotEquals(DoubleBooleanComparison modifiedNotEquals);
  DoubleBooleanComparison getOriginalNotEquals();
  DoubleBooleanComparison notEquals(BaseBooleanComparison booleanComparison);

  void modifyLessThan(DoubleBooleanComparison modifiedLessThan);
  DoubleBooleanComparison getOriginalLessThan();
  DoubleBooleanComparison lessThan(BaseBooleanComparison booleanComparison);

  void modifyGreaterThan(DoubleBooleanComparison modifiedGreaterThan);
  DoubleBooleanComparison getOriginalGreaterThan();
  DoubleBooleanComparison greaterThan(BaseBooleanComparison booleanComparison);

  void modifyLessThanOrEquals(DoubleBooleanComparison modifiedLessThanOrEquals);
  DoubleBooleanComparison getOriginalLessThanOrEquals();
  DoubleBooleanComparison lessThanOrEquals(BaseBooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(DoubleBooleanComparison modifiedGreaterThanOrEquals);
  DoubleBooleanComparison getOriginalGreaterThanOrEquals();
  DoubleBooleanComparison greaterThanOrEquals(BaseBooleanComparison booleanComparison);
}
