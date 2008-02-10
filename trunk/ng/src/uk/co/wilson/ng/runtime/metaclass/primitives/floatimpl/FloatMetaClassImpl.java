package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatBinaryArithmeticOperationWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatBooleanComparisonWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatConversion;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatConversionWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatMetaClass;


public class FloatMetaClassImpl extends BaseMetaClass implements FloatMetaClass {
  private volatile FloatConversion modifiedConvert = null;

  private volatile FloatBinaryArithmeticOperation modifiedAdd = null;
  private volatile FloatBinaryArithmeticOperation modifiedSubtract = null;
  private volatile FloatBinaryArithmeticOperation modifiedMultiply = null;
  private volatile FloatBinaryArithmeticOperation modifiedDivide = null;
  private volatile FloatBinaryArithmeticOperation modifiedModulo = null;
  private volatile FloatBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile FloatBinaryArithmeticOperation modifiedPower = null;

  private volatile FloatBooleanComparison modifiedEquals = null;
  private volatile FloatBooleanComparison modifiedNotEquals = null;
  private volatile FloatBooleanComparison modifiedLessThan = null;
  private volatile FloatBooleanComparison modifiedGreaterThan = null;
  private volatile FloatBooleanComparison modifiedLessThanOrEquals = null;
  private volatile FloatBooleanComparison modifiedGreaterThanOrEquals = null;

  private final FloatConversion convert = new Convert();

  private final FloatBinaryArithmeticOperation add = new Add();
  private final FloatBinaryArithmeticOperation subtract = new Subtract();
  private final FloatBinaryArithmeticOperation multiply = new Multiply();
  private final FloatBinaryArithmeticOperation divide = new Divide();
  private final FloatBinaryArithmeticOperation modulo = new Modulo();
  private final FloatBinaryArithmeticOperation remainderDivide = new RemainderDivide();
  private final FloatBinaryArithmeticOperation power = new Power();

  private final FloatBooleanComparison equals = new Equals();
  private final FloatBooleanComparison notEquals = new NotEquals();
  private final FloatBooleanComparison lessThan = new LessThan();
  private final FloatBooleanComparison greaterThan = new GreaterThan();
  private final FloatBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final FloatBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public FloatMetaClassImpl() {
    super(float.class);
  }

  private FloatBinaryArithmeticOperation fixOperationType(final BinaryArithmeticOperation modifiedOperation) {
    if (modifiedOperation instanceof FloatBinaryArithmeticOperation) {
      return( FloatBinaryArithmeticOperation) modifiedOperation;
    }

    return new FloatBinaryArithmeticOperationWrapper(modifiedOperation);
  }

  private FloatBooleanComparison fixOperationType(final BooleanBinaryComparison modifiedOperation) {
    if(modifiedOperation instanceof FloatBooleanComparison) {
      return (FloatBooleanComparison)modifiedOperation;
    }

    return new FloatBooleanComparisonWrapper(modifiedOperation);
  }

  public void modifyConvert(final Conversion modifiedConvert) {
    if (modifiedConvert instanceof FloatConversion) {
      modifyConvert((FloatConversion)modifiedConvert);
    } else {
      modifyConvert(new FloatConversionWrapper(modifiedConvert));
    }
  }

  public void modifyConvert(final FloatConversion modifiedConvert) {
    this.modifiedConvert = modifiedConvert;
  }

  public FloatConversion getOriginalConvert() {
    return this.convert;
  }

  public FloatConversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final BinaryArithmeticOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final FloatBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public FloatBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public FloatBinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public void modifySubtract(final BinaryArithmeticOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final FloatBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public FloatBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public FloatBinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public void modifyMultiply(final BinaryArithmeticOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final FloatBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public FloatBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public FloatBinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public void modifyDivide(final BinaryArithmeticOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final FloatBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public FloatBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public FloatBinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public void modifyModulo(final BinaryArithmeticOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final FloatBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public FloatBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public FloatBinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public void modifyPower(final BinaryArithmeticOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final FloatBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public FloatBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public FloatBinaryArithmeticOperation power() {
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
    }
  }

  public void modifyRemainderDivide(final BinaryArithmeticOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final FloatBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public FloatBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public FloatBinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }

  public void modifyEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyEquals(final FloatBooleanComparison modifiedEquals) {
    this.modifiedEquals = modifiedEquals;
  }

  public FloatBooleanComparison getOriginalEquals() {
    return this.equals;
  }

  public FloatBooleanComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
    }
  }

  public void modifyNotEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyNotEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyNotEquals(final FloatBooleanComparison modifiedNotEquals) {
    this.modifiedNotEquals = modifiedNotEquals;
  }

  public FloatBooleanComparison getOriginalNotEquals() {
    return this.notEquals;
  }

  public FloatBooleanComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
    }
  }

  public void modifyLessThan(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyLessThan(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyLessThan(final FloatBooleanComparison modifiedLessThan) {
    this.modifiedLessThan = modifiedLessThan;
  }

  public FloatBooleanComparison getOriginalLessThan() {
    return this.lessThan;
  }

  public FloatBooleanComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
    }
  }

  public void modifyGreaterThan(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyGreaterThan(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyGreaterThan(final FloatBooleanComparison modifiedGreaterThan) {
    this.modifiedGreaterThan = modifiedGreaterThan;
  }

  public FloatBooleanComparison getOriginalGreaterThan() {
    return this.greaterThan;
  }

  public FloatBooleanComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
    }
  }

  public void modifyLessThanOrEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyLessThanOrEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyLessThanOrEquals(final FloatBooleanComparison modifiedLessThanOrEquals) {
    this.modifiedLessThanOrEquals = modifiedLessThanOrEquals;
  }

  public FloatBooleanComparison getOriginalLessThanOrEquals() {
    return this.lessThanOrEquals;
  }

  public FloatBooleanComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  public void modifyGreaterThanOrEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyGreaterThanOrEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyGreaterThanOrEquals(final FloatBooleanComparison modifiedGreaterThanOrEquals) {
    this.modifiedGreaterThanOrEquals = modifiedGreaterThanOrEquals;
  }

  public FloatBooleanComparison getOriginalGreaterThanOrEquals() {
    return this.greaterThanOrEquals;
  }

  public FloatBooleanComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
