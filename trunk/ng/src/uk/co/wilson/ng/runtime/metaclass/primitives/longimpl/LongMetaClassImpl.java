package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongMetaClass;

public class LongMetaClassImpl extends BaseMetaClass implements LongMetaClass {

  private final LongBinaryArithmeticOperation modifiedAdd = null;
  private final LongBinaryArithmeticOperation modifiedSubtract = null;
  private final LongBinaryArithmeticOperation modifiedMultiply = null;
  private final LongBinaryArithmeticOperation modifiedDivide = null;
  private final LongBinaryArithmeticOperation modifiedModulo = null;
  private final LongBinaryArithmeticOperation modifiedRemainderDivide = null;

  private final LongBooleanComparison modifiedEquals = null;
  private final LongBooleanComparison modifiedNotEquals = null;
  private final LongBooleanComparison modifiedLessThan = null;
  private final LongBooleanComparison modifiedGreaterThan = null;
  private final LongBooleanComparison modifiedLessThanOrEquals = null;
  private final LongBooleanComparison modifiedGreaterThanOrEquals = null;

  private final Conversion convert = new Convert();

  private final LongBinaryArithmeticOperation add = new Add();
  private final LongBinaryArithmeticOperation subtract = null;
  private final LongBinaryArithmeticOperation multiply = null;
  private final LongBinaryArithmeticOperation divide = null;
  private final LongBinaryArithmeticOperation modulo = null;
  private final LongBinaryArithmeticOperation remainderDivide = null;

  private final LongBooleanComparison equals = new Equals();
  private final LongBooleanComparison notEquals = null;
  private final LongBooleanComparison lessThan = null;
  private final LongBooleanComparison greaterThan = null;
  private final LongBooleanComparison lessThanOrEquals = null;
  private final LongBooleanComparison greaterThanOrEquals = null;

  public LongMetaClassImpl() {
    super(long.class);
  }

  public Conversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public LongBinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public LongBinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public LongBinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public LongBinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public LongBinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public LongBinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }

  public LongBooleanComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
    }
  }

  public LongBooleanComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
    }
  }

  public LongBooleanComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
    }
  }

  public LongBooleanComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
    }
  }

  public LongBooleanComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  public LongBooleanComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
