package uk.co.wilson.ng.runtime.metaclass.primitives;

import ng.runtime.metaclass.MetaClass;


public interface IntMetaClass extends MetaClass {
  IntBinaryArithmeticOperation add();
  IntBinaryArithmeticOperation subtract();
  IntBinaryArithmeticOperation multiply();
  IntBinaryArithmeticOperation divide();
  IntBinaryArithmeticOperation modulo();
  IntBinaryArithmeticOperation remainderDivide();
  IntBinaryArithmeticOperation power();

  IntBooleanComparison equals();
  IntBooleanComparison notEquals();
  IntBooleanComparison lessThan();
  IntBooleanComparison greaterThan();
  IntBooleanComparison lessThanOrEquals();
  IntBooleanComparison greaterThanOrEquals();
}
