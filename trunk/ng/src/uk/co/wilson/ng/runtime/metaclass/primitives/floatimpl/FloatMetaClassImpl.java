package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import ng.runtime.metaclass.*;
import ng.runtime.metaclass.BaseBooleanComparison;
import ng.runtime.metaclass.primitives.floatimpl.FloatBinaryArithmeticOperation;
import ng.runtime.metaclass.primitives.floatimpl.FloatBooleanComparison;
import ng.runtime.metaclass.primitives.floatimpl.FloatConversion;
import ng.runtime.metaclass.primitives.floatimpl.FloatIntegerComparison;
import ng.runtime.metaclass.primitives.floatimpl.FloatMetaClass;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;
import uk.co.wilson.ng.runtime.metaclass.BinaryLogicalOperationNoopImpl;
import uk.co.wilson.ng.runtime.metaclass.ShiftOperationNoopImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.FractionalNumberMetaClassImpl;


public class FloatMetaClassImpl extends FractionalNumberMetaClassImpl implements FloatMetaClass {
  private volatile FloatConversion modifiedConvert = null;

  private volatile FloatBinaryArithmeticOperation modifiedAdd = null;
  private volatile FloatBinaryArithmeticOperation modifiedSubtract = null;
  private volatile FloatBinaryArithmeticOperation modifiedMultiply = null;
  private volatile FloatBinaryArithmeticOperation modifiedDivide = null;
  private volatile FloatBinaryArithmeticOperation modifiedModulo = null;
  private volatile FloatBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile FloatBinaryArithmeticOperation modifiedPower = null;

  private volatile FloatIntegerComparison modifiedCompare = null;

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

  private final FloatIntegerComparison compare = new Compare();

  private final FloatBooleanComparison equals = new Equals();
  private final FloatBooleanComparison notEquals = new NotEquals();
  private final FloatBooleanComparison lessThan = new LessThan();
  private final FloatBooleanComparison greaterThan = new GreaterThan();
  private final FloatBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final FloatBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public FloatMetaClassImpl() {
    super(float.class);
  }

