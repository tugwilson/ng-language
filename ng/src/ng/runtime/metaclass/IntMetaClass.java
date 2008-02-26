package ng.runtime.metaclass;



public interface IntMetaClass extends MetaClass {

  void modifyConvert(IntConversion modifiedConvert);
  IntConversion getOriginalConvert();
  IntConversion convert(BaseConversionOperation conversionOperation);

  void modifyAdd(IntBinaryArithmeticOperation modifiedAdd);
  IntBinaryArithmeticOperation getOriginalAdd();
  IntBinaryArithmeticOperation add(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(IntBinaryArithmeticOperation modifiedSubtract);
  IntBinaryArithmeticOperation getOriginalSubtract();
  IntBinaryArithmeticOperation subtract(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(IntBinaryArithmeticOperation modifiedMultiply);
  IntBinaryArithmeticOperation getOriginalMultiply();
  IntBinaryArithmeticOperation multiply(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(IntBinaryArithmeticOperation modifiedDivide);
  IntBinaryArithmeticOperation getOriginalDivide();
  IntBinaryArithmeticOperation divide(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(IntBinaryArithmeticOperation modifiedModulo);
  IntBinaryArithmeticOperation getOriginalModulo();
  IntBinaryArithmeticOperation modulo(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(IntBinaryArithmeticOperation modifiedRemainderDivide);
  IntBinaryArithmeticOperation getOriginalRemainderDivide();
  IntBinaryArithmeticOperation remainderDivide(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(IntBinaryArithmeticOperation modifiedPower);
  IntBinaryArithmeticOperation getOriginalPower();
  IntBinaryArithmeticOperation power(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyCompare(IntIntegerComparison modifiedCompare);
  IntIntegerComparison getOriginalCompare();
  IntIntegerComparison compare(BaseIntegerComparison integerComparison);

  void modifyEquals(IntBooleanComparison modifiedEquals);
  IntBooleanComparison getOriginalEquals();
  IntBooleanComparison equals(BaseBooleanComparison booleanComparison);

  void modifyNotEquals(IntBooleanComparison modifiedNotEquals);
  IntBooleanComparison getOriginalNotEquals();
  IntBooleanComparison notEquals(BaseBooleanComparison booleanComparison);

  void modifyLessThan(IntBooleanComparison modifiedLessThan);
  IntBooleanComparison getOriginalLessThan();
  IntBooleanComparison lessThan(BaseBooleanComparison booleanComparison);

  void modifyGreaterThan(IntBooleanComparison modifiedGreaterThan);
  IntBooleanComparison getOriginalGreaterThan();
  IntBooleanComparison greaterThan(BaseBooleanComparison booleanComparison);

  void modifyLessThanOrEquals(IntBooleanComparison modifiedLessThanOrEquals);
  IntBooleanComparison getOriginalLessThanOrEquals();
  IntBooleanComparison lessThanOrEquals(BaseBooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(IntBooleanComparison modifiedGreaterThanOrEquals);
  IntBooleanComparison getOriginalGreaterThanOrEquals();
  IntBooleanComparison greaterThanOrEquals(BaseBooleanComparison booleanComparison);
}
