package uk.co.wilson.ng.runtime.metaclass.primitives;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;


public interface IntMetaClass extends MetaClass {

  void modifyConvert(IntConversion modifiedConvert);
  IntConversion getOriginalConvert();
  IntConversion convert();

  void modifyAdd(IntBinaryArithmeticOperation modifiedAdd);
  IntBinaryArithmeticOperation getOriginalAdd();
  IntBinaryArithmeticOperation add(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(IntBinaryArithmeticOperation modifiedSubtract);
  IntBinaryArithmeticOperation getOriginalSubtract();
  IntBinaryArithmeticOperation subtract(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(IntBinaryArithmeticOperation modifiedMultiply);
  IntBinaryArithmeticOperation getOriginalMultiply();
  IntBinaryArithmeticOperation multiply(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(IntBinaryArithmeticOperation modifiedDivide);
  IntBinaryArithmeticOperation getOriginalDivide();
  IntBinaryArithmeticOperation divide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(IntBinaryArithmeticOperation modifiedModulo);
  IntBinaryArithmeticOperation getOriginalModulo();
  IntBinaryArithmeticOperation modulo(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(IntBinaryArithmeticOperation modifiedRemainderDivide);
  IntBinaryArithmeticOperation getOriginalRemainderDivide();
  IntBinaryArithmeticOperation remainderDivide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(IntBinaryArithmeticOperation modifiedPower);
  IntBinaryArithmeticOperation getOriginalPower();
  IntBinaryArithmeticOperation power(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyEquals(IntBooleanComparison modifiedEquals);
  IntBooleanComparison getOriginalEquals();
  IntBooleanComparison equals(BooleanComparison booleanComparison);

  void modifyNotEquals(IntBooleanComparison modifiedNotEquals);
  IntBooleanComparison getOriginalNotEquals();
  IntBooleanComparison notEquals(BooleanComparison booleanComparison);

  void modifyLessThan(IntBooleanComparison modifiedLessThan);
  IntBooleanComparison getOriginalLessThan();
  IntBooleanComparison lessThan(BooleanComparison booleanComparison);

  void modifyGreaterThan(IntBooleanComparison modifiedGreaterThan);
  IntBooleanComparison getOriginalGreaterThan();
  IntBooleanComparison greaterThan(BooleanComparison booleanComparison);

  void modifyLessThanOrEquals(IntBooleanComparison modifiedLessThanOrEquals);
  IntBooleanComparison getOriginalLessThanOrEquals();
  IntBooleanComparison lessThanOrEquals(BooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(IntBooleanComparison modifiedGreaterThanOrEquals);
  IntBooleanComparison getOriginalGreaterThanOrEquals();
  IntBooleanComparison greaterThanOrEquals(BooleanComparison booleanComparison);
}
