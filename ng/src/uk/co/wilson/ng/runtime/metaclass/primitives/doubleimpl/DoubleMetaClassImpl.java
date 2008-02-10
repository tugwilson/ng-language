package uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.DoubleBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.DoubleBinaryArithmeticOperationWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.DoubleBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.DoubleBooleanComparisonWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.DoubleConversion;
import uk.co.wilson.ng.runtime.metaclass.primitives.DoubleConversionWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.DoubleMetaClass;

public class DoubleMetaClassImpl extends BaseMetaClass implements DoubleMetaClass {
  private volatile DoubleConversion modifiedConvert = null;

  private volatile DoubleBinaryArithmeticOperation modifiedAdd = null;
  private volatile DoubleBinaryArithmeticOperation modifiedSubtract = null;
  private volatile DoubleBinaryArithmeticOperation modifiedMultiply = null;
  private volatile DoubleBinaryArithmeticOperation modifiedDivide = null;
  private volatile DoubleBinaryArithmeticOperation modifiedModulo = null;
  private volatile DoubleBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile DoubleBinaryArithmeticOperation modifiedPower = null;

  private volatile DoubleBooleanComparison modifiedEquals = null;
  private volatile DoubleBooleanComparison modifiedNotEquals = null;
  private volatile DoubleBooleanComparison modifiedLessThan = null;
  private volatile DoubleBooleanComparison modifiedGreaterThan = null;
  private volatile DoubleBooleanComparison modifiedLessThanOrEquals = null;
  private volatile DoubleBooleanComparison modifiedGreaterThanOrEquals = null;

  private final DoubleConversion convert = new Convert();

  private final DoubleBinaryArithmeticOperation add = new Add();
  private final DoubleBinaryArithmeticOperation subtract = new Subtract();
  private final DoubleBinaryArithmeticOperation multiply = new Multiply();
  private final DoubleBinaryArithmeticOperation divide = new Divide();
  private final DoubleBinaryArithmeticOperation modulo = new Modulo();
  private final DoubleBinaryArithmeticOperation remainderDivide = new RemainderDivide();
  private final DoubleBinaryArithmeticOperation power = new Power();

  private final DoubleBooleanComparison equals = new Equals();
  private final DoubleBooleanComparison notEquals = new NotEquals();
  private final DoubleBooleanComparison lessThan = new LessThan();
  private final DoubleBooleanComparison greaterThan = new GreaterThan();
  private final DoubleBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final DoubleBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public DoubleMetaClassImpl() {
    super(double.class);
  }

  private DoubleBinaryArithmeticOperation fixOperationType(final BinaryArithmeticOperation modifiedOperation) {
    if (modifiedOperation instanceof DoubleBinaryArithmeticOperation) {
      return( DoubleBinaryArithmeticOperation) modifiedOperation;
    }

    return new DoubleBinaryArithmeticOperationWrapper(modifiedOperation);
  }

  private DoubleBooleanComparison fixOperationType(final BooleanBinaryComparison modifiedOperation) {
    if(modifiedOperation instanceof DoubleBooleanComparison) {
      return (DoubleBooleanComparison)modifiedOperation;
    }

    return new DoubleBooleanComparisonWrapper(modifiedOperation);
  }

  public void modifyConvert(final Conversion modifiedConvert) {
    if (modifiedConvert instanceof DoubleConversion) {
      modifyConvert((DoubleConversion)modifiedConvert);
    } else {
      modifyConvert(new DoubleConversionWrapper(modifiedConvert));
    }
  }

  public void modifyConvert(final DoubleConversion modifiedConvert) {
    this.modifiedConvert = modifiedConvert;
  }

  public DoubleConversion getOriginalConvert() {
    return this.convert;
  }

  public DoubleConversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final BinaryArithmeticOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final DoubleBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public DoubleBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public DoubleBinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public void modifySubtract(final BinaryArithmeticOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final DoubleBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public DoubleBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public DoubleBinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public void modifyMultiply(final BinaryArithmeticOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final DoubleBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public DoubleBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public DoubleBinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public void modifyDivide(final BinaryArithmeticOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final DoubleBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public DoubleBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public DoubleBinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public void modifyModulo(final BinaryArithmeticOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final DoubleBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public DoubleBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public DoubleBinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public void modifyPower(final BinaryArithmeticOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final DoubleBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public DoubleBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public DoubleBinaryArithmeticOperation power() {
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
    }
  }

  public void modifyRemainderDivide(final BinaryArithmeticOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final DoubleBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public DoubleBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public DoubleBinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }

  public void modifyEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyEquals(final DoubleBooleanComparison modifiedEquals) {
    this.modifiedEquals = modifiedEquals;
  }

  public DoubleBooleanComparison getOriginalEquals() {
    return this.equals;
  }

  public DoubleBooleanComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
    }
  }

  public void modifyNotEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyNotEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyNotEquals(final DoubleBooleanComparison modifiedNotEquals) {
    this.modifiedNotEquals = modifiedNotEquals;
  }

  public DoubleBooleanComparison getOriginalNotEquals() {
    return this.notEquals;
  }

  public DoubleBooleanComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
    }
  }

  public void modifyLessThan(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyLessThan(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyLessThan(final DoubleBooleanComparison modifiedLessThan) {
    this.modifiedLessThan = modifiedLessThan;
  }

  public DoubleBooleanComparison getOriginalLessThan() {
    return this.lessThan;
  }

  public DoubleBooleanComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
    }
  }

  public void modifyGreaterThan(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyGreaterThan(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyGreaterThan(final DoubleBooleanComparison modifiedGreaterThan) {
    this.modifiedGreaterThan = modifiedGreaterThan;
  }

  public DoubleBooleanComparison getOriginalGreaterThan() {
    return this.greaterThan;
  }

  public DoubleBooleanComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
    }
  }

  public void modifyLessThanOrEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyLessThanOrEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyLessThanOrEquals(final DoubleBooleanComparison modifiedLessThanOrEquals) {
    this.modifiedLessThanOrEquals = modifiedLessThanOrEquals;
  }

  public DoubleBooleanComparison getOriginalLessThanOrEquals() {
    return this.lessThanOrEquals;
  }

  public DoubleBooleanComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  public void modifyGreaterThanOrEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyGreaterThanOrEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyGreaterThanOrEquals(final DoubleBooleanComparison modifiedGreaterThanOrEquals) {
    this.modifiedGreaterThanOrEquals = modifiedGreaterThanOrEquals;
  }

  public DoubleBooleanComparison getOriginalGreaterThanOrEquals() {
    return this.greaterThanOrEquals;
  }

  public DoubleBooleanComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
