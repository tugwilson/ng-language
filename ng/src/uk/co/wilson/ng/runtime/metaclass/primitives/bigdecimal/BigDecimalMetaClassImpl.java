package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;

import ng.runtime.metaclass.BinaryOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import ng.runtime.metaclass.LogicalBinaryOperation;
import ng.runtime.metaclass.ShiftOperation;
import ng.runtime.metaclass.primitives.bigdecimal.BigDecimalBinaryArithmeticOperation;
import ng.runtime.metaclass.primitives.bigdecimal.BigDecimalBooleanComparison;
import ng.runtime.metaclass.primitives.bigdecimal.BigDecimalConversion;
import ng.runtime.metaclass.primitives.bigdecimal.BigDecimalIntegerComparison;
import ng.runtime.metaclass.primitives.bigdecimal.BigDecimalMetaClass;
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

public class BigDecimalMetaClassImpl extends FractionalNumberMetaClassImpl implements BigDecimalMetaClass {
  private volatile BigDecimalConversion modifiedConvert = null;

  private volatile BigDecimalBinaryArithmeticOperation modifiedAdd = null;

  private volatile BigDecimalBinaryArithmeticOperation modifiedSubtract = null;

  private volatile BigDecimalBinaryArithmeticOperation modifiedMultiply = null;

  private volatile BigDecimalBinaryArithmeticOperation modifiedDivide = null;

  private volatile BigDecimalBinaryArithmeticOperation modifiedModulo = null;

  private volatile BigDecimalBinaryArithmeticOperation modifiedRemainderDivide = null;

  private volatile BigDecimalBinaryArithmeticOperation modifiedPower = null;

  private volatile BigDecimalIntegerComparison modifiedCompare = null;

  private volatile BigDecimalBooleanComparison modifiedEquals = null;

  private volatile BigDecimalBooleanComparison modifiedNotEquals = null;

  private volatile BigDecimalBooleanComparison modifiedLessThan = null;

  private volatile BigDecimalBooleanComparison modifiedGreaterThan = null;

  private volatile BigDecimalBooleanComparison modifiedLessThanOrEquals = null;

  private volatile BigDecimalBooleanComparison modifiedGreaterThanOrEquals = null;

  private final BigDecimalConversion convert = new Convert();

  private final BigDecimalBinaryArithmeticOperation add = new Add();

  private final BigDecimalBinaryArithmeticOperation subtract = new Subtract();

  private final BigDecimalBinaryArithmeticOperation multiply = new Multiply();

  private final BigDecimalBinaryArithmeticOperation divide = new Divide();

  private final BigDecimalBinaryArithmeticOperation modulo = new Modulo();

  private final BigDecimalBinaryArithmeticOperation remainderDivide = new RemainderDivide();

  private final BigDecimalBinaryArithmeticOperation power = new Power();

  private final BigDecimalIntegerComparison compare = new Compare();

  private final BigDecimalBooleanComparison equals = new Equals();

  private final BigDecimalBooleanComparison notEquals = new NotEquals();

  private final BigDecimalBooleanComparison lessThan = new LessThan();

  private final BigDecimalBooleanComparison greaterThan = new GreaterThan();

  private final BigDecimalBooleanComparison lessThanOrEquals = new LessThanOrEquals();

  private final BigDecimalBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public BigDecimalMetaClassImpl() {
    super(BigDecimal.class);
  }

  private BigDecimalBinaryArithmeticOperation fixOperationType(final BinaryOperation modifiedOperation) {
    if (modifiedOperation instanceof BigDecimalBinaryArithmeticOperation) {
      return (BigDecimalBinaryArithmeticOperation) modifiedOperation;
    }

    return new BigDecimalBinaryArithmeticOperationWrapper(modifiedOperation);
  }

  private BigDecimalBooleanComparison fixOperationType(final BooleanBinaryComparison modifiedOperation) {
    if (modifiedOperation instanceof BigDecimalBooleanComparison) {
      return (BigDecimalBooleanComparison) modifiedOperation;
    }

    return new BigDecimalBooleanComparisonWrapper(modifiedOperation);
  }

  public void modifyConvert(final Conversion modifiedConvert) {
    if (modifiedConvert instanceof BigDecimalConversion) {
      modifyConvert((BigDecimalConversion) modifiedConvert);
    } else {
      modifyConvert(new BigDecimalConversionWrapper(modifiedConvert));
    }
  }

  public void modifyConvert(final BigDecimalConversion modifiedConvert) {
    this.modifiedConvert = modifiedConvert;
  }

  public BigDecimalConversion getOriginalConvert() {
    return this.convert;
  }

