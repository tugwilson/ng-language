package ng.runtime.metaclass;

public interface MetaClass {
  Class getTheClass();

  MetaClass createMetaClassFor(Class<?> type);

  Misc misc();

  DoStaticMethodCall staticMethodCall();

  void modifyConvert(Conversion modifiedConvert);
  Conversion getOriginalConvert();
  Conversion convert();

  void modifyAdd(BinaryArithmeticOperation modifiedAdd);
  BinaryArithmeticOperation getOriginalAdd();
  BinaryArithmeticOperation add();

  void modifySubtract(BinaryArithmeticOperation modifiedSubtract);
  BinaryArithmeticOperation getOriginalSubtract();
  BinaryArithmeticOperation subtract();

  void modifyMultiply(BinaryArithmeticOperation modifiedMultiply);
  BinaryArithmeticOperation getOriginalMultiply();
  BinaryArithmeticOperation multiply();

  void modifyDivide(BinaryArithmeticOperation modifiedDivide);
  BinaryArithmeticOperation getOriginalDivide();
  BinaryArithmeticOperation divide();

  void modifyModulo(BinaryArithmeticOperation modifiedModulo);
  BinaryArithmeticOperation getOriginalModulo();
  BinaryArithmeticOperation modulo();

  void modifyRemainderDivide(BinaryArithmeticOperation modifiedRemainderDivide);
  BinaryArithmeticOperation getOriginalRemainderDivide();
  BinaryArithmeticOperation remainderDivide();

  void modifyPower(BinaryArithmeticOperation modifiedPower);
  BinaryArithmeticOperation getOriginalPower();
  BinaryArithmeticOperation power();

  void modifyEquals(BooleanBinaryComparison modifiedEquals);
  BooleanBinaryComparison getOriginalEquals();
  BooleanBinaryComparison equals();

  void modifyNotEquals(BooleanBinaryComparison modifiedNotEquals);
  BooleanBinaryComparison getOriginalNotEquals();
  BooleanBinaryComparison notEquals();

  void modifyLessThan(BooleanBinaryComparison modifiedLessThan);
  BooleanBinaryComparison getOriginalLessThan();
  BooleanBinaryComparison lessThan();

  void modifyGreaterThan(BooleanBinaryComparison modifiedGreaterThan);
  BooleanBinaryComparison getOriginalGreaterThan();
  BooleanBinaryComparison greaterThan();

  void modifyLessThanOrEquals(BooleanBinaryComparison modifiedLessThanOrEquals);
  BooleanBinaryComparison getOriginalLessThanOrEquals();
  BooleanBinaryComparison lessThanOrEquals();

  void modifyGreaterThanOrEquals(BooleanBinaryComparison modifiedGreaterThanOrEquals);
  BooleanBinaryComparison getOriginalGreaterThanOrEquals();
  BooleanBinaryComparison greaterThanOrEquals();
}
