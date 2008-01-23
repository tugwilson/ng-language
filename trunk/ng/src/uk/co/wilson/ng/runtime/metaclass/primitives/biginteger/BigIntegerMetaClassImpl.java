package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerMetaClass;

public class BigIntegerMetaClassImpl extends BaseMetaClass implements BigIntegerMetaClass {

  private volatile BigIntegerBinaryArithmeticOperation modifiedAdd = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedSubtract = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedMultiply = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedDivide = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedModulo = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedPower = null;

  private volatile BigIntegerBooleanComparison modifiedEquals = null;
  private volatile BigIntegerBooleanComparison modifiedNotEquals = null;
  private volatile BigIntegerBooleanComparison modifiedLessThan = null;
  private volatile BigIntegerBooleanComparison modifiedGreaterThan = null;
  private volatile BigIntegerBooleanComparison modifiedLessThanOrEquals = null;
  private volatile BigIntegerBooleanComparison modifiedGreaterThanOrEquals = null;

  private final Conversion convert = new Convert();

  private final BigIntegerBinaryArithmeticOperation add = new Add();
  private final BigIntegerBinaryArithmeticOperation subtract = new Subtract();
  private final BigIntegerBinaryArithmeticOperation multiply = new Multiply();
  private final BigIntegerBinaryArithmeticOperation divide = new Divide();
  private final BigIntegerBinaryArithmeticOperation modulo = new Modulo();
  private final BigIntegerBinaryArithmeticOperation remainderDivide = new RemainderDivide();
  private final BigIntegerBinaryArithmeticOperation power = new Power();

  private final BigIntegerBooleanComparison equals = new Equals();
  private final BigIntegerBooleanComparison notEquals = new NotEquals();
  private final BigIntegerBooleanComparison lessThan = new LessThan();
  private final BigIntegerBooleanComparison greaterThan = new GreaterThan();
  private final BigIntegerBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final BigIntegerBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

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
  
  public BigIntegerBinaryArithmeticOperation power() {
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
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
