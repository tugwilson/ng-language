package uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl;

import ng.runtime.metaclass.BinaryOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import ng.runtime.metaclass.LogicalBinaryOperation;
import ng.runtime.metaclass.ShiftOperation;
import ng.runtime.metaclass.primitives.doubleimpl.DoubleBinaryArithmeticOperation;
import ng.runtime.metaclass.primitives.doubleimpl.DoubleBooleanComparison;
import ng.runtime.metaclass.primitives.doubleimpl.DoubleConversion;
import ng.runtime.metaclass.primitives.doubleimpl.DoubleIntegerComparison;
import ng.runtime.metaclass.primitives.doubleimpl.DoubleMetaClass;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;
import ng.runtime.threadcontext.BinaryArithmeticCategorySupport;
import ng.runtime.threadcontext.BinaryLogicalCategorySupport;
import ng.runtime.threadcontext.BooleanComparisonCategorySupport;
import ng.runtime.threadcontext.ConversionOperationCategorySupport;
import ng.runtime.threadcontext.IntegerComparisonCategorySupport;
import ng.runtime.threadcontext.ShiftCategorySupport;
import uk.co.wilson.ng.runtime.metaclass.BinaryLogicalOperationNoopImpl;
import uk.co.wilson.ng.runtime.metaclass.ShiftOperationNoopImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.FractionalNumberMetaClassImpl;

public class DoubleMetaClassImpl extends FractionalNumberMetaClassImpl implements DoubleMetaClass {
  private volatile DoubleConversion modifiedConvert = null;

  private volatile DoubleBinaryArithmeticOperation modifiedAdd = null;
  private volatile DoubleBinaryArithmeticOperation modifiedSubtract = null;
  private volatile DoubleBinaryArithmeticOperation modifiedMultiply = null;
  private volatile DoubleBinaryArithmeticOperation modifiedDivide = null;
  private volatile DoubleBinaryArithmeticOperation modifiedModulo = null;
  private volatile DoubleBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile DoubleBinaryArithmeticOperation modifiedPower = null;

  private volatile DoubleIntegerComparison modifiedCompare = null;

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

  private final DoubleIntegerComparison compare = new Compare();

  private final DoubleBooleanComparison equals = new Equals();
  private final DoubleBooleanComparison notEquals = new NotEquals();
  private final DoubleBooleanComparison lessThan = new LessThan();
  private final DoubleBooleanComparison greaterThan = new GreaterThan();
  private final DoubleBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final DoubleBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public DoubleMetaClassImpl() {
    super(double.class);
  }

