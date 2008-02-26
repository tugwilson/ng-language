package uk.co.wilson.ng.runtime.threadcontext;

import java.lang.ref.SoftReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ng.lang.NgRuntimeException;
import ng.runtime.NgBoolean;
import ng.runtime.NgByte;
import ng.runtime.NgChar;
import ng.runtime.NgDouble;
import ng.runtime.NgFloat;
import ng.runtime.NgInt;
import ng.runtime.NgLong;
import ng.runtime.NgObject;
import ng.runtime.NgShort;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.PrimitiveMetaClasses;
import ng.runtime.threadcontext.*;

public class ExtendedThreadContextImpl extends ExtendedThreadContext {
  private static final int getMetaClassModifiers = Modifier.PUBLIC | Modifier.STATIC;

  private static final Map<Class<?>, MetaClass> registry = new HashMap<Class<?>, MetaClass>();

  static {
    registry.put(Object.class, PrimitiveMetaClasses.getObjectMetaClass());
    registry.put(boolean.class, PrimitiveMetaClasses.getBooleanMetaClass());
    registry.put(byte.class, PrimitiveMetaClasses.getByteMetaClass());
    registry.put(char.class, PrimitiveMetaClasses.getCharMetaClass());
    registry.put(short.class, PrimitiveMetaClasses.getShortMetaClass());
    registry.put(int.class, PrimitiveMetaClasses.getIntMetaClass());
    registry.put(long.class, PrimitiveMetaClasses.getLongMetaClass());
    registry.put(float.class, PrimitiveMetaClasses.getFloatMetaClass());
    registry.put(double.class, PrimitiveMetaClasses.getDoubleMetaClass());
    registry.put(BigInteger.class, PrimitiveMetaClasses.getBigIntegerMetaClass());
    registry.put(BigDecimal.class, PrimitiveMetaClasses.getBigDecimalMetaClass());
    registry.put(String.class, PrimitiveMetaClasses.getStringMetaClass());
  }

