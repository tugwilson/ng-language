package ng.runtime.metaclass;

import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;
import ng.runtime.threadcontext.IntegerComparison;

public interface ByteMetaClass extends MetaClass {

  void modifyConvert(ByteConversion modifiedConvert);
  ByteConversion getOriginalConvert();
  ByteConversion convert();

  void modifyAdd(ByteBinaryArithmeticOperation modifiedAdd);
  ByteBinaryArithmeticOperation getOriginalAdd();
  ByteBinaryArithmeticOperation add(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(ByteBinaryArithmeticOperation modifiedSubtract);
  ByteBinaryArithmeticOperation getOriginalSubtract();
  ByteBinaryArithmeticOperation subtract(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(ByteBinaryArithmeticOperation modifiedMultiply);
  ByteBinaryArithmeticOperation getOriginalMultiply();
  ByteBinaryArithmeticOperation multiply(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(ByteBinaryArithmeticOperation modifiedDivide);
  ByteBinaryArithmeticOperation getOriginalDivide();
  ByteBinaryArithmeticOperation divide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(ByteBinaryArithmeticOperation modifiedModulo);
  ByteBinaryArithmeticOperation getOriginalModulo();
  ByteBinaryArithmeticOperation modulo(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(ByteBinaryArithmeticOperation modifiedRemainderDivide);
  ByteBinaryArithmeticOperation getOriginalRemainderDivide();
  ByteBinaryArithmeticOperation remainderDivide(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(ByteBinaryArithmeticOperation modifiedPower);
  ByteBinaryArithmeticOperation getOriginalPower();
  ByteBinaryArithmeticOperation power(BinaryArithmeticOperation binaryArithmeticOperation);

  void modifyCompare(ByteIntegerComparison modifiedCompare);
  ByteIntegerComparison getOriginalCompare();
  ByteIntegerComparison compare(IntegerComparison integerComparison);

  void modifyEquals(ByteBooleanComparison modifiedEquals);
  ByteBooleanComparison getOriginalEquals();
  ByteBooleanComparison equals(BooleanComparison booleanComparison);

  void modifyNotEquals(ByteBooleanComparison modifiedNotEquals);
  ByteBooleanComparison getOriginalNotEquals();
  ByteBooleanComparison notEquals(BooleanComparison booleanComparison);

  void modifyLessThan(ByteBooleanComparison modifiedLessThan);
  ByteBooleanComparison getOriginalLessThan();
  ByteBooleanComparison lessThan(BooleanComparison booleanComparison);

  void modifyGreaterThan(ByteBooleanComparison modifiedGreaterThan);
  ByteBooleanComparison getOriginalGreaterThan();
  ByteBooleanComparison greaterThan(BooleanComparison booleanComparison);

  void modifyLessThanOrEquals(ByteBooleanComparison modifiedLessThanOrEquals);
  ByteBooleanComparison getOriginalLessThanOrEquals();
  ByteBooleanComparison lessThanOrEquals(BooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(ByteBooleanComparison modifiedGreaterThanOrEquals);
  ByteBooleanComparison getOriginalGreaterThanOrEquals();
  ByteBooleanComparison greaterThanOrEquals(BooleanComparison booleanComparison);
}
