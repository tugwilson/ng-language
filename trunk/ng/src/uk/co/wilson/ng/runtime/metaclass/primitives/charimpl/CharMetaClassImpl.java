package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

import ng.runtime.metaclass.*;
import ng.runtime.metaclass.BooleanComparisonCategorySupport;
import ng.runtime.metaclass.ShiftCategorySupport;
import ng.runtime.metaclass.primitives.charimpl.CharBinaryArithmeticOperation;
import ng.runtime.metaclass.primitives.charimpl.CharBinaryLogicalOperation;
import ng.runtime.metaclass.primitives.charimpl.CharBooleanComparison;
import ng.runtime.metaclass.primitives.charimpl.CharConversion;
import ng.runtime.metaclass.primitives.charimpl.CharIntegerComparison;
import ng.runtime.metaclass.primitives.charimpl.CharMetaClass;
import ng.runtime.metaclass.primitives.charimpl.CharShiftOperation;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;

public class CharMetaClassImpl extends BaseMetaClass implements CharMetaClass {

  private volatile CharConversion modifiedConvert = null;

  private volatile CharBinaryArithmeticOperation modifiedAdd = null;
  private volatile CharBinaryArithmeticOperation modifiedSubtract = null;
  private volatile CharBinaryArithmeticOperation modifiedMultiply = null;
  private volatile CharBinaryArithmeticOperation modifiedDivide = null;
  private volatile CharBinaryArithmeticOperation modifiedModulo = null;
  private volatile CharBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile CharBinaryArithmeticOperation modifiedPower = null;

  private volatile CharBinaryLogicalOperation modifiedAnd = null;
  private volatile CharBinaryLogicalOperation modifiedOr = null;
  private volatile CharBinaryLogicalOperation modifiedXor = null;
  private volatile CharShiftOperation modifiedLeftShift = null;
  private volatile CharShiftOperation modifiedRightShift = null;
  private volatile CharShiftOperation modifiedUnsignedRightShift = null;

  private volatile CharIntegerComparison modifiedCompare = null;

  private volatile CharBooleanComparison modifiedEquals = null;
  private volatile CharBooleanComparison modifiedNotEquals = null;
  private volatile CharBooleanComparison modifiedLessThan = null;
  private volatile CharBooleanComparison modifiedGreaterThan = null;
  private volatile CharBooleanComparison modifiedLessThanOrEquals = null;
  private volatile CharBooleanComparison modifiedGreaterThanOrEquals = null;

  private final CharConversion convert = new Convert();

  private final CharBinaryArithmeticOperation add = new Add();
  private final CharBinaryArithmeticOperation subtract = new Subtract();
  private final CharBinaryArithmeticOperation multiply = new Multiply();
  private final CharBinaryArithmeticOperation divide = new Divide();
  private final CharBinaryArithmeticOperation modulo = new Modulo();
  private final CharBinaryArithmeticOperation remainderDivide = new RemainderDivide();
  private final CharBinaryArithmeticOperation power = new Power();

  private final CharBinaryLogicalOperation and = new And();
  private final CharBinaryLogicalOperation or = new Or();
  private final CharBinaryLogicalOperation xor = new Xor();
  private final CharShiftOperation leftShift = new LeftShift();
  private final CharShiftOperation rightShift = new RightShift();
  private final CharShiftOperation unsignedRightShift = new UnsignedRightShift();

  private final CharIntegerComparison compare = new Compare();

  private final CharBooleanComparison equals = new Equals();
  private final CharBooleanComparison notEquals = new NotEquals();
  private final CharBooleanComparison lessThan = new LessThan();
  private final CharBooleanComparison greaterThan = new GreaterThan();
  private final CharBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final CharBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public CharMetaClassImpl() {
    super(char.class);
  }

  private CharBinaryArithmeticOperation fixOperationType(final BinaryOperation modifiedOperation) {
    if (modifiedOperation instanceof CharBinaryArithmeticOperation) {
      return( CharBinaryArithmeticOperation) modifiedOperation;
    }

    return new CharBinaryArithmeticOperationWrapper(modifiedOperation);
  }

  private CharBinaryLogicalOperation fixOperationType(final LogicalBinaryOperation modifiedOperation) {
    if (modifiedOperation instanceof CharBinaryLogicalOperation) {
      return (CharBinaryLogicalOperation)modifiedOperation;
    }

    return new CharBinaryLogicalOperationWrapper(modifiedOperation);
  }

