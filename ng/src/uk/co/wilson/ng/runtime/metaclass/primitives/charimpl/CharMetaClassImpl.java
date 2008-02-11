package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharBinaryArithmeticOperationWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharBooleanComparisonWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharConversion;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharConversionWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharMetaClass;

public class CharMetaClassImpl extends BaseMetaClass implements CharMetaClass {

  private volatile CharConversion modifiedConvert = null;

  private volatile CharBinaryArithmeticOperation modifiedAdd = null;
  private volatile CharBinaryArithmeticOperation modifiedSubtract = null;
  private volatile CharBinaryArithmeticOperation modifiedMultiply = null;
  private volatile CharBinaryArithmeticOperation modifiedDivide = null;
  private volatile CharBinaryArithmeticOperation modifiedModulo = null;
  private volatile CharBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile CharBinaryArithmeticOperation modifiedPower = null;

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

  private final CharBooleanComparison equals = new Equals();
  private final CharBooleanComparison notEquals = new NotEquals();
  private final CharBooleanComparison lessThan = new LessThan();
  private final CharBooleanComparison greaterThan = new GreaterThan();
  private final CharBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final CharBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public CharMetaClassImpl() {
    super(char.class);
  }

  private CharBinaryArithmeticOperation fixOperationType(final ArithmeticBinaryOperation modifiedOperation) {
    if (modifiedOperation instanceof CharBinaryArithmeticOperation) {
      return( CharBinaryArithmeticOperation) modifiedOperation;
    }

    return new CharBinaryArithmeticOperationWrapper(modifiedOperation);
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

  public CharConversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final ArithmeticBinaryOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final CharBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public CharBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public CharBinaryArithmeticOperation add(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final CharBinaryArithmeticOperation charCategoryOperation = binaryArithmeticOperation.getCharCategoryOperation();

    if (charCategoryOperation == null) {
      if (this.modifiedAdd == null) {
        return this.add;
      } else {
        return this.modifiedAdd;
      }
    } else {
      return charCategoryOperation;
    }
  }

  public void modifySubtract(final ArithmeticBinaryOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final CharBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public CharBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public CharBinaryArithmeticOperation subtract(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final CharBinaryArithmeticOperation charCategoryOperation = binaryArithmeticOperation.getCharCategoryOperation();

    if (charCategoryOperation == null) {
      if (this.modifiedSubtract == null) {
        return this.subtract;
      } else {
        return this.modifiedSubtract;
      }
    } else {
      return charCategoryOperation;
    }
  }

  public void modifyMultiply(final ArithmeticBinaryOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final CharBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public CharBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public CharBinaryArithmeticOperation multiply(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final CharBinaryArithmeticOperation charCategoryOperation = binaryArithmeticOperation.getCharCategoryOperation();

    if (charCategoryOperation == null) {
      if (this.modifiedMultiply == null) {
        return this.multiply;
      } else {
        return this.modifiedMultiply;
      }
    } else {
      return charCategoryOperation;
    }
  }

  public void modifyDivide(final ArithmeticBinaryOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final CharBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public CharBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public CharBinaryArithmeticOperation divide(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final CharBinaryArithmeticOperation charCategoryOperation = binaryArithmeticOperation.getCharCategoryOperation();

    if (charCategoryOperation == null) {
      if (this.modifiedDivide == null) {
        return this.divide;
      } else {
        return this.modifiedDivide;
      }
    } else {
      return charCategoryOperation;
    }
  }

  public void modifyModulo(final ArithmeticBinaryOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final CharBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public CharBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public CharBinaryArithmeticOperation modulo(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final CharBinaryArithmeticOperation charCategoryOperation = binaryArithmeticOperation.getCharCategoryOperation();

    if (charCategoryOperation == null) {
      if (this.modifiedModulo == null) {
        return this.modulo;
      } else {
        return this.modifiedModulo;
      }
    } else {
      return charCategoryOperation;
    }
  }

  public void modifyPower(final ArithmeticBinaryOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final CharBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public CharBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public CharBinaryArithmeticOperation power(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final CharBinaryArithmeticOperation charCategoryOperation = binaryArithmeticOperation.getCharCategoryOperation();

    if (charCategoryOperation == null) {
      if (this.modifiedPower == null) {
        return this.power;
      } else {
        return this.modifiedPower;
      }
    } else {
      return charCategoryOperation;
    }
  }

  public void modifyRemainderDivide(final ArithmeticBinaryOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final CharBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public CharBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public CharBinaryArithmeticOperation remainderDivide(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final CharBinaryArithmeticOperation charCategoryOperation = binaryArithmeticOperation.getCharCategoryOperation();

    if (charCategoryOperation == null) {
      if (this.modifiedRemainderDivide == null) {
        return this.remainderDivide;
      } else {
        return this.modifiedRemainderDivide;
      }
    } else {
      return charCategoryOperation;
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

  public CharBooleanComparison equals(final BooleanComparison booleanComparison) {
  final CharBooleanComparison charCategoryOperation = booleanComparison.getCharCategoryOperation();

    if (charCategoryOperation == null) {
      if (this.modifiedEquals == null) {
        return this.equals;
      } else {
        return this.modifiedEquals;
      }
    } else {
      return charCategoryOperation;
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

  public CharBooleanComparison notEquals(final BooleanComparison booleanComparison) {
  final CharBooleanComparison charCategoryOperation = booleanComparison.getCharCategoryOperation();

    if (charCategoryOperation == null) {
      if (this.modifiedNotEquals == null) {
        return this.notEquals;
      } else {
        return this.modifiedNotEquals;
      }
    } else {
      return charCategoryOperation;
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

  public CharBooleanComparison lessThan(final BooleanComparison booleanComparison) {
  final CharBooleanComparison charCategoryOperation = booleanComparison.getCharCategoryOperation();

    if (charCategoryOperation == null) {
      if (this.modifiedLessThan == null) {
        return this.lessThan;
      } else {
        return this.modifiedLessThan;
      }
    } else {
      return charCategoryOperation;
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

  public CharBooleanComparison greaterThan(final BooleanComparison booleanComparison) {
  final CharBooleanComparison charCategoryOperation = booleanComparison.getCharCategoryOperation();

    if (charCategoryOperation == null) {
      if (this.modifiedGreaterThan == null) {
        return this.greaterThan;
      } else {
        return this.modifiedGreaterThan;
      }
    } else {
      return charCategoryOperation;
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

  public CharBooleanComparison lessThanOrEquals(final BooleanComparison booleanComparison) {
  final CharBooleanComparison charCategoryOperation = booleanComparison.getCharCategoryOperation();

    if (charCategoryOperation == null) {
      if (this.modifiedLessThanOrEquals == null) {
        return this.lessThanOrEquals;
      } else {
        return this.modifiedLessThanOrEquals;
      }
    } else {
      return charCategoryOperation;
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

  public CharBooleanComparison greaterThanOrEquals(final BooleanComparison booleanComparison) {
  final CharBooleanComparison charCategoryOperation = booleanComparison.getCharCategoryOperation();

    if (charCategoryOperation == null) {
      if (this.modifiedGreaterThanOrEquals == null) {
        return this.greaterThanOrEquals;
      } else {
        return this.modifiedGreaterThanOrEquals;
      }
    } else {
      return charCategoryOperation;
    }
  }
}
