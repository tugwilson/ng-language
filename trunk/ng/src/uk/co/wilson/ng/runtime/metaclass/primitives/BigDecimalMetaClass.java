package uk.co.wilson.ng.runtime.metaclass.primitives;

import ng.runtime.metaclass.MetaClass;

public interface BigDecimalMetaClass extends MetaClass {

  void modifyConvert(BigDecimalConversion modifiedConvert);
  BigDecimalConversion getOriginalConvert();
  BigDecimalConversion convert();

  void modifyAdd(BigDecimalBinaryArithmeticOperation modifiedAdd);
  BigDecimalBinaryArithmeticOperation getOriginalAdd();
  BigDecimalBinaryArithmeticOperation add();

  void modifySubtract(BigDecimalBinaryArithmeticOperation modifiedSubtract);
  BigDecimalBinaryArithmeticOperation getOriginalSubtract();
  BigDecimalBinaryArithmeticOperation subtract();

  void modifyMultiply(BigDecimalBinaryArithmeticOperation modifiedMultiply);
  BigDecimalBinaryArithmeticOperation getOriginalMultiply();
  BigDecimalBinaryArithmeticOperation multiply();

  void modifyDivide(BigDecimalBinaryArithmeticOperation modifiedDivide);
  BigDecimalBinaryArithmeticOperation getOriginalDivide();
  BigDecimalBinaryArithmeticOperation divide();

  void modifyModulo(BigDecimalBinaryArithmeticOperation modifiedModulo);
  BigDecimalBinaryArithmeticOperation getOriginalModulo();
  BigDecimalBinaryArithmeticOperation modulo();

  void modifyRemainderDivide(BigDecimalBinaryArithmeticOperation modifiedRemainderDivide);
  BigDecimalBinaryArithmeticOperation getOriginalRemainderDivide();
  BigDecimalBinaryArithmeticOperation remainderDivide();

  void modifyPower(BigDecimalBinaryArithmeticOperation modifiedPower);
  BigDecimalBinaryArithmeticOperation getOriginalPower();
  BigDecimalBinaryArithmeticOperation power();

  void modifyEquals(BigDecimalBooleanComparison modifiedEquals);
  BigDecimalBooleanComparison getOriginalEquals();
  BigDecimalBooleanComparison equals();

  void modifyNotEquals(BigDecimalBooleanComparison modifiedNotEquals);
  BigDecimalBooleanComparison getOriginalNotEquals();
  BigDecimalBooleanComparison notEquals();

  void modifyLessThan(BigDecimalBooleanComparison modifiedLessThan);
  BigDecimalBooleanComparison getOriginalLessThan();
  BigDecimalBooleanComparison lessThan();

  void modifyGreaterThan(BigDecimalBooleanComparison modifiedGreaterThan);
  BigDecimalBooleanComparison getOriginalGreaterThan();
  BigDecimalBooleanComparison greaterThan();

  void modifyLessThanOrEquals(BigDecimalBooleanComparison modifiedLessThanOrEquals);
  BigDecimalBooleanComparison getOriginalLessThanOrEquals();
  BigDecimalBooleanComparison lessThanOrEquals();

  void modifyGreaterThanOrEquals(BigDecimalBooleanComparison modifiedGreaterThanOrEquals);
  BigDecimalBooleanComparison getOriginalGreaterThanOrEquals();
  BigDecimalBooleanComparison greaterThanOrEquals();
}
