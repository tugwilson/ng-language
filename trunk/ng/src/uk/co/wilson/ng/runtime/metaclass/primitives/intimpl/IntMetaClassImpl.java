package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntBinaryArithmeticOperationWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntBooleanComparisonWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntConversion;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntConversionWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntMetaClass;

public class IntMetaClassImpl extends BaseMetaClass implements IntMetaClass {
  private volatile IntConversion modifiedConvert = null;

  private volatile IntBinaryArithmeticOperation modifiedAdd = null;
  private volatile IntBinaryArithmeticOperation modifiedSubtract = null;
  private volatile IntBinaryArithmeticOperation modifiedMultiply = null;
  private volatile IntBinaryArithmeticOperation modifiedDivide = null;
  private volatile IntBinaryArithmeticOperation modifiedModulo = null;
  private volatile IntBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile IntBinaryArithmeticOperation modifiedPower = null;

  private volatile IntBooleanComparison modifiedEquals = null;
  private volatile IntBooleanComparison modifiedNotEquals = null;
  private volatile IntBooleanComparison modifiedLessThan = null;
  private volatile IntBooleanComparison modifiedGreaterThan = null;
  private volatile IntBooleanComparison modifiedLessThanOrEquals = null;
  private volatile IntBooleanComparison modifiedGreaterThanOrEquals = null;

  private final IntConversion convert = new Convert();

  private final IntBinaryArithmeticOperation add = new Add();
  private final IntBinaryArithmeticOperation subtract = new Subtract();
  private final IntBinaryArithmeticOperation multiply = new Multiply();
  private final IntBinaryArithmeticOperation divide = new Divide();
  private final IntBinaryArithmeticOperation modulo = new Modulo();
  private final IntBinaryArithmeticOperation remainderDivide = new RemainderDivide();
  private final IntBinaryArithmeticOperation power = new Power();

  private final IntBooleanComparison equals = new Equals();
  private final IntBooleanComparison notEquals = new NotEquals();
  private final IntBooleanComparison lessThan = new LessThan();
  private final IntBooleanComparison greaterThan = new GreaterThan();
  private final IntBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final IntBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public IntMetaClassImpl() {
    super(int.class);
  }

  private IntBinaryArithmeticOperation fixOperationType(final BinaryArithmeticOperation modifiedOperation) {
    if (modifiedOperation instanceof IntBinaryArithmeticOperation) {
      return( IntBinaryArithmeticOperation) modifiedOperation;
    }

    return new IntBinaryArithmeticOperationWrapper(modifiedOperation);
  }

  private IntBooleanComparison fixOperationType(final BooleanBinaryComparison modifiedOperation) {
    if(modifiedOperation instanceof IntBooleanComparison) {
      return (IntBooleanComparison)modifiedOperation;
    }

    return new IntBooleanComparisonWrapper(modifiedOperation);
  }

  public void modifyConvert(final Conversion modifiedConvert) {
    if (modifiedConvert instanceof IntConversion) {
      modifyConvert((IntConversion)modifiedConvert);
    } else {
      modifyConvert(new IntConversionWrapper(modifiedConvert));
    }
  }

  public void modifyConvert(final IntConversion modifiedConvert) {
    this.modifiedConvert = modifiedConvert;
  }

  public IntConversion getOriginalConvert() {
    return this.convert;
  }

  public IntConversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final BinaryArithmeticOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final IntBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public IntBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public IntBinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public void modifySubtract(final BinaryArithmeticOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final IntBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public IntBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public IntBinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public void modifyMultiply(final BinaryArithmeticOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final IntBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public IntBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public IntBinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public void modifyDivide(final BinaryArithmeticOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final IntBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public IntBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public IntBinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public void modifyModulo(final BinaryArithmeticOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final IntBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public IntBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public IntBinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public void modifyPower(final BinaryArithmeticOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final IntBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public IntBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public IntBinaryArithmeticOperation power() {
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
    }
  }

  public void modifyRemainderDivide(final BinaryArithmeticOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final IntBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public IntBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public IntBinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }

  public void modifyEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyEquals(final IntBooleanComparison modifiedEquals) {
    this.modifiedEquals = modifiedEquals;
  }

  public IntBooleanComparison getOriginalEquals() {
    return this.equals;
  }

  public IntBooleanComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
    }
  }

  public void modifyNotEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyNotEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyNotEquals(final IntBooleanComparison modifiedNotEquals) {
    this.modifiedNotEquals = modifiedNotEquals;
  }

  public IntBooleanComparison getOriginalNotEquals() {
    return this.notEquals;
  }

  public IntBooleanComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
    }
  }

  public void modifyLessThan(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyLessThan(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyLessThan(final IntBooleanComparison modifiedLessThan) {
    this.modifiedLessThan = modifiedLessThan;
  }

  public IntBooleanComparison getOriginalLessThan() {
    return this.lessThan;
  }

  public IntBooleanComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
    }
  }

  public void modifyGreaterThan(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyGreaterThan(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyGreaterThan(final IntBooleanComparison modifiedGreaterThan) {
    this.modifiedGreaterThan = modifiedGreaterThan;
  }

  public IntBooleanComparison getOriginalGreaterThan() {
    return this.greaterThan;
  }

  public IntBooleanComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
    }
  }

  public void modifyLessThanOrEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyLessThanOrEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyLessThanOrEquals(final IntBooleanComparison modifiedLessThanOrEquals) {
    this.modifiedLessThanOrEquals = modifiedLessThanOrEquals;
  }

  public IntBooleanComparison getOriginalLessThanOrEquals() {
    return this.lessThanOrEquals;
  }

  public IntBooleanComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  public void modifyGreaterThanOrEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyGreaterThanOrEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyGreaterThanOrEquals(final IntBooleanComparison modifiedGreaterThanOrEquals) {
    this.modifiedGreaterThanOrEquals = modifiedGreaterThanOrEquals;
  }

  public IntBooleanComparison getOriginalGreaterThanOrEquals() {
    return this.greaterThanOrEquals;
  }

  public IntBooleanComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
