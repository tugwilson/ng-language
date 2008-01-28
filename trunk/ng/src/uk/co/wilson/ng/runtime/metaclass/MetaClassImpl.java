package uk.co.wilson.ng.runtime.metaclass;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.metaclass.BinaryArithmeticOperationNoopImpl;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.BooleanBinaryComparisonNoopImpl;
import ng.runtime.metaclass.Conversion;
import ng.runtime.metaclass.ConversionNoopImpl;

/**
 * @author John
 *
 */
public class MetaClassImpl extends BaseMetaClass {

  private final Conversion modifiedConvert = null;

  private final BinaryArithmeticOperation modifiedAdd = null;
  private final BinaryArithmeticOperation modifiedSubtract = null;
  private final BinaryArithmeticOperation modifiedMultiply = null;
  private final BinaryArithmeticOperation modifiedDivide = null;
  private final BinaryArithmeticOperation modifiedModulo = null;
  private final BinaryArithmeticOperation modifiedRemainderDivide = null;
  private final BinaryArithmeticOperation modifiedPower = null;

  private final BooleanBinaryComparison modifiedEquals = null;
  private final BooleanBinaryComparison modifiedNotEquals = null;
  private final BooleanBinaryComparison modifiedLessThan = null;
  private final BooleanBinaryComparison modifiedGreaterThan = null;
  private final BooleanBinaryComparison modifiedLessThanOrEquals = null;
  private final BooleanBinaryComparison modifiedGreaterThanOrEquals = null;

  private final Conversion convert;

  private final BinaryArithmeticOperation add;
  private final BinaryArithmeticOperation subtract;
  private final BinaryArithmeticOperation multiply;
  private final BinaryArithmeticOperation divide;
  private final BinaryArithmeticOperation modulo;
  private final BinaryArithmeticOperation remainderDivide;
  private final BinaryArithmeticOperation power;

  private final BooleanBinaryComparison equals;
  private final BooleanBinaryComparison notEquals;
  private final BooleanBinaryComparison lessThan;
  private final BooleanBinaryComparison greaterThan;
  private final BooleanBinaryComparison lessThanOrEquals;
  private final BooleanBinaryComparison greaterThanOrEquals;

  /**
   * @param theClass
   */
  public MetaClassImpl(final Class<?> theClass) {
    super(theClass);
    // TODO: introspect the class and set up the operations
    this.convert = ConversionNoopImpl.instance;

    this.add = BinaryArithmeticOperationNoopImpl.instance;
    this.subtract = BinaryArithmeticOperationNoopImpl.instance;
    this.multiply = BinaryArithmeticOperationNoopImpl.instance;
    this.divide = BinaryArithmeticOperationNoopImpl.instance;
    this.modulo = BinaryArithmeticOperationNoopImpl.instance;
    this.remainderDivide = BinaryArithmeticOperationNoopImpl.instance;
    this.power = BinaryArithmeticOperationNoopImpl.instance;

    this.equals = BooleanBinaryComparisonNoopImpl.instance;
    this.notEquals = BooleanBinaryComparisonNoopImpl.instance;
    this.lessThan = BooleanBinaryComparisonNoopImpl.instance;
    this.greaterThan = BooleanBinaryComparisonNoopImpl.instance;
    this.lessThanOrEquals = BooleanBinaryComparisonNoopImpl.instance;
    this.greaterThanOrEquals = BooleanBinaryComparisonNoopImpl.instance;
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

  public BinaryArithmeticOperation power() {
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
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
