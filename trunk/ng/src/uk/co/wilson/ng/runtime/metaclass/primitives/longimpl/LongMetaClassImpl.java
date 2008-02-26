package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import ng.runtime.metaclass.*;
import ng.runtime.metaclass.BaseBinaryArithmeticOperation;
import ng.runtime.metaclass.BaseBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;

public class LongMetaClassImpl extends BaseMetaClass implements LongMetaClass {
  private volatile LongConversion modifiedConvert = null;

  private volatile LongBinaryArithmeticOperation modifiedAdd = null;
  private volatile LongBinaryArithmeticOperation modifiedSubtract = null;
  private volatile LongBinaryArithmeticOperation modifiedMultiply = null;
  private volatile LongBinaryArithmeticOperation modifiedDivide = null;
  private volatile LongBinaryArithmeticOperation modifiedModulo = null;
  private volatile LongBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile LongBinaryArithmeticOperation modifiedPower = null;

  private volatile LongIntegerComparison modifiedCompare = null;

  private volatile LongBooleanComparison modifiedEquals = null;
  private volatile LongBooleanComparison modifiedNotEquals = null;
  private volatile LongBooleanComparison modifiedLessThan = null;
  private volatile LongBooleanComparison modifiedGreaterThan = null;
  private volatile LongBooleanComparison modifiedLessThanOrEquals = null;
  private volatile LongBooleanComparison modifiedGreaterThanOrEquals = null;

  private final LongConversion convert = new Convert();

  private final LongBinaryArithmeticOperation add = new Add();
  private final LongBinaryArithmeticOperation subtract = new Subtract();
  private final LongBinaryArithmeticOperation multiply = new Multiply();
  private final LongBinaryArithmeticOperation divide = new Divide();
  private final LongBinaryArithmeticOperation modulo = new Modulo();
  private final LongBinaryArithmeticOperation remainderDivide = new RemainderDivide();
  private final LongBinaryArithmeticOperation power = new Power();

  private final LongIntegerComparison compare = new Compare();

  private final LongBooleanComparison equals = new Equals();
  private final LongBooleanComparison notEquals = new NotEquals();
  private final LongBooleanComparison lessThan = new LessThan();
  private final LongBooleanComparison greaterThan = new GreaterThan();
  private final LongBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final LongBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public LongMetaClassImpl() {
    super(long.class);
  }

  private LongBinaryArithmeticOperation fixOperationType(final ArithmeticBinaryOperation modifiedOperation) {
    if (modifiedOperation instanceof LongBinaryArithmeticOperation) {
      return( LongBinaryArithmeticOperation) modifiedOperation;
    }

    return new LongBinaryArithmeticOperationWrapper(modifiedOperation);
  }

  private LongBooleanComparison fixOperationType(final BooleanBinaryComparison modifiedOperation) {
    if(modifiedOperation instanceof LongBooleanComparison) {
      return (LongBooleanComparison)modifiedOperation;
    }

    return new LongBooleanComparisonWrapper(modifiedOperation);
  }

  public void modifyConvert(final Conversion modifiedConvert) {
    if (modifiedConvert instanceof LongConversion) {
      modifyConvert((LongConversion)modifiedConvert);
    } else {
      modifyConvert(new LongConversionWrapper(modifiedConvert));
    }
  }

  public void modifyConvert(final LongConversion modifiedConvert) {
    this.modifiedConvert = modifiedConvert;
  }

  public LongConversion getOriginalConvert() {
    return this.convert;
  }

