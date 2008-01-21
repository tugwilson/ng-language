package uk.co.wilson.ng.runtime.metaclass.primitives;

import ng.runtime.metaclass.MetaClass;

public interface FloatMetaClass extends MetaClass {
  FloatBinaryArithmeticOperation add();
  FloatBinaryArithmeticOperation subtract();
  FloatBinaryArithmeticOperation multiply();
  FloatBinaryArithmeticOperation divide();
  FloatBinaryArithmeticOperation modulo();
  FloatBinaryArithmeticOperation remainderDivide();
  FloatBinaryArithmeticOperation power();

  FloatBooleanComparison equals();
  FloatBooleanComparison notEquals();
  FloatBooleanComparison lessThan();
  FloatBooleanComparison greaterThan();
  FloatBooleanComparison lessThanOrEquals();
  FloatBooleanComparison greaterThanOrEquals();
}
