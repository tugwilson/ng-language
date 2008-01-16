package uk.co.wilson.ng.runtime.metaclass.primitives;

import ng.runtime.metaclass.MetaClass;

public interface ShortMetaClass extends MetaClass {
  ShortBinaryArithmeticOperation add();
  ShortBinaryArithmeticOperation subtract();
  ShortBinaryArithmeticOperation multiply();
  ShortBinaryArithmeticOperation divide();
  ShortBinaryArithmeticOperation modulo();
  ShortBinaryArithmeticOperation remainderDivide();

  ShortBooleanComparison equals();
  ShortBooleanComparison notEquals();
  ShortBooleanComparison lessThan();
  ShortBooleanComparison greaterThan();
  ShortBooleanComparison lessThanOrEquals();
  ShortBooleanComparison greaterThanOrEquals();
}