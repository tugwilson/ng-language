package ng.runtime.threadcontext;

import ng.runtime.metaclass.MetaClass;
import uk.co.wilson.ng.runtime.threadcontext.ThreadContextImpl;


public abstract class ThreadContext {
  public static final Object NOT_PERFORMED = new Object();

  private static final ThreadLocal<ThreadContext> contexts = new ThreadLocal<ThreadContext>() {

    /* (non-JavaDoc)
     * @see java.lang.ThreadLocal#initialValue()
     */
    @Override
    protected ThreadContext initialValue() {
      return new ThreadContextImpl();
    }

  };

  public static ThreadContext getThreadContext() {
    return contexts.get();
  }

  public abstract MetaClass getMetaClassFor(Object instance);
  public abstract MetaClass getMetaClassFor(Class<?> type);

  public abstract Object wrap(boolean val);
  public abstract boolean unwrapToBoolean(Object wrapped);

  public abstract Object wrap(char val);
  public abstract char unwrapToChar(Object wrapped);

  public abstract Object wrap(byte val);
  public abstract byte unwrapToByte(Object wrapped);

  public abstract Object wrap(short val);
  public abstract short unwrapToShort(Object wrapped);

  public abstract Object wrap(int val);
  public abstract int unwrapToInt(Object wrapped);

  public abstract Object wrap(long val);
  public abstract long unwrapToLong(Object wrapped);

  public abstract Object wrap(float val);
  public abstract float unwrapToFloat(Object wrapped);

  public abstract Object wrap(double val);
  public abstract double unwrapToDouble(Object wrapped);

  public abstract Misc misc();

  public abstract InterpreterSupport interpreterSupport();

  public abstract ValueAccess propertyAccess();

  public abstract ValueAccess fieldAccess();

  public abstract Coversion convert();

  public abstract BinaryArithmeticOperation add();

  public abstract BinaryArithmeticOperation subtract();

  public abstract BinaryArithmeticOperation multiply();

  public abstract BinaryArithmeticOperation divide();

  public abstract BinaryArithmeticOperation remainderDivide();

  public abstract BinaryArithmeticOperation modulo();

  public abstract BooleanComparison equals();

  public abstract BooleanComparison notEquals();

  public abstract BooleanComparison lessThan();

  public abstract BooleanComparison greaterThan();

  public abstract BooleanComparison lessThanOrEquals();

  public abstract BooleanComparison greaterThanOrEquals();
}
