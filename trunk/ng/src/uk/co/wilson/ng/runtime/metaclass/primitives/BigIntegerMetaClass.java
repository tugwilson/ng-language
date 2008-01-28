package uk.co.wilson.ng.runtime.metaclass.primitives;

import ng.runtime.metaclass.MetaClass;

public interface BigIntegerMetaClass extends MetaClass {
  BigIntegerConversion convert();

  BigIntegerBinaryArithmeticOperation add();
  BigIntegerBinaryArithmeticOperation subtract();
  BigIntegerBinaryArithmeticOperation multiply();
  BigIntegerBinaryArithmeticOperation divide();
  BigIntegerBinaryArithmeticOperation modulo();
  BigIntegerBinaryArithmeticOperation remainderDivide();
  BigIntegerBinaryArithmeticOperation power();

  BigIntegerBooleanComparison equals();
  BigIntegerBooleanComparison notEquals();
  BigIntegerBooleanComparison lessThan();
  BigIntegerBooleanComparison greaterThan();
  BigIntegerBooleanComparison lessThanOrEquals();
  BigIntegerBooleanComparison greaterThanOrEquals();
}
