package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatMetaClass;


public class FloatMetaClassImpl extends BaseMetaClass implements FloatMetaClass {

  private volatile FloatBinaryArithmeticOperation modifiedAdd = null;
  private volatile FloatBinaryArithmeticOperation modifiedSubtract = null;
  private volatile FloatBinaryArithmeticOperation modifiedMultiply = null;
  private volatile FloatBinaryArithmeticOperation modifiedDivide = null;
  private volatile FloatBinaryArithmeticOperation modifiedModulo = null;
  private volatile FloatBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile FloatBinaryArithmeticOperation modifiedPower = null;

  private volatile FloatBooleanComparison modifiedEquals = null;
  private volatile FloatBooleanComparison modifiedNotEquals = null;
  private volatile FloatBooleanComparison modifiedLessThan = null;
  private volatile FloatBooleanComparison modifiedGreaterThan = null;
  private volatile FloatBooleanComparison modifiedLessThanOrEquals = null;
  private volatile FloatBooleanComparison modifiedGreaterThanOrEquals = null;

  private final Conversion convert = new Convert();

  private final FloatBinaryArithmeticOperation add = new Add();
  private final FloatBinaryArithmeticOperation subtract = new Subtract();
  private final FloatBinaryArithmeticOperation multiply = new Multiply();
  private final FloatBinaryArithmeticOperation divide = new Divide();
  private final FloatBinaryArithmeticOperation modulo = new Modulo();
  private final FloatBinaryArithmeticOperation remainderDivide = new RemainderDivide();
  private final FloatBinaryArithmeticOperation power = new Power();

  private final FloatBooleanComparison equals = new Equals();
  private final FloatBooleanComparison notEquals = new NotEquals();
  private final FloatBooleanComparison lessThan = new LessThan();
  private final FloatBooleanComparison greaterThan = new GreaterThan();
  private final FloatBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final FloatBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public FloatMetaClassImpl() {
    super(float.class);
  }

  public Conversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public FloatBinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public FloatBinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public FloatBinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public FloatBinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public FloatBinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public FloatBinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }
  
  public FloatBinaryArithmeticOperation power() {
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
    }
  }

  public FloatBooleanComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
    }
  }

  public FloatBooleanComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
    }
  }

  public FloatBooleanComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
    }
  }

  public FloatBooleanComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
    }
  }

  public FloatBooleanComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  public FloatBooleanComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
