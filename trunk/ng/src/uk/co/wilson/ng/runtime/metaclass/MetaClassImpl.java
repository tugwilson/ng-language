package uk.co.wilson.ng.runtime.metaclass;

import java.util.Map;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import ng.runtime.metaclass.IntegerBinaryComparison;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;
import ng.runtime.threadcontext.IntegerComparison;

/**
 * @author John
 *
 */
public class MetaClassImpl extends BaseMetaClass {

  protected volatile Conversion modifiedConvert = null;

  protected volatile ArithmeticBinaryOperation modifiedAdd = null;
  protected volatile ArithmeticBinaryOperation modifiedSubtract = null;
  protected volatile ArithmeticBinaryOperation modifiedMultiply = null;
  protected volatile ArithmeticBinaryOperation modifiedDivide = null;
  protected volatile ArithmeticBinaryOperation modifiedModulo = null;
  protected volatile ArithmeticBinaryOperation modifiedRemainderDivide = null;
  protected volatile ArithmeticBinaryOperation modifiedPower = null;

  protected volatile IntegerBinaryComparison modifiedCompare = null;

  protected volatile BooleanBinaryComparison modifiedEquals = null;
  protected volatile BooleanBinaryComparison modifiedNotEquals = null;
  protected volatile BooleanBinaryComparison modifiedLessThan = null;
  protected volatile BooleanBinaryComparison modifiedGreaterThan = null;
  protected volatile BooleanBinaryComparison modifiedLessThanOrEquals = null;
  protected volatile BooleanBinaryComparison modifiedGreaterThanOrEquals = null;

  /**
   * @param theClass
   */
  public MetaClassImpl(final Class<?> theClass) {
    super(theClass);
    // TODO: introspect the class and set up the operations
  }

  public void modifyConvert(final Conversion modifiedConvert) {
    this.modifiedConvert = modifiedConvert;
  }

  public Conversion getOriginalConvert() {
    return ConversionNoopImpl.instance;
  }

  public Conversion convert() {
    if (this.modifiedConvert == null) {
      return getOriginalConvert();
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final ArithmeticBinaryOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public ArithmeticBinaryOperation getOriginalAdd() {
    return ArithmeticBinaryOperationNoopImpl.instance;
  }

  public ArithmeticBinaryOperation add(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final Map<Object, ArithmeticBinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ArithmeticBinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);

      if (arithmeticBinaryOperation != null) {
        return arithmeticBinaryOperation;
      }
    }

    if (this.modifiedAdd == null) {
      return getOriginalAdd();
    } else {
      return this.modifiedAdd;
    }
  }

  public void modifySubtract(final ArithmeticBinaryOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public ArithmeticBinaryOperation getOriginalSubtract() {
    return ArithmeticBinaryOperationNoopImpl.instance;
  }

  public ArithmeticBinaryOperation subtract(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final Map<Object, ArithmeticBinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ArithmeticBinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);

      if (arithmeticBinaryOperation != null) {
        return arithmeticBinaryOperation;
      }
    }