  private DoubleBinaryArithmeticOperation fixOperationType(final BinaryOperation modifiedOperation) {
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

  public DoubleConversion convert(final ConversionOperationCategorySupport conversionOperation) {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final BinaryOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final DoubleBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public DoubleBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public DoubleBinaryArithmeticOperation add(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final DoubleBinaryArithmeticOperation doubleCategoryOperation = binaryArithmeticOperation.getDoubleCategoryOperation();

    if (doubleCategoryOperation == null) {
      if (this.modifiedAdd == null) {
        return this.add;
      } else {
        return this.modifiedAdd;
      }
    } else {
      return doubleCategoryOperation;
    }
  }

  public void modifySubtract(final BinaryOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final DoubleBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public DoubleBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public DoubleBinaryArithmeticOperation subtract(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final DoubleBinaryArithmeticOperation doubleCategoryOperation = binaryArithmeticOperation.getDoubleCategoryOperation();

    if (doubleCategoryOperation == null) {
      if (this.modifiedSubtract == null) {
        return this.subtract;
      } else {
        return this.modifiedSubtract;
      }
    } else {
      return doubleCategoryOperation;
    }
  }

  public void modifyMultiply(final BinaryOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final DoubleBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public DoubleBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public DoubleBinaryArithmeticOperation multiply(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final DoubleBinaryArithmeticOperation doubleCategoryOperation = binaryArithmeticOperation.getDoubleCategoryOperation();

    if (doubleCategoryOperation == null) {
      if (this.modifiedMultiply == null) {
        return this.multiply;
      } else {
        return this.modifiedMultiply;
      }
    } else {
      return doubleCategoryOperation;
    }
  }

  public void modifyDivide(final BinaryOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final DoubleBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public DoubleBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public DoubleBinaryArithmeticOperation divide(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final DoubleBinaryArithmeticOperation doubleCategoryOperation = binaryArithmeticOperation.getDoubleCategoryOperation();

    if (doubleCategoryOperation == null) {
      if (this.modifiedDivide == null) {
        return this.divide;
      } else {
        return this.modifiedDivide;
      }
    } else {
      return doubleCategoryOperation;
    }
  }

  public void modifyModulo(final BinaryOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final DoubleBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public DoubleBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public DoubleBinaryArithmeticOperation modulo(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final DoubleBinaryArithmeticOperation doubleCategoryOperation = binaryArithmeticOperation.getDoubleCategoryOperation();

    if (doubleCategoryOperation == null) {
      if (this.modifiedModulo == null) {
        return this.modulo;
      } else {
        return this.modifiedModulo;
      }
    } else {
      return doubleCategoryOperation;
    }
  }

  public void modifyPower(final BinaryOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final DoubleBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public DoubleBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public DoubleBinaryArithmeticOperation power(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final DoubleBinaryArithmeticOperation doubleCategoryOperation = binaryArithmeticOperation.getDoubleCategoryOperation();

    if (doubleCategoryOperation == null) {
      if (this.modifiedPower == null) {
        return this.power;
      } else {
        return this.modifiedPower;
      }
    } else {
      return doubleCategoryOperation;
    }
  }

  public void modifyRemainderDivide(final BinaryOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final DoubleBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public DoubleBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public DoubleBinaryArithmeticOperation remainderDivide(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final DoubleBinaryArithmeticOperation doubleCategoryOperation = binaryArithmeticOperation.getDoubleCategoryOperation();

    if (doubleCategoryOperation == null) {
      if (this.modifiedRemainderDivide == null) {
        return this.remainderDivide;
      } else {
        return this.modifiedRemainderDivide;
      }
    } else {
      return doubleCategoryOperation;
    }
  }

  public BinaryOperation and(final BinaryLogicalCategorySupport binaryLogicalOperation) {
  final BinaryOperation categoryOperation = binaryLogicalOperation.getDoubleCategoryOperation();

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

  public LogicalBinaryOperation or(final BinaryLogicalCategorySupport binaryLogicalOperation) {
  final LogicalBinaryOperation categoryOperation = binaryLogicalOperation.getDoubleCategoryOperation();

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

  public LogicalBinaryOperation xor(final BinaryLogicalCategorySupport binaryLogicalOperation) {
  final LogicalBinaryOperation categoryOperation = binaryLogicalOperation.getDoubleCategoryOperation();

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

  public ShiftOperation leftShift(final ShiftCategorySupport shiftOperation) {
  final ShiftOperation categoryOperation = shiftOperation.getDoubleCategoryOperation();

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

  public ShiftOperation rightShift(final ShiftCategorySupport shiftOperation) {
  final ShiftOperation categoryOperation = shiftOperation.getDoubleCategoryOperation();

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

  public ShiftOperation unsignedRightShift(final ShiftCategorySupport shiftOperation) {
  final ShiftOperation categoryOperation = shiftOperation.getDoubleCategoryOperation();

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
    if (modifiedCompare instanceof DoubleIntegerComparison) {
      modifyCompare((DoubleIntegerComparison)this.modifiedConvert);
    } else {
      modifyCompare(new DoubleIntegerComparisonWrapper(modifiedCompare));
    }
  }

  public void modifyCompare(final DoubleIntegerComparison modifiedCompare) {
    this.modifiedCompare = modifiedCompare;
  }

  public DoubleIntegerComparison getOriginalCompare() {
    return this.compare;
  }

  public DoubleIntegerComparison compare(final IntegerComparisonCategorySupport integerComparison) {
  final DoubleIntegerComparison doubleCategoryOperation = integerComparison.getDoubleCategoryOperation();

    if (doubleCategoryOperation == null) {
      if (this.modifiedCompare == null) {
        return this.compare;
      } else {
        return this.modifiedCompare;
      }
    } else {
      return doubleCategoryOperation;
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

  public DoubleBooleanComparison equals(final BooleanComparisonCategorySupport booleanComparison) {
  final DoubleBooleanComparison doubleCategoryOperation = booleanComparison.getDoubleCategoryOperation();

    if (doubleCategoryOperation == null) {
      if (this.modifiedEquals == null) {
        return this.equals;
      } else {
        return this.modifiedEquals;
      }
    } else {
      return doubleCategoryOperation;
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

  public DoubleBooleanComparison notEquals(final BooleanComparisonCategorySupport booleanComparison) {
  final DoubleBooleanComparison doubleCategoryOperation = booleanComparison.getDoubleCategoryOperation();

    if (doubleCategoryOperation == null) {
      if (this.modifiedNotEquals == null) {
        return this.notEquals;
      } else {
        return this.modifiedNotEquals;
      }
    } else {
      return doubleCategoryOperation;
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

  public DoubleBooleanComparison lessThan(final BooleanComparisonCategorySupport booleanComparison) {
  final DoubleBooleanComparison doubleCategoryOperation = booleanComparison.getDoubleCategoryOperation();

    if (doubleCategoryOperation == null) {
      if (this.modifiedLessThan == null) {
        return this.lessThan;
      } else {
        return this.modifiedLessThan;
      }
    } else {
      return doubleCategoryOperation;
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

  public DoubleBooleanComparison greaterThan(final BooleanComparisonCategorySupport booleanComparison) {
  final DoubleBooleanComparison doubleCategoryOperation = booleanComparison.getDoubleCategoryOperation();

    if (doubleCategoryOperation == null) {
      if (this.modifiedGreaterThan == null) {
        return this.greaterThan;
      } else {
        return this.modifiedGreaterThan;
      }
    } else {
      return doubleCategoryOperation;
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

  public DoubleBooleanComparison lessThanOrEquals(final BooleanComparisonCategorySupport booleanComparison) {
  final DoubleBooleanComparison doubleCategoryOperation = booleanComparison.getDoubleCategoryOperation();

    if (doubleCategoryOperation == null) {
      if (this.modifiedLessThanOrEquals == null) {
        return this.lessThanOrEquals;
      } else {
        return this.modifiedLessThanOrEquals;
      }
    } else {
      return doubleCategoryOperation;
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

  public DoubleBooleanComparison greaterThanOrEquals(final BooleanComparisonCategorySupport booleanComparison) {
  final DoubleBooleanComparison doubleCategoryOperation = booleanComparison.getDoubleCategoryOperation();

    if (doubleCategoryOperation == null) {
      if (this.modifiedGreaterThanOrEquals == null) {
        return this.greaterThanOrEquals;
      } else {
        return this.modifiedGreaterThanOrEquals;
      }
    } else {
      return doubleCategoryOperation;
    }
  }
}