  private final Map<Class<?>, MetaClass> registryCache = new Map<Class<?>, MetaClass>() {
    private final Map<Class<?>, SoftReference<MetaClass>> innerRegistryCache = new HashMap<Class<?>, SoftReference<MetaClass>>();

    /**
     *
     * @see java.util.Map#clear()
     */
    public void clear() {
      this.innerRegistryCache.clear();
    }

    /**
     * @param key
     * @return
     * @see java.util.Map#containsKey(java.lang.Object)
     */
    public boolean containsKey(Object key) {
      return this.innerRegistryCache.containsKey(key);
    }

    /**
     * @param value
     * @return
     * @see java.util.Map#containsValue(java.lang.Object)
     */
    public boolean containsValue(Object value) {
      return this.innerRegistryCache.containsValue(value);
    }

    /**
     * @return
     * @see java.util.Map#entrySet()
     */
    public Set<Entry<Class<?>, MetaClass>> entrySet() {
    final Set<Entry<Class<?>, MetaClass>> result = new HashSet<Entry<Class<?>,MetaClass>>();
    final Set<Entry<Class<?>, SoftReference<MetaClass>>> wrapped = this.innerRegistryCache.entrySet();

      for (final Iterator<Entry<Class<?>, SoftReference<MetaClass>>> iterator = wrapped.iterator(); iterator.hasNext();) {
      final Entry<Class<?>, SoftReference<MetaClass>> entry = iterator.next();

        result.add(new Entry<Class<?>, MetaClass>() {
          public Class<?> getKey() {
            return entry.getKey();
          }

          public MetaClass getValue() {
             return entry.getValue().get();
          }

          public MetaClass setValue(final MetaClass value) {
            return entry.setValue(new SoftReference<MetaClass>(value)).get();
          }
        });
      }

      return result;
    }

    /**
     * @param o
     * @return
     * @see java.util.Map#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object o) {
      return this.innerRegistryCache.equals(o);
    }

    /**
     * @param key
     * @return
     * @see java.util.Map#get(java.lang.Object)
     */
    public MetaClass get(Object key) {
     final SoftReference<MetaClass> ref = this.innerRegistryCache.get(key);

       if (ref == null) {
         return null;
       } else {
         return ref.get();
       }
    }

    /**
     * @return
     * @see java.util.Map#hashCode()
     */
    @Override
    public int hashCode() {
      return this.innerRegistryCache.hashCode();
    }

    /**
     * @return
     * @see java.util.Map#isEmpty()
     */
    public boolean isEmpty() {
      return this.innerRegistryCache.isEmpty();
    }

    /**
     * @return
     * @see java.util.Map#keySet()
     */
    public Set<Class<?>> keySet() {
      return this.innerRegistryCache.keySet();
    }

    /**
     * @param key
     * @param value
     * @return
     * @see java.util.Map#put(java.lang.Object, java.lang.Object)
     */
    public MetaClass put(Class<?> key, MetaClass value) {
      final SoftReference<MetaClass> result =  this.innerRegistryCache.put(key, new SoftReference<MetaClass>(value));

      if (result == null) {
        return null;
      } else {
        return result.get();
      }
    }

    /**
     * @param m
     * @see java.util.Map#putAll(java.util.Map)
     */
    public void putAll(Map<? extends Class<?>, ? extends MetaClass> m) {
      for (final Iterator<? extends Class<?>> iterator = m.keySet().iterator(); iterator.hasNext();) {
      final Class<?> key = iterator.next();

        this.innerRegistryCache.put(key, new SoftReference<MetaClass>(m.get(key)));
      }
    }

    /**
     * @param key
     * @return
     * @see java.util.Map#remove(java.lang.Object)
     */
    public MetaClass remove(Object key) {
      return this.innerRegistryCache.remove(key).get();
    }

    /**
     * @return
     * @see java.util.Map#size()
     */
    public int size() {
      return this.innerRegistryCache.size();
    }

    /**
     * @return
     * @see java.util.Map#values()
     */
    public Collection<MetaClass> values() {
    final Collection<SoftReference<MetaClass>> values = this.innerRegistryCache.values();
    final Set<MetaClass> result = new HashSet<MetaClass>();

      for (final Iterator<SoftReference<MetaClass>> iterator = values.iterator(); iterator.hasNext();) {
        result.add(iterator.next().get());
      }

      return result;
    }
  };

  private final Object[] p1 = new Object[1];
  private final Object[] p2 = new Object[2];
  private final Object[] p3 = new Object[3];
  private final Object[] p4 = new Object[4];
  private final Object[] p5 = new Object[5];

  private final Misc misc = new BaseMisc(this);

  private final InterpreterSupport interpreterSupport = null;  // TODO: implement this

  private final ValueAccess propertyAccess = null;  // TODO: implement this

  private final ValueAccess fieldAccess = null;  // TODO: implement this

  private final ConversionOperation convert = new BaseConversion(this);

  private final StaticMethodCall staticMethodCall = new CallStaticMethod(this);

  private final BinaryArithmeticOperation add = new Add(this);

  private final BinaryArithmeticOperation subtract = new Subtract(this);

  private final BinaryArithmeticOperation mutiply = new Multiply(this);

  private final BinaryArithmeticOperation divide = new Divide(this);

  private final BinaryArithmeticOperation remainderDivide = new RemainderDivide(this);

  private final BinaryArithmeticOperation modulo = new Modulo(this);

  private final BinaryArithmeticOperation power = new Power(this);

  private final IntegerComparison compare = new Compare(this);

  private final BooleanComparison equals = new Equals(this);

  private final BooleanComparison notEquals = new NotEquals(this);

  private final BooleanComparison lessThan = new LessThan(this);

  private final BooleanComparison greaterThan = new GreaterThan(this);

  private final BooleanComparison lessThanOrEquals = new LessThanOrEquals(this);

  private final BooleanComparison greaterThanOrEquals = new GreaterThanOrEquals(this);

