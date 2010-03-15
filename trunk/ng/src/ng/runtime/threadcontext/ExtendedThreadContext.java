package ng.runtime.threadcontext;

public abstract class ExtendedThreadContext extends ThreadContext {
  public static final Object NOT_PERFORMED = new Object();

  public static final NotPerformed NOT_PERFORMED_EXCEPTION = NotPerformed.instance;

  //
  // Utility Methods
  //

  public abstract boolean unwrapToBoolean(Object wrapped);

  public abstract char unwrapToChar(Object wrapped);

  public abstract byte unwrapToByte(Object wrapped);

  public abstract short unwrapToShort(Object wrapped);

  public abstract int unwrapToInt(Object wrapped);

  public abstract long unwrapToLong(Object wrapped);

  public abstract float unwrapToFloat(Object wrapped);

  public abstract double unwrapToDouble(Object wrapped);

  public abstract Object[] prepareThreadContextAndParameters();

  public abstract Object[] prepareParameters(Object p1);

  public abstract Object[] prepareThreadContextAndParameters(Object p1);

  public abstract Object[] prepareParameters(Object p1, Object p2);

  public abstract Object[] prepareThreadContextAndParameters(Object p1, Object p2);

  public abstract Object[] prepareParameters(Object p1, Object p2, Object p3);

  public abstract Object[] prepareThreadContextAndParameters(Object p1, Object p2, Object p3);

  public abstract Object[] prepareParameters(Object p1, Object p2, Object p3, Object p4);

  public abstract Object[] prepareThreadContextAndParameters(Object p1, Object p2, Object p3, Object p4);
}
