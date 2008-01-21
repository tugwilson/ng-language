package uk.co.wilson.ng.runtime.metaclass.primitives;

import ng.runtime.metaclass.MetaClass;

public interface CharMetaClass extends MetaClass {
  CharBinaryArithmeticOperation add();
  CharBinaryArithmeticOperation subtract();
  CharBinaryArithmeticOperation multiply();
  CharBinaryArithmeticOperation divide();
  CharBinaryArithmeticOperation modulo();
  CharBinaryArithmeticOperation remainderDivide();
  CharBinaryArithmeticOperation power();

  CharBooleanComparison equals();
  CharBooleanComparison notEquals();
  CharBooleanComparison lessThan();
  CharBooleanComparison greaterThan();
  CharBooleanComparison lessThanOrEquals();
  CharBooleanComparison greaterThanOrEquals();
}
