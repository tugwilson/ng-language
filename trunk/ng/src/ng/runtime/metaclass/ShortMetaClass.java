package ng.runtime.metaclass;

import ng.lang.MetaClass;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;
import ng.runtime.threadcontext.IntegerComparison;

public interface ShortMetaClass extends MetaClass {

  void modifyConvert(ShortConversion modifiedConvert);
  ShortConversion getOriginalConvert();
  ShortConversion convert();

  void modifyAdd(ShortBinaryArithmeticOperation modifiedAdd);
  ShortBinaryArithmeticOperation getOriginalAdd();
  ShortBinaryArithmeticOperation add(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(ShortBinaryArithmeticOperation modifiedSubtract);
  ShortBinaryArithmeticOperation getOriginalSubtract();
  ShortBinaryArithmeticOperation subtract(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(ShortBinaryArithmeticOperation modifiedMultiply);
  ShortBinaryArithmeticOperation getOriginalMultiply();
  ShortBinaryArithmeticOperation multiply(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(ShortBinaryArithmeticOperation modifiedDivide);
  ShortBinaryArithmeticOperation getOriginalDivide();
  ShortBinaryArithmeticOperation divide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(ShortBinaryArithmeticOperation modifiedModulo);
  ShortBinaryArithmeticOperation getOriginalModulo();
  ShortBinaryArithmeticOperation modulo(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(ShortBinaryArithmeticOperation modifiedRemainderDivide);
  ShortBinaryArithmeticOperation getOriginalRemainderDivide();
  ShortBinaryArithmeticOperation remainderDivide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(ShortBinaryArithmeticOperation modifiedPower);
  ShortBinaryArithmeticOperation getOriginalPower();
  ShortBinaryArithmeticOperation power(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyCompare(ShortIntegerComparison modifiedCompare);
  ShortIntegerComparison getOriginalCompare();
  ShortIntegerComparison compare(IntegerComparison integerComparison);

  void modifyEquals(ShortBooleanComparison modifiedEquals);
  ShortBooleanComparison getOriginalEquals();
  ShortBooleanComparison equals(BooleanComparison booleanComparison);

  void modifyNotEquals(ShortBooleanComparison modifiedNotEquals);
  ShortBooleanComparison getOriginalNotEquals();
  ShortBooleanComparison notEquals(BooleanComparison booleanComparison);

  void modifyLessThan(ShortBooleanComparison modifiedLessThan);
  ShortBooleanComparison getOriginalLessThan();
  ShortBooleanComparison lessThan(BooleanComparison booleanComparison);

  void modifyGreaterThan(ShortBooleanComparison modifiedGreaterThan);
  ShortBooleanComparison getOriginalGreaterThan();
  ShortBooleanComparison greaterThan(BooleanComparison booleanComparison);

  void modifyLessThanOrEquals(ShortBooleanComparison modifiedLessThanOrEquals);
  ShortBooleanComparison getOriginalLessThanOrEquals();
  ShortBooleanComparison lessThanOrEquals(BooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(ShortBooleanComparison modifiedGreaterThanOrEquals);
  ShortBooleanComparison getOriginalGreaterThanOrEquals();
  ShortBooleanComparison greaterThanOrEquals(BooleanComparison booleanComparison);
}
