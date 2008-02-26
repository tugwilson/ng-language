package uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import ng.runtime.metaclass.IntegerBinaryComparison;
import ng.runtime.metaclass.ShortBinaryArithmeticOperation;
import ng.runtime.metaclass.ShortBooleanComparison;
import ng.runtime.metaclass.ShortConversion;
import ng.runtime.metaclass.ShortIntegerComparison;
import ng.runtime.metaclass.ShortMetaClass;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;
import ng.runtime.threadcontext.IntegerComparison;
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

  private ShortBinaryArithmeticOperation fixOperationType(final ArithmeticBinaryOperation modifiedOperation) {
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

  public ShortConversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final ArithmeticBinaryOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final ShortBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public ShortBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public ShortBinaryArithmeticOperation add(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final ShortBinaryArithmeticOperation shortCategoryOperation = binaryArithmeticOperation.getShortCategoryOperation();

    if (shortCategoryOperation == null) {
      if (this.modifiedAdd == null) {
        return this.add;
      } else {
        return this.modifiedAdd;
      }
    } else {
      return shortCategoryOperation;
    }
  }

  public void modifySubtract(final ArithmeticBinaryOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final ShortBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public ShortBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public ShortBinaryArithmeticOperation subtract(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final ShortBinaryArithmeticOperation shortCategoryOperation = binaryArithmeticOperation.getShortCategoryOperation();

    if (shortCategoryOperation == null) {
      if (this.modifiedSubtract == null) {
        return this.subtract;
      } else {
        return this.modifiedSubtract;
      }
    } else {
      return shortCategoryOperation;
    }
  }

  public void modifyMultiply(final ArithmeticBinaryOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final ShortBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public ShortBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public ShortBinaryArithmeticOperation multiply(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final ShortBinaryArithmeticOperation shortCategoryOperation = binaryArithmeticOperation.getShortCategoryOperation();

    if (shortCategoryOperation == null) {
      if (this.modifiedMultiply == null) {
        return this.multiply;
      } else {
        return this.modifiedMultiply;
      }
    } else {
      return shortCategoryOperation;
    }
  }

  public void modifyDivide(final ArithmeticBinaryOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final ShortBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public ShortBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public ShortBinaryArithmeticOperation divide(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final ShortBinaryArithmeticOperation shortCategoryOperation = binaryArithmeticOperation.getShortCategoryOperation();

    if (shortCategoryOperation == null) {
      if (this.modifiedDivide == null) {
        return this.divide;
      } else {
        return this.modifiedDivide;
      }
    } else {
      return shortCategoryOperation;
    }
  }

  public void modifyModulo(final ArithmeticBinaryOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final ShortBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public ShortBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public ShortBinaryArithmeticOperation modulo(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final ShortBinaryArithmeticOperation shortCategoryOperation = binaryArithmeticOperation.getShortCategoryOperation();

    if (shortCategoryOperation == null) {
      if (this.modifiedModulo == null) {
        return this.modulo;
      } else {
        return this.modifiedModulo;
      }
    } else {
      return shortCategoryOperation;
    }
  }

  public void modifyPower(final ArithmeticBinaryOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final ShortBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public ShortBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public ShortBinaryArithmeticOperation power(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final ShortBinaryArithmeticOperation shortCategoryOperation = binaryArithmeticOperation.getShortCategoryOperation();

    if (shortCategoryOperation == null) {
      if (this.modifiedPower == null) {
        return this.power;
      } else {
        return this.modifiedPower;
      }
    } else {
      return shortCategoryOperation;
    }
  }

  public void modifyRemainderDivide(final ArithmeticBinaryOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final ShortBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public ShortBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public ShortBinaryArithmeticOperation remainderDivide(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final ShortBinaryArithmeticOperation shortCategoryOperation = binaryArithmeticOperation.getShortCategoryOperation();

    if (shortCategoryOperation == null) {
      if (this.modifiedRemainderDivide == null) {
        return this.remainderDivide;
      } else {
        return this.modifiedRemainderDivide;
      }
    } else {
      return shortCategoryOperation;
    }
  }

  public void modifyCompare(final IntegerBinaryComparison modifiedCompare) {
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

  public ShortIntegerComparison compare(final IntegerComparison integerComparison) {
  final ShortIntegerComparison shortCategoryOperation = integerComparison.getShortCategoryOperation();

    if (shortCategoryOperation == null) {
      if (this.modifiedCompare == null) {
        return this.compare;
      } else {
        return this.modifiedCompare;
      }
    } else {
      return shortCategoryOperation;
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

  public ShortBooleanComparison equals(final BooleanComparison booleanComparison) {
  final ShortBooleanComparison shortCategoryOperation = booleanComparison.getShortCategoryOperation();

    if (shortCategoryOperation == null) {
      if (this.modifiedEquals == null) {
        return this.equals;
      } else {
        return this.modifiedEquals;
      }
    } else {
      return shortCategoryOperation;
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

  public ShortBooleanComparison notEquals(final BooleanComparison booleanComparison) {
  final ShortBooleanComparison shortCategoryOperation = booleanComparison.getShortCategoryOperation();

    if (shortCategoryOperation == null) {
      if (this.modifiedNotEquals == null) {
        return this.notEquals;
      } else {
        return this.modifiedNotEquals;
      }
    } else {
      return shortCategoryOperation;
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

  public ShortBooleanComparison lessThan(final BooleanComparison booleanComparison) {
  final ShortBooleanComparison shortCategoryOperation = booleanComparison.getShortCategoryOperation();

    if (shortCategoryOperation == null) {
      if (this.modifiedLessThan == null) {
        return this.lessThan;
      } else {
        return this.modifiedLessThan;
      }
    } else {
      return shortCategoryOperation;
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

  public ShortBooleanComparison greaterThan(final BooleanComparison booleanComparison) {
  final ShortBooleanComparison shortCategoryOperation = booleanComparison.getShortCategoryOperation();

    if (shortCategoryOperation == null) {
      if (this.modifiedGreaterThan == null) {
        return this.greaterThan;
      } else {
        return this.modifiedGreaterThan;
      }
    } else {
      return shortCategoryOperation;
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

  public ShortBooleanComparison lessThanOrEquals(final BooleanComparison booleanComparison) {
  final ShortBooleanComparison shortCategoryOperation = booleanComparison.getShortCategoryOperation();

    if (shortCategoryOperation == null) {
      if (this.modifiedLessThanOrEquals == null) {
        return this.lessThanOrEquals;
      } else {
        return this.modifiedLessThanOrEquals;
      }
    } else {
      return shortCategoryOperation;
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

  public ShortBooleanComparison greaterThanOrEquals(final BooleanComparison booleanComparison) {
  final ShortBooleanComparison shortCategoryOperation = booleanComparison.getShortCategoryOperation();

    if (shortCategoryOperation == null) {
      if (this.modifiedGreaterThanOrEquals == null) {
        return this.greaterThanOrEquals;
      } else {
        return this.modifiedGreaterThanOrEquals;
      }
    } else {
      return shortCategoryOperation;
    }
  }
}
