package ng.runtime.metaclass;


public interface LongMetaClass extends MetaClass {

  void modifyConvert(LongConversion modifiedConvert);
  LongConversion getOriginalConvert();
  LongConversion convert();

  void modifyAdd(LongBinaryArithmeticOperation modifiedAdd);
  LongBinaryArithmeticOperation getOriginalAdd();
  LongBinaryArithmeticOperation add(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(LongBinaryArithmeticOperation modifiedSubtract);
  LongBinaryArithmeticOperation getOriginalSubtract();
  LongBinaryArithmeticOperation subtract(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(LongBinaryArithmeticOperation modifiedMultiply);
  LongBinaryArithmeticOperation getOriginalMultiply();
  LongBinaryArithmeticOperation multiply(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(LongBinaryArithmeticOperation modifiedDivide);
  LongBinaryArithmeticOperation getOriginalDivide();
  LongBinaryArithmeticOperation divide(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(LongBinaryArithmeticOperation modifiedModulo);
  LongBinaryArithmeticOperation getOriginalModulo();
  LongBinaryArithmeticOperation modulo(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(LongBinaryArithmeticOperation modifiedRemainderDivide);
  LongBinaryArithmeticOperation getOriginalRemainderDivide();
  LongBinaryArithmeticOperation remainderDivide(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(LongBinaryArithmeticOperation modifiedPower);
  LongBinaryArithmeticOperation getOriginalPower();
  LongBinaryArithmeticOperation power(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyCompare(LongIntegerComparison modifiedCompare);
  LongIntegerComparison getOriginalCompare();
  LongIntegerComparison compare(BaseIntegerComparison integerComparison);

  void modifyEquals(LongBooleanComparison modifiedEquals);
  LongBooleanComparison getOriginalEquals();
  LongBooleanComparison equals(BaseBooleanComparison booleanComparison);

  void modifyNotEquals(LongBooleanComparison modifiedNotEquals);
  LongBooleanComparison getOriginalNotEquals();
  LongBooleanComparison notEquals(BaseBooleanComparison booleanComparison);

  void modifyLessThan(LongBooleanComparison modifiedLessThan);
  LongBooleanComparison getOriginalLessThan();
  LongBooleanComparison lessThan(BaseBooleanComparison booleanComparison);

  void modifyGreaterThan(LongBooleanComparison modifiedGreaterThan);
  LongBooleanComparison getOriginalGreaterThan();
  LongBooleanComparison greaterThan(BaseBooleanComparison booleanComparison);

  void modifyLessThanOrEquals(LongBooleanComparison modifiedLessThanOrEquals);
  LongBooleanComparison getOriginalLessThanOrEquals();
  LongBooleanComparison lessThanOrEquals(BaseBooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(LongBooleanComparison modifiedGreaterThanOrEquals);
  LongBooleanComparison getOriginalGreaterThanOrEquals();
  LongBooleanComparison greaterThanOrEquals(BaseBooleanComparison booleanComparison);
}
