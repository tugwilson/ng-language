package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntMetaClass;

public class IntMetaClassImpl extends BaseMetaClass implements IntMetaClass {

  private final IntBinaryArithmeticOperation modifiedAdd = null;
  private final IntBinaryArithmeticOperation modifiedSubtract = null;
  private final IntBinaryArithmeticOperation modifiedMultiply = null;
  private final IntBinaryArithmeticOperation modifiedDivide = null;
  private final IntBinaryArithmeticOperation modifiedModulo = null;
  private final IntBinaryArithmeticOperation modifiedRemainderDivide = null;

  private final IntBooleanComparison modifiedEquals = null;
  private final IntBooleanComparison modifiedNotEquals = null;
  private final IntBooleanComparison modifiedLessThan = null;
  private final IntBooleanComparison modifiedGreaterThan = null;
  private final IntBooleanComparison modifiedLessThanOrEquals = null;
  private final IntBooleanComparison modifiedGreaterThanOrEquals = null;

  private final Conversion convert = new Convert();

  private final IntBinaryArithmeticOperation add = new Add();
  private final IntBinaryArithmeticOperation subtract = null;
  private final IntBinaryArithmeticOperation multiply = null;
  private final IntBinaryArithmeticOperation divide = null;
  private final IntBinaryArithmeticOperation modulo = null;
  private final IntBinaryArithmeticOperation remainderDivide = null;

  private final IntBooleanComparison equals = new Equals();
  private final IntBooleanComparison notEquals = null;
  private final IntBooleanComparison lessThan = null;
  private final IntBooleanComparison greaterThan = null;
  private final IntBooleanComparison lessThanOrEquals = null;
  private final IntBooleanComparison greaterThanOrEquals = null;

  public IntMetaClassImpl() {
    super(int.class);
  }

  public Conversion convert() {
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
