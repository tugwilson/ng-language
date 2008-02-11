package uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;
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

  private final ByteBooleanComparison equals = new Equals();
  private final ByteBooleanComparison notEquals = new NotEquals();
  private final ByteBooleanComparison lessThan = new LessThan();
  private final ByteBooleanComparison greaterThan = new GreaterThan();
  private final ByteBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final ByteBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public ByteMetaClassImpl() {
    super(byte.class);
  }

  private ByteBinaryArithmeticOperation fixOperationType(final ArithmeticBinaryOperation modifiedOperation) {
    if (modifiedOperation instanceof ByteBinaryArithmeticOperation) {
      return( ByteBinaryArithmeticOperation) modifiedOperation;
    }

    return new ByteBinaryArithmeticOperationWrapper(modifiedOperation);
  }

  private ByteBooleanComparison fixOperationType(final BooleanBinaryComparison modifiedOperation) {
    if(modifiedOperation instanceof ByteBooleanComparison) {
      return (ByteBooleanComparison)modifiedOperation;
    }

    return new ByteBooleanComparisonWrapper(modifiedOperation);
  }

  public void modifyConvert(final Conversion modifiedConvert) {
    if (modifiedConvert instanceof ByteConversion) {
      modifyConvert((ByteConversion)modifiedConvert);
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

  public ByteConversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final ArithmeticBinaryOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final ByteBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public ByteBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public ByteBinaryArithmeticOperation add(final BinaryArithmeticOperation binaryArithmeticOperation) {
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

  public void modifySubtract(final ArithmeticBinaryOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final ByteBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public ByteBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public ByteBinaryArithmeticOperation subtract(final BinaryArithmeticOperation binaryArithmeticOperation) {
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

  public void modifyMultiply(final ArithmeticBinaryOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final ByteBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public ByteBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public ByteBinaryArithmeticOperation multiply(final BinaryArithmeticOperation binaryArithmeticOperation) {
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

  public void modifyDivide(final ArithmeticBinaryOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final ByteBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public ByteBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public ByteBinaryArithmeticOperation divide(final BinaryArithmeticOperation binaryArithmeticOperation) {
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

  public void modifyModulo(final ArithmeticBinaryOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final ByteBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public ByteBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public ByteBinaryArithmeticOperation modulo(final BinaryArithmeticOperation binaryArithmeticOperation) {
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

  public void modifyPower(final ArithmeticBinaryOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final ByteBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public ByteBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public ByteBinaryArithmeticOperation power(final BinaryArithmeticOperation binaryArithmeticOperation) {
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

  public void modifyRemainderDivide(final ArithmeticBinaryOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final ByteBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public ByteBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public ByteBinaryArithmeticOperation remainderDivide(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final ByteBinaryArithmeticOperation byteCategoryOperation = binaryArithmeticOperation.getByteCategoryOperation();

    if (byteCategoryOperation == null) {
      if (this.modifiedRemainderDivide == null) {
        return this.remainderDivide;
      } else {
        return this.modifiedRemainderDivide;
      }
    } else {
      return byteCategoryOperation;
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

  public ByteBooleanComparison equals(final BooleanComparison booleanComparison) {
  final ByteBooleanComparison byteCategoryOperation = booleanComparison.getByteCategoryOperation();

    if (byteCategoryOperation == null) {
      if (this.modifiedEquals == null) {
        return this.equals;
      } else {
        return this.modifiedEquals;
      }
    } else {
      return byteCategoryOperation;
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

  public ByteBooleanComparison notEquals(final BooleanComparison booleanComparison) {
  final ByteBooleanComparison byteCategoryOperation = booleanComparison.getByteCategoryOperation();

    if (byteCategoryOperation == null) {
      if (this.modifiedNotEquals == null) {
        return this.notEquals;
      } else {
        return this.modifiedNotEquals;
      }
    } else {
      return byteCategoryOperation;
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

  public ByteBooleanComparison lessThan(final BooleanComparison booleanComparison) {
  final ByteBooleanComparison byteCategoryOperation = booleanComparison.getByteCategoryOperation();

    if (byteCategoryOperation == null) {
      if (this.modifiedLessThan == null) {
        return this.lessThan;
      } else {
        return this.modifiedLessThan;
      }
    } else {
      return byteCategoryOperation;
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

  public ByteBooleanComparison greaterThan(final BooleanComparison booleanComparison) {
  final ByteBooleanComparison byteCategoryOperation = booleanComparison.getByteCategoryOperation();

    if (byteCategoryOperation == null) {
      if (this.modifiedGreaterThan == null) {
        return this.greaterThan;
      } else {
        return this.modifiedGreaterThan;
      }
    } else {
      return byteCategoryOperation;
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

  public ByteBooleanComparison lessThanOrEquals(final BooleanComparison booleanComparison) {
  final ByteBooleanComparison byteCategoryOperation = booleanComparison.getByteCategoryOperation();

    if (byteCategoryOperation == null) {
      if (this.modifiedLessThanOrEquals == null) {
        return this.lessThanOrEquals;
      } else {
        return this.modifiedLessThanOrEquals;
      }
    } else {
      return byteCategoryOperation;
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

  public ByteBooleanComparison greaterThanOrEquals(final BooleanComparison booleanComparison) {
  final ByteBooleanComparison byteCategoryOperation = booleanComparison.getByteCategoryOperation();

    if (byteCategoryOperation == null) {
      if (this.modifiedGreaterThanOrEquals == null) {
        return this.greaterThanOrEquals;
      } else {
        return this.modifiedGreaterThanOrEquals;
      }
    } else {
      return byteCategoryOperation;
    }
  }
}