  private FloatBinaryArithmeticOperation fixOperationType(final BinaryOperation modifiedOperation) {
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

  public FloatConversion convert(final BaseConversionOperation conversionOperation) {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final BinaryOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final FloatBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public FloatBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public FloatBinaryArithmeticOperation add(final BaseArithmeticBinaryOperation binaryArithmeticOperation) {
  final FloatBinaryArithmeticOperation floatCategoryOperation = binaryArithmeticOperation.getFloatCategoryOperation();

    if (floatCategoryOperation == null) {
      if (this.modifiedAdd == null) {
        return this.add;
      } else {
        return this.modifiedAdd;
      }
    } else {
      return floatCategoryOperation;
    }
  }

  public void modifySubtract(final BinaryOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final FloatBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public FloatBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public FloatBinaryArithmeticOperation subtract(final BaseArithmeticBinaryOperation binaryArithmeticOperation) {
  final FloatBinaryArithmeticOperation floatCategoryOperation = binaryArithmeticOperation.getFloatCategoryOperation();

    if (floatCategoryOperation == null) {
      if (this.modifiedSubtract == null) {
        return this.subtract;
      } else {
        return this.modifiedSubtract;
      }
    } else {
      return floatCategoryOperation;
    }
  }

  public void modifyMultiply(final BinaryOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final FloatBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public FloatBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public FloatBinaryArithmeticOperation multiply(final BaseArithmeticBinaryOperation binaryArithmeticOperation) {
  final FloatBinaryArithmeticOperation floatCategoryOperation = binaryArithmeticOperation.getFloatCategoryOperation();

    if (floatCategoryOperation == null) {
      if (this.modifiedMultiply == null) {
        return this.multiply;
      } else {
        return this.modifiedMultiply;
      }
    } else {
      return floatCategoryOperation;
    }
  }

  public void modifyDivide(final BinaryOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final FloatBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public FloatBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public FloatBinaryArithmeticOperation divide(final BaseArithmeticBinaryOperation binaryArithmeticOperation) {
  final FloatBinaryArithmeticOperation floatCategoryOperation = binaryArithmeticOperation.getFloatCategoryOperation();

    if (floatCategoryOperation == null) {
      if (this.modifiedDivide == null) {
        return this.divide;
      } else {
        return this.modifiedDivide;
      }
    } else {
      return floatCategoryOperation;
    }
  }

  public void modifyModulo(final BinaryOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final FloatBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public FloatBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public FloatBinaryArithmeticOperation modulo(final BaseArithmeticBinaryOperation binaryArithmeticOperation) {
  final FloatBinaryArithmeticOperation floatCategoryOperation = binaryArithmeticOperation.getFloatCategoryOperation();

    if (floatCategoryOperation == null) {
      if (this.modifiedModulo == null) {
        return this.modulo;
      } else {
        return this.modifiedModulo;
      }
    } else {
      return floatCategoryOperation;
    }
  }

  public void modifyPower(final BinaryOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final FloatBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public FloatBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public FloatBinaryArithmeticOperation power(final BaseArithmeticBinaryOperation binaryArithmeticOperation) {
  final FloatBinaryArithmeticOperation floatCategoryOperation = binaryArithmeticOperation.getFloatCategoryOperation();

    if (floatCategoryOperation == null) {
      if (this.modifiedPower == null) {
        return this.power;
      } else {
        return this.modifiedPower;
      }
    } else {
      return floatCategoryOperation;
    }
  }

  public void modifyRemainderDivide(final BinaryOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final FloatBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public FloatBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public FloatBinaryArithmeticOperation remainderDivide(final BaseArithmeticBinaryOperation binaryArithmeticOperation) {
  final FloatBinaryArithmeticOperation floatCategoryOperation = binaryArithmeticOperation.getFloatCategoryOperation();

    if (floatCategoryOperation == null) {
      if (this.modifiedRemainderDivide == null) {
        return this.remainderDivide;
      } else {
        return this.modifiedRemainderDivide;
      }
    } else {
      return floatCategoryOperation;
    }
  }

  public BinaryOperation and(final BaseLogicalBinaryOperation binaryLogicalOperation) {
  final BinaryOperation categoryOperation = binaryLogicalOperation.getFloatCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedAnd == null) {
        return BinaryLogicalOperationNoopImpl.instance;
      } else {
        return this.modifiedAnd;
      }
    } else {
      return categoryOperation;
    }
  }

  public LogicalBinaryOperation or(final BaseLogicalBinaryOperation binaryLogicalOperation) {
  final LogicalBinaryOperation categoryOperation = binaryLogicalOperation.getFloatCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedOr == null) {
        return BinaryLogicalOperationNoopImpl.instance;
      } else {
        return this.modifiedOr;
      }
    } else {
      return categoryOperation;
    }
  }

  public LogicalBinaryOperation xor(final BaseLogicalBinaryOperation binaryLogicalOperation) {
  final LogicalBinaryOperation categoryOperation = binaryLogicalOperation.getFloatCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedXor == null) {
        return BinaryLogicalOperationNoopImpl.instance;
      } else {
        return this.modifiedXor;
      }
    } else {
      return categoryOperation;
    }
  }

  public ShiftOperation leftShift(final BaseShiftOperation shiftOperation) {
  final ShiftOperation categoryOperation = shiftOperation.getFloatCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedLeftShift == null) {
        return ShiftOperationNoopImpl.instance;
      } else {
        return this.modifiedLeftShift;
      }
    } else {
      return categoryOperation;
    }
  }

