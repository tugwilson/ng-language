package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerMetaClass;

public class BigIntegerMetaClassImpl extends BaseMetaClass implements BigIntegerMetaClass {

  private final BigIntegerBinaryArithmeticOperation modifiedAdd = null;
  private final BigIntegerBinaryArithmeticOperation modifiedSubtract = null;
  private final BigIntegerBinaryArithmeticOperation modifiedMultiply = null;
  private final BigIntegerBinaryArithmeticOperation modifiedDivide = null;
  private final BigIntegerBinaryArithmeticOperation modifiedModulo = null;
  private final BigIntegerBinaryArithmeticOperation modifiedRemainderDivide = null;

  private final BigIntegerBooleanComparison modifiedEquals = null;
  private final BigIntegerBooleanComparison modifiedNotEquals = null;
  private final BigIntegerBooleanComparison modifiedLessThan = null;
  private final BigIntegerBooleanComparison modifiedGreaterThan = null;
  private final BigIntegerBooleanComparison modifiedLessThanOrEquals = null;
  private final BigIntegerBooleanComparison modifiedGreaterThanOrEquals = null;

  private final Conversion convert = new Convert();

  private final BigIntegerBinaryArithmeticOperation add = new Add();
  private final BigIntegerBinaryArithmeticOperation subtract = null;
  private final BigIntegerBinaryArithmeticOperation multiply = null;
  private final BigIntegerBinaryArithmeticOperation divide = null;
  private final BigIntegerBinaryArithmeticOperation modulo = null;
  private final BigIntegerBinaryArithmeticOperation remainderDivide = null;

  private final BigIntegerBooleanComparison equals = new Equals();
  private final BigIntegerBooleanComparison notEquals = null;
  private final BigIntegerBooleanComparison lessThan = null;
  private final BigIntegerBooleanComparison greaterThan = null;
  private final BigIntegerBooleanComparison lessThanOrEquals = null;
  private final BigIntegerBooleanComparison greaterThanOrEquals = null;

  public BigIntegerMetaClassImpl() {
    super(BigInteger.class);
  }

  public Conversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public BigIntegerBinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public BigIntegerBinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public BigIntegerBinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public BigIntegerBinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public BigIntegerBinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public BigIntegerBinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }

  public BigIntegerBooleanComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
    }
  }

  public BigIntegerBooleanComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
    }
  }

  public BigIntegerBooleanComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
    }
  }

  public BigIntegerBooleanComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
    }
  }

  public BigIntegerBooleanComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  public BigIntegerBooleanComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
