package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;

import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalMetaClass;

public class BigDecimalMetaClassImpl extends BaseMetaClass implements BigDecimalMetaClass {

  private volatile BigDecimalBinaryArithmeticOperation modifiedAdd = null;
  private volatile BigDecimalBinaryArithmeticOperation modifiedSubtract = null;
  private volatile BigDecimalBinaryArithmeticOperation modifiedMultiply = null;
  private volatile BigDecimalBinaryArithmeticOperation modifiedDivide = null;
  private volatile BigDecimalBinaryArithmeticOperation modifiedModulo = null;

  private volatile BigDecimalBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile BigDecimalBooleanComparison modifiedEquals = null;
  private volatile BigDecimalBooleanComparison modifiedNotEquals = null;
  private volatile BigDecimalBooleanComparison modifiedLessThan = null;
  private volatile BigDecimalBooleanComparison modifiedGreaterThan = null;
  private volatile BigDecimalBooleanComparison modifiedLessThanOrEquals = null;
  private volatile BigDecimalBooleanComparison modifiedGreaterThanOrEquals = null;

  private final Conversion convert = new Convert();

  private final BigDecimalBinaryArithmeticOperation add = new Add();
  private final BigDecimalBinaryArithmeticOperation subtract = new Subtract();
  private final BigDecimalBinaryArithmeticOperation multiply = new Multiply();
  private final BigDecimalBinaryArithmeticOperation divide = new Divide();
  private final BigDecimalBinaryArithmeticOperation modulo = new Modulo();
  private final BigDecimalBinaryArithmeticOperation remainderDivide = null;

  private final BigDecimalBooleanComparison equals = new Equals();
  private final BigDecimalBooleanComparison notEquals = new NotEquals();
  private final BigDecimalBooleanComparison lessThan = new LessThan();
  private final BigDecimalBooleanComparison greaterThan = new GreaterThan();
  private final BigDecimalBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final BigDecimalBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

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
