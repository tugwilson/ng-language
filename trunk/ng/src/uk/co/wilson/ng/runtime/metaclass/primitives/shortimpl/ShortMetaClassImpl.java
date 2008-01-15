package uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl;

import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortMetaClass;

public class ShortMetaClassImpl extends BaseMetaClass implements ShortMetaClass {

  private final ShortBinaryArithmeticOperation modifiedAdd = null;
  private final ShortBinaryArithmeticOperation modifiedSubtract = null;
  private final ShortBinaryArithmeticOperation modifiedMultiply = null;
  private final ShortBinaryArithmeticOperation modifiedDivide = null;
  private final ShortBinaryArithmeticOperation modifiedModulo = null;
  private final ShortBinaryArithmeticOperation modifiedRemainderDivide = null;

  private final ShortBooleanComparison modifiedEquals = null;
  private final ShortBooleanComparison modifiedNotEquals = null;
  private final ShortBooleanComparison modifiedLessThan = null;
  private final ShortBooleanComparison modifiedGreaterThan = null;
  private final ShortBooleanComparison modifiedLessThanOrEquals = null;
  private final ShortBooleanComparison modifiedGreaterThanOrEquals = null;

  private final Conversion convert = new Convert();

  private final ShortBinaryArithmeticOperation add = new Add();
  private final ShortBinaryArithmeticOperation subtract = null;
  private final ShortBinaryArithmeticOperation multiply = null;
  private final ShortBinaryArithmeticOperation divide = null;
  private final ShortBinaryArithmeticOperation modulo = null;
  private final ShortBinaryArithmeticOperation remainderDivide = null;

  private final ShortBooleanComparison equals = new Equals();
  private final ShortBooleanComparison notEquals = null;
  private final ShortBooleanComparison lessThan = null;
  private final ShortBooleanComparison greaterThan = null;
  private final ShortBooleanComparison lessThanOrEquals = null;
  private final ShortBooleanComparison greaterThanOrEquals = null;

  public ShortMetaClassImpl() {
    super(short.class);
  }

  public Conversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public ShortBinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public ShortBinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public ShortBinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public ShortBinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public ShortBinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public ShortBinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }

  public ShortBooleanComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
    }
  }

  public ShortBooleanComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
    }
  }

  public ShortBooleanComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
    }
  }

  public ShortBooleanComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
    }
  }

  public ShortBooleanComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  public ShortBooleanComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
