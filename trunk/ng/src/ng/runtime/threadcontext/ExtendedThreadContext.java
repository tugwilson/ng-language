package ng.runtime.threadcontext;



public abstract class ExtendedThreadContext extends ThreadContext {
  public static final Object NOT_PERFORMED = new Object();
  public static final NotPerformed NOT_PERFORMED_EXCEPTION = new NotPerformed() {
    private static final long serialVersionUID = 1L;
  };

  //
  // Utility Methods
  //

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
