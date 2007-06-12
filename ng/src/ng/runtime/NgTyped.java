package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.NgRuntimeException;
import ng.lang.NgSystem;
import uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection;

/**
 * @author tug
 * 
 * This is a wrapper object for use when an object is explicity typed.
 *
 */
public class NgTyped extends NgBaseObject {
  public NgTyped(final Object instance, final Class type) {
    super(new NgTypedMetaClass(instance, type));
  }
}

class NgTypedMetaClass implements RuntimeMetaClass {
private final Object instance;
private final Class type;
private final RuntimeMetaClass delegate;
  
  public NgTypedMetaClass(final Object instance, final Class type) {
    this.instance = instance;
    this.type = type;
    this.delegate = NgSystem.metaClassRegistry.getMetaClass(instance).getMetaClassFor(type).getRuntimeMetaClass();
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#getParamObject(java.lang.Object, java.lang.Class)
   */
  public Object getParamObject(final Object instance, final Class theClass) {
    return this.delegate.getParamObject(this.instance, theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getMetaClassFor(java.lang.Class)
   */
  public MetaClass getMetaClassFor(final Class theClass) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getRuntimeMetaClass()
   */
  public RuntimeMetaClass getRuntimeMetaClass() {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object add(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object add(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, byte)
   */
  public Object add(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, char)
   */
  public Object add(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, double)
   */
  public Object add(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, float)
   */
  public Object add(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, int)
   */
  public Object add(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, long)
   */
  public Object add(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, short)
   */
  public Object add(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object add(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, java.math.BigInteger)
   */
  public Object add(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, byte)
   */
  public Object add(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, char)
   */
  public Object add(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, double)
   */
  public Object add(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, float)
   */
  public Object add(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, int)
   */
  public Object add(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, long)
   */
  public Object add(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, short)
   */
  public Object add(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, java.math.BigDecimal)
   */
  public Object add(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, java.math.BigInteger)
   */
  public Object add(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, byte)
   */
  public Object add(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, char)
   */
  public Object add(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, double)
   */
  public Object add(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, float)
   */
  public Object add(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, int)
   */
  public Object add(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, long)
   */
  public Object add(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, short)
   */
  public Object add(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, java.math.BigDecimal)
   */
  public Object add(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, java.math.BigInteger)
   */
  public Object add(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, byte)
   */
  public Object add(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, char)
   */
  public Object add(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, double)
   */
  public Object add(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, float)
   */
  public Object add(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, int)
   */
  public Object add(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, long)
   */
  public Object add(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, short)
   */
  public Object add(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, java.math.BigDecimal)
   */
  public Object add(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, java.math.BigInteger)
   */
  public Object add(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, byte)
   */
  public Object add(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, char)
   */
  public Object add(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, double)
   */
  public Object add(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, float)
   */
  public Object add(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, int)
   */
  public Object add(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, long)
   */
  public Object add(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, short)
   */
  public Object add(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, java.math.BigDecimal)
   */
  public Object add(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, java.math.BigInteger)
   */
  public Object add(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, byte)
   */
  public Object add(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, char)
   */
  public Object add(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, double)
   */
  public Object add(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, float)
   */
  public Object add(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, int)
   */
  public Object add(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, long)
   */
  public Object add(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, short)
   */
  public Object add(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, java.math.BigDecimal)
   */
  public Object add(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, java.math.BigInteger)
   */
  public Object add(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, byte)
   */
  public Object add(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, char)
   */
  public Object add(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, double)
   */
  public Object add(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, float)
   */
  public Object add(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, int)
   */
  public Object add(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, long)
   */
  public Object add(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, short)
   */
  public Object add(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, java.math.BigDecimal)
   */
  public Object add(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, java.math.BigInteger)
   */
  public Object add(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, byte)
   */
  public Object add(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, char)
   */
  public Object add(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, double)
   */
  public Object add(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, float)
   */
  public Object add(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, int)
   */
  public Object add(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, long)
   */
  public Object add(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, short)
   */
  public Object add(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, java.math.BigDecimal)
   */
  public Object add(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, java.math.BigInteger)
   */
  public Object add(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, byte)
   */
  public Object add(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, char)
   */
  public Object add(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, double)
   */
  public Object add(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, float)
   */
  public Object add(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, int)
   */
  public Object add(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, long)
   */
  public Object add(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param operand
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#add(java.lang.Object, java.lang.Object)
   */
  public Object add(final Object operand, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, short)
   */
  public Object add(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, java.math.BigDecimal)
   */
  public Object add(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, java.math.BigInteger)
   */
  public Object add(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, byte)
   */
  public Object add(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, char)
   */
  public Object add(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, double)
   */
  public Object add(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, float)
   */
  public Object add(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, int)
   */
  public Object add(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, long)
   */
  public Object add(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, short)
   */
  public Object add(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object addEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object addEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, byte)
   */
  public Object addEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, char)
   */
  public Object addEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, double)
   */
  public Object addEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, float)
   */
  public Object addEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, int)
   */
  public Object addEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, long)
   */
  public Object addEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, short)
   */
  public Object addEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object addEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object addEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, byte)
   */
  public Object addEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, char)
   */
  public Object addEquals(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, double)
   */
  public Object addEquals(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, float)
   */
  public Object addEquals(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, int)
   */
  public Object addEquals(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, long)
   */
  public Object addEquals(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, short)
   */
  public Object addEquals(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, java.math.BigDecimal)
   */
  public Object addEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, java.math.BigInteger)
   */
  public Object addEquals(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, byte)
   */
  public Object addEquals(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, char)
   */
  public Object addEquals(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, double)
   */
  public Object addEquals(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, float)
   */
  public Object addEquals(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, int)
   */
  public Object addEquals(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, long)
   */
  public Object addEquals(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, short)
   */
  public Object addEquals(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, java.math.BigDecimal)
   */
  public Object addEquals(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, java.math.BigInteger)
   */
  public Object addEquals(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, byte)
   */
  public Object addEquals(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, char)
   */
  public Object addEquals(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, double)
   */
  public Object addEquals(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, float)
   */
  public Object addEquals(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, int)
   */
  public Object addEquals(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, long)
   */
  public Object addEquals(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, short)
   */
  public Object addEquals(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, java.math.BigDecimal)
   */
  public Object addEquals(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, java.math.BigInteger)
   */
  public Object addEquals(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, byte)
   */
  public Object addEquals(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, char)
   */
  public Object addEquals(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, double)
   */
  public Object addEquals(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, float)
   */
  public Object addEquals(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, int)
   */
  public Object addEquals(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, long)
   */
  public Object addEquals(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, short)
   */
  public Object addEquals(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, java.math.BigDecimal)
   */
  public Object addEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, java.math.BigInteger)
   */
  public Object addEquals(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, byte)
   */
  public Object addEquals(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, char)
   */
  public Object addEquals(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, double)
   */
  public Object addEquals(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, float)
   */
  public Object addEquals(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, int)
   */
  public Object addEquals(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, long)
   */
  public Object addEquals(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, short)
   */
  public Object addEquals(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, java.math.BigDecimal)
   */
  public Object addEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, java.math.BigInteger)
   */
  public Object addEquals(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, byte)
   */
  public Object addEquals(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, char)
   */
  public Object addEquals(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, double)
   */
  public Object addEquals(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, float)
   */
  public Object addEquals(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, int)
   */
  public Object addEquals(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, long)
   */
  public Object addEquals(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, short)
   */
  public Object addEquals(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, java.math.BigDecimal)
   */
  public Object addEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, java.math.BigInteger)
   */
  public Object addEquals(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, byte)
   */
  public Object addEquals(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, char)
   */
  public Object addEquals(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, double)
   */
  public Object addEquals(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, float)
   */
  public Object addEquals(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, int)
   */
  public Object addEquals(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, long)
   */
  public Object addEquals(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, short)
   */
  public Object addEquals(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, java.math.BigDecimal)
   */
  public Object addEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object addEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, byte)
   */
  public Object addEquals(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, char)
   */
  public Object addEquals(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, double)
   */
  public Object addEquals(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, float)
   */
  public Object addEquals(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, int)
   */
  public Object addEquals(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, long)
   */
  public Object addEquals(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#addEquals(java.lang.Object, java.lang.Object)
   */
  public Object addEquals(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, short)
   */
  public Object addEquals(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, java.math.BigDecimal)
   */
  public Object addEquals(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, java.math.BigInteger)
   */
  public Object addEquals(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, byte)
   */
  public Object addEquals(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, char)
   */
  public Object addEquals(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, double)
   */
  public Object addEquals(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, float)
   */
  public Object addEquals(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, int)
   */
  public Object addEquals(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, long)
   */
  public Object addEquals(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, short)
   */
  public Object addEquals(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.math.BigInteger, java.math.BigInteger)
   */
  public Object and(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.math.BigInteger, byte)
   */
  public Object and(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.math.BigInteger, char)
   */
  public Object and(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.math.BigInteger, int)
   */
  public Object and(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.math.BigInteger, long)
   */
  public Object and(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.math.BigInteger, short)
   */
  public Object and(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(byte, java.math.BigInteger)
   */
  public Object and(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(byte, byte)
   */
  public Object and(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(byte, char)
   */
  public Object and(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(byte, int)
   */
  public Object and(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(byte, long)
   */
  public Object and(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(byte, short)
   */
  public Object and(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(char, java.math.BigInteger)
   */
  public Object and(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(char, byte)
   */
  public Object and(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(char, char)
   */
  public Object and(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(char, int)
   */
  public Object and(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(char, long)
   */
  public Object and(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(char, short)
   */
  public Object and(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(int, java.math.BigInteger)
   */
  public Object and(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(int, byte)
   */
  public Object and(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(int, char)
   */
  public Object and(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(int, int)
   */
  public Object and(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(int, long)
   */
  public Object and(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(int, short)
   */
  public Object and(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(long, java.math.BigInteger)
   */
  public Object and(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(long, byte)
   */
  public Object and(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(long, char)
   */
  public Object and(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(long, int)
   */
  public Object and(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(long, long)
   */
  public Object and(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(long, short)
   */
  public Object and(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.lang.Object, java.math.BigInteger)
   */
  public Object and(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().and(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.lang.Object, byte)
   */
  public Object and(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().and(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.lang.Object, char)
   */
  public Object and(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().and(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.lang.Object, int)
   */
  public Object and(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().and(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.lang.Object, long)
   */
  public Object and(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().and(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#and(java.lang.Object, java.lang.Object)
   */
  public Object and(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().and(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.lang.Object, short)
   */
  public Object and(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().and(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(short, java.math.BigInteger)
   */
  public Object and(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(short, byte)
   */
  public Object and(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(short, char)
   */
  public Object and(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(short, int)
   */
  public Object and(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(short, long)
   */
  public Object and(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(short, short)
   */
  public Object and(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object andEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.math.BigInteger, byte)
   */
  public Object andEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.math.BigInteger, char)
   */
  public Object andEquals(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.math.BigInteger, int)
   */
  public Object andEquals(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.math.BigInteger, long)
   */
  public Object andEquals(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.math.BigInteger, short)
   */
  public Object andEquals(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(byte, java.math.BigInteger)
   */
  public Object andEquals(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(byte, byte)
   */
  public Object andEquals(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(byte, char)
   */
  public Object andEquals(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(byte, int)
   */
  public Object andEquals(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(byte, long)
   */
  public Object andEquals(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(byte, short)
   */
  public Object andEquals(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(char, java.math.BigInteger)
   */
  public Object andEquals(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(char, byte)
   */
  public Object andEquals(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(char, char)
   */
  public Object andEquals(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(char, int)
   */
  public Object andEquals(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(char, long)
   */
  public Object andEquals(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(char, short)
   */
  public Object andEquals(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(int, java.math.BigInteger)
   */
  public Object andEquals(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(int, byte)
   */
  public Object andEquals(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(int, char)
   */
  public Object andEquals(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(int, int)
   */
  public Object andEquals(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(int, long)
   */
  public Object andEquals(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(int, short)
   */
  public Object andEquals(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(long, java.math.BigInteger)
   */
  public Object andEquals(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(long, byte)
   */
  public Object andEquals(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(long, char)
   */
  public Object andEquals(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(long, int)
   */
  public Object andEquals(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(long, long)
   */
  public Object andEquals(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(long, short)
   */
  public Object andEquals(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object andEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().andEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.lang.Object, byte)
   */
  public Object andEquals(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().andEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.lang.Object, char)
   */
  public Object andEquals(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().andEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.lang.Object, int)
   */
  public Object andEquals(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().andEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.lang.Object, long)
   */
  public Object andEquals(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().andEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#andEquals(java.lang.Object, java.lang.Object)
   */
  public Object andEquals(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().andEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.lang.Object, short)
   */
  public Object andEquals(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().andEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(short, java.math.BigInteger)
   */
  public Object andEquals(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(short, byte)
   */
  public Object andEquals(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(short, char)
   */
  public Object andEquals(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(short, int)
   */
  public Object andEquals(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(short, long)
   */
  public Object andEquals(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(short, short)
   */
  public Object andEquals(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.math.BigInteger, java.math.BigInteger)
   */
  public Object arithmeticRightShift(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.math.BigInteger, byte)
   */
  public Object arithmeticRightShift(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.math.BigInteger, char)
   */
  public Object arithmeticRightShift(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.math.BigInteger, int)
   */
  public Object arithmeticRightShift(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.math.BigInteger, long)
   */
  public Object arithmeticRightShift(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.math.BigInteger, short)
   */
  public Object arithmeticRightShift(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(byte, java.math.BigInteger)
   */
  public Object arithmeticRightShift(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(byte, byte)
   */
  public Object arithmeticRightShift(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(byte, char)
   */
  public Object arithmeticRightShift(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(byte, int)
   */
  public Object arithmeticRightShift(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(byte, long)
   */
  public Object arithmeticRightShift(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(byte, short)
   */
  public Object arithmeticRightShift(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(char, java.math.BigInteger)
   */
  public Object arithmeticRightShift(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(char, byte)
   */
  public Object arithmeticRightShift(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(char, char)
   */
  public Object arithmeticRightShift(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(char, int)
   */
  public Object arithmeticRightShift(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(char, long)
   */
  public Object arithmeticRightShift(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(char, short)
   */
  public Object arithmeticRightShift(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(int, java.math.BigInteger)
   */
  public Object arithmeticRightShift(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(int, byte)
   */
  public Object arithmeticRightShift(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(int, char)
   */
  public Object arithmeticRightShift(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(int, int)
   */
  public Object arithmeticRightShift(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(int, long)
   */
  public Object arithmeticRightShift(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(int, short)
   */
  public Object arithmeticRightShift(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(long, java.math.BigInteger)
   */
  public Object arithmeticRightShift(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(long, byte)
   */
  public Object arithmeticRightShift(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(long, char)
   */
  public Object arithmeticRightShift(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(long, int)
   */
  public Object arithmeticRightShift(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(long, long)
   */
  public Object arithmeticRightShift(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(long, short)
   */
  public Object arithmeticRightShift(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.lang.Object, java.math.BigInteger)
   */
  public Object arithmeticRightShift(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.lang.Object, byte)
   */
  public Object arithmeticRightShift(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.lang.Object, char)
   */
  public Object arithmeticRightShift(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.lang.Object, int)
   */
  public Object arithmeticRightShift(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.lang.Object, long)
   */
  public Object arithmeticRightShift(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#arithmeticRightShift(java.lang.Object, java.lang.Object)
   */
  public Object arithmeticRightShift(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.lang.Object, short)
   */
  public Object arithmeticRightShift(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(short, java.math.BigInteger)
   */
  public Object arithmeticRightShift(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(short, byte)
   */
  public Object arithmeticRightShift(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(short, char)
   */
  public Object arithmeticRightShift(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(short, int)
   */
  public Object arithmeticRightShift(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(short, long)
   */
  public Object arithmeticRightShift(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(short, short)
   */
  public Object arithmeticRightShift(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object arithmeticRightShiftEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.math.BigInteger, byte)
   */
  public Object arithmeticRightShiftEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.math.BigInteger, char)
   */
  public Object arithmeticRightShiftEquals(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.math.BigInteger, int)
   */
  public Object arithmeticRightShiftEquals(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.math.BigInteger, long)
   */
  public Object arithmeticRightShiftEquals(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.math.BigInteger, short)
   */
  public Object arithmeticRightShiftEquals(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(byte, java.math.BigInteger)
   */
  public Object arithmeticRightShiftEquals(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(byte, byte)
   */
  public Object arithmeticRightShiftEquals(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(byte, char)
   */
  public Object arithmeticRightShiftEquals(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(byte, int)
   */
  public Object arithmeticRightShiftEquals(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(byte, long)
   */
  public Object arithmeticRightShiftEquals(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(byte, short)
   */
  public Object arithmeticRightShiftEquals(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(char, java.math.BigInteger)
   */
  public Object arithmeticRightShiftEquals(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(char, byte)
   */
  public Object arithmeticRightShiftEquals(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(char, char)
   */
  public Object arithmeticRightShiftEquals(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(char, int)
   */
  public Object arithmeticRightShiftEquals(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(char, long)
   */
  public Object arithmeticRightShiftEquals(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(char, short)
   */
  public Object arithmeticRightShiftEquals(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(int, java.math.BigInteger)
   */
  public Object arithmeticRightShiftEquals(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(int, byte)
   */
  public Object arithmeticRightShiftEquals(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(int, char)
   */
  public Object arithmeticRightShiftEquals(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(int, int)
   */
  public Object arithmeticRightShiftEquals(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(int, long)
   */
  public Object arithmeticRightShiftEquals(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(int, short)
   */
  public Object arithmeticRightShiftEquals(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(long, java.math.BigInteger)
   */
  public Object arithmeticRightShiftEquals(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(long, byte)
   */
  public Object arithmeticRightShiftEquals(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(long, char)
   */
  public Object arithmeticRightShiftEquals(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(long, int)
   */
  public Object arithmeticRightShiftEquals(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(long, long)
   */
  public Object arithmeticRightShiftEquals(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(long, short)
   */
  public Object arithmeticRightShiftEquals(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object arithmeticRightShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.lang.Object, byte)
   */
  public Object arithmeticRightShiftEquals(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.lang.Object, char)
   */
  public Object arithmeticRightShiftEquals(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.lang.Object, int)
   */
  public Object arithmeticRightShiftEquals(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.lang.Object, long)
   */
  public Object arithmeticRightShiftEquals(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#arithmeticRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object arithmeticRightShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.lang.Object, short)
   */
  public Object arithmeticRightShiftEquals(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(short, java.math.BigInteger)
   */
  public Object arithmeticRightShiftEquals(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(short, byte)
   */
  public Object arithmeticRightShiftEquals(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(short, char)
   */
  public Object arithmeticRightShiftEquals(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(short, int)
   */
  public Object arithmeticRightShiftEquals(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(short, long)
   */
  public Object arithmeticRightShiftEquals(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(short, short)
   */
  public Object arithmeticRightShiftEquals(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @param type
   * @return
   * @see ng.runtime.MetaClass#asType(java.lang.Object, java.lang.Class)
   */
  public Object asType(final Object instance, final Class type) throws Throwable {
    return this.delegate.getRuntimeMetaClass().asType(this.instance, type);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#asBoolean(java.lang.Object)
   */
  public boolean asBoolean(final Object instance) throws Throwable {
    return this.delegate.getRuntimeMetaClass().asBoolean(this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#asByte(java.lang.Object)
   */
  public byte asByte(final Object instance) throws Throwable {
    return this.delegate.getRuntimeMetaClass().asByte(this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#asChar(java.lang.Object)
   */
  public char asChar(final Object instance) throws Throwable {
    return this.delegate.getRuntimeMetaClass().asChar(this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#asDouble(java.lang.Object)
   */
  public double asDouble(final Object instance) throws Throwable {
    return this.delegate.getRuntimeMetaClass().asDouble(this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#asFloat(java.lang.Object)
   */
  public float asFloat(final Object instance) throws Throwable {
    return this.delegate.getRuntimeMetaClass().asFloat(this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#asInt(java.lang.Object)
   */
  public int asInt(final Object instance) throws Throwable {
    return this.delegate.getRuntimeMetaClass().asInt(this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#asLong(java.lang.Object)
   */
  public long asLong(final Object instance) throws Throwable {
    return this.delegate.getRuntimeMetaClass().asLong(this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#asShort(java.lang.Object)
   */
  public short asShort(final Object instance) throws Throwable {
    return this.delegate.getRuntimeMetaClass().asShort(this.instance);
  }

  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    return this.delegate.getRuntimeMetaClass().callQuick(this.instance, p1, p2, p3, p4);
  }

  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final Object instance, final Object p1, final Object p2, final Object p3) throws Throwable {
    return this.delegate.getRuntimeMetaClass().callQuick(this.instance, p1, p2, p3);
  }

  /**
   * @param instance
   * @param p1
   * @param p2
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final Object instance, final Object p1, final Object p2) throws Throwable {
    return this.delegate.getRuntimeMetaClass().callQuick(this.instance, p1, p2);
  }

  /**
   * @param instance
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final Object instance, final Object p1) throws Throwable {
    return this.delegate.getRuntimeMetaClass().callQuick(this.instance, p1);
  }

  /**
   * @param instance
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object, boolean)
   */
  public Object callQuick(final Object instance, final boolean p1) throws Throwable {
    return this.delegate.callQuick(instance, p1);
  }

  /**
   * @param instance
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object, char)
   */
  public Object callQuick(final Object instance, final char p1) throws Throwable {
    return this.delegate.callQuick(instance, p1);
  }

  /**
   * @param instance
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object, byte)
   */
  public Object callQuick(final Object instance, final byte p1) throws Throwable {
    return this.delegate.callQuick(instance, p1);
  }

  /**
   * @param instance
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object, short)
   */
  public Object callQuick(final Object instance, final short p1) throws Throwable {
    return this.delegate.callQuick(instance, p1);
  }

  /**
   * @param instance
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object, int)
   */
  public Object callQuick(final Object instance, final int p1) throws Throwable {
    return this.delegate.callQuick(instance, p1);
  }

  /**
   * @param instance
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object, long)
   */
  public Object callQuick(final Object instance, final long p1) throws Throwable {
    return this.delegate.callQuick(instance, p1);
  }

  /**
   * @param instance
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object, float)
   */
  public Object callQuick(final Object instance, final float p1) throws Throwable {
    return this.delegate.callQuick(instance, p1);
  }

  /**
   * @param instance
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object, double)
   */
  public Object callQuick(final Object instance, final double p1) throws Throwable {
    return this.delegate.callQuick(instance, p1);
  }

  /**
   * @param instance
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object, java.math.BigInteger)
   */
  public Object callQuick(final Object instance, final BigInteger p1) throws Throwable {
    return this.delegate.callQuick(instance, p1);
  }

  /**
   * @param instance
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object, java.math.BigDecimal)
   */
  public Object callQuick(final Object instance, final BigDecimal p1) throws Throwable {
    return this.delegate.callQuick(instance, p1);
  }

  /**
   * @param instance
   * @param arguments
   * @return
   * @see ng.runtime.MetaClass#call(java.lang.Object, java.lang.Object[])
   */
  public Object call(final Object instance, final Object[] arguments) throws Throwable {
    return this.delegate.getRuntimeMetaClass().call(this.instance, arguments);
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object)
   */
  public Object callQuick(final Object instance) throws Throwable {
    return this.delegate.getRuntimeMetaClass().callQuick(this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object compare(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object compare(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, byte)
   */
  public Object compare(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, char)
   */
  public Object compare(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, double)
   */
  public Object compare(final BigDecimal lhs, final double rhs)  throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, float)
   */
  public Object compare(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, int)
   */
  public Object compare(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, long)
   */
  public Object compare(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, short)
   */
  public Object compare(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object compare(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, java.math.BigInteger)
   */
  public Object compare(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, byte)
   */
  public Object compare(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, char)
   */
  public Object compare(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, double)
   */
  public Object compare(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, float)
   */
  public Object compare(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, int)
   */
  public Object compare(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, long)
   */
  public Object compare(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, short)
   */
  public Object compare(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, java.math.BigDecimal)
   */
  public Object compare(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, java.math.BigInteger)
   */
  public Object compare(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, byte)
   */
  public Object compare(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, char)
   */
  public Object compare(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, double)
   */
  public Object compare(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, float)
   */
  public Object compare(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, int)
   */
  public Object compare(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, long)
   */
  public Object compare(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, short)
   */
  public Object compare(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, java.math.BigDecimal)
   */
  public Object compare(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, java.math.BigInteger)
   */
  public Object compare(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, byte)
   */
  public Object compare(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, char)
   */
  public Object compare(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, double)
   */
  public Object compare(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, float)
   */
  public Object compare(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, int)
   */
  public Object compare(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, long)
   */
  public Object compare(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, short)
   */
  public Object compare(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, java.math.BigDecimal)
   */
  public Object compare(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, java.math.BigInteger)
   */
  public Object compare(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, byte)
   */
  public Object compare(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, char)
   */
  public Object compare(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, double)
   */
  public Object compare(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, float)
   */
  public Object compare(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, int)
   */
  public Object compare(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, long)
   */
  public Object compare(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, short)
   */
  public Object compare(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, java.math.BigDecimal)
   */
  public Object compare(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, java.math.BigInteger)
   */
  public Object compare(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, byte)
   */
  public Object compare(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, char)
   */
  public Object compare(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, double)
   */
  public Object compare(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, float)
   */
  public Object compare(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, int)
   */
  public Object compare(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, long)
   */
  public Object compare(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, short)
   */
  public Object compare(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, java.math.BigDecimal)
   */
  public Object compare(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, java.math.BigInteger)
   */
  public Object compare(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, byte)
   */
  public Object compare(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, char)
   */
  public Object compare(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, double)
   */
  public Object compare(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, float)
   */
  public Object compare(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, int)
   */
  public Object compare(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, long)
   */
  public Object compare(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, short)
   */
  public Object compare(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, java.math.BigDecimal)
   */
  public Object compare(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, java.math.BigInteger)
   */
  public Object compare(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, byte)
   */
  public Object compare(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, char)
   */
  public Object compare(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, double)
   */
  public Object compare(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, float)
   */
  public Object compare(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, int)
   */
  public Object compare(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, long)
   */
  public Object compare(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, short)
   */
  public Object compare(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, java.math.BigDecimal)
   */
  public Object compare(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, java.math.BigInteger)
   */
  public Object compare(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, byte)
   */
  public Object compare(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, char)
   */
  public Object compare(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, double)
   */
  public Object compare(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, float)
   */
  public Object compare(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, int)
   */
  public Object compare(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, long)
   */
  public Object compare(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#compare(java.lang.Object, java.lang.Object)
   */
  public Object compare(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, short)
   */
  public Object compare(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, java.math.BigDecimal)
   */
  public Object compare(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, java.math.BigInteger)
   */
  public Object compare(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, byte)
   */
  public Object compare(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, char)
   */
  public Object compare(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, double)
   */
  public Object compare(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, float)
   */
  public Object compare(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, int)
   */
  public Object compare(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, long)
   */
  public Object compare(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, short)
   */
  public Object compare(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#complement(java.math.BigInteger)
   */
  public Object complement(final BigInteger instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#complement(int)
   */
  public Object complement(final int instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#complement(long)
   */
  public Object complement(final long instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.MetaClass#complement(java.lang.Object)
   */
  public Object complement(final Object instance) throws Throwable {
    return this.delegate.getRuntimeMetaClass().complement(instance);
  }

  /**
   * @param theClass
   * @return
   * @see ng.runtime.RuntimeMetaClass#createMetaClassFor(java.lang.Class)
   */
  public RuntimeMetaClass createMetaClassFor(final Class theClass) {
    return this.delegate.getRuntimeMetaClass().createMetaClassFor(theClass);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object divide(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object divide(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, byte)
   */
  public Object divide(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, char)
   */
  public Object divide(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, double)
   */
  public Object divide(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, float)
   */
  public Object divide(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, int)
   */
  public Object divide(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, long)
   */
  public Object divide(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, short)
   */
  public Object divide(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object divide(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, java.math.BigInteger)
   */
  public Object divide(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, byte)
   */
  public Object divide(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, char)
   */
  public Object divide(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, double)
   */
  public Object divide(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, float)
   */
  public Object divide(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, int)
   */
  public Object divide(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, long)
   */
  public Object divide(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, short)
   */
  public Object divide(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, java.math.BigDecimal)
   */
  public Object divide(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, java.math.BigInteger)
   */
  public Object divide(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, byte)
   */
  public Object divide(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, char)
   */
  public Object divide(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, double)
   */
  public Object divide(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, float)
   */
  public Object divide(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, int)
   */
  public Object divide(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, long)
   */
  public Object divide(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, short)
   */
  public Object divide(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, java.math.BigDecimal)
   */
  public Object divide(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, java.math.BigInteger)
   */
  public Object divide(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, byte)
   */
  public Object divide(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, char)
   */
  public Object divide(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, double)
   */
  public Object divide(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, float)
   */
  public Object divide(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, int)
   */
  public Object divide(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, long)
   */
  public Object divide(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, short)
   */
  public Object divide(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, java.math.BigDecimal)
   */
  public Object divide(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, java.math.BigInteger)
   */
  public Object divide(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, byte)
   */
  public Object divide(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, char)
   */
  public Object divide(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, double)
   */
  public Object divide(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, float)
   */
  public Object divide(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, int)
   */
  public Object divide(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, long)
   */
  public Object divide(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, short)
   */
  public Object divide(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, java.math.BigDecimal)
   */
  public Object divide(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, java.math.BigInteger)
   */
  public Object divide(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, byte)
   */
  public Object divide(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, char)
   */
  public Object divide(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, double)
   */
  public Object divide(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, float)
   */
  public Object divide(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, int)
   */
  public Object divide(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, long)
   */
  public Object divide(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, short)
   */
  public Object divide(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, java.math.BigDecimal)
   */
  public Object divide(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, java.math.BigInteger)
   */
  public Object divide(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, byte)
   */
  public Object divide(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, char)
   */
  public Object divide(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, double)
   */
  public Object divide(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, float)
   */
  public Object divide(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, int)
   */
  public Object divide(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, long)
   */
  public Object divide(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, short)
   */
  public Object divide(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, java.math.BigDecimal)
   */
  public Object divide(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, java.math.BigInteger)
   */
  public Object divide(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, byte)
   */
  public Object divide(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, char)
   */
  public Object divide(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, double)
   */
  public Object divide(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, float)
   */
  public Object divide(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, int)
   */
  public Object divide(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, long)
   */
  public Object divide(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, short)
   */
  public Object divide(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, java.math.BigDecimal)
   */
  public Object divide(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, java.math.BigInteger)
   */
  public Object divide(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, byte)
   */
  public Object divide(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, char)
   */
  public Object divide(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, double)
   */
  public Object divide(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, float)
   */
  public Object divide(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, int)
   */
  public Object divide(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, long)
   */
  public Object divide(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#divide(java.lang.Object, java.lang.Object)
   */
  public Object divide(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, short)
   */
  public Object divide(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, java.math.BigDecimal)
   */
  public Object divide(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, java.math.BigInteger)
   */
  public Object divide(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, byte)
   */
  public Object divide(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, char)
   */
  public Object divide(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, double)
   */
  public Object divide(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, float)
   */
  public Object divide(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, int)
   */
  public Object divide(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, long)
   */
  public Object divide(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, short)
   */
  public Object divide(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object divideEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object divideEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, byte)
   */
  public Object divideEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, char)
   */
  public Object divideEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, double)
   */
  public Object divideEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, float)
   */
  public Object divideEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, int)
   */
  public Object divideEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, long)
   */
  public Object divideEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, short)
   */
  public Object divideEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object divideEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object divideEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, byte)
   */
  public Object divideEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, char)
   */
  public Object divideEquals(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, double)
   */
  public Object divideEquals(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, float)
   */
  public Object divideEquals(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, int)
   */
  public Object divideEquals(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, long)
   */
  public Object divideEquals(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, short)
   */
  public Object divideEquals(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, java.math.BigDecimal)
   */
  public Object divideEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, java.math.BigInteger)
   */
  public Object divideEquals(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, byte)
   */
  public Object divideEquals(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, char)
   */
  public Object divideEquals(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, double)
   */
  public Object divideEquals(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, float)
   */
  public Object divideEquals(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, int)
   */
  public Object divideEquals(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, long)
   */
  public Object divideEquals(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, short)
   */
  public Object divideEquals(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, java.math.BigDecimal)
   */
  public Object divideEquals(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, java.math.BigInteger)
   */
  public Object divideEquals(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, byte)
   */
  public Object divideEquals(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, char)
   */
  public Object divideEquals(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, double)
   */
  public Object divideEquals(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, float)
   */
  public Object divideEquals(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, int)
   */
  public Object divideEquals(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, long)
   */
  public Object divideEquals(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, short)
   */
  public Object divideEquals(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, java.math.BigDecimal)
   */
  public Object divideEquals(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, java.math.BigInteger)
   */
  public Object divideEquals(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, byte)
   */
  public Object divideEquals(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, char)
   */
  public Object divideEquals(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, double)
   */
  public Object divideEquals(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, float)
   */
  public Object divideEquals(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, int)
   */
  public Object divideEquals(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, long)
   */
  public Object divideEquals(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, short)
   */
  public Object divideEquals(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, java.math.BigDecimal)
   */
  public Object divideEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, java.math.BigInteger)
   */
  public Object divideEquals(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, byte)
   */
  public Object divideEquals(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, char)
   */
  public Object divideEquals(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, double)
   */
  public Object divideEquals(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, float)
   */
  public Object divideEquals(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, int)
   */
  public Object divideEquals(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, long)
   */
  public Object divideEquals(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, short)
   */
  public Object divideEquals(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, java.math.BigDecimal)
   */
  public Object divideEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, java.math.BigInteger)
   */
  public Object divideEquals(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, byte)
   */
  public Object divideEquals(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, char)
   */
  public Object divideEquals(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, double)
   */
  public Object divideEquals(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, float)
   */
  public Object divideEquals(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, int)
   */
  public Object divideEquals(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, long)
   */
  public Object divideEquals(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, short)
   */
  public Object divideEquals(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, java.math.BigDecimal)
   */
  public Object divideEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, java.math.BigInteger)
   */
  public Object divideEquals(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, byte)
   */
  public Object divideEquals(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, char)
   */
  public Object divideEquals(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, double)
   */
  public Object divideEquals(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, float)
   */
  public Object divideEquals(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, int)
   */
  public Object divideEquals(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, long)
   */
  public Object divideEquals(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, short)
   */
  public Object divideEquals(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, java.math.BigDecimal)
   */
  public Object divideEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object divideEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, byte)
   */
  public Object divideEquals(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, char)
   */
  public Object divideEquals(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, double)
   */
  public Object divideEquals(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, float)
   */
  public Object divideEquals(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, int)
   */
  public Object divideEquals(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, long)
   */
  public Object divideEquals(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#divideEquals(java.lang.Object, java.lang.Object)
   */
  public Object divideEquals(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, short)
   */
  public Object divideEquals(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, java.math.BigDecimal)
   */
  public Object divideEquals(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, java.math.BigInteger)
   */
  public Object divideEquals(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, byte)
   */
  public Object divideEquals(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, char)
   */
  public Object divideEquals(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, double)
   */
  public Object divideEquals(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, float)
   */
  public Object divideEquals(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, int)
   */
  public Object divideEquals(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, long)
   */
  public Object divideEquals(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, short)
   */
  public Object divideEquals(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object equals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object equals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, byte)
   */
  public Object equals(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, char)
   */
  public Object equals(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, double)
   */
  public Object equals(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, float)
   */
  public Object equals(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, int)
   */
  public Object equals(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, long)
   */
  public Object equals(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, short)
   */
  public Object equals(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object equals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object equals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, byte)
   */
  public Object equals(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, char)
   */
  public Object equals(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, double)
   */
  public Object equals(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, float)
   */
  public Object equals(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, int)
   */
  public Object equals(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, long)
   */
  public Object equals(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, short)
   */
  public Object equals(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, java.math.BigDecimal)
   */
  public Object equals(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, java.math.BigInteger)
   */
  public Object equals(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, byte)
   */
  public Object equals(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, char)
   */
  public Object equals(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, double)
   */
  public Object equals(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, float)
   */
  public Object equals(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, int)
   */
  public Object equals(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, long)
   */
  public Object equals(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, short)
   */
  public Object equals(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, java.math.BigDecimal)
   */
  public Object equals(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, java.math.BigInteger)
   */
  public Object equals(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, byte)
   */
  public Object equals(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, char)
   */
  public Object equals(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, double)
   */
  public Object equals(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, float)
   */
  public Object equals(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, int)
   */
  public Object equals(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, long)
   */
  public Object equals(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, short)
   */
  public Object equals(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, java.math.BigDecimal)
   */
  public Object equals(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, java.math.BigInteger)
   */
  public Object equals(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, byte)
   */
  public Object equals(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, char)
   */
  public Object equals(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, double)
   */
  public Object equals(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, float)
   */
  public Object equals(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, int)
   */
  public Object equals(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, long)
   */
  public Object equals(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, short)
   */
  public Object equals(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, java.math.BigDecimal)
   */
  public Object equals(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, java.math.BigInteger)
   */
  public Object equals(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, byte)
   */
  public Object equals(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, char)
   */
  public Object equals(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, double)
   */
  public Object equals(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, float)
   */
  public Object equals(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, int)
   */
  public Object equals(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, long)
   */
  public Object equals(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, short)
   */
  public Object equals(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, java.math.BigDecimal)
   */
  public Object equals(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, java.math.BigInteger)
   */
  public Object equals(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, byte)
   */
  public Object equals(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, char)
   */
  public Object equals(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, double)
   */
  public Object equals(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, float)
   */
  public Object equals(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, int)
   */
  public Object equals(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, long)
   */
  public Object equals(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, short)
   */
  public Object equals(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, java.math.BigDecimal)
   */
  public Object equals(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, java.math.BigInteger)
   */
  public Object equals(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, byte)
   */
  public Object equals(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, char)
   */
  public Object equals(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, double)
   */
  public Object equals(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, float)
   */
  public Object equals(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, int)
   */
  public Object equals(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, long)
   */
  public Object equals(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, short)
   */
  public Object equals(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, java.math.BigDecimal)
   */
  public Object equals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, java.math.BigInteger)
   */
  public Object equals(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, byte)
   */
  public Object equals(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, char)
   */
  public Object equals(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, double)
   */
  public Object equals(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, float)
   */
  public Object equals(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, int)
   */
  public Object equals(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, long)
   */
  public Object equals(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#equals(java.lang.Object, java.lang.Object)
   */
  public Object equals(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, short)
   */
  public Object equals(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, java.math.BigDecimal)
   */
  public Object equals(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, java.math.BigInteger)
   */
  public Object equals(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, byte)
   */
  public Object equals(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, char)
   */
  public Object equals(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, double)
   */
  public Object equals(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, float)
   */
  public Object equals(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, int)
   */
  public Object equals(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, long)
   */
  public Object equals(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, short)
   */
  public Object equals(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigDecimal, java.math.BigDecimal)
   */
  public boolean equalsBoolean(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigDecimal, java.math.BigInteger)
   */
  public boolean equalsBoolean(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigDecimal, byte)
   */
  public boolean equalsBoolean(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigDecimal, char)
   */
  public boolean equalsBoolean(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigDecimal, double)
   */
  public boolean equalsBoolean(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigDecimal, float)
   */
  public boolean equalsBoolean(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigDecimal, int)
   */
  public boolean equalsBoolean(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigDecimal, long)
   */
  public boolean equalsBoolean(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigDecimal, short)
   */
  public boolean equalsBoolean(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigInteger, java.math.BigDecimal)
   */
  public boolean equalsBoolean(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigInteger, java.math.BigInteger)
   */
  public boolean equalsBoolean(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigInteger, byte)
   */
  public boolean equalsBoolean(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigInteger, char)
   */
  public boolean equalsBoolean(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigInteger, double)
   */
  public boolean equalsBoolean(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigInteger, float)
   */
  public boolean equalsBoolean(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigInteger, int)
   */
  public boolean equalsBoolean(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigInteger, long)
   */
  public boolean equalsBoolean(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.math.BigInteger, short)
   */
  public boolean equalsBoolean(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(byte, java.math.BigDecimal)
   */
  public boolean equalsBoolean(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(byte, java.math.BigInteger)
   */
  public boolean equalsBoolean(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(byte, byte)
   */
  public boolean equalsBoolean(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(byte, char)
   */
  public boolean equalsBoolean(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(byte, double)
   */
  public boolean equalsBoolean(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(byte, float)
   */
  public boolean equalsBoolean(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(byte, int)
   */
  public boolean equalsBoolean(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(byte, long)
   */
  public boolean equalsBoolean(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(byte, short)
   */
  public boolean equalsBoolean(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(char, java.math.BigDecimal)
   */
  public boolean equalsBoolean(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(char, java.math.BigInteger)
   */
  public boolean equalsBoolean(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(char, byte)
   */
  public boolean equalsBoolean(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(char, char)
   */
  public boolean equalsBoolean(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(char, double)
   */
  public boolean equalsBoolean(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(char, float)
   */
  public boolean equalsBoolean(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(char, int)
   */
  public boolean equalsBoolean(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(char, long)
   */
  public boolean equalsBoolean(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(char, short)
   */
  public boolean equalsBoolean(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(double, java.math.BigDecimal)
   */
  public boolean equalsBoolean(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(double, java.math.BigInteger)
   */
  public boolean equalsBoolean(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(double, byte)
   */
  public boolean equalsBoolean(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(double, char)
   */
  public boolean equalsBoolean(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(double, double)
   */
  public boolean equalsBoolean(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(double, float)
   */
  public boolean equalsBoolean(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(double, int)
   */
  public boolean equalsBoolean(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(double, long)
   */
  public boolean equalsBoolean(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(double, short)
   */
  public boolean equalsBoolean(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(float, java.math.BigDecimal)
   */
  public boolean equalsBoolean(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(float, java.math.BigInteger)
   */
  public boolean equalsBoolean(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(float, byte)
   */
  public boolean equalsBoolean(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(float, char)
   */
  public boolean equalsBoolean(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(float, double)
   */
  public boolean equalsBoolean(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(float, float)
   */
  public boolean equalsBoolean(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(float, int)
   */
  public boolean equalsBoolean(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(float, long)
   */
  public boolean equalsBoolean(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(float, short)
   */
  public boolean equalsBoolean(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(int, java.math.BigDecimal)
   */
  public boolean equalsBoolean(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(int, java.math.BigInteger)
   */
  public boolean equalsBoolean(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(int, byte)
   */
  public boolean equalsBoolean(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(int, char)
   */
  public boolean equalsBoolean(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(int, double)
   */
  public boolean equalsBoolean(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(int, float)
   */
  public boolean equalsBoolean(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(int, int)
   */
  public boolean equalsBoolean(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(int, long)
   */
  public boolean equalsBoolean(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(int, short)
   */
  public boolean equalsBoolean(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(long, java.math.BigDecimal)
   */
  public boolean equalsBoolean(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(long, java.math.BigInteger)
   */
  public boolean equalsBoolean(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(long, byte)
   */
  public boolean equalsBoolean(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(long, char)
   */
  public boolean equalsBoolean(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(long, double)
   */
  public boolean equalsBoolean(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(long, float)
   */
  public boolean equalsBoolean(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(long, int)
   */
  public boolean equalsBoolean(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(long, long)
   */
  public boolean equalsBoolean(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(long, short)
   */
  public boolean equalsBoolean(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.lang.Object, java.math.BigDecimal)
   */
  public boolean equalsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equalsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.lang.Object, java.math.BigInteger)
   */
  public boolean equalsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equalsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.lang.Object, byte)
   */
  public boolean equalsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equalsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.lang.Object, char)
   */
  public boolean equalsBoolean(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equalsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.lang.Object, double)
   */
  public boolean equalsBoolean(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equalsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.lang.Object, float)
   */
  public boolean equalsBoolean(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equalsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.lang.Object, int)
   */
  public boolean equalsBoolean(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equalsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.lang.Object, long)
   */
  public boolean equalsBoolean(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equalsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.lang.Object, java.lang.Object)
   */
  public boolean equalsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equalsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(java.lang.Object, short)
   */
  public boolean equalsBoolean(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().equalsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(short, java.math.BigDecimal)
   */
  public boolean equalsBoolean(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(short, java.math.BigInteger)
   */
  public boolean equalsBoolean(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(short, byte)
   */
  public boolean equalsBoolean(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(short, char)
   */
  public boolean equalsBoolean(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(short, double)
   */
  public boolean equalsBoolean(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(short, float)
   */
  public boolean equalsBoolean(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(short, int)
   */
  public boolean equalsBoolean(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(short, long)
   */
  public boolean equalsBoolean(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#equalsBoolean(short, short)
   */
  public boolean equalsBoolean(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseEqualsBoolean(java.math.BigDecimal, java.lang.Object)
   */
  public boolean reverseEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEqualsBoolean(lhs, this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseEqualsBoolean(java.math.BigInteger, java.lang.Object)
   */
  public boolean reverseEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEqualsBoolean(lhs, this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseEqualsBoolean(byte, java.lang.Object)
   */
  public boolean reverseEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEqualsBoolean(lhs, this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseEqualsBoolean(char, java.lang.Object)
   */
  public boolean reverseEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEqualsBoolean(lhs, this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseEqualsBoolean(double, java.lang.Object)
   */
  public boolean reverseEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEqualsBoolean(lhs, this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseEqualsBoolean(float, java.lang.Object)
   */
  public boolean reverseEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEqualsBoolean(lhs, this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseEqualsBoolean(int, java.lang.Object)
   */
  public boolean reverseEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEqualsBoolean(lhs, this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseEqualsBoolean(long, java.lang.Object)
   */
  public boolean reverseEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEqualsBoolean(lhs, this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseEqualsBoolean(short, java.lang.Object)
   */
  public boolean reverseEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEqualsBoolean(lhs, this.instance);
  }

  /**
   * @param instance
   * @param index
   * @return
   * @see ng.runtime.RuntimeMetaClass#getAt(java.lang.Object, java.math.BigInteger)
   */
  public Object getAt(final Object instance, final BigInteger index) throws Throwable {
    return this.delegate.getRuntimeMetaClass().getAt(this.instance, index);
  }

  /**
   * @param instance
   * @param index
   * @return
   * @see ng.runtime.RuntimeMetaClass#getAt(java.lang.Object, int)
   */
  public Object getAt(final Object instance, final int index) throws Throwable {
    return this.delegate.getRuntimeMetaClass().getAt(this.instance, index);
  }

  /**
   * @param instance
   * @param index
   * @return
   * @see ng.runtime.MetaClass#getAt(java.lang.Object, java.lang.Object)
   */
  public Object getAt(final Object instance, final Object index) throws Throwable {
    return this.delegate.getRuntimeMetaClass().getAt(this.instance, index);
  }

  /**
   * @param instance
   * @param fieldName
   * @return
   * @see ng.runtime.MetaClass#getField(java.lang.Object, java.lang.String)
   */
  public Object getField(final Object instance, final String fieldName) throws Throwable {
    return this.delegate.getRuntimeMetaClass().getField(this.instance, fieldName);
  }

  /**
   * @return
   * @see ng.runtime.RuntimeMetaClass#getInternalMetaClass()
   */
  public InternalMetaClass getInternalMetaClass() {
    return this.delegate.getRuntimeMetaClass().getInternalMetaClass();
  }

  /**
   * @param instance
   * @param propertyName
   * @return
   * @see ng.runtime.MetaClass#getProperty(java.lang.Object, java.lang.String)
   */
  public Object getProperty(final Object instance, final String propertyName) throws Throwable {
    return this.delegate.getRuntimeMetaClass().getProperty(this.instance, propertyName);
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.MetaClass#getTheClass(java.lang.Object)
   */
  public Class getTheClass(final Object instance) {
    return this.delegate.getRuntimeMetaClass().getTheClass(this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object greaterThan(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object greaterThan(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, byte)
   */
  public Object greaterThan(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, char)
   */
  public Object greaterThan(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, double)
   */
  public Object greaterThan(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, float)
   */
  public Object greaterThan(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, int)
   */
  public Object greaterThan(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, long)
   */
  public Object greaterThan(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, short)
   */
  public Object greaterThan(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object greaterThan(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, java.math.BigInteger)
   */
  public Object greaterThan(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, byte)
   */
  public Object greaterThan(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, char)
   */
  public Object greaterThan(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, double)
   */
  public Object greaterThan(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, float)
   */
  public Object greaterThan(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, int)
   */
  public Object greaterThan(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, long)
   */
  public Object greaterThan(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, short)
   */
  public Object greaterThan(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, java.math.BigDecimal)
   */
  public Object greaterThan(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, java.math.BigInteger)
   */
  public Object greaterThan(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, byte)
   */
  public Object greaterThan(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, char)
   */
  public Object greaterThan(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, double)
   */
  public Object greaterThan(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, float)
   */
  public Object greaterThan(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, int)
   */
  public Object greaterThan(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, long)
   */
  public Object greaterThan(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, short)
   */
  public Object greaterThan(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, java.math.BigDecimal)
   */
  public Object greaterThan(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, java.math.BigInteger)
   */
  public Object greaterThan(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, byte)
   */
  public Object greaterThan(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, char)
   */
  public Object greaterThan(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, double)
   */
  public Object greaterThan(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, float)
   */
  public Object greaterThan(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, int)
   */
  public Object greaterThan(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, long)
   */
  public Object greaterThan(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, short)
   */
  public Object greaterThan(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, java.math.BigDecimal)
   */
  public Object greaterThan(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, java.math.BigInteger)
   */
  public Object greaterThan(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, byte)
   */
  public Object greaterThan(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, char)
   */
  public Object greaterThan(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, double)
   */
  public Object greaterThan(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, float)
   */
  public Object greaterThan(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, int)
   */
  public Object greaterThan(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, long)
   */
  public Object greaterThan(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, short)
   */
  public Object greaterThan(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, java.math.BigDecimal)
   */
  public Object greaterThan(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, java.math.BigInteger)
   */
  public Object greaterThan(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, byte)
   */
  public Object greaterThan(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, char)
   */
  public Object greaterThan(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, double)
   */
  public Object greaterThan(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, float)
   */
  public Object greaterThan(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, int)
   */
  public Object greaterThan(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, long)
   */
  public Object greaterThan(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, short)
   */
  public Object greaterThan(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, java.math.BigDecimal)
   */
  public Object greaterThan(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, java.math.BigInteger)
   */
  public Object greaterThan(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, byte)
   */
  public Object greaterThan(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, char)
   */
  public Object greaterThan(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, double)
   */
  public Object greaterThan(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, float)
   */
  public Object greaterThan(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, int)
   */
  public Object greaterThan(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, long)
   */
  public Object greaterThan(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, short)
   */
  public Object greaterThan(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, java.math.BigDecimal)
   */
  public Object greaterThan(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, java.math.BigInteger)
   */
  public Object greaterThan(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, byte)
   */
  public Object greaterThan(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, char)
   */
  public Object greaterThan(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, double)
   */
  public Object greaterThan(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, float)
   */
  public Object greaterThan(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, int)
   */
  public Object greaterThan(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, long)
   */
  public Object greaterThan(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, short)
   */
  public Object greaterThan(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, java.math.BigDecimal)
   */
  public Object greaterThan(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, java.math.BigInteger)
   */
  public Object greaterThan(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, byte)
   */
  public Object greaterThan(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, char)
   */
  public Object greaterThan(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, double)
   */
  public Object greaterThan(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, float)
   */
  public Object greaterThan(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, int)
   */
  public Object greaterThan(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, long)
   */
  public Object greaterThan(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#greaterThan(java.lang.Object, java.lang.Object)
   */
  public Object greaterThan(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, short)
   */
  public Object greaterThan(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, java.math.BigDecimal)
   */
  public Object greaterThan(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, java.math.BigInteger)
   */
  public Object greaterThan(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, byte)
   */
  public Object greaterThan(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, char)
   */
  public Object greaterThan(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, double)
   */
  public Object greaterThan(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, float)
   */
  public Object greaterThan(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, int)
   */
  public Object greaterThan(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, long)
   */
  public Object greaterThan(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, short)
   */
  public Object greaterThan(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, byte)
   */
  public Object greaterThanOrEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, char)
   */
  public Object greaterThanOrEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, double)
   */
  public Object greaterThanOrEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, float)
   */
  public Object greaterThanOrEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, int)
   */
  public Object greaterThanOrEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, long)
   */
  public Object greaterThanOrEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, short)
   */
  public Object greaterThanOrEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, byte)
   */
  public Object greaterThanOrEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, char)
   */
  public Object greaterThanOrEquals(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, double)
   */
  public Object greaterThanOrEquals(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, float)
   */
  public Object greaterThanOrEquals(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, int)
   */
  public Object greaterThanOrEquals(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, long)
   */
  public Object greaterThanOrEquals(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, short)
   */
  public Object greaterThanOrEquals(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, byte)
   */
  public Object greaterThanOrEquals(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, char)
   */
  public Object greaterThanOrEquals(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, double)
   */
  public Object greaterThanOrEquals(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, float)
   */
  public Object greaterThanOrEquals(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, int)
   */
  public Object greaterThanOrEquals(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, long)
   */
  public Object greaterThanOrEquals(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, short)
   */
  public Object greaterThanOrEquals(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, byte)
   */
  public Object greaterThanOrEquals(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, char)
   */
  public Object greaterThanOrEquals(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, double)
   */
  public Object greaterThanOrEquals(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, float)
   */
  public Object greaterThanOrEquals(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, int)
   */
  public Object greaterThanOrEquals(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, long)
   */
  public Object greaterThanOrEquals(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, short)
   */
  public Object greaterThanOrEquals(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, byte)
   */
  public Object greaterThanOrEquals(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, char)
   */
  public Object greaterThanOrEquals(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, double)
   */
  public Object greaterThanOrEquals(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, float)
   */
  public Object greaterThanOrEquals(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, int)
   */
  public Object greaterThanOrEquals(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, long)
   */
  public Object greaterThanOrEquals(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, short)
   */
  public Object greaterThanOrEquals(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, byte)
   */
  public Object greaterThanOrEquals(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, char)
   */
  public Object greaterThanOrEquals(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, double)
   */
  public Object greaterThanOrEquals(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, float)
   */
  public Object greaterThanOrEquals(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, int)
   */
  public Object greaterThanOrEquals(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, long)
   */
  public Object greaterThanOrEquals(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, short)
   */
  public Object greaterThanOrEquals(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, byte)
   */
  public Object greaterThanOrEquals(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, char)
   */
  public Object greaterThanOrEquals(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, double)
   */
  public Object greaterThanOrEquals(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, float)
   */
  public Object greaterThanOrEquals(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, int)
   */
  public Object greaterThanOrEquals(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, long)
   */
  public Object greaterThanOrEquals(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, short)
   */
  public Object greaterThanOrEquals(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, byte)
   */
  public Object greaterThanOrEquals(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, char)
   */
  public Object greaterThanOrEquals(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, double)
   */
  public Object greaterThanOrEquals(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, float)
   */
  public Object greaterThanOrEquals(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, int)
   */
  public Object greaterThanOrEquals(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, long)
   */
  public Object greaterThanOrEquals(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, short)
   */
  public Object greaterThanOrEquals(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, byte)
   */
  public Object greaterThanOrEquals(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, char)
   */
  public Object greaterThanOrEquals(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, double)
   */
  public Object greaterThanOrEquals(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, float)
   */
  public Object greaterThanOrEquals(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, int)
   */
  public Object greaterThanOrEquals(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, long)
   */
  public Object greaterThanOrEquals(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#greaterThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object greaterThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, short)
   */
  public Object greaterThanOrEquals(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, byte)
   */
  public Object greaterThanOrEquals(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, char)
   */
  public Object greaterThanOrEquals(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, double)
   */
  public Object greaterThanOrEquals(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, float)
   */
  public Object greaterThanOrEquals(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, int)
   */
  public Object greaterThanOrEquals(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, long)
   */
  public Object greaterThanOrEquals(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, short)
   */
  public Object greaterThanOrEquals(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object integerDivide(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object integerDivide(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, byte)
   */
  public Object integerDivide(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, char)
   */
  public Object integerDivide(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, double)
   */
  public Object integerDivide(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, float)
   */
  public Object integerDivide(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, int)
   */
  public Object integerDivide(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, long)
   */
  public Object integerDivide(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, short)
   */
  public Object integerDivide(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object integerDivide(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, java.math.BigInteger)
   */
  public Object integerDivide(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, byte)
   */
  public Object integerDivide(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, char)
   */
  public Object integerDivide(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, double)
   */
  public Object integerDivide(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, float)
   */
  public Object integerDivide(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, int)
   */
  public Object integerDivide(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, long)
   */
  public Object integerDivide(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, short)
   */
  public Object integerDivide(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, java.math.BigDecimal)
   */
  public Object integerDivide(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, java.math.BigInteger)
   */
  public Object integerDivide(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, byte)
   */
  public Object integerDivide(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, char)
   */
  public Object integerDivide(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, double)
   */
  public Object integerDivide(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, float)
   */
  public Object integerDivide(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, int)
   */
  public Object integerDivide(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, long)
   */
  public Object integerDivide(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, short)
   */
  public Object integerDivide(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, java.math.BigDecimal)
   */
  public Object integerDivide(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, java.math.BigInteger)
   */
  public Object integerDivide(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, byte)
   */
  public Object integerDivide(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, char)
   */
  public Object integerDivide(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, double)
   */
  public Object integerDivide(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, float)
   */
  public Object integerDivide(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, int)
   */
  public Object integerDivide(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, long)
   */
  public Object integerDivide(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, short)
   */
  public Object integerDivide(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, java.math.BigDecimal)
   */
  public Object integerDivide(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, java.math.BigInteger)
   */
  public Object integerDivide(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, byte)
   */
  public Object integerDivide(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, char)
   */
  public Object integerDivide(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, double)
   */
  public Object integerDivide(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, float)
   */
  public Object integerDivide(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, int)
   */
  public Object integerDivide(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, long)
   */
  public Object integerDivide(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, short)
   */
  public Object integerDivide(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, java.math.BigDecimal)
   */
  public Object integerDivide(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, java.math.BigInteger)
   */
  public Object integerDivide(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, byte)
   */
  public Object integerDivide(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, char)
   */
  public Object integerDivide(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, double)
   */
  public Object integerDivide(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, float)
   */
  public Object integerDivide(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, int)
   */
  public Object integerDivide(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, long)
   */
  public Object integerDivide(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, short)
   */
  public Object integerDivide(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, java.math.BigDecimal)
   */
  public Object integerDivide(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, java.math.BigInteger)
   */
  public Object integerDivide(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, byte)
   */
  public Object integerDivide(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, char)
   */
  public Object integerDivide(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, double)
   */
  public Object integerDivide(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, float)
   */
  public Object integerDivide(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, int)
   */
  public Object integerDivide(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, long)
   */
  public Object integerDivide(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, short)
   */
  public Object integerDivide(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, java.math.BigDecimal)
   */
  public Object integerDivide(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, java.math.BigInteger)
   */
  public Object integerDivide(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, byte)
   */
  public Object integerDivide(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, char)
   */
  public Object integerDivide(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, double)
   */
  public Object integerDivide(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, float)
   */
  public Object integerDivide(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, int)
   */
  public Object integerDivide(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, long)
   */
  public Object integerDivide(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, short)
   */
  public Object integerDivide(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, java.math.BigDecimal)
   */
  public Object integerDivide(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, java.math.BigInteger)
   */
  public Object integerDivide(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, byte)
   */
  public Object integerDivide(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, char)
   */
  public Object integerDivide(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, double)
   */
  public Object integerDivide(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, float)
   */
  public Object integerDivide(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, int)
   */
  public Object integerDivide(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, long)
   */
  public Object integerDivide(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#integerDivide(java.lang.Object, java.lang.Object)
   */
  public Object integerDivide(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, short)
   */
  public Object integerDivide(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, java.math.BigDecimal)
   */
  public Object integerDivide(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, java.math.BigInteger)
   */
  public Object integerDivide(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, byte)
   */
  public Object integerDivide(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, char)
   */
  public Object integerDivide(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, double)
   */
  public Object integerDivide(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, float)
   */
  public Object integerDivide(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, int)
   */
  public Object integerDivide(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, long)
   */
  public Object integerDivide(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, short)
   */
  public Object integerDivide(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object integerDivideEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object integerDivideEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, byte)
   */
  public Object integerDivideEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, char)
   */
  public Object integerDivideEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, double)
   */
  public Object integerDivideEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, float)
   */
  public Object integerDivideEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, int)
   */
  public Object integerDivideEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, long)
   */
  public Object integerDivideEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, short)
   */
  public Object integerDivideEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object integerDivideEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object integerDivideEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, byte)
   */
  public Object integerDivideEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, char)
   */
  public Object integerDivideEquals(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, double)
   */
  public Object integerDivideEquals(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, float)
   */
  public Object integerDivideEquals(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, int)
   */
  public Object integerDivideEquals(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, long)
   */
  public Object integerDivideEquals(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, short)
   */
  public Object integerDivideEquals(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, java.math.BigDecimal)
   */
  public Object integerDivideEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, java.math.BigInteger)
   */
  public Object integerDivideEquals(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, byte)
   */
  public Object integerDivideEquals(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, char)
   */
  public Object integerDivideEquals(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, double)
   */
  public Object integerDivideEquals(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, float)
   */
  public Object integerDivideEquals(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, int)
   */
  public Object integerDivideEquals(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, long)
   */
  public Object integerDivideEquals(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, short)
   */
  public Object integerDivideEquals(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, java.math.BigDecimal)
   */
  public Object integerDivideEquals(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, java.math.BigInteger)
   */
  public Object integerDivideEquals(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, byte)
   */
  public Object integerDivideEquals(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, char)
   */
  public Object integerDivideEquals(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, double)
   */
  public Object integerDivideEquals(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, float)
   */
  public Object integerDivideEquals(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, int)
   */
  public Object integerDivideEquals(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, long)
   */
  public Object integerDivideEquals(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, short)
   */
  public Object integerDivideEquals(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, java.math.BigDecimal)
   */
  public Object integerDivideEquals(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, java.math.BigInteger)
   */
  public Object integerDivideEquals(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, byte)
   */
  public Object integerDivideEquals(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, char)
   */
  public Object integerDivideEquals(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, double)
   */
  public Object integerDivideEquals(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, float)
   */
  public Object integerDivideEquals(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, int)
   */
  public Object integerDivideEquals(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, long)
   */
  public Object integerDivideEquals(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, short)
   */
  public Object integerDivideEquals(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, java.math.BigDecimal)
   */
  public Object integerDivideEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, java.math.BigInteger)
   */
  public Object integerDivideEquals(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, byte)
   */
  public Object integerDivideEquals(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, char)
   */
  public Object integerDivideEquals(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, double)
   */
  public Object integerDivideEquals(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, float)
   */
  public Object integerDivideEquals(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, int)
   */
  public Object integerDivideEquals(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, long)
   */
  public Object integerDivideEquals(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, short)
   */
  public Object integerDivideEquals(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, java.math.BigDecimal)
   */
  public Object integerDivideEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, java.math.BigInteger)
   */
  public Object integerDivideEquals(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, byte)
   */
  public Object integerDivideEquals(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, char)
   */
  public Object integerDivideEquals(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, double)
   */
  public Object integerDivideEquals(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, float)
   */
  public Object integerDivideEquals(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, int)
   */
  public Object integerDivideEquals(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, long)
   */
  public Object integerDivideEquals(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, short)
   */
  public Object integerDivideEquals(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, java.math.BigDecimal)
   */
  public Object integerDivideEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, java.math.BigInteger)
   */
  public Object integerDivideEquals(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, byte)
   */
  public Object integerDivideEquals(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, char)
   */
  public Object integerDivideEquals(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, double)
   */
  public Object integerDivideEquals(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, float)
   */
  public Object integerDivideEquals(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, int)
   */
  public Object integerDivideEquals(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, long)
   */
  public Object integerDivideEquals(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, short)
   */
  public Object integerDivideEquals(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, java.math.BigDecimal)
   */
  public Object integerDivideEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object integerDivideEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, byte)
   */
  public Object integerDivideEquals(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, char)
   */
  public Object integerDivideEquals(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, double)
   */
  public Object integerDivideEquals(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, float)
   */
  public Object integerDivideEquals(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, int)
   */
  public Object integerDivideEquals(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, long)
   */
  public Object integerDivideEquals(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#integerDivideEquals(java.lang.Object, java.lang.Object)
   */
  public Object integerDivideEquals(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, short)
   */
  public Object integerDivideEquals(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, java.math.BigDecimal)
   */
  public Object integerDivideEquals(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, java.math.BigInteger)
   */
  public Object integerDivideEquals(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, byte)
   */
  public Object integerDivideEquals(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, char)
   */
  public Object integerDivideEquals(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, double)
   */
  public Object integerDivideEquals(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, float)
   */
  public Object integerDivideEquals(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, int)
   */
  public Object integerDivideEquals(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, long)
   */
  public Object integerDivideEquals(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, short)
   */
  public Object integerDivideEquals(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#calculateConversionCost(java.lang.Class)
   */
  public int calculateConversionCost(final Class parameterType) {
    return this.delegate.getRuntimeMetaClass().calculateConversionCost(parameterType);
  }

  /**
   * @param theClass
   * @param arguments
   * @return
   * @see ng.runtime.MetaClass#invokeConstructor(java.lang.Class, java.lang.Object[])
   */
  public Object invokeConstructor(final Class theClass, final Object[] arguments) throws Throwable {
    return this.delegate.getRuntimeMetaClass().invokeConstructor(theClass, arguments);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    return this.delegate.getRuntimeMetaClass().invokeMethodQuick(this.instance, methodName, p1, p2, p3, p4);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final Object p1, final Object p2, final Object p3) throws Throwable {
    return this.delegate.getRuntimeMetaClass().invokeMethodQuick(this.instance, methodName, p1, p2, p3);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final Object p1, final Object p2) throws Throwable {
    return this.delegate.getRuntimeMetaClass().invokeMethodQuick(this.instance, methodName, p1, p2);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final Object p1) throws Throwable {
    return this.delegate.getRuntimeMetaClass().invokeMethodQuick(this.instance, methodName, p1);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String, boolean)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final boolean p1) throws Throwable {
    return this.delegate.invokeMethodQuick(instance, methodName, p1);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String, char)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final char p1) throws Throwable {
    return this.delegate.invokeMethodQuick(instance, methodName, p1);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String, byte)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final byte p1) throws Throwable {
    return this.delegate.invokeMethodQuick(instance, methodName, p1);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String, short)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final short p1) throws Throwable {
    return this.delegate.invokeMethodQuick(instance, methodName, p1);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String, int)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final int p1) throws Throwable {
    return this.delegate.invokeMethodQuick(instance, methodName, p1);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String, long)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final long p1) throws Throwable {
    return this.delegate.invokeMethodQuick(instance, methodName, p1);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String, float)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final float p1) throws Throwable {
    return this.delegate.invokeMethodQuick(instance, methodName, p1);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String, double)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final double p1) throws Throwable {
    return this.delegate.invokeMethodQuick(instance, methodName, p1);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String, java.math.BigInteger)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final BigInteger p1) throws Throwable {
    return this.delegate.invokeMethodQuick(instance, methodName, p1);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String, java.math.BigDecimal)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final BigDecimal p1) throws Throwable {
    return this.delegate.invokeMethodQuick(instance, methodName, p1);
  }

  /**
   * @param instance
   * @param methodName
   * @param arguments
   * @return
   * @see ng.runtime.MetaClass#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object[])
   */
  public Object invokeMethod(final Object instance, final String methodName, final Object[] arguments) throws Throwable {
    return this.delegate.getRuntimeMetaClass().invokeMethod(this.instance, methodName, arguments);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass[])
   */
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass[] argumentMetaClasses) {
    return this.delegate.getRuntimeMetaClass().selectMethod(currentSelection, methodName, argumentMetaClasses);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String)
   */
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final String methodName) {
    return this.delegate.getRuntimeMetaClass().selectMethod(currentSelection, methodName);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass p1) {
    return this.delegate.getRuntimeMetaClass().selectMethod(currentSelection, methodName, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass p1, final RuntimeMetaClass p2) {
    return this.delegate.getRuntimeMetaClass().selectMethod(currentSelection, methodName, p1, p2);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass p1, final RuntimeMetaClass p2, final RuntimeMetaClass p3) {
    return this.delegate.getRuntimeMetaClass().selectMethod(currentSelection, methodName, p1, p2, p3);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass p1, final RuntimeMetaClass p2, final RuntimeMetaClass p3, final RuntimeMetaClass p4) {
    return this.delegate.getRuntimeMetaClass().selectMethod(currentSelection, methodName, p1, p2, p3, p4);
  }

  /**
   * @param instance
   * @param methodName
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName) throws Throwable {
    return this.delegate.getRuntimeMetaClass().invokeMethodQuick(this.instance, methodName);
  }

  /**
   * @param instance
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#isCase(java.lang.Object, java.lang.Object)
   */
  public Object isCase(final Object instance, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().isCase(this.instance, rhs);
  }

  /**
   * @param instance
   * @param type
   * @return
   * @see ng.runtime.MetaClass#isInstanceof(java.lang.Object, java.lang.Class)
   */
  public Object isInstanceof(final Object instance, final Class type) throws Throwable {
    return this.delegate.getRuntimeMetaClass().isInstanceof(this.instance, type);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.math.BigInteger, java.math.BigInteger)
   */
  public Object leftShift(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.math.BigInteger, byte)
   */
  public Object leftShift(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.math.BigInteger, char)
   */
  public Object leftShift(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.math.BigInteger, int)
   */
  public Object leftShift(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.math.BigInteger, long)
   */
  public Object leftShift(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.math.BigInteger, short)
   */
  public Object leftShift(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(byte, java.math.BigInteger)
   */
  public Object leftShift(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(byte, byte)
   */
  public Object leftShift(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(byte, char)
   */
  public Object leftShift(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(byte, int)
   */
  public Object leftShift(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(byte, long)
   */
  public Object leftShift(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(byte, short)
   */
  public Object leftShift(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(char, java.math.BigInteger)
   */
  public Object leftShift(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(char, byte)
   */
  public Object leftShift(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(char, char)
   */
  public Object leftShift(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(char, int)
   */
  public Object leftShift(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(char, long)
   */
  public Object leftShift(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(char, short)
   */
  public Object leftShift(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(int, java.math.BigInteger)
   */
  public Object leftShift(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(int, byte)
   */
  public Object leftShift(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(int, char)
   */
  public Object leftShift(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(int, int)
   */
  public Object leftShift(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(int, long)
   */
  public Object leftShift(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(int, short)
   */
  public Object leftShift(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(long, java.math.BigInteger)
   */
  public Object leftShift(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(long, byte)
   */
  public Object leftShift(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(long, char)
   */
  public Object leftShift(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(long, int)
   */
  public Object leftShift(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(long, long)
   */
  public Object leftShift(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(long, short)
   */
  public Object leftShift(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.lang.Object, java.math.BigInteger)
   */
  public Object leftShift(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().leftShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.lang.Object, byte)
   */
  public Object leftShift(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().leftShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.lang.Object, char)
   */
  public Object leftShift(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().leftShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.lang.Object, int)
   */
  public Object leftShift(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().leftShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.lang.Object, long)
   */
  public Object leftShift(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().leftShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#leftShift(java.lang.Object, java.lang.Object)
   */
  public Object leftShift(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().leftShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.lang.Object, short)
   */
  public Object leftShift(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().leftShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(short, java.math.BigInteger)
   */
  public Object leftShift(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(short, byte)
   */
  public Object leftShift(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(short, char)
   */
  public Object leftShift(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(short, int)
   */
  public Object leftShift(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(short, long)
   */
  public Object leftShift(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(short, short)
   */
  public Object leftShift(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object leftShiftEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.math.BigInteger, byte)
   */
  public Object leftShiftEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.math.BigInteger, char)
   */
  public Object leftShiftEquals(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.math.BigInteger, int)
   */
  public Object leftShiftEquals(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.math.BigInteger, long)
   */
  public Object leftShiftEquals(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.math.BigInteger, short)
   */
  public Object leftShiftEquals(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(byte, java.math.BigInteger)
   */
  public Object leftShiftEquals(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(byte, byte)
   */
  public Object leftShiftEquals(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(byte, char)
   */
  public Object leftShiftEquals(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(byte, int)
   */
  public Object leftShiftEquals(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(byte, long)
   */
  public Object leftShiftEquals(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(byte, short)
   */
  public Object leftShiftEquals(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(char, java.math.BigInteger)
   */
  public Object leftShiftEquals(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(char, byte)
   */
  public Object leftShiftEquals(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(char, char)
   */
  public Object leftShiftEquals(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(char, int)
   */
  public Object leftShiftEquals(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(char, long)
   */
  public Object leftShiftEquals(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(char, short)
   */
  public Object leftShiftEquals(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(int, java.math.BigInteger)
   */
  public Object leftShiftEquals(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(int, byte)
   */
  public Object leftShiftEquals(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(int, char)
   */
  public Object leftShiftEquals(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(int, int)
   */
  public Object leftShiftEquals(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(int, long)
   */
  public Object leftShiftEquals(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(int, short)
   */
  public Object leftShiftEquals(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(long, java.math.BigInteger)
   */
  public Object leftShiftEquals(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(long, byte)
   */
  public Object leftShiftEquals(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(long, char)
   */
  public Object leftShiftEquals(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(long, int)
   */
  public Object leftShiftEquals(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(long, long)
   */
  public Object leftShiftEquals(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(long, short)
   */
  public Object leftShiftEquals(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object leftShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().leftShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.lang.Object, byte)
   */
  public Object leftShiftEquals(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().leftShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.lang.Object, char)
   */
  public Object leftShiftEquals(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().leftShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.lang.Object, int)
   */
  public Object leftShiftEquals(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().leftShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.lang.Object, long)
   */
  public Object leftShiftEquals(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().leftShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#leftShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object leftShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().leftShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.lang.Object, short)
   */
  public Object leftShiftEquals(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().leftShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(short, java.math.BigInteger)
   */
  public Object leftShiftEquals(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(short, byte)
   */
  public Object leftShiftEquals(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(short, char)
   */
  public Object leftShiftEquals(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(short, int)
   */
  public Object leftShiftEquals(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(short, long)
   */
  public Object leftShiftEquals(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(short, short)
   */
  public Object leftShiftEquals(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object lessThan(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object lessThan(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, byte)
   */
  public Object lessThan(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, char)
   */
  public Object lessThan(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, double)
   */
  public Object lessThan(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, float)
   */
  public Object lessThan(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, int)
   */
  public Object lessThan(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, long)
   */
  public Object lessThan(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, short)
   */
  public Object lessThan(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object lessThan(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, java.math.BigInteger)
   */
  public Object lessThan(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, byte)
   */
  public Object lessThan(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, char)
   */
  public Object lessThan(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, double)
   */
  public Object lessThan(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, float)
   */
  public Object lessThan(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, int)
   */
  public Object lessThan(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, long)
   */
  public Object lessThan(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, short)
   */
  public Object lessThan(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, java.math.BigDecimal)
   */
  public Object lessThan(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, java.math.BigInteger)
   */
  public Object lessThan(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, byte)
   */
  public Object lessThan(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, char)
   */
  public Object lessThan(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, double)
   */
  public Object lessThan(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, float)
   */
  public Object lessThan(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, int)
   */
  public Object lessThan(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, long)
   */
  public Object lessThan(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, short)
   */
  public Object lessThan(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, java.math.BigDecimal)
   */
  public Object lessThan(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, java.math.BigInteger)
   */
  public Object lessThan(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, byte)
   */
  public Object lessThan(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, char)
   */
  public Object lessThan(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, double)
   */
  public Object lessThan(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, float)
   */
  public Object lessThan(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, int)
   */
  public Object lessThan(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, long)
   */
  public Object lessThan(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, short)
   */
  public Object lessThan(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, java.math.BigDecimal)
   */
  public Object lessThan(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, java.math.BigInteger)
   */
  public Object lessThan(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, byte)
   */
  public Object lessThan(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, char)
   */
  public Object lessThan(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, double)
   */
  public Object lessThan(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, float)
   */
  public Object lessThan(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, int)
   */
  public Object lessThan(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, long)
   */
  public Object lessThan(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, short)
   */
  public Object lessThan(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, java.math.BigDecimal)
   */
  public Object lessThan(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, java.math.BigInteger)
   */
  public Object lessThan(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, byte)
   */
  public Object lessThan(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, char)
   */
  public Object lessThan(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, double)
   */
  public Object lessThan(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, float)
   */
  public Object lessThan(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, int)
   */
  public Object lessThan(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, long)
   */
  public Object lessThan(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, short)
   */
  public Object lessThan(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, java.math.BigDecimal)
   */
  public Object lessThan(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, java.math.BigInteger)
   */
  public Object lessThan(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, byte)
   */
  public Object lessThan(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, char)
   */
  public Object lessThan(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, double)
   */
  public Object lessThan(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, float)
   */
  public Object lessThan(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, int)
   */
  public Object lessThan(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, long)
   */
  public Object lessThan(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, short)
   */
  public Object lessThan(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, java.math.BigDecimal)
   */
  public Object lessThan(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, java.math.BigInteger)
   */
  public Object lessThan(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, byte)
   */
  public Object lessThan(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, char)
   */
  public Object lessThan(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, double)
   */
  public Object lessThan(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, float)
   */
  public Object lessThan(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, int)
   */
  public Object lessThan(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, long)
   */
  public Object lessThan(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, short)
   */
  public Object lessThan(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, java.math.BigDecimal)
   */
  public Object lessThan(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, java.math.BigInteger)
   */
  public Object lessThan(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, byte)
   */
  public Object lessThan(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, char)
   */
  public Object lessThan(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, double)
   */
  public Object lessThan(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, float)
   */
  public Object lessThan(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, int)
   */
  public Object lessThan(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, long)
   */
  public Object lessThan(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#lessThan(java.lang.Object, java.lang.Object)
   */
  public Object lessThan(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, short)
   */
  public Object lessThan(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, java.math.BigDecimal)
   */
  public Object lessThan(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, java.math.BigInteger)
   */
  public Object lessThan(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, byte)
   */
  public Object lessThan(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, char)
   */
  public Object lessThan(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, double)
   */
  public Object lessThan(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, float)
   */
  public Object lessThan(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, int)
   */
  public Object lessThan(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, long)
   */
  public Object lessThan(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, short)
   */
  public Object lessThan(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object lessThanOrEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, byte)
   */
  public Object lessThanOrEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, char)
   */
  public Object lessThanOrEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, double)
   */
  public Object lessThanOrEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, float)
   */
  public Object lessThanOrEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, int)
   */
  public Object lessThanOrEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, long)
   */
  public Object lessThanOrEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, short)
   */
  public Object lessThanOrEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object lessThanOrEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, byte)
   */
  public Object lessThanOrEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, char)
   */
  public Object lessThanOrEquals(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, double)
   */
  public Object lessThanOrEquals(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, float)
   */
  public Object lessThanOrEquals(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, int)
   */
  public Object lessThanOrEquals(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, long)
   */
  public Object lessThanOrEquals(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, short)
   */
  public Object lessThanOrEquals(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, java.math.BigInteger)
   */
  public Object lessThanOrEquals(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, byte)
   */
  public Object lessThanOrEquals(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, char)
   */
  public Object lessThanOrEquals(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, double)
   */
  public Object lessThanOrEquals(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, float)
   */
  public Object lessThanOrEquals(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, int)
   */
  public Object lessThanOrEquals(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, long)
   */
  public Object lessThanOrEquals(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, short)
   */
  public Object lessThanOrEquals(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, java.math.BigInteger)
   */
  public Object lessThanOrEquals(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, byte)
   */
  public Object lessThanOrEquals(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, char)
   */
  public Object lessThanOrEquals(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, double)
   */
  public Object lessThanOrEquals(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, float)
   */
  public Object lessThanOrEquals(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, int)
   */
  public Object lessThanOrEquals(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, long)
   */
  public Object lessThanOrEquals(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, short)
   */
  public Object lessThanOrEquals(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, java.math.BigInteger)
   */
  public Object lessThanOrEquals(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, byte)
   */
  public Object lessThanOrEquals(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, char)
   */
  public Object lessThanOrEquals(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, double)
   */
  public Object lessThanOrEquals(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, float)
   */
  public Object lessThanOrEquals(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, int)
   */
  public Object lessThanOrEquals(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, long)
   */
  public Object lessThanOrEquals(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, short)
   */
  public Object lessThanOrEquals(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, java.math.BigInteger)
   */
  public Object lessThanOrEquals(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, byte)
   */
  public Object lessThanOrEquals(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, char)
   */
  public Object lessThanOrEquals(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, double)
   */
  public Object lessThanOrEquals(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, float)
   */
  public Object lessThanOrEquals(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, int)
   */
  public Object lessThanOrEquals(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, long)
   */
  public Object lessThanOrEquals(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, short)
   */
  public Object lessThanOrEquals(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, java.math.BigInteger)
   */
  public Object lessThanOrEquals(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, byte)
   */
  public Object lessThanOrEquals(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, char)
   */
  public Object lessThanOrEquals(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, double)
   */
  public Object lessThanOrEquals(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, float)
   */
  public Object lessThanOrEquals(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, int)
   */
  public Object lessThanOrEquals(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, long)
   */
  public Object lessThanOrEquals(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, short)
   */
  public Object lessThanOrEquals(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, java.math.BigInteger)
   */
  public Object lessThanOrEquals(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, byte)
   */
  public Object lessThanOrEquals(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, char)
   */
  public Object lessThanOrEquals(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, double)
   */
  public Object lessThanOrEquals(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, float)
   */
  public Object lessThanOrEquals(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, int)
   */
  public Object lessThanOrEquals(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, long)
   */
  public Object lessThanOrEquals(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, short)
   */
  public Object lessThanOrEquals(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object lessThanOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, byte)
   */
  public Object lessThanOrEquals(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, char)
   */
  public Object lessThanOrEquals(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, double)
   */
  public Object lessThanOrEquals(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, float)
   */
  public Object lessThanOrEquals(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, int)
   */
  public Object lessThanOrEquals(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, long)
   */
  public Object lessThanOrEquals(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#lessThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object lessThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, short)
   */
  public Object lessThanOrEquals(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, java.math.BigInteger)
   */
  public Object lessThanOrEquals(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, byte)
   */
  public Object lessThanOrEquals(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, char)
   */
  public Object lessThanOrEquals(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, double)
   */
  public Object lessThanOrEquals(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, float)
   */
  public Object lessThanOrEquals(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, int)
   */
  public Object lessThanOrEquals(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, long)
   */
  public Object lessThanOrEquals(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, short)
   */
  public Object lessThanOrEquals(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigDecimal, java.math.BigDecimal)
   */
  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigDecimal, java.math.BigInteger)
   */
  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigDecimal, byte)
   */
  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigDecimal, char)
   */
  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigDecimal, double)
   */
  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigDecimal, float)
   */
  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigDecimal, int)
   */
  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigDecimal, long)
   */
  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigDecimal, short)
   */
  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigInteger, java.math.BigDecimal)
   */
  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigInteger, java.math.BigInteger)
   */
  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigInteger, byte)
   */
  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigInteger, char)
   */
  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigInteger, double)
   */
  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigInteger, float)
   */
  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigInteger, int)
   */
  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigInteger, long)
   */
  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.math.BigInteger, short)
   */
  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(byte, java.math.BigDecimal)
   */
  public boolean lessThanOrEqualsBoolean(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(byte, java.math.BigInteger)
   */
  public boolean lessThanOrEqualsBoolean(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(byte, byte)
   */
  public boolean lessThanOrEqualsBoolean(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(byte, char)
   */
  public boolean lessThanOrEqualsBoolean(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(byte, double)
   */
  public boolean lessThanOrEqualsBoolean(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(byte, float)
   */
  public boolean lessThanOrEqualsBoolean(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(byte, int)
   */
  public boolean lessThanOrEqualsBoolean(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(byte, long)
   */
  public boolean lessThanOrEqualsBoolean(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(byte, short)
   */
  public boolean lessThanOrEqualsBoolean(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(char, java.math.BigDecimal)
   */
  public boolean lessThanOrEqualsBoolean(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(char, java.math.BigInteger)
   */
  public boolean lessThanOrEqualsBoolean(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(char, byte)
   */
  public boolean lessThanOrEqualsBoolean(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(char, char)
   */
  public boolean lessThanOrEqualsBoolean(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(char, double)
   */
  public boolean lessThanOrEqualsBoolean(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(char, float)
   */
  public boolean lessThanOrEqualsBoolean(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(char, int)
   */
  public boolean lessThanOrEqualsBoolean(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(char, long)
   */
  public boolean lessThanOrEqualsBoolean(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(char, short)
   */
  public boolean lessThanOrEqualsBoolean(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(double, java.math.BigDecimal)
   */
  public boolean lessThanOrEqualsBoolean(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(double, java.math.BigInteger)
   */
  public boolean lessThanOrEqualsBoolean(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(double, byte)
   */
  public boolean lessThanOrEqualsBoolean(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(double, char)
   */
  public boolean lessThanOrEqualsBoolean(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(double, double)
   */
  public boolean lessThanOrEqualsBoolean(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(double, float)
   */
  public boolean lessThanOrEqualsBoolean(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(double, int)
   */
  public boolean lessThanOrEqualsBoolean(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(double, long)
   */
  public boolean lessThanOrEqualsBoolean(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(double, short)
   */
  public boolean lessThanOrEqualsBoolean(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(float, java.math.BigDecimal)
   */
  public boolean lessThanOrEqualsBoolean(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(float, java.math.BigInteger)
   */
  public boolean lessThanOrEqualsBoolean(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(float, byte)
   */
  public boolean lessThanOrEqualsBoolean(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(float, char)
   */
  public boolean lessThanOrEqualsBoolean(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(float, double)
   */
  public boolean lessThanOrEqualsBoolean(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(float, float)
   */
  public boolean lessThanOrEqualsBoolean(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(float, int)
   */
  public boolean lessThanOrEqualsBoolean(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(float, long)
   */
  public boolean lessThanOrEqualsBoolean(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(float, short)
   */
  public boolean lessThanOrEqualsBoolean(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(int, java.math.BigDecimal)
   */
  public boolean lessThanOrEqualsBoolean(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(int, java.math.BigInteger)
   */
  public boolean lessThanOrEqualsBoolean(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(int, byte)
   */
  public boolean lessThanOrEqualsBoolean(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(int, char)
   */
  public boolean lessThanOrEqualsBoolean(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(int, double)
   */
  public boolean lessThanOrEqualsBoolean(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(int, float)
   */
  public boolean lessThanOrEqualsBoolean(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(int, int)
   */
  public boolean lessThanOrEqualsBoolean(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(int, long)
   */
  public boolean lessThanOrEqualsBoolean(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(int, short)
   */
  public boolean lessThanOrEqualsBoolean(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(long, java.math.BigDecimal)
   */
  public boolean lessThanOrEqualsBoolean(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(long, java.math.BigInteger)
   */
  public boolean lessThanOrEqualsBoolean(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(long, byte)
   */
  public boolean lessThanOrEqualsBoolean(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(long, char)
   */
  public boolean lessThanOrEqualsBoolean(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(long, double)
   */
  public boolean lessThanOrEqualsBoolean(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(long, float)
   */
  public boolean lessThanOrEqualsBoolean(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(long, int)
   */
  public boolean lessThanOrEqualsBoolean(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(long, long)
   */
  public boolean lessThanOrEqualsBoolean(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(long, short)
   */
  public boolean lessThanOrEqualsBoolean(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.lang.Object, java.math.BigDecimal)
   */
  public boolean lessThanOrEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEqualsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.lang.Object, java.math.BigInteger)
   */
  public boolean lessThanOrEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEqualsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.lang.Object, byte)
   */
  public boolean lessThanOrEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEqualsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.lang.Object, char)
   */
  public boolean lessThanOrEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEqualsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.lang.Object, double)
   */
  public boolean lessThanOrEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEqualsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.lang.Object, float)
   */
  public boolean lessThanOrEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEqualsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.lang.Object, int)
   */
  public boolean lessThanOrEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEqualsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.lang.Object, long)
   */
  public boolean lessThanOrEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEqualsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.lang.Object, java.lang.Object)
   */
  public boolean lessThanOrEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEqualsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(java.lang.Object, short)
   */
  public boolean lessThanOrEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().lessThanOrEqualsBoolean(this.instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(short, java.math.BigDecimal)
   */
  public boolean lessThanOrEqualsBoolean(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(short, java.math.BigInteger)
   */
  public boolean lessThanOrEqualsBoolean(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(short, byte)
   */
  public boolean lessThanOrEqualsBoolean(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(short, char)
   */
  public boolean lessThanOrEqualsBoolean(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(short, double)
   */
  public boolean lessThanOrEqualsBoolean(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(short, float)
   */
  public boolean lessThanOrEqualsBoolean(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(short, int)
   */
  public boolean lessThanOrEqualsBoolean(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(short, long)
   */
  public boolean lessThanOrEqualsBoolean(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEqualsBoolean(short, short)
   */
  public boolean lessThanOrEqualsBoolean(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEqualsBoolean(java.math.BigDecimal, java.lang.Object)
   */
  public boolean reverseLessThanOrEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEqualsBoolean(lhs, this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEqualsBoolean(java.math.BigInteger, java.lang.Object)
   */
  public boolean reverseLessThanOrEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEqualsBoolean(lhs, this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEqualsBoolean(byte, java.lang.Object)
   */
  public boolean reverseLessThanOrEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEqualsBoolean(lhs, this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEqualsBoolean(char, java.lang.Object)
   */
  public boolean reverseLessThanOrEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEqualsBoolean(lhs, this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEqualsBoolean(double, java.lang.Object)
   */
  public boolean reverseLessThanOrEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEqualsBoolean(lhs, this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEqualsBoolean(float, java.lang.Object)
   */
  public boolean reverseLessThanOrEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEqualsBoolean(lhs, this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEqualsBoolean(int, java.lang.Object)
   */
  public boolean reverseLessThanOrEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEqualsBoolean(lhs, this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEqualsBoolean(long, java.lang.Object)
   */
  public boolean reverseLessThanOrEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEqualsBoolean(lhs, this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEqualsBoolean(short, java.lang.Object)
   */
  public boolean reverseLessThanOrEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEqualsBoolean(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(byte, java.math.BigInteger)
   */
  public Object logicalRightShift(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(byte, byte)
   */
  public Object logicalRightShift(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(byte, char)
   */
  public Object logicalRightShift(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(byte, int)
   */
  public Object logicalRightShift(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(byte, long)
   */
  public Object logicalRightShift(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(byte, short)
   */
  public Object logicalRightShift(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(char, java.math.BigInteger)
   */
  public Object logicalRightShift(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(char, byte)
   */
  public Object logicalRightShift(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(char, char)
   */
  public Object logicalRightShift(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(char, int)
   */
  public Object logicalRightShift(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(char, long)
   */
  public Object logicalRightShift(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(char, short)
   */
  public Object logicalRightShift(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(int, java.math.BigInteger)
   */
  public Object logicalRightShift(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(int, byte)
   */
  public Object logicalRightShift(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(int, char)
   */
  public Object logicalRightShift(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(int, int)
   */
  public Object logicalRightShift(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(int, long)
   */
  public Object logicalRightShift(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(int, short)
   */
  public Object logicalRightShift(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(long, java.math.BigInteger)
   */
  public Object logicalRightShift(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(long, byte)
   */
  public Object logicalRightShift(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(long, char)
   */
  public Object logicalRightShift(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(long, int)
   */
  public Object logicalRightShift(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(long, long)
   */
  public Object logicalRightShift(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(long, short)
   */
  public Object logicalRightShift(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(java.lang.Object, java.math.BigInteger)
   */
  public Object logicalRightShift(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().logicalRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(java.lang.Object, byte)
   */
  public Object logicalRightShift(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().logicalRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(java.lang.Object, char)
   */
  public Object logicalRightShift(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().logicalRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(java.lang.Object, int)
   */
  public Object logicalRightShift(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().logicalRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(java.lang.Object, long)
   */
  public Object logicalRightShift(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().logicalRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#logicalRightShift(java.lang.Object, java.lang.Object)
   */
  public Object logicalRightShift(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().logicalRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(java.lang.Object, short)
   */
  public Object logicalRightShift(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().logicalRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(short, java.math.BigInteger)
   */
  public Object logicalRightShift(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(short, byte)
   */
  public Object logicalRightShift(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(short, char)
   */
  public Object logicalRightShift(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(short, int)
   */
  public Object logicalRightShift(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(short, long)
   */
  public Object logicalRightShift(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(short, short)
   */
  public Object logicalRightShift(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(byte, java.math.BigInteger)
   */
  public Object logicalRightShiftEquals(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(byte, byte)
   */
  public Object logicalRightShiftEquals(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(byte, char)
   */
  public Object logicalRightShiftEquals(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(byte, int)
   */
  public Object logicalRightShiftEquals(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(byte, long)
   */
  public Object logicalRightShiftEquals(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(byte, short)
   */
  public Object logicalRightShiftEquals(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(char, java.math.BigInteger)
   */
  public Object logicalRightShiftEquals(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(char, byte)
   */
  public Object logicalRightShiftEquals(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(char, char)
   */
  public Object logicalRightShiftEquals(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(char, int)
   */
  public Object logicalRightShiftEquals(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(char, long)
   */
  public Object logicalRightShiftEquals(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(char, short)
   */
  public Object logicalRightShiftEquals(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(int, java.math.BigInteger)
   */
  public Object logicalRightShiftEquals(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(int, byte)
   */
  public Object logicalRightShiftEquals(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(int, char)
   */
  public Object logicalRightShiftEquals(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(int, int)
   */
  public Object logicalRightShiftEquals(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(int, long)
   */
  public Object logicalRightShiftEquals(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(int, short)
   */
  public Object logicalRightShiftEquals(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(long, java.math.BigInteger)
   */
  public Object logicalRightShiftEquals(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(long, byte)
   */
  public Object logicalRightShiftEquals(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(long, char)
   */
  public Object logicalRightShiftEquals(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(long, int)
   */
  public Object logicalRightShiftEquals(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(long, long)
   */
  public Object logicalRightShiftEquals(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(long, short)
   */
  public Object logicalRightShiftEquals(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object logicalRightShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().logicalRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(java.lang.Object, byte)
   */
  public Object logicalRightShiftEquals(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().logicalRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(java.lang.Object, char)
   */
  public Object logicalRightShiftEquals(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().logicalRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(java.lang.Object, int)
   */
  public Object logicalRightShiftEquals(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().logicalRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(java.lang.Object, long)
   */
  public Object logicalRightShiftEquals(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().logicalRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#logicalRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object logicalRightShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().logicalRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(java.lang.Object, short)
   */
  public Object logicalRightShiftEquals(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().logicalRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(short, java.math.BigInteger)
   */
  public Object logicalRightShiftEquals(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(short, byte)
   */
  public Object logicalRightShiftEquals(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(short, char)
   */
  public Object logicalRightShiftEquals(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(short, int)
   */
  public Object logicalRightShiftEquals(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(short, long)
   */
  public Object logicalRightShiftEquals(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(short, short)
   */
  public Object logicalRightShiftEquals(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object multiply(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object multiply(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, byte)
   */
  public Object multiply(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, char)
   */
  public Object multiply(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, double)
   */
  public Object multiply(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, float)
   */
  public Object multiply(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, int)
   */
  public Object multiply(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, long)
   */
  public Object multiply(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, short)
   */
  public Object multiply(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object multiply(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, java.math.BigInteger)
   */
  public Object multiply(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, byte)
   */
  public Object multiply(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, char)
   */
  public Object multiply(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, double)
   */
  public Object multiply(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, float)
   */
  public Object multiply(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, int)
   */
  public Object multiply(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, long)
   */
  public Object multiply(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, short)
   */
  public Object multiply(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, java.math.BigDecimal)
   */
  public Object multiply(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, java.math.BigInteger)
   */
  public Object multiply(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, byte)
   */
  public Object multiply(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, char)
   */
  public Object multiply(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, double)
   */
  public Object multiply(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, float)
   */
  public Object multiply(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, int)
   */
  public Object multiply(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, long)
   */
  public Object multiply(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, short)
   */
  public Object multiply(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, java.math.BigDecimal)
   */
  public Object multiply(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, java.math.BigInteger)
   */
  public Object multiply(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, byte)
   */
  public Object multiply(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, char)
   */
  public Object multiply(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, double)
   */
  public Object multiply(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, float)
   */
  public Object multiply(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, int)
   */
  public Object multiply(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, long)
   */
  public Object multiply(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, short)
   */
  public Object multiply(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, java.math.BigDecimal)
   */
  public Object multiply(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, java.math.BigInteger)
   */
  public Object multiply(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, byte)
   */
  public Object multiply(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, char)
   */
  public Object multiply(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, double)
   */
  public Object multiply(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, float)
   */
  public Object multiply(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, int)
   */
  public Object multiply(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, long)
   */
  public Object multiply(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, short)
   */
  public Object multiply(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, java.math.BigDecimal)
   */
  public Object multiply(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, java.math.BigInteger)
   */
  public Object multiply(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, byte)
   */
  public Object multiply(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, char)
   */
  public Object multiply(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, double)
   */
  public Object multiply(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, float)
   */
  public Object multiply(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, int)
   */
  public Object multiply(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, long)
   */
  public Object multiply(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, short)
   */
  public Object multiply(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, java.math.BigDecimal)
   */
  public Object multiply(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, java.math.BigInteger)
   */
  public Object multiply(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, byte)
   */
  public Object multiply(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, char)
   */
  public Object multiply(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, double)
   */
  public Object multiply(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, float)
   */
  public Object multiply(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, int)
   */
  public Object multiply(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, long)
   */
  public Object multiply(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, short)
   */
  public Object multiply(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, java.math.BigDecimal)
   */
  public Object multiply(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, java.math.BigInteger)
   */
  public Object multiply(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, byte)
   */
  public Object multiply(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, char)
   */
  public Object multiply(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, double)
   */
  public Object multiply(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, float)
   */
  public Object multiply(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, int)
   */
  public Object multiply(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, long)
   */
  public Object multiply(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, short)
   */
  public Object multiply(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, java.math.BigDecimal)
   */
  public Object multiply(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, java.math.BigInteger)
   */
  public Object multiply(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, byte)
   */
  public Object multiply(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, char)
   */
  public Object multiply(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, double)
   */
  public Object multiply(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, float)
   */
  public Object multiply(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, int)
   */
  public Object multiply(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, long)
   */
  public Object multiply(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#multiply(java.lang.Object, java.lang.Object)
   */
  public Object multiply(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, short)
   */
  public Object multiply(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, java.math.BigDecimal)
   */
  public Object multiply(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, java.math.BigInteger)
   */
  public Object multiply(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, byte)
   */
  public Object multiply(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, char)
   */
  public Object multiply(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, double)
   */
  public Object multiply(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, float)
   */
  public Object multiply(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, int)
   */
  public Object multiply(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, long)
   */
  public Object multiply(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, short)
   */
  public Object multiply(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object multiplyEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object multiplyEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, byte)
   */
  public Object multiplyEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, char)
   */
  public Object multiplyEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, double)
   */
  public Object multiplyEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, float)
   */
  public Object multiplyEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, int)
   */
  public Object multiplyEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, long)
   */
  public Object multiplyEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, short)
   */
  public Object multiplyEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object multiplyEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object multiplyEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, byte)
   */
  public Object multiplyEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, char)
   */
  public Object multiplyEquals(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, double)
   */
  public Object multiplyEquals(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, float)
   */
  public Object multiplyEquals(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, int)
   */
  public Object multiplyEquals(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, long)
   */
  public Object multiplyEquals(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, short)
   */
  public Object multiplyEquals(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, java.math.BigDecimal)
   */
  public Object multiplyEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, java.math.BigInteger)
   */
  public Object multiplyEquals(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, byte)
   */
  public Object multiplyEquals(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, char)
   */
  public Object multiplyEquals(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, double)
   */
  public Object multiplyEquals(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, float)
   */
  public Object multiplyEquals(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, int)
   */
  public Object multiplyEquals(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, long)
   */
  public Object multiplyEquals(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, short)
   */
  public Object multiplyEquals(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, java.math.BigDecimal)
   */
  public Object multiplyEquals(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, java.math.BigInteger)
   */
  public Object multiplyEquals(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, byte)
   */
  public Object multiplyEquals(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, char)
   */
  public Object multiplyEquals(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, double)
   */
  public Object multiplyEquals(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, float)
   */
  public Object multiplyEquals(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, int)
   */
  public Object multiplyEquals(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, long)
   */
  public Object multiplyEquals(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, short)
   */
  public Object multiplyEquals(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, java.math.BigDecimal)
   */
  public Object multiplyEquals(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, java.math.BigInteger)
   */
  public Object multiplyEquals(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, byte)
   */
  public Object multiplyEquals(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, char)
   */
  public Object multiplyEquals(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, double)
   */
  public Object multiplyEquals(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, float)
   */
  public Object multiplyEquals(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, int)
   */
  public Object multiplyEquals(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, long)
   */
  public Object multiplyEquals(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, short)
   */
  public Object multiplyEquals(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, java.math.BigDecimal)
   */
  public Object multiplyEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, java.math.BigInteger)
   */
  public Object multiplyEquals(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, byte)
   */
  public Object multiplyEquals(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, char)
   */
  public Object multiplyEquals(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, double)
   */
  public Object multiplyEquals(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, float)
   */
  public Object multiplyEquals(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, int)
   */
  public Object multiplyEquals(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, long)
   */
  public Object multiplyEquals(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, short)
   */
  public Object multiplyEquals(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, java.math.BigDecimal)
   */
  public Object multiplyEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, java.math.BigInteger)
   */
  public Object multiplyEquals(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, byte)
   */
  public Object multiplyEquals(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, char)
   */
  public Object multiplyEquals(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, double)
   */
  public Object multiplyEquals(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, float)
   */
  public Object multiplyEquals(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, int)
   */
  public Object multiplyEquals(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, long)
   */
  public Object multiplyEquals(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, short)
   */
  public Object multiplyEquals(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, java.math.BigDecimal)
   */
  public Object multiplyEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, java.math.BigInteger)
   */
  public Object multiplyEquals(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, byte)
   */
  public Object multiplyEquals(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, char)
   */
  public Object multiplyEquals(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, double)
   */
  public Object multiplyEquals(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, float)
   */
  public Object multiplyEquals(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, int)
   */
  public Object multiplyEquals(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, long)
   */
  public Object multiplyEquals(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, short)
   */
  public Object multiplyEquals(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, java.math.BigDecimal)
   */
  public Object multiplyEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object multiplyEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, byte)
   */
  public Object multiplyEquals(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, char)
   */
  public Object multiplyEquals(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, double)
   */
  public Object multiplyEquals(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, float)
   */
  public Object multiplyEquals(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, int)
   */
  public Object multiplyEquals(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, long)
   */
  public Object multiplyEquals(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#multiplyEquals(java.lang.Object, java.lang.Object)
   */
  public Object multiplyEquals(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, short)
   */
  public Object multiplyEquals(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, java.math.BigDecimal)
   */
  public Object multiplyEquals(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, java.math.BigInteger)
   */
  public Object multiplyEquals(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, byte)
   */
  public Object multiplyEquals(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, char)
   */
  public Object multiplyEquals(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, double)
   */
  public Object multiplyEquals(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, float)
   */
  public Object multiplyEquals(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, int)
   */
  public Object multiplyEquals(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, long)
   */
  public Object multiplyEquals(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, short)
   */
  public Object multiplyEquals(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#not(boolean)
   */
  public Object not(final boolean instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param operand
   * @return
   * @see ng.runtime.MetaClass#not(java.lang.Object)
   */
  public Object not(final Object operand) throws Throwable {
    return this.delegate.getRuntimeMetaClass().not(this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object notEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object notEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, byte)
   */
  public Object notEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, char)
   */
  public Object notEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, double)
   */
  public Object notEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, float)
   */
  public Object notEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, int)
   */
  public Object notEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, long)
   */
  public Object notEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, short)
   */
  public Object notEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object notEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object notEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, byte)
   */
  public Object notEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, char)
   */
  public Object notEquals(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, double)
   */
  public Object notEquals(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, float)
   */
  public Object notEquals(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, int)
   */
  public Object notEquals(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, long)
   */
  public Object notEquals(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, short)
   */
  public Object notEquals(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, java.math.BigDecimal)
   */
  public Object notEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, java.math.BigInteger)
   */
  public Object notEquals(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, byte)
   */
  public Object notEquals(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, char)
   */
  public Object notEquals(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, double)
   */
  public Object notEquals(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, float)
   */
  public Object notEquals(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, int)
   */
  public Object notEquals(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, long)
   */
  public Object notEquals(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, short)
   */
  public Object notEquals(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, java.math.BigDecimal)
   */
  public Object notEquals(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, java.math.BigInteger)
   */
  public Object notEquals(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, byte)
   */
  public Object notEquals(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, char)
   */
  public Object notEquals(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, double)
   */
  public Object notEquals(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, float)
   */
  public Object notEquals(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, int)
   */
  public Object notEquals(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, long)
   */
  public Object notEquals(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, short)
   */
  public Object notEquals(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, java.math.BigDecimal)
   */
  public Object notEquals(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, java.math.BigInteger)
   */
  public Object notEquals(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, byte)
   */
  public Object notEquals(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, char)
   */
  public Object notEquals(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, double)
   */
  public Object notEquals(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, float)
   */
  public Object notEquals(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, int)
   */
  public Object notEquals(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, long)
   */
  public Object notEquals(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, short)
   */
  public Object notEquals(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, java.math.BigDecimal)
   */
  public Object notEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, java.math.BigInteger)
   */
  public Object notEquals(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, byte)
   */
  public Object notEquals(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, char)
   */
  public Object notEquals(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, double)
   */
  public Object notEquals(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, float)
   */
  public Object notEquals(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, int)
   */
  public Object notEquals(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, long)
   */
  public Object notEquals(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, short)
   */
  public Object notEquals(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, java.math.BigDecimal)
   */
  public Object notEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, java.math.BigInteger)
   */
  public Object notEquals(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, byte)
   */
  public Object notEquals(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, char)
   */
  public Object notEquals(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, double)
   */
  public Object notEquals(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, float)
   */
  public Object notEquals(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, int)
   */
  public Object notEquals(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, long)
   */
  public Object notEquals(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, short)
   */
  public Object notEquals(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, java.math.BigDecimal)
   */
  public Object notEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, java.math.BigInteger)
   */
  public Object notEquals(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, byte)
   */
  public Object notEquals(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, char)
   */
  public Object notEquals(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, double)
   */
  public Object notEquals(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, float)
   */
  public Object notEquals(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, int)
   */
  public Object notEquals(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, long)
   */
  public Object notEquals(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, short)
   */
  public Object notEquals(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, java.math.BigDecimal)
   */
  public Object notEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object notEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, byte)
   */
  public Object notEquals(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, char)
   */
  public Object notEquals(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, double)
   */
  public Object notEquals(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, float)
   */
  public Object notEquals(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, int)
   */
  public Object notEquals(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, long)
   */
  public Object notEquals(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#notEquals(java.lang.Object, java.lang.Object)
   */
  public Object notEquals(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, short)
   */
  public Object notEquals(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, java.math.BigDecimal)
   */
  public Object notEquals(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, java.math.BigInteger)
   */
  public Object notEquals(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, byte)
   */
  public Object notEquals(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, char)
   */
  public Object notEquals(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, double)
   */
  public Object notEquals(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, float)
   */
  public Object notEquals(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, int)
   */
  public Object notEquals(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, long)
   */
  public Object notEquals(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, short)
   */
  public Object notEquals(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.math.BigInteger, java.math.BigInteger)
   */
  public Object or(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.math.BigInteger, byte)
   */
  public Object or(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.math.BigInteger, char)
   */
  public Object or(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.math.BigInteger, int)
   */
  public Object or(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.math.BigInteger, long)
   */
  public Object or(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.math.BigInteger, short)
   */
  public Object or(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(byte, java.math.BigInteger)
   */
  public Object or(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(byte, byte)
   */
  public Object or(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(byte, char)
   */
  public Object or(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(byte, int)
   */
  public Object or(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(byte, long)
   */
  public Object or(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(byte, short)
   */
  public Object or(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(char, java.math.BigInteger)
   */
  public Object or(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(char, byte)
   */
  public Object or(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(char, char)
   */
  public Object or(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(char, int)
   */
  public Object or(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(char, long)
   */
  public Object or(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(char, short)
   */
  public Object or(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(int, java.math.BigInteger)
   */
  public Object or(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(int, byte)
   */
  public Object or(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(int, char)
   */
  public Object or(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(int, int)
   */
  public Object or(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(int, long)
   */
  public Object or(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(int, short)
   */
  public Object or(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(long, java.math.BigInteger)
   */
  public Object or(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(long, byte)
   */
  public Object or(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(long, char)
   */
  public Object or(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(long, int)
   */
  public Object or(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(long, long)
   */
  public Object or(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(long, short)
   */
  public Object or(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.lang.Object, java.math.BigInteger)
   */
  public Object or(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().or(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.lang.Object, byte)
   */
  public Object or(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().or(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.lang.Object, char)
   */
  public Object or(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().or(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.lang.Object, int)
   */
  public Object or(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().or(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.lang.Object, long)
   */
  public Object or(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().or(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#or(java.lang.Object, java.lang.Object)
   */
  public Object or(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().or(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.lang.Object, short)
   */
  public Object or(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().or(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(short, java.math.BigInteger)
   */
  public Object or(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(short, byte)
   */
  public Object or(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(short, char)
   */
  public Object or(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(short, int)
   */
  public Object or(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(short, long)
   */
  public Object or(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(short, short)
   */
  public Object or(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object orEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.math.BigInteger, byte)
   */
  public Object orEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.math.BigInteger, char)
   */
  public Object orEquals(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.math.BigInteger, int)
   */
  public Object orEquals(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.math.BigInteger, long)
   */
  public Object orEquals(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.math.BigInteger, short)
   */
  public Object orEquals(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(byte, java.math.BigInteger)
   */
  public Object orEquals(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(byte, byte)
   */
  public Object orEquals(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(byte, char)
   */
  public Object orEquals(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(byte, int)
   */
  public Object orEquals(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(byte, long)
   */
  public Object orEquals(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(byte, short)
   */
  public Object orEquals(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(char, java.math.BigInteger)
   */
  public Object orEquals(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(char, byte)
   */
  public Object orEquals(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(char, char)
   */
  public Object orEquals(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(char, int)
   */
  public Object orEquals(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(char, long)
   */
  public Object orEquals(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(char, short)
   */
  public Object orEquals(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(int, java.math.BigInteger)
   */
  public Object orEquals(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(int, byte)
   */
  public Object orEquals(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(int, char)
   */
  public Object orEquals(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(int, int)
   */
  public Object orEquals(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(int, long)
   */
  public Object orEquals(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(int, short)
   */
  public Object orEquals(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(long, java.math.BigInteger)
   */
  public Object orEquals(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(long, byte)
   */
  public Object orEquals(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(long, char)
   */
  public Object orEquals(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(long, int)
   */
  public Object orEquals(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(long, long)
   */
  public Object orEquals(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(long, short)
   */
  public Object orEquals(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object orEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().orEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.lang.Object, byte)
   */
  public Object orEquals(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().orEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.lang.Object, char)
   */
  public Object orEquals(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().orEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.lang.Object, int)
   */
  public Object orEquals(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().orEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.lang.Object, long)
   */
  public Object orEquals(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().orEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#orEquals(java.lang.Object, java.lang.Object)
   */
  public Object orEquals(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().orEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.lang.Object, short)
   */
  public Object orEquals(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().orEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(short, java.math.BigInteger)
   */
  public Object orEquals(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(short, byte)
   */
  public Object orEquals(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(short, char)
   */
  public Object orEquals(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(short, int)
   */
  public Object orEquals(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(short, long)
   */
  public Object orEquals(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(short, short)
   */
  public Object orEquals(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixDecrement(java.math.BigDecimal)
   */
  public Object postfixDecrement(final BigDecimal instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixDecrement(java.math.BigInteger)
   */
  public Object postfixDecrement(final BigInteger instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixDecrement(double)
   */
  public Object postfixDecrement(final double instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixDecrement(float)
   */
  public Object postfixDecrement(final float instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixDecrement(int)
   */
  public Object postfixDecrement(final int instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixDecrement(long)
   */
  public Object postfixDecrement(final long instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param operand
   * @return
   * @see ng.runtime.MetaClass#postfixDecrement(java.lang.Object)
   */
  public Object postfixDecrement(final Object operand) throws Throwable {
    return this.delegate.getRuntimeMetaClass().postfixDecrement(operand);
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixIncrement(java.math.BigDecimal)
   */
  public Object postfixIncrement(final BigDecimal instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixIncrement(java.math.BigInteger)
   */
  public Object postfixIncrement(final BigInteger instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixIncrement(double)
   */
  public Object postfixIncrement(final double instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixIncrement(float)
   */
  public Object postfixIncrement(final float instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixIncrement(int)
   */
  public Object postfixIncrement(final int instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixIncrement(long)
   */
  public Object postfixIncrement(final long instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param operand
   * @return
   * @see ng.runtime.MetaClass#postfixIncrement(java.lang.Object)
   */
  public Object postfixIncrement(final Object operand) throws Throwable {
    return this.delegate.getRuntimeMetaClass().postfixIncrement(operand);
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixDecrement(java.math.BigDecimal)
   */
  public Object prefixDecrement(final BigDecimal instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixDecrement(java.math.BigInteger)
   */
  public Object prefixDecrement(final BigInteger instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixDecrement(double)
   */
  public Object prefixDecrement(final double instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixDecrement(float)
   */
  public Object prefixDecrement(final float instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixDecrement(int)
   */
  public Object prefixDecrement(final int instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixDecrement(long)
   */
  public Object prefixDecrement(final long instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param operand
   * @return
   * @see ng.runtime.MetaClass#prefixDecrement(java.lang.Object)
   */
  public Object prefixDecrement(final Object operand) throws Throwable {
    return this.delegate.getRuntimeMetaClass().prefixDecrement(this.instance);
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixIncrement(java.math.BigDecimal)
   */
  public Object prefixIncrement(final BigDecimal instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixIncrement(java.math.BigInteger)
   */
  public Object prefixIncrement(final BigInteger instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixIncrement(double)
   */
  public Object prefixIncrement(final double instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixIncrement(float)
   */
  public Object prefixIncrement(final float instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixIncrement(int)
   */
  public Object prefixIncrement(final int instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixIncrement(long)
   */
  public Object prefixIncrement(final long instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param operand
   * @return
   * @see ng.runtime.MetaClass#prefixIncrement(java.lang.Object)
   */
  public Object prefixIncrement(final Object operand) throws Throwable {
    return this.delegate.getRuntimeMetaClass().prefixIncrement(this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#putAt(java.lang.Object, java.math.BigInteger)
   */
  public Object putAt(final Object instance, final BigInteger index) throws Throwable {
    return this.delegate.getRuntimeMetaClass().putAt(this.instance, index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#putAt(java.lang.Object, int)
   */
  public Object putAt(final Object instance, final int index) throws Throwable {
    return this.delegate.getRuntimeMetaClass().putAt(this.instance, index);
  }

  /**
   * @param instance
   * @param index
   * @return
   * @see ng.runtime.MetaClass#putAt(java.lang.Object, java.lang.Object)
   */
  public Object putAt(final Object instance, final Object index) throws Throwable {
    return this.delegate.getRuntimeMetaClass().putAt(this.instance, index);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.math.BigInteger, java.math.BigInteger)
   */
  public Object remainder(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.math.BigInteger, byte)
   */
  public Object remainder(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.math.BigInteger, char)
   */
  public Object remainder(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.math.BigInteger, int)
   */
  public Object remainder(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.math.BigInteger, long)
   */
  public Object remainder(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.math.BigInteger, short)
   */
  public Object remainder(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(byte, java.math.BigInteger)
   */
  public Object remainder(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(byte, byte)
   */
  public Object remainder(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(byte, char)
   */
  public Object remainder(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(byte, int)
   */
  public Object remainder(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(byte, long)
   */
  public Object remainder(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(byte, short)
   */
  public Object remainder(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(char, java.math.BigInteger)
   */
  public Object remainder(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(char, byte)
   */
  public Object remainder(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(char, char)
   */
  public Object remainder(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(char, int)
   */
  public Object remainder(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(char, long)
   */
  public Object remainder(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(char, short)
   */
  public Object remainder(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(int, java.math.BigInteger)
   */
  public Object remainder(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(int, byte)
   */
  public Object remainder(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(int, char)
   */
  public Object remainder(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(int, int)
   */
  public Object remainder(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(int, long)
   */
  public Object remainder(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(int, short)
   */
  public Object remainder(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(long, java.math.BigInteger)
   */
  public Object remainder(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(long, byte)
   */
  public Object remainder(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(long, char)
   */
  public Object remainder(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(long, int)
   */
  public Object remainder(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(long, long)
   */
  public Object remainder(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(long, short)
   */
  public Object remainder(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.lang.Object, java.math.BigInteger)
   */
  public Object remainder(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().remainder(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.lang.Object, byte)
   */
  public Object remainder(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().remainder(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.lang.Object, char)
   */
  public Object remainder(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().remainder(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.lang.Object, int)
   */
  public Object remainder(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().remainder(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.lang.Object, long)
   */
  public Object remainder(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().remainder(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#remainder(java.lang.Object, java.lang.Object)
   */
  public Object remainder(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().remainder(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.lang.Object, short)
   */
  public Object remainder(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().remainder(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(short, java.math.BigInteger)
   */
  public Object remainder(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(short, byte)
   */
  public Object remainder(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(short, char)
   */
  public Object remainder(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(short, int)
   */
  public Object remainder(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(short, long)
   */
  public Object remainder(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(short, short)
   */
  public Object remainder(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object remainderEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.math.BigInteger, byte)
   */
  public Object remainderEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.math.BigInteger, char)
   */
  public Object remainderEquals(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.math.BigInteger, int)
   */
  public Object remainderEquals(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.math.BigInteger, long)
   */
  public Object remainderEquals(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.math.BigInteger, short)
   */
  public Object remainderEquals(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(byte, java.math.BigInteger)
   */
  public Object remainderEquals(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(byte, byte)
   */
  public Object remainderEquals(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(byte, char)
   */
  public Object remainderEquals(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(byte, int)
   */
  public Object remainderEquals(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(byte, long)
   */
  public Object remainderEquals(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(byte, short)
   */
  public Object remainderEquals(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(char, java.math.BigInteger)
   */
  public Object remainderEquals(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(char, byte)
   */
  public Object remainderEquals(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(char, char)
   */
  public Object remainderEquals(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(char, int)
   */
  public Object remainderEquals(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(char, long)
   */
  public Object remainderEquals(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(char, short)
   */
  public Object remainderEquals(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(int, java.math.BigInteger)
   */
  public Object remainderEquals(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(int, byte)
   */
  public Object remainderEquals(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(int, char)
   */
  public Object remainderEquals(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(int, int)
   */
  public Object remainderEquals(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(int, long)
   */
  public Object remainderEquals(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(int, short)
   */
  public Object remainderEquals(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(long, java.math.BigInteger)
   */
  public Object remainderEquals(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(long, byte)
   */
  public Object remainderEquals(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(long, char)
   */
  public Object remainderEquals(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(long, int)
   */
  public Object remainderEquals(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(long, long)
   */
  public Object remainderEquals(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(long, short)
   */
  public Object remainderEquals(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object remainderEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().remainderEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.lang.Object, byte)
   */
  public Object remainderEquals(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().remainderEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.lang.Object, char)
   */
  public Object remainderEquals(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().remainderEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.lang.Object, int)
   */
  public Object remainderEquals(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().remainderEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.lang.Object, long)
   */
  public Object remainderEquals(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().remainderEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#remainderEquals(java.lang.Object, java.lang.Object)
   */
  public Object remainderEquals(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().remainderEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.lang.Object, short)
   */
  public Object remainderEquals(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().remainderEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(short, java.math.BigInteger)
   */
  public Object remainderEquals(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(short, byte)
   */
  public Object remainderEquals(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(short, char)
   */
  public Object remainderEquals(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(short, int)
   */
  public Object remainderEquals(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(short, long)
   */
  public Object remainderEquals(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(short, short)
   */
  public Object remainderEquals(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseAdd(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseAdd(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(byte, java.lang.Object)
   */
  public Object reverseAdd(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(char, java.lang.Object)
   */
  public Object reverseAdd(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(double, java.lang.Object)
   */
  public Object reverseAdd(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(float, java.lang.Object)
   */
  public Object reverseAdd(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(int, java.lang.Object)
   */
  public Object reverseAdd(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(long, java.lang.Object)
   */
  public Object reverseAdd(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(short, java.lang.Object)
   */
  public Object reverseAdd(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseAddEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseAddEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(byte, java.lang.Object)
   */
  public Object reverseAddEquals(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(char, java.lang.Object)
   */
  public Object reverseAddEquals(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(double, java.lang.Object)
   */
  public Object reverseAddEquals(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(float, java.lang.Object)
   */
  public Object reverseAddEquals(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(int, java.lang.Object)
   */
  public Object reverseAddEquals(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(long, java.lang.Object)
   */
  public Object reverseAddEquals(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(short, java.lang.Object)
   */
  public Object reverseAddEquals(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAnd(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseAnd(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAnd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAnd(byte, java.lang.Object)
   */
  public Object reverseAnd(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAnd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAnd(char, java.lang.Object)
   */
  public Object reverseAnd(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAnd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAnd(int, java.lang.Object)
   */
  public Object reverseAnd(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAnd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAnd(long, java.lang.Object)
   */
  public Object reverseAnd(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAnd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAnd(short, java.lang.Object)
   */
  public Object reverseAnd(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAnd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAndEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseAndEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAndEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAndEquals(byte, java.lang.Object)
   */
  public Object reverseAndEquals(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAndEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAndEquals(char, java.lang.Object)
   */
  public Object reverseAndEquals(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAndEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAndEquals(int, java.lang.Object)
   */
  public Object reverseAndEquals(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAndEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAndEquals(long, java.lang.Object)
   */
  public Object reverseAndEquals(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAndEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAndEquals(short, java.lang.Object)
   */
  public Object reverseAndEquals(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseAndEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShift(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseArithmeticRightShift(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShift(byte, java.lang.Object)
   */
  public Object reverseArithmeticRightShift(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShift(char, java.lang.Object)
   */
  public Object reverseArithmeticRightShift(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShift(int, java.lang.Object)
   */
  public Object reverseArithmeticRightShift(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShift(long, java.lang.Object)
   */
  public Object reverseArithmeticRightShift(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShift(short, java.lang.Object)
   */
  public Object reverseArithmeticRightShift(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShiftEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseArithmeticRightShiftEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShiftEquals(byte, java.lang.Object)
   */
  public Object reverseArithmeticRightShiftEquals(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShiftEquals(char, java.lang.Object)
   */
  public Object reverseArithmeticRightShiftEquals(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShiftEquals(int, java.lang.Object)
   */
  public Object reverseArithmeticRightShiftEquals(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShiftEquals(long, java.lang.Object)
   */
  public Object reverseArithmeticRightShiftEquals(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShiftEquals(short, java.lang.Object)
   */
  public Object reverseArithmeticRightShiftEquals(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseCompare(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseCompare(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(byte, java.lang.Object)
   */
  public Object reverseCompare(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(char, java.lang.Object)
   */
  public Object reverseCompare(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(double, java.lang.Object)
   */
  public Object reverseCompare(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(float, java.lang.Object)
   */
  public Object reverseCompare(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(int, java.lang.Object)
   */
  public Object reverseCompare(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(long, java.lang.Object)
   */
  public Object reverseCompare(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(short, java.lang.Object)
   */
  public Object reverseCompare(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseDivide(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseDivide(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(byte, java.lang.Object)
   */
  public Object reverseDivide(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(char, java.lang.Object)
   */
  public Object reverseDivide(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(double, java.lang.Object)
   */
  public Object reverseDivide(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(float, java.lang.Object)
   */
  public Object reverseDivide(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(int, java.lang.Object)
   */
  public Object reverseDivide(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(long, java.lang.Object)
   */
  public Object reverseDivide(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(short, java.lang.Object)
   */
  public Object reverseDivide(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseDivideEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseDivideEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(byte, java.lang.Object)
   */
  public Object reverseDivideEquals(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(char, java.lang.Object)
   */
  public Object reverseDivideEquals(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(double, java.lang.Object)
   */
  public Object reverseDivideEquals(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(float, java.lang.Object)
   */
  public Object reverseDivideEquals(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(int, java.lang.Object)
   */
  public Object reverseDivideEquals(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(long, java.lang.Object)
   */
  public Object reverseDivideEquals(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(short, java.lang.Object)
   */
  public Object reverseDivideEquals(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(byte, java.lang.Object)
   */
  public Object reverseEquals(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(char, java.lang.Object)
   */
  public Object reverseEquals(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(double, java.lang.Object)
   */
  public Object reverseEquals(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(float, java.lang.Object)
   */
  public Object reverseEquals(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(int, java.lang.Object)
   */
  public Object reverseEquals(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(long, java.lang.Object)
   */
  public Object reverseEquals(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(short, java.lang.Object)
   */
  public Object reverseEquals(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseGreaterThan(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseGreaterThan(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(byte, java.lang.Object)
   */
  public Object reverseGreaterThan(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(char, java.lang.Object)
   */
  public Object reverseGreaterThan(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(double, java.lang.Object)
   */
  public Object reverseGreaterThan(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(float, java.lang.Object)
   */
  public Object reverseGreaterThan(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(int, java.lang.Object)
   */
  public Object reverseGreaterThan(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(long, java.lang.Object)
   */
  public Object reverseGreaterThan(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(short, java.lang.Object)
   */
  public Object reverseGreaterThan(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(byte, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(char, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(double, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(float, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(int, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(long, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(short, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseIntegerDivide(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseIntegerDivide(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(byte, java.lang.Object)
   */
  public Object reverseIntegerDivide(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(char, java.lang.Object)
   */
  public Object reverseIntegerDivide(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(double, java.lang.Object)
   */
  public Object reverseIntegerDivide(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(float, java.lang.Object)
   */
  public Object reverseIntegerDivide(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(int, java.lang.Object)
   */
  public Object reverseIntegerDivide(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(long, java.lang.Object)
   */
  public Object reverseIntegerDivide(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(short, java.lang.Object)
   */
  public Object reverseIntegerDivide(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(byte, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(char, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(double, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(float, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(int, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(long, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(short, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShift(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseLeftShift(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLeftShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShift(byte, java.lang.Object)
   */
  public Object reverseLeftShift(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLeftShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShift(char, java.lang.Object)
   */
  public Object reverseLeftShift(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLeftShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShift(int, java.lang.Object)
   */
  public Object reverseLeftShift(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLeftShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShift(long, java.lang.Object)
   */
  public Object reverseLeftShift(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLeftShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShift(short, java.lang.Object)
   */
  public Object reverseLeftShift(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLeftShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShiftEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseLeftShiftEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLeftShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShiftEquals(byte, java.lang.Object)
   */
  public Object reverseLeftShiftEquals(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLeftShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShiftEquals(char, java.lang.Object)
   */
  public Object reverseLeftShiftEquals(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLeftShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShiftEquals(int, java.lang.Object)
   */
  public Object reverseLeftShiftEquals(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLeftShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShiftEquals(long, java.lang.Object)
   */
  public Object reverseLeftShiftEquals(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLeftShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShiftEquals(short, java.lang.Object)
   */
  public Object reverseLeftShiftEquals(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLeftShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseLessThan(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseLessThan(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(byte, java.lang.Object)
   */
  public Object reverseLessThan(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(char, java.lang.Object)
   */
  public Object reverseLessThan(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(double, java.lang.Object)
   */
  public Object reverseLessThan(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(float, java.lang.Object)
   */
  public Object reverseLessThan(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(int, java.lang.Object)
   */
  public Object reverseLessThan(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(long, java.lang.Object)
   */
  public Object reverseLessThan(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(short, java.lang.Object)
   */
  public Object reverseLessThan(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(byte, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(char, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(double, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(float, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(int, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(long, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(short, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShift(byte, java.lang.Object)
   */
  public Object reverseLogicalRightShift(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShift(char, java.lang.Object)
   */
  public Object reverseLogicalRightShift(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShift(int, java.lang.Object)
   */
  public Object reverseLogicalRightShift(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShift(long, java.lang.Object)
   */
  public Object reverseLogicalRightShift(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShift(short, java.lang.Object)
   */
  public Object reverseLogicalRightShift(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShiftEquals(byte, java.lang.Object)
   */
  public Object reverseLogicalRightShiftEquals(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShiftEquals(char, java.lang.Object)
   */
  public Object reverseLogicalRightShiftEquals(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShiftEquals(int, java.lang.Object)
   */
  public Object reverseLogicalRightShiftEquals(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShiftEquals(long, java.lang.Object)
   */
  public Object reverseLogicalRightShiftEquals(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShiftEquals(short, java.lang.Object)
   */
  public Object reverseLogicalRightShiftEquals(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseMultiply(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseMultiply(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(byte, java.lang.Object)
   */
  public Object reverseMultiply(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(char, java.lang.Object)
   */
  public Object reverseMultiply(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(double, java.lang.Object)
   */
  public Object reverseMultiply(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(float, java.lang.Object)
   */
  public Object reverseMultiply(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(int, java.lang.Object)
   */
  public Object reverseMultiply(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(long, java.lang.Object)
   */
  public Object reverseMultiply(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(short, java.lang.Object)
   */
  public Object reverseMultiply(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseMultiplyEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseMultiplyEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(byte, java.lang.Object)
   */
  public Object reverseMultiplyEquals(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(char, java.lang.Object)
   */
  public Object reverseMultiplyEquals(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(double, java.lang.Object)
   */
  public Object reverseMultiplyEquals(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(float, java.lang.Object)
   */
  public Object reverseMultiplyEquals(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(int, java.lang.Object)
   */
  public Object reverseMultiplyEquals(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(long, java.lang.Object)
   */
  public Object reverseMultiplyEquals(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(short, java.lang.Object)
   */
  public Object reverseMultiplyEquals(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseNotEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseNotEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(byte, java.lang.Object)
   */
  public Object reverseNotEquals(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(char, java.lang.Object)
   */
  public Object reverseNotEquals(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(double, java.lang.Object)
   */
  public Object reverseNotEquals(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(float, java.lang.Object)
   */
  public Object reverseNotEquals(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(int, java.lang.Object)
   */
  public Object reverseNotEquals(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(long, java.lang.Object)
   */
  public Object reverseNotEquals(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(short, java.lang.Object)
   */
  public Object reverseNotEquals(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOr(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseOr(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseOr(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOr(byte, java.lang.Object)
   */
  public Object reverseOr(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseOr(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOr(char, java.lang.Object)
   */
  public Object reverseOr(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseOr(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOr(int, java.lang.Object)
   */
  public Object reverseOr(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseOr(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOr(long, java.lang.Object)
   */
  public Object reverseOr(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseOr(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOr(short, java.lang.Object)
   */
  public Object reverseOr(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseOr(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOrEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOrEquals(byte, java.lang.Object)
   */
  public Object reverseOrEquals(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOrEquals(char, java.lang.Object)
   */
  public Object reverseOrEquals(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOrEquals(int, java.lang.Object)
   */
  public Object reverseOrEquals(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOrEquals(long, java.lang.Object)
   */
  public Object reverseOrEquals(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOrEquals(short, java.lang.Object)
   */
  public Object reverseOrEquals(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainder(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseRemainder(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseRemainder(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainder(byte, java.lang.Object)
   */
  public Object reverseRemainder(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseRemainder(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainder(char, java.lang.Object)
   */
  public Object reverseRemainder(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseRemainder(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainder(int, java.lang.Object)
   */
  public Object reverseRemainder(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseRemainder(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainder(long, java.lang.Object)
   */
  public Object reverseRemainder(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseRemainder(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainder(short, java.lang.Object)
   */
  public Object reverseRemainder(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseRemainder(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainderEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseRemainderEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseRemainderEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainderEquals(byte, java.lang.Object)
   */
  public Object reverseRemainderEquals(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseRemainderEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainderEquals(char, java.lang.Object)
   */
  public Object reverseRemainderEquals(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseRemainderEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainderEquals(int, java.lang.Object)
   */
  public Object reverseRemainderEquals(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseRemainderEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainderEquals(long, java.lang.Object)
   */
  public Object reverseRemainderEquals(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseRemainderEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainderEquals(short, java.lang.Object)
   */
  public Object reverseRemainderEquals(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseRemainderEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseSubtract(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseSubtract(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(byte, java.lang.Object)
   */
  public Object reverseSubtract(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(char, java.lang.Object)
   */
  public Object reverseSubtract(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(double, java.lang.Object)
   */
  public Object reverseSubtract(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(float, java.lang.Object)
   */
  public Object reverseSubtract(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(int, java.lang.Object)
   */
  public Object reverseSubtract(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(long, java.lang.Object)
   */
  public Object reverseSubtract(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(short, java.lang.Object)
   */
  public Object reverseSubtract(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseSubtractEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseSubtractEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(byte, java.lang.Object)
   */
  public Object reverseSubtractEquals(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(char, java.lang.Object)
   */
  public Object reverseSubtractEquals(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(double, java.lang.Object)
   */
  public Object reverseSubtractEquals(final double lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(float, java.lang.Object)
   */
  public Object reverseSubtractEquals(final float lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(int, java.lang.Object)
   */
  public Object reverseSubtractEquals(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(long, java.lang.Object)
   */
  public Object reverseSubtractEquals(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(short, java.lang.Object)
   */
  public Object reverseSubtractEquals(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXor(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseXor(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseXor(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXor(byte, java.lang.Object)
   */
  public Object reverseXor(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseXor(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXor(char, java.lang.Object)
   */
  public Object reverseXor(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseXor(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXor(int, java.lang.Object)
   */
  public Object reverseXor(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseXor(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXor(long, java.lang.Object)
   */
  public Object reverseXor(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseXor(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXor(short, java.lang.Object)
   */
  public Object reverseXor(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseXor(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXorEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseXorEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseXorEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXorEquals(byte, java.lang.Object)
   */
  public Object reverseXorEquals(final byte lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseXorEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXorEquals(char, java.lang.Object)
   */
  public Object reverseXorEquals(final char lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseXorEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXorEquals(int, java.lang.Object)
   */
  public Object reverseXorEquals(final int lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseXorEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXorEquals(long, java.lang.Object)
   */
  public Object reverseXorEquals(final long lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseXorEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXorEquals(short, java.lang.Object)
   */
  public Object reverseXorEquals(final short lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().reverseXorEquals(lhs, this.instance);
  }

  /**
   * @param instance
   * @param fieldName
   * @param newValue
   * @return
   * @see ng.runtime.MetaClass#setField(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setField(final Object instance, final String fieldName, final Object newValue) throws Throwable {
    return this.delegate.getRuntimeMetaClass().setField(this.instance, fieldName, newValue);
  }

  /**
   * @param internalMetaClass
   * @see ng.runtime.RuntimeMetaClass#setInternalMetaClass(ng.runtime.InternalMetaClass)
   */
  public void setInternalMetaClass(final InternalMetaClass internalMetaClass) {
    this.delegate.getRuntimeMetaClass().setInternalMetaClass(internalMetaClass);
  }

  /**
   * @param instance
   * @param propertyName
   * @param newValue
   * @return
   * @see ng.runtime.MetaClass#setProperty(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setProperty(final Object instance, final String propertyName, final Object newValue) throws Throwable {
    return this.delegate.getRuntimeMetaClass().setProperty(this.instance, propertyName, newValue);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object subtract(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object subtract(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, byte)
   */
  public Object subtract(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, char)
   */
  public Object subtract(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, double)
   */
  public Object subtract(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, float)
   */
  public Object subtract(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, int)
   */
  public Object subtract(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, long)
   */
  public Object subtract(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, short)
   */
  public Object subtract(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object subtract(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, java.math.BigInteger)
   */
  public Object subtract(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, byte)
   */
  public Object subtract(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, char)
   */
  public Object subtract(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, double)
   */
  public Object subtract(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, float)
   */
  public Object subtract(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, int)
   */
  public Object subtract(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, long)
   */
  public Object subtract(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, short)
   */
  public Object subtract(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, java.math.BigDecimal)
   */
  public Object subtract(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, java.math.BigInteger)
   */
  public Object subtract(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, byte)
   */
  public Object subtract(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, char)
   */
  public Object subtract(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, double)
   */
  public Object subtract(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, float)
   */
  public Object subtract(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, int)
   */
  public Object subtract(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, long)
   */
  public Object subtract(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, short)
   */
  public Object subtract(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, java.math.BigDecimal)
   */
  public Object subtract(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, java.math.BigInteger)
   */
  public Object subtract(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, byte)
   */
  public Object subtract(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, char)
   */
  public Object subtract(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, double)
   */
  public Object subtract(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, float)
   */
  public Object subtract(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, int)
   */
  public Object subtract(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, long)
   */
  public Object subtract(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, short)
   */
  public Object subtract(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, java.math.BigDecimal)
   */
  public Object subtract(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, java.math.BigInteger)
   */
  public Object subtract(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, byte)
   */
  public Object subtract(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, char)
   */
  public Object subtract(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, double)
   */
  public Object subtract(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, float)
   */
  public Object subtract(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, int)
   */
  public Object subtract(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, long)
   */
  public Object subtract(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, short)
   */
  public Object subtract(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, java.math.BigDecimal)
   */
  public Object subtract(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, java.math.BigInteger)
   */
  public Object subtract(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, byte)
   */
  public Object subtract(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, char)
   */
  public Object subtract(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, double)
   */
  public Object subtract(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, float)
   */
  public Object subtract(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, int)
   */
  public Object subtract(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, long)
   */
  public Object subtract(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, short)
   */
  public Object subtract(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, java.math.BigDecimal)
   */
  public Object subtract(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, java.math.BigInteger)
   */
  public Object subtract(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, byte)
   */
  public Object subtract(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, char)
   */
  public Object subtract(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, double)
   */
  public Object subtract(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, float)
   */
  public Object subtract(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, int)
   */
  public Object subtract(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, long)
   */
  public Object subtract(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, short)
   */
  public Object subtract(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, java.math.BigDecimal)
   */
  public Object subtract(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, java.math.BigInteger)
   */
  public Object subtract(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, byte)
   */
  public Object subtract(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, char)
   */
  public Object subtract(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, double)
   */
  public Object subtract(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, float)
   */
  public Object subtract(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, int)
   */
  public Object subtract(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, long)
   */
  public Object subtract(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, short)
   */
  public Object subtract(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, java.math.BigDecimal)
   */
  public Object subtract(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, java.math.BigInteger)
   */
  public Object subtract(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, byte)
   */
  public Object subtract(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, char)
   */
  public Object subtract(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, double)
   */
  public Object subtract(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, float)
   */
  public Object subtract(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, int)
   */
  public Object subtract(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, long)
   */
  public Object subtract(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#subtract(java.lang.Object, java.lang.Object)
   */
  public Object subtract(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, short)
   */
  public Object subtract(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, java.math.BigDecimal)
   */
  public Object subtract(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, java.math.BigInteger)
   */
  public Object subtract(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, byte)
   */
  public Object subtract(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, char)
   */
  public Object subtract(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, double)
   */
  public Object subtract(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, float)
   */
  public Object subtract(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, int)
   */
  public Object subtract(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, long)
   */
  public Object subtract(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, short)
   */
  public Object subtract(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object subtractEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object subtractEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, byte)
   */
  public Object subtractEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, char)
   */
  public Object subtractEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, double)
   */
  public Object subtractEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, float)
   */
  public Object subtractEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, int)
   */
  public Object subtractEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, long)
   */
  public Object subtractEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, short)
   */
  public Object subtractEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object subtractEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object subtractEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, byte)
   */
  public Object subtractEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, char)
   */
  public Object subtractEquals(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, double)
   */
  public Object subtractEquals(final BigInteger lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, float)
   */
  public Object subtractEquals(final BigInteger lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, int)
   */
  public Object subtractEquals(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, long)
   */
  public Object subtractEquals(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, short)
   */
  public Object subtractEquals(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, java.math.BigDecimal)
   */
  public Object subtractEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, java.math.BigInteger)
   */
  public Object subtractEquals(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, byte)
   */
  public Object subtractEquals(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, char)
   */
  public Object subtractEquals(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, double)
   */
  public Object subtractEquals(final byte lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, float)
   */
  public Object subtractEquals(final byte lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, int)
   */
  public Object subtractEquals(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, long)
   */
  public Object subtractEquals(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, short)
   */
  public Object subtractEquals(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, java.math.BigDecimal)
   */
  public Object subtractEquals(final char lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, java.math.BigInteger)
   */
  public Object subtractEquals(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, byte)
   */
  public Object subtractEquals(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, char)
   */
  public Object subtractEquals(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, double)
   */
  public Object subtractEquals(final char lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, float)
   */
  public Object subtractEquals(final char lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, int)
   */
  public Object subtractEquals(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, long)
   */
  public Object subtractEquals(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, short)
   */
  public Object subtractEquals(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, java.math.BigDecimal)
   */
  public Object subtractEquals(final double lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, java.math.BigInteger)
   */
  public Object subtractEquals(final double lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, byte)
   */
  public Object subtractEquals(final double lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, char)
   */
  public Object subtractEquals(final double lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, double)
   */
  public Object subtractEquals(final double lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, float)
   */
  public Object subtractEquals(final double lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, int)
   */
  public Object subtractEquals(final double lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, long)
   */
  public Object subtractEquals(final double lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, short)
   */
  public Object subtractEquals(final double lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, java.math.BigDecimal)
   */
  public Object subtractEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, java.math.BigInteger)
   */
  public Object subtractEquals(final float lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, byte)
   */
  public Object subtractEquals(final float lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, char)
   */
  public Object subtractEquals(final float lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, double)
   */
  public Object subtractEquals(final float lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, float)
   */
  public Object subtractEquals(final float lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, int)
   */
  public Object subtractEquals(final float lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, long)
   */
  public Object subtractEquals(final float lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, short)
   */
  public Object subtractEquals(final float lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, java.math.BigDecimal)
   */
  public Object subtractEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, java.math.BigInteger)
   */
  public Object subtractEquals(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, byte)
   */
  public Object subtractEquals(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, char)
   */
  public Object subtractEquals(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, double)
   */
  public Object subtractEquals(final int lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, float)
   */
  public Object subtractEquals(final int lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, int)
   */
  public Object subtractEquals(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, long)
   */
  public Object subtractEquals(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, short)
   */
  public Object subtractEquals(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, java.math.BigDecimal)
   */
  public Object subtractEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, java.math.BigInteger)
   */
  public Object subtractEquals(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, byte)
   */
  public Object subtractEquals(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, char)
   */
  public Object subtractEquals(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, double)
   */
  public Object subtractEquals(final long lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, float)
   */
  public Object subtractEquals(final long lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, int)
   */
  public Object subtractEquals(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, long)
   */
  public Object subtractEquals(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, short)
   */
  public Object subtractEquals(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, java.math.BigDecimal)
   */
  public Object subtractEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object subtractEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, byte)
   */
  public Object subtractEquals(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, char)
   */
  public Object subtractEquals(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, double)
   */
  public Object subtractEquals(final Object lhs, final double rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, float)
   */
  public Object subtractEquals(final Object lhs, final float rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, int)
   */
  public Object subtractEquals(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, long)
   */
  public Object subtractEquals(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#subtractEquals(java.lang.Object, java.lang.Object)
   */
  public Object subtractEquals(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, short)
   */
  public Object subtractEquals(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, java.math.BigDecimal)
   */
  public Object subtractEquals(final short lhs, final BigDecimal rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, java.math.BigInteger)
   */
  public Object subtractEquals(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, byte)
   */
  public Object subtractEquals(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, char)
   */
  public Object subtractEquals(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, double)
   */
  public Object subtractEquals(final short lhs, final double rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, float)
   */
  public Object subtractEquals(final short lhs, final float rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, int)
   */
  public Object subtractEquals(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, long)
   */
  public Object subtractEquals(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, short)
   */
  public Object subtractEquals(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryMinus(java.math.BigDecimal)
   */
  public Object unaryMinus(final BigDecimal instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryMinus(java.math.BigInteger)
   */
  public Object unaryMinus(final BigInteger instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryMinus(double)
   */
  public Object unaryMinus(final double instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryMinus(float)
   */
  public Object unaryMinus(final float instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryMinus(int)
   */
  public Object unaryMinus(final int instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryMinus(long)
   */
  public Object unaryMinus(final long instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param operand
   * @return
   * @see ng.runtime.MetaClass#unaryMinus(java.lang.Object)
   */
  public Object unaryMinus(final Object operand) throws Throwable {
    return this.delegate.getRuntimeMetaClass().unaryMinus(this.instance);
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryPlus(java.math.BigDecimal)
   */
  public Object unaryPlus(final BigDecimal instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryPlus(java.math.BigInteger)
   */
  public Object unaryPlus(final BigInteger instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryPlus(double)
   */
  public Object unaryPlus(final double instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryPlus(float)
   */
  public Object unaryPlus(final float instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryPlus(int)
   */
  public Object unaryPlus(final int instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryPlus(long)
   */
  public Object unaryPlus(final long instance) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param operand
   * @return
   * @see ng.runtime.MetaClass#unaryPlus(java.lang.Object)
   */
  public Object unaryPlus(final Object operand) throws Throwable {
    return this.delegate.getRuntimeMetaClass().unaryPlus(this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.math.BigInteger, java.math.BigInteger)
   */
  public Object xor(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.math.BigInteger, byte)
   */
  public Object xor(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.math.BigInteger, char)
   */
  public Object xor(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.math.BigInteger, int)
   */
  public Object xor(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.math.BigInteger, long)
   */
  public Object xor(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.math.BigInteger, short)
   */
  public Object xor(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(byte, java.math.BigInteger)
   */
  public Object xor(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(byte, byte)
   */
  public Object xor(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(byte, char)
   */
  public Object xor(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(byte, int)
   */
  public Object xor(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(byte, long)
   */
  public Object xor(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(byte, short)
   */
  public Object xor(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(char, java.math.BigInteger)
   */
  public Object xor(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(char, byte)
   */
  public Object xor(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(char, char)
   */
  public Object xor(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(char, int)
   */
  public Object xor(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(char, long)
   */
  public Object xor(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(char, short)
   */
  public Object xor(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(int, java.math.BigInteger)
   */
  public Object xor(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(int, byte)
   */
  public Object xor(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(int, char)
   */
  public Object xor(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(int, int)
   */
  public Object xor(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(int, long)
   */
  public Object xor(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(int, short)
   */
  public Object xor(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(long, java.math.BigInteger)
   */
  public Object xor(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(long, byte)
   */
  public Object xor(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(long, char)
   */
  public Object xor(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(long, int)
   */
  public Object xor(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(long, long)
   */
  public Object xor(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(long, short)
   */
  public Object xor(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.lang.Object, java.math.BigInteger)
   */
  public Object xor(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().xor(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.lang.Object, byte)
   */
  public Object xor(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().xor(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.lang.Object, char)
   */
  public Object xor(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().xor(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.lang.Object, int)
   */
  public Object xor(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().xor(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.lang.Object, long)
   */
  public Object xor(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().xor(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#xor(java.lang.Object, java.lang.Object)
   */
  public Object xor(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().xor(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.lang.Object, short)
   */
  public Object xor(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().xor(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(short, java.math.BigInteger)
   */
  public Object xor(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(short, byte)
   */
  public Object xor(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(short, char)
   */
  public Object xor(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(short, int)
   */
  public Object xor(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(short, long)
   */
  public Object xor(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(short, short)
   */
  public Object xor(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object xorEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.math.BigInteger, byte)
   */
  public Object xorEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.math.BigInteger, char)
   */
  public Object xorEquals(final BigInteger lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.math.BigInteger, int)
   */
  public Object xorEquals(final BigInteger lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.math.BigInteger, long)
   */
  public Object xorEquals(final BigInteger lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.math.BigInteger, short)
   */
  public Object xorEquals(final BigInteger lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(byte, java.math.BigInteger)
   */
  public Object xorEquals(final byte lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(byte, byte)
   */
  public Object xorEquals(final byte lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(byte, char)
   */
  public Object xorEquals(final byte lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(byte, int)
   */
  public Object xorEquals(final byte lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(byte, long)
   */
  public Object xorEquals(final byte lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(byte, short)
   */
  public Object xorEquals(final byte lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(char, java.math.BigInteger)
   */
  public Object xorEquals(final char lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(char, byte)
   */
  public Object xorEquals(final char lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(char, char)
   */
  public Object xorEquals(final char lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(char, int)
   */
  public Object xorEquals(final char lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(char, long)
   */
  public Object xorEquals(final char lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(char, short)
   */
  public Object xorEquals(final char lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(int, java.math.BigInteger)
   */
  public Object xorEquals(final int lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(int, byte)
   */
  public Object xorEquals(final int lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(int, char)
   */
  public Object xorEquals(final int lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(int, int)
   */
  public Object xorEquals(final int lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(int, long)
   */
  public Object xorEquals(final int lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(int, short)
   */
  public Object xorEquals(final int lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(long, java.math.BigInteger)
   */
  public Object xorEquals(final long lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(long, byte)
   */
  public Object xorEquals(final long lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(long, char)
   */
  public Object xorEquals(final long lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(long, int)
   */
  public Object xorEquals(final long lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(long, long)
   */
  public Object xorEquals(final long lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(long, short)
   */
  public Object xorEquals(final long lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object xorEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().xorEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.lang.Object, byte)
   */
  public Object xorEquals(final Object lhs, final byte rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().xorEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.lang.Object, char)
   */
  public Object xorEquals(final Object lhs, final char rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().xorEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.lang.Object, int)
   */
  public Object xorEquals(final Object lhs, final int rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().xorEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.lang.Object, long)
   */
  public Object xorEquals(final Object lhs, final long rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().xorEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#xorEquals(java.lang.Object, java.lang.Object)
   */
  public Object xorEquals(final Object lhs, final Object rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().xorEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.lang.Object, short)
   */
  public Object xorEquals(final Object lhs, final short rhs) throws Throwable {
    return this.delegate.getRuntimeMetaClass().xorEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(short, java.math.BigInteger)
   */
  public Object xorEquals(final short lhs, final BigInteger rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(short, byte)
   */
  public Object xorEquals(final short lhs, final byte rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(short, char)
   */
  public Object xorEquals(final short lhs, final char rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(short, int)
   */
  public Object xorEquals(final short lhs, final int rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(short, long)
   */
  public Object xorEquals(final short lhs, final long rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(short, short)
   */
  public Object xorEquals(final short lhs, final short rhs) throws Throwable {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }
}
