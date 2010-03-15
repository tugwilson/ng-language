package uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl;

import ng.runtime.metaclass.BinaryOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import ng.runtime.metaclass.LogicalBinaryOperation;
import ng.runtime.metaclass.ShiftOperation;
import ng.runtime.metaclass.primitives.byteimpl.ByteBinaryArithmeticOperation;
import ng.runtime.metaclass.primitives.byteimpl.ByteBinaryLogicalOperation;
import ng.runtime.metaclass.primitives.byteimpl.ByteBooleanComparison;
import ng.runtime.metaclass.primitives.byteimpl.ByteConversion;
import ng.runtime.metaclass.primitives.byteimpl.ByteIntegerComparison;
import ng.runtime.metaclass.primitives.byteimpl.ByteMetaClass;
import ng.runtime.metaclass.primitives.byteimpl.ByteShiftOperation;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;
import ng.runtime.threadcontext.BinaryArithmeticCategorySupport;
import ng.runtime.threadcontext.BinaryLogicalCategorySupport;
import ng.runtime.threadcontext.BooleanComparisonCategorySupport;
import ng.runtime.threadcontext.ConversionOperationCategorySupport;
import ng.runtime.threadcontext.IntegerComparisonCategorySupport;
import ng.runtime.threadcontext.ShiftCategorySupport;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;

public class ByteMetaClassImpl extends BaseMetaClass implements ByteMetaClass {

  private volatile ByteConversion modifiedConvert = null;

  private volatile ByteBinaryArithmeticOperation modifiedAdd = null;

  private volatile ByteBinaryArithmeticOperation modifiedSubtract = null;

  private volatile ByteBinaryArithmeticOperation modifiedMultiply = null;

  private volatile ByteBinaryArithmeticOperation modifiedDivide = null;

  private volatile ByteBinaryArithmeticOperation modifiedModulo = null;

  private volatile ByteBinaryArithmeticOperation modifiedRemainderDivide = null;

  private volatile ByteBinaryArithmeticOperation modifiedPower = null;

  private volatile ByteBinaryLogicalOperation modifiedAnd = null;

  private volatile ByteBinaryLogicalOperation modifiedOr = null;

  private volatile ByteBinaryLogicalOperation modifiedXor = null;

  private volatile ByteShiftOperation modifiedLeftShift = null;

  private volatile ByteShiftOperation modifiedRightShift = null;

  private volatile ByteShiftOperation modifiedUnsignedRightShift = null;

  private volatile ByteIntegerComparison modifiedCompare = null;

  private volatile ByteBooleanComparison modifiedEquals = null;

  private volatile ByteBooleanComparison modifiedNotEquals = null;

  private volatile ByteBooleanComparison modifiedLessThan = null;

  private volatile ByteBooleanComparison modifiedGreaterThan = null;

  private volatile ByteBooleanComparison modifiedLessThanOrEquals = null;

  private volatile ByteBooleanComparison modifiedGreaterThanOrEquals = null;

  private final ByteConversion convert = new Convert();

  private final ByteBinaryArithmeticOperation add = new Add();

  private final ByteBinaryArithmeticOperation subtract = new Subtract();

  private final ByteBinaryArithmeticOperation multiply = new Multiply();

  private final ByteBinaryArithmeticOperation divide = new Divide();

  private final ByteBinaryArithmeticOperation modulo = new Modulo();

  private final ByteBinaryArithmeticOperation remainderDivide = new RemainderDivide();

  private final ByteBinaryArithmeticOperation power = new Power();

  private final ByteBinaryLogicalOperation and = new And();

  private final ByteBinaryLogicalOperation or = new Or();

  private final ByteBinaryLogicalOperation xor = new Xor();

  private final ByteShiftOperation leftShift = new LeftShift();

  private final ByteShiftOperation rightShift = new RightShift();

  private final ByteShiftOperation unsignedRightShift = new UnsignedRightShift();

  private final ByteIntegerComparison compare = new Compare();

  private final ByteBooleanComparison equals = new Equals();

  private final ByteBooleanComparison notEquals = new NotEquals();

  private final ByteBooleanComparison lessThan = new LessThan();

  private final ByteBooleanComparison greaterThan = new GreaterThan();

  private final ByteBooleanComparison lessThanOrEquals = new LessThanOrEquals();

  private final ByteBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public ByteMetaClassImpl() {
    super(byte.class);
  }

  private ByteBinaryArithmeticOperation fixOperationType(final BinaryOperation modifiedOperation) {
    if (modifiedOperation instanceof ByteBinaryArithmeticOperation) {
      return (ByteBinaryArithmeticOperation) modifiedOperation;
    }

    return new ByteBinaryArithmeticOperationWrapper(modifiedOperation);
  }

  private ByteBinaryLogicalOperation fixOperationType(final LogicalBinaryOperation modifiedOperation) {
    if (modifiedOperation instanceof ByteBinaryLogicalOperation) {
      return (ByteBinaryLogicalOperation) modifiedOperation;
    }

    return new ByteBinaryLogicalOperationWrapper(modifiedOperation);
  }

  private ByteShiftOperation fixOperationType(final ShiftOperation modifiedOperation) {
    if (modifiedOperation instanceof ByteShiftOperation) {
      return (ByteShiftOperation) modifiedOperation;
    }

    return new ByteShiftOperationWrapper(modifiedOperation);
  }

  private ByteBooleanComparison fixOperationType(final BooleanBinaryComparison modifiedOperation) {
    if (modifiedOperation instanceof ByteBooleanComparison) {
      return (ByteBooleanComparison) modifiedOperation;
    }

    return new ByteBooleanComparisonWrapper(modifiedOperation);
  }

  public void modifyConvert(final Conversion modifiedConvert) {
    if (modifiedConvert instanceof ByteConversion) {
      modifyConvert((ByteConversion) modifiedConvert);
    } else {
      modifyConvert(new ByteConversionWrapper(modifiedConvert));
    }
  }

  public void modifyConvert(final ByteConversion modifiedConvert) {
    this.modifiedConvert = modifiedConvert;
  }

  public ByteConversion getOriginalConvert() {
    return this.convert;
  }

