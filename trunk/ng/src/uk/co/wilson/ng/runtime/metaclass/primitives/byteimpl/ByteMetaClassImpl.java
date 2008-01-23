package uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl;

import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.ByteBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.ByteBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.ByteMetaClass;

public class ByteMetaClassImpl extends BaseMetaClass implements ByteMetaClass {

  private volatile ByteBinaryArithmeticOperation modifiedAdd = null;
  private volatile ByteBinaryArithmeticOperation modifiedSubtract = null;
  private volatile ByteBinaryArithmeticOperation modifiedMultiply = null;
  private volatile ByteBinaryArithmeticOperation modifiedDivide = null;
  private volatile ByteBinaryArithmeticOperation modifiedModulo = null;
  private volatile ByteBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile ByteBinaryArithmeticOperation modifiedPower = null;

  private volatile ByteBooleanComparison modifiedEquals = null;
  private volatile ByteBooleanComparison modifiedNotEquals = null;
  private volatile ByteBooleanComparison modifiedLessThan = null;
  private volatile ByteBooleanComparison modifiedGreaterThan = null;
  private volatile ByteBooleanComparison modifiedLessThanOrEquals = null;
  private volatile ByteBooleanComparison modifiedGreaterThanOrEquals = null;

  private final Conversion convert = new Convert();

  private final ByteBinaryArithmeticOperation add = new Add();
  private final ByteBinaryArithmeticOperation subtract = new Subtract();
  private final ByteBinaryArithmeticOperation multiply = new Multiply();
  private final ByteBinaryArithmeticOperation divide = new Divide();
  private final ByteBinaryArithmeticOperation modulo = new Modulo();
  private final ByteBinaryArithmeticOperation remainderDivide = new RemainderDivide();
  private final ByteBinaryArithmeticOperation power = new Power();

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
  
  public ByteBinaryArithmeticOperation power() {
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
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