    if (this.modifiedSubtract == null) {
      return getOriginalSubtract();
    } else {
      return this.modifiedSubtract;
    }
  }

  public void modifyMultiply(final ArithmeticBinaryOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public ArithmeticBinaryOperation getOriginalMultiply() {
    return ArithmeticBinaryOperationNoopImpl.instance;
  }

  public ArithmeticBinaryOperation multiply(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final Map<Object, ArithmeticBinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ArithmeticBinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);

      if (arithmeticBinaryOperation != null) {
        return arithmeticBinaryOperation;
      }
    }

    if (this.modifiedMultiply == null) {
      return getOriginalMultiply();
    } else {
      return this.modifiedMultiply;
    }
  }

  public void modifyDivide(final ArithmeticBinaryOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public ArithmeticBinaryOperation getOriginalDivide() {
    return ArithmeticBinaryOperationNoopImpl.instance;
  }

  public ArithmeticBinaryOperation divide(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final Map<Object, ArithmeticBinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ArithmeticBinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);

      if (arithmeticBinaryOperation != null) {
        return arithmeticBinaryOperation;
      }
    }

    if (this.modifiedDivide == null) {
      return getOriginalDivide();
    } else {
      return this.modifiedDivide;
    }
  }

  public void modifyModulo(final ArithmeticBinaryOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public ArithmeticBinaryOperation getOriginalModulo() {
    return ArithmeticBinaryOperationNoopImpl.instance;
  }

  public ArithmeticBinaryOperation modulo(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final Map<Object, ArithmeticBinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ArithmeticBinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);

      if (arithmeticBinaryOperation != null) {
        return arithmeticBinaryOperation;
      }
    }

    if (this.modifiedModulo == null) {
      return getOriginalModulo();
    } else {
      return this.modifiedModulo;
    }
  }

  public void modifyRemainderDivide(final ArithmeticBinaryOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public ArithmeticBinaryOperation getOriginalRemainderDivide() {
    return ArithmeticBinaryOperationNoopImpl.instance;
  }

  public ArithmeticBinaryOperation remainderDivide(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final Map<Object, ArithmeticBinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ArithmeticBinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);

      if (arithmeticBinaryOperation != null) {
        return arithmeticBinaryOperation;
      }
    }

    if (this.modifiedRemainderDivide == null) {
      return getOriginalRemainderDivide();
    } else {
      return this.modifiedRemainderDivide;
    }
  }

  public void modifyPower(final ArithmeticBinaryOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public ArithmeticBinaryOperation getOriginalPower() {
    return ArithmeticBinaryOperationNoopImpl.instance;
  }

  public ArithmeticBinaryOperation power(final BinaryArithmeticOperation binaryArithmeticOperation) {
  final Map<Object, ArithmeticBinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ArithmeticBinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);

      if (arithmeticBinaryOperation != null) {
        return arithmeticBinaryOperation;
      }
    }

    if (this.modifiedPower == null) {
      return getOriginalPower();
    } else {
      return this.modifiedPower;
    }
  }

  public void modifyCompare(final IntegerBinaryComparison modifiedCompare) {
    this.modifiedCompare = modifiedCompare;
  }

  public IntegerBinaryComparison getOriginalCompare() {
    return IntegerBinaryComparisonNoopImpl.instance;
  }

  public IntegerBinaryComparison compare(final IntegerComparison integerComparison) {
  final Map<Object, IntegerBinaryComparison> categoryOperationMap = integerComparison.getCategoryOperationMap();

    if (categoryOperationMap != null) {
    final IntegerBinaryComparison categoryIntegerBinaryComparison = categoryOperationMap.get(this);

      if (categoryIntegerBinaryComparison != null) {
        return categoryIntegerBinaryComparison;
      }
    }

    if (this.modifiedCompare == null) {
      return getOriginalCompare();
    } else {
      return this.modifiedCompare;
    }
  }

  public void modifyEquals(final BooleanBinaryComparison modifiedEquals) {
    this.modifiedEquals = modifiedEquals;
  }

  public BooleanBinaryComparison getOriginalEquals() {
    return BooleanBinaryComparisonNoopImpl.instance;
  }

  public BooleanBinaryComparison equals(final BooleanComparison booleanComparison) {
  final Map<Object, BooleanBinaryComparison> categoryOperationMap = booleanComparison.getCategoryOperationMap();

    if (categoryOperationMap != null) {
    final BooleanBinaryComparison categoryBooleanBinaryComparison = categoryOperationMap.get(this);

      if (categoryBooleanBinaryComparison != null) {
        return categoryBooleanBinaryComparison;
      }
    }

    if (this.modifiedEquals == null) {
      return getOriginalEquals();
    } else {
      return this.modifiedEquals;
    }
  }

  public void modifyNotEquals(final BooleanBinaryComparison modifiedNotEquals) {
    this.modifiedNotEquals = modifiedNotEquals;
  }

  public BooleanBinaryComparison getOriginalNotEquals() {
    return BooleanBinaryComparisonNoopImpl.instance;
  }

  public BooleanBinaryComparison notEquals(final BooleanComparison booleanComparison) {
  final Map<Object, BooleanBinaryComparison> categoryOperationMap = booleanComparison.getCategoryOperationMap();

    if (categoryOperationMap != null) {
    final BooleanBinaryComparison categoryBooleanBinaryComparison = categoryOperationMap.get(this);

      if (categoryBooleanBinaryComparison != null) {
        return categoryBooleanBinaryComparison;
      }
    }

    if (this.modifiedNotEquals == null) {
      return getOriginalNotEquals();
    } else {
      return this.modifiedNotEquals;
    }
  }

  public void modifyLessThan(final BooleanBinaryComparison modifiedLessThan) {
    this.modifiedLessThan = modifiedLessThan;
  }

  public BooleanBinaryComparison getOriginalLessThan() {
    return BooleanBinaryComparisonNoopImpl.instance;
  }

  public BooleanBinaryComparison lessThan(final BooleanComparison booleanComparison) {
  final Map<Object, BooleanBinaryComparison> categoryOperationMap = booleanComparison.getCategoryOperationMap();

    if (categoryOperationMap != null) {
    final BooleanBinaryComparison categoryBooleanBinaryComparison = categoryOperationMap.get(this);

      if (categoryBooleanBinaryComparison != null) {
        return categoryBooleanBinaryComparison;
      }
    }

    if (this.modifiedLessThan == null) {
      return getOriginalLessThan();
    } else {
      return this.modifiedLessThan;
    }
  }

  public void modifyGreaterThan(final BooleanBinaryComparison modifiedGreaterThan) {
    this.modifiedGreaterThan = modifiedGreaterThan;
  }

  public BooleanBinaryComparison getOriginalGreaterThan() {
    return BooleanBinaryComparisonNoopImpl.instance;
  }

  public BooleanBinaryComparison greaterThan(final BooleanComparison booleanComparison) {
  final Map<Object, BooleanBinaryComparison> categoryOperationMap = booleanComparison.getCategoryOperationMap();

    if (categoryOperationMap != null) {
    final BooleanBinaryComparison categoryBooleanBinaryComparison = categoryOperationMap.get(this);

      if (categoryBooleanBinaryComparison != null) {
        return categoryBooleanBinaryComparison;
      }
    }

    if (this.modifiedGreaterThan == null) {
      return getOriginalGreaterThan();
    } else {
      return this.modifiedGreaterThan;
    }
  }

  public void modifyLessThanOrEquals(final BooleanBinaryComparison modifiedLessThanOrEquals) {
    this.modifiedLessThanOrEquals = modifiedLessThanOrEquals;
  }

  public BooleanBinaryComparison getOriginalLessThanOrEquals() {
    return BooleanBinaryComparisonNoopImpl.instance;
  }

  public BooleanBinaryComparison lessThanOrEquals(final BooleanComparison booleanComparison) {
  final Map<Object, BooleanBinaryComparison> categoryOperationMap = booleanComparison.getCategoryOperationMap();

    if (categoryOperationMap != null) {
    final BooleanBinaryComparison categoryBooleanBinaryComparison = categoryOperationMap.get(this);

      if (categoryBooleanBinaryComparison != null) {
        return categoryBooleanBinaryComparison;
      }
    }

    if (this.modifiedLessThanOrEquals == null) {
      return getOriginalLessThanOrEquals();
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  public void modifyGreaterThanOrEquals(final BooleanBinaryComparison modifiedGreaterThanOrEquals) {
    this.modifiedGreaterThanOrEquals = modifiedGreaterThanOrEquals;
  }

  public BooleanBinaryComparison getOriginalGreaterThanOrEquals() {
    return BooleanBinaryComparisonNoopImpl.instance;
  }

  public BooleanBinaryComparison greaterThanOrEquals(final BooleanComparison booleanComparison) {
  final Map<Object, BooleanBinaryComparison> categoryOperationMap = booleanComparison.getCategoryOperationMap();

    if (categoryOperationMap != null) {
    final BooleanBinaryComparison categoryBooleanBinaryComparison = categoryOperationMap.get(this);

      if (categoryBooleanBinaryComparison != null) {
        return categoryBooleanBinaryComparison;
      }
    }

    if (this.modifiedGreaterThanOrEquals == null) {
      return getOriginalGreaterThanOrEquals();
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
