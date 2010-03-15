package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import ng.runtime.metaclass.BinaryOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import ng.runtime.metaclass.LogicalBinaryOperation;
import ng.runtime.metaclass.ShiftOperation;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryArithmeticOperation;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryLogicalOperation;
import ng.runtime.metaclass.primitives.intimpl.IntBooleanComparison;
import ng.runtime.metaclass.primitives.intimpl.IntConversion;
import ng.runtime.metaclass.primitives.intimpl.IntIntegerComparison;
import ng.runtime.metaclass.primitives.intimpl.IntMetaClass;
import ng.runtime.metaclass.primitives.intimpl.IntShiftOperation;
import ng.runtime.threadcontext.BinaryArithmeticCategorySupport;
import ng.runtime.threadcontext.BinaryLogicalCategorySupport;
import ng.runtime.threadcontext.BooleanComparisonCategorySupport;
import ng.runtime.threadcontext.ConversionOperationCategorySupport;
import ng.runtime.threadcontext.IntegerComparisonCategorySupport;
import ng.runtime.threadcontext.ShiftCategorySupport;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;

public class IntMetaClassImpl extends BaseMetaClass implements IntMetaClass {
  private volatile IntConversion modifiedConvert = null;

  private volatile IntBinaryArithmeticOperation modifiedAdd = null;

  private volatile IntBinaryArithmeticOperation modifiedSubtract = null;

  private volatile IntBinaryArithmeticOperation modifiedMultiply = null;

  private volatile IntBinaryArithmeticOperation modifiedDivide = null;

  private volatile IntBinaryArithmeticOperation modifiedModulo = null;

  private volatile IntBinaryArithmeticOperation modifiedRemainderDivide = null;

  private volatile IntBinaryArithmeticOperation modifiedPower = null;

  private volatile IntBinaryLogicalOperation modifiedAnd = null;

  private volatile IntBinaryLogicalOperation modifiedOr = null;

  private volatile IntBinaryLogicalOperation modifiedXor = null;

  private volatile IntShiftOperation modifiedLeftShift = null;

  private volatile IntShiftOperation modifiedRightShift = null;

  private volatile IntShiftOperation modifiedUnsignedRightShift = null;

  private volatile IntIntegerComparison modifiedCompare = null;

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

  private final IntBinaryLogicalOperation and = new And();

  private final IntBinaryLogicalOperation or = new Or();

  private final IntBinaryLogicalOperation xor = new Xor();

  private final IntShiftOperation leftShift = new LeftShift();

  private final IntShiftOperation rightShift = new RightShift();

  private final IntShiftOperation unsignedRightShift = new UnsignedRightShift();

  private final IntIntegerComparison compare = new Compare();

  private final IntBooleanComparison equals = new Equals();

  private final IntBooleanComparison notEquals = new NotEquals();

  private final IntBooleanComparison lessThan = new LessThan();

  private final IntBooleanComparison greaterThan = new GreaterThan();

  private final IntBooleanComparison lessThanOrEquals = new LessThanOrEquals();

  private final IntBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public IntMetaClassImpl() {
    super(int.class);
  }

  private IntBinaryArithmeticOperation fixOperationType(final BinaryOperation modifiedOperation) {
    if (modifiedOperation instanceof IntBinaryArithmeticOperation) {
      return (IntBinaryArithmeticOperation) modifiedOperation;
    }

    return new IntBinaryArithmeticOperationWrapper(modifiedOperation);
  }

  private IntBinaryLogicalOperation fixOperationType(final LogicalBinaryOperation modifiedOperation) {
    if (modifiedOperation instanceof IntBinaryLogicalOperation) {
      return (IntBinaryLogicalOperation) modifiedOperation;
    }

    return new IntBinaryLogicalOperationWrapper(modifiedOperation);
  }

  private IntShiftOperation fixOperationType(final ShiftOperation modifiedOperation) {
    if (modifiedOperation instanceof IntShiftOperation) {
      return (IntShiftOperation) modifiedOperation;
    }

    return new IntShiftOperationWrapper(modifiedOperation);
  }

  private IntBooleanComparison fixOperationType(final BooleanBinaryComparison modifiedOperation) {
    if (modifiedOperation instanceof IntBooleanComparison) {
      return (IntBooleanComparison) modifiedOperation;
    }

    return new IntBooleanComparisonWrapper(modifiedOperation);
  }

