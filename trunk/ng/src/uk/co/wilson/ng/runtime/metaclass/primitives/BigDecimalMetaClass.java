package uk.co.wilson.ng.runtime.metaclass.primitives;

import ng.runtime.metaclass.MetaClass;

public interface BigDecimalMetaClass extends MetaClass {
  BigDecimalConversion convert();

  BigDecimalBinaryArithmeticOperation add();
  BigDecimalBinaryArithmeticOperation subtract();
  BigDecimalBinaryArithmeticOperation multiply();
  BigDecimalBinaryArithmeticOperation divide();
  BigDecimalBinaryArithmeticOperation modulo();
  BigDecimalBinaryArithmeticOperation remainderDivide();
  BigDecimalBinaryArithmeticOperation power();

  BigDecimalBooleanComparison equals();
  BigDecimalBooleanComparison notEquals();
  BigDecimalBooleanComparison lessThan();
  BigDecimalBooleanComparison greaterThan();
  BigDecimalBooleanComparison lessThanOrEquals();
  BigDecimalBooleanComparison greaterThanOrEquals();
}
