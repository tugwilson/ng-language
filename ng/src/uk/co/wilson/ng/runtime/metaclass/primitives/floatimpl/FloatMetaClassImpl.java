package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatMetaClass;


public class FloatMetaClassImpl extends BaseMetaClass implements FloatMetaClass {

  private final FloatBinaryArithmeticOperation modifiedAdd = null;
  private final FloatBinaryArithmeticOperation modifiedSubtract = null;
  private final FloatBinaryArithmeticOperation modifiedMultiply = null;
  private final FloatBinaryArithmeticOperation modifiedDivide = null;
  private final FloatBinaryArithmeticOperation modifiedModulo = null;
  private final FloatBinaryArithmeticOperation modifiedRemainderDivide = null;

  private final FloatBooleanComparison modifiedEquals = null;
  private final FloatBooleanComparison modifiedNotEquals = null;
  private final FloatBooleanComparison modifiedLessThan = null;
  private final FloatBooleanComparison modifiedGreaterThan = null;
  private final FloatBooleanComparison modifiedLessThanOrEquals = null;
  private final FloatBooleanComparison modifiedGreaterThanOrEquals = null;

  private final Conversion convert = new Convert();

  private final FloatBinaryArithmeticOperation add = new Add();
  private final FloatBinaryArithmeticOperation subtract = null;
  private final FloatBinaryArithmeticOperation multiply = null;
  private final FloatBinaryArithmeticOperation divide = null;
  private final FloatBinaryArithmeticOperation modulo = null;
  private final FloatBinaryArithmeticOperation remainderDivide = null;

  private final FloatBooleanComparison equals = new Equals();
  private final FloatBooleanComparison notEquals = null;
  private final FloatBooleanComparison lessThan = null;
  private final FloatBooleanComparison greaterThan = null;
  private final FloatBooleanComparison lessThanOrEquals = null;
  private final FloatBooleanComparison greaterThanOrEquals = null;

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