  public void modifyConvert(final Conversion modifiedConvert) {
    if (modifiedConvert instanceof IntConversion) {
      modifyConvert((IntConversion) modifiedConvert);
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

  public IntConversion convert(final ConversionOperationCategorySupport conversionOperation) {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final BinaryOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final IntBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public IntBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public IntBinaryArithmeticOperation add(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final IntBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedAdd == null) {
        return this.add;
      } else {
        return this.modifiedAdd;
      }
    } else {
      return categoryOperation;
    }
  }

  public void modifySubtract(final BinaryOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final IntBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public IntBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public IntBinaryArithmeticOperation subtract(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final IntBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedSubtract == null) {
        return this.subtract;
      } else {
        return this.modifiedSubtract;
      }
    } else {
      return categoryOperation;
    }
  }

  public void modifyMultiply(final BinaryOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final IntBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public IntBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public IntBinaryArithmeticOperation multiply(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final IntBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedMultiply == null) {
        return this.multiply;
      } else {
        return this.modifiedMultiply;
      }
    } else {
      return categoryOperation;
    }
  }

  public void modifyDivide(final BinaryOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final IntBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public IntBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public IntBinaryArithmeticOperation divide(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final IntBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedDivide == null) {
        return this.divide;
      } else {
        return this.modifiedDivide;
      }
    } else {
      return categoryOperation;
    }
  }

  public void modifyModulo(final BinaryOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final IntBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public IntBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public IntBinaryArithmeticOperation modulo(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final IntBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedModulo == null) {
        return this.modulo;
      } else {
        return this.modifiedModulo;
      }
    } else {
      return categoryOperation;
    }
  }

  public void modifyPower(final BinaryOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final IntBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public IntBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public IntBinaryArithmeticOperation power(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final IntBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedPower == null) {
        return this.power;
      } else {
        return this.modifiedPower;
      }
    } else {
      return categoryOperation;
    }
  }

  public void modifyRemainderDivide(final BinaryOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final IntBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public IntBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public IntBinaryArithmeticOperation remainderDivide(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final IntBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedRemainderDivide == null) {
        return this.remainderDivide;
      } else {
        return this.modifiedRemainderDivide;
      }
    } else {
      return categoryOperation;
    }
  }

  public void modifyAnd(final LogicalBinaryOperation modifiedAnd) {
    modifyAnd(fixOperationType(modifiedAnd));
  }

  public void modifyAnd(final IntBinaryLogicalOperation modifiedAnd) {
    this.modifiedAnd = modifiedAnd;
  }

  public IntBinaryLogicalOperation getOriginalAnd() {
    return this.and;
  }

  public IntBinaryLogicalOperation and(final BinaryLogicalCategorySupport binaryLogicalOperation) {
    final IntBinaryLogicalOperation categoryOperation = binaryLogicalOperation.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedAnd == null) {
        return this.and;
      } else {
        return this.modifiedAnd;
      }
    } else {
      return categoryOperation;
    }
  }

  public void modifyOr(final LogicalBinaryOperation modifiedOr) {
    modifyOr(fixOperationType(modifiedOr));
  }

  public void modifyOr(final IntBinaryLogicalOperation modifiedOr) {
    this.modifiedOr = modifiedOr;
  }

  public IntBinaryLogicalOperation getOriginalOr() {
    return this.or;
  }

  public IntBinaryLogicalOperation or(final BinaryLogicalCategorySupport binaryLogicalOperation) {
    final IntBinaryLogicalOperation categoryOperation = binaryLogicalOperation.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedOr == null) {
        return this.or;
      } else {
        return this.modifiedOr;
      }
    } else {
      return categoryOperation;
    }
  }

  public void modifyXor(final LogicalBinaryOperation modifiedXor) {
    modifyXor(fixOperationType(modifiedXor));
  }

  public void modifyXor(final IntBinaryLogicalOperation modifiedXor) {
    this.modifiedXor = modifiedXor;
  }

  public IntBinaryLogicalOperation getOriginalXor() {
    return this.xor;
  }

  public IntBinaryLogicalOperation xor(final BinaryLogicalCategorySupport binaryLogicalOperation) {
    final IntBinaryLogicalOperation categoryOperation = binaryLogicalOperation.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedXor == null) {
        return this.xor;
      } else {
        return this.modifiedXor;
      }
    } else {
      return categoryOperation;
    }
  }

  public void modifyLeftShift(final ShiftOperation modifiedLeftShift) {
    modifyLeftShift(fixOperationType(modifiedLeftShift));
  }

  public void modifyLeftShift(final IntShiftOperation modifiedLeftShift) {
    this.modifiedLeftShift = modifiedLeftShift;
  }

  public IntShiftOperation getOriginalLeftShift() {
    return this.leftShift;
  }

  public IntShiftOperation leftShift(final ShiftCategorySupport shiftOperation) {
    final IntShiftOperation categoryOperation = shiftOperation.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedLeftShift == null) {
        return this.leftShift;
      } else {
        return this.modifiedLeftShift;
      }
    } else {
      return categoryOperation;
    }
  }

  public void modifyRightShift(final ShiftOperation modifiedRightShift) {
    modifyRightShift(fixOperationType(modifiedRightShift));
  }

  public void modifyRightShift(final IntShiftOperation modifiedRightShift) {
    this.modifiedRightShift = modifiedRightShift;
  }

  public IntShiftOperation getOriginalRightShift() {
    return this.rightShift;
  }

  public IntShiftOperation rightShift(final ShiftCategorySupport shiftOperation) {
    final IntShiftOperation categoryOperation = shiftOperation.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedRightShift == null) {
        return this.rightShift;
      } else {
        return this.modifiedRightShift;
      }
    } else {
      return categoryOperation;
    }
  }

  public void modifyUnsignedRightShift(final ShiftOperation modifiedUnsignedRightShift) {
    modifyUnsignedRightShift(fixOperationType(modifiedUnsignedRightShift));
  }

  public void modifyUnsignedRightShift(final IntShiftOperation modifiedUnsignedRightShift) {
    this.modifiedUnsignedRightShift = modifiedUnsignedRightShift;
  }

  public IntShiftOperation getOriginalUnsignedRightShift() {
    return this.unsignedRightShift;
  }

  public IntShiftOperation unsignedRightShift(final ShiftCategorySupport shiftOperation) {
    final IntShiftOperation categoryOperation = shiftOperation.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedUnsignedRightShift == null) {
        return this.unsignedRightShift;
      } else {
        return this.modifiedUnsignedRightShift;
      }
    } else {
      return categoryOperation;
    }
  }

  public void modifyCompare(final IntBinaryComparison modifiedCompare) {
    if (modifiedCompare instanceof IntIntegerComparison) {
      modifyCompare((IntIntegerComparison) this.modifiedConvert);
    } else {
      modifyCompare(new IntIntegerComparisonWrapper(modifiedCompare));
    }
  }

  public void modifyCompare(final IntIntegerComparison modifiedCompare) {
    this.modifiedCompare = modifiedCompare;
  }

  public IntIntegerComparison getOriginalCompare() {
    return this.compare;
  }

  public IntIntegerComparison compare(final IntegerComparisonCategorySupport integerComparison) {
    final IntIntegerComparison categoryOperation = integerComparison.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedCompare == null) {
        return this.compare;
      } else {
        return this.modifiedCompare;
      }
    } else {
      return categoryOperation;
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

  public IntBooleanComparison equals(final BooleanComparisonCategorySupport booleanComparison) {
    final IntBooleanComparison categoryOperation = booleanComparison.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedEquals == null) {
        return this.equals;
      } else {
        return this.modifiedEquals;
      }
    } else {
      return categoryOperation;
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

  public IntBooleanComparison notEquals(final BooleanComparisonCategorySupport booleanComparison) {
    final IntBooleanComparison categoryOperation = booleanComparison.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedNotEquals == null) {
        return this.notEquals;
      } else {
        return this.modifiedNotEquals;
      }
    } else {
      return categoryOperation;
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

  public IntBooleanComparison lessThan(final BooleanComparisonCategorySupport booleanComparison) {
    final IntBooleanComparison categoryOperation = booleanComparison.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedLessThan == null) {
        return this.lessThan;
      } else {
        return this.modifiedLessThan;
      }
    } else {
      return categoryOperation;
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

  public IntBooleanComparison greaterThan(final BooleanComparisonCategorySupport booleanComparison) {
    final IntBooleanComparison categoryOperation = booleanComparison.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedGreaterThan == null) {
        return this.greaterThan;
      } else {
        return this.modifiedGreaterThan;
      }
    } else {
      return categoryOperation;
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

  public IntBooleanComparison lessThanOrEquals(final BooleanComparisonCategorySupport booleanComparison) {
    final IntBooleanComparison categoryOperation = booleanComparison.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedLessThanOrEquals == null) {
        return this.lessThanOrEquals;
      } else {
        return this.modifiedLessThanOrEquals;
      }
    } else {
      return categoryOperation;
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

  public IntBooleanComparison greaterThanOrEquals(final BooleanComparisonCategorySupport booleanComparison) {
    final IntBooleanComparison categoryOperation = booleanComparison.getIntCategoryOperation();

    if (categoryOperation == null) {
      if (this.modifiedGreaterThanOrEquals == null) {
        return this.greaterThanOrEquals;
      } else {
        return this.modifiedGreaterThanOrEquals;
      }
    } else {
      return categoryOperation;
    }
  }
}
