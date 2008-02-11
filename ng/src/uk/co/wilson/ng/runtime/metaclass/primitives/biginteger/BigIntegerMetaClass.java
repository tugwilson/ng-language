package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;

public interface BigIntegerMetaClass extends MetaClass {

  void modifyConvert(BigIntegerConversion modifiedConvert);
  BigIntegerConversion getOriginalConvert();
  BigIntegerConversion convert();

  void modifyAdd(BigIntegerBinaryArithmeticOperation modifiedAdd);
  BigIntegerBinaryArithmeticOperation getOriginalAdd();
  BigIntegerBinaryArithmeticOperation add(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(BigIntegerBinaryArithmeticOperation modifiedSubtract);
  BigIntegerBinaryArithmeticOperation getOriginalSubtract();
  BigIntegerBinaryArithmeticOperation subtract(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(BigIntegerBinaryArithmeticOperation modifiedMultiply);
  BigIntegerBinaryArithmeticOperation getOriginalMultiply();
  BigIntegerBinaryArithmeticOperation multiply(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(BigIntegerBinaryArithmeticOperation modifiedDivide);
  BigIntegerBinaryArithmeticOperation getOriginalDivide();
  BigIntegerBinaryArithmeticOperation divide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(BigIntegerBinaryArithmeticOperation modifiedModulo);
  BigIntegerBinaryArithmeticOperation getOriginalModulo();
  BigIntegerBinaryArithmeticOperation modulo(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(BigIntegerBinaryArithmeticOperation modifiedRemainderDivide);
  BigIntegerBinaryArithmeticOperation getOriginalRemainderDivide();
  BigIntegerBinaryArithmeticOperation remainderDivide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(BigIntegerBinaryArithmeticOperation modifiedPower);
  BigIntegerBinaryArithmeticOperation getOriginalPower();
  BigIntegerBinaryArithmeticOperation power(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyEquals(BigIntegerBooleanComparison modifiedEquals);
  BigIntegerBooleanComparison getOriginalEquals();
  BigIntegerBooleanComparison equals(BooleanComparison booleanComparison);

  void modifyNotEquals(BigIntegerBooleanComparison modifiedNotEquals);
  BigIntegerBooleanComparison getOriginalNotEquals();
  BigIntegerBooleanComparison notEquals(BooleanComparison booleanComparison);

  void modifyLessThan(BigIntegerBooleanComparison modifiedLessThan);
  BigIntegerBooleanComparison getOriginalLessThan();
  BigIntegerBooleanComparison lessThan(BooleanComparison booleanComparison);

  void modifyGreaterThan(BigIntegerBooleanComparison modifiedGreaterThan);
  BigIntegerBooleanComparison getOriginalGreaterThan();
  BigIntegerBooleanComparison greaterThan(BooleanComparison booleanComparison);

  void modifyLessThanOrEquals(BigIntegerBooleanComparison modifiedLessThanOrEquals);
  BigIntegerBooleanComparison getOriginalLessThanOrEquals();
  BigIntegerBooleanComparison lessThanOrEquals(BooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(BigIntegerBooleanComparison modifiedGreaterThanOrEquals);
  BigIntegerBooleanComparison getOriginalGreaterThanOrEquals();
  BigIntegerBooleanComparison greaterThanOrEquals(BooleanComparison booleanComparison);
}
