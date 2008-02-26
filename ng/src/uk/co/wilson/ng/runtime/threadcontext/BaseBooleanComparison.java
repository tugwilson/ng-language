package uk.co.wilson.ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Stack;

import ng.runtime.metaclass.BigDecimalBooleanComparison;
import ng.runtime.metaclass.BigIntegerBooleanComparison;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.ByteBooleanComparison;
import ng.runtime.metaclass.CharBooleanComparison;
import ng.runtime.metaclass.LongBooleanComparison;
import ng.runtime.threadcontext.Behaviour;
import ng.runtime.threadcontext.BooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.DoubleBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.FloatBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.IntBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.ShortBooleanComparison;


public abstract class BaseBooleanComparison extends BaseBinaryOperation implements BooleanComparison {
  public BaseBooleanComparison(final ExtendedThreadContext tc) {
    super(tc);
  }

  private CharBooleanComparison charCategoryOperation = null;

  private ByteBooleanComparison byteCategoryOperation = null;

  private ShortBooleanComparison shortCategoryOperation = null;

  private IntBooleanComparison intCategoryOperation = null;

  private LongBooleanComparison longCategoryOperation = null;

  private FloatBooleanComparison floatCategoryOperation = null;

  private DoubleBooleanComparison doubleCategoryOperation = null;

  private BigIntegerBooleanComparison bigIntegerCategoryOperation = null;

  private BigDecimalBooleanComparison bigDecimalCategoryOperation = null;

  private Map<Object, BooleanBinaryComparison> categoryOperationMap = null;

  private final Stack<Map<Object, BooleanBinaryComparison>> categoryOperationMapStack = new Stack<Map<Object, BooleanBinaryComparison>>();

  public CharBooleanComparison getCharCategoryOperation() {
    return this.charCategoryOperation;
  }

  public void setCharCategoryOperation(final CharBooleanComparison charCategoryOperation) {
    this.charCategoryOperation = charCategoryOperation;
  }

  public ByteBooleanComparison getByteCategoryOperation() {
    return this.byteCategoryOperation;
  }

  public void setByteCategoryOperation(final ByteBooleanComparison byteCategoryOperation) {
    this.byteCategoryOperation = byteCategoryOperation;
  }

  public ShortBooleanComparison getShortCategoryOperation() {
    return this.shortCategoryOperation;
  }

  public void setShortCategoryOperation(final ShortBooleanComparison shortCategoryOperation) {
    this.shortCategoryOperation = shortCategoryOperation;
  }

  public IntBooleanComparison getIntCategoryOperation() {
    return this.intCategoryOperation;
  }

  public void setIntCategoryOperation(final IntBooleanComparison intCategoryOperation) {
    this.intCategoryOperation = intCategoryOperation;
  }

  public LongBooleanComparison getLongCategoryOperation() {
    return this.longCategoryOperation;
  }

  public void setLongCategoryOperation(final LongBooleanComparison longCategoryOperation) {
    this.longCategoryOperation = longCategoryOperation;
  }

  public FloatBooleanComparison getFloatCategoryOperation() {
    return this.floatCategoryOperation;
  }

  public void setFloatCategoryOperation(final FloatBooleanComparison floatCategoryOperation) {
    this.floatCategoryOperation = floatCategoryOperation;
  }

  public DoubleBooleanComparison getDoubleCategoryOperation() {
    return this.doubleCategoryOperation;
  }

  public void setDoubleCategoryOperation(final DoubleBooleanComparison doubleCategoryOperation) {
    this.doubleCategoryOperation = doubleCategoryOperation;
  }

  public BigIntegerBooleanComparison getBigIntegerCategoryOperation() {
    return this.bigIntegerCategoryOperation;
  }

  public void setBigIntegerCategoryOperation(final BigIntegerBooleanComparison bigIntegerCategoryOperation) {
    this.bigIntegerCategoryOperation = bigIntegerCategoryOperation;
  }

  public BigDecimalBooleanComparison getBigDecimalCategoryOperation() {
    return this.bigDecimalCategoryOperation;
  }

  public void setBigDecimalCategoryOperation(final BigDecimalBooleanComparison bigDecimalCategoryOperation) {
    this.bigDecimalCategoryOperation = bigDecimalCategoryOperation;
  }

  public Map<Object, BooleanBinaryComparison> getCategoryOperationMap() {
    return this.categoryOperationMap;
  }

  public void setCategoryOperationMap(final Map<Object, BooleanBinaryComparison> categoryOperationMap) {
    this.categoryOperationMap = categoryOperationMap;
  }

  public void pushBehaviour(final Behaviour behaviour) {
    // TODO Auto-generated method stub
  }

  public void popBehaviour() {
    // TODO Auto-generated method stub
  }

  public boolean applyBoolean(final Object lhs, final Object rhs) {
    return applyBoolean(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public boolean applyBoolean(final Object lhs, final char rhs) {
    return applyBoolean(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public boolean applyBoolean(final Object lhs, final byte rhs) {
    return applyBoolean(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public boolean applyBoolean(final Object lhs, final short rhs) {
    return applyBoolean(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public boolean applyBoolean(final Object lhs, final int rhs) {
    return applyBoolean(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public boolean applyBoolean(final Object lhs, final long rhs) {
    return applyBoolean(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public boolean applyBoolean(final Object lhs, final float rhs) {
    return applyBoolean(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public boolean applyBoolean(final Object lhs, final double rhs) {
    return applyBoolean(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public boolean applyBoolean(final Object lhs, final BigInteger rhs) {
    return applyBoolean(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public boolean applyBoolean(final Object lhs, final BigDecimal rhs) {
    return applyBoolean(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public boolean applyBoolean(final char lhs, final Object rhs) {
    return applyBoolean(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public boolean applyBoolean(final byte lhs, final Object rhs) {
    return applyBoolean(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public boolean applyBoolean(final short lhs, final Object rhs) {
    return applyBoolean(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public boolean applyBoolean(final int lhs, final Object rhs) {
    return applyBoolean(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public boolean applyBoolean(final long lhs, final Object rhs) {
    return applyBoolean(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public boolean applyBoolean(final float lhs, final Object rhs) {
    return applyBoolean(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public boolean applyBoolean(final double lhs, final Object rhs) {
    return applyBoolean(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public boolean applyBoolean(final BigInteger lhs, final Object rhs) {
    return applyBoolean(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public boolean applyBoolean(final BigDecimal lhs, final Object rhs) {
    return applyBoolean(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }
}
