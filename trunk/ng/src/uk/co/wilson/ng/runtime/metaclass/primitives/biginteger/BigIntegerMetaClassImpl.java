package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigInteger;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerBinaryArithmeticOperationWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerBooleanComparisonWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerConversion;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerConversionWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerMetaClass;

public class BigIntegerMetaClassImpl extends BaseMetaClass implements BigIntegerMetaClass {
  private volatile BigIntegerConversion modifiedConvert = null;

  private volatile BigIntegerBinaryArithmeticOperation modifiedAdd = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedSubtract = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedMultiply = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedDivide = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedModulo = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile BigIntegerBinaryArithmeticOperation modifiedPower = null;

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

  private final BigIntegerBooleanComparison equals = new Equals();
  private final BigIntegerBooleanComparison notEquals = new NotEquals();
  private final BigIntegerBooleanComparison lessThan = new LessThan();
  private final BigIntegerBooleanComparison greaterThan = new GreaterThan();
  private final BigIntegerBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final BigIntegerBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public BigIntegerMetaClassImpl() {
    super(BigInteger.class);
  }

  private BigIntegerBinaryArithmeticOperation fixOperationType(final ArithmeticBinaryOperation modifiedOperation) {
    if (modifiedOperation instanceof BigIntegerBinaryArithmeticOperation) {
      return( BigIntegerBinaryArithmeticOperation) modifiedOperation;
    }

    return new BigIntegerBinaryArithmeticOperationWrapper(modifiedOperation);
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

  public BigIntegerConversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final ArithmeticBinaryOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final BigIntegerBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public BigIntegerBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public BigIntegerBinaryArithmeticOperation add(BinaryArithmeticOperation binaryArithmeticOperation) {
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

  public void modifySubtract(final ArithmeticBinaryOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final BigIntegerBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public BigIntegerBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public BigIntegerBinaryArithmeticOperation subtract(BinaryArithmeticOperation binaryArithmeticOperation) {
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

  public void modifyMultiply(final ArithmeticBinaryOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final BigIntegerBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public BigIntegerBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public BigIntegerBinaryArithmeticOperation multiply(BinaryArithmeticOperation binaryArithmeticOperation) {
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

  public void modifyDivide(final ArithmeticBinaryOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final BigIntegerBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public BigIntegerBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public BigIntegerBinaryArithmeticOperation divide(BinaryArithmeticOperation binaryArithmeticOperation) {
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

  public void modifyModulo(final ArithmeticBinaryOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final BigIntegerBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public BigIntegerBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public BigIntegerBinaryArithmeticOperation modulo(BinaryArithmeticOperation binaryArithmeticOperation) {
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

  public void modifyPower(final ArithmeticBinaryOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final BigIntegerBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public BigIntegerBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public BigIntegerBinaryArithmeticOperation power(BinaryArithmeticOperation binaryArithmeticOperation) {
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

  public void modifyRemainderDivide(final ArithmeticBinaryOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final BigIntegerBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public BigIntegerBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public BigIntegerBinaryArithmeticOperation remainderDivide(BinaryArithmeticOperation binaryArithmeticOperation) {
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

  public void modifyEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyEquals(final BigIntegerBooleanComparison modifiedEquals) {
    this.modifiedEquals = modifiedEquals;
  }

  public BigIntegerBooleanComparison getOriginalEquals() {
    return this.equals;
  }

  public BigIntegerBooleanComparison equals(BooleanComparison booleanComparison) {
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

  public BigIntegerBooleanComparison notEquals(BooleanComparison booleanComparison) {
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

  public BigIntegerBooleanComparison lessThan(BooleanComparison booleanComparison) {
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

  public BigIntegerBooleanComparison greaterThan(BooleanComparison booleanComparison) {
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

  public BigIntegerBooleanComparison lessThanOrEquals(BooleanComparison booleanComparison) {
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

  public BigIntegerBooleanComparison greaterThanOrEquals(BooleanComparison booleanComparison) {
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