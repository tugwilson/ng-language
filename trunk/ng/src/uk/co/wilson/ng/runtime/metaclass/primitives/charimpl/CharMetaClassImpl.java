package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharMetaClass;

public class CharMetaClassImpl extends BaseMetaClass implements CharMetaClass {

  private final CharBinaryArithmeticOperation modifiedAdd = null;
  private final CharBinaryArithmeticOperation modifiedSubtract = null;
  private final CharBinaryArithmeticOperation modifiedMultiply = null;
  private final CharBinaryArithmeticOperation modifiedDivide = null;
  private final CharBinaryArithmeticOperation modifiedModulo = null;
  private final CharBinaryArithmeticOperation modifiedRemainderDivide = null;

  private final CharBooleanComparison modifiedEquals = null;
  private final CharBooleanComparison modifiedNotEquals = null;
  private final CharBooleanComparison modifiedLessThan = null;
  private final CharBooleanComparison modifiedGreaterThan = null;
  private final CharBooleanComparison modifiedLessThanOrEquals = null;
  private final CharBooleanComparison modifiedGreaterThanOrEquals = null;

  private final Conversion convert = new Convert();

  private final CharBinaryArithmeticOperation add = new Add();
  private final CharBinaryArithmeticOperation subtract = new Subtract();
  private final CharBinaryArithmeticOperation multiply = new Multiply();
  private final CharBinaryArithmeticOperation divide = new Divide();
  private final CharBinaryArithmeticOperation modulo = new Modulo();
  private final CharBinaryArithmeticOperation remainderDivide = new RemainderDivide();

  private final CharBooleanComparison equals = new Equals();
  private final CharBooleanComparison notEquals = new NotEquals();
  private final CharBooleanComparison lessThan = new LessThan();
  private final CharBooleanComparison greaterThan = new GreaterThan();
  private final CharBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final CharBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public CharMetaClassImpl() {
    super(char.class);
  }

  public Conversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public CharBinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public CharBinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public CharBinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public CharBinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public CharBinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public CharBinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }

  public CharBooleanComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
    }
  }

  public CharBooleanComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
    }
  }

  public CharBooleanComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
    }
  }

  public CharBooleanComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
    }
  }

  public CharBooleanComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  public CharBooleanComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
