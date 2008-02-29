package ng.runtime.threadcontext;

import ng.lang.NgRuntimeException;
import ng.runtime.metaclass.MetaClass;

/**
 * @author John
 *
 */
public abstract class ThreadContext {
  private static final ThreadLocal<ThreadContext> contexts = new ThreadLocal<ThreadContext>() {
    private final Class tcClass;
    {
      Class tmp = null;

      try {
        // TODO: get the class name from Property
        tmp = Class.forName("uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContextImpl");
      } catch (ClassNotFoundException e) {
        throw new NgRuntimeException(e);
      }

      this.tcClass = tmp;
    }

    /* (non-JavaDoc)
     * @see java.lang.ThreadLocal#initialValue()
     */
    @Override
    protected ThreadContext initialValue() {
      try {
        return (ThreadContext)this.tcClass.newInstance();
      } catch (InstantiationException e) {
        throw new NgRuntimeException(e);
      } catch (IllegalAccessException e) {
        throw new NgRuntimeException(e);
      }
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

  public abstract ConversionOperation convert();

  public abstract BinaryArithmeticOperation add();

  public abstract BinaryArithmeticOperation subtract();

  public abstract BinaryArithmeticOperation multiply();

  public abstract BinaryArithmeticOperation divide();

  public abstract BinaryArithmeticOperation remainderDivide();

  public abstract BinaryArithmeticOperation modulo();

  public abstract BinaryArithmeticOperation power();

  public abstract BinaryLogicalOperation and();

  public abstract BinaryLogicalOperation or();

  public abstract BinaryLogicalOperation xor();

  public abstract BinaryShiftOperation leftShift();

  public abstract BinaryShiftOperation rightShift();

  public abstract BinaryShiftOperation unsignedRightShift();

  public abstract IntegerComparison compare();

  public abstract BooleanComparison equals();

  public abstract BooleanComparison notEquals();

  public abstract BooleanComparison lessThan();

  public abstract BooleanComparison greaterThan();

  public abstract BooleanComparison lessThanOrEquals();

  public abstract BooleanComparison greaterThanOrEquals();

  public abstract BooleanComparison instanceOf();
}
