package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigInteger;

import ng.runtime.metaclass.*;
import ng.runtime.metaclass.BaseBooleanComparison;
import ng.runtime.metaclass.BaseShiftOperation;
import ng.runtime.metaclass.primitives.biginteger.BigIntegerBinaryArithmeticOperation;
import ng.runtime.metaclass.primitives.biginteger.BigIntegerBinaryLogicalOperation;
import ng.runtime.metaclass.primitives.biginteger.BigIntegerBooleanComparison;
import ng.runtime.metaclass.primitives.biginteger.BigIntegerConversion;
import ng.runtime.metaclass.primitives.biginteger.BigIntegerIntegerComparison;
import ng.runtime.metaclass.primitives.biginteger.BigIntegerMetaClass;
import ng.runtime.metaclass.primitives.biginteger.BigIntegerShiftOperation;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;

public class BigIntegerMetaClassImpl extends BaseMetaClass implements BigIntegerMetaClass {
  private volatile BigIntegerConversion modifiedConvert = null;

  private volatile BigIntegerBinaryArithmeticOperation modifiedAdd = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedSubtract = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedMultiply = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedDivide = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedModulo = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedPower = null;

  private volatile BigIntegerBinaryLogicalOperation modifiedAnd = null;
  private volatile BigIntegerBinaryLogicalOperation modifiedOr = null;
  private volatile BigIntegerBinaryLogicalOperation modifiedXor = null;
  private volatile BigIntegerShiftOperation modifiedLeftShift = null;
  private volatile BigIntegerShiftOperation modifiedRightShift = null;
  private volatile BigIntegerShiftOperation modifiedUnsignedRightShift = null;

  private volatile BigIntegerIntegerComparison modifiedCompare = null;

  private volatile BigIntegerBooleanComparison modifiedEquals = null;
  private volatile BigIntegerBooleanComparison modifiedNotEquals = null;
  private volatile BigIntegerBooleanComparison modifiedLessThan = null;
  private volatile BigIntegerBooleanComparison modifiedGreaterThan = null;
  private volatile BigIntegerBooleanComparison modifiedLessThanOrEquals = null;
  private volatile BigIntegerBooleanComparison modifiedGreaterThanOrEquals = null;

  private final BigIntegerConversion convert = new Convert();

  private final BigIntegerBinaryArithmeticOperation add = new Add();
  private final BigIntegerBinaryArithmeticOperation subtract = new Subtract();
  private final BigIntegerBinaryArithmeticOperation multiply = new Multiply();
  private final BigIntegerBinaryArithmeticOperation divide = new Divide();
  private final BigIntegerBinaryArithmeticOperation modulo = new Modulo();
  private final BigIntegerBinaryArithmeticOperation remainderDivide = new RemainderDivide();
  private final BigIntegerBinaryArithmeticOperation power = new Power();

  private final BigIntegerBinaryLogicalOperation and = new And();
  private final BigIntegerBinaryLogicalOperation or = new Or();
  private final BigIntegerBinaryLogicalOperation xor = new Xor();
  private final BigIntegerShiftOperation leftShift = new LeftShift();
  private final BigIntegerShiftOperation rightShift = new RightShift();
  private final BigIntegerShiftOperation unsignedRightShift = new UnsignedRightShift();

  private final BigIntegerIntegerComparison compare = new Compare();

  private final BigIntegerBooleanComparison equals = new Equals();
  private final BigIntegerBooleanComparison notEquals = new NotEquals();
  private final BigIntegerBooleanComparison lessThan = new LessThan();
  private final BigIntegerBooleanComparison greaterThan = new GreaterThan();
  private final BigIntegerBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final BigIntegerBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public BigIntegerMetaClassImpl() {
    super(BigInteger.class);
  }

  private BigIntegerBinaryArithmeticOperation fixOperationType(final BinaryOperation modifiedOperation) {
    if (modifiedOperation instanceof BigIntegerBinaryArithmeticOperation) {
      return( BigIntegerBinaryArithmeticOperation) modifiedOperation;
    }

    return new BigIntegerBinaryArithmeticOperationWrapper(modifiedOperation);
  }

  private BigIntegerBinaryLogicalOperation fixOperationType(final LogicalBinaryOperation modifiedOperation) {
    if (modifiedOperation instanceof BigIntegerBinaryLogicalOperation) {
      return (BigIntegerBinaryLogicalOperation)modifiedOperation;
    }

    return new BigIntegerBinaryLogicalOperationWrapper(modifiedOperation);
  }

  private BigIntegerShiftOperation fixOperationType(final ShiftOperation modifiedOperation) {
    if (modifiedOperation instanceof BigIntegerShiftOperation) {
      return (BigIntegerShiftOperation)modifiedOperation;
    }

    return new BigIntegerShiftOperationWrapper(modifiedOperation);
  }

