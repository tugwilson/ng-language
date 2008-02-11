package uk.co.wilson.ng.runtime.threadcontext;

import java.util.Map;
import java.util.Stack;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.Behaviour;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.ByteBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.DoubleBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongBinaryArithmeticOperation;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortBinaryArithmeticOperation;

public abstract class BaseBinaryAritmeticOperation extends BaseBinaryOperation implements BinaryArithmeticOperation {
  protected BaseBinaryAritmeticOperation(final ThreadContext tc) {
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

  private Stack<Map<MetaClass, ArithmeticBinaryOperation>> categoryBinaryOperationMapStack = new Stack<Map<MetaClass, ArithmeticBinaryOperation>>();

  public CharBinaryArithmeticOperation getCharCategoryOperation() {
    return this.charCategoryOperation;
  }

  public void setCharCategoryOperation(CharBinaryArithmeticOperation charCategoryOperation) {
    this.charCategoryOperation = charCategoryOperation;
  }

  public ByteBinaryArithmeticOperation getByteCategoryOperation() {
    return this.byteCategoryOperation;
  }

  public void setByteCategoryOperation(ByteBinaryArithmeticOperation byteCategoryOperation) {
    this.byteCategoryOperation = byteCategoryOperation;
  }

  public ShortBinaryArithmeticOperation getShortCategoryOperation() {
    return this.shortCategoryOperation;
  }

  public void setShortCategoryOperation(ShortBinaryArithmeticOperation shortCategoryOperation) {
    this.shortCategoryOperation = shortCategoryOperation;
  }

  public IntBinaryArithmeticOperation getIntCategoryOperation() {
    return this.intCategoryOperation;
  }

  public void setIntCategoryOperation(IntBinaryArithmeticOperation intCategoryOperation) {
    this.intCategoryOperation = intCategoryOperation;
  }

  public LongBinaryArithmeticOperation getLongCategoryOperation() {
    return this.longCategoryOperation;
  }

  public void setLongCategoryOperation(LongBinaryArithmeticOperation longCategoryOperation) {
    this.longCategoryOperation = longCategoryOperation;
  }

  public FloatBinaryArithmeticOperation getFloatCategoryOperation() {
    return this.floatCategoryOperation;
  }

  public void setFloatCategoryOperation(FloatBinaryArithmeticOperation floatCategoryOperation) {
    this.floatCategoryOperation = floatCategoryOperation;
  }

  public DoubleBinaryArithmeticOperation getDoubleCategoryOperation() {
    return this.doubleCategoryOperation;
  }

  public void setDoubleCategoryOperation(DoubleBinaryArithmeticOperation doubleCategoryOperation) {
    this.doubleCategoryOperation = doubleCategoryOperation;
  }

  public BigIntegerBinaryArithmeticOperation getBigIntegerCategoryOperation() {
    return this.bigIntegerCategoryOperation;
  }

  public void setBigIntegerCategoryOperation(BigIntegerBinaryArithmeticOperation bigIntegerCategoryOperation) {
    this.bigIntegerCategoryOperation = bigIntegerCategoryOperation;
  }

  public BigDecimalBinaryArithmeticOperation getBigDecimalCategoryOperation() {
    return this.bigDecimalCategoryOperation;
  }

  public void setBigDecimalCategoryOperation(BigDecimalBinaryArithmeticOperation bigDecimalCategoryOperation) {
    this.bigDecimalCategoryOperation = bigDecimalCategoryOperation;
  }

  public Map<MetaClass, ArithmeticBinaryOperation> getCategoryBinaryOperationMap() {
    return this.categoryBinaryOperationMap;
  }

  public void setCategoryBinaryOperationMap(Map<MetaClass, ArithmeticBinaryOperation> categoryBinaryOperationMap) {
    this.categoryBinaryOperationMap = categoryBinaryOperationMap;
  }

  public void pushBehaviour(Behaviour category) {
    // TODO Auto-generated method stub  
  }

  public void popBehaviour() {
    // TODO Auto-generated method stub   
  }
}