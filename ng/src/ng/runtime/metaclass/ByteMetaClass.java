package ng.runtime.metaclass;


public interface ByteMetaClass extends MetaClass {

  void modifyConvert(ByteConversion modifiedConvert);
  ByteConversion getOriginalConvert();
  ByteConversion convert(BaseConversionOperation conversionOperation);

  void modifyAdd(ByteBinaryArithmeticOperation modifiedAdd);
  ByteBinaryArithmeticOperation getOriginalAdd();
  ByteBinaryArithmeticOperation add(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifySubtract(ByteBinaryArithmeticOperation modifiedSubtract);
  ByteBinaryArithmeticOperation getOriginalSubtract();
  ByteBinaryArithmeticOperation subtract(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyMultiply(ByteBinaryArithmeticOperation modifiedMultiply);
  ByteBinaryArithmeticOperation getOriginalMultiply();
  ByteBinaryArithmeticOperation multiply(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyDivide(ByteBinaryArithmeticOperation modifiedDivide);
  ByteBinaryArithmeticOperation getOriginalDivide();
  ByteBinaryArithmeticOperation divide(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyModulo(ByteBinaryArithmeticOperation modifiedModulo);
  ByteBinaryArithmeticOperation getOriginalModulo();
  ByteBinaryArithmeticOperation modulo(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyRemainderDivide(ByteBinaryArithmeticOperation modifiedRemainderDivide);
  ByteBinaryArithmeticOperation getOriginalRemainderDivide();
  ByteBinaryArithmeticOperation remainderDivide(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyPower(ByteBinaryArithmeticOperation modifiedPower);
  ByteBinaryArithmeticOperation getOriginalPower();
  ByteBinaryArithmeticOperation power(BaseBinaryArithmeticOperation binaryArithmeticOperation);

  void modifyCompare(ByteIntegerComparison modifiedCompare);
  ByteIntegerComparison getOriginalCompare();
  ByteIntegerComparison compare(BaseIntegerComparison integerComparison);

  void modifyEquals(ByteBooleanComparison modifiedEquals);
  ByteBooleanComparison getOriginalEquals();
  ByteBooleanComparison equals(BaseBooleanComparison booleanComparison);

  void modifyNotEquals(ByteBooleanComparison modifiedNotEquals);
  ByteBooleanComparison getOriginalNotEquals();
  ByteBooleanComparison notEquals(BaseBooleanComparison booleanComparison);

  void modifyLessThan(ByteBooleanComparison modifiedLessThan);
  ByteBooleanComparison getOriginalLessThan();
  ByteBooleanComparison lessThan(BaseBooleanComparison booleanComparison);

  void modifyGreaterThan(ByteBooleanComparison modifiedGreaterThan);
  ByteBooleanComparison getOriginalGreaterThan();
  ByteBooleanComparison greaterThan(BaseBooleanComparison booleanComparison);

  void modifyLessThanOrEquals(ByteBooleanComparison modifiedLessThanOrEquals);
  ByteBooleanComparison getOriginalLessThanOrEquals();
  ByteBooleanComparison lessThanOrEquals(BaseBooleanComparison booleanComparison);

  void modifyGreaterThanOrEquals(ByteBooleanComparison modifiedGreaterThanOrEquals);
  ByteBooleanComparison getOriginalGreaterThanOrEquals();
  ByteBooleanComparison greaterThanOrEquals(BaseBooleanComparison booleanComparison);
}
