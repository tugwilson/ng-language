package uk.co.wilson.ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.NgRuntimeException;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.Coversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public class BaseConversion implements Coversion {
  private final ThreadContext tc;

  public BaseConversion(final ThreadContext tc) {
    this.tc = tc;
  }

  public boolean asBoolean(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsBoolean(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to boolean");
    }
  }

  public boolean asBoolean(final Object instance) {
    return asBoolean(this.tc.getMetaClassFor(instance), instance);
  }

  public char asChar(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsChar(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to char");
    }
  }

  public char asChar(final Object instance) {
    return asChar(this.tc.getMetaClassFor(instance), instance);
  }

  public byte asByte(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsByte(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to byte");
    }
  }

  public byte asByte(final Object instance) {
    return asByte(this.tc.getMetaClassFor(instance), instance);
  }

  public short asShort(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsShort(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to short");
    }
  }

  public short asShort(final Object instance) {
    return asShort(this.tc.getMetaClassFor(instance), instance);
  }

  public int asInt(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsInt(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to int");
    }
  }

  public int asInt(final Object instance) {
    return asInt(this.tc.getMetaClassFor(instance), instance);
  }

  public long asLong(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsLong(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to long");
    }
  }

  public long asLong(final Object instance) {
    return asLong(this.tc.getMetaClassFor(instance), instance);
  }

  public float asFloat(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsFloat(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to float");
    }
  }

  public float asFloat(final Object instance) {
    return asFloat(this.tc.getMetaClassFor(instance), instance);
  }

  public double asDouble(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsDouble(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to double");
    }
  }

  public double asDouble(final Object instance) {
    return asDouble(this.tc.getMetaClassFor(instance), instance);
  }

  public BigInteger asBigInteger(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsBigInteger(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to BigInteger");
    }
  }

  public BigInteger asBigInteger(final Object instance) {
    return asBigInteger(this.tc.getMetaClassFor(instance), instance);
  }

  public BigDecimal asBigDecimal(final MetaClass metaClass, final Object instance) {
    try {
      return metaClass.convert().doAsBigDecimal(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to BigDecimal");
    }
  }

  public BigDecimal asBigDecimal(final Object instance) {
    return asBigDecimal(this.tc.getMetaClassFor(instance), instance);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.Coversion#asString(ng.runtime.metaclass.MetaClass, java.lang.Object)
   */
  public String asString(MetaClass metaClass, Object instance) {
    try {
      return metaClass.convert().doAsString(this.tc, instance);
    } catch (final NotPerformed e) {
      throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to String");
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.Coversion#asString(java.lang.Object)
   */
  public String asString(Object instance) {
    return asString(this.tc.getMetaClassFor(instance), instance);
  }

  public Object asType(final MetaClass metaClass, final Object instance, final Object type) {
    Object result;

    if (type instanceof Class) {
      try {
        if (type == boolean.class) {
          return this.tc.wrap(metaClass.convert().doAsBoolean(this.tc, instance));
        } else if (type == char.class) {
          return this.tc.wrap(metaClass.convert().doAsChar(this.tc, instance));
        } else if (type == byte.class) {
          return this.tc.wrap(metaClass.convert().doAsByte(this.tc, instance));
        } else if (type == short.class) {
          return this.tc.wrap(metaClass.convert().doAsShort(this.tc, instance));
        } else if (type == int.class) {
          return this.tc.wrap(metaClass.convert().doAsInt(this.tc, instance));
        } else if (type == long.class) {
          return this.tc.wrap(metaClass.convert().doAsLong(this.tc, instance));
        } else if (type == float.class) {
          return this.tc.wrap(metaClass.convert().doAsFloat(this.tc, instance));
        } else if (type == double.class) {
          return this.tc.wrap(metaClass.convert().doAsDouble(this.tc, instance));
        } else if (type == BigInteger.class) {
          return metaClass.convert().doAsBigInteger(this.tc, instance);
        } else if (type == BigDecimal.class) {
          return metaClass.convert().doAsBigDecimal(this.tc, instance);
        } else {
          result = metaClass.convert().doAsType(this.tc, instance, (Class<?>)type);
        }
      } catch (final NotPerformed e) {
        result = ThreadContext.NOT_PERFORMED;
      }

      if (result == ThreadContext.NOT_PERFORMED) {
        throw new NgRuntimeException("Value of type " + instance.getClass().getName() + " cannot be converted to " + ((Class<?>)type).getName());
      } else {
        return result;
      }
    } else {
      throw new NgRuntimeException("The target type for an as operation is " + type.getClass() + " it should be a Class" );
    }
  }

  public Object asType(final Object instance, final Object type) {
    return asType(this.tc.getMetaClassFor(type), instance, type);
 }
}