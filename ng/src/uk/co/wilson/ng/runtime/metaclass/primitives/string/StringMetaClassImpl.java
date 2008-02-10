package uk.co.wilson.ng.runtime.metaclass.primitives.string;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.metaclass.BinaryArithmeticOperationNoopImpl;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import ng.runtime.metaclass.ConversionNoopImpl;
import uk.co.wilson.ng.runtime.metaclass.MetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.StringMetaClass;

/**
 * @author John
 *
 */
public class StringMetaClassImpl extends MetaClassImpl implements StringMetaClass {
  private final Conversion convert = ConversionNoopImpl.instance;

  private final BinaryArithmeticOperation add = new Add();
  private final BinaryArithmeticOperation subtract = BinaryArithmeticOperationNoopImpl.instance;
  private final BinaryArithmeticOperation multiply = BinaryArithmeticOperationNoopImpl.instance;
  private final BinaryArithmeticOperation divide = BinaryArithmeticOperationNoopImpl.instance;
  private final BinaryArithmeticOperation modulo = BinaryArithmeticOperationNoopImpl.instance;
  private final BinaryArithmeticOperation remainderDivide = BinaryArithmeticOperationNoopImpl.instance;
  private final BinaryArithmeticOperation power = BinaryArithmeticOperationNoopImpl.instance;

  private final BooleanBinaryComparison equals = null;
  private final BooleanBinaryComparison notEquals = null;
  private final BooleanBinaryComparison lessThan = null;
  private final BooleanBinaryComparison greaterThan = null;
  private final BooleanBinaryComparison lessThanOrEquals = null;
  private final BooleanBinaryComparison greaterThanOrEquals = null;

  public StringMetaClassImpl() {
    super(String.class);
  }

  @Override
  public Conversion getOriginalConvert() {
    return this.convert;
  }

  @Override
  public Conversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  @Override
  public BinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  @Override
  public BinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  @Override
  public BinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  @Override
  public BinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  @Override
  public BinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  @Override
  public BinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  @Override
  public BinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  @Override
  public BinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  @Override
  public BinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  @Override
  public BinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  @Override
  public BinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  @Override
  public BinaryArithmeticOperation power() {
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
    }
  }

  @Override
  public BinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  @Override
  public BinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }

  @Override
  public BooleanBinaryComparison getOriginalEquals() {
    return this.equals;
  }

  @Override
  public BooleanBinaryComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
    }
  }

  @Override
  public BooleanBinaryComparison getOriginalNotEquals() {
    return this.notEquals;
  }

  @Override
  public BooleanBinaryComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
    }
  }

  @Override
  public BooleanBinaryComparison getOriginalLessThan() {
    return this.lessThan;
  }

  @Override
  public BooleanBinaryComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
    }
  }

  @Override
  public BooleanBinaryComparison getOriginalGreaterThan() {
    return this.greaterThan;
  }

  @Override
  public BooleanBinaryComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
    }
  }

  @Override
  public BooleanBinaryComparison getOriginalLessThanOrEquals() {
    return this.lessThanOrEquals;
  }

  @Override
  public BooleanBinaryComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  @Override
  public BooleanBinaryComparison getOriginalGreaterThanOrEquals() {
    return this.greaterThanOrEquals;
  }

  @Override
  public BooleanBinaryComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
