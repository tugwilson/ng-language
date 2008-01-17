package uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl;

import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.ByteBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.ByteBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.ByteMetaClass;

public class ByteMetaClassImpl extends BaseMetaClass implements ByteMetaClass {

  private final ByteBinaryArithmeticOperation modifiedAdd = null;
  private final ByteBinaryArithmeticOperation modifiedSubtract = null;
  private final ByteBinaryArithmeticOperation modifiedMultiply = null;
  private final ByteBinaryArithmeticOperation modifiedDivide = null;
  private final ByteBinaryArithmeticOperation modifiedModulo = null;
  private final ByteBinaryArithmeticOperation modifiedRemainderDivide = null;

  private final ByteBooleanComparison modifiedEquals = null;
  private final ByteBooleanComparison modifiedNotEquals = null;
  private final ByteBooleanComparison modifiedLessThan = null;
  private final ByteBooleanComparison modifiedGreaterThan = null;
  private final ByteBooleanComparison modifiedLessThanOrEquals = null;
  private final ByteBooleanComparison modifiedGreaterThanOrEquals = null;

  private final Conversion convert = new Convert();

  private final ByteBinaryArithmeticOperation add = new Add();
  private final ByteBinaryArithmeticOperation subtract = new Subtract();
  private final ByteBinaryArithmeticOperation multiply = new Multiply();
  private final ByteBinaryArithmeticOperation divide = new Divide();
  private final ByteBinaryArithmeticOperation modulo = new Modulo();
  private final ByteBinaryArithmeticOperation remainderDivide = null;

  private final ByteBooleanComparison equals = new Equals();
  private final ByteBooleanComparison notEquals = new NotEquals();
  private final ByteBooleanComparison lessThan = new LessThan();
  private final ByteBooleanComparison greaterThan = new GreaterThan();
  private final ByteBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final ByteBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public ByteMetaClassImpl() {
    super(byte.class);
  }

  public Conversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public ByteBinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public ByteBinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public ByteBinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public ByteBinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public ByteBinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public ByteBinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }

  public ByteBooleanComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
    }
  }

  public ByteBooleanComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
    }
  }

  public ByteBooleanComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
    }
  }

  public ByteBooleanComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
    }
  }

  public ByteBooleanComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  public ByteBooleanComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