  @Override
  public MetaClass getMetaClassFor(final Object instance) {
    if (instance instanceof NgObject) {
      return ((NgObject)instance).getMetaClass();
    } else if (instance == null) {
      return null;  // TODO: return the Null MetaClass
    } else {
      return getMetaClassFor(instance.getClass());
    }
  }

  @Override
  public MetaClass getMetaClassFor(final Class<?> type) {
    //
    // First try and get the MetaClass from the thread local registry cache
    // This does not need any synchronisation
    //
    MetaClass metaClass = this.registryCache.get(type);

    if (metaClass == null) {
      //
      // If the class has a static method get$MetaClass then use this to get the MetaClass
      //
      try {
      final Method getMetaClass = type.getMethod("get$MetaClass", (Class<?>[])null);

        try {
          getMetaClass.setAccessible(true);
        } catch (final SecurityException e) {
        }

        if (getMetaClass.getDeclaringClass() == type &&
            (getMetaClass.getModifiers() & getMetaClassModifiers) == getMetaClassModifiers &&
            getMetaClass.getReturnType().isAssignableFrom(MetaClass.class)) {

          metaClass = (MetaClass)getMetaClass.invoke(null, (Object[])null);
        }
      } catch (final SecurityException e) {
      } catch (final IllegalArgumentException e) {
      } catch (final IllegalAccessException e) {
      } catch (final InvocationTargetException e) {
      } catch (final NoSuchMethodException e) {
      }

      if (metaClass == null) {
        //
        // If it's not in the thread local cache then synchronise against the class
        // and get it from the global registry, put it in the thread local cache and
        // return it
        //
        // If it's not in the global registry then create it and put it in the
        // global registry and in the thread local cache and return it.
        //
        synchronized (ExtendedThreadContextImpl.class) {
          metaClass = registry.get(type);

          if (metaClass == null) {
          final Class<?> superClass = type.getSuperclass();

            if (superClass == null) {
              //
              // It's an Interface
              //
              metaClass = PrimitiveMetaClasses.getObjectMetaClass().createMetaClassFor(type);
            } else {
              metaClass = getMetaClassFor(superClass).createMetaClassFor(type);
            }

            registry.put(type, metaClass);
          }
        }
      }

      //
      // Put the MetaClass in the thread local cache to speed up subsequent fetches
      //
      this.registryCache.put(type, metaClass);
    }

    return metaClass;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.ThreadContext#wrap(boolean)
   */
  @Override
  public Object wrap(final boolean val) {
    return NgBoolean.valueOf(val);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.ThreadContext#unwrapToBoolean(java.lang.Object)
   */
  @Override
  public boolean unwrapToBoolean(final Object wrapped) {
    final NgBoolean ngBoolean;

    try {
      ngBoolean = ((NgBoolean)wrapped);
    } catch (final ClassCastException e) {
      throw new NgRuntimeException("Attempted to unwrap a char from an object of type " + wrapped.getClass().getName());
    }

    return ngBoolean.getBooleanValue();
  }

  /* (non-JavaDoc)
   * @see ng.runtime.ThreadContext#wrap(char)
   */
  @Override
  public Object wrap(final char val) {
    return NgChar.valueOf(val);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.ThreadContext#unwrapToChar(java.lang.Object)
   */
  @Override
  public char unwrapToChar(final Object wrapped) {
    final NgChar ngChar;

    try {
      ngChar = ((NgChar)wrapped);
    } catch (final ClassCastException e) {
      throw new NgRuntimeException("Attempted to unwrap a char from an object of type " + wrapped.getClass().getName());
    }

    return ngChar.getCharValue();
  }

  /* (non-JavaDoc)
   * @see ng.runtime.ThreadContext#wrap(byte)
   */
  @Override
  public Object wrap(final byte val) {
    return NgByte.valueOf(val);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.ThreadContext#unwrapToByte(java.lang.Object)
   */
  @Override
  public byte unwrapToByte(final Object wrapped) {
    final NgByte ngByte;

    try {
      ngByte = ((NgByte)wrapped);
    } catch (final ClassCastException e) {
      throw new NgRuntimeException("Attempted to unwrap a byte from an object of type " + wrapped.getClass().getName());
    }

    return ngByte.getByteValue();
  }

  /* (non-JavaDoc)
   * @see ng.runtime.ThreadContext#wrap(short)
   */
  @Override
  public Object wrap(final short val) {
    return NgShort.valueOf(val);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.ThreadContext#unwrapToShort(java.lang.Object)
   */
  @Override
  public short unwrapToShort(final Object wrapped) {
    final NgShort ngShort;

    try {
      ngShort = ((NgShort)wrapped);
    } catch (final ClassCastException e) {
      throw new NgRuntimeException("Attempted to unwrap a short from an object of type " + wrapped.getClass().getName());
    }

    return ngShort.getShortValue();
  }

  /* (non-JavaDoc)
   * @see ng.runtime.ThreadContext#wrap(int)
   */
  @Override
  public Object wrap(final int val) {
    return NgInt.valueOf(val);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.ThreadContext#unwrapToInt(java.lang.Object)
   */
  @Override
  public int unwrapToInt(final Object wrapped) {
    final NgInt ngInt;

    try {
      ngInt = ((NgInt)wrapped);
    } catch (final ClassCastException e) {
      throw new NgRuntimeException("Attempted to unwrap an int from an object of type " + wrapped.getClass().getName());
    }

    return ngInt.getIntValue();
  }

  /* (non-JavaDoc)
   * @see ng.runtime.ThreadContext#wrap(long)
   */
  @Override
  public Object wrap(final long val) {
    return NgLong.valueOf(val);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.ThreadContext#unwrapToLong(java.lang.Object)
   */
  @Override
  public long unwrapToLong(final Object wrapped) {
    final NgLong ngLong;

    try {
      ngLong = ((NgLong)wrapped);
    } catch (final ClassCastException e) {
      throw new NgRuntimeException("Attempted to unwrap a long from an object of type " + wrapped.getClass().getName());
    }

    return ngLong.getLongValue();
  }

  /* (non-JavaDoc)
   * @see ng.runtime.ThreadContext#wrap(float)
   */
  @Override
  public Object wrap(final float val) {
    return NgFloat.valueOf(val);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.ThreadContext#unwrapToFloat(java.lang.Object)
   */
  @Override
  public float unwrapToFloat(final Object wrapped) {
    final NgFloat ngFloat;

    try {
      ngFloat = ((NgFloat)wrapped);
    } catch (final ClassCastException e) {
      throw new NgRuntimeException("Attempted to unwrap a float from an object of type " + wrapped.getClass().getName());
    }

    return ngFloat.getFloatValue();
  }

  /* (non-JavaDoc)
   * @see ng.runtime.ThreadContext#wrap(double)
   */
  @Override
  public Object wrap(final double val) {
    return NgDouble.valueOf(val);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.ThreadContext#unwrapToDouble(java.lang.Object)
   */
  @Override
  public double unwrapToDouble(final Object wrapped) {
    final NgDouble ngDouble;

    try {
      ngDouble = ((NgDouble)wrapped);
    } catch (final ClassCastException e) {
      throw new NgRuntimeException("Attempted to unwrap a double from an object of type " + wrapped.getClass().getName());
    }

    return ngDouble.getDoubleValue();
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#prepareThreadContextAndParameters(java.lang.Object)
   */
  @Override
  public Object[] prepareThreadContextAndParameters() {
    this.p1[0] = this;
    return this.p1;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#prepareParameters(java.lang.Object)
   */
  @Override
  public Object[] prepareParameters(final Object p1) {
    this.p1[0] = p1;
    return this.p1;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#prepareThreadContextAndParameters(java.lang.Object)
   */
  @Override
  public Object[] prepareThreadContextAndParameters(final Object p1) {
    this.p2[0] = this;
    this.p2[1] = p1;
    return this.p2;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#prepareParameters(java.lang.Object, java.lang.Object)
   */
  @Override
  public Object[] prepareParameters(final Object p1, final Object p2) {
    this.p2[0] = p1;
    this.p2[1] = p2;
    return this.p2;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#prepareThreadContextAndParameters(java.lang.Object, java.lang.Object)
   */
  @Override
  public Object[] prepareThreadContextAndParameters(final Object p1, final Object p2) {
    this.p3[0] = this;
    this.p3[1] = p1;
    this.p3[2] = p2;
    return this.p3;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#prepareParameters(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object[] prepareParameters(final Object p1, final Object p2, final Object p3) {
    this.p3[0] = p1;
    this.p3[1] = p2;
    this.p3[2] = p3;
    return this.p3;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#prepareThreadContextAndParameters(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object[] prepareThreadContextAndParameters(final Object p1, final Object p2, final Object p3) {
    this.p4[0] = this;
    this.p4[1] = p1;
    this.p4[2] = p2;
    this.p4[3] = p3;
    return this.p4;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#prepareParameters(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object[] prepareParameters(final Object p1, final Object p2, final Object p3, final Object p4) {
    this.p4[0] = p1;
    this.p4[1] = p2;
    this.p4[2] = p3;
    this.p4[3] = p4;
    return this.p4;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#prepareThreadContextAndParameters(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object[] prepareThreadContextAndParameters(final Object p1, final Object p2, final Object p3, final Object p4) {
    this.p5[0] = this;
    this.p5[1] = p1;
    this.p5[2] = p2;
    this.p5[3] = p3;
    this.p5[4] = p4;
    return this.p5;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#misc()
   */
  @Override
  public Misc misc() {
    return this.misc;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#interpreterSupport()
   */
  @Override
  public InterpreterSupport interpreterSupport() {
    return this.interpreterSupport;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#staticMethodCall()
   */
  @Override
  public StaticMethodCall staticMethodCall() {
    return this.staticMethodCall;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#propertyAccess()
   */
  @Override
  public ValueAccess propertyAccess() {
    return this.propertyAccess;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#fieldAccess()
   */
  @Override
  public ValueAccess fieldAccess() {
    return this.fieldAccess;
  }

  @Override
  public ConversionOperation convert() {
    return this.convert;
  }

  @Override
  public BinaryArithmeticOperation add() {
    return this.add;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#subtract()
   */
  @Override
  public BinaryArithmeticOperation subtract() {
    return this.subtract;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#multiply()
   */
  @Override
  public BinaryArithmeticOperation multiply() {
    return this.mutiply;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#divide()
   */
  @Override
  public BinaryArithmeticOperation divide() {
    return this.divide;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#remainderDivide()
   */
  @Override
  public BinaryArithmeticOperation remainderDivide() {
    return this.remainderDivide;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#modulo()
   */
  @Override
  public BinaryArithmeticOperation modulo() {
    return this.modulo;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#power()
   */
  @Override
  public BinaryArithmeticOperation power() {
    return this.power;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#leftShift()
   */
  @Override
  public ShiftOperation leftShift() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#rightShift()
   */
  @Override
  public ShiftOperation rightShift() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#unsignedRightShift()
   */
  @Override
  public ShiftOperation unsignedRightShift() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#and()
   */
  @Override
  public BinaryLogicalOperation and() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#or()
   */
  @Override
  public BinaryLogicalOperation or() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#xor()
   */
  @Override
  public BinaryLogicalOperation xor() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#compare()
   */
  @Override
  public IntegerComparison compare() {
    return this.compare;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#instanceOf()
   */
  @Override
  public BooleanComparison instanceOf() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public BooleanComparison equals() {
    return this.equals;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#notEquals()
   */
  @Override
  public BooleanComparison notEquals() {
    return this.notEquals;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#lessThan()
   */
  @Override
  public BooleanComparison lessThan() {
    return this.lessThan;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#greaterThan()
   */
  @Override
  public BooleanComparison greaterThan() {
    return this.greaterThan;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#lessThanOrEquals()
   */
  @Override
  public BooleanComparison lessThanOrEquals() {
    return this.lessThanOrEquals;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.ThreadContext#greaterThanOrEquals()
   */
  @Override
  public BooleanComparison greaterThanOrEquals() {
    return this.greaterThanOrEquals;
  }
}
