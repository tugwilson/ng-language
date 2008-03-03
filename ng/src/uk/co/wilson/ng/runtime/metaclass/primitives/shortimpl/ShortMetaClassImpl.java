package uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl;

import ng.runtime.metaclass.*;
import ng.runtime.metaclass.BooleanComparisonCategorySupport;
import ng.runtime.metaclass.ShiftCategorySupport;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;
import ng.runtime.metaclass.primitives.shortimpl.ShortBinaryArithmeticOperation;
import ng.runtime.metaclass.primitives.shortimpl.ShortBinaryLogicalOperation;
import ng.runtime.metaclass.primitives.shortimpl.ShortBooleanComparison;
import ng.runtime.metaclass.primitives.shortimpl.ShortConversion;
import ng.runtime.metaclass.primitives.shortimpl.ShortIntegerComparison;
import ng.runtime.metaclass.primitives.shortimpl.ShortMetaClass;
import ng.runtime.metaclass.primitives.shortimpl.ShortShiftOperation;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;

public class ShortMetaClassImpl extends BaseMetaClass implements ShortMetaClass {
  private volatile ShortConversion modifiedConvert = null;

  private volatile ShortBinaryArithmeticOperation modifiedAdd = null;
  private volatile ShortBinaryArithmeticOperation modifiedSubtract = null;
  private volatile ShortBinaryArithmeticOperation modifiedMultiply = null;
  private volatile ShortBinaryArithmeticOperation modifiedDivide = null;
  private volatile ShortBinaryArithmeticOperation modifiedModulo = null;
  private volatile ShortBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile ShortBinaryArithmeticOperation modifiedPower = null;

  private volatile ShortBinaryLogicalOperation modifiedAnd = null;
  private volatile ShortBinaryLogicalOperation modifiedOr = null;
  private volatile ShortBinaryLogicalOperation modifiedXor = null;
  private volatile ShortShiftOperation modifiedLeftShift = null;
  private volatile ShortShiftOperation modifiedRightShift = null;
  private volatile ShortShiftOperation modifiedUnsignedRightShift = null;

  private volatile ShortIntegerComparison modifiedCompare = null;

  private volatile ShortBooleanComparison modifiedEquals = null;
  private volatile ShortBooleanComparison modifiedNotEquals = null;
  private volatile ShortBooleanComparison modifiedLessThan = null;
  private volatile ShortBooleanComparison modifiedGreaterThan = null;
  private volatile ShortBooleanComparison modifiedLessThanOrEquals = null;
  private volatile ShortBooleanComparison modifiedGreaterThanOrEquals = null;

  private final ShortConversion convert = new Convert();

  private final ShortBinaryArithmeticOperation add = new Add();
  private final ShortBinaryArithmeticOperation subtract = new Subtract();
  private final ShortBinaryArithmeticOperation multiply = new Multiply();
  private final ShortBinaryArithmeticOperation divide = new Divide();
  private final ShortBinaryArithmeticOperation modulo = new Modulo();
  private final ShortBinaryArithmeticOperation remainderDivide = new RemainderDivide();
  private final ShortBinaryArithmeticOperation power = new Power();

  private final ShortBinaryLogicalOperation and = new And();
  private final ShortBinaryLogicalOperation or = new Or();
  private final ShortBinaryLogicalOperation xor = new Xor();
  private final ShortShiftOperation leftShift = new LeftShift();
  private final ShortShiftOperation rightShift = new RightShift();
  private final ShortShiftOperation unsignedRightShift = new UnsignedRightShift();

  private final ShortIntegerComparison compare = new Compare();

  private final ShortBooleanComparison equals = new Equals();
  private final ShortBooleanComparison notEquals = new NotEquals();
  private final ShortBooleanComparison lessThan = new LessThan();
  private final ShortBooleanComparison greaterThan = new GreaterThan();
  private final ShortBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final ShortBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public ShortMetaClassImpl() {
    super(short.class);
  }

  private ShortBinaryArithmeticOperation fixOperationType(final BinaryOperation modifiedOperation) {
    if (modifiedOperation instanceof ShortBinaryArithmeticOperation) {
      return( ShortBinaryArithmeticOperation) modifiedOperation;
    }

    return new ShortBinaryArithmeticOperationWrapper(modifiedOperation);
  }

