package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalBinaryArithmeticOperationWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalBooleanComparisonWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalConversion;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalConversionWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalMetaClass;

public class BigDecimalMetaClassImpl extends BaseMetaClass implements BigDecimalMetaClass {
  private volatile BigDecimalConversion modifiedConvert = null;

  private volatile BigDecimalBinaryArithmeticOperation modifiedAdd = null;
  private volatile BigDecimalBinaryArithmeticOperation modifiedSubtract = null;
  private volatile BigDecimalBinaryArithmeticOperation modifiedMultiply = null;
  private volatile BigDecimalBinaryArithmeticOperation modifiedDivide = null;
  private volatile BigDecimalBinaryArithmeticOperation modifiedModulo = null;
  private volatile BigDecimalBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile BigDecimalBinaryArithmeticOperation modifiedPower = null;

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

  private final BigDecimalBooleanComparison equals = new Equals();
  private final BigDecimalBooleanComparison notEquals = new NotEquals();
  private final BigDecimalBooleanComparison lessThan = new LessThan();
  private final BigDecimalBooleanComparison greaterThan = new GreaterThan();
  private final BigDecimalBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final BigDecimalBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public BigDecimalMetaClassImpl() {
    super(BigDecimal.class);
  }

  private BigDecimalBinaryArithmeticOperation fixOperationType(final BinaryArithmeticOperation modifiedOperation) {
    if (modifiedOperation instanceof BigDecimalBinaryArithmeticOperation) {
      return( BigDecimalBinaryArithmeticOperation) modifiedOperation;
    }

    return new BigDecimalBinaryArithmeticOperationWrapper(modifiedOperation);
  }

  private BigDecimalBooleanComparison fixOperationType(final BooleanBinaryComparison modifiedOperation) {
    if(modifiedOperation instanceof BigDecimalBooleanComparison) {
      return (BigDecimalBooleanComparison)modifiedOperation;
    }

    return new BigDecimalBooleanComparisonWrapper(modifiedOperation);
  }

  public void modifyConvert(final Conversion modifiedConvert) {
    if (modifiedConvert instanceof BigDecimalConversion) {
      modifyConvert((BigDecimalConversion)modifiedConvert);
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

  public BigDecimalConversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final BinaryArithmeticOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final BigDecimalBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public BigDecimalBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public BigDecimalBinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public void modifySubtract(final BinaryArithmeticOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final BigDecimalBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public BigDecimalBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public BigDecimalBinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public void modifyMultiply(final BinaryArithmeticOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final BigDecimalBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public BigDecimalBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public BigDecimalBinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public void modifyDivide(final BinaryArithmeticOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final BigDecimalBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public BigDecimalBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public BigDecimalBinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public void modifyModulo(final BinaryArithmeticOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final BigDecimalBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public BigDecimalBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public BigDecimalBinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public void modifyPower(final BinaryArithmeticOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final BigDecimalBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public BigDecimalBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public BigDecimalBinaryArithmeticOperation power() {
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
    }
  }

  public void modifyRemainderDivide(final BinaryArithmeticOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final BigDecimalBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public BigDecimalBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public BigDecimalBinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }

  public void modifyEquals(final BooleanBinaryComparison modifiedRemainderDivide) {
    modifyEquals(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyEquals(final BigDecimalBooleanComparison modifiedEquals) {
    this.modifiedEquals = modifiedEquals;
  }

  public BigDecimalBooleanComparison getOriginalEquals() {
    return this.equals;
  }

  public BigDecimalBooleanComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
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

  public BigDecimalBooleanComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
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

  public BigDecimalBooleanComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
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

  public BigDecimalBooleanComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
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

  public BigDecimalBooleanComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
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

  public BigDecimalBooleanComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