  private CharShiftOperation fixOperationType(final ShiftOperation modifiedOperation) {
    if (modifiedOperation instanceof CharShiftOperation) {
      return (CharShiftOperation)modifiedOperation;
    }

    return new CharShiftOperationWrapper(modifiedOperation);
  }

  private CharBooleanComparison fixOperationType(final BooleanBinaryComparison modifiedOperation) {
    if(modifiedOperation instanceof CharBooleanComparison) {
      return (CharBooleanComparison)modifiedOperation;
    }

    return new CharBooleanComparisonWrapper(modifiedOperation);
  }

  public void modifyConvert(final Conversion modifiedConvert) {
    if (modifiedConvert instanceof CharConversion) {
      modifyConvert((CharConversion)modifiedConvert);
    } else {
      modifyConvert(new CharConversionWrapper(modifiedConvert));
    }
  }

  public void modifyConvert(final CharConversion modifiedConvert) {
    this.modifiedConvert = modifiedConvert;
  }

  public CharConversion getOriginalConvert() {
    return this.convert;
  }

  public CharConversion convert(final ConversionOperationCategorySupport conversionOperation) {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final BinaryOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final CharBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public CharBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public CharBinaryArithmeticOperation add(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final CharBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getCharCategoryOperation();

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

  public void modifySubtract(final CharBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public CharBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public CharBinaryArithmeticOperation subtract(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final CharBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getCharCategoryOperation();

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

  public void modifyMultiply(final CharBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public CharBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public CharBinaryArithmeticOperation multiply(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final CharBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getCharCategoryOperation();

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

  public void modifyDivide(final CharBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public CharBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public CharBinaryArithmeticOperation divide(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final CharBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getCharCategoryOperation();

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

  public void modifyModulo(final CharBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public CharBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public CharBinaryArithmeticOperation modulo(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final CharBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getCharCategoryOperation();

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

  public void modifyPower(final CharBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public CharBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public CharBinaryArithmeticOperation power(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final CharBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getCharCategoryOperation();

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

  public void modifyRemainderDivide(final CharBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public CharBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public CharBinaryArithmeticOperation remainderDivide(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final CharBinaryArithmeticOperation categoryOperation = binaryArithmeticOperation.getCharCategoryOperation();

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

  public void modifyAnd(final CharBinaryLogicalOperation modifiedAnd) {
    this.modifiedAnd = modifiedAnd;
  }

  public CharBinaryLogicalOperation getOriginalAnd() {
    return this.and;
  }

  public CharBinaryLogicalOperation and(final BinaryLogicalCategorySupport binaryLogicalOperation) {
  final CharBinaryLogicalOperation categoryOperation = binaryLogicalOperation.getCharCategoryOperation();

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

  public void modifyOr(final CharBinaryLogicalOperation modifiedOr) {
    this.modifiedOr = modifiedOr;
  }

  public CharBinaryLogicalOperation getOriginalOr() {
    return this.or;
  }

  public CharBinaryLogicalOperation or(final BinaryLogicalCategorySupport binaryLogicalOperation) {
  final CharBinaryLogicalOperation categoryOperation = binaryLogicalOperation.getCharCategoryOperation();

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

  public void modifyXor(final CharBinaryLogicalOperation modifiedXor) {
    this.modifiedXor = modifiedXor;
  }

  public CharBinaryLogicalOperation getOriginalXor() {
    return this.xor;
  }

  public CharBinaryLogicalOperation xor(final BinaryLogicalCategorySupport binaryLogicalOperation) {
  final CharBinaryLogicalOperation categoryOperation = binaryLogicalOperation.getCharCategoryOperation();

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

  public void modifyLeftShift(final CharShiftOperation modifiedLeftShift) {
    this.modifiedLeftShift = modifiedLeftShift;
  }

  public CharShiftOperation getOriginalLeftShift() {
    return this.leftShift;
  }

  public CharShiftOperation leftShift(final ShiftCategorySupport shiftOperation) {
  final CharShiftOperation categoryOperation = shiftOperation.getCharCategoryOperation();

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

  public void modifyRightShift(final CharShiftOperation modifiedRightShift) {
    this.modifiedRightShift = modifiedRightShift;
  }

  public CharShiftOperation getOriginalRightShift() {
    return this.rightShift;
  }

  public CharShiftOperation rightShift(final ShiftCategorySupport shiftOperation) {
  final CharShiftOperation categoryOperation = shiftOperation.getCharCategoryOperation();

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

  public void modifyUnsignedRightShift(final CharShiftOperation modifiedUnsignedRightShift) {
    this.modifiedUnsignedRightShift = modifiedUnsignedRightShift;
  }

  public CharShiftOperation getOriginalUnsignedRightShift() {
    return this.unsignedRightShift;
  }

  public CharShiftOperation unsignedRightShift(final ShiftCategorySupport shiftOperation) {
  final CharShiftOperation categoryOperation = shiftOperation.getCharCategoryOperation();

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
    if (modifiedCompare instanceof CharIntegerComparison) {
      modifyCompare((CharIntegerComparison)this.modifiedConvert);
    } else {
      modifyCompare(new CharIntegerComparisonWrapper(modifiedCompare));
    }
  }

  public void modifyCompare(final CharIntegerComparison modifiedCompare) {
    this.modifiedCompare = modifiedCompare;
  }

  public CharIntegerComparison getOriginalCompare() {
    return this.compare;
  }

  public CharIntegerComparison compare(final IntegerComparisonCategorySupport integerComparison) {
  final CharIntegerComparison categoryOperation = integerComparison.getCharCategoryOperation();

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

  public void modifyEquals(final CharBooleanComparison modifiedEquals) {
    this.modifiedEquals = modifiedEquals;
  }

  public CharBooleanComparison getOriginalEquals() {
    return this.equals;
  }

  public CharBooleanComparison equals(final BooleanComparisonCategorySupport booleanComparison) {
  final CharBooleanComparison categoryOperation = booleanComparison.getCharCategoryOperation();

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

  public void modifyNotEquals(final CharBooleanComparison modifiedNotEquals) {
    this.modifiedNotEquals = modifiedNotEquals;
  }

  public CharBooleanComparison getOriginalNotEquals() {
    return this.notEquals;
  }

  public CharBooleanComparison notEquals(final BooleanComparisonCategorySupport booleanComparison) {
  final CharBooleanComparison categoryOperation = booleanComparison.getCharCategoryOperation();

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

  public void modifyLessThan(final CharBooleanComparison modifiedLessThan) {
    this.modifiedLessThan = modifiedLessThan;
  }

  public CharBooleanComparison getOriginalLessThan() {
    return this.lessThan;
  }

  public CharBooleanComparison lessThan(final BooleanComparisonCategorySupport booleanComparison) {
  final CharBooleanComparison categoryOperation = booleanComparison.getCharCategoryOperation();

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

  public void modifyGreaterThan(final CharBooleanComparison modifiedGreaterThan) {
    this.modifiedGreaterThan = modifiedGreaterThan;
  }

  public CharBooleanComparison getOriginalGreaterThan() {
    return this.greaterThan;
  }

  public CharBooleanComparison greaterThan(final BooleanComparisonCategorySupport booleanComparison) {
  final CharBooleanComparison categoryOperation = booleanComparison.getCharCategoryOperation();

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

  public void modifyLessThanOrEquals(final CharBooleanComparison modifiedLessThanOrEquals) {
    this.modifiedLessThanOrEquals = modifiedLessThanOrEquals;
  }

  public CharBooleanComparison getOriginalLessThanOrEquals() {
    return this.lessThanOrEquals;
  }

  public CharBooleanComparison lessThanOrEquals(final BooleanComparisonCategorySupport booleanComparison) {
  final CharBooleanComparison categoryOperation = booleanComparison.getCharCategoryOperation();

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

  public void modifyGreaterThanOrEquals(final CharBooleanComparison modifiedGreaterThanOrEquals) {
    this.modifiedGreaterThanOrEquals = modifiedGreaterThanOrEquals;
  }

  public CharBooleanComparison getOriginalGreaterThanOrEquals() {
    return this.greaterThanOrEquals;
  }

  public CharBooleanComparison greaterThanOrEquals(final BooleanComparisonCategorySupport booleanComparison) {
  final CharBooleanComparison categoryOperation = booleanComparison.getCharCategoryOperation();

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