  public ByteConversion convert(final ConversionOperationCategorySupport conversionOperation) {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final BinaryOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final ByteBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public ByteBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public ByteBinaryArithmeticOperation add(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final ByteBinaryArithmeticOperation byteCategoryOperation = binaryArithmeticOperation.getByteCategoryOperation();

    if (byteCategoryOperation == null) {
      if (this.modifiedAdd == null) {
        return this.add;
      } else {
        return this.modifiedAdd;
      }
    } else {
      return byteCategoryOperation;
    }
  }

  public void modifySubtract(final BinaryOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final ByteBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public ByteBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public ByteBinaryArithmeticOperation subtract(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final ByteBinaryArithmeticOperation byteCategoryOperation = binaryArithmeticOperation.getByteCategoryOperation();

    if (byteCategoryOperation == null) {
      if (this.modifiedSubtract == null) {
        return this.subtract;
      } else {
        return this.modifiedSubtract;
      }
    } else {
      return byteCategoryOperation;
    }
  }

  public void modifyMultiply(final BinaryOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final ByteBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public ByteBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public ByteBinaryArithmeticOperation multiply(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final ByteBinaryArithmeticOperation byteCategoryOperation = binaryArithmeticOperation.getByteCategoryOperation();

    if (byteCategoryOperation == null) {
      if (this.modifiedMultiply == null) {
        return this.multiply;
      } else {
        return this.modifiedMultiply;
      }
    } else {
      return byteCategoryOperation;
    }
  }

  public void modifyDivide(final BinaryOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final ByteBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public ByteBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public ByteBinaryArithmeticOperation divide(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final ByteBinaryArithmeticOperation byteCategoryOperation = binaryArithmeticOperation.getByteCategoryOperation();

    if (byteCategoryOperation == null) {
      if (this.modifiedDivide == null) {
        return this.divide;
      } else {
        return this.modifiedDivide;
      }
    } else {
      return byteCategoryOperation;
    }
  }

  public void modifyModulo(final BinaryOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final ByteBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public ByteBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public ByteBinaryArithmeticOperation modulo(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final ByteBinaryArithmeticOperation byteCategoryOperation = binaryArithmeticOperation.getByteCategoryOperation();

    if (byteCategoryOperation == null) {
      if (this.modifiedModulo == null) {
        return this.modulo;
      } else {
        return this.modifiedModulo;
      }
    } else {
      return byteCategoryOperation;
    }
  }

  public void modifyPower(final BinaryOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final ByteBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public ByteBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public ByteBinaryArithmeticOperation power(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final ByteBinaryArithmeticOperation byteCategoryOperation = binaryArithmeticOperation.getByteCategoryOperation();

    if (byteCategoryOperation == null) {
      if (this.modifiedPower == null) {
        return this.power;
      } else {
        return this.modifiedPower;
      }
    } else {
      return byteCategoryOperation;
    }
  }

  public void modifyRemainderDivide(final BinaryOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final ByteBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public ByteBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public ByteBinaryArithmeticOperation remainderDivide(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final ByteBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getByteCategoryOperation();

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

  public void modifyAnd(final ByteBinaryLogicalOperation modifiedAnd) {
    this.modifiedAnd = modifiedAnd;
  }

  public ByteBinaryLogicalOperation getOriginalAnd() {
    return this.and;
  }

  public ByteBinaryLogicalOperation and(final BinaryLogicalCategorySupport binaryLogicalOperation) {
    final ByteBinaryLogicalOperation categoryOperation = binaryLogicalOperation.getByteCategoryOperation();

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

  public void modifyOr(final ByteBinaryLogicalOperation modifiedOr) {
    this.modifiedOr = modifiedOr;
  }

  public ByteBinaryLogicalOperation getOriginalOr() {
    return this.or;
  }

  public ByteBinaryLogicalOperation or(final BinaryLogicalCategorySupport binaryLogicalOperation) {
    final ByteBinaryLogicalOperation categoryOperation = binaryLogicalOperation.getByteCategoryOperation();

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

  public void modifyXor(final ByteBinaryLogicalOperation modifiedXor) {
    this.modifiedXor = modifiedXor;
  }

  public ByteBinaryLogicalOperation getOriginalXor() {
    return this.xor;
  }

  public ByteBinaryLogicalOperation xor(final BinaryLogicalCategorySupport binaryLogicalOperation) {
    final ByteBinaryLogicalOperation categoryOperation = binaryLogicalOperation.getByteCategoryOperation();

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

  public void modifyLeftShift(final ByteShiftOperation modifiedLeftShift) {
    this.modifiedLeftShift = modifiedLeftShift;
  }

  public ByteShiftOperation getOriginalLeftShift() {
    return this.leftShift;
  }

  public ByteShiftOperation leftShift(final ShiftCategorySupport shiftOperation) {
    final ByteShiftOperation categoryOperation = shiftOperation.getByteCategoryOperation();

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

  public void modifyRightShift(final ByteShiftOperation modifiedRightShift) {
    this.modifiedRightShift = modifiedRightShift;
  }

  public ByteShiftOperation getOriginalRightShift() {
    return this.rightShift;
  }

  public ByteShiftOperation rightShift(final ShiftCategorySupport shiftOperation) {
    final ByteShiftOperation categoryOperation = shiftOperation.getByteCategoryOperation();

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

  public void modifyUnsignedRightShift(final ByteShiftOperation modifiedUnsignedRightShift) {
    this.modifiedUnsignedRightShift = modifiedUnsignedRightShift;
  }

  public ByteShiftOperation getOriginalUnsignedRightShift() {
    return this.unsignedRightShift;
  }

  public ByteShiftOperation unsignedRightShift(final ShiftCategorySupport shiftOperation) {
    final ByteShiftOperation categoryOperation = shiftOperation.getByteCategoryOperation();

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
    if (modifiedCompare instanceof ByteIntegerComparison) {
      modifyCompare((ByteIntegerComparison) this.modifiedConvert);
    } else {
      modifyCompare(new ByteIntegerComparisonWrapper(modifiedCompare));
    }
  }

  public void modifyCompare(final ByteIntegerComparison modifiedCompare) {
    this.modifiedCompare = modifiedCompare;
  }

  public ByteIntegerComparison getOriginalCompare() {
    return this.compare;
  }

  public ByteIntegerComparison compare(final IntegerComparisonCategorySupport integerComparison) {
    final ByteIntegerComparison categoryOperation = integerComparison.getByteCategoryOperation();

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

  public void modifyEquals(final ByteBooleanComparison modifiedEquals) {
    this.modifiedEquals = modifiedEquals;
  }

  public ByteBooleanComparison getOriginalEquals() {
    return this.equals;
  }

  public ByteBooleanComparison equals(final BooleanComparisonCategorySupport booleanComparison) {
    final ByteBooleanComparison categoryOperation = booleanComparison.getByteCategoryOperation();

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

  public void modifyNotEquals(final ByteBooleanComparison modifiedNotEquals) {
    this.modifiedNotEquals = modifiedNotEquals;
  }

  public ByteBooleanComparison getOriginalNotEquals() {
    return this.notEquals;
  }

  public ByteBooleanComparison notEquals(final BooleanComparisonCategorySupport booleanComparison) {
    final ByteBooleanComparison categoryOperation = booleanComparison.getByteCategoryOperation();

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

  public void modifyLessThan(final ByteBooleanComparison modifiedLessThan) {
    this.modifiedLessThan = modifiedLessThan;
  }

  public ByteBooleanComparison getOriginalLessThan() {
    return this.lessThan;
  }

  public ByteBooleanComparison lessThan(final BooleanComparisonCategorySupport booleanComparison) {
    final ByteBooleanComparison categoryOperation = booleanComparison.getByteCategoryOperation();

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

  public void modifyGreaterThan(final ByteBooleanComparison modifiedGreaterThan) {
    this.modifiedGreaterThan = modifiedGreaterThan;
  }

  public ByteBooleanComparison getOriginalGreaterThan() {
    return this.greaterThan;
  }

  public ByteBooleanComparison greaterThan(final BooleanComparisonCategorySupport booleanComparison) {
    final ByteBooleanComparison categoryOperation = booleanComparison.getByteCategoryOperation();

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

  public void modifyLessThanOrEquals(final ByteBooleanComparison modifiedLessThanOrEquals) {
    this.modifiedLessThanOrEquals = modifiedLessThanOrEquals;
  }

  public ByteBooleanComparison getOriginalLessThanOrEquals() {
    return this.lessThanOrEquals;
  }

  public ByteBooleanComparison lessThanOrEquals(final BooleanComparisonCategorySupport booleanComparison) {
    final ByteBooleanComparison categoryOperation = booleanComparison.getByteCategoryOperation();

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

  public void modifyGreaterThanOrEquals(final ByteBooleanComparison modifiedGreaterThanOrEquals) {
    this.modifiedGreaterThanOrEquals = modifiedGreaterThanOrEquals;
  }

  public ByteBooleanComparison getOriginalGreaterThanOrEquals() {
    return this.greaterThanOrEquals;
  }

  public ByteBooleanComparison greaterThanOrEquals(final BooleanComparisonCategorySupport booleanComparison) {
    final ByteBooleanComparison categoryOperation = booleanComparison.getByteCategoryOperation();

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
