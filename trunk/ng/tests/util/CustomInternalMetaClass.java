package util;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.Callable;
import ng.runtime.ThreadContext;
import uk.co.wilson.ng.lang.ClosureImpl;
import uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl;

/**
 * @author John
 *
 */
public class CustomInternalMetaClass extends InternalMetaClassImpl {
  private final Callable callable = new ClosureImpl(null) {

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#call(java.lang.Object, java.lang.Object[])
     */
    @Override
    public Object call(Object instance, Object[] arguments) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object[])
     */
    @Override
    public Object call(ThreadContext tc, Object instance, Object[] arguments) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(java.lang.Object, java.math.BigDecimal)
     */
    @Override
    public Object callQuick(Object instance, BigDecimal p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(java.lang.Object, java.math.BigInteger)
     */
    @Override
    public Object callQuick(Object instance, BigInteger p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(java.lang.Object, boolean)
     */
    @Override
    public Object callQuick(Object instance, boolean p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(java.lang.Object, byte)
     */
    @Override
    public Object callQuick(Object instance, byte p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(java.lang.Object, char)
     */
    @Override
    public Object callQuick(Object instance, char p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(java.lang.Object, double)
     */
    @Override
    public Object callQuick(Object instance, double p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(java.lang.Object, float)
     */
    @Override
    public Object callQuick(Object instance, float p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(java.lang.Object, int)
     */
    @Override
    public Object callQuick(Object instance, int p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(java.lang.Object, long)
     */
    @Override
    public Object callQuick(Object instance, long p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
     */
    @Override
    public Object callQuick(Object instance, Object p1, Object p2, Object p3, Object p4) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
     */
    @Override
    public Object callQuick(Object instance, Object p1, Object p2, Object p3) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(java.lang.Object, java.lang.Object, java.lang.Object)
     */
    @Override
    public Object callQuick(Object instance, Object p1, Object p2) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(java.lang.Object, java.lang.Object)
     */
    @Override
    public Object callQuick(Object instance, Object p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(java.lang.Object, short)
     */
    @Override
    public Object callQuick(Object instance, short p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(java.lang.Object)
     */
    @Override
    public Object callQuick(Object instance) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.math.BigDecimal)
     */
    @Override
    public Object callQuick(ThreadContext tc, Object instance, BigDecimal p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.math.BigInteger)
     */
    @Override
    public Object callQuick(ThreadContext tc, Object instance, BigInteger p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(ng.runtime.ThreadContext, java.lang.Object, boolean)
     */
    @Override
    public Object callQuick(ThreadContext tc, Object instance, boolean p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(ng.runtime.ThreadContext, java.lang.Object, byte)
     */
    @Override
    public Object callQuick(ThreadContext tc, Object instance, byte p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(ng.runtime.ThreadContext, java.lang.Object, char)
     */
    @Override
    public Object callQuick(ThreadContext tc, Object instance, char p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(ng.runtime.ThreadContext, java.lang.Object, double)
     */
    @Override
    public Object callQuick(ThreadContext tc, Object instance, double p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(ng.runtime.ThreadContext, java.lang.Object, float)
     */
    @Override
    public Object callQuick(ThreadContext tc, Object instance, float p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(ng.runtime.ThreadContext, java.lang.Object, int)
     */
    @Override
    public Object callQuick(ThreadContext tc, Object instance, int p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(ng.runtime.ThreadContext, java.lang.Object, long)
     */
    @Override
    public Object callQuick(ThreadContext tc, Object instance, long p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
     */
    @Override
    public Object callQuick(ThreadContext tc, Object instance, Object p1, Object p2, Object p3, Object p4) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
     */
    @Override
    public Object callQuick(ThreadContext tc, Object instance, Object p1, Object p2, Object p3) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object)
     */
    @Override
    public Object callQuick(ThreadContext tc, Object instance, Object p1, Object p2) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
     */
    @Override
    public Object callQuick(ThreadContext tc, Object instance, Object p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(ng.runtime.ThreadContext, java.lang.Object, short)
     */
    @Override
    public Object callQuick(ThreadContext tc, Object instance, short p1) throws Throwable {
      return null;
    }

    /* (non-Javadoc)
     * @see uk.co.wilson.ng.lang.ClosureImpl#callQuick(ng.runtime.ThreadContext, java.lang.Object)
     */
    @Override
    public Object callQuick(ThreadContext tc, Object instance) throws Throwable {
      return null;
    }
  };
  
  /**
   * @param theClass
   */
  public CustomInternalMetaClass(final Class theClass) {
    super(theClass);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doGetCallable(java.lang.Object)
   */
  @Override
  public Callable doGetCallable(final Object instance) {
    return this.callable;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doInvokeMethod(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object[])
   */
  @Override
  public Object doInvokeMethod(final ThreadContext tc, final Object instance, final String methodName, final Object[] arguments) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.math.BigDecimal)
   */
  @Override
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final BigDecimal p1) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.math.BigInteger)
   */
  @Override
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final BigInteger p1) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, boolean)
   */
  @Override
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final boolean p1) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, byte)
   */
  @Override
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final byte p1) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, char)
   */
  @Override
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final char p1) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, double)
   */
  @Override
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final double p1) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, float)
   */
  @Override
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final float p1) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, int)
   */
  @Override
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final int p1) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, long)
   */
  @Override
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final long p1) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final Object p1, final Object p2, final Object p3) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final Object p1, final Object p2) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object)
   */
  @Override
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final Object p1) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, short)
   */
  @Override
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName, final short p1) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doInvokeMethodQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.String)
   */
  @Override
  public Object doInvokeMethodQuick(final ThreadContext tc, final Object instance, final String methodName) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doGetField(ng.runtime.ThreadContext, java.lang.Object, java.lang.String)
   */
  @Override
  public Object doGetField(final ThreadContext tc, final Object instance, final String fieldName) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doGetProperty(ng.runtime.ThreadContext, java.lang.Object, java.lang.String)
   */
  @Override
  public Object doGetProperty(final ThreadContext tc, final Object instance, final String propertyName) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doSetField(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object)
   */
  @Override
  public Object doSetField(final ThreadContext tc, final Object instance, final String fieldName, final Object newValue) throws Throwable {
    return null;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseInternalMetaClassImpl#doSetProperty(ng.runtime.ThreadContext, java.lang.Object, java.lang.String, java.lang.Object)
   */
  @Override
  public Object doSetProperty(final ThreadContext tc, final Object instance, final String propertyName, final Object newValue) throws Throwable {
    return null;
  }
}
