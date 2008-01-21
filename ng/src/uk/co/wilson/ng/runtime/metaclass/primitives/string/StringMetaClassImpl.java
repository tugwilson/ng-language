package uk.co.wilson.ng.runtime.metaclass.primitives.string;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.metaclass.BinaryArithmeticOperationNoopImpl;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import ng.runtime.metaclass.ConversionNoopImpl;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.StringMetaClass;

/**
 * @author John
 *
 */
public class StringMetaClassImpl extends BaseMetaClass implements StringMetaClass {

  private final BinaryArithmeticOperation modifiedAdd = null;
  private final BinaryArithmeticOperation modifiedSubtract = null;
  private final BinaryArithmeticOperation modifiedMultiply = null;
  private final BinaryArithmeticOperation modifiedDivide = null;
  private final BinaryArithmeticOperation modifiedModulo = null;

  private final BinaryArithmeticOperation modifiedRemainderDivide = null;
  private final BooleanBinaryComparison modifiedEquals = null;
  private final BooleanBinaryComparison modifiedNotEquals = null;
  private final BooleanBinaryComparison modifiedLessThan = null;
  private final BooleanBinaryComparison modifiedGreaterThan = null;
  private final BooleanBinaryComparison modifiedLessThanOrEquals = null;
  private final BooleanBinaryComparison modifiedGreaterThanOrEquals = null;

  private final Conversion convert = ConversionNoopImpl.instance;

  private final BinaryArithmeticOperation add = new Add();
  private final BinaryArithmeticOperation subtract = BinaryArithmeticOperationNoopImpl.instance;
  private final BinaryArithmeticOperation multiply = BinaryArithmeticOperationNoopImpl.instance;
  private final BinaryArithmeticOperation divide = BinaryArithmeticOperationNoopImpl.instance;
  private final BinaryArithmeticOperation modulo = BinaryArithmeticOperationNoopImpl.instance;
  private final BinaryArithmeticOperation remainderDivide = BinaryArithmeticOperationNoopImpl.instance;

  private final BooleanBinaryComparison equals = null;
  private final BooleanBinaryComparison notEquals = null;
  private final BooleanBinaryComparison lessThan = null;
  private final BooleanBinaryComparison greaterThan = null;
  private final BooleanBinaryComparison lessThanOrEquals = null;
  private final BooleanBinaryComparison greaterThanOrEquals = null;
  
  public StringMetaClassImpl() {
    super(String.class);
  }

  public Conversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public BinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public BinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public BinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public BinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public BinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public BinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }

  public BooleanBinaryComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
    }
  }

  public BooleanBinaryComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
    }
  }

  public BooleanBinaryComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
    }
  }

  public BooleanBinaryComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
    }
  }

  public BooleanBinaryComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  public BooleanBinaryComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
