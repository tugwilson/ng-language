package uk.co.wilson.ng.runtime.threadcontext;

import java.util.Map;
import java.util.Stack;

import ng.runtime.metaclass.LogicalBinaryOperation;
import ng.runtime.metaclass.primitives.biginteger.BigIntegerBinaryLogicalOperation;
import ng.runtime.metaclass.primitives.byteimpl.ByteBinaryLogicalOperation;
import ng.runtime.metaclass.primitives.charimpl.CharBinaryLogicalOperation;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryLogicalOperation;
import ng.runtime.metaclass.primitives.longimpl.LongBinaryLogicalOperation;
import ng.runtime.metaclass.primitives.shortimpl.ShortBinaryLogicalOperation;
import ng.runtime.threadcontext.Behaviour;
import ng.runtime.threadcontext.BinaryLogicalOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 * 
 */
public abstract class BaseBinaryLogicalOperationImpl extends BaseBinaryOperationImpl implements BinaryLogicalOperation {
  /**
   * @param tc
   */
  protected BaseBinaryLogicalOperationImpl(final ExtendedThreadContext tc) {
    super(tc);
  }

  private CharBinaryLogicalOperation charCategoryOperation = null;

  private ByteBinaryLogicalOperation byteCategoryOperation = null;

  private ShortBinaryLogicalOperation shortCategoryOperation = null;

  private IntBinaryLogicalOperation intCategoryOperation = null;

  private LongBinaryLogicalOperation longCategoryOperation = null;

  private LogicalBinaryOperation floatCategoryOperation = null;

  private LogicalBinaryOperation doubleCategoryOperation = null;

  private BigIntegerBinaryLogicalOperation bigIntegerCategoryOperation = null;

  private LogicalBinaryOperation bigDecimalCategoryOperation = null;

  private Map<Object, LogicalBinaryOperation> categoryBinaryOperationMap = null;

  private final Stack<Map<Object, LogicalBinaryOperation>> categoryBinaryOperationMapStack = new Stack<Map<Object, LogicalBinaryOperation>>();

  public CharBinaryLogicalOperation getCharCategoryOperation() {
    return this.charCategoryOperation;
  }

  public void setCharCategoryOperation(final CharBinaryLogicalOperation charCategoryOperation) {
    this.charCategoryOperation = charCategoryOperation;
  }

  public ByteBinaryLogicalOperation getByteCategoryOperation() {
    return this.byteCategoryOperation;
  }

  public void setByteCategoryOperation(final ByteBinaryLogicalOperation byteCategoryOperation) {
    this.byteCategoryOperation = byteCategoryOperation;
  }

  public ShortBinaryLogicalOperation getShortCategoryOperation() {
    return this.shortCategoryOperation;
  }

  public void setShortCategoryOperation(final ShortBinaryLogicalOperation shortCategoryOperation) {
    this.shortCategoryOperation = shortCategoryOperation;
  }

  public IntBinaryLogicalOperation getIntCategoryOperation() {
    return this.intCategoryOperation;
  }

  public void setIntCategoryOperation(final IntBinaryLogicalOperation intCategoryOperation) {
    this.intCategoryOperation = intCategoryOperation;
  }

  public LongBinaryLogicalOperation getLongCategoryOperation() {
    return this.longCategoryOperation;
  }

  public void setLongCategoryOperation(final LongBinaryLogicalOperation longCategoryOperation) {
    this.longCategoryOperation = longCategoryOperation;
  }

  public LogicalBinaryOperation getFloatCategoryOperation() {
    return this.floatCategoryOperation;
  }

  public void setFloatCategoryOperation(final LogicalBinaryOperation floatCategoryOperation) {
    this.floatCategoryOperation = floatCategoryOperation;
  }

  public LogicalBinaryOperation getDoubleCategoryOperation() {
    return this.doubleCategoryOperation;
  }

  public void setDoubleCategoryOperation(final LogicalBinaryOperation doubleCategoryOperation) {
    this.doubleCategoryOperation = doubleCategoryOperation;
  }

  public BigIntegerBinaryLogicalOperation getBigIntegerCategoryOperation() {
    return this.bigIntegerCategoryOperation;
  }

  public void setBigIntegerCategoryOperation(final BigIntegerBinaryLogicalOperation bigIntegerCategoryOperation) {
    this.bigIntegerCategoryOperation = bigIntegerCategoryOperation;
  }

  public LogicalBinaryOperation getBigDecimalCategoryOperation() {
    return this.bigDecimalCategoryOperation;
  }

  public void setBigDecimalCategoryOperation(final LogicalBinaryOperation bigDecimalCategoryOperation) {
    this.bigDecimalCategoryOperation = bigDecimalCategoryOperation;
  }

  public Map<Object, LogicalBinaryOperation> getCategoryBinaryOperationMap() {
    return this.categoryBinaryOperationMap;
  }

  public void setCategoryBinaryOperationMap(final Map<Object, LogicalBinaryOperation> categoryBinaryOperationMap) {
    this.categoryBinaryOperationMap = categoryBinaryOperationMap;
  }

  public void pushBehaviour(final Behaviour category) {
    // TODO Auto-generated method stub
  }

  public void popBehaviour() {
    // TODO Auto-generated method stub
  }
}