  private BigIntegerBooleanComparison fixOperationType(final BooleanBinaryComparison modifiedOperation) {
    if(modifiedOperation instanceof BigIntegerBooleanComparison) {
      return (BigIntegerBooleanComparison)modifiedOperation;
    }

    return new BigIntegerBooleanComparisonWrapper(modifiedOperation);
  }

  public void modifyConvert(final Conversion modifiedConvert) {
    if (modifiedConvert instanceof BigIntegerConversion) {
      modifyConvert((BigIntegerConversion)modifiedConvert);
    } else {
      modifyConvert(new BigIntegerConversionWrapper(modifiedConvert));
    }
  }

  public void modifyConvert(final BigIntegerConversion modifiedConvert) {
    this.modifiedConvert = modifiedConvert;
  }

  public BigIntegerConversion getOriginalConvert() {
    return this.convert;
  }

  public BigIntegerConversion convert(final BaseConversionOperation conversionOperation) {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final BinaryOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final BigIntegerBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public BigIntegerBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public BigIntegerBinaryArithmeticOperation add(final BaseArithmeticBinaryOperation binaryArithmeticOperation) {
  final BigIntegerBinaryArithmeticOperation bigIntegerCategoryOperation = binaryArithmeticOperation.getBigIntegerCategoryOperation();

    if (bigIntegerCategoryOperation == null) {
      if (this.modifiedAdd == null) {
        return this.add;
      } else {
        return this.modifiedAdd;
      }
    } else {
      return bigIntegerCategoryOperation;
    }
  }

  public void modifySubtract(final BinaryOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final BigIntegerBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public BigIntegerBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public BigIntegerBinaryArithmeticOperation subtract(final BaseArithmeticBinaryOperation binaryArithmeticOperation) {
  final BigIntegerBinaryArithmeticOperation bigIntegerCategoryOperation = binaryArithmeticOperation.getBigIntegerCategoryOperation();

    if (bigIntegerCategoryOperation == null) {
      if (this.modifiedSubtract == null) {
        return this.subtract;
      } else {
        return this.modifiedSubtract;
      }
    } else {
      return bigIntegerCategoryOperation;
    }
  }

  public void modifyMultiply(final BinaryOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final BigIntegerBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public BigIntegerBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public BigIntegerBinaryArithmeticOperation multiply(final BaseArithmeticBinaryOperation binaryArithmeticOperation) {
  final BigIntegerBinaryArithmeticOperation bigIntegerCategoryOperation = binaryArithmeticOperation.getBigIntegerCategoryOperation();

    if (bigIntegerCategoryOperation == null) {
      if (this.modifiedMultiply == null) {
        return this.multiply;
      } else {
        return this.modifiedMultiply;
      }
    } else {
      return bigIntegerCategoryOperation;
    }
  }

  public void modifyDivide(final BinaryOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final BigIntegerBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public BigIntegerBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public BigIntegerBinaryArithmeticOperation divide(final BaseArithmeticBinaryOperation binaryArithmeticOperation) {
  final BigIntegerBinaryArithmeticOperation bigIntegerCategoryOperation = binaryArithmeticOperation.getBigIntegerCategoryOperation();

    if (bigIntegerCategoryOperation == null) {
      if (this.modifiedDivide == null) {
        return this.divide;
      } else {
        return this.modifiedDivide;
      }
    } else {
      return bigIntegerCategoryOperation;
    }
  }

  public void modifyModulo(final BinaryOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final BigIntegerBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public BigIntegerBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public BigIntegerBinaryArithmeticOperation modulo(final BaseArithmeticBinaryOperation binaryArithmeticOperation) {
  final BigIntegerBinaryArithmeticOperation bigIntegerCategoryOperation = binaryArithmeticOperation.getBigIntegerCategoryOperation();

    if (bigIntegerCategoryOperation == null) {
      if (this.modifiedModulo == null) {
        return this.modulo;
      } else {
        return this.modifiedModulo;
      }
    } else {
      return bigIntegerCategoryOperation;
    }
  }

  public void modifyPower(final BinaryOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final BigIntegerBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public BigIntegerBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public BigIntegerBinaryArithmeticOperation power(final BaseArithmeticBinaryOperation binaryArithmeticOperation) {
  final BigIntegerBinaryArithmeticOperation bigIntegerCategoryOperation = binaryArithmeticOperation.getBigIntegerCategoryOperation();

    if (bigIntegerCategoryOperation == null) {
      if (this.modifiedPower == null) {
        return this.power;
      } else {
        return this.modifiedPower;
      }
    } else {
      return bigIntegerCategoryOperation;
    }
  }

  public void modifyRemainderDivide(final BinaryOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final BigIntegerBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public BigIntegerBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public BigIntegerBinaryArithmeticOperation remainderDivide(final BaseArithmeticBinaryOperation binaryArithmeticOperation) {
  final BigIntegerBinaryArithmeticOperation bigIntegerCategoryOperation = binaryArithmeticOperation.getBigIntegerCategoryOperation();

    if (bigIntegerCategoryOperation == null) {
      if (this.modifiedRemainderDivide == null) {
        return this.remainderDivide;
      } else {
        return this.modifiedRemainderDivide;
      }
    } else {
      return bigIntegerCategoryOperation;
    }
  }

  public void modifyAnd(final LogicalBinaryOperation modifiedAnd) {
    modifyAnd(fixOperationType(modifiedAnd));
  }

  public void modifyAnd(final BigIntegerBinaryLogicalOperation modifiedAnd) {
    this.modifiedAnd = modifiedAnd;
  }

  public BigIntegerBinaryLogicalOperation getOriginalAnd() {
    return this.and;
  }

  public BigIntegerBinaryLogicalOperation and(final BaseLogicalBinaryOperation binaryLogicalOperation) {
  final BigIntegerBinaryLogicalOperation categoryOperation = binaryLogicalOperation.getBigIntegerCategoryOperation();

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

  public void modifyOr(final BigIntegerBinaryLogicalOperation modifiedOr) {
    this.modifiedOr = modifiedOr;
  }

  public BigIntegerBinaryLogicalOperation getOriginalOr() {
    return this.or;
  }

  public BigIntegerBinaryLogicalOperation or(final BaseLogicalBinaryOperation binaryLogicalOperation) {
  final BigIntegerBinaryLogicalOperation categoryOperation = binaryLogicalOperation.getBigIntegerCategoryOperation();

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

  public void modifyXor(final BigIntegerBinaryLogicalOperation modifiedXor) {
    this.modifiedXor = modifiedXor;
  }

  public BigIntegerBinaryLogicalOperation getOriginalXor() {
    return this.xor;
  }

  public BigIntegerBinaryLogicalOperation xor(final BaseLogicalBinaryOperation binaryLogicalOperation) {
  final BigIntegerBinaryLogicalOperation categoryOperation = binaryLogicalOperation.getBigIntegerCategoryOperation();

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

  public void modifyLeftShift(final BigIntegerShiftOperation modifiedLeftShift) {
    this.modifiedLeftShift = modifiedLeftShift;
  }

  public BigIntegerShiftOperation getOriginalLeftShift() {
    return this.leftShift;
  }

  public BigIntegerShiftOperation leftShift(final BaseShiftOperation shiftOperation) {
  final BigIntegerShiftOperation categoryOperation = shiftOperation.getBigIntegerCategoryOperation();

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

  public void modifyRightShift(final BigIntegerShiftOperation modifiedRightShift) {
    this.modifiedRightShift = modifiedRightShift;
  }

  public BigIntegerShiftOperation getOriginalRightShift() {
    return this.rightShift;
  }

  public BigIntegerShiftOperation rightShift(final BaseShiftOperation shiftOperation) {
  final BigIntegerShiftOperation categoryOperation = shiftOperation.getBigIntegerCategoryOperation();

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

  public void modifyUnsignedRightShift(final BigIntegerShiftOperation modifiedUnsignedRightShift) {
    this.modifiedUnsignedRightShift = modifiedUnsignedRightShift;
  }

  public BigIntegerShiftOperation getOriginalUnsignedRightShift() {
    return this.unsignedRightShift;
  }

  public BigIntegerShiftOperation unsignedRightShift(final BaseShiftOperation shiftOperation) {
  final BigIntegerShiftOperation categoryOperation = shiftOperation.getBigIntegerCategoryOperation();

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
    if (modifiedCompare instanceof BigIntegerIntegerComparison) {
      modifyCompare((BigIntegerIntegerComparison)this.modifiedConvert);
    } else {
      modifyCompare(new BigIntegerIntegerComparisonWrapper(modifiedCompare));
    }
  }

  public void modifyCompare(final BigIntegerIntegerComparison modifiedCompare) {
    this.modifiedCompare = modifiedCompare;
  }

  public BigIntegerIntegerComparison getOriginalCompare() {
    return this.compare;
  }

  public BigIntegerIntegerComparison compare(final BaseIntegerComparison integerComparison) {
  final BigIntegerIntegerComparison bigDecimalCategoryOperation = integerComparison.getBigIntegerCategoryOperation();

    if (bigDecimalCategoryOperation == null) {
      if (this.modifiedCompare == null) {
        return this.compare;
      } else {
        return this.modifiedCompare;
      }
    } else {
      return bigDecimalCategoryOperation;
    }
  }

  public void modifyEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyEquals(final BigIntegerBooleanComparison modifiedEquals) {
    this.modifiedEquals = modifiedEquals;
  }

  public BigIntegerBooleanComparison getOriginalEquals() {
    return this.equals;
  }

  public BigIntegerBooleanComparison equals(final BaseBooleanComparison booleanComparison) {
  final BigIntegerBooleanComparison bigIntegerCategoryOperation = booleanComparison.getBigIntegerCategoryOperation();

    if (bigIntegerCategoryOperation == null) {
      if (this.modifiedEquals == null) {
        return this.equals;
      } else {
        return this.modifiedEquals;
      }
    } else {
      return bigIntegerCategoryOperation;
    }
  }

  public void modifyNotEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyNotEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyNotEquals(final BigIntegerBooleanComparison modifiedNotEquals) {
    this.modifiedNotEquals = modifiedNotEquals;
  }

  public BigIntegerBooleanComparison getOriginalNotEquals() {
    return this.notEquals;
  }

  public BigIntegerBooleanComparison notEquals(final BaseBooleanComparison booleanComparison) {
  final BigIntegerBooleanComparison bigIntegerCategoryOperation = booleanComparison.getBigIntegerCategoryOperation();

    if (bigIntegerCategoryOperation == null) {
      if (this.modifiedNotEquals == null) {
        return this.notEquals;
      } else {
        return this.modifiedNotEquals;
      }
    } else {
      return bigIntegerCategoryOperation;
    }
  }

  public void modifyLessThan(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyLessThan(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyLessThan(final BigIntegerBooleanComparison modifiedLessThan) {
    this.modifiedLessThan = modifiedLessThan;
  }

  public BigIntegerBooleanComparison getOriginalLessThan() {
    return this.lessThan;
  }

  public BigIntegerBooleanComparison lessThan(final BaseBooleanComparison booleanComparison) {
  final BigIntegerBooleanComparison bigIntegerCategoryOperation = booleanComparison.getBigIntegerCategoryOperation();

    if (bigIntegerCategoryOperation == null) {
      if (this.modifiedLessThan == null) {
        return this.lessThan;
      } else {
        return this.modifiedLessThan;
      }
    } else {
      return bigIntegerCategoryOperation;
    }
  }

  public void modifyGreaterThan(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyGreaterThan(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyGreaterThan(final BigIntegerBooleanComparison modifiedGreaterThan) {
    this.modifiedGreaterThan = modifiedGreaterThan;
  }

  public BigIntegerBooleanComparison getOriginalGreaterThan() {
    return this.greaterThan;
  }

  public BigIntegerBooleanComparison greaterThan(final BaseBooleanComparison booleanComparison) {
  final BigIntegerBooleanComparison bigIntegerCategoryOperation = booleanComparison.getBigIntegerCategoryOperation();

    if (bigIntegerCategoryOperation == null) {
      if (this.modifiedGreaterThan == null) {
        return this.greaterThan;
      } else {
        return this.modifiedGreaterThan;
      }
    } else {
      return bigIntegerCategoryOperation;
    }
  }

  public void modifyLessThanOrEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyLessThanOrEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyLessThanOrEquals(final BigIntegerBooleanComparison modifiedLessThanOrEquals) {
    this.modifiedLessThanOrEquals = modifiedLessThanOrEquals;
  }

  public BigIntegerBooleanComparison getOriginalLessThanOrEquals() {
    return this.lessThanOrEquals;
  }

  public BigIntegerBooleanComparison lessThanOrEquals(final BaseBooleanComparison booleanComparison) {
  final BigIntegerBooleanComparison bigIntegerCategoryOperation = booleanComparison.getBigIntegerCategoryOperation();

    if (bigIntegerCategoryOperation == null) {
      if (this.modifiedLessThanOrEquals == null) {
        return this.lessThanOrEquals;
      } else {
        return this.modifiedLessThanOrEquals;
      }
    } else {
      return bigIntegerCategoryOperation;
    }
  }

  public void modifyGreaterThanOrEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyGreaterThanOrEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyGreaterThanOrEquals(final BigIntegerBooleanComparison modifiedGreaterThanOrEquals) {
    this.modifiedGreaterThanOrEquals = modifiedGreaterThanOrEquals;
  }

  public BigIntegerBooleanComparison getOriginalGreaterThanOrEquals() {
    return this.greaterThanOrEquals;
  }

  public BigIntegerBooleanComparison greaterThanOrEquals(final BaseBooleanComparison booleanComparison) {
  final BigIntegerBooleanComparison bigIntegerCategoryOperation = booleanComparison.getBigIntegerCategoryOperation();

    if (bigIntegerCategoryOperation == null) {
      if (this.modifiedGreaterThanOrEquals == null) {
        return this.greaterThanOrEquals;
      } else {
        return this.modifiedGreaterThanOrEquals;
      }
    } else {
      return bigIntegerCategoryOperation;
    }
  }
}
