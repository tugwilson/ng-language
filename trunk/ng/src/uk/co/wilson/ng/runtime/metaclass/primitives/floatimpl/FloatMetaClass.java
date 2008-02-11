package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;

public interface FloatMetaClass extends MetaClass {

  void modifyConvert(FloatConversion modifiedConvert);
  FloatConversion getOriginalConvert();
  FloatConversion convert();

  void modifyAdd(FloatBinaryArithmeticOperation modifiedAdd);
  FloatBinaryArithmeticOperation getOriginalAdd();
  FloatBinaryArithmeticOperation add(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(FloatBinaryArithmeticOperation modifiedSubtract);
  FloatBinaryArithmeticOperation getOriginalSubtract();
  FloatBinaryArithmeticOperation subtract(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(FloatBinaryArithmeticOperation modifiedMultiply);
  FloatBinaryArithmeticOperation getOriginalMultiply();
  FloatBinaryArithmeticOperation multiply(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(FloatBinaryArithmeticOperation modifiedDivide);
  FloatBinaryArithmeticOperation getOriginalDivide();
  FloatBinaryArithmeticOperation divide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(FloatBinaryArithmeticOperation modifiedModulo);
  FloatBinaryArithmeticOperation getOriginalModulo();
  FloatBinaryArithmeticOperation modulo(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(FloatBinaryArithmeticOperation modifiedRemainderDivide);
  FloatBinaryArithmeticOperation getOriginalRemainderDivide();
  FloatBinaryArithmeticOperation remainderDivide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(FloatBinaryArithmeticOperation modifiedPower);
  FloatBinaryArithmeticOperation getOriginalPower();
  FloatBinaryArithmeticOperation power(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyEquals(FloatBooleanComparison modifiedEquals);
  FloatBooleanComparison getOriginalEquals();
  FloatBooleanComparison equals(BooleanComparison booleanComparison);

  void modifyNotEquals(FloatBooleanComparison modifiedNotEquals);
  FloatBooleanComparison getOriginalNotEquals();
  FloatBooleanComparison notEquals(BooleanComparison booleanComparison);

  void modifyLessThan(FloatBooleanComparison modifiedLessThan);
  FloatBooleanComparison getOriginalLessThan();
  FloatBooleanComparison lessThan(BooleanComparison booleanComparison);

  void modifyGreaterThan(FloatBooleanComparison modifiedGreaterThan);
  FloatBooleanComparison getOriginalGreaterThan();
  FloatBooleanComparison greaterThan(BooleanComparison booleanComparison);

  void modifyLessThanOrEquals(FloatBooleanComparison modifiedLessThanOrEquals);
  FloatBooleanComparison getOriginalLessThanOrEquals();
  FloatBooleanComparison lessThanOrEquals(BooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(FloatBooleanComparison modifiedGreaterThanOrEquals);
  FloatBooleanComparison getOriginalGreaterThanOrEquals();
  FloatBooleanComparison greaterThanOrEquals(BooleanComparison booleanComparison);
}
