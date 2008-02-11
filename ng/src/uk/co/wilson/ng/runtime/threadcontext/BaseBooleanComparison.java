package uk.co.wilson.ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Stack;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BooleanComparison;
import ng.runtime.threadcontext.Behaviour;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.ByteBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.CharBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.DoubleBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.LongBooleanComparison;
import uk.co.wilson.ng.runtime.metaclass.primitives.ShortBooleanComparison;
import uk.co.wilson.ng.runtime.threadcontext.util.HashMapWithDefaultValue;


public abstract class BaseBooleanComparison extends BaseBinaryOperation implements BooleanComparison {
  public BaseBooleanComparison(final ThreadContext tc) {
    super(tc);
  }

  protected CharBooleanComparison charCategoryOperation = null;

  protected ByteBooleanComparison byteCategoryOperation = null;

  protected ShortBooleanComparison shortCategoryOperation = null;

  protected IntBooleanComparison intCategoryOperation = null;

  protected LongBooleanComparison longCategoryOperation = null;

  protected FloatBooleanComparison floatCategoryOperation = null;

  protected DoubleBooleanComparison doubleCategoryOperation = null;

  protected BigIntegerBooleanComparison bigIntegerCategoryOperation = null;

  protected BigDecimalBooleanComparison bigDecimalCategoryOperation = null;

  protected HashMapWithDefaultValue<MetaClass, BooleanBinaryComparison> categoryOperationMap = null;

  protected Stack<Map<MetaClass, BooleanBinaryComparison>> categoryOperationMapStack = new Stack<Map<MetaClass, BooleanBinaryComparison>>();

  public void pushBehaviour(Behaviour behaviour) {
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