  public BigDecimalConversion convert(final ConversionOperationCategorySupport conversionOperation) {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final BinaryOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final BigDecimalBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public BigDecimalBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public BigDecimalBinaryArithmeticOperation add(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final BigDecimalBinaryArithmeticOperation bigDecimalCategoryOperation = binaryArithmeticOperation.getBigDecimalCategoryOperation();

    if (bigDecimalCategoryOperation == null) {
      if (this.modifiedAdd == null) {
        return this.add;
      } else {
        return this.modifiedAdd;
      }
    } else {
      return bigDecimalCategoryOperation;
    }
  }

  public void modifySubtract(final BinaryOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final BigDecimalBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public BigDecimalBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public BigDecimalBinaryArithmeticOperation subtract(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final BigDecimalBinaryArithmeticOperation bigDecimalCategoryOperation = binaryArithmeticOperation.getBigDecimalCategoryOperation();

    if (bigDecimalCategoryOperation == null) {
      if (this.modifiedSubtract == null) {
        return this.subtract;
      } else {
        return this.modifiedSubtract;
      }
    } else {
      return bigDecimalCategoryOperation;
    }
  }

  public void modifyMultiply(final BinaryOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final BigDecimalBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public BigDecimalBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public BigDecimalBinaryArithmeticOperation multiply(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final BigDecimalBinaryArithmeticOperation bigDecimalCategoryOperation = binaryArithmeticOperation.getBigDecimalCategoryOperation();

    if (bigDecimalCategoryOperation == null) {
      if (this.modifiedMultiply == null) {
        return this.multiply;
      } else {
        return this.modifiedMultiply;
      }
    } else {
      return bigDecimalCategoryOperation;
    }
  }

  public void modifyDivide(final BinaryOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final BigDecimalBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public BigDecimalBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public BigDecimalBinaryArithmeticOperation divide(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final BigDecimalBinaryArithmeticOperation bigDecimalCategoryOperation = binaryArithmeticOperation.getBigDecimalCategoryOperation();

    if (bigDecimalCategoryOperation == null) {
      if (this.modifiedDivide == null) {
        return this.divide;
      } else {
        return this.modifiedDivide;
      }
    } else {
      return bigDecimalCategoryOperation;
    }
  }

  public void modifyModulo(final BinaryOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final BigDecimalBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public BigDecimalBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public BigDecimalBinaryArithmeticOperation modulo(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final BigDecimalBinaryArithmeticOperation bigDecimalCategoryOperation = binaryArithmeticOperation.getBigDecimalCategoryOperation();

    if (bigDecimalCategoryOperation == null) {
      if (this.modifiedModulo == null) {
        return this.modulo;
      } else {
        return this.modifiedModulo;
      }
    } else {
      return bigDecimalCategoryOperation;
    }
  }

  public void modifyPower(final BinaryOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final BigDecimalBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public BigDecimalBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public BigDecimalBinaryArithmeticOperation power(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final BigDecimalBinaryArithmeticOperation bigDecimalCategoryOperation = binaryArithmeticOperation.getBigDecimalCategoryOperation();

    if (bigDecimalCategoryOperation == null) {
      if (this.modifiedPower == null) {
        return this.power;
      } else {
        return this.modifiedPower;
      }
    } else {
      return bigDecimalCategoryOperation;
    }
  }

  public void modifyRemainderDivide(final BinaryOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final BigDecimalBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public BigDecimalBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public BigDecimalBinaryArithmeticOperation remainderDivide(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
    final BigDecimalBinaryArithmeticOperation bigDecimalCategoryOperation = binaryArithmeticOperation.getBigDecimalCategoryOperation();

    if (bigDecimalCategoryOperation == null) {
      if (this.modifiedRemainderDivide == null) {
        return this.remainderDivide;
      } else {
        return this.modifiedRemainderDivide;
      }
    } else {
      return bigDecimalCategoryOperation;
    }
  }

  public BinaryOperation and(final BinaryLogicalCategorySupport binaryLogicalOperation) {
    final BinaryOperation categoryOperation = binaryLogicalOperation.getBigDecimalCategoryOperation();

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
    final LogicalBinaryOperation categoryOperation = binaryLogicalOperation.getBigDecimalCategoryOperation();

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
    final LogicalBinaryOperation categoryOperation = binaryLogicalOperation.getBigDecimalCategoryOperation();

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
    final ShiftOperation categoryOperation = shiftOperation.getBigDecimalCategoryOperation();

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
    final ShiftOperation categoryOperation = shiftOperation.getBigDecimalCategoryOperation();

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
    final ShiftOperation categoryOperation = shiftOperation.getBigDecimalCategoryOperation();

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
    if (modifiedCompare instanceof BigDecimalIntegerComparison) {
      modifyCompare((BigDecimalIntegerComparison) this.modifiedConvert);
    } else {
      modifyCompare(new BigDecimalIntegerComparisonWrapper(modifiedCompare));
    }
  }

  public void modifyCompare(final BigDecimalIntegerComparison modifiedCompare) {
    this.modifiedCompare = modifiedCompare;
  }

  public BigDecimalIntegerComparison getOriginalCompare() {
    return this.compare;
  }

  public BigDecimalIntegerComparison compare(final IntegerComparisonCategorySupport integerComparison) {
    final BigDecimalIntegerComparison bigDecimalCategoryOperation = integerComparison.getBigDecimalCategoryOperation();

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

  public void modifyEquals(final BooleanBinaryComparison modifiedEquals) {
    modifyEquals(fixOperationType(modifiedEquals));
  }

  public void modifyEquals(final BigDecimalBooleanComparison modifiedEquals) {
    this.modifiedEquals = modifiedEquals;
  }

  public BigDecimalBooleanComparison getOriginalEquals() {
    return this.equals;
  }

  public BigDecimalBooleanComparison equals(final BooleanComparisonCategorySupport booleanComparison) {
    final BigDecimalBooleanComparison bigDecimalCategoryOperation = booleanComparison.getBigDecimalCategoryOperation();

    if (bigDecimalCategoryOperation == null) {
      if (this.modifiedEquals == null) {
        return this.equals;
      } else {
        return this.modifiedEquals;
      }
    } else {
      return bigDecimalCategoryOperation;
    }
  }

  public void modifyNotEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyNotEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyNotEquals(final BigDecimalBooleanComparison modifiedNotEquals) {
    this.modifiedNotEquals = modifiedNotEquals;
  }

  public BigDecimalBooleanComparison getOriginalNotEquals() {
    return this.notEquals;
  }

  public BigDecimalBooleanComparison notEquals(final BooleanComparisonCategorySupport booleanComparison) {
    final BigDecimalBooleanComparison bigDecimalCategoryOperation = booleanComparison.getBigDecimalCategoryOperation();

    if (bigDecimalCategoryOperation == null) {
      if (this.modifiedNotEquals == null) {
        return this.notEquals;
      } else {
        return this.modifiedNotEquals;
      }
    } else {
      return bigDecimalCategoryOperation;
    }
  }

  public void modifyLessThan(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyLessThan(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyLessThan(final BigDecimalBooleanComparison modifiedLessThan) {
    this.modifiedLessThan = modifiedLessThan;
  }

  public BigDecimalBooleanComparison getOriginalLessThan() {
    return this.lessThan;
  }

  public BigDecimalBooleanComparison lessThan(final BooleanComparisonCategorySupport booleanComparison) {
    final BigDecimalBooleanComparison bigDecimalCategoryOperation = booleanComparison.getBigDecimalCategoryOperation();

    if (bigDecimalCategoryOperation == null) {
      if (this.modifiedLessThan == null) {
        return this.lessThan;
      } else {
        return this.modifiedLessThan;
      }
    } else {
      return bigDecimalCategoryOperation;
    }
  }

  public void modifyGreaterThan(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyGreaterThan(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyGreaterThan(final BigDecimalBooleanComparison modifiedGreaterThan) {
    this.modifiedGreaterThan = modifiedGreaterThan;
  }

  public BigDecimalBooleanComparison getOriginalGreaterThan() {
    return this.greaterThan;
  }

  public BigDecimalBooleanComparison greaterThan(final BooleanComparisonCategorySupport booleanComparison) {
    final BigDecimalBooleanComparison bigDecimalCategoryOperation = booleanComparison.getBigDecimalCategoryOperation();

    if (bigDecimalCategoryOperation == null) {
      if (this.modifiedGreaterThan == null) {
        return this.greaterThan;
      } else {
        return this.modifiedGreaterThan;
      }
    } else {
      return bigDecimalCategoryOperation;
    }
  }

  public void modifyLessThanOrEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyLessThanOrEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyLessThanOrEquals(final BigDecimalBooleanComparison modifiedLessThanOrEquals) {
    this.modifiedLessThanOrEquals = modifiedLessThanOrEquals;
  }

  public BigDecimalBooleanComparison getOriginalLessThanOrEquals() {
    return this.lessThanOrEquals;
  }

  public BigDecimalBooleanComparison lessThanOrEquals(final BooleanComparisonCategorySupport booleanComparison) {
    final BigDecimalBooleanComparison bigDecimalCategoryOperation = booleanComparison.getBigDecimalCategoryOperation();

    if (bigDecimalCategoryOperation == null) {
      if (this.modifiedLessThanOrEquals == null) {
        return this.lessThanOrEquals;
      } else {
        return this.modifiedLessThanOrEquals;
      }
    } else {
      return bigDecimalCategoryOperation;
    }
  }

  public void modifyGreaterThanOrEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyGreaterThanOrEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyGreaterThanOrEquals(final BigDecimalBooleanComparison modifiedGreaterThanOrEquals) {
    this.modifiedGreaterThanOrEquals = modifiedGreaterThanOrEquals;
  }

  public BigDecimalBooleanComparison getOriginalGreaterThanOrEquals() {
    return this.greaterThanOrEquals;
  }

  public BigDecimalBooleanComparison greaterThanOrEquals(final BooleanComparisonCategorySupport booleanComparison) {
    final BigDecimalBooleanComparison bigDecimalCategoryOperation = booleanComparison.getBigDecimalCategoryOperation();

    if (bigDecimalCategoryOperation == null) {
      if (this.modifiedGreaterThanOrEquals == null) {
        return this.greaterThanOrEquals;
      } else {
        return this.modifiedGreaterThanOrEquals;
      }
    } else {
      return bigDecimalCategoryOperation;
    }
  }
}
