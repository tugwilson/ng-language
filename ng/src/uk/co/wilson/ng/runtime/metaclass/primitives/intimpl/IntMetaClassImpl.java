package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntConversion;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntMetaClass;

public class IntMetaClassImpl extends BaseMetaClass implements IntMetaClass {
  private final IntConversion modifiedConvert = null;

  private final IntBinaryArithmeticOperation modifiedAdd = null;
  private final IntBinaryArithmeticOperation modifiedSubtract = null;
  private final IntBinaryArithmeticOperation modifiedMultiply = null;
  private final IntBinaryArithmeticOperation modifiedDivide = null;
  private final IntBinaryArithmeticOperation modifiedModulo = null;
  private final IntBinaryArithmeticOperation modifiedRemainderDivide = null;
  private final IntBinaryArithmeticOperation modifiedPower = null;

  private final IntBooleanComparison modifiedEquals = null;
  private final IntBooleanComparison modifiedNotEquals = null;
  private final IntBooleanComparison modifiedLessThan = null;
  private final IntBooleanComparison modifiedGreaterThan = null;
  private final IntBooleanComparison modifiedLessThanOrEquals = null;
  private final IntBooleanComparison modifiedGreaterThanOrEquals = null;

  private final IntConversion convert = new Convert();

  private final IntBinaryArithmeticOperation add = new Add();
  private final IntBinaryArithmeticOperation subtract = new Subtract();
  private final IntBinaryArithmeticOperation multiply = new Multiply();
  private final IntBinaryArithmeticOperation divide = new Divide();
  private final IntBinaryArithmeticOperation modulo = new Modulo();
  private final IntBinaryArithmeticOperation remainderDivide = new RemainderDivide();
  private final IntBinaryArithmeticOperation power = new Power();

  private final IntBooleanComparison equals = new Equals();
  private final IntBooleanComparison notEquals = new NotEquals();
  private final IntBooleanComparison lessThan = new LessThan();
  private final IntBooleanComparison greaterThan = new GreaterThan();
  private final IntBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final IntBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public IntMetaClassImpl() {
    super(int.class);
  }

  public IntConversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public IntBinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public IntBinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public IntBinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public IntBinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public IntBinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public IntBinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }

  public IntBinaryArithmeticOperation power() {
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
    }
  }

  public IntBooleanComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
    }
  }

  public IntBooleanComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
    }
  }

  public IntBooleanComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
    }
  }

  public IntBooleanComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
    }
  }

  public IntBooleanComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  public IntBooleanComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
