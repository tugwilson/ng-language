package ng.runtime.metaclass;


public interface ShortMetaClass extends MetaClass {

  void modifyConvert(ShortConversion modifiedConvert);
  ShortConversion getOriginalConvert();
  ShortConversion convert();

  void modifyAdd(ShortBinaryArithmeticOperation modifiedAdd);
  ShortBinaryArithmeticOperation getOriginalAdd();
  ShortBinaryArithmeticOperation add(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(ShortBinaryArithmeticOperation modifiedSubtract);
  ShortBinaryArithmeticOperation getOriginalSubtract();
  ShortBinaryArithmeticOperation subtract(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(ShortBinaryArithmeticOperation modifiedMultiply);
  ShortBinaryArithmeticOperation getOriginalMultiply();
  ShortBinaryArithmeticOperation multiply(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(ShortBinaryArithmeticOperation modifiedDivide);
  ShortBinaryArithmeticOperation getOriginalDivide();
  ShortBinaryArithmeticOperation divide(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(ShortBinaryArithmeticOperation modifiedModulo);
  ShortBinaryArithmeticOperation getOriginalModulo();
  ShortBinaryArithmeticOperation modulo(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(ShortBinaryArithmeticOperation modifiedRemainderDivide);
  ShortBinaryArithmeticOperation getOriginalRemainderDivide();
  ShortBinaryArithmeticOperation remainderDivide(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(ShortBinaryArithmeticOperation modifiedPower);
  ShortBinaryArithmeticOperation getOriginalPower();
  ShortBinaryArithmeticOperation power(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyCompare(ShortIntegerComparison modifiedCompare);
  ShortIntegerComparison getOriginalCompare();
  ShortIntegerComparison compare(BaseIntegerComparison integerComparison);

  void modifyEquals(ShortBooleanComparison modifiedEquals);
  ShortBooleanComparison getOriginalEquals();
  ShortBooleanComparison equals(BaseBooleanComparison booleanComparison);

  void modifyNotEquals(ShortBooleanComparison modifiedNotEquals);
  ShortBooleanComparison getOriginalNotEquals();
  ShortBooleanComparison notEquals(BaseBooleanComparison booleanComparison);

  void modifyLessThan(ShortBooleanComparison modifiedLessThan);
  ShortBooleanComparison getOriginalLessThan();
  ShortBooleanComparison lessThan(BaseBooleanComparison booleanComparison);

  void modifyGreaterThan(ShortBooleanComparison modifiedGreaterThan);
  ShortBooleanComparison getOriginalGreaterThan();
  ShortBooleanComparison greaterThan(BaseBooleanComparison booleanComparison);

  void modifyLessThanOrEquals(ShortBooleanComparison modifiedLessThanOrEquals);
  ShortBooleanComparison getOriginalLessThanOrEquals();
  ShortBooleanComparison lessThanOrEquals(BaseBooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(ShortBooleanComparison modifiedGreaterThanOrEquals);
  ShortBooleanComparison getOriginalGreaterThanOrEquals();
  ShortBooleanComparison greaterThanOrEquals(BaseBooleanComparison booleanComparison);
}