  public LongConversion convert(final BaseConversionOperation conversionOperation) {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final ArithmeticBinaryOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final LongBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public LongBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public LongBinaryArithmeticOperation add(final BaseBinaryArithmeticOperation binaryArithmeticOperation) {
  final LongBinaryArithmeticOperation longCategoryOperation = binaryArithmeticOperation.getLongCategoryOperation();

    if (longCategoryOperation == null) {
      if (this.modifiedAdd == null) {
        return this.add;
      } else {
        return this.modifiedAdd;
      }
    } else {
      return longCategoryOperation;
    }
  }

  public void modifySubtract(final ArithmeticBinaryOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final LongBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public LongBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public LongBinaryArithmeticOperation subtract(final BaseBinaryArithmeticOperation binaryArithmeticOperation) {
  final LongBinaryArithmeticOperation longCategoryOperation = binaryArithmeticOperation.getLongCategoryOperation();

    if (longCategoryOperation == null) {
      if (this.modifiedSubtract == null) {
        return this.subtract;
      } else {
        return this.modifiedSubtract;
      }
    } else {
      return longCategoryOperation;
    }
  }

  public void modifyMultiply(final ArithmeticBinaryOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final LongBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public LongBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public LongBinaryArithmeticOperation multiply(final BaseBinaryArithmeticOperation binaryArithmeticOperation) {
  final LongBinaryArithmeticOperation longCategoryOperation = binaryArithmeticOperation.getLongCategoryOperation();

    if (longCategoryOperation == null) {
      if (this.modifiedMultiply == null) {
        return this.multiply;
      } else {
        return this.modifiedMultiply;
      }
    } else {
      return longCategoryOperation;
    }
  }

  public void modifyDivide(final ArithmeticBinaryOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final LongBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public LongBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public LongBinaryArithmeticOperation divide(final BaseBinaryArithmeticOperation binaryArithmeticOperation) {
  final LongBinaryArithmeticOperation longCategoryOperation = binaryArithmeticOperation.getLongCategoryOperation();

    if (longCategoryOperation == null) {
      if (this.modifiedDivide == null) {
        return this.divide;
      } else {
        return this.modifiedDivide;
      }
    } else {
      return longCategoryOperation;
    }
  }

  public void modifyModulo(final ArithmeticBinaryOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final LongBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public LongBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public LongBinaryArithmeticOperation modulo(final BaseBinaryArithmeticOperation binaryArithmeticOperation) {
  final LongBinaryArithmeticOperation longCategoryOperation = binaryArithmeticOperation.getLongCategoryOperation();

    if (longCategoryOperation == null) {
      if (this.modifiedModulo == null) {
        return this.modulo;
      } else {
        return this.modifiedModulo;
      }
    } else {
      return longCategoryOperation;
    }
  }

  public void modifyPower(final ArithmeticBinaryOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final LongBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public LongBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public LongBinaryArithmeticOperation power(final BaseBinaryArithmeticOperation binaryArithmeticOperation) {
  final LongBinaryArithmeticOperation longCategoryOperation = binaryArithmeticOperation.getLongCategoryOperation();

    if (longCategoryOperation == null) {
      if (this.modifiedPower == null) {
        return this.power;
      } else {
        return this.modifiedPower;
      }
    } else {
      return longCategoryOperation;
    }
  }

  public void modifyRemainderDivide(final ArithmeticBinaryOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final LongBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public LongBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public LongBinaryArithmeticOperation remainderDivide(final BaseBinaryArithmeticOperation binaryArithmeticOperation) {
  final LongBinaryArithmeticOperation longCategoryOperation = binaryArithmeticOperation.getLongCategoryOperation();

    if (longCategoryOperation == null) {
      if (this.modifiedRemainderDivide == null) {
        return this.remainderDivide;
      } else {
        return this.modifiedRemainderDivide;
      }
    } else {
      return longCategoryOperation;
    }
  }

  public void modifyCompare(final IntegerBinaryComparison modifiedCompare) {
    if (modifiedCompare instanceof LongIntegerComparison) {
      modifyCompare((LongIntegerComparison)this.modifiedConvert);
    } else {
      modifyCompare(new LongIntegerComparisonWrapper(modifiedCompare));
    }
  }

  public void modifyCompare(final LongIntegerComparison modifiedCompare) {
    this.modifiedCompare = modifiedCompare;
  }

  public LongIntegerComparison getOriginalCompare() {
    return this.compare;
  }

  public LongIntegerComparison compare(final BaseIntegerComparison integerComparison) {
  final LongIntegerComparison longCategoryOperation = integerComparison.getLongCategoryOperation();

    if (longCategoryOperation == null) {
      if (this.modifiedCompare == null) {
        return this.compare;
      } else {
        return this.modifiedCompare;
      }
    } else {
      return longCategoryOperation;
    }
  }

  public void modifyEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyEquals(final LongBooleanComparison modifiedEquals) {
    this.modifiedEquals = modifiedEquals;
  }

  public LongBooleanComparison getOriginalEquals() {
    return this.equals;
  }

  public LongBooleanComparison equals(final BaseBooleanComparison booleanComparison) {
  final LongBooleanComparison longCategoryOperation = booleanComparison.getLongCategoryOperation();

    if (longCategoryOperation == null) {
      if (this.modifiedEquals == null) {
        return this.equals;
      } else {
        return this.modifiedEquals;
      }
    } else {
      return longCategoryOperation;
    }
  }

  public void modifyNotEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyNotEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyNotEquals(final LongBooleanComparison modifiedNotEquals) {
    this.modifiedNotEquals = modifiedNotEquals;
  }

  public LongBooleanComparison getOriginalNotEquals() {
    return this.notEquals;
  }

  public LongBooleanComparison notEquals(final BaseBooleanComparison booleanComparison) {
  final LongBooleanComparison longCategoryOperation = booleanComparison.getLongCategoryOperation();

    if (longCategoryOperation == null) {
      if (this.modifiedNotEquals == null) {
        return this.notEquals;
      } else {
        return this.modifiedNotEquals;
      }
    } else {
      return longCategoryOperation;
    }
  }

  public void modifyLessThan(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyLessThan(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyLessThan(final LongBooleanComparison modifiedLessThan) {
    this.modifiedLessThan = modifiedLessThan;
  }

  public LongBooleanComparison getOriginalLessThan() {
    return this.lessThan;
  }

  public LongBooleanComparison lessThan(final BaseBooleanComparison booleanComparison) {
  final LongBooleanComparison longCategoryOperation = booleanComparison.getLongCategoryOperation();

    if (longCategoryOperation == null) {
      if (this.modifiedLessThan == null) {
        return this.lessThan;
      } else {
        return this.modifiedLessThan;
      }
    } else {
      return longCategoryOperation;
    }
  }

  public void modifyGreaterThan(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyGreaterThan(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyGreaterThan(final LongBooleanComparison modifiedGreaterThan) {
    this.modifiedGreaterThan = modifiedGreaterThan;
  }

  public LongBooleanComparison getOriginalGreaterThan() {
    return this.greaterThan;
  }

  public LongBooleanComparison greaterThan(final BaseBooleanComparison booleanComparison) {
  final LongBooleanComparison longCategoryOperation = booleanComparison.getLongCategoryOperation();

    if (longCategoryOperation == null) {
      if (this.modifiedGreaterThan == null) {
        return this.greaterThan;
      } else {
        return this.modifiedGreaterThan;
      }
    } else {
      return longCategoryOperation;
    }
  }

  public void modifyLessThanOrEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyLessThanOrEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyLessThanOrEquals(final LongBooleanComparison modifiedLessThanOrEquals) {
    this.modifiedLessThanOrEquals = modifiedLessThanOrEquals;
  }

  public LongBooleanComparison getOriginalLessThanOrEquals() {
    return this.lessThanOrEquals;
  }

  public LongBooleanComparison lessThanOrEquals(final BaseBooleanComparison booleanComparison) {
  final LongBooleanComparison longCategoryOperation = booleanComparison.getLongCategoryOperation();

    if (longCategoryOperation == null) {
      if (this.modifiedLessThanOrEquals == null) {
        return this.lessThanOrEquals;
      } else {
        return this.modifiedLessThanOrEquals;
      }
    } else {
      return longCategoryOperation;
    }
  }

  public void modifyGreaterThanOrEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyGreaterThanOrEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyGreaterThanOrEquals(final LongBooleanComparison modifiedGreaterThanOrEquals) {
    this.modifiedGreaterThanOrEquals = modifiedGreaterThanOrEquals;
  }

  public LongBooleanComparison getOriginalGreaterThanOrEquals() {
    return this.greaterThanOrEquals;
  }

  public LongBooleanComparison greaterThanOrEquals(final BaseBooleanComparison booleanComparison) {
  final LongBooleanComparison longCategoryOperation = booleanComparison.getLongCategoryOperation();

    if (longCategoryOperation == null) {
      if (this.modifiedGreaterThanOrEquals == null) {
        return this.greaterThanOrEquals;
      } else {
        return this.modifiedGreaterThanOrEquals;
      }
    } else {
      return longCategoryOperation;
    }
  }
}
