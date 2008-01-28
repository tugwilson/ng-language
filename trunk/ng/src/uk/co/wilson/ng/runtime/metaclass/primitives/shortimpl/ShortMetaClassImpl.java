package uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl;

import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortConversion;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortMetaClass;

public class ShortMetaClassImpl extends BaseMetaClass implements ShortMetaClass {
  private final ShortConversion modifiedConvert = null;

  private final ShortBinaryArithmeticOperation modifiedAdd = null;
  private final ShortBinaryArithmeticOperation modifiedSubtract = null;
  private final ShortBinaryArithmeticOperation modifiedMultiply = null;
  private final ShortBinaryArithmeticOperation modifiedDivide = null;
  private final ShortBinaryArithmeticOperation modifiedModulo = null;
  private final ShortBinaryArithmeticOperation modifiedRemainderDivide = null;
  private final ShortBinaryArithmeticOperation modifiedPower = null;

  private final ShortBooleanComparison modifiedEquals = null;
  private final ShortBooleanComparison modifiedNotEquals = null;
  private final ShortBooleanComparison modifiedLessThan = null;
  private final ShortBooleanComparison modifiedGreaterThan = null;
  private final ShortBooleanComparison modifiedLessThanOrEquals = null;
  private final ShortBooleanComparison modifiedGreaterThanOrEquals = null;

  private final ShortConversion convert = new Convert();

  private final ShortBinaryArithmeticOperation add = new Add();
  private final ShortBinaryArithmeticOperation subtract = new Subtract();
  private final ShortBinaryArithmeticOperation multiply = new Multiply();
  private final ShortBinaryArithmeticOperation divide = new Divide();
  private final ShortBinaryArithmeticOperation modulo = new Modulo();
  private final ShortBinaryArithmeticOperation remainderDivide = new RemainderDivide();
  private final ShortBinaryArithmeticOperation power = new Power();

  private final ShortBooleanComparison equals = new Equals();
  private final ShortBooleanComparison notEquals = new NotEquals();
  private final ShortBooleanComparison lessThan = new LessThan();
  private final ShortBooleanComparison greaterThan = new GreaterThan();
  private final ShortBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final ShortBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public ShortMetaClassImpl() {
    super(short.class);
  }

  public ShortConversion convert() {
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

  public ShortBinaryArithmeticOperation power() {
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
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
