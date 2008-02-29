package uk.co.wilson.ng.runtime.threadcontext;

import java.util.Map;
import java.util.Stack;

import ng.runtime.metaclass.ShiftOperation;
import ng.runtime.metaclass.primitives.biginteger.BigIntegerShiftOperation;
import ng.runtime.metaclass.primitives.byteimpl.ByteShiftOperation;
import ng.runtime.metaclass.primitives.charimpl.CharShiftOperation;
import ng.runtime.metaclass.primitives.intimpl.IntShiftOperation;
import ng.runtime.metaclass.primitives.longimpl.LongShiftOperation;
import ng.runtime.metaclass.primitives.shortimpl.ShortShiftOperation;
import ng.runtime.threadcontext.Behaviour;
import ng.runtime.threadcontext.BinaryShiftOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public abstract class BaseShiftOperationImpl extends BaseBinaryOperationImpl implements BinaryShiftOperation {
  /**
   * @param tc
   */
  protected BaseShiftOperationImpl(final ExtendedThreadContext tc) {
    super(tc);
  }

  private CharShiftOperation charCategoryOperation = null;

  private ByteShiftOperation byteCategoryOperation = null;

  private ShortShiftOperation shortCategoryOperation = null;

  private IntShiftOperation intCategoryOperation = null;

  private LongShiftOperation longCategoryOperation = null;

  private ShiftOperation floatCategoryOperation = null;

  private ShiftOperation doubleCategoryOperation = null;

  private BigIntegerShiftOperation bigIntegerCategoryOperation = null;

  private ShiftOperation bigDecimalCategoryOperation = null;

  private Map<Object, ShiftOperation> categoryBinaryOperationMap = null;

  private final Stack<Map<Object, ShiftOperation>> categoryBinaryOperationMapStack = new Stack<Map<Object, ShiftOperation>>();

  public CharShiftOperation getCharCategoryOperation() {
    return this.charCategoryOperation;
  }

  public void setCharCategoryOperation(final CharShiftOperation charCategoryOperation) {
    this.charCategoryOperation = charCategoryOperation;
  }

  public ByteShiftOperation getByteCategoryOperation() {
    return this.byteCategoryOperation;
  }

  public void setByteCategoryOperation(final ByteShiftOperation byteCategoryOperation) {
    this.byteCategoryOperation = byteCategoryOperation;
  }

  public ShortShiftOperation getShortCategoryOperation() {
    return this.shortCategoryOperation;
  }

  public void setShortCategoryOperation(final ShortShiftOperation shortCategoryOperation) {
    this.shortCategoryOperation = shortCategoryOperation;
  }

  public IntShiftOperation getIntCategoryOperation() {
    return this.intCategoryOperation;
  }

  public void setIntCategoryOperation(final IntShiftOperation intCategoryOperation) {
    this.intCategoryOperation = intCategoryOperation;
  }

  public LongShiftOperation getLongCategoryOperation() {
    return this.longCategoryOperation;
  }

  public void setLongCategoryOperation(final LongShiftOperation longCategoryOperation) {
    this.longCategoryOperation = longCategoryOperation;
  }

  public ShiftOperation getFloatCategoryOperation() {
    return this.floatCategoryOperation;
  }

  public void setFloatCategoryOperation(final ShiftOperation floatCategoryOperation) {
    this.floatCategoryOperation = floatCategoryOperation;
  }

  public ShiftOperation getDoubleCategoryOperation() {
    return this.doubleCategoryOperation;
  }

  public void setDoubleCategoryOperation(final ShiftOperation doubleCategoryOperation) {
    this.doubleCategoryOperation = doubleCategoryOperation;
  }

  public BigIntegerShiftOperation getBigIntegerCategoryOperation() {
    return this.bigIntegerCategoryOperation;
  }

  public void setBigIntegerCategoryOperation(final BigIntegerShiftOperation bigIntegerCategoryOperation) {
    this.bigIntegerCategoryOperation = bigIntegerCategoryOperation;
  }

  public ShiftOperation getBigDecimalCategoryOperation() {
    return this.bigDecimalCategoryOperation;
  }

  public void setBigDecimalCategoryOperation(final ShiftOperation bigDecimalCategoryOperation) {
    this.bigDecimalCategoryOperation = bigDecimalCategoryOperation;
  }

  public Map<Object, ShiftOperation> getCategoryBinaryOperationMap() {
    return this.categoryBinaryOperationMap;
  }

  public void setCategoryBinaryOperationMap(final Map<Object, ShiftOperation> categoryBinaryOperationMap) {
    this.categoryBinaryOperationMap = categoryBinaryOperationMap;
  }

  public void pushBehaviour(final Behaviour category) {
    // TODO Auto-generated method stub
  }

  public void popBehaviour() {
    // TODO Auto-generated method stub
  }
}
