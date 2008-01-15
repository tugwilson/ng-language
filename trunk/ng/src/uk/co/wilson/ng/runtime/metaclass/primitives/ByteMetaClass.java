package uk.co.wilson.ng.runtime.metaclass.primitives;

import ng.runtime.metaclass.MetaClass;

public interface ByteMetaClass extends MetaClass {
  ByteBinaryArithmeticOperation add();
  ByteBinaryArithmeticOperation subtract();
  ByteBinaryArithmeticOperation multiply();
  ByteBinaryArithmeticOperation divide();
  ByteBinaryArithmeticOperation modulo();
  ByteBinaryArithmeticOperation remainderDivide();

  ByteBooleanComparison equals();
  ByteBooleanComparison notEquals();
  ByteBooleanComparison lessThan();
  ByteBooleanComparison greaterThan();
  ByteBooleanComparison lessThanOrEquals();
  ByteBooleanComparison greaterThanOrEquals();
}