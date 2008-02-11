package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;

public interface BigDecimalMetaClass extends MetaClass {

  void modifyConvert(BigDecimalConversion modifiedConvert);
  BigDecimalConversion getOriginalConvert();
  BigDecimalConversion convert();

  void modifyAdd(BigDecimalBinaryArithmeticOperation modifiedAdd);
  BigDecimalBinaryArithmeticOperation getOriginalAdd();
  BigDecimalBinaryArithmeticOperation add(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(BigDecimalBinaryArithmeticOperation modifiedSubtract);
  BigDecimalBinaryArithmeticOperation getOriginalSubtract();
  BigDecimalBinaryArithmeticOperation subtract(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(BigDecimalBinaryArithmeticOperation modifiedMultiply);
  BigDecimalBinaryArithmeticOperation getOriginalMultiply();
  BigDecimalBinaryArithmeticOperation multiply(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(BigDecimalBinaryArithmeticOperation modifiedDivide);
  BigDecimalBinaryArithmeticOperation getOriginalDivide();
  BigDecimalBinaryArithmeticOperation divide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(BigDecimalBinaryArithmeticOperation modifiedModulo);
  BigDecimalBinaryArithmeticOperation getOriginalModulo();
  BigDecimalBinaryArithmeticOperation modulo(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(BigDecimalBinaryArithmeticOperation modifiedRemainderDivide);
  BigDecimalBinaryArithmeticOperation getOriginalRemainderDivide();
  BigDecimalBinaryArithmeticOperation remainderDivide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(BigDecimalBinaryArithmeticOperation modifiedPower);
  BigDecimalBinaryArithmeticOperation getOriginalPower();
  BigDecimalBinaryArithmeticOperation power(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyEquals(BigDecimalBooleanComparison modifiedEquals);
  BigDecimalBooleanComparison getOriginalEquals();
  BigDecimalBooleanComparison equals(BooleanComparison booleanComparison);

  void modifyNotEquals(BigDecimalBooleanComparison modifiedNotEquals);
  BigDecimalBooleanComparison getOriginalNotEquals();
  BigDecimalBooleanComparison notEquals(BooleanComparison booleanComparison);

  void modifyLessThan(BigDecimalBooleanComparison modifiedLessThan);
  BigDecimalBooleanComparison getOriginalLessThan();
  BigDecimalBooleanComparison lessThan(BooleanComparison booleanComparison);

  void modifyGreaterThan(BigDecimalBooleanComparison modifiedGreaterThan);
  BigDecimalBooleanComparison getOriginalGreaterThan();
  BigDecimalBooleanComparison greaterThan(BooleanComparison booleanComparison);

  void modifyLessThanOrEquals(BigDecimalBooleanComparison modifiedLessThanOrEquals);
  BigDecimalBooleanComparison getOriginalLessThanOrEquals();
  BigDecimalBooleanComparison lessThanOrEquals(BooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(BigDecimalBooleanComparison modifiedGreaterThanOrEquals);
  BigDecimalBooleanComparison getOriginalGreaterThanOrEquals();
  BigDecimalBooleanComparison greaterThanOrEquals(BooleanComparison booleanComparison);
}