  public ShiftOperation rightShift(final BaseShiftOperation shiftOperation) {
  final ShiftOperation categoryOperation = shiftOperation.getFloatCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedRightShift == null) {
        return ShiftOperationNoopImpl.instance;
      } else {
        return this.modifiedRightShift;
      }
    } else {
      return categoryOperation;
    }
  }

  public ShiftOperation unsignedRightShift(final BaseShiftOperation shiftOperation) {
  final ShiftOperation categoryOperation = shiftOperation.getFloatCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedUnsignedRightShift == null) {
        return ShiftOperationNoopImpl.instance;
      } else {
        return this.modifiedUnsignedRightShift;
      }
    } else {
      return categoryOperation;
    }
  }

  public void modifyCompare(final IntBinaryComparison modifiedCompare) {
    if (modifiedCompare instanceof FloatIntegerComparison) {
      modifyCompare((FloatIntegerComparison)this.modifiedConvert);
    } else {
      modifyCompare(new FloatIntegerComparisonWrapper(modifiedCompare));
    }
  }

  public void modifyCompare(final FloatIntegerComparison modifiedCompare) {
    this.modifiedCompare = modifiedCompare;
  }

  public FloatIntegerComparison getOriginalCompare() {
    return this.compare;
  }

  public FloatIntegerComparison compare(final BaseIntegerComparison integerComparison) {
  final FloatIntegerComparison floatCategoryOperation = integerComparison.getFloatCategoryOperation();

    if (floatCategoryOperation == null) {
      if (this.modifiedCompare == null) {
        return this.compare;
      } else {
        return this.modifiedCompare;
      }
    } else {
      return floatCategoryOperation;
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

  public FloatBooleanComparison equals(final BaseBooleanComparison booleanComparison) {
  final FloatBooleanComparison floatCategoryOperation = booleanComparison.getFloatCategoryOperation();

    if (floatCategoryOperation == null) {
      if (this.modifiedEquals == null) {
        return this.equals;
      } else {
        return this.modifiedEquals;
      }
    } else {
      return floatCategoryOperation;
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

  public FloatBooleanComparison notEquals(final BaseBooleanComparison booleanComparison) {
  final FloatBooleanComparison floatCategoryOperation = booleanComparison.getFloatCategoryOperation();

    if (floatCategoryOperation == null) {
      if (this.modifiedNotEquals == null) {
        return this.notEquals;
      } else {
        return this.modifiedNotEquals;
      }
    } else {
      return floatCategoryOperation;
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

  public FloatBooleanComparison lessThan(final BaseBooleanComparison booleanComparison) {
  final FloatBooleanComparison floatCategoryOperation = booleanComparison.getFloatCategoryOperation();

    if (floatCategoryOperation == null) {
      if (this.modifiedLessThan == null) {
        return this.lessThan;
      } else {
        return this.modifiedLessThan;
      }
    } else {
      return floatCategoryOperation;
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

  public FloatBooleanComparison greaterThan(final BaseBooleanComparison booleanComparison) {
  final FloatBooleanComparison floatCategoryOperation = booleanComparison.getFloatCategoryOperation();

    if (floatCategoryOperation == null) {
      if (this.modifiedGreaterThan == null) {
        return this.greaterThan;
      } else {
        return this.modifiedGreaterThan;
      }
    } else {
      return floatCategoryOperation;
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

  public FloatBooleanComparison lessThanOrEquals(final BaseBooleanComparison booleanComparison) {
  final FloatBooleanComparison floatCategoryOperation = booleanComparison.getFloatCategoryOperation();

    if (floatCategoryOperation == null) {
      if (this.modifiedLessThanOrEquals == null) {
        return this.lessThanOrEquals;
      } else {
        return this.modifiedLessThanOrEquals;
      }
    } else {
      return floatCategoryOperation;
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

  public FloatBooleanComparison greaterThanOrEquals(final BaseBooleanComparison booleanComparison) {
  final FloatBooleanComparison floatCategoryOperation = booleanComparison.getFloatCategoryOperation();

    if (floatCategoryOperation == null) {
      if (this.modifiedGreaterThanOrEquals == null) {
        return this.greaterThanOrEquals;
      } else {
        return this.modifiedGreaterThanOrEquals;
      }
    } else {
      return floatCategoryOperation;
    }
  }
}
