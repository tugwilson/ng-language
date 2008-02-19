package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;
import ng.runtime.threadcontext.IntegerComparison;

public interface CharMetaClass extends MetaClass {

  void modifyConvert(CharConversion modifiedConvert);
  CharConversion getOriginalConvert();
  CharConversion convert();

  void modifyAdd(CharBinaryArithmeticOperation modifiedAdd);
  CharBinaryArithmeticOperation getOriginalAdd();
  CharBinaryArithmeticOperation add(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(CharBinaryArithmeticOperation modifiedSubtract);
  CharBinaryArithmeticOperation getOriginalSubtract();
  CharBinaryArithmeticOperation subtract(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(CharBinaryArithmeticOperation modifiedMultiply);
  CharBinaryArithmeticOperation getOriginalMultiply();
  CharBinaryArithmeticOperation multiply(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(CharBinaryArithmeticOperation modifiedDivide);
  CharBinaryArithmeticOperation getOriginalDivide();
  CharBinaryArithmeticOperation divide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(CharBinaryArithmeticOperation modifiedModulo);
  CharBinaryArithmeticOperation getOriginalModulo();
  CharBinaryArithmeticOperation modulo(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(CharBinaryArithmeticOperation modifiedRemainderDivide);
  CharBinaryArithmeticOperation getOriginalRemainderDivide();
  CharBinaryArithmeticOperation remainderDivide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(CharBinaryArithmeticOperation modifiedPower);
  CharBinaryArithmeticOperation getOriginalPower();
  CharBinaryArithmeticOperation power(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyCompare(CharIntegerComparison modifiedCompare);
  CharIntegerComparison getOriginalCompare();
  CharIntegerComparison compare(IntegerComparison integerComparison);

  void modifyEquals(CharBooleanComparison modifiedEquals);
  CharBooleanComparison getOriginalEquals();
  CharBooleanComparison equals(BooleanComparison booleanComparison);

  void modifyNotEquals(CharBooleanComparison modifiedNotEquals);
  CharBooleanComparison getOriginalNotEquals();
  CharBooleanComparison notEquals(BooleanComparison booleanComparison);

  void modifyLessThan(CharBooleanComparison modifiedLessThan);
  CharBooleanComparison getOriginalLessThan();
  CharBooleanComparison lessThan(BooleanComparison booleanComparison);

  void modifyGreaterThan(CharBooleanComparison modifiedGreaterThan);
  CharBooleanComparison getOriginalGreaterThan();
  CharBooleanComparison greaterThan(BooleanComparison booleanComparison);

  void modifyLessThanOrEquals(CharBooleanComparison modifiedLessThanOrEquals);
  CharBooleanComparison getOriginalLessThanOrEquals();
  CharBooleanComparison lessThanOrEquals(BooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(CharBooleanComparison modifiedGreaterThanOrEquals);
  CharBooleanComparison getOriginalGreaterThanOrEquals();
  CharBooleanComparison greaterThanOrEquals(BooleanComparison booleanComparison);
}
