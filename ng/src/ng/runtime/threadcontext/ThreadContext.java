package ng.runtime.threadcontext;

import ng.runtime.metaclass.MetaClass;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContextImpl;

/**
 * @author John
 *
 */
public abstract class ThreadContext {
  private static final ThreadLocal<ThreadContext> contexts = new ThreadLocal<ThreadContext>() {

    /* (non-JavaDoc)
     * @see java.lang.ThreadLocal#initialValue()
     */
    @Override
    protected ThreadContext initialValue() {
      return new ExtendedThreadContextImpl();
    }

  };

  public static ThreadContext getThreadContext() {
    return contexts.get();
  }
  
  public abstract MetaClass getMetaClassFor(Object instance);
  public abstract MetaClass getMetaClassFor(Class<?> type);

  //
  // Select Message Types
  //
  public abstract Misc misc();

  public abstract InterpreterSupport interpreterSupport();

  public abstract StaticMethodCall staticMethodCall();

  public abstract ValueAccess propertyAccess();

  public abstract ValueAccess fieldAccess();

  public abstract Coversion convert();

  public abstract BinaryArithmeticOperation add();

  public abstract BinaryArithmeticOperation subtract();

  public abstract BinaryArithmeticOperation multiply();

  public abstract BinaryArithmeticOperation divide();

  public abstract BinaryArithmeticOperation remainderDivide();

  public abstract BinaryArithmeticOperation modulo();

  public abstract BinaryArithmeticOperation power();

  public abstract BooleanComparison equals();

  public abstract BooleanComparison notEquals();

  public abstract BooleanComparison lessThan();

  public abstract BooleanComparison greaterThan();

  public abstract BooleanComparison lessThanOrEquals();

  public abstract BooleanComparison greaterThanOrEquals();
}
