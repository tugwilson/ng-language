package ng.runtime.metaclass;

public interface MetaClass {
  MetaClass createMetaClassFor(Class<?> type);

  Misc misc();

  Conversion convert();

  BinaryArithmeticOperation add();
  BinaryArithmeticOperation subtract();
  BinaryArithmeticOperation multiply();
  BinaryArithmeticOperation divide();
  BinaryArithmeticOperation modulo();
  BinaryArithmeticOperation remainderDivide();

  BooleanBinaryComparison equals();
  BooleanBinaryComparison notEquals();
  BooleanBinaryComparison lessThan();
  BooleanBinaryComparison greaterThan();
  BooleanBinaryComparison lessThanOrEquals();
  BooleanBinaryComparison greaterThanOrEquals();
}
