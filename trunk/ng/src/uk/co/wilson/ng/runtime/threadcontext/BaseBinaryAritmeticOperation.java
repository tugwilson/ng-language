package uk.co.wilson.ng.runtime.threadcontext;

import java.util.Map;
import java.util.Stack;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.Behaviour;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal.BigDecimalBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.biginteger.BigIntegerBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl.ByteBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.charimpl.CharBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl.DoubleBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl.FloatBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.intimpl.IntBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.longimpl.LongBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl.ShortBinaryArithmeticOperation;

public abstract class BaseBinaryAritmeticOperation extends BaseBinaryOperation implements BinaryArithmeticOperation {
  protected BaseBinaryAritmeticOperation(final ExtendedThreadContext tc) {
    super(tc);
  }

  private CharBinaryArithmeticOperation charCategoryOperation = null;

  private ByteBinaryArithmeticOperation byteCategoryOperation = null;

  private ShortBinaryArithmeticOperation shortCategoryOperation = null;

  private IntBinaryArithmeticOperation intCategoryOperation = null;

  private LongBinaryArithmeticOperation longCategoryOperation = null;

  private FloatBinaryArithmeticOperation floatCategoryOperation = null;

  private DoubleBinaryArithmeticOperation doubleCategoryOperation = null;

  private BigIntegerBinaryArithmeticOperation bigIntegerCategoryOperation = null;

  private BigDecimalBinaryArithmeticOperation bigDecimalCategoryOperation = null;

  private Map<MetaClass, ArithmeticBinaryOperation> categoryBinaryOperationMap = null;

  private final Stack<Map<MetaClass, ArithmeticBinaryOperation>> categoryBinaryOperationMapStack = new Stack<Map<MetaClass, ArithmeticBinaryOperation>>();

  public CharBinaryArithmeticOperation getCharCategoryOperation() {
    return this.charCategoryOperation;
  }

  public void setCharCategoryOperation(final CharBinaryArithmeticOperation charCategoryOperation) {
    this.charCategoryOperation = charCategoryOperation;
  }

  public ByteBinaryArithmeticOperation getByteCategoryOperation() {
    return this.byteCategoryOperation;
  }

  public void setByteCategoryOperation(final ByteBinaryArithmeticOperation byteCategoryOperation) {
    this.byteCategoryOperation = byteCategoryOperation;
  }

  public ShortBinaryArithmeticOperation getShortCategoryOperation() {
    return this.shortCategoryOperation;
  }

  public void setShortCategoryOperation(final ShortBinaryArithmeticOperation shortCategoryOperation) {
    this.shortCategoryOperation = shortCategoryOperation;
  }

  public IntBinaryArithmeticOperation getIntCategoryOperation() {
    return this.intCategoryOperation;
  }

  public void setIntCategoryOperation(final IntBinaryArithmeticOperation intCategoryOperation) {
    this.intCategoryOperation = intCategoryOperation;
  }

  public LongBinaryArithmeticOperation getLongCategoryOperation() {
    return this.longCategoryOperation;
  }

  public void setLongCategoryOperation(final LongBinaryArithmeticOperation longCategoryOperation) {
    this.longCategoryOperation = longCategoryOperation;
  }

  public FloatBinaryArithmeticOperation getFloatCategoryOperation() {
    return this.floatCategoryOperation;
  }

  public void setFloatCategoryOperation(final FloatBinaryArithmeticOperation floatCategoryOperation) {
    this.floatCategoryOperation = floatCategoryOperation;
  }

  public DoubleBinaryArithmeticOperation getDoubleCategoryOperation() {
    return this.doubleCategoryOperation;
  }

  public void setDoubleCategoryOperation(final DoubleBinaryArithmeticOperation doubleCategoryOperation) {
    this.doubleCategoryOperation = doubleCategoryOperation;
  }

  public BigIntegerBinaryArithmeticOperation getBigIntegerCategoryOperation() {
    return this.bigIntegerCategoryOperation;
  }

  public void setBigIntegerCategoryOperation(final BigIntegerBinaryArithmeticOperation bigIntegerCategoryOperation) {
    this.bigIntegerCategoryOperation = bigIntegerCategoryOperation;
  }

  public BigDecimalBinaryArithmeticOperation getBigDecimalCategoryOperation() {
    return this.bigDecimalCategoryOperation;
  }

  public void setBigDecimalCategoryOperation(final BigDecimalBinaryArithmeticOperation bigDecimalCategoryOperation) {
    this.bigDecimalCategoryOperation = bigDecimalCategoryOperation;
  }

  public Map<MetaClass, ArithmeticBinaryOperation> getCategoryBinaryOperationMap() {
    return this.categoryBinaryOperationMap;
  }

  public void setCategoryBinaryOperationMap(final Map<MetaClass, ArithmeticBinaryOperation> categoryBinaryOperationMap) {
    this.categoryBinaryOperationMap = categoryBinaryOperationMap;
  }

  public void pushBehaviour(final Behaviour category) {
    // TODO Auto-generated method stub
  }

  public void popBehaviour() {
    // TODO Auto-generated method stub
  }
}
