package uk.co.wilson.ng.runtime.metaclass.primitives;

import ng.runtime.metaclass.MetaClass;

public interface DoubleMetaClass extends MetaClass {
  DoubleConversion convert();

  DoubleBinaryArithmeticOperation add();
  DoubleBinaryArithmeticOperation subtract();
  DoubleBinaryArithmeticOperation multiply();
  DoubleBinaryArithmeticOperation divide();
  DoubleBinaryArithmeticOperation modulo();
  DoubleBinaryArithmeticOperation remainderDivide();
  DoubleBinaryArithmeticOperation power();

  DoubleBooleanComparison equals();
  DoubleBooleanComparison notEquals();
  DoubleBooleanComparison lessThan();
  DoubleBooleanComparison greaterThan();
  DoubleBooleanComparison lessThanOrEquals();
  DoubleBooleanComparison greaterThanOrEquals();
}