  private ShortBooleanComparison fixOperationType(final BooleanBinaryComparison modifiedOperation) {
    if(modifiedOperation instanceof ShortBooleanComparison) {
      return (ShortBooleanComparison)modifiedOperation;
    }

    return new ShortBooleanComparisonWrapper(modifiedOperation);
  }

  private ShortBinaryLogicalOperation fixOperationType(final LogicalBinaryOperation modifiedOperation) {
    if (modifiedOperation instanceof ShortBinaryLogicalOperation) {
      return (ShortBinaryLogicalOperation)modifiedOperation;
    }

    return new ShortBinaryLogicalOperationWrapper(modifiedOperation);
  }

  private ShortShiftOperation fixOperationType(final ShiftOperation modifiedOperation) {
    if (modifiedOperation instanceof ShortShiftOperation) {
      return (ShortShiftOperation)modifiedOperation;
    }

    return new ShortShiftOperationWrapper(modifiedOperation);
  }

  public void modifyConvert(final Conversion modifiedConvert) {
    if (modifiedConvert instanceof ShortConversion) {
      modifyConvert((ShortConversion)modifiedConvert);
    } else {
      modifyConvert(new ShortConversionWrapper(modifiedConvert));
    }
  }

  public void modifyConvert(final ShortConversion modifiedConvert) {
    this.modifiedConvert = modifiedConvert;
  }

  public ShortConversion getOriginalConvert() {
    return this.convert;
  }

