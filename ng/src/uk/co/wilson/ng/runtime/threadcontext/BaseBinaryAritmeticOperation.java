package uk.co.wilson.ng.runtime.threadcontext;

import java.util.Map;
import java.util.Stack;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.Behaviour;
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
import uk.co.wilson.ng.runtime.threadcontext.util.HashMapWithDefaultValue;

public abstract class BaseBinaryAritmeticOperation extends BaseBinaryOperation {
  protected BaseBinaryAritmeticOperation(final ThreadContext tc) {
    super(tc);
  }

  protected CharBinaryArithmeticOperation charCategoryOperation = null;

  protected ByteBinaryArithmeticOperation byteCategoryOperation = null;

  protected ShortBinaryArithmeticOperation shortCategoryOperation = null;

  protected IntBinaryArithmeticOperation intCategoryOperation = null;

  protected LongBinaryArithmeticOperation longCategoryOperation = null;

  protected FloatBinaryArithmeticOperation floatCategoryOperation = null;

  protected DoubleBinaryArithmeticOperation doubleCategoryOperation = null;

  protected BigIntegerBinaryArithmeticOperation bigIntegerCategoryOperation = null;

  protected BigDecimalBinaryArithmeticOperation bigDecimalCategoryOperation = null;

  protected HashMapWithDefaultValue<MetaClass, BinaryArithmeticOperation> categoryBinaryOperationMap = null;

  protected Stack<Map<MetaClass, BinaryArithmeticOperation>> categoryBinaryOperationMapStack = new Stack<Map<MetaClass, BinaryArithmeticOperation>>();

  public void pushBehaviour(Behaviour category) {
    // TODO Auto-generated method stub  
  }

  public void popBehaviour() {
    // TODO Auto-generated method stub   
  }
}
