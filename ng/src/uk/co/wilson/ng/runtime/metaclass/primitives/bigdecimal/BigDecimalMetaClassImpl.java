package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;

import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalMetaClass;

public class BigDecimalMetaClassImpl extends BaseMetaClass implements BigDecimalMetaClass {

  private final BigDecimalBinaryArithmeticOperation modifiedAdd = null;

  private final BigDecimalBinaryArithmeticOperation modifiedSubtract = null;

  private final BigDecimalBinaryArithmeticOperation modifiedMultiply = null;

  private final BigDecimalBinaryArithmeticOperation modifiedDivide = null;

  private final BigDecimalBinaryArithmeticOperation modifiedModulo = null;

  private final BigDecimalBinaryArithmeticOperation modifiedRemainderDivide = null;

  private final BigDecimalBooleanComparison modifiedEquals = null;

  private final BigDecimalBooleanComparison modifiedNotEquals = null;

  private final BigDecimalBooleanComparison modifiedLessThan = null;

  private final BigDecimalBooleanComparison modifiedGreaterThan = null;

  private final BigDecimalBooleanComparison modifiedLessThanOrEquals = null;

  private final BigDecimalBooleanComparison modifiedGreaterThanOrEquals = null;

  private final Conversion convert = new Convert();

  private final BigDecimalBinaryArithmeticOperation add = new Add();

  private final BigDecimalBinaryArithmeticOperation subtract = null;

  private final BigDecimalBinaryArithmeticOperation multiply = null;

  private final BigDecimalBinaryArithmeticOperation divide = null;

  private final BigDecimalBinaryArithmeticOperation modulo = null;

  private final BigDecimalBinaryArithmeticOperation remainderDivide = null;

  private final BigDecimalBooleanComparison equals = new Equals();

  private final BigDecimalBooleanComparison notEquals = null;

  private final BigDecimalBooleanComparison lessThan = null;

  private final BigDecimalBooleanComparison greaterThan = null;

  private final BigDecimalBooleanComparison lessThanOrEquals = null;

  private final BigDecimalBooleanComparison greaterThanOrEquals = null;

  public BigDecimalMetaClassImpl() {
    super(BigDecimal.class);
  }

  public Conversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public BigDecimalBinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public BigDecimalBinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public BigDecimalBinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public BigDecimalBinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public BigDecimalBinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public BigDecimalBinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }

  public BigDecimalBooleanComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
    }
  }

  public BigDecimalBooleanComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
    }
  }

  public BigDecimalBooleanComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
    }
  }

  public BigDecimalBooleanComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
    }
  }

  public BigDecimalBooleanComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  public BigDecimalBooleanComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
