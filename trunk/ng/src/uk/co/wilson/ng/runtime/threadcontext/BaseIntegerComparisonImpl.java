package uk.co.wilson.ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Stack;

import ng.runtime.metaclass.primitives.bigdecimal.BigDecimalIntegerComparison;
import ng.runtime.metaclass.primitives.biginteger.BigIntegerIntegerComparison;
import ng.runtime.metaclass.primitives.byteimpl.ByteIntegerComparison;
import ng.runtime.metaclass.primitives.charimpl.CharIntegerComparison;
import ng.runtime.metaclass.primitives.doubleimpl.DoubleIntegerComparison;
import ng.runtime.metaclass.primitives.floatimpl.FloatIntegerComparison;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;
import ng.runtime.metaclass.primitives.intimpl.IntIntegerComparison;
import ng.runtime.metaclass.primitives.longimpl.LongIntegerComparison;
import ng.runtime.metaclass.primitives.shortimpl.ShortIntegerComparison;
import ng.runtime.threadcontext.Behaviour;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.IntegerComparison;

/**
 * @author John
 *
 */
public abstract class BaseIntegerComparisonImpl extends BaseBinaryOperationImpl implements IntegerComparison {
  public BaseIntegerComparisonImpl(final ExtendedThreadContext tc) {
    super(tc);
  }

  private CharIntegerComparison charCategoryOperation = null;

  private ByteIntegerComparison byteCategoryOperation = null;

  private ShortIntegerComparison shortCategoryOperation = null;

  private IntIntegerComparison intCategoryOperation = null;

  private LongIntegerComparison longCategoryOperation = null;

  private FloatIntegerComparison floatCategoryOperation = null;

  private DoubleIntegerComparison doubleCategoryOperation = null;

  private BigIntegerIntegerComparison bigIntegerCategoryOperation = null;

  private BigDecimalIntegerComparison bigDecimalCategoryOperation = null;

  private Map<Object, IntBinaryComparison> categoryOperationMap = null;

  private final Stack<Map<Object, IntBinaryComparison>> categoryOperationMapStack = new Stack<Map<Object, IntBinaryComparison>>();

  public CharIntegerComparison getCharCategoryOperation() {
    return this.charCategoryOperation;
  }

  public void setCharCategoryOperation(final CharIntegerComparison charCategoryOperation) {
    this.charCategoryOperation = charCategoryOperation;
  }

  public ByteIntegerComparison getByteCategoryOperation() {
    return this.byteCategoryOperation;
  }

  public void setByteCategoryOperation(final ByteIntegerComparison byteCategoryOperation) {
    this.byteCategoryOperation = byteCategoryOperation;
  }

  public ShortIntegerComparison getShortCategoryOperation() {
    return this.shortCategoryOperation;
  }

  public void setShortCategoryOperation(final ShortIntegerComparison shortCategoryOperation) {
    this.shortCategoryOperation = shortCategoryOperation;
  }

  public IntIntegerComparison getIntCategoryOperation() {
    return this.intCategoryOperation;
  }

  public void setIntCategoryOperation(final IntIntegerComparison intCategoryOperation) {
    this.intCategoryOperation = intCategoryOperation;
  }

  public LongIntegerComparison getLongCategoryOperation() {
    return this.longCategoryOperation;
  }

  public void setLongCategoryOperation(final LongIntegerComparison longCategoryOperation) {
    this.longCategoryOperation = longCategoryOperation;
  }

  public FloatIntegerComparison getFloatCategoryOperation() {
    return this.floatCategoryOperation;
  }

  public void setFloatCategoryOperation(final FloatIntegerComparison floatCategoryOperation) {
    this.floatCategoryOperation = floatCategoryOperation;
  }

  public DoubleIntegerComparison getDoubleCategoryOperation() {
    return this.doubleCategoryOperation;
  }

  public void setDoubleCategoryOperation(final DoubleIntegerComparison doubleCategoryOperation) {
    this.doubleCategoryOperation = doubleCategoryOperation;
  }

  public BigIntegerIntegerComparison getBigIntegerCategoryOperation() {
    return this.bigIntegerCategoryOperation;
  }

  public void setBigIntegerCategoryOperation(final BigIntegerIntegerComparison bigIntegerCategoryOperation) {
    this.bigIntegerCategoryOperation = bigIntegerCategoryOperation;
  }

  public BigDecimalIntegerComparison getBigDecimalCategoryOperation() {
    return this.bigDecimalCategoryOperation;
  }

  public void setBigDecimalCategoryOperation(final BigDecimalIntegerComparison bigDecimalCategoryOperation) {
    this.bigDecimalCategoryOperation = bigDecimalCategoryOperation;
  }

  public Map<Object, IntBinaryComparison> getCategoryOperationMap() {
    return this.categoryOperationMap;
  }

  public void setCategoryOperationMap(final Map<Object, IntBinaryComparison> categoryOperationMap) {
    this.categoryOperationMap = categoryOperationMap;
  }

  public void pushBehaviour(final Behaviour behaviour) {
    // TODO Auto-generated method stub
  }

  public void popBehaviour() {
    // TODO Auto-generated method stub
  }

  public int intApply(final Object lhs, final Object rhs) {
    return intApply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public int intApply(final Object lhs, final char rhs) {
    return intApply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public int intApply(final Object lhs, final byte rhs) {
    return intApply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public int intApply(final Object lhs, final short rhs) {
    return intApply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public int intApply(final Object lhs, final int rhs) {
    return intApply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public int intApply(final Object lhs, final long rhs) {
    return intApply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public int intApply(final Object lhs, final float rhs) {
    return intApply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public int intApply(final Object lhs, final double rhs) {
    return intApply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public int intApply(final Object lhs, final BigInteger rhs) {
    return intApply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public int intApply(final Object lhs, final BigDecimal rhs) {
    return intApply(this.tc.getMetaClassFor(lhs), lhs, rhs);
  }

  public int intApply(final char lhs, final Object rhs) {
    return intApply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public int intApply(final byte lhs, final Object rhs) {
    return intApply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public int intApply(final short lhs, final Object rhs) {
    return intApply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public int intApply(final int lhs, final Object rhs) {
    return intApply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public int intApply(final long lhs, final Object rhs) {
    return intApply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public int intApply(final float lhs, final Object rhs) {
    return intApply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public int intApply(final double lhs, final Object rhs) {
    return intApply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public int intApply(final BigInteger lhs, final Object rhs) {
    return intApply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }

  public int intApply(final BigDecimal lhs, final Object rhs) {
    return intApply(lhs, this.tc.getMetaClassFor(rhs), rhs);
  }
}