  public ShortConversion convert(final ConversionOperationCategorySupport conversionOperation) {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final BinaryOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final ShortBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public ShortBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public ShortBinaryArithmeticOperation add(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final ShortBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getShortCategoryOperation();

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

  public void modifySubtract(final ShortBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public ShortBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public ShortBinaryArithmeticOperation subtract(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final ShortBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getShortCategoryOperation();

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

  public void modifyMultiply(final ShortBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public ShortBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public ShortBinaryArithmeticOperation multiply(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final ShortBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getShortCategoryOperation();

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

  public void modifyDivide(final ShortBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public ShortBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public ShortBinaryArithmeticOperation divide(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final ShortBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getShortCategoryOperation();

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

  public void modifyModulo(final ShortBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public ShortBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public ShortBinaryArithmeticOperation modulo(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final ShortBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getShortCategoryOperation();

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

  public void modifyPower(final ShortBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public ShortBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public ShortBinaryArithmeticOperation power(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final ShortBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getShortCategoryOperation();

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

  public void modifyRemainderDivide(final ShortBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public ShortBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public ShortBinaryArithmeticOperation remainderDivide(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final ShortBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getShortCategoryOperation();

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

  public void modifyAnd(final ShortBinaryLogicalOperation modifiedAnd) {
    this.modifiedAnd = modifiedAnd;
  }

  public ShortBinaryLogicalOperation getOriginalAnd() {
    return this.and;
  }

  public ShortBinaryLogicalOperation and(final BinaryLogicalCategorySupport binaryLogicalOperation) {
  final ShortBinaryLogicalOperation categoryOperation = binaryLogicalOperation.getShortCategoryOperation();

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

  public void modifyOr(final ShortBinaryLogicalOperation modifiedOr) {
    this.modifiedOr = modifiedOr;
  }

  public ShortBinaryLogicalOperation getOriginalOr() {
    return this.or;
  }

  public ShortBinaryLogicalOperation or(final BinaryLogicalCategorySupport binaryLogicalOperation) {
  final ShortBinaryLogicalOperation categoryOperation = binaryLogicalOperation.getShortCategoryOperation();

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

  public void modifyXor(final ShortBinaryLogicalOperation modifiedXor) {
    this.modifiedXor = modifiedXor;
  }

  public ShortBinaryLogicalOperation getOriginalXor() {
    return this.xor;
  }

  public ShortBinaryLogicalOperation xor(final BinaryLogicalCategorySupport binaryLogicalOperation) {
  final ShortBinaryLogicalOperation categoryOperation = binaryLogicalOperation.getShortCategoryOperation();

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

  public void modifyLeftShift(final ShortShiftOperation modifiedLeftShift) {
    this.modifiedLeftShift = modifiedLeftShift;
  }

  public ShortShiftOperation getOriginalLeftShift() {
    return this.leftShift;
  }

  public ShortShiftOperation leftShift(final ShiftCategorySupport shiftOperation) {
  final ShortShiftOperation categoryOperation = shiftOperation.getShortCategoryOperation();

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

  public void modifyRightShift(final ShortShiftOperation modifiedRightShift) {
    this.modifiedRightShift = modifiedRightShift;
  }

  public ShortShiftOperation getOriginalRightShift() {
    return this.rightShift;
  }

  public ShortShiftOperation rightShift(final ShiftCategorySupport shiftOperation) {
  final ShortShiftOperation categoryOperation = shiftOperation.getShortCategoryOperation();

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

  public void modifyUnsignedRightShift(final ShortShiftOperation modifiedUnsignedRightShift) {
    this.modifiedUnsignedRightShift = modifiedUnsignedRightShift;
  }

  public ShortShiftOperation getOriginalUnsignedRightShift() {
    return this.unsignedRightShift;
  }

  public ShortShiftOperation unsignedRightShift(final ShiftCategorySupport shiftOperation) {
  final ShortShiftOperation categoryOperation = shiftOperation.getShortCategoryOperation();

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
    if (modifiedCompare instanceof ShortIntegerComparison) {
      modifyCompare((ShortIntegerComparison)this.modifiedConvert);
    } else {
      modifyCompare(new ShortIntegerComparisonWrapper(modifiedCompare));
    }
  }

  public void modifyCompare(final ShortIntegerComparison modifiedCompare) {
    this.modifiedCompare = modifiedCompare;
  }

  public ShortIntegerComparison getOriginalCompare() {
    return this.compare;
  }

  public ShortIntegerComparison compare(final IntegerComparisonCategorySupport integerComparison) {
  final ShortIntegerComparison categoryOperation = integerComparison.getShortCategoryOperation();

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

  public void modifyEquals(final ShortBooleanComparison modifiedEquals) {
    this.modifiedEquals = modifiedEquals;
  }

  public ShortBooleanComparison getOriginalEquals() {
    return this.equals;
  }

  public ShortBooleanComparison equals(final BooleanComparisonCategorySupport booleanComparison) {
  final ShortBooleanComparison categoryOperation = booleanComparison.getShortCategoryOperation();

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

  public void modifyNotEquals(final ShortBooleanComparison modifiedNotEquals) {
    this.modifiedNotEquals = modifiedNotEquals;
  }

  public ShortBooleanComparison getOriginalNotEquals() {
    return this.notEquals;
  }

  public ShortBooleanComparison notEquals(final BooleanComparisonCategorySupport booleanComparison) {
  final ShortBooleanComparison categoryOperation = booleanComparison.getShortCategoryOperation();

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

  public void modifyLessThan(final ShortBooleanComparison modifiedLessThan) {
    this.modifiedLessThan = modifiedLessThan;
  }

  public ShortBooleanComparison getOriginalLessThan() {
    return this.lessThan;
  }

  public ShortBooleanComparison lessThan(final BooleanComparisonCategorySupport booleanComparison) {
  final ShortBooleanComparison categoryOperation = booleanComparison.getShortCategoryOperation();

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

  public void modifyGreaterThan(final ShortBooleanComparison modifiedGreaterThan) {
    this.modifiedGreaterThan = modifiedGreaterThan;
  }

  public ShortBooleanComparison getOriginalGreaterThan() {
    return this.greaterThan;
  }

  public ShortBooleanComparison greaterThan(final BooleanComparisonCategorySupport booleanComparison) {
  final ShortBooleanComparison categoryOperation = booleanComparison.getShortCategoryOperation();

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

  public void modifyLessThanOrEquals(final ShortBooleanComparison modifiedLessThanOrEquals) {
    this.modifiedLessThanOrEquals = modifiedLessThanOrEquals;
  }

  public ShortBooleanComparison getOriginalLessThanOrEquals() {
    return this.lessThanOrEquals;
  }

  public ShortBooleanComparison lessThanOrEquals(final BooleanComparisonCategorySupport booleanComparison) {
  final ShortBooleanComparison categoryOperation = booleanComparison.getShortCategoryOperation();

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

  public void modifyGreaterThanOrEquals(final ShortBooleanComparison modifiedGreaterThanOrEquals) {
    this.modifiedGreaterThanOrEquals = modifiedGreaterThanOrEquals;
  }

  public ShortBooleanComparison getOriginalGreaterThanOrEquals() {
    return this.greaterThanOrEquals;
  }

  public ShortBooleanComparison greaterThanOrEquals(final BooleanComparisonCategorySupport booleanComparison) {
  final ShortBooleanComparison categoryOperation = booleanComparison.getShortCategoryOperation();

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
