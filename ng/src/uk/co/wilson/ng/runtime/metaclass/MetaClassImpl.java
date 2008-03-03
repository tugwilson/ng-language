package uk.co.wilson.ng.runtime.metaclass;

import java.util.Map;

import ng.runtime.metaclass.BinaryOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import ng.runtime.metaclass.LogicalBinaryOperation;
import ng.runtime.metaclass.ShiftOperation;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;
import ng.runtime.threadcontext.BinaryArithmeticCategorySupport;
import ng.runtime.threadcontext.BinaryLogicalCategorySupport;
import ng.runtime.threadcontext.BooleanComparisonCategorySupport;
import ng.runtime.threadcontext.ConversionOperationCategorySupport;
import ng.runtime.threadcontext.IntegerComparisonCategorySupport;
import ng.runtime.threadcontext.ShiftCategorySupport;

/**
 * @author John
 *
 */
public class MetaClassImpl extends BaseMetaClass {

  protected volatile Conversion modifiedConvert = null;

  protected volatile BinaryOperation modifiedAdd = null;
  protected volatile BinaryOperation modifiedSubtract = null;
  protected volatile BinaryOperation modifiedMultiply = null;
  protected volatile BinaryOperation modifiedDivide = null;
  protected volatile BinaryOperation modifiedModulo = null;
  protected volatile BinaryOperation modifiedRemainderDivide = null;
  protected volatile BinaryOperation modifiedPower = null;

  protected volatile LogicalBinaryOperation modifiedAnd = null;
  protected volatile LogicalBinaryOperation modifiedOr = null;
  protected volatile LogicalBinaryOperation modifiedXor = null;
  protected volatile ShiftOperation modifiedLeftShift = null;
  protected volatile ShiftOperation modifiedRightShift = null;
  protected volatile ShiftOperation modifiedUnsignedRightShift = null;

  protected volatile IntBinaryComparison modifiedCompare = null;

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

  public MetaClassImpl() {
    this(Object.class);
  }

  public void modifyConvert(final Conversion modifiedConvert) {
    this.modifiedConvert = modifiedConvert;
  }

  public Conversion getOriginalConvert() {
    return ConversionNoopImpl.instance;
  }

