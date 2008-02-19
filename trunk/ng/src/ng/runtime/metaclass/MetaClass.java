package ng.runtime.metaclass;

import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;
import ng.runtime.threadcontext.IntegerComparison;
import ng.runtime.threadcontext.StaticMethodCall;


public interface MetaClass {
  Class getTheClass();

  MetaClass createMetaClassFor(Class<?> type);

  Misc misc();

  DoStaticMethodCall staticMethodCall(StaticMethodCall doStaticMethodCall);

  void modifyConvert(Conversion modifiedConvert);
  Conversion getOriginalConvert();
  Conversion convert();

  void modifyAdd(ArithmeticBinaryOperation modifiedAdd);
  ArithmeticBinaryOperation getOriginalAdd();
  ArithmeticBinaryOperation add(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(ArithmeticBinaryOperation modifiedSubtract);
  ArithmeticBinaryOperation getOriginalSubtract();
  ArithmeticBinaryOperation subtract(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(ArithmeticBinaryOperation modifiedMultiply);
  ArithmeticBinaryOperation getOriginalMultiply();
  ArithmeticBinaryOperation multiply(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(ArithmeticBinaryOperation modifiedDivide);
  ArithmeticBinaryOperation getOriginalDivide();
  ArithmeticBinaryOperation divide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(ArithmeticBinaryOperation modifiedModulo);
  ArithmeticBinaryOperation getOriginalModulo();
  ArithmeticBinaryOperation modulo(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(ArithmeticBinaryOperation modifiedRemainderDivide);
  ArithmeticBinaryOperation getOriginalRemainderDivide();
  ArithmeticBinaryOperation remainderDivide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(ArithmeticBinaryOperation modifiedPower);
  ArithmeticBinaryOperation getOriginalPower();
  ArithmeticBinaryOperation power(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyCompare(IntegerBinaryComparison modifiedCompare);
  IntegerBinaryComparison getOriginalCompare();
  IntegerBinaryComparison compare(IntegerComparison integerComparison);

  void modifyEquals(BooleanBinaryComparison modifiedEquals);
  BooleanBinaryComparison getOriginalEquals();
  BooleanBinaryComparison equals(BooleanComparison booleanComparison);

  void modifyNotEquals(BooleanBinaryComparison modifiedNotEquals);
  BooleanBinaryComparison getOriginalNotEquals();
  BooleanBinaryComparison notEquals(BooleanComparison booleanComparison);

  void modifyLessThan(BooleanBinaryComparison modifiedLessThan);
  BooleanBinaryComparison getOriginalLessThan();
  BooleanBinaryComparison lessThan(BooleanComparison booleanComparison);

  void modifyGreaterThan(BooleanBinaryComparison modifiedGreaterThan);
  BooleanBinaryComparison getOriginalGreaterThan();
  BooleanBinaryComparison greaterThan(BooleanComparison booleanComparison);

  void modifyLessThanOrEquals(BooleanBinaryComparison modifiedLessThanOrEquals);
  BooleanBinaryComparison getOriginalLessThanOrEquals();
  BooleanBinaryComparison lessThanOrEquals(BooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(BooleanBinaryComparison modifiedGreaterThanOrEquals);
  BooleanBinaryComparison getOriginalGreaterThanOrEquals();
  BooleanBinaryComparison greaterThanOrEquals(BooleanComparison booleanComparison);
}
