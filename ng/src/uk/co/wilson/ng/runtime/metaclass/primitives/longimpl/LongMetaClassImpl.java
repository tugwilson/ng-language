package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongBinaryArithmeticOperationWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongBooleanComparisonWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongConversion;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongConversionWrapper;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongMetaClass;

public class LongMetaClassImpl extends BaseMetaClass implements LongMetaClass {
  private volatile LongConversion modifiedConvert = null;

  private volatile LongBinaryArithmeticOperation modifiedAdd = null;
  private volatile LongBinaryArithmeticOperation modifiedSubtract = null;
  private volatile LongBinaryArithmeticOperation modifiedMultiply = null;
  private volatile LongBinaryArithmeticOperation modifiedDivide = null;
  private volatile LongBinaryArithmeticOperation modifiedModulo = null;
  private volatile LongBinaryArithmeticOperation modifiedRemainderDivide = null;
  private volatile LongBinaryArithmeticOperation modifiedPower = null;

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

  private final LongBooleanComparison equals = new Equals();
  private final LongBooleanComparison notEquals = new NotEquals();
  private final LongBooleanComparison lessThan = new LessThan();
  private final LongBooleanComparison greaterThan = new GreaterThan();
  private final LongBooleanComparison lessThanOrEquals = new LessThanOrEquals();
  private final LongBooleanComparison greaterThanOrEquals = new GreaterThanOrEquals();

  public LongMetaClassImpl() {
    super(long.class);
  }

  private LongBinaryArithmeticOperation fixOperationType(final BinaryArithmeticOperation modifiedOperation) {
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

  public LongConversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final BinaryArithmeticOperation modifiedAdd) {
    modifyAdd(fixOperationType(modifiedAdd));
  }

  public void modifyAdd(final LongBinaryArithmeticOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public LongBinaryArithmeticOperation getOriginalAdd() {
    return this.add;
  }

  public LongBinaryArithmeticOperation add() {
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public void modifySubtract(final BinaryArithmeticOperation modifiedSubtract) {
    modifySubtract(fixOperationType(modifiedSubtract));
  }

  public void modifySubtract(final LongBinaryArithmeticOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public LongBinaryArithmeticOperation getOriginalSubtract() {
    return this.subtract;
  }

  public LongBinaryArithmeticOperation subtract() {
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public void modifyMultiply(final BinaryArithmeticOperation modifiedMultiply) {
    modifyMultiply(fixOperationType(modifiedMultiply));
  }

  public void modifyMultiply(final LongBinaryArithmeticOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public LongBinaryArithmeticOperation getOriginalMultiply() {
    return this.multiply;
  }

  public LongBinaryArithmeticOperation multiply() {
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public void modifyDivide(final BinaryArithmeticOperation modifiedDivide) {
    modifyDivide(fixOperationType(modifiedDivide));
  }

  public void modifyDivide(final LongBinaryArithmeticOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public LongBinaryArithmeticOperation getOriginalDivide() {
    return this.divide;
  }

  public LongBinaryArithmeticOperation divide() {
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public void modifyModulo(final BinaryArithmeticOperation modifiedModulo) {
    modifyModulo(fixOperationType(modifiedModulo));
  }

  public void modifyModulo(final LongBinaryArithmeticOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public LongBinaryArithmeticOperation getOriginalModulo() {
    return this.modulo;
  }

  public LongBinaryArithmeticOperation modulo() {
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public void modifyPower(final BinaryArithmeticOperation modifiedPower) {
    modifyPower(fixOperationType(modifiedPower));
  }

  public void modifyPower(final LongBinaryArithmeticOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public LongBinaryArithmeticOperation getOriginalPower() {
    return this.power;
  }

  public LongBinaryArithmeticOperation power() {
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
    }
  }

  public void modifyRemainderDivide(final BinaryArithmeticOperation modifiedRemainderDivide) {
    modifyRemainderDivide(fixOperationType(modifiedRemainderDivide));
  }

  public void modifyRemainderDivide(final LongBinaryArithmeticOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public LongBinaryArithmeticOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public LongBinaryArithmeticOperation remainderDivide() {
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
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

  public LongBooleanComparison equals() {
    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
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

  public LongBooleanComparison notEquals() {
    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
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

  public LongBooleanComparison lessThan() {
    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
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

  public LongBooleanComparison greaterThan() {
    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
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

  public LongBooleanComparison lessThanOrEquals() {
    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
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

  public LongBooleanComparison greaterThanOrEquals() {
    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
