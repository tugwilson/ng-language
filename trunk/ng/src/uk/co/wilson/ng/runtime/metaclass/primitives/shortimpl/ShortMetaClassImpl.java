package uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortBinaryArithmeticOperationWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortBooleanComparisonWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortConversion;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortConversionWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortMetaClass;

public class ShortMetaClassImpl extends BaseMetaClass implements ShortMetaClass {
  private volatile ShortConversion modifiedConvert = null;

  private volatile ShortBinaryArithmeticOperation modifiedAdd = null;
  private volatile ShortBinaryArithmeticOperation modifiedSubtract = null;
  private volatile ShortBinaryArithmeticOperation modifiedMultiply = null;
  private volatile ShortBinaryArithmeticOperation modifiedDivide = null;
  private volatile ShortBinaryArithmeticOperation modifiedModulo = null;
  private volatile ShortBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile ShortBinaryArithmeticOperation modifiedPower = null;

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

  private final ShortBooleanComparison equals = new Equals();
  private final ShortBooleanComparison notEquals = new NotEquals();
  private final ShortBooleanComparison lessThan = new LessThan();
  private final ShortBooleanComparison greaterThan = new GreaterThan();
  private final ShortBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final ShortBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public ShortMetaClassImpl() {
    super(short.class);
  }

  private ShortBinaryArithmeticOperation fixOperationType(final BinaryArithmeticOperation modifiedOperation) {
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

  public void modifyAdd(final BinaryArithmeticOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final ShortBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public ShortBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public ShortBinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public void modifySubtract(final BinaryArithmeticOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final ShortBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public ShortBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public ShortBinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public void modifyMultiply(final BinaryArithmeticOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final ShortBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public ShortBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public ShortBinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public void modifyDivide(final BinaryArithmeticOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final ShortBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public ShortBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public ShortBinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public void modifyModulo(final BinaryArithmeticOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final ShortBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public ShortBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public ShortBinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public void modifyPower(final BinaryArithmeticOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final ShortBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public ShortBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public ShortBinaryArithmeticOperation power() {
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
    }
  }

  public void modifyRemainderDivide(final BinaryArithmeticOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final ShortBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public ShortBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public ShortBinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
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

  public ShortBooleanComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
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

  public ShortBooleanComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
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

  public ShortBooleanComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
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

  public ShortBooleanComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
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

  public ShortBooleanComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
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

  public ShortBooleanComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
