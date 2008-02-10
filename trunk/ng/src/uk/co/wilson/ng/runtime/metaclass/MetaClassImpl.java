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

  protected volatile Conversion modifiedConvert = null;

  protected volatile BinaryArithmeticOperation modifiedAdd = null;
  protected volatile BinaryArithmeticOperation modifiedSubtract = null;
  protected volatile BinaryArithmeticOperation modifiedMultiply = null;
  protected volatile BinaryArithmeticOperation modifiedDivide = null;
  protected volatile BinaryArithmeticOperation modifiedModulo = null;
  protected volatile BinaryArithmeticOperation modifiedRemainderDivide = null;
  protected volatile BinaryArithmeticOperation modifiedPower = null;

  protected volatile BooleanBinaryComparison modifiedEquals = null;
  protected volatile BooleanBinaryComparison modifiedNotEquals = null;
  protected volatile BooleanBinaryComparison modifiedLessThan = null;
  protected volatile BooleanBinaryComparison modifiedGreaterThan = null;
  protected volatile BooleanBinaryComparison modifiedLessThanOrEquals = null;
  protected volatile BooleanBinaryComparison modifiedGreaterThanOrEquals = null;

  protected final Conversion convert;

  protected final BinaryArithmeticOperation add;
  protected final BinaryArithmeticOperation subtract;
  protected final BinaryArithmeticOperation multiply;
  protected final BinaryArithmeticOperation divide;
  protected final BinaryArithmeticOperation modulo;
  protected final BinaryArithmeticOperation remainderDivide;
  protected final BinaryArithmeticOperation power;

  protected final BooleanBinaryComparison equals;
  protected final BooleanBinaryComparison notEquals;
  protected final BooleanBinaryComparison lessThan;
  protected final BooleanBinaryComparison greaterThan;
  protected final BooleanBinaryComparison lessThanOrEquals;
  protected final BooleanBinaryComparison greaterThanOrEquals;

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

  public void modifyConvert(final Conversion modifiedConvert) {
    this.modifiedConvert = modifiedConvert;
  }

  public Conversion getOriginalConvert() {
    return this.convert;
  }

  public Conversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final BinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public BinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public BinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public void modifySubtract(final BinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public BinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public BinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public void modifyMultiply(final BinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public BinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public BinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public void modifyDivide(final BinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public BinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public BinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public void modifyModulo(final BinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public BinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public BinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public void modifyRemainderDivide(final BinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public BinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public BinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }

  public void modifyPower(final BinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public BinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public BinaryArithmeticOperation power() {
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
    }
  }

  public void modifyEquals(final BooleanBinaryComparison modifiedEquals) {
    this.modifiedEquals = modifiedEquals;
  }

  public BooleanBinaryComparison getOriginalEquals() {
    return this.equals;
  }

  public BooleanBinaryComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
    }
  }

  public void modifyNotEquals(final BooleanBinaryComparison modifiedNotEquals) {
    this.modifiedNotEquals = modifiedNotEquals;
  }

  public BooleanBinaryComparison getOriginalNotEquals() {
    return this.notEquals;
  }

  public BooleanBinaryComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
    }
  }

  public void modifyLessThan(final BooleanBinaryComparison modifiedLessThan) {
    this.modifiedLessThan = modifiedLessThan;
  }

  public BooleanBinaryComparison getOriginalLessThan() {
    return this.lessThan;
  }

  public BooleanBinaryComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
    }
  }

  public void modifyGreaterThan(final BooleanBinaryComparison modifiedGreaterThan) {
    this.modifiedGreaterThan = modifiedGreaterThan;
  }

  public BooleanBinaryComparison getOriginalGreaterThan() {
    return this.greaterThan;
  }

  public BooleanBinaryComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
    }
  }

  public void modifyLessThanOrEquals(final BooleanBinaryComparison modifiedLessThanOrEquals) {
    this.modifiedLessThanOrEquals = modifiedLessThanOrEquals;
  }

  public BooleanBinaryComparison getOriginalLessThanOrEquals() {
    return this.lessThanOrEquals;
  }

  public BooleanBinaryComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  public void modifyGreaterThanOrEquals(final BooleanBinaryComparison modifiedGreaterThanOrEquals) {
    this.modifiedGreaterThanOrEquals = modifiedGreaterThanOrEquals;
  }

  public BooleanBinaryComparison getOriginalGreaterThanOrEquals() {
    return this.greaterThanOrEquals;
  }

  public BooleanBinaryComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
