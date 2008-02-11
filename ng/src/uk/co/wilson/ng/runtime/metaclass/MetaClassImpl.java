package uk.co.wilson.ng.runtime.metaclass;

import java.util.Map;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.metaclass.ArithmeticBinaryOperationNoopImpl;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.BooleanBinaryComparisonNoopImpl;
import ng.runtime.metaclass.Conversion;
import ng.runtime.metaclass.ConversionNoopImpl;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.BooleanComparison;

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

  protected volatile BooleanBinaryComparison modifiedEquals = null;
  protected volatile BooleanBinaryComparison modifiedNotEquals = null;
  protected volatile BooleanBinaryComparison modifiedLessThan = null;
  protected volatile BooleanBinaryComparison modifiedGreaterThan = null;
  protected volatile BooleanBinaryComparison modifiedLessThanOrEquals = null;
  protected volatile BooleanBinaryComparison modifiedGreaterThanOrEquals = null;

  protected final Conversion convert;

  protected final ArithmeticBinaryOperation add;
  protected final ArithmeticBinaryOperation subtract;
  protected final ArithmeticBinaryOperation multiply;
  protected final ArithmeticBinaryOperation divide;
  protected final ArithmeticBinaryOperation modulo;
  protected final ArithmeticBinaryOperation remainderDivide;
  protected final ArithmeticBinaryOperation power;

  protected final BooleanBinaryComparison equals;
  protected final BooleanBinaryComparison notEquals;
  protected final BooleanBinaryComparison lessThan;
  protected final BooleanBinaryComparison greaterThan;
  protected final BooleanBinaryComparison lessThanOrEquals;
  protected final BooleanBinaryComparison greaterThanOrEquals;

  /**
   * @param theClass
   */
  public MetaClassImpl(final Class<?> theClass) {
    super(theClass);
    // TODO: introspect the class and set up the operations
    this.convert = ConversionNoopImpl.instance;

    this.add = ArithmeticBinaryOperationNoopImpl.instance;
    this.subtract = ArithmeticBinaryOperationNoopImpl.instance;
    this.multiply = ArithmeticBinaryOperationNoopImpl.instance;
    this.divide = ArithmeticBinaryOperationNoopImpl.instance;
    this.modulo = ArithmeticBinaryOperationNoopImpl.instance;
    this.remainderDivide = ArithmeticBinaryOperationNoopImpl.instance;
    this.power = ArithmeticBinaryOperationNoopImpl.instance;

    this.equals = BooleanBinaryComparisonNoopImpl.instance;
    this.notEquals = BooleanBinaryComparisonNoopImpl.instance;
    this.lessThan = BooleanBinaryComparisonNoopImpl.instance;
    this.greaterThan = BooleanBinaryComparisonNoopImpl.instance;
    this.lessThanOrEquals = BooleanBinaryComparisonNoopImpl.instance;
    this.greaterThanOrEquals = BooleanBinaryComparisonNoopImpl.instance;
  }

  public void modifyConvert(final Conversion modifiedConvert) {
    this.modifiedConvert = modifiedConvert;
  }

  public Conversion getOriginalConvert() {
    return this.convert;
  }

  public Conversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  public void modifyAdd(final ArithmeticBinaryOperation modifiedAdd) {
    this.modifiedAdd = modifiedAdd;
  }

  public ArithmeticBinaryOperation getOriginalAdd() {
    return this.add;
  }

  public ArithmeticBinaryOperation add(BinaryArithmeticOperation binaryArithmeticOperation) {
  final Map<MetaClass, ArithmeticBinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ArithmeticBinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);
      
      if (arithmeticBinaryOperation != null) {
        return arithmeticBinaryOperation;
      }
    }
    
    if (this.modifiedAdd == null) {
      return this.add;
    } else {
      return this.modifiedAdd;
    }
  }

  public void modifySubtract(final ArithmeticBinaryOperation modifiedSubtract) {
    this.modifiedSubtract = modifiedSubtract;
  }

  public ArithmeticBinaryOperation getOriginalSubtract() {
    return this.subtract;
  }

  public ArithmeticBinaryOperation subtract(BinaryArithmeticOperation binaryArithmeticOperation) {
  final Map<MetaClass, ArithmeticBinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ArithmeticBinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);
      
      if (arithmeticBinaryOperation != null) {
        return arithmeticBinaryOperation;
      }
    }
    
    if (this.modifiedSubtract == null) {
      return this.subtract;
    } else {
      return this.modifiedSubtract;
    }
  }

  public void modifyMultiply(final ArithmeticBinaryOperation modifiedMultiply) {
    this.modifiedMultiply = modifiedMultiply;
  }

  public ArithmeticBinaryOperation getOriginalMultiply() {
    return this.multiply;
  }

  public ArithmeticBinaryOperation multiply(BinaryArithmeticOperation binaryArithmeticOperation) {
  final Map<MetaClass, ArithmeticBinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ArithmeticBinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);
      
      if (arithmeticBinaryOperation != null) {
        return arithmeticBinaryOperation;
      }
    }
    
    if (this.modifiedMultiply == null) {
      return this.multiply;
    } else {
      return this.modifiedMultiply;
    }
  }

  public void modifyDivide(final ArithmeticBinaryOperation modifiedDivide) {
    this.modifiedDivide = modifiedDivide;
  }

  public ArithmeticBinaryOperation getOriginalDivide() {
    return this.divide;
  }

  public ArithmeticBinaryOperation divide(BinaryArithmeticOperation binaryArithmeticOperation) {
  final Map<MetaClass, ArithmeticBinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ArithmeticBinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);
      
      if (arithmeticBinaryOperation != null) {
        return arithmeticBinaryOperation;
      }
    }
    
    if (this.modifiedDivide == null) {
      return this.divide;
    } else {
      return this.modifiedDivide;
    }
  }

  public void modifyModulo(final ArithmeticBinaryOperation modifiedModulo) {
    this.modifiedModulo = modifiedModulo;
  }

  public ArithmeticBinaryOperation getOriginalModulo() {
    return this.modulo;
  }

  public ArithmeticBinaryOperation modulo(BinaryArithmeticOperation binaryArithmeticOperation) {
  final Map<MetaClass, ArithmeticBinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ArithmeticBinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);
      
      if (arithmeticBinaryOperation != null) {
        return arithmeticBinaryOperation;
      }
    }
    
    if (this.modifiedModulo == null) {
      return this.modulo;
    } else {
      return this.modifiedModulo;
    }
  }

  public void modifyRemainderDivide(final ArithmeticBinaryOperation modifiedRemainderDivide) {
    this.modifiedRemainderDivide = modifiedRemainderDivide;
  }

  public ArithmeticBinaryOperation getOriginalRemainderDivide() {
    return this.remainderDivide;
  }

  public ArithmeticBinaryOperation remainderDivide(BinaryArithmeticOperation binaryArithmeticOperation) {
  final Map<MetaClass, ArithmeticBinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ArithmeticBinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);
      
      if (arithmeticBinaryOperation != null) {
        return arithmeticBinaryOperation;
      }
    }
    
    if (this.modifiedRemainderDivide == null) {
      return this.remainderDivide;
    } else {
      return this.modifiedRemainderDivide;
    }
  }

  public void modifyPower(final ArithmeticBinaryOperation modifiedPower) {
    this.modifiedPower = modifiedPower;
  }

  public ArithmeticBinaryOperation getOriginalPower() {
    return this.power;
  }

  public ArithmeticBinaryOperation power(BinaryArithmeticOperation binaryArithmeticOperation) {
  final Map<MetaClass, ArithmeticBinaryOperation> categoryOperationMap = binaryArithmeticOperation.getCategoryBinaryOperationMap();

    if(categoryOperationMap != null) {
    final ArithmeticBinaryOperation arithmeticBinaryOperation = categoryOperationMap.get(this);
      
      if (arithmeticBinaryOperation != null) {
        return arithmeticBinaryOperation;
      }
    }
    
    if (this.modifiedPower == null) {
      return this.power;
    } else {
      return this.modifiedPower;
    }
  }

  public void modifyEquals(final BooleanBinaryComparison modifiedEquals) {
    this.modifiedEquals = modifiedEquals;
  }

  public BooleanBinaryComparison getOriginalEquals() {
    return this.equals;
  }

  public BooleanBinaryComparison equals(BooleanComparison booleanComparison) {
  final Map<MetaClass, BooleanBinaryComparison> categoryOperationMap = booleanComparison.getCategoryOperationMap();
    
    if (categoryOperationMap != null) {
    final BooleanBinaryComparison categoryBooleanBinaryComparison = categoryOperationMap.get(this);
    
      if (categoryBooleanBinaryComparison != null) {
        return categoryBooleanBinaryComparison;
      }
    }

    if (this.modifiedEquals == null) {
      return this.equals;
    } else {
      return this.modifiedEquals;
    }
  }

  public void modifyNotEquals(final BooleanBinaryComparison modifiedNotEquals) {
    this.modifiedNotEquals = modifiedNotEquals;
  }

  public BooleanBinaryComparison getOriginalNotEquals() {
    return this.notEquals;
  }

  public BooleanBinaryComparison notEquals(BooleanComparison booleanComparison) {
  final Map<MetaClass, BooleanBinaryComparison> categoryOperationMap = booleanComparison.getCategoryOperationMap();
    
    if (categoryOperationMap != null) {
    final BooleanBinaryComparison categoryBooleanBinaryComparison = categoryOperationMap.get(this);
    
      if (categoryBooleanBinaryComparison != null) {
        return categoryBooleanBinaryComparison;
      }
    }

    if (this.modifiedNotEquals == null) {
      return this.notEquals;
    } else {
      return this.modifiedNotEquals;
    }
  }

  public void modifyLessThan(final BooleanBinaryComparison modifiedLessThan) {
    this.modifiedLessThan = modifiedLessThan;
  }

  public BooleanBinaryComparison getOriginalLessThan() {
    return this.lessThan;
  }

  public BooleanBinaryComparison lessThan(BooleanComparison booleanComparison) {
  final Map<MetaClass, BooleanBinaryComparison> categoryOperationMap = booleanComparison.getCategoryOperationMap();
    
    if (categoryOperationMap != null) {
    final BooleanBinaryComparison categoryBooleanBinaryComparison = categoryOperationMap.get(this);
    
      if (categoryBooleanBinaryComparison != null) {
        return categoryBooleanBinaryComparison;
      }
    }

    if (this.modifiedLessThan == null) {
      return this.lessThan;
    } else {
      return this.modifiedLessThan;
    }
  }

  public void modifyGreaterThan(final BooleanBinaryComparison modifiedGreaterThan) {
    this.modifiedGreaterThan = modifiedGreaterThan;
  }

  public BooleanBinaryComparison getOriginalGreaterThan() {
    return this.greaterThan;
  }

  public BooleanBinaryComparison greaterThan(BooleanComparison booleanComparison) {
  final Map<MetaClass, BooleanBinaryComparison> categoryOperationMap = booleanComparison.getCategoryOperationMap();
    
    if (categoryOperationMap != null) {
    final BooleanBinaryComparison categoryBooleanBinaryComparison = categoryOperationMap.get(this);
    
      if (categoryBooleanBinaryComparison != null) {
        return categoryBooleanBinaryComparison;
      }
    }

    if (this.modifiedGreaterThan == null) {
      return this.greaterThan;
    } else {
      return this.modifiedGreaterThan;
    }
  }

  public void modifyLessThanOrEquals(final BooleanBinaryComparison modifiedLessThanOrEquals) {
    this.modifiedLessThanOrEquals = modifiedLessThanOrEquals;
  }

  public BooleanBinaryComparison getOriginalLessThanOrEquals() {
    return this.lessThanOrEquals;
  }

  public BooleanBinaryComparison lessThanOrEquals(BooleanComparison booleanComparison) {
  final Map<MetaClass, BooleanBinaryComparison> categoryOperationMap = booleanComparison.getCategoryOperationMap();
    
    if (categoryOperationMap != null) {
    final BooleanBinaryComparison categoryBooleanBinaryComparison = categoryOperationMap.get(this);
    
      if (categoryBooleanBinaryComparison != null) {
        return categoryBooleanBinaryComparison;
      }
    }

    if (this.modifiedLessThanOrEquals == null) {
      return this.lessThanOrEquals;
    } else {
      return this.modifiedLessThanOrEquals;
    }
  }

  public void modifyGreaterThanOrEquals(final BooleanBinaryComparison modifiedGreaterThanOrEquals) {
    this.modifiedGreaterThanOrEquals = modifiedGreaterThanOrEquals;
  }

  public BooleanBinaryComparison getOriginalGreaterThanOrEquals() {
    return this.greaterThanOrEquals;
  }

  public BooleanBinaryComparison greaterThanOrEquals(BooleanComparison booleanComparison) {
  final Map<MetaClass, BooleanBinaryComparison> categoryOperationMap = booleanComparison.getCategoryOperationMap();
    
    if (categoryOperationMap != null) {
    final BooleanBinaryComparison categoryBooleanBinaryComparison = categoryOperationMap.get(this);
    
      if (categoryBooleanBinaryComparison != null) {
        return categoryBooleanBinaryComparison;
      }
    }

    if (this.modifiedGreaterThanOrEquals == null) {
      return this.greaterThanOrEquals;
    } else {
      return this.modifiedGreaterThanOrEquals;
    }
  }
}