  public Conversion convert(final ConversionOperationCategorySupport conversionOperation) {
  final Map<Object, Conversion> categoryOperationMap = conversionOperation.getCategoryConversionCallMap();

    if(categoryOperationMap != null) {
    final Conversion operation = categoryOperationMap.get(this);

      if (operation != null) {
        return operation;
      }
    }

    if (this.modifiedConvert == null) {
      return getOriginalConvert();
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final BinaryOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public BinaryOperation getOriginalAdd() {
    return ArithmeticBinaryOperationNoopImpl.instance;
  }

  public BinaryOperation add(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final Map<Object, BinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final BinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);

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

  public void modifySubtract(final BinaryOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public BinaryOperation getOriginalSubtract() {
    return ArithmeticBinaryOperationNoopImpl.instance;
  }

  public BinaryOperation subtract(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final Map<Object, BinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final BinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);

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

  public void modifyMultiply(final BinaryOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public BinaryOperation getOriginalMultiply() {
    return ArithmeticBinaryOperationNoopImpl.instance;
  }

  public BinaryOperation multiply(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final Map<Object, BinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final BinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);

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

  public void modifyDivide(final BinaryOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public BinaryOperation getOriginalDivide() {
    return ArithmeticBinaryOperationNoopImpl.instance;
  }

  public BinaryOperation divide(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final Map<Object, BinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final BinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);

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

  public void modifyModulo(final BinaryOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public BinaryOperation getOriginalModulo() {
    return ArithmeticBinaryOperationNoopImpl.instance;
  }

  public BinaryOperation modulo(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final Map<Object, BinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final BinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);

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

  public void modifyRemainderDivide(final BinaryOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public BinaryOperation getOriginalRemainderDivide() {
    return ArithmeticBinaryOperationNoopImpl.instance;
  }

  public BinaryOperation remainderDivide(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final Map<Object, BinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final BinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);

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

  public void modifyPower(final BinaryOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public BinaryOperation getOriginalPower() {
    return ArithmeticBinaryOperationNoopImpl.instance;
  }

  public BinaryOperation power(final BinaryArithmeticCategorySupport binaryArithmeticOperation) {
  final Map<Object, BinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final BinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);

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

  public void modifyAnd(final LogicalBinaryOperation modifiedAnd) {
    this.modifiedAnd = modifiedAnd;
  }

  public LogicalBinaryOperation getOriginalAnd() {
    return LogicalBinaryOperationNoopImpl.instance;
  }

  public LogicalBinaryOperation and(final BinaryLogicalCategorySupport binaryLogicalOperation) {
  final Map<Object, LogicalBinaryOperation> categoryOperationMap = binaryLogicalOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final LogicalBinaryOperation logicalBinaryOperation = categoryOperationMap.get(this);

      if (logicalBinaryOperation != null) {
        return logicalBinaryOperation;
      }
    }

    if (this.modifiedAnd == null) {
      return getOriginalAnd();
    } else {
      return this.modifiedAnd;
    }
  }

  public void modifyOr(final LogicalBinaryOperation modifiedOr) {
    this.modifiedOr = modifiedOr;
  }

  public LogicalBinaryOperation getOriginalOr() {
    return LogicalBinaryOperationNoopImpl.instance;
  }

  public LogicalBinaryOperation or(final BinaryLogicalCategorySupport binaryLogicalOperation) {
  final Map<Object, LogicalBinaryOperation> categoryOperationMap = binaryLogicalOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final LogicalBinaryOperation logicalBinaryOperation = categoryOperationMap.get(this);

      if (logicalBinaryOperation != null) {
        return logicalBinaryOperation;
      }
    }

    if (this.modifiedOr == null) {
      return getOriginalOr();
    } else {
      return this.modifiedOr;
    }
  }

  public void modifyXor(final LogicalBinaryOperation modifiedXor) {
    this.modifiedXor = modifiedXor;
  }

  public LogicalBinaryOperation getOriginalXor() {
    return LogicalBinaryOperationNoopImpl.instance;
  }

  public LogicalBinaryOperation xor(final BinaryLogicalCategorySupport binaryLogicalOperation) {
  final Map<Object, LogicalBinaryOperation> categoryOperationMap = binaryLogicalOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final LogicalBinaryOperation logicalBinaryOperation = categoryOperationMap.get(this);

      if (logicalBinaryOperation != null) {
        return logicalBinaryOperation;
      }
    }

    if (this.modifiedXor == null) {
      return getOriginalXor();
    } else {
      return this.modifiedXor;
    }
  }

  public void modifyLeftShift(final ShiftOperation modifiedLeftShift) {
    this.modifiedLeftShift = modifiedLeftShift;
  }

  public ShiftOperation getOriginalLeftShift() {
    return ShiftOperationNoopImpl.instance;
  }

  public ShiftOperation leftShift(final ShiftCategorySupport shiftOperation) {
  final Map<Object, ShiftOperation> categoryOperationMap = shiftOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ShiftOperation shiftOp = categoryOperationMap.get(this);

      if (shiftOp != null) {
        return shiftOp;
      }
    }

    if (this.modifiedLeftShift == null) {
      return getOriginalLeftShift();
    } else {
      return this.modifiedLeftShift;
    }
  }

  public void modifyRightShift(final ShiftOperation modifiedRightShift) {
    this.modifiedRightShift = modifiedRightShift;
  }

  public ShiftOperation getOriginalRightShift() {
    return ShiftOperationNoopImpl.instance;
  }

  public ShiftOperation rightShift(final ShiftCategorySupport shiftOperation) {
  final Map<Object, ShiftOperation> categoryOperationMap = shiftOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ShiftOperation shiftOp = categoryOperationMap.get(this);

      if (shiftOp != null) {
        return shiftOp;
      }
    }

    if (this.modifiedRightShift == null) {
      return getOriginalRightShift();
    } else {
      return this.modifiedRightShift;
    }
  }

  public void modifyUnsignedRightShift(final ShiftOperation modifiedUnsignedRightShift) {
    this.modifiedUnsignedRightShift = modifiedUnsignedRightShift;
  }

  public ShiftOperation getOriginalUnsignedRightShift() {
    return ShiftOperationNoopImpl.instance;
  }

  public ShiftOperation unsignedRightShift(final ShiftCategorySupport shiftOperation) {
  final Map<Object, ShiftOperation> categoryOperationMap = shiftOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ShiftOperation shiftOp = categoryOperationMap.get(this);

      if (shiftOp != null) {
        return shiftOp;
      }
    }

    if (this.modifiedUnsignedRightShift == null) {
      return getOriginalUnsignedRightShift();
    } else {
      return this.modifiedUnsignedRightShift;
    }
  }

  public void modifyCompare(final IntBinaryComparison modifiedCompare) {
    this.modifiedCompare = modifiedCompare;
  }

  public IntBinaryComparison getOriginalCompare() {
    return IntegerBinaryComparisonNoopImpl.instance;
  }

  public IntBinaryComparison compare(final IntegerComparisonCategorySupport integerComparison) {
  final Map<Object, IntBinaryComparison> categoryOperationMap = integerComparison.getCategoryOperationMap();

    if (categoryOperationMap != null) {
    final IntBinaryComparison categoryIntegerBinaryComparison = categoryOperationMap.get(this);

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

  public BooleanBinaryComparison equals(final BooleanComparisonCategorySupport booleanComparison) {
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

  public BooleanBinaryComparison notEquals(final BooleanComparisonCategorySupport booleanComparison) {
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

  public BooleanBinaryComparison lessThan(final BooleanComparisonCategorySupport booleanComparison) {
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

  public BooleanBinaryComparison greaterThan(final BooleanComparisonCategorySupport booleanComparison) {
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

  public BooleanBinaryComparison lessThanOrEquals(final BooleanComparisonCategorySupport booleanComparison) {
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

  public BooleanBinaryComparison greaterThanOrEquals(final BooleanComparisonCategorySupport booleanComparison) {
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
