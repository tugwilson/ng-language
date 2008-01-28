package uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl;

import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.DoubleBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.DoubleBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.DoubleMetaClass;

public class DoubleMetaClassImpl extends BaseMetaClass implements DoubleMetaClass {

  private volatile DoubleBinaryArithmeticOperation modifiedAdd = null;
  private volatile DoubleBinaryArithmeticOperation modifiedSubtract = null;
  private volatile DoubleBinaryArithmeticOperation modifiedMultiply = null;
  private volatile DoubleBinaryArithmeticOperation modifiedDivide = null;
  private volatile DoubleBinaryArithmeticOperation modifiedModulo = null;
  private volatile DoubleBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile DoubleBinaryArithmeticOperation modifiedPower = null;

  private volatile DoubleBooleanComparison modifiedEquals = null;
  private volatile DoubleBooleanComparison modifiedNotEquals = null;
  private volatile DoubleBooleanComparison modifiedLessThan = null;
  private volatile DoubleBooleanComparison modifiedGreaterThan = null;
  private volatile DoubleBooleanComparison modifiedLessThanOrEquals = null;
  private volatile DoubleBooleanComparison modifiedGreaterThanOrEquals = null;

  private final Conversion convert = new Convert();

  private final DoubleBinaryArithmeticOperation add = new Add();
  private final DoubleBinaryArithmeticOperation subtract = new Subtract();
  private final DoubleBinaryArithmeticOperation multiply = new Multiply();
  private final DoubleBinaryArithmeticOperation divide = new Divide();
  private final DoubleBinaryArithmeticOperation modulo = new Modulo();
  private final DoubleBinaryArithmeticOperation remainderDivide = new RemainderDivide();
  private final DoubleBinaryArithmeticOperation power = new Power();

  private final DoubleBooleanComparison equals = new Equals();
  private final DoubleBooleanComparison notEquals = new NotEquals();
  private final DoubleBooleanComparison lessThan = new LessThan();
  private final DoubleBooleanComparison greaterThan = new GreaterThan();
  private final DoubleBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final DoubleBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public DoubleMetaClassImpl() {
    super(double.class);
  }

  public Conversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public DoubleBinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public DoubleBinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public DoubleBinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public DoubleBinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public DoubleBinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public DoubleBinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }
  
  public DoubleBinaryArithmeticOperation power() {
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
    }
  }

  public DoubleBooleanComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
    }
  }

  public DoubleBooleanComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
    }
  }

  public DoubleBooleanComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
    }
  }

  public DoubleBooleanComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
    }
  }

  public DoubleBooleanComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  public DoubleBooleanComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}