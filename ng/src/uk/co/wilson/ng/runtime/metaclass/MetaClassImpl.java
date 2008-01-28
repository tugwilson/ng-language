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

  private volatile Conversion modifiedConvert = null;

  private volatile BinaryArithmeticOperation modifiedAdd = null;
  private volatile BinaryArithmeticOperation modifiedSubtract = null;
  private volatile BinaryArithmeticOperation modifiedMultiply = null;
  private volatile BinaryArithmeticOperation modifiedDivide = null;
  private volatile BinaryArithmeticOperation modifiedModulo = null;
  private volatile BinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile BinaryArithmeticOperation modifiedPower = null;

  private volatile BooleanBinaryComparison modifiedEquals = null;
  private volatile BooleanBinaryComparison modifiedNotEquals = null;
  private volatile BooleanBinaryComparison modifiedLessThan = null;
  private volatile BooleanBinaryComparison modifiedGreaterThan = null;
  private volatile BooleanBinaryComparison modifiedLessThanOrEquals = null;
  private volatile BooleanBinaryComparison modifiedGreaterThanOrEquals = null;

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
  public MetaClassImpl(Class<?> theClass) {
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
