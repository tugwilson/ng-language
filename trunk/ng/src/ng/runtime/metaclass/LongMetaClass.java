package ng.runtime.metaclass;

import ng.lang.MetaClass;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;
import ng.runtime.threadcontext.IntegerComparison;

public interface LongMetaClass extends MetaClass {

  void modifyConvert(LongConversion modifiedConvert);
  LongConversion getOriginalConvert();
  LongConversion convert();

  void modifyAdd(LongBinaryArithmeticOperation modifiedAdd);
  LongBinaryArithmeticOperation getOriginalAdd();
  LongBinaryArithmeticOperation add(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(LongBinaryArithmeticOperation modifiedSubtract);
  LongBinaryArithmeticOperation getOriginalSubtract();
  LongBinaryArithmeticOperation subtract(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(LongBinaryArithmeticOperation modifiedMultiply);
  LongBinaryArithmeticOperation getOriginalMultiply();
  LongBinaryArithmeticOperation multiply(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(LongBinaryArithmeticOperation modifiedDivide);
  LongBinaryArithmeticOperation getOriginalDivide();
  LongBinaryArithmeticOperation divide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(LongBinaryArithmeticOperation modifiedModulo);
  LongBinaryArithmeticOperation getOriginalModulo();
  LongBinaryArithmeticOperation modulo(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(LongBinaryArithmeticOperation modifiedRemainderDivide);
  LongBinaryArithmeticOperation getOriginalRemainderDivide();
  LongBinaryArithmeticOperation remainderDivide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(LongBinaryArithmeticOperation modifiedPower);
  LongBinaryArithmeticOperation getOriginalPower();
  LongBinaryArithmeticOperation power(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyCompare(LongIntegerComparison modifiedCompare);
  LongIntegerComparison getOriginalCompare();
  LongIntegerComparison compare(IntegerComparison integerComparison);

  void modifyEquals(LongBooleanComparison modifiedEquals);
  LongBooleanComparison getOriginalEquals();
  LongBooleanComparison equals(BooleanComparison booleanComparison);

  void modifyNotEquals(LongBooleanComparison modifiedNotEquals);
  LongBooleanComparison getOriginalNotEquals();
  LongBooleanComparison notEquals(BooleanComparison booleanComparison);

  void modifyLessThan(LongBooleanComparison modifiedLessThan);
  LongBooleanComparison getOriginalLessThan();
  LongBooleanComparison lessThan(BooleanComparison booleanComparison);

  void modifyGreaterThan(LongBooleanComparison modifiedGreaterThan);
  LongBooleanComparison getOriginalGreaterThan();
  LongBooleanComparison greaterThan(BooleanComparison booleanComparison);

  void modifyLessThanOrEquals(LongBooleanComparison modifiedLessThanOrEquals);
  LongBooleanComparison getOriginalLessThanOrEquals();
  LongBooleanComparison lessThanOrEquals(BooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(LongBooleanComparison modifiedGreaterThanOrEquals);
  LongBooleanComparison getOriginalGreaterThanOrEquals();
  LongBooleanComparison greaterThanOrEquals(BooleanComparison booleanComparison);
}
