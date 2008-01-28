package ng.runtime.metaclass;

public interface MetaClass {
  Class getTheClass();

  MetaClass createMetaClassFor(Class<?> type);

  Misc misc();

  DoStaticMethodCall staticMethodCall();

  Conversion convert();

  BinaryArithmeticOperation add();
  BinaryArithmeticOperation subtract();
  BinaryArithmeticOperation multiply();
  BinaryArithmeticOperation divide();
  BinaryArithmeticOperation modulo();
  BinaryArithmeticOperation remainderDivide();
  BinaryArithmeticOperation power();

  BooleanBinaryComparison equals();
  BooleanBinaryComparison notEquals();
  BooleanBinaryComparison lessThan();
  BooleanBinaryComparison greaterThan();
  BooleanBinaryComparison lessThanOrEquals();
  BooleanBinaryComparison greaterThanOrEquals();
}
