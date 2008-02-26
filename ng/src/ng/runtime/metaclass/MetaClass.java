package ng.runtime.metaclass;

public interface MetaClass {
  Class getTheClass();

  MetaClass createMetaClassFor(Class<?> type);

  Misc misc();

  DoStaticMethodCall staticMethodCall(BaseStaticMethodCall doStaticMethodCall);

  void modifyConvert(Conversion modifiedConvert);
  Conversion getOriginalConvert();
  Conversion convert();

  void modifyAdd(ArithmeticBinaryOperation modifiedAdd);
  ArithmeticBinaryOperation getOriginalAdd();
  ArithmeticBinaryOperation add(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(ArithmeticBinaryOperation modifiedSubtract);
  ArithmeticBinaryOperation getOriginalSubtract();
  ArithmeticBinaryOperation subtract(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(ArithmeticBinaryOperation modifiedMultiply);
  ArithmeticBinaryOperation getOriginalMultiply();
  ArithmeticBinaryOperation multiply(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(ArithmeticBinaryOperation modifiedDivide);
  ArithmeticBinaryOperation getOriginalDivide();
  ArithmeticBinaryOperation divide(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(ArithmeticBinaryOperation modifiedModulo);
  ArithmeticBinaryOperation getOriginalModulo();
  ArithmeticBinaryOperation modulo(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(ArithmeticBinaryOperation modifiedRemainderDivide);
  ArithmeticBinaryOperation getOriginalRemainderDivide();
  ArithmeticBinaryOperation remainderDivide(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(ArithmeticBinaryOperation modifiedPower);
  ArithmeticBinaryOperation getOriginalPower();
  ArithmeticBinaryOperation power(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyCompare(IntegerBinaryComparison modifiedCompare);
  IntegerBinaryComparison getOriginalCompare();
  IntegerBinaryComparison compare(BaseIntegerComparison integerComparison);

  void modifyEquals(BooleanBinaryComparison modifiedEquals);
  BooleanBinaryComparison getOriginalEquals();
  BooleanBinaryComparison equals(BaseBooleanComparison booleanComparison);

  void modifyNotEquals(BooleanBinaryComparison modifiedNotEquals);
  BooleanBinaryComparison getOriginalNotEquals();
  BooleanBinaryComparison notEquals(BaseBooleanComparison booleanComparison);

  void modifyLessThan(BooleanBinaryComparison modifiedLessThan);
  BooleanBinaryComparison getOriginalLessThan();
  BooleanBinaryComparison lessThan(BaseBooleanComparison booleanComparison);

  void modifyGreaterThan(BooleanBinaryComparison modifiedGreaterThan);
  BooleanBinaryComparison getOriginalGreaterThan();
  BooleanBinaryComparison greaterThan(BaseBooleanComparison booleanComparison);

  void modifyLessThanOrEquals(BooleanBinaryComparison modifiedLessThanOrEquals);
  BooleanBinaryComparison getOriginalLessThanOrEquals();
  BooleanBinaryComparison lessThanOrEquals(BaseBooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(BooleanBinaryComparison modifiedGreaterThanOrEquals);
  BooleanBinaryComparison getOriginalGreaterThanOrEquals();
  BooleanBinaryComparison greaterThanOrEquals(BaseBooleanComparison booleanComparison);
}
