package uk.co.wilson.ng.runtime.metaclass.primitives;

import ng.runtime.metaclass.MetaClass;

public interface BigIntegerMetaClass extends MetaClass {
  BigIntegerBinaryArithmeticOperation add();
  BigIntegerBinaryArithmeticOperation subtract();
  BigIntegerBinaryArithmeticOperation multiply();
  BigIntegerBinaryArithmeticOperation divide();
  BigIntegerBinaryArithmeticOperation modulo();
  BigIntegerBinaryArithmeticOperation remainderDivide();

  BigIntegerBooleanComparison equals();
  BigIntegerBooleanComparison notEquals();
  BigIntegerBooleanComparison lessThan();
  BigIntegerBooleanComparison greaterThan();
  BigIntegerBooleanComparison lessThanOrEquals();
  BigIntegerBooleanComparison greaterThanOrEquals();
}
