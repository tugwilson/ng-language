package uk.co.wilson.ng.runtime.metaclass.primitives;

import ng.runtime.metaclass.MetaClass;

public interface LongMetaClass extends MetaClass {
  LongConversion convert();

  LongBinaryArithmeticOperation add();
  LongBinaryArithmeticOperation subtract();
  LongBinaryArithmeticOperation multiply();
  LongBinaryArithmeticOperation divide();
  LongBinaryArithmeticOperation modulo();
  LongBinaryArithmeticOperation remainderDivide();
  LongBinaryArithmeticOperation power();

  LongBooleanComparison equals();
  LongBooleanComparison notEquals();
  LongBooleanComparison lessThan();
  LongBooleanComparison greaterThan();
  LongBooleanComparison lessThanOrEquals();
  LongBooleanComparison greaterThanOrEquals();
}
