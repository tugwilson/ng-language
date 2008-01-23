package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongMetaClass;

public class LongMetaClassImpl extends BaseMetaClass implements LongMetaClass {

  private volatile LongBinaryArithmeticOperation modifiedAdd = null;
  private volatile LongBinaryArithmeticOperation modifiedSubtract = null;
  private volatile LongBinaryArithmeticOperation modifiedMultiply = null;
  private volatile LongBinaryArithmeticOperation modifiedDivide = null;
  private volatile LongBinaryArithmeticOperation modifiedModulo = null;
  private volatile LongBinaryArithmeticOperation modifiedRemainderDivide = null;

  private volatile LongBooleanComparison modifiedEquals = null;
  private volatile LongBooleanComparison modifiedNotEquals = null;
  private volatile LongBooleanComparison modifiedLessThan = null;
  private volatile LongBooleanComparison modifiedGreaterThan = null;
  private volatile LongBooleanComparison modifiedLessThanOrEquals = null;
  private volatile LongBooleanComparison modifiedGreaterThanOrEquals = null;

  private final Conversion convert = new Convert();

  private final LongBinaryArithmeticOperation add = new Add();
  private final LongBinaryArithmeticOperation subtract = new Subtract();
  private final LongBinaryArithmeticOperation multiply = new Multiply();
  private final LongBinaryArithmeticOperation divide = new Divide();
  private final LongBinaryArithmeticOperation modulo = new Modulo();
  private final LongBinaryArithmeticOperation remainderDivide = new RemainderDivide();

  private final LongBooleanComparison equals = new Equals();
  private final LongBooleanComparison notEquals = new NotEquals();
  private final LongBooleanComparison lessThan = new LessThan();
  private final LongBooleanComparison greaterThan = new GreaterThan();
  private final LongBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final LongBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

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
  
  public LongBinaryArithmeticOperation power() {
    // TODO Auto-generated method stub
    return null;
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
