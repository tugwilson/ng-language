package uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;

public interface DoubleMetaClass extends MetaClass {

  void modifyConvert(DoubleConversion modifiedConvert);
  DoubleConversion getOriginalConvert();
  DoubleConversion convert();

  void modifyAdd(DoubleBinaryArithmeticOperation modifiedAdd);
  DoubleBinaryArithmeticOperation getOriginalAdd();
  DoubleBinaryArithmeticOperation add(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(DoubleBinaryArithmeticOperation modifiedSubtract);
  DoubleBinaryArithmeticOperation getOriginalSubtract();
  DoubleBinaryArithmeticOperation subtract(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(DoubleBinaryArithmeticOperation modifiedMultiply);
  DoubleBinaryArithmeticOperation getOriginalMultiply();
  DoubleBinaryArithmeticOperation multiply(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(DoubleBinaryArithmeticOperation modifiedDivide);
  DoubleBinaryArithmeticOperation getOriginalDivide();
  DoubleBinaryArithmeticOperation divide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(DoubleBinaryArithmeticOperation modifiedModulo);
  DoubleBinaryArithmeticOperation getOriginalModulo();
  DoubleBinaryArithmeticOperation modulo(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(DoubleBinaryArithmeticOperation modifiedRemainderDivide);
  DoubleBinaryArithmeticOperation getOriginalRemainderDivide();
  DoubleBinaryArithmeticOperation remainderDivide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(DoubleBinaryArithmeticOperation modifiedPower);
  DoubleBinaryArithmeticOperation getOriginalPower();
  DoubleBinaryArithmeticOperation power(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyEquals(DoubleBooleanComparison modifiedEquals);
  DoubleBooleanComparison getOriginalEquals();
  DoubleBooleanComparison equals(BooleanComparison booleanComparison);

  void modifyNotEquals(DoubleBooleanComparison modifiedNotEquals);
  DoubleBooleanComparison getOriginalNotEquals();
  DoubleBooleanComparison notEquals(BooleanComparison booleanComparison);

  void modifyLessThan(DoubleBooleanComparison modifiedLessThan);
  DoubleBooleanComparison getOriginalLessThan();
  DoubleBooleanComparison lessThan(BooleanComparison booleanComparison);

  void modifyGreaterThan(DoubleBooleanComparison modifiedGreaterThan);
  DoubleBooleanComparison getOriginalGreaterThan();
  DoubleBooleanComparison greaterThan(BooleanComparison booleanComparison);

  void modifyLessThanOrEquals(DoubleBooleanComparison modifiedLessThanOrEquals);
  DoubleBooleanComparison getOriginalLessThanOrEquals();
  DoubleBooleanComparison lessThanOrEquals(BooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(DoubleBooleanComparison modifiedGreaterThanOrEquals);
  DoubleBooleanComparison getOriginalGreaterThanOrEquals();
  DoubleBooleanComparison greaterThanOrEquals(BooleanComparison booleanComparison);
}
