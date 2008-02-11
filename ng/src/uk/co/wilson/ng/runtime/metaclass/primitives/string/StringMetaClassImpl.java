package uk.co.wilson.ng.runtime.metaclass.primitives.string;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.metaclass.ArithmeticBinaryOperationNoopImpl;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import ng.runtime.metaclass.ConversionNoopImpl;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.MetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.StringMetaClass;

/**
 * @author John
 *
 */
public class StringMetaClassImpl extends MetaClassImpl implements StringMetaClass {
  private final Conversion convert = ConversionNoopImpl.instance;

  private final ArithmeticBinaryOperation add = new Add();
  private final ArithmeticBinaryOperation subtract = ArithmeticBinaryOperationNoopImpl.instance;
  private final ArithmeticBinaryOperation multiply = ArithmeticBinaryOperationNoopImpl.instance;
  private final ArithmeticBinaryOperation divide = ArithmeticBinaryOperationNoopImpl.instance;
  private final ArithmeticBinaryOperation modulo = ArithmeticBinaryOperationNoopImpl.instance;
  private final ArithmeticBinaryOperation remainderDivide = ArithmeticBinaryOperationNoopImpl.instance;
  private final ArithmeticBinaryOperation power = ArithmeticBinaryOperationNoopImpl.instance;

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
  public ArithmeticBinaryOperation getOriginalAdd() {
    return this.add;
  }

  @Override
  public ArithmeticBinaryOperation add(BinaryArithmeticOperation binaryArithmeticOperation) {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  @Override
  public ArithmeticBinaryOperation getOriginalSubtract() {
    return this.subtract;
  }

  @Override
  public ArithmeticBinaryOperation subtract(BinaryArithmeticOperation binaryArithmeticOperation) {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  @Override
  public ArithmeticBinaryOperation getOriginalMultiply() {
    return this.multiply;
  }

  @Override
  public ArithmeticBinaryOperation multiply(BinaryArithmeticOperation binaryArithmeticOperation) {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  @Override
  public ArithmeticBinaryOperation getOriginalDivide() {
    return this.divide;
  }

  @Override
  public ArithmeticBinaryOperation divide(BinaryArithmeticOperation binaryArithmeticOperation) {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  @Override
  public ArithmeticBinaryOperation getOriginalModulo() {
    return this.modulo;
  }

  @Override
  public ArithmeticBinaryOperation modulo(BinaryArithmeticOperation binaryArithmeticOperation) {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  @Override
  public ArithmeticBinaryOperation getOriginalPower() {
    return this.power;
  }

  @Override
  public ArithmeticBinaryOperation power(BinaryArithmeticOperation binaryArithmeticOperation) {
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
    }
  }

  @Override
  public ArithmeticBinaryOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  @Override
  public ArithmeticBinaryOperation remainderDivide(BinaryArithmeticOperation binaryArithmeticOperation) {
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
  public BooleanBinaryComparison equals(BooleanComparison booleanComparison) {
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
  public BooleanBinaryComparison notEquals(BooleanComparison booleanComparison) {
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
  public BooleanBinaryComparison lessThan(BooleanComparison booleanComparison) {
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
  public BooleanBinaryComparison greaterThan(BooleanComparison booleanComparison) {
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
  public BooleanBinaryComparison lessThanOrEquals(BooleanComparison booleanComparison) {
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
  public BooleanBinaryComparison greaterThanOrEquals(BooleanComparison booleanComparison) {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
