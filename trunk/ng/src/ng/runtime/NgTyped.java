package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection;

import ng.lang.NgRuntimeException;
import ng.lang.NgSystem;

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
private final MetaClass delegate;
  
  public NgTypedMetaClass(final Object instance, final Class type) {
    this.instance = instance;
    this.type = type;
    this.delegate = NgSystem.metaClassRegistry.getMetaClass(instance).getMetaClassFor(type);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getMetaClassFor(java.lang.Class)
   */
  public MetaClass getMetaClassFor(Class theClass) {
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
  public Object add(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object add(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, byte)
   */
  public Object add(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, char)
   */
  public Object add(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, double)
   */
  public Object add(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, float)
   */
  public Object add(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, int)
   */
  public Object add(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, long)
   */
  public Object add(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigDecimal, short)
   */
  public Object add(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object add(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, java.math.BigInteger)
   */
  public Object add(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, byte)
   */
  public Object add(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, char)
   */
  public Object add(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, double)
   */
  public Object add(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, float)
   */
  public Object add(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, int)
   */
  public Object add(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, long)
   */
  public Object add(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.math.BigInteger, short)
   */
  public Object add(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, java.math.BigDecimal)
   */
  public Object add(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, java.math.BigInteger)
   */
  public Object add(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, byte)
   */
  public Object add(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, char)
   */
  public Object add(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, double)
   */
  public Object add(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, float)
   */
  public Object add(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, int)
   */
  public Object add(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, long)
   */
  public Object add(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(byte, short)
   */
  public Object add(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, java.math.BigDecimal)
   */
  public Object add(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, java.math.BigInteger)
   */
  public Object add(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, byte)
   */
  public Object add(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, char)
   */
  public Object add(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, double)
   */
  public Object add(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, float)
   */
  public Object add(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, int)
   */
  public Object add(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, long)
   */
  public Object add(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(char, short)
   */
  public Object add(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, java.math.BigDecimal)
   */
  public Object add(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, java.math.BigInteger)
   */
  public Object add(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, byte)
   */
  public Object add(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, char)
   */
  public Object add(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, double)
   */
  public Object add(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, float)
   */
  public Object add(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, int)
   */
  public Object add(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, long)
   */
  public Object add(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(double, short)
   */
  public Object add(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, java.math.BigDecimal)
   */
  public Object add(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, java.math.BigInteger)
   */
  public Object add(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, byte)
   */
  public Object add(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, char)
   */
  public Object add(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, double)
   */
  public Object add(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, float)
   */
  public Object add(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, int)
   */
  public Object add(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, long)
   */
  public Object add(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(float, short)
   */
  public Object add(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, java.math.BigDecimal)
   */
  public Object add(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, java.math.BigInteger)
   */
  public Object add(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, byte)
   */
  public Object add(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, char)
   */
  public Object add(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, double)
   */
  public Object add(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, float)
   */
  public Object add(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, int)
   */
  public Object add(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, long)
   */
  public Object add(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(int, short)
   */
  public Object add(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, java.math.BigDecimal)
   */
  public Object add(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, java.math.BigInteger)
   */
  public Object add(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, byte)
   */
  public Object add(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, char)
   */
  public Object add(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, double)
   */
  public Object add(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, float)
   */
  public Object add(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, int)
   */
  public Object add(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, long)
   */
  public Object add(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(long, short)
   */
  public Object add(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, java.math.BigDecimal)
   */
  public Object add(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, java.math.BigInteger)
   */
  public Object add(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, byte)
   */
  public Object add(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, char)
   */
  public Object add(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, double)
   */
  public Object add(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, float)
   */
  public Object add(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, int)
   */
  public Object add(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, long)
   */
  public Object add(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param operand
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#add(java.lang.Object, java.lang.Object)
   */
  public Object add(Object operand, Object rhs) {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(java.lang.Object, short)
   */
  public Object add(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().add(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, java.math.BigDecimal)
   */
  public Object add(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, java.math.BigInteger)
   */
  public Object add(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, byte)
   */
  public Object add(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, char)
   */
  public Object add(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, double)
   */
  public Object add(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, float)
   */
  public Object add(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, int)
   */
  public Object add(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, long)
   */
  public Object add(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#add(short, short)
   */
  public Object add(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object addEquals(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object addEquals(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, byte)
   */
  public Object addEquals(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, char)
   */
  public Object addEquals(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, double)
   */
  public Object addEquals(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, float)
   */
  public Object addEquals(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, int)
   */
  public Object addEquals(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, long)
   */
  public Object addEquals(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigDecimal, short)
   */
  public Object addEquals(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object addEquals(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object addEquals(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, byte)
   */
  public Object addEquals(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, char)
   */
  public Object addEquals(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, double)
   */
  public Object addEquals(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, float)
   */
  public Object addEquals(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, int)
   */
  public Object addEquals(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, long)
   */
  public Object addEquals(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.math.BigInteger, short)
   */
  public Object addEquals(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, java.math.BigDecimal)
   */
  public Object addEquals(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, java.math.BigInteger)
   */
  public Object addEquals(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, byte)
   */
  public Object addEquals(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, char)
   */
  public Object addEquals(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, double)
   */
  public Object addEquals(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, float)
   */
  public Object addEquals(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, int)
   */
  public Object addEquals(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, long)
   */
  public Object addEquals(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(byte, short)
   */
  public Object addEquals(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, java.math.BigDecimal)
   */
  public Object addEquals(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, java.math.BigInteger)
   */
  public Object addEquals(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, byte)
   */
  public Object addEquals(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, char)
   */
  public Object addEquals(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, double)
   */
  public Object addEquals(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, float)
   */
  public Object addEquals(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, int)
   */
  public Object addEquals(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, long)
   */
  public Object addEquals(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(char, short)
   */
  public Object addEquals(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, java.math.BigDecimal)
   */
  public Object addEquals(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, java.math.BigInteger)
   */
  public Object addEquals(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, byte)
   */
  public Object addEquals(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, char)
   */
  public Object addEquals(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, double)
   */
  public Object addEquals(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, float)
   */
  public Object addEquals(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, int)
   */
  public Object addEquals(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, long)
   */
  public Object addEquals(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(double, short)
   */
  public Object addEquals(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, java.math.BigDecimal)
   */
  public Object addEquals(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, java.math.BigInteger)
   */
  public Object addEquals(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, byte)
   */
  public Object addEquals(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, char)
   */
  public Object addEquals(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, double)
   */
  public Object addEquals(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, float)
   */
  public Object addEquals(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, int)
   */
  public Object addEquals(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, long)
   */
  public Object addEquals(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(float, short)
   */
  public Object addEquals(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, java.math.BigDecimal)
   */
  public Object addEquals(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, java.math.BigInteger)
   */
  public Object addEquals(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, byte)
   */
  public Object addEquals(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, char)
   */
  public Object addEquals(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, double)
   */
  public Object addEquals(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, float)
   */
  public Object addEquals(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, int)
   */
  public Object addEquals(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, long)
   */
  public Object addEquals(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(int, short)
   */
  public Object addEquals(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, java.math.BigDecimal)
   */
  public Object addEquals(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, java.math.BigInteger)
   */
  public Object addEquals(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, byte)
   */
  public Object addEquals(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, char)
   */
  public Object addEquals(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, double)
   */
  public Object addEquals(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, float)
   */
  public Object addEquals(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, int)
   */
  public Object addEquals(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, long)
   */
  public Object addEquals(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(long, short)
   */
  public Object addEquals(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, java.math.BigDecimal)
   */
  public Object addEquals(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object addEquals(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, byte)
   */
  public Object addEquals(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, char)
   */
  public Object addEquals(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, double)
   */
  public Object addEquals(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, float)
   */
  public Object addEquals(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, int)
   */
  public Object addEquals(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, long)
   */
  public Object addEquals(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#addEquals(java.lang.Object, java.lang.Object)
   */
  public Object addEquals(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(java.lang.Object, short)
   */
  public Object addEquals(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().addEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, java.math.BigDecimal)
   */
  public Object addEquals(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, java.math.BigInteger)
   */
  public Object addEquals(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, byte)
   */
  public Object addEquals(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, char)
   */
  public Object addEquals(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, double)
   */
  public Object addEquals(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, float)
   */
  public Object addEquals(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, int)
   */
  public Object addEquals(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, long)
   */
  public Object addEquals(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#addEquals(short, short)
   */
  public Object addEquals(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.math.BigInteger, java.math.BigInteger)
   */
  public Object and(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.math.BigInteger, byte)
   */
  public Object and(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.math.BigInteger, char)
   */
  public Object and(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.math.BigInteger, int)
   */
  public Object and(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.math.BigInteger, long)
   */
  public Object and(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.math.BigInteger, short)
   */
  public Object and(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(byte, java.math.BigInteger)
   */
  public Object and(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(byte, byte)
   */
  public Object and(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(byte, char)
   */
  public Object and(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(byte, int)
   */
  public Object and(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(byte, long)
   */
  public Object and(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(byte, short)
   */
  public Object and(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(char, java.math.BigInteger)
   */
  public Object and(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(char, byte)
   */
  public Object and(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(char, char)
   */
  public Object and(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(char, int)
   */
  public Object and(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(char, long)
   */
  public Object and(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(char, short)
   */
  public Object and(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(int, java.math.BigInteger)
   */
  public Object and(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(int, byte)
   */
  public Object and(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(int, char)
   */
  public Object and(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(int, int)
   */
  public Object and(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(int, long)
   */
  public Object and(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(int, short)
   */
  public Object and(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(long, java.math.BigInteger)
   */
  public Object and(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(long, byte)
   */
  public Object and(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(long, char)
   */
  public Object and(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(long, int)
   */
  public Object and(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(long, long)
   */
  public Object and(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(long, short)
   */
  public Object and(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.lang.Object, java.math.BigInteger)
   */
  public Object and(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().and(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.lang.Object, byte)
   */
  public Object and(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().and(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.lang.Object, char)
   */
  public Object and(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().and(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.lang.Object, int)
   */
  public Object and(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().and(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.lang.Object, long)
   */
  public Object and(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().and(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#and(java.lang.Object, java.lang.Object)
   */
  public Object and(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().and(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(java.lang.Object, short)
   */
  public Object and(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().and(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(short, java.math.BigInteger)
   */
  public Object and(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(short, byte)
   */
  public Object and(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(short, char)
   */
  public Object and(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(short, int)
   */
  public Object and(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(short, long)
   */
  public Object and(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#and(short, short)
   */
  public Object and(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object andEquals(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.math.BigInteger, byte)
   */
  public Object andEquals(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.math.BigInteger, char)
   */
  public Object andEquals(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.math.BigInteger, int)
   */
  public Object andEquals(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.math.BigInteger, long)
   */
  public Object andEquals(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.math.BigInteger, short)
   */
  public Object andEquals(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(byte, java.math.BigInteger)
   */
  public Object andEquals(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(byte, byte)
   */
  public Object andEquals(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(byte, char)
   */
  public Object andEquals(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(byte, int)
   */
  public Object andEquals(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(byte, long)
   */
  public Object andEquals(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(byte, short)
   */
  public Object andEquals(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(char, java.math.BigInteger)
   */
  public Object andEquals(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(char, byte)
   */
  public Object andEquals(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(char, char)
   */
  public Object andEquals(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(char, int)
   */
  public Object andEquals(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(char, long)
   */
  public Object andEquals(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(char, short)
   */
  public Object andEquals(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(int, java.math.BigInteger)
   */
  public Object andEquals(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(int, byte)
   */
  public Object andEquals(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(int, char)
   */
  public Object andEquals(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(int, int)
   */
  public Object andEquals(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(int, long)
   */
  public Object andEquals(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(int, short)
   */
  public Object andEquals(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(long, java.math.BigInteger)
   */
  public Object andEquals(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(long, byte)
   */
  public Object andEquals(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(long, char)
   */
  public Object andEquals(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(long, int)
   */
  public Object andEquals(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(long, long)
   */
  public Object andEquals(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(long, short)
   */
  public Object andEquals(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object andEquals(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().andEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.lang.Object, byte)
   */
  public Object andEquals(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().andEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.lang.Object, char)
   */
  public Object andEquals(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().andEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.lang.Object, int)
   */
  public Object andEquals(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().andEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.lang.Object, long)
   */
  public Object andEquals(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().andEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#andEquals(java.lang.Object, java.lang.Object)
   */
  public Object andEquals(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().andEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(java.lang.Object, short)
   */
  public Object andEquals(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().andEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(short, java.math.BigInteger)
   */
  public Object andEquals(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(short, byte)
   */
  public Object andEquals(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(short, char)
   */
  public Object andEquals(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(short, int)
   */
  public Object andEquals(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(short, long)
   */
  public Object andEquals(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#andEquals(short, short)
   */
  public Object andEquals(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.math.BigInteger, java.math.BigInteger)
   */
  public Object arithmeticRightShift(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.math.BigInteger, byte)
   */
  public Object arithmeticRightShift(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.math.BigInteger, char)
   */
  public Object arithmeticRightShift(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.math.BigInteger, int)
   */
  public Object arithmeticRightShift(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.math.BigInteger, long)
   */
  public Object arithmeticRightShift(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.math.BigInteger, short)
   */
  public Object arithmeticRightShift(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(byte, java.math.BigInteger)
   */
  public Object arithmeticRightShift(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(byte, byte)
   */
  public Object arithmeticRightShift(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(byte, char)
   */
  public Object arithmeticRightShift(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(byte, int)
   */
  public Object arithmeticRightShift(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(byte, long)
   */
  public Object arithmeticRightShift(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(byte, short)
   */
  public Object arithmeticRightShift(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(char, java.math.BigInteger)
   */
  public Object arithmeticRightShift(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(char, byte)
   */
  public Object arithmeticRightShift(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(char, char)
   */
  public Object arithmeticRightShift(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(char, int)
   */
  public Object arithmeticRightShift(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(char, long)
   */
  public Object arithmeticRightShift(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(char, short)
   */
  public Object arithmeticRightShift(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(int, java.math.BigInteger)
   */
  public Object arithmeticRightShift(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(int, byte)
   */
  public Object arithmeticRightShift(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(int, char)
   */
  public Object arithmeticRightShift(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(int, int)
   */
  public Object arithmeticRightShift(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(int, long)
   */
  public Object arithmeticRightShift(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(int, short)
   */
  public Object arithmeticRightShift(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(long, java.math.BigInteger)
   */
  public Object arithmeticRightShift(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(long, byte)
   */
  public Object arithmeticRightShift(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(long, char)
   */
  public Object arithmeticRightShift(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(long, int)
   */
  public Object arithmeticRightShift(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(long, long)
   */
  public Object arithmeticRightShift(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(long, short)
   */
  public Object arithmeticRightShift(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.lang.Object, java.math.BigInteger)
   */
  public Object arithmeticRightShift(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.lang.Object, byte)
   */
  public Object arithmeticRightShift(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.lang.Object, char)
   */
  public Object arithmeticRightShift(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.lang.Object, int)
   */
  public Object arithmeticRightShift(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.lang.Object, long)
   */
  public Object arithmeticRightShift(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#arithmeticRightShift(java.lang.Object, java.lang.Object)
   */
  public Object arithmeticRightShift(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(java.lang.Object, short)
   */
  public Object arithmeticRightShift(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(short, java.math.BigInteger)
   */
  public Object arithmeticRightShift(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(short, byte)
   */
  public Object arithmeticRightShift(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(short, char)
   */
  public Object arithmeticRightShift(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(short, int)
   */
  public Object arithmeticRightShift(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(short, long)
   */
  public Object arithmeticRightShift(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShift(short, short)
   */
  public Object arithmeticRightShift(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object arithmeticRightShiftEquals(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.math.BigInteger, byte)
   */
  public Object arithmeticRightShiftEquals(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.math.BigInteger, char)
   */
  public Object arithmeticRightShiftEquals(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.math.BigInteger, int)
   */
  public Object arithmeticRightShiftEquals(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.math.BigInteger, long)
   */
  public Object arithmeticRightShiftEquals(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.math.BigInteger, short)
   */
  public Object arithmeticRightShiftEquals(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(byte, java.math.BigInteger)
   */
  public Object arithmeticRightShiftEquals(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(byte, byte)
   */
  public Object arithmeticRightShiftEquals(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(byte, char)
   */
  public Object arithmeticRightShiftEquals(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(byte, int)
   */
  public Object arithmeticRightShiftEquals(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(byte, long)
   */
  public Object arithmeticRightShiftEquals(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(byte, short)
   */
  public Object arithmeticRightShiftEquals(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(char, java.math.BigInteger)
   */
  public Object arithmeticRightShiftEquals(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(char, byte)
   */
  public Object arithmeticRightShiftEquals(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(char, char)
   */
  public Object arithmeticRightShiftEquals(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(char, int)
   */
  public Object arithmeticRightShiftEquals(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(char, long)
   */
  public Object arithmeticRightShiftEquals(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(char, short)
   */
  public Object arithmeticRightShiftEquals(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(int, java.math.BigInteger)
   */
  public Object arithmeticRightShiftEquals(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(int, byte)
   */
  public Object arithmeticRightShiftEquals(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(int, char)
   */
  public Object arithmeticRightShiftEquals(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(int, int)
   */
  public Object arithmeticRightShiftEquals(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(int, long)
   */
  public Object arithmeticRightShiftEquals(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(int, short)
   */
  public Object arithmeticRightShiftEquals(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(long, java.math.BigInteger)
   */
  public Object arithmeticRightShiftEquals(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(long, byte)
   */
  public Object arithmeticRightShiftEquals(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(long, char)
   */
  public Object arithmeticRightShiftEquals(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(long, int)
   */
  public Object arithmeticRightShiftEquals(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(long, long)
   */
  public Object arithmeticRightShiftEquals(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(long, short)
   */
  public Object arithmeticRightShiftEquals(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object arithmeticRightShiftEquals(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.lang.Object, byte)
   */
  public Object arithmeticRightShiftEquals(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.lang.Object, char)
   */
  public Object arithmeticRightShiftEquals(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.lang.Object, int)
   */
  public Object arithmeticRightShiftEquals(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.lang.Object, long)
   */
  public Object arithmeticRightShiftEquals(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#arithmeticRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object arithmeticRightShiftEquals(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(java.lang.Object, short)
   */
  public Object arithmeticRightShiftEquals(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().arithmeticRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(short, java.math.BigInteger)
   */
  public Object arithmeticRightShiftEquals(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(short, byte)
   */
  public Object arithmeticRightShiftEquals(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(short, char)
   */
  public Object arithmeticRightShiftEquals(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(short, int)
   */
  public Object arithmeticRightShiftEquals(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(short, long)
   */
  public Object arithmeticRightShiftEquals(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#arithmeticRightShiftEquals(short, short)
   */
  public Object arithmeticRightShiftEquals(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @param type
   * @return
   * @see ng.runtime.MetaClass#asType(java.lang.Object, java.lang.Class)
   */
  public Object asType(Object instance, Class type) {
    return this.delegate.getRuntimeMetaClass().asType(this.instance, type);
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
  public Object callQuick(Object instance, Object p1, Object p2, Object p3, Object p4) {
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
  public Object callQuick(Object instance, Object p1, Object p2, Object p3) {
    return this.delegate.getRuntimeMetaClass().callQuick(this.instance, p1, p2, p3);
  }

  /**
   * @param instance
   * @param p1
   * @param p2
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(Object instance, Object p1, Object p2) {
    return this.delegate.getRuntimeMetaClass().callQuick(this.instance, p1, p2);
  }

  /**
   * @param instance
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object, java.lang.Object)
   */
  public Object callQuick(Object instance, Object p1) {
    return this.delegate.getRuntimeMetaClass().callQuick(this.instance, p1);
  }

  /**
   * @param instance
   * @param arguments
   * @return
   * @see ng.runtime.MetaClass#call(java.lang.Object, java.lang.Object[])
   */
  public Object call(Object instance, Object[] arguments) {
    return this.delegate.getRuntimeMetaClass().call(this.instance, arguments);
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#callQuick(java.lang.Object)
   */
  public Object callQuick(Object instance) {
    return this.delegate.getRuntimeMetaClass().callQuick(this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object compare(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object compare(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, byte)
   */
  public Object compare(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, char)
   */
  public Object compare(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, double)
   */
  public Object compare(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, float)
   */
  public Object compare(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, int)
   */
  public Object compare(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, long)
   */
  public Object compare(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigDecimal, short)
   */
  public Object compare(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object compare(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, java.math.BigInteger)
   */
  public Object compare(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, byte)
   */
  public Object compare(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, char)
   */
  public Object compare(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, double)
   */
  public Object compare(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, float)
   */
  public Object compare(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, int)
   */
  public Object compare(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, long)
   */
  public Object compare(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.math.BigInteger, short)
   */
  public Object compare(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, java.math.BigDecimal)
   */
  public Object compare(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, java.math.BigInteger)
   */
  public Object compare(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, byte)
   */
  public Object compare(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, char)
   */
  public Object compare(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, double)
   */
  public Object compare(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, float)
   */
  public Object compare(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, int)
   */
  public Object compare(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, long)
   */
  public Object compare(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(byte, short)
   */
  public Object compare(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, java.math.BigDecimal)
   */
  public Object compare(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, java.math.BigInteger)
   */
  public Object compare(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, byte)
   */
  public Object compare(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, char)
   */
  public Object compare(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, double)
   */
  public Object compare(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, float)
   */
  public Object compare(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, int)
   */
  public Object compare(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, long)
   */
  public Object compare(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(char, short)
   */
  public Object compare(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, java.math.BigDecimal)
   */
  public Object compare(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, java.math.BigInteger)
   */
  public Object compare(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, byte)
   */
  public Object compare(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, char)
   */
  public Object compare(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, double)
   */
  public Object compare(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, float)
   */
  public Object compare(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, int)
   */
  public Object compare(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, long)
   */
  public Object compare(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(double, short)
   */
  public Object compare(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, java.math.BigDecimal)
   */
  public Object compare(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, java.math.BigInteger)
   */
  public Object compare(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, byte)
   */
  public Object compare(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, char)
   */
  public Object compare(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, double)
   */
  public Object compare(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, float)
   */
  public Object compare(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, int)
   */
  public Object compare(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, long)
   */
  public Object compare(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(float, short)
   */
  public Object compare(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, java.math.BigDecimal)
   */
  public Object compare(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, java.math.BigInteger)
   */
  public Object compare(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, byte)
   */
  public Object compare(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, char)
   */
  public Object compare(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, double)
   */
  public Object compare(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, float)
   */
  public Object compare(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, int)
   */
  public Object compare(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, long)
   */
  public Object compare(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(int, short)
   */
  public Object compare(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, java.math.BigDecimal)
   */
  public Object compare(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, java.math.BigInteger)
   */
  public Object compare(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, byte)
   */
  public Object compare(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, char)
   */
  public Object compare(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, double)
   */
  public Object compare(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, float)
   */
  public Object compare(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, int)
   */
  public Object compare(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, long)
   */
  public Object compare(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(long, short)
   */
  public Object compare(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, java.math.BigDecimal)
   */
  public Object compare(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, java.math.BigInteger)
   */
  public Object compare(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, byte)
   */
  public Object compare(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, char)
   */
  public Object compare(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, double)
   */
  public Object compare(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, float)
   */
  public Object compare(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, int)
   */
  public Object compare(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, long)
   */
  public Object compare(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#compare(java.lang.Object, java.lang.Object)
   */
  public Object compare(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(java.lang.Object, short)
   */
  public Object compare(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().compare(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, java.math.BigDecimal)
   */
  public Object compare(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, java.math.BigInteger)
   */
  public Object compare(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, byte)
   */
  public Object compare(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, char)
   */
  public Object compare(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, double)
   */
  public Object compare(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, float)
   */
  public Object compare(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, int)
   */
  public Object compare(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, long)
   */
  public Object compare(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#compare(short, short)
   */
  public Object compare(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#complement(java.math.BigInteger)
   */
  public Object complement(BigInteger instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#complement(int)
   */
  public Object complement(int instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#complement(long)
   */
  public Object complement(long instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.MetaClass#complement(java.lang.Object)
   */
  public Object complement(Object instance) {
    return this.delegate.getRuntimeMetaClass().complement(instance);
  }

  /**
   * @param theClass
   * @return
   * @see ng.runtime.RuntimeMetaClass#createMetaClassFor(java.lang.Class)
   */
  public RuntimeMetaClass createMetaClassFor(Class theClass) {
    return this.delegate.getRuntimeMetaClass().createMetaClassFor(theClass);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object divide(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object divide(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, byte)
   */
  public Object divide(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, char)
   */
  public Object divide(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, double)
   */
  public Object divide(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, float)
   */
  public Object divide(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, int)
   */
  public Object divide(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, long)
   */
  public Object divide(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigDecimal, short)
   */
  public Object divide(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object divide(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, java.math.BigInteger)
   */
  public Object divide(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, byte)
   */
  public Object divide(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, char)
   */
  public Object divide(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, double)
   */
  public Object divide(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, float)
   */
  public Object divide(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, int)
   */
  public Object divide(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, long)
   */
  public Object divide(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.math.BigInteger, short)
   */
  public Object divide(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, java.math.BigDecimal)
   */
  public Object divide(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, java.math.BigInteger)
   */
  public Object divide(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, byte)
   */
  public Object divide(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, char)
   */
  public Object divide(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, double)
   */
  public Object divide(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, float)
   */
  public Object divide(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, int)
   */
  public Object divide(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, long)
   */
  public Object divide(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(byte, short)
   */
  public Object divide(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, java.math.BigDecimal)
   */
  public Object divide(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, java.math.BigInteger)
   */
  public Object divide(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, byte)
   */
  public Object divide(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, char)
   */
  public Object divide(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, double)
   */
  public Object divide(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, float)
   */
  public Object divide(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, int)
   */
  public Object divide(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, long)
   */
  public Object divide(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(char, short)
   */
  public Object divide(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, java.math.BigDecimal)
   */
  public Object divide(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, java.math.BigInteger)
   */
  public Object divide(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, byte)
   */
  public Object divide(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, char)
   */
  public Object divide(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, double)
   */
  public Object divide(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, float)
   */
  public Object divide(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, int)
   */
  public Object divide(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, long)
   */
  public Object divide(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(double, short)
   */
  public Object divide(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, java.math.BigDecimal)
   */
  public Object divide(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, java.math.BigInteger)
   */
  public Object divide(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, byte)
   */
  public Object divide(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, char)
   */
  public Object divide(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, double)
   */
  public Object divide(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, float)
   */
  public Object divide(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, int)
   */
  public Object divide(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, long)
   */
  public Object divide(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(float, short)
   */
  public Object divide(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, java.math.BigDecimal)
   */
  public Object divide(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, java.math.BigInteger)
   */
  public Object divide(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, byte)
   */
  public Object divide(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, char)
   */
  public Object divide(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, double)
   */
  public Object divide(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, float)
   */
  public Object divide(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, int)
   */
  public Object divide(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, long)
   */
  public Object divide(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(int, short)
   */
  public Object divide(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, java.math.BigDecimal)
   */
  public Object divide(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, java.math.BigInteger)
   */
  public Object divide(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, byte)
   */
  public Object divide(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, char)
   */
  public Object divide(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, double)
   */
  public Object divide(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, float)
   */
  public Object divide(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, int)
   */
  public Object divide(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, long)
   */
  public Object divide(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(long, short)
   */
  public Object divide(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, java.math.BigDecimal)
   */
  public Object divide(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, java.math.BigInteger)
   */
  public Object divide(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, byte)
   */
  public Object divide(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, char)
   */
  public Object divide(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, double)
   */
  public Object divide(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, float)
   */
  public Object divide(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, int)
   */
  public Object divide(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, long)
   */
  public Object divide(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#divide(java.lang.Object, java.lang.Object)
   */
  public Object divide(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(java.lang.Object, short)
   */
  public Object divide(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().divide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, java.math.BigDecimal)
   */
  public Object divide(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, java.math.BigInteger)
   */
  public Object divide(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, byte)
   */
  public Object divide(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, char)
   */
  public Object divide(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, double)
   */
  public Object divide(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, float)
   */
  public Object divide(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, int)
   */
  public Object divide(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, long)
   */
  public Object divide(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divide(short, short)
   */
  public Object divide(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object divideEquals(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object divideEquals(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, byte)
   */
  public Object divideEquals(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, char)
   */
  public Object divideEquals(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, double)
   */
  public Object divideEquals(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, float)
   */
  public Object divideEquals(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, int)
   */
  public Object divideEquals(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, long)
   */
  public Object divideEquals(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigDecimal, short)
   */
  public Object divideEquals(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object divideEquals(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object divideEquals(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, byte)
   */
  public Object divideEquals(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, char)
   */
  public Object divideEquals(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, double)
   */
  public Object divideEquals(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, float)
   */
  public Object divideEquals(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, int)
   */
  public Object divideEquals(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, long)
   */
  public Object divideEquals(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.math.BigInteger, short)
   */
  public Object divideEquals(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, java.math.BigDecimal)
   */
  public Object divideEquals(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, java.math.BigInteger)
   */
  public Object divideEquals(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, byte)
   */
  public Object divideEquals(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, char)
   */
  public Object divideEquals(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, double)
   */
  public Object divideEquals(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, float)
   */
  public Object divideEquals(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, int)
   */
  public Object divideEquals(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, long)
   */
  public Object divideEquals(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(byte, short)
   */
  public Object divideEquals(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, java.math.BigDecimal)
   */
  public Object divideEquals(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, java.math.BigInteger)
   */
  public Object divideEquals(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, byte)
   */
  public Object divideEquals(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, char)
   */
  public Object divideEquals(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, double)
   */
  public Object divideEquals(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, float)
   */
  public Object divideEquals(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, int)
   */
  public Object divideEquals(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, long)
   */
  public Object divideEquals(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(char, short)
   */
  public Object divideEquals(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, java.math.BigDecimal)
   */
  public Object divideEquals(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, java.math.BigInteger)
   */
  public Object divideEquals(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, byte)
   */
  public Object divideEquals(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, char)
   */
  public Object divideEquals(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, double)
   */
  public Object divideEquals(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, float)
   */
  public Object divideEquals(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, int)
   */
  public Object divideEquals(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, long)
   */
  public Object divideEquals(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(double, short)
   */
  public Object divideEquals(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, java.math.BigDecimal)
   */
  public Object divideEquals(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, java.math.BigInteger)
   */
  public Object divideEquals(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, byte)
   */
  public Object divideEquals(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, char)
   */
  public Object divideEquals(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, double)
   */
  public Object divideEquals(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, float)
   */
  public Object divideEquals(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, int)
   */
  public Object divideEquals(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, long)
   */
  public Object divideEquals(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(float, short)
   */
  public Object divideEquals(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, java.math.BigDecimal)
   */
  public Object divideEquals(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, java.math.BigInteger)
   */
  public Object divideEquals(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, byte)
   */
  public Object divideEquals(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, char)
   */
  public Object divideEquals(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, double)
   */
  public Object divideEquals(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, float)
   */
  public Object divideEquals(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, int)
   */
  public Object divideEquals(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, long)
   */
  public Object divideEquals(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(int, short)
   */
  public Object divideEquals(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, java.math.BigDecimal)
   */
  public Object divideEquals(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, java.math.BigInteger)
   */
  public Object divideEquals(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, byte)
   */
  public Object divideEquals(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, char)
   */
  public Object divideEquals(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, double)
   */
  public Object divideEquals(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, float)
   */
  public Object divideEquals(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, int)
   */
  public Object divideEquals(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, long)
   */
  public Object divideEquals(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(long, short)
   */
  public Object divideEquals(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, java.math.BigDecimal)
   */
  public Object divideEquals(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object divideEquals(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, byte)
   */
  public Object divideEquals(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, char)
   */
  public Object divideEquals(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, double)
   */
  public Object divideEquals(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, float)
   */
  public Object divideEquals(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, int)
   */
  public Object divideEquals(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, long)
   */
  public Object divideEquals(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#divideEquals(java.lang.Object, java.lang.Object)
   */
  public Object divideEquals(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(java.lang.Object, short)
   */
  public Object divideEquals(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().divideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, java.math.BigDecimal)
   */
  public Object divideEquals(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, java.math.BigInteger)
   */
  public Object divideEquals(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, byte)
   */
  public Object divideEquals(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, char)
   */
  public Object divideEquals(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, double)
   */
  public Object divideEquals(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, float)
   */
  public Object divideEquals(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, int)
   */
  public Object divideEquals(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, long)
   */
  public Object divideEquals(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#divideEquals(short, short)
   */
  public Object divideEquals(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object equals(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object equals(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, byte)
   */
  public Object equals(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, char)
   */
  public Object equals(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, double)
   */
  public Object equals(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, float)
   */
  public Object equals(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, int)
   */
  public Object equals(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, long)
   */
  public Object equals(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigDecimal, short)
   */
  public Object equals(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object equals(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object equals(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, byte)
   */
  public Object equals(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, char)
   */
  public Object equals(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, double)
   */
  public Object equals(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, float)
   */
  public Object equals(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, int)
   */
  public Object equals(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, long)
   */
  public Object equals(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.math.BigInteger, short)
   */
  public Object equals(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, java.math.BigDecimal)
   */
  public Object equals(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, java.math.BigInteger)
   */
  public Object equals(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, byte)
   */
  public Object equals(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, char)
   */
  public Object equals(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, double)
   */
  public Object equals(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, float)
   */
  public Object equals(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, int)
   */
  public Object equals(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, long)
   */
  public Object equals(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(byte, short)
   */
  public Object equals(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, java.math.BigDecimal)
   */
  public Object equals(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, java.math.BigInteger)
   */
  public Object equals(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, byte)
   */
  public Object equals(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, char)
   */
  public Object equals(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, double)
   */
  public Object equals(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, float)
   */
  public Object equals(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, int)
   */
  public Object equals(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, long)
   */
  public Object equals(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(char, short)
   */
  public Object equals(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, java.math.BigDecimal)
   */
  public Object equals(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, java.math.BigInteger)
   */
  public Object equals(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, byte)
   */
  public Object equals(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, char)
   */
  public Object equals(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, double)
   */
  public Object equals(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, float)
   */
  public Object equals(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, int)
   */
  public Object equals(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, long)
   */
  public Object equals(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(double, short)
   */
  public Object equals(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, java.math.BigDecimal)
   */
  public Object equals(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, java.math.BigInteger)
   */
  public Object equals(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, byte)
   */
  public Object equals(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, char)
   */
  public Object equals(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, double)
   */
  public Object equals(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, float)
   */
  public Object equals(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, int)
   */
  public Object equals(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, long)
   */
  public Object equals(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(float, short)
   */
  public Object equals(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, java.math.BigDecimal)
   */
  public Object equals(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, java.math.BigInteger)
   */
  public Object equals(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, byte)
   */
  public Object equals(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, char)
   */
  public Object equals(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, double)
   */
  public Object equals(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, float)
   */
  public Object equals(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, int)
   */
  public Object equals(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, long)
   */
  public Object equals(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(int, short)
   */
  public Object equals(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, java.math.BigDecimal)
   */
  public Object equals(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, java.math.BigInteger)
   */
  public Object equals(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, byte)
   */
  public Object equals(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, char)
   */
  public Object equals(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, double)
   */
  public Object equals(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, float)
   */
  public Object equals(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, int)
   */
  public Object equals(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, long)
   */
  public Object equals(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(long, short)
   */
  public Object equals(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, java.math.BigDecimal)
   */
  public Object equals(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, java.math.BigInteger)
   */
  public Object equals(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, byte)
   */
  public Object equals(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, char)
   */
  public Object equals(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, double)
   */
  public Object equals(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, float)
   */
  public Object equals(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, int)
   */
  public Object equals(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, long)
   */
  public Object equals(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#equals(java.lang.Object, java.lang.Object)
   */
  public Object equals(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(java.lang.Object, short)
   */
  public Object equals(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().equals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, java.math.BigDecimal)
   */
  public Object equals(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, java.math.BigInteger)
   */
  public Object equals(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, byte)
   */
  public Object equals(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, char)
   */
  public Object equals(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, double)
   */
  public Object equals(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, float)
   */
  public Object equals(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, int)
   */
  public Object equals(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, long)
   */
  public Object equals(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#equals(short, short)
   */
  public Object equals(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @param index
   * @return
   * @see ng.runtime.RuntimeMetaClass#getAt(java.lang.Object, java.math.BigInteger)
   */
  public Object getAt(Object instance, BigInteger index) {
    return this.delegate.getRuntimeMetaClass().getAt(this.instance, index);
  }

  /**
   * @param instance
   * @param index
   * @return
   * @see ng.runtime.RuntimeMetaClass#getAt(java.lang.Object, int)
   */
  public Object getAt(Object instance, int index) {
    return this.delegate.getRuntimeMetaClass().getAt(this.instance, index);
  }

  /**
   * @param instance
   * @param index
   * @return
   * @see ng.runtime.MetaClass#getAt(java.lang.Object, java.lang.Object)
   */
  public Object getAt(Object instance, Object index) {
    return this.delegate.getRuntimeMetaClass().getAt(this.instance, index);
  }

  /**
   * @param instance
   * @param fieldName
   * @return
   * @see ng.runtime.MetaClass#getField(java.lang.Object, java.lang.String)
   */
  public Object getField(Object instance, String fieldName) {
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
  public Object getProperty(Object instance, String propertyName) {
    return this.delegate.getRuntimeMetaClass().getProperty(this.instance, propertyName);
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.MetaClass#getTheClass(java.lang.Object)
   */
  public Class getTheClass(Object instance) {
    return this.delegate.getRuntimeMetaClass().getTheClass(this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object greaterThan(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object greaterThan(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, byte)
   */
  public Object greaterThan(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, char)
   */
  public Object greaterThan(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, double)
   */
  public Object greaterThan(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, float)
   */
  public Object greaterThan(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, int)
   */
  public Object greaterThan(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, long)
   */
  public Object greaterThan(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigDecimal, short)
   */
  public Object greaterThan(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object greaterThan(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, java.math.BigInteger)
   */
  public Object greaterThan(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, byte)
   */
  public Object greaterThan(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, char)
   */
  public Object greaterThan(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, double)
   */
  public Object greaterThan(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, float)
   */
  public Object greaterThan(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, int)
   */
  public Object greaterThan(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, long)
   */
  public Object greaterThan(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.math.BigInteger, short)
   */
  public Object greaterThan(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, java.math.BigDecimal)
   */
  public Object greaterThan(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, java.math.BigInteger)
   */
  public Object greaterThan(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, byte)
   */
  public Object greaterThan(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, char)
   */
  public Object greaterThan(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, double)
   */
  public Object greaterThan(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, float)
   */
  public Object greaterThan(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, int)
   */
  public Object greaterThan(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, long)
   */
  public Object greaterThan(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(byte, short)
   */
  public Object greaterThan(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, java.math.BigDecimal)
   */
  public Object greaterThan(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, java.math.BigInteger)
   */
  public Object greaterThan(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, byte)
   */
  public Object greaterThan(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, char)
   */
  public Object greaterThan(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, double)
   */
  public Object greaterThan(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, float)
   */
  public Object greaterThan(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, int)
   */
  public Object greaterThan(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, long)
   */
  public Object greaterThan(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(char, short)
   */
  public Object greaterThan(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, java.math.BigDecimal)
   */
  public Object greaterThan(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, java.math.BigInteger)
   */
  public Object greaterThan(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, byte)
   */
  public Object greaterThan(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, char)
   */
  public Object greaterThan(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, double)
   */
  public Object greaterThan(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, float)
   */
  public Object greaterThan(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, int)
   */
  public Object greaterThan(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, long)
   */
  public Object greaterThan(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(double, short)
   */
  public Object greaterThan(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, java.math.BigDecimal)
   */
  public Object greaterThan(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, java.math.BigInteger)
   */
  public Object greaterThan(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, byte)
   */
  public Object greaterThan(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, char)
   */
  public Object greaterThan(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, double)
   */
  public Object greaterThan(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, float)
   */
  public Object greaterThan(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, int)
   */
  public Object greaterThan(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, long)
   */
  public Object greaterThan(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(float, short)
   */
  public Object greaterThan(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, java.math.BigDecimal)
   */
  public Object greaterThan(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, java.math.BigInteger)
   */
  public Object greaterThan(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, byte)
   */
  public Object greaterThan(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, char)
   */
  public Object greaterThan(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, double)
   */
  public Object greaterThan(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, float)
   */
  public Object greaterThan(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, int)
   */
  public Object greaterThan(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, long)
   */
  public Object greaterThan(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(int, short)
   */
  public Object greaterThan(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, java.math.BigDecimal)
   */
  public Object greaterThan(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, java.math.BigInteger)
   */
  public Object greaterThan(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, byte)
   */
  public Object greaterThan(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, char)
   */
  public Object greaterThan(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, double)
   */
  public Object greaterThan(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, float)
   */
  public Object greaterThan(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, int)
   */
  public Object greaterThan(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, long)
   */
  public Object greaterThan(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(long, short)
   */
  public Object greaterThan(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, java.math.BigDecimal)
   */
  public Object greaterThan(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, java.math.BigInteger)
   */
  public Object greaterThan(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, byte)
   */
  public Object greaterThan(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, char)
   */
  public Object greaterThan(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, double)
   */
  public Object greaterThan(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, float)
   */
  public Object greaterThan(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, int)
   */
  public Object greaterThan(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, long)
   */
  public Object greaterThan(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#greaterThan(java.lang.Object, java.lang.Object)
   */
  public Object greaterThan(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(java.lang.Object, short)
   */
  public Object greaterThan(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, java.math.BigDecimal)
   */
  public Object greaterThan(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, java.math.BigInteger)
   */
  public Object greaterThan(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, byte)
   */
  public Object greaterThan(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, char)
   */
  public Object greaterThan(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, double)
   */
  public Object greaterThan(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, float)
   */
  public Object greaterThan(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, int)
   */
  public Object greaterThan(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, long)
   */
  public Object greaterThan(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThan(short, short)
   */
  public Object greaterThan(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, byte)
   */
  public Object greaterThanOrEquals(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, char)
   */
  public Object greaterThanOrEquals(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, double)
   */
  public Object greaterThanOrEquals(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, float)
   */
  public Object greaterThanOrEquals(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, int)
   */
  public Object greaterThanOrEquals(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, long)
   */
  public Object greaterThanOrEquals(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigDecimal, short)
   */
  public Object greaterThanOrEquals(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, byte)
   */
  public Object greaterThanOrEquals(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, char)
   */
  public Object greaterThanOrEquals(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, double)
   */
  public Object greaterThanOrEquals(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, float)
   */
  public Object greaterThanOrEquals(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, int)
   */
  public Object greaterThanOrEquals(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, long)
   */
  public Object greaterThanOrEquals(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.math.BigInteger, short)
   */
  public Object greaterThanOrEquals(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, byte)
   */
  public Object greaterThanOrEquals(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, char)
   */
  public Object greaterThanOrEquals(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, double)
   */
  public Object greaterThanOrEquals(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, float)
   */
  public Object greaterThanOrEquals(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, int)
   */
  public Object greaterThanOrEquals(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, long)
   */
  public Object greaterThanOrEquals(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(byte, short)
   */
  public Object greaterThanOrEquals(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, byte)
   */
  public Object greaterThanOrEquals(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, char)
   */
  public Object greaterThanOrEquals(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, double)
   */
  public Object greaterThanOrEquals(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, float)
   */
  public Object greaterThanOrEquals(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, int)
   */
  public Object greaterThanOrEquals(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, long)
   */
  public Object greaterThanOrEquals(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(char, short)
   */
  public Object greaterThanOrEquals(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, byte)
   */
  public Object greaterThanOrEquals(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, char)
   */
  public Object greaterThanOrEquals(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, double)
   */
  public Object greaterThanOrEquals(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, float)
   */
  public Object greaterThanOrEquals(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, int)
   */
  public Object greaterThanOrEquals(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, long)
   */
  public Object greaterThanOrEquals(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(double, short)
   */
  public Object greaterThanOrEquals(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, byte)
   */
  public Object greaterThanOrEquals(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, char)
   */
  public Object greaterThanOrEquals(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, double)
   */
  public Object greaterThanOrEquals(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, float)
   */
  public Object greaterThanOrEquals(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, int)
   */
  public Object greaterThanOrEquals(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, long)
   */
  public Object greaterThanOrEquals(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(float, short)
   */
  public Object greaterThanOrEquals(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, byte)
   */
  public Object greaterThanOrEquals(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, char)
   */
  public Object greaterThanOrEquals(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, double)
   */
  public Object greaterThanOrEquals(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, float)
   */
  public Object greaterThanOrEquals(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, int)
   */
  public Object greaterThanOrEquals(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, long)
   */
  public Object greaterThanOrEquals(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(int, short)
   */
  public Object greaterThanOrEquals(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, byte)
   */
  public Object greaterThanOrEquals(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, char)
   */
  public Object greaterThanOrEquals(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, double)
   */
  public Object greaterThanOrEquals(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, float)
   */
  public Object greaterThanOrEquals(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, int)
   */
  public Object greaterThanOrEquals(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, long)
   */
  public Object greaterThanOrEquals(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(long, short)
   */
  public Object greaterThanOrEquals(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, byte)
   */
  public Object greaterThanOrEquals(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, char)
   */
  public Object greaterThanOrEquals(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, double)
   */
  public Object greaterThanOrEquals(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, float)
   */
  public Object greaterThanOrEquals(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, int)
   */
  public Object greaterThanOrEquals(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, long)
   */
  public Object greaterThanOrEquals(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#greaterThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object greaterThanOrEquals(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(java.lang.Object, short)
   */
  public Object greaterThanOrEquals(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().greaterThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, java.math.BigDecimal)
   */
  public Object greaterThanOrEquals(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, java.math.BigInteger)
   */
  public Object greaterThanOrEquals(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, byte)
   */
  public Object greaterThanOrEquals(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, char)
   */
  public Object greaterThanOrEquals(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, double)
   */
  public Object greaterThanOrEquals(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, float)
   */
  public Object greaterThanOrEquals(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, int)
   */
  public Object greaterThanOrEquals(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, long)
   */
  public Object greaterThanOrEquals(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#greaterThanOrEquals(short, short)
   */
  public Object greaterThanOrEquals(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object integerDivide(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object integerDivide(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, byte)
   */
  public Object integerDivide(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, char)
   */
  public Object integerDivide(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, double)
   */
  public Object integerDivide(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, float)
   */
  public Object integerDivide(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, int)
   */
  public Object integerDivide(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, long)
   */
  public Object integerDivide(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigDecimal, short)
   */
  public Object integerDivide(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object integerDivide(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, java.math.BigInteger)
   */
  public Object integerDivide(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, byte)
   */
  public Object integerDivide(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, char)
   */
  public Object integerDivide(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, double)
   */
  public Object integerDivide(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, float)
   */
  public Object integerDivide(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, int)
   */
  public Object integerDivide(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, long)
   */
  public Object integerDivide(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.math.BigInteger, short)
   */
  public Object integerDivide(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, java.math.BigDecimal)
   */
  public Object integerDivide(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, java.math.BigInteger)
   */
  public Object integerDivide(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, byte)
   */
  public Object integerDivide(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, char)
   */
  public Object integerDivide(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, double)
   */
  public Object integerDivide(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, float)
   */
  public Object integerDivide(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, int)
   */
  public Object integerDivide(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, long)
   */
  public Object integerDivide(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(byte, short)
   */
  public Object integerDivide(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, java.math.BigDecimal)
   */
  public Object integerDivide(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, java.math.BigInteger)
   */
  public Object integerDivide(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, byte)
   */
  public Object integerDivide(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, char)
   */
  public Object integerDivide(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, double)
   */
  public Object integerDivide(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, float)
   */
  public Object integerDivide(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, int)
   */
  public Object integerDivide(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, long)
   */
  public Object integerDivide(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(char, short)
   */
  public Object integerDivide(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, java.math.BigDecimal)
   */
  public Object integerDivide(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, java.math.BigInteger)
   */
  public Object integerDivide(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, byte)
   */
  public Object integerDivide(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, char)
   */
  public Object integerDivide(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, double)
   */
  public Object integerDivide(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, float)
   */
  public Object integerDivide(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, int)
   */
  public Object integerDivide(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, long)
   */
  public Object integerDivide(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(double, short)
   */
  public Object integerDivide(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, java.math.BigDecimal)
   */
  public Object integerDivide(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, java.math.BigInteger)
   */
  public Object integerDivide(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, byte)
   */
  public Object integerDivide(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, char)
   */
  public Object integerDivide(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, double)
   */
  public Object integerDivide(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, float)
   */
  public Object integerDivide(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, int)
   */
  public Object integerDivide(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, long)
   */
  public Object integerDivide(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(float, short)
   */
  public Object integerDivide(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, java.math.BigDecimal)
   */
  public Object integerDivide(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, java.math.BigInteger)
   */
  public Object integerDivide(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, byte)
   */
  public Object integerDivide(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, char)
   */
  public Object integerDivide(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, double)
   */
  public Object integerDivide(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, float)
   */
  public Object integerDivide(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, int)
   */
  public Object integerDivide(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, long)
   */
  public Object integerDivide(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(int, short)
   */
  public Object integerDivide(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, java.math.BigDecimal)
   */
  public Object integerDivide(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, java.math.BigInteger)
   */
  public Object integerDivide(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, byte)
   */
  public Object integerDivide(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, char)
   */
  public Object integerDivide(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, double)
   */
  public Object integerDivide(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, float)
   */
  public Object integerDivide(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, int)
   */
  public Object integerDivide(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, long)
   */
  public Object integerDivide(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(long, short)
   */
  public Object integerDivide(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, java.math.BigDecimal)
   */
  public Object integerDivide(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, java.math.BigInteger)
   */
  public Object integerDivide(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, byte)
   */
  public Object integerDivide(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, char)
   */
  public Object integerDivide(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, double)
   */
  public Object integerDivide(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, float)
   */
  public Object integerDivide(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, int)
   */
  public Object integerDivide(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, long)
   */
  public Object integerDivide(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#integerDivide(java.lang.Object, java.lang.Object)
   */
  public Object integerDivide(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(java.lang.Object, short)
   */
  public Object integerDivide(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivide(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, java.math.BigDecimal)
   */
  public Object integerDivide(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, java.math.BigInteger)
   */
  public Object integerDivide(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, byte)
   */
  public Object integerDivide(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, char)
   */
  public Object integerDivide(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, double)
   */
  public Object integerDivide(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, float)
   */
  public Object integerDivide(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, int)
   */
  public Object integerDivide(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, long)
   */
  public Object integerDivide(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivide(short, short)
   */
  public Object integerDivide(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object integerDivideEquals(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object integerDivideEquals(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, byte)
   */
  public Object integerDivideEquals(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, char)
   */
  public Object integerDivideEquals(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, double)
   */
  public Object integerDivideEquals(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, float)
   */
  public Object integerDivideEquals(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, int)
   */
  public Object integerDivideEquals(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, long)
   */
  public Object integerDivideEquals(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigDecimal, short)
   */
  public Object integerDivideEquals(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object integerDivideEquals(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object integerDivideEquals(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, byte)
   */
  public Object integerDivideEquals(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, char)
   */
  public Object integerDivideEquals(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, double)
   */
  public Object integerDivideEquals(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, float)
   */
  public Object integerDivideEquals(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, int)
   */
  public Object integerDivideEquals(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, long)
   */
  public Object integerDivideEquals(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.math.BigInteger, short)
   */
  public Object integerDivideEquals(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, java.math.BigDecimal)
   */
  public Object integerDivideEquals(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, java.math.BigInteger)
   */
  public Object integerDivideEquals(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, byte)
   */
  public Object integerDivideEquals(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, char)
   */
  public Object integerDivideEquals(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, double)
   */
  public Object integerDivideEquals(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, float)
   */
  public Object integerDivideEquals(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, int)
   */
  public Object integerDivideEquals(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, long)
   */
  public Object integerDivideEquals(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(byte, short)
   */
  public Object integerDivideEquals(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, java.math.BigDecimal)
   */
  public Object integerDivideEquals(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, java.math.BigInteger)
   */
  public Object integerDivideEquals(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, byte)
   */
  public Object integerDivideEquals(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, char)
   */
  public Object integerDivideEquals(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, double)
   */
  public Object integerDivideEquals(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, float)
   */
  public Object integerDivideEquals(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, int)
   */
  public Object integerDivideEquals(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, long)
   */
  public Object integerDivideEquals(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(char, short)
   */
  public Object integerDivideEquals(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, java.math.BigDecimal)
   */
  public Object integerDivideEquals(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, java.math.BigInteger)
   */
  public Object integerDivideEquals(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, byte)
   */
  public Object integerDivideEquals(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, char)
   */
  public Object integerDivideEquals(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, double)
   */
  public Object integerDivideEquals(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, float)
   */
  public Object integerDivideEquals(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, int)
   */
  public Object integerDivideEquals(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, long)
   */
  public Object integerDivideEquals(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(double, short)
   */
  public Object integerDivideEquals(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, java.math.BigDecimal)
   */
  public Object integerDivideEquals(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, java.math.BigInteger)
   */
  public Object integerDivideEquals(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, byte)
   */
  public Object integerDivideEquals(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, char)
   */
  public Object integerDivideEquals(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, double)
   */
  public Object integerDivideEquals(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, float)
   */
  public Object integerDivideEquals(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, int)
   */
  public Object integerDivideEquals(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, long)
   */
  public Object integerDivideEquals(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(float, short)
   */
  public Object integerDivideEquals(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, java.math.BigDecimal)
   */
  public Object integerDivideEquals(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, java.math.BigInteger)
   */
  public Object integerDivideEquals(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, byte)
   */
  public Object integerDivideEquals(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, char)
   */
  public Object integerDivideEquals(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, double)
   */
  public Object integerDivideEquals(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, float)
   */
  public Object integerDivideEquals(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, int)
   */
  public Object integerDivideEquals(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, long)
   */
  public Object integerDivideEquals(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(int, short)
   */
  public Object integerDivideEquals(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, java.math.BigDecimal)
   */
  public Object integerDivideEquals(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, java.math.BigInteger)
   */
  public Object integerDivideEquals(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, byte)
   */
  public Object integerDivideEquals(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, char)
   */
  public Object integerDivideEquals(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, double)
   */
  public Object integerDivideEquals(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, float)
   */
  public Object integerDivideEquals(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, int)
   */
  public Object integerDivideEquals(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, long)
   */
  public Object integerDivideEquals(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(long, short)
   */
  public Object integerDivideEquals(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, java.math.BigDecimal)
   */
  public Object integerDivideEquals(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object integerDivideEquals(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, byte)
   */
  public Object integerDivideEquals(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, char)
   */
  public Object integerDivideEquals(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, double)
   */
  public Object integerDivideEquals(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, float)
   */
  public Object integerDivideEquals(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, int)
   */
  public Object integerDivideEquals(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, long)
   */
  public Object integerDivideEquals(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#integerDivideEquals(java.lang.Object, java.lang.Object)
   */
  public Object integerDivideEquals(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(java.lang.Object, short)
   */
  public Object integerDivideEquals(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().integerDivideEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, java.math.BigDecimal)
   */
  public Object integerDivideEquals(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, java.math.BigInteger)
   */
  public Object integerDivideEquals(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, byte)
   */
  public Object integerDivideEquals(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, char)
   */
  public Object integerDivideEquals(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, double)
   */
  public Object integerDivideEquals(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, float)
   */
  public Object integerDivideEquals(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, int)
   */
  public Object integerDivideEquals(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, long)
   */
  public Object integerDivideEquals(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#integerDivideEquals(short, short)
   */
  public Object integerDivideEquals(short lhs, short rhs) {
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
  public Object invokeConstructor(Class theClass, Object[] arguments) {
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
  public Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2, Object p3, Object p4) {
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
  public Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2, Object p3) {
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
  public Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2) {
    return this.delegate.getRuntimeMetaClass().invokeMethodQuick(this.instance, methodName, p1, p2);
  }

  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object invokeMethodQuick(Object instance, String methodName, Object p1) {
    return this.delegate.getRuntimeMetaClass().invokeMethodQuick(this.instance, methodName, p1);
  }

  /**
   * @param instance
   * @param methodName
   * @param arguments
   * @return
   * @see ng.runtime.MetaClass#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object[])
   */
  public Object invokeMethod(Object instance, String methodName, Object[] arguments) {
    return this.delegate.getRuntimeMetaClass().invokeMethod(this.instance, methodName, arguments);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass[])
   */
  public MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass[] argumentMetaClasses) {
    return this.delegate.getRuntimeMetaClass().selectMethod(currentSelection, methodName, argumentMetaClasses);
  }

  /**
   * @param instance
   * @param methodName
   * @return
   * @see ng.runtime.RuntimeMetaClass#invokeMethodQuick(java.lang.Object, java.lang.String)
   */
  public Object invokeMethodQuick(Object instance, String methodName) {
    return this.delegate.getRuntimeMetaClass().invokeMethodQuick(this.instance, methodName);
  }

  /**
   * @param instance
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#isCase(java.lang.Object, java.lang.Object)
   */
  public Object isCase(Object instance, Object rhs) {
    return this.delegate.getRuntimeMetaClass().isCase(this.instance, rhs);
  }

  /**
   * @param instance
   * @param type
   * @return
   * @see ng.runtime.MetaClass#isInstanceof(java.lang.Object, java.lang.Class)
   */
  public Object isInstanceof(Object instance, Class type) {
    return this.delegate.getRuntimeMetaClass().isInstanceof(this.instance, type);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.math.BigInteger, java.math.BigInteger)
   */
  public Object leftShift(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.math.BigInteger, byte)
   */
  public Object leftShift(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.math.BigInteger, char)
   */
  public Object leftShift(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.math.BigInteger, int)
   */
  public Object leftShift(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.math.BigInteger, long)
   */
  public Object leftShift(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.math.BigInteger, short)
   */
  public Object leftShift(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(byte, java.math.BigInteger)
   */
  public Object leftShift(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(byte, byte)
   */
  public Object leftShift(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(byte, char)
   */
  public Object leftShift(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(byte, int)
   */
  public Object leftShift(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(byte, long)
   */
  public Object leftShift(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(byte, short)
   */
  public Object leftShift(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(char, java.math.BigInteger)
   */
  public Object leftShift(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(char, byte)
   */
  public Object leftShift(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(char, char)
   */
  public Object leftShift(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(char, int)
   */
  public Object leftShift(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(char, long)
   */
  public Object leftShift(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(char, short)
   */
  public Object leftShift(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(int, java.math.BigInteger)
   */
  public Object leftShift(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(int, byte)
   */
  public Object leftShift(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(int, char)
   */
  public Object leftShift(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(int, int)
   */
  public Object leftShift(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(int, long)
   */
  public Object leftShift(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(int, short)
   */
  public Object leftShift(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(long, java.math.BigInteger)
   */
  public Object leftShift(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(long, byte)
   */
  public Object leftShift(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(long, char)
   */
  public Object leftShift(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(long, int)
   */
  public Object leftShift(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(long, long)
   */
  public Object leftShift(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(long, short)
   */
  public Object leftShift(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.lang.Object, java.math.BigInteger)
   */
  public Object leftShift(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().leftShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.lang.Object, byte)
   */
  public Object leftShift(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().leftShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.lang.Object, char)
   */
  public Object leftShift(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().leftShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.lang.Object, int)
   */
  public Object leftShift(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().leftShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.lang.Object, long)
   */
  public Object leftShift(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().leftShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#leftShift(java.lang.Object, java.lang.Object)
   */
  public Object leftShift(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().leftShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(java.lang.Object, short)
   */
  public Object leftShift(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().leftShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(short, java.math.BigInteger)
   */
  public Object leftShift(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(short, byte)
   */
  public Object leftShift(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(short, char)
   */
  public Object leftShift(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(short, int)
   */
  public Object leftShift(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(short, long)
   */
  public Object leftShift(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShift(short, short)
   */
  public Object leftShift(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object leftShiftEquals(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.math.BigInteger, byte)
   */
  public Object leftShiftEquals(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.math.BigInteger, char)
   */
  public Object leftShiftEquals(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.math.BigInteger, int)
   */
  public Object leftShiftEquals(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.math.BigInteger, long)
   */
  public Object leftShiftEquals(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.math.BigInteger, short)
   */
  public Object leftShiftEquals(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(byte, java.math.BigInteger)
   */
  public Object leftShiftEquals(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(byte, byte)
   */
  public Object leftShiftEquals(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(byte, char)
   */
  public Object leftShiftEquals(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(byte, int)
   */
  public Object leftShiftEquals(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(byte, long)
   */
  public Object leftShiftEquals(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(byte, short)
   */
  public Object leftShiftEquals(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(char, java.math.BigInteger)
   */
  public Object leftShiftEquals(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(char, byte)
   */
  public Object leftShiftEquals(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(char, char)
   */
  public Object leftShiftEquals(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(char, int)
   */
  public Object leftShiftEquals(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(char, long)
   */
  public Object leftShiftEquals(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(char, short)
   */
  public Object leftShiftEquals(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(int, java.math.BigInteger)
   */
  public Object leftShiftEquals(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(int, byte)
   */
  public Object leftShiftEquals(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(int, char)
   */
  public Object leftShiftEquals(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(int, int)
   */
  public Object leftShiftEquals(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(int, long)
   */
  public Object leftShiftEquals(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(int, short)
   */
  public Object leftShiftEquals(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(long, java.math.BigInteger)
   */
  public Object leftShiftEquals(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(long, byte)
   */
  public Object leftShiftEquals(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(long, char)
   */
  public Object leftShiftEquals(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(long, int)
   */
  public Object leftShiftEquals(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(long, long)
   */
  public Object leftShiftEquals(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(long, short)
   */
  public Object leftShiftEquals(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object leftShiftEquals(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().leftShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.lang.Object, byte)
   */
  public Object leftShiftEquals(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().leftShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.lang.Object, char)
   */
  public Object leftShiftEquals(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().leftShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.lang.Object, int)
   */
  public Object leftShiftEquals(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().leftShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.lang.Object, long)
   */
  public Object leftShiftEquals(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().leftShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#leftShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object leftShiftEquals(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().leftShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(java.lang.Object, short)
   */
  public Object leftShiftEquals(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().leftShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(short, java.math.BigInteger)
   */
  public Object leftShiftEquals(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(short, byte)
   */
  public Object leftShiftEquals(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(short, char)
   */
  public Object leftShiftEquals(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(short, int)
   */
  public Object leftShiftEquals(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(short, long)
   */
  public Object leftShiftEquals(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#leftShiftEquals(short, short)
   */
  public Object leftShiftEquals(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object lessThan(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object lessThan(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, byte)
   */
  public Object lessThan(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, char)
   */
  public Object lessThan(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, double)
   */
  public Object lessThan(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, float)
   */
  public Object lessThan(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, int)
   */
  public Object lessThan(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, long)
   */
  public Object lessThan(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigDecimal, short)
   */
  public Object lessThan(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object lessThan(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, java.math.BigInteger)
   */
  public Object lessThan(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, byte)
   */
  public Object lessThan(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, char)
   */
  public Object lessThan(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, double)
   */
  public Object lessThan(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, float)
   */
  public Object lessThan(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, int)
   */
  public Object lessThan(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, long)
   */
  public Object lessThan(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.math.BigInteger, short)
   */
  public Object lessThan(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, java.math.BigDecimal)
   */
  public Object lessThan(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, java.math.BigInteger)
   */
  public Object lessThan(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, byte)
   */
  public Object lessThan(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, char)
   */
  public Object lessThan(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, double)
   */
  public Object lessThan(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, float)
   */
  public Object lessThan(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, int)
   */
  public Object lessThan(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, long)
   */
  public Object lessThan(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(byte, short)
   */
  public Object lessThan(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, java.math.BigDecimal)
   */
  public Object lessThan(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, java.math.BigInteger)
   */
  public Object lessThan(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, byte)
   */
  public Object lessThan(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, char)
   */
  public Object lessThan(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, double)
   */
  public Object lessThan(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, float)
   */
  public Object lessThan(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, int)
   */
  public Object lessThan(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, long)
   */
  public Object lessThan(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(char, short)
   */
  public Object lessThan(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, java.math.BigDecimal)
   */
  public Object lessThan(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, java.math.BigInteger)
   */
  public Object lessThan(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, byte)
   */
  public Object lessThan(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, char)
   */
  public Object lessThan(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, double)
   */
  public Object lessThan(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, float)
   */
  public Object lessThan(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, int)
   */
  public Object lessThan(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, long)
   */
  public Object lessThan(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(double, short)
   */
  public Object lessThan(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, java.math.BigDecimal)
   */
  public Object lessThan(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, java.math.BigInteger)
   */
  public Object lessThan(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, byte)
   */
  public Object lessThan(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, char)
   */
  public Object lessThan(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, double)
   */
  public Object lessThan(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, float)
   */
  public Object lessThan(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, int)
   */
  public Object lessThan(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, long)
   */
  public Object lessThan(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(float, short)
   */
  public Object lessThan(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, java.math.BigDecimal)
   */
  public Object lessThan(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, java.math.BigInteger)
   */
  public Object lessThan(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, byte)
   */
  public Object lessThan(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, char)
   */
  public Object lessThan(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, double)
   */
  public Object lessThan(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, float)
   */
  public Object lessThan(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, int)
   */
  public Object lessThan(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, long)
   */
  public Object lessThan(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(int, short)
   */
  public Object lessThan(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, java.math.BigDecimal)
   */
  public Object lessThan(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, java.math.BigInteger)
   */
  public Object lessThan(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, byte)
   */
  public Object lessThan(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, char)
   */
  public Object lessThan(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, double)
   */
  public Object lessThan(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, float)
   */
  public Object lessThan(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, int)
   */
  public Object lessThan(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, long)
   */
  public Object lessThan(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(long, short)
   */
  public Object lessThan(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, java.math.BigDecimal)
   */
  public Object lessThan(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, java.math.BigInteger)
   */
  public Object lessThan(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, byte)
   */
  public Object lessThan(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, char)
   */
  public Object lessThan(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, double)
   */
  public Object lessThan(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, float)
   */
  public Object lessThan(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, int)
   */
  public Object lessThan(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, long)
   */
  public Object lessThan(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#lessThan(java.lang.Object, java.lang.Object)
   */
  public Object lessThan(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(java.lang.Object, short)
   */
  public Object lessThan(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().lessThan(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, java.math.BigDecimal)
   */
  public Object lessThan(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, java.math.BigInteger)
   */
  public Object lessThan(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, byte)
   */
  public Object lessThan(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, char)
   */
  public Object lessThan(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, double)
   */
  public Object lessThan(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, float)
   */
  public Object lessThan(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, int)
   */
  public Object lessThan(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, long)
   */
  public Object lessThan(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThan(short, short)
   */
  public Object lessThan(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object lessThanOrEquals(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, byte)
   */
  public Object lessThanOrEquals(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, char)
   */
  public Object lessThanOrEquals(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, double)
   */
  public Object lessThanOrEquals(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, float)
   */
  public Object lessThanOrEquals(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, int)
   */
  public Object lessThanOrEquals(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, long)
   */
  public Object lessThanOrEquals(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigDecimal, short)
   */
  public Object lessThanOrEquals(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object lessThanOrEquals(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, byte)
   */
  public Object lessThanOrEquals(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, char)
   */
  public Object lessThanOrEquals(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, double)
   */
  public Object lessThanOrEquals(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, float)
   */
  public Object lessThanOrEquals(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, int)
   */
  public Object lessThanOrEquals(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, long)
   */
  public Object lessThanOrEquals(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.math.BigInteger, short)
   */
  public Object lessThanOrEquals(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, java.math.BigInteger)
   */
  public Object lessThanOrEquals(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, byte)
   */
  public Object lessThanOrEquals(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, char)
   */
  public Object lessThanOrEquals(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, double)
   */
  public Object lessThanOrEquals(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, float)
   */
  public Object lessThanOrEquals(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, int)
   */
  public Object lessThanOrEquals(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, long)
   */
  public Object lessThanOrEquals(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(byte, short)
   */
  public Object lessThanOrEquals(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, java.math.BigInteger)
   */
  public Object lessThanOrEquals(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, byte)
   */
  public Object lessThanOrEquals(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, char)
   */
  public Object lessThanOrEquals(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, double)
   */
  public Object lessThanOrEquals(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, float)
   */
  public Object lessThanOrEquals(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, int)
   */
  public Object lessThanOrEquals(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, long)
   */
  public Object lessThanOrEquals(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(char, short)
   */
  public Object lessThanOrEquals(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, java.math.BigInteger)
   */
  public Object lessThanOrEquals(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, byte)
   */
  public Object lessThanOrEquals(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, char)
   */
  public Object lessThanOrEquals(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, double)
   */
  public Object lessThanOrEquals(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, float)
   */
  public Object lessThanOrEquals(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, int)
   */
  public Object lessThanOrEquals(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, long)
   */
  public Object lessThanOrEquals(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(double, short)
   */
  public Object lessThanOrEquals(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, java.math.BigInteger)
   */
  public Object lessThanOrEquals(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, byte)
   */
  public Object lessThanOrEquals(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, char)
   */
  public Object lessThanOrEquals(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, double)
   */
  public Object lessThanOrEquals(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, float)
   */
  public Object lessThanOrEquals(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, int)
   */
  public Object lessThanOrEquals(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, long)
   */
  public Object lessThanOrEquals(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(float, short)
   */
  public Object lessThanOrEquals(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, java.math.BigInteger)
   */
  public Object lessThanOrEquals(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, byte)
   */
  public Object lessThanOrEquals(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, char)
   */
  public Object lessThanOrEquals(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, double)
   */
  public Object lessThanOrEquals(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, float)
   */
  public Object lessThanOrEquals(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, int)
   */
  public Object lessThanOrEquals(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, long)
   */
  public Object lessThanOrEquals(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(int, short)
   */
  public Object lessThanOrEquals(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, java.math.BigInteger)
   */
  public Object lessThanOrEquals(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, byte)
   */
  public Object lessThanOrEquals(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, char)
   */
  public Object lessThanOrEquals(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, double)
   */
  public Object lessThanOrEquals(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, float)
   */
  public Object lessThanOrEquals(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, int)
   */
  public Object lessThanOrEquals(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, long)
   */
  public Object lessThanOrEquals(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(long, short)
   */
  public Object lessThanOrEquals(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object lessThanOrEquals(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, byte)
   */
  public Object lessThanOrEquals(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, char)
   */
  public Object lessThanOrEquals(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, double)
   */
  public Object lessThanOrEquals(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, float)
   */
  public Object lessThanOrEquals(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, int)
   */
  public Object lessThanOrEquals(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, long)
   */
  public Object lessThanOrEquals(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#lessThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object lessThanOrEquals(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(java.lang.Object, short)
   */
  public Object lessThanOrEquals(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().lessThanOrEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, java.math.BigDecimal)
   */
  public Object lessThanOrEquals(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, java.math.BigInteger)
   */
  public Object lessThanOrEquals(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, byte)
   */
  public Object lessThanOrEquals(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, char)
   */
  public Object lessThanOrEquals(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, double)
   */
  public Object lessThanOrEquals(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, float)
   */
  public Object lessThanOrEquals(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, int)
   */
  public Object lessThanOrEquals(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, long)
   */
  public Object lessThanOrEquals(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#lessThanOrEquals(short, short)
   */
  public Object lessThanOrEquals(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(byte, java.math.BigInteger)
   */
  public Object logicalRightShift(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(byte, byte)
   */
  public Object logicalRightShift(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(byte, char)
   */
  public Object logicalRightShift(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(byte, int)
   */
  public Object logicalRightShift(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(byte, long)
   */
  public Object logicalRightShift(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(byte, short)
   */
  public Object logicalRightShift(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(char, java.math.BigInteger)
   */
  public Object logicalRightShift(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(char, byte)
   */
  public Object logicalRightShift(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(char, char)
   */
  public Object logicalRightShift(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(char, int)
   */
  public Object logicalRightShift(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(char, long)
   */
  public Object logicalRightShift(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(char, short)
   */
  public Object logicalRightShift(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(int, java.math.BigInteger)
   */
  public Object logicalRightShift(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(int, byte)
   */
  public Object logicalRightShift(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(int, char)
   */
  public Object logicalRightShift(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(int, int)
   */
  public Object logicalRightShift(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(int, long)
   */
  public Object logicalRightShift(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(int, short)
   */
  public Object logicalRightShift(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(long, java.math.BigInteger)
   */
  public Object logicalRightShift(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(long, byte)
   */
  public Object logicalRightShift(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(long, char)
   */
  public Object logicalRightShift(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(long, int)
   */
  public Object logicalRightShift(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(long, long)
   */
  public Object logicalRightShift(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(long, short)
   */
  public Object logicalRightShift(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(java.lang.Object, java.math.BigInteger)
   */
  public Object logicalRightShift(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().logicalRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(java.lang.Object, byte)
   */
  public Object logicalRightShift(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().logicalRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(java.lang.Object, char)
   */
  public Object logicalRightShift(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().logicalRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(java.lang.Object, int)
   */
  public Object logicalRightShift(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().logicalRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(java.lang.Object, long)
   */
  public Object logicalRightShift(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().logicalRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#logicalRightShift(java.lang.Object, java.lang.Object)
   */
  public Object logicalRightShift(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().logicalRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(java.lang.Object, short)
   */
  public Object logicalRightShift(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().logicalRightShift(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(short, java.math.BigInteger)
   */
  public Object logicalRightShift(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(short, byte)
   */
  public Object logicalRightShift(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(short, char)
   */
  public Object logicalRightShift(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(short, int)
   */
  public Object logicalRightShift(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(short, long)
   */
  public Object logicalRightShift(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShift(short, short)
   */
  public Object logicalRightShift(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(byte, java.math.BigInteger)
   */
  public Object logicalRightShiftEquals(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(byte, byte)
   */
  public Object logicalRightShiftEquals(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(byte, char)
   */
  public Object logicalRightShiftEquals(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(byte, int)
   */
  public Object logicalRightShiftEquals(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(byte, long)
   */
  public Object logicalRightShiftEquals(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(byte, short)
   */
  public Object logicalRightShiftEquals(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(char, java.math.BigInteger)
   */
  public Object logicalRightShiftEquals(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(char, byte)
   */
  public Object logicalRightShiftEquals(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(char, char)
   */
  public Object logicalRightShiftEquals(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(char, int)
   */
  public Object logicalRightShiftEquals(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(char, long)
   */
  public Object logicalRightShiftEquals(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(char, short)
   */
  public Object logicalRightShiftEquals(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(int, java.math.BigInteger)
   */
  public Object logicalRightShiftEquals(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(int, byte)
   */
  public Object logicalRightShiftEquals(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(int, char)
   */
  public Object logicalRightShiftEquals(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(int, int)
   */
  public Object logicalRightShiftEquals(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(int, long)
   */
  public Object logicalRightShiftEquals(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(int, short)
   */
  public Object logicalRightShiftEquals(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(long, java.math.BigInteger)
   */
  public Object logicalRightShiftEquals(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(long, byte)
   */
  public Object logicalRightShiftEquals(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(long, char)
   */
  public Object logicalRightShiftEquals(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(long, int)
   */
  public Object logicalRightShiftEquals(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(long, long)
   */
  public Object logicalRightShiftEquals(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(long, short)
   */
  public Object logicalRightShiftEquals(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object logicalRightShiftEquals(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().logicalRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(java.lang.Object, byte)
   */
  public Object logicalRightShiftEquals(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().logicalRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(java.lang.Object, char)
   */
  public Object logicalRightShiftEquals(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().logicalRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(java.lang.Object, int)
   */
  public Object logicalRightShiftEquals(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().logicalRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(java.lang.Object, long)
   */
  public Object logicalRightShiftEquals(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().logicalRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#logicalRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object logicalRightShiftEquals(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().logicalRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(java.lang.Object, short)
   */
  public Object logicalRightShiftEquals(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().logicalRightShiftEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(short, java.math.BigInteger)
   */
  public Object logicalRightShiftEquals(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(short, byte)
   */
  public Object logicalRightShiftEquals(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(short, char)
   */
  public Object logicalRightShiftEquals(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(short, int)
   */
  public Object logicalRightShiftEquals(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(short, long)
   */
  public Object logicalRightShiftEquals(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#logicalRightShiftEquals(short, short)
   */
  public Object logicalRightShiftEquals(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object multiply(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object multiply(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, byte)
   */
  public Object multiply(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, char)
   */
  public Object multiply(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, double)
   */
  public Object multiply(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, float)
   */
  public Object multiply(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, int)
   */
  public Object multiply(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, long)
   */
  public Object multiply(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigDecimal, short)
   */
  public Object multiply(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object multiply(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, java.math.BigInteger)
   */
  public Object multiply(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, byte)
   */
  public Object multiply(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, char)
   */
  public Object multiply(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, double)
   */
  public Object multiply(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, float)
   */
  public Object multiply(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, int)
   */
  public Object multiply(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, long)
   */
  public Object multiply(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.math.BigInteger, short)
   */
  public Object multiply(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, java.math.BigDecimal)
   */
  public Object multiply(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, java.math.BigInteger)
   */
  public Object multiply(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, byte)
   */
  public Object multiply(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, char)
   */
  public Object multiply(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, double)
   */
  public Object multiply(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, float)
   */
  public Object multiply(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, int)
   */
  public Object multiply(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, long)
   */
  public Object multiply(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(byte, short)
   */
  public Object multiply(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, java.math.BigDecimal)
   */
  public Object multiply(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, java.math.BigInteger)
   */
  public Object multiply(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, byte)
   */
  public Object multiply(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, char)
   */
  public Object multiply(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, double)
   */
  public Object multiply(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, float)
   */
  public Object multiply(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, int)
   */
  public Object multiply(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, long)
   */
  public Object multiply(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(char, short)
   */
  public Object multiply(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, java.math.BigDecimal)
   */
  public Object multiply(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, java.math.BigInteger)
   */
  public Object multiply(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, byte)
   */
  public Object multiply(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, char)
   */
  public Object multiply(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, double)
   */
  public Object multiply(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, float)
   */
  public Object multiply(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, int)
   */
  public Object multiply(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, long)
   */
  public Object multiply(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(double, short)
   */
  public Object multiply(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, java.math.BigDecimal)
   */
  public Object multiply(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, java.math.BigInteger)
   */
  public Object multiply(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, byte)
   */
  public Object multiply(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, char)
   */
  public Object multiply(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, double)
   */
  public Object multiply(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, float)
   */
  public Object multiply(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, int)
   */
  public Object multiply(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, long)
   */
  public Object multiply(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(float, short)
   */
  public Object multiply(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, java.math.BigDecimal)
   */
  public Object multiply(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, java.math.BigInteger)
   */
  public Object multiply(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, byte)
   */
  public Object multiply(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, char)
   */
  public Object multiply(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, double)
   */
  public Object multiply(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, float)
   */
  public Object multiply(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, int)
   */
  public Object multiply(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, long)
   */
  public Object multiply(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(int, short)
   */
  public Object multiply(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, java.math.BigDecimal)
   */
  public Object multiply(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, java.math.BigInteger)
   */
  public Object multiply(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, byte)
   */
  public Object multiply(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, char)
   */
  public Object multiply(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, double)
   */
  public Object multiply(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, float)
   */
  public Object multiply(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, int)
   */
  public Object multiply(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, long)
   */
  public Object multiply(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(long, short)
   */
  public Object multiply(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, java.math.BigDecimal)
   */
  public Object multiply(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, java.math.BigInteger)
   */
  public Object multiply(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, byte)
   */
  public Object multiply(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, char)
   */
  public Object multiply(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, double)
   */
  public Object multiply(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, float)
   */
  public Object multiply(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, int)
   */
  public Object multiply(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, long)
   */
  public Object multiply(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#multiply(java.lang.Object, java.lang.Object)
   */
  public Object multiply(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(java.lang.Object, short)
   */
  public Object multiply(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().multiply(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, java.math.BigDecimal)
   */
  public Object multiply(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, java.math.BigInteger)
   */
  public Object multiply(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, byte)
   */
  public Object multiply(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, char)
   */
  public Object multiply(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, double)
   */
  public Object multiply(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, float)
   */
  public Object multiply(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, int)
   */
  public Object multiply(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, long)
   */
  public Object multiply(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiply(short, short)
   */
  public Object multiply(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object multiplyEquals(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object multiplyEquals(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, byte)
   */
  public Object multiplyEquals(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, char)
   */
  public Object multiplyEquals(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, double)
   */
  public Object multiplyEquals(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, float)
   */
  public Object multiplyEquals(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, int)
   */
  public Object multiplyEquals(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, long)
   */
  public Object multiplyEquals(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigDecimal, short)
   */
  public Object multiplyEquals(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object multiplyEquals(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object multiplyEquals(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, byte)
   */
  public Object multiplyEquals(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, char)
   */
  public Object multiplyEquals(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, double)
   */
  public Object multiplyEquals(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, float)
   */
  public Object multiplyEquals(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, int)
   */
  public Object multiplyEquals(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, long)
   */
  public Object multiplyEquals(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.math.BigInteger, short)
   */
  public Object multiplyEquals(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, java.math.BigDecimal)
   */
  public Object multiplyEquals(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, java.math.BigInteger)
   */
  public Object multiplyEquals(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, byte)
   */
  public Object multiplyEquals(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, char)
   */
  public Object multiplyEquals(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, double)
   */
  public Object multiplyEquals(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, float)
   */
  public Object multiplyEquals(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, int)
   */
  public Object multiplyEquals(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, long)
   */
  public Object multiplyEquals(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(byte, short)
   */
  public Object multiplyEquals(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, java.math.BigDecimal)
   */
  public Object multiplyEquals(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, java.math.BigInteger)
   */
  public Object multiplyEquals(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, byte)
   */
  public Object multiplyEquals(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, char)
   */
  public Object multiplyEquals(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, double)
   */
  public Object multiplyEquals(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, float)
   */
  public Object multiplyEquals(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, int)
   */
  public Object multiplyEquals(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, long)
   */
  public Object multiplyEquals(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(char, short)
   */
  public Object multiplyEquals(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, java.math.BigDecimal)
   */
  public Object multiplyEquals(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, java.math.BigInteger)
   */
  public Object multiplyEquals(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, byte)
   */
  public Object multiplyEquals(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, char)
   */
  public Object multiplyEquals(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, double)
   */
  public Object multiplyEquals(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, float)
   */
  public Object multiplyEquals(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, int)
   */
  public Object multiplyEquals(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, long)
   */
  public Object multiplyEquals(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(double, short)
   */
  public Object multiplyEquals(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, java.math.BigDecimal)
   */
  public Object multiplyEquals(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, java.math.BigInteger)
   */
  public Object multiplyEquals(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, byte)
   */
  public Object multiplyEquals(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, char)
   */
  public Object multiplyEquals(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, double)
   */
  public Object multiplyEquals(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, float)
   */
  public Object multiplyEquals(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, int)
   */
  public Object multiplyEquals(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, long)
   */
  public Object multiplyEquals(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(float, short)
   */
  public Object multiplyEquals(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, java.math.BigDecimal)
   */
  public Object multiplyEquals(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, java.math.BigInteger)
   */
  public Object multiplyEquals(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, byte)
   */
  public Object multiplyEquals(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, char)
   */
  public Object multiplyEquals(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, double)
   */
  public Object multiplyEquals(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, float)
   */
  public Object multiplyEquals(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, int)
   */
  public Object multiplyEquals(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, long)
   */
  public Object multiplyEquals(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(int, short)
   */
  public Object multiplyEquals(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, java.math.BigDecimal)
   */
  public Object multiplyEquals(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, java.math.BigInteger)
   */
  public Object multiplyEquals(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, byte)
   */
  public Object multiplyEquals(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, char)
   */
  public Object multiplyEquals(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, double)
   */
  public Object multiplyEquals(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, float)
   */
  public Object multiplyEquals(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, int)
   */
  public Object multiplyEquals(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, long)
   */
  public Object multiplyEquals(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(long, short)
   */
  public Object multiplyEquals(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, java.math.BigDecimal)
   */
  public Object multiplyEquals(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object multiplyEquals(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, byte)
   */
  public Object multiplyEquals(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, char)
   */
  public Object multiplyEquals(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, double)
   */
  public Object multiplyEquals(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, float)
   */
  public Object multiplyEquals(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, int)
   */
  public Object multiplyEquals(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, long)
   */
  public Object multiplyEquals(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#multiplyEquals(java.lang.Object, java.lang.Object)
   */
  public Object multiplyEquals(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(java.lang.Object, short)
   */
  public Object multiplyEquals(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().multiplyEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, java.math.BigDecimal)
   */
  public Object multiplyEquals(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, java.math.BigInteger)
   */
  public Object multiplyEquals(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, byte)
   */
  public Object multiplyEquals(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, char)
   */
  public Object multiplyEquals(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, double)
   */
  public Object multiplyEquals(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, float)
   */
  public Object multiplyEquals(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, int)
   */
  public Object multiplyEquals(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, long)
   */
  public Object multiplyEquals(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#multiplyEquals(short, short)
   */
  public Object multiplyEquals(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#not(boolean)
   */
  public Object not(boolean instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param operand
   * @return
   * @see ng.runtime.MetaClass#not(java.lang.Object)
   */
  public Object not(Object operand) {
    return this.delegate.getRuntimeMetaClass().not(this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object notEquals(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object notEquals(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, byte)
   */
  public Object notEquals(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, char)
   */
  public Object notEquals(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, double)
   */
  public Object notEquals(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, float)
   */
  public Object notEquals(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, int)
   */
  public Object notEquals(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, long)
   */
  public Object notEquals(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigDecimal, short)
   */
  public Object notEquals(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object notEquals(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object notEquals(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, byte)
   */
  public Object notEquals(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, char)
   */
  public Object notEquals(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, double)
   */
  public Object notEquals(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, float)
   */
  public Object notEquals(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, int)
   */
  public Object notEquals(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, long)
   */
  public Object notEquals(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.math.BigInteger, short)
   */
  public Object notEquals(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, java.math.BigDecimal)
   */
  public Object notEquals(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, java.math.BigInteger)
   */
  public Object notEquals(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, byte)
   */
  public Object notEquals(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, char)
   */
  public Object notEquals(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, double)
   */
  public Object notEquals(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, float)
   */
  public Object notEquals(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, int)
   */
  public Object notEquals(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, long)
   */
  public Object notEquals(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(byte, short)
   */
  public Object notEquals(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, java.math.BigDecimal)
   */
  public Object notEquals(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, java.math.BigInteger)
   */
  public Object notEquals(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, byte)
   */
  public Object notEquals(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, char)
   */
  public Object notEquals(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, double)
   */
  public Object notEquals(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, float)
   */
  public Object notEquals(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, int)
   */
  public Object notEquals(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, long)
   */
  public Object notEquals(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(char, short)
   */
  public Object notEquals(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, java.math.BigDecimal)
   */
  public Object notEquals(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, java.math.BigInteger)
   */
  public Object notEquals(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, byte)
   */
  public Object notEquals(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, char)
   */
  public Object notEquals(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, double)
   */
  public Object notEquals(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, float)
   */
  public Object notEquals(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, int)
   */
  public Object notEquals(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, long)
   */
  public Object notEquals(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(double, short)
   */
  public Object notEquals(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, java.math.BigDecimal)
   */
  public Object notEquals(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, java.math.BigInteger)
   */
  public Object notEquals(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, byte)
   */
  public Object notEquals(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, char)
   */
  public Object notEquals(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, double)
   */
  public Object notEquals(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, float)
   */
  public Object notEquals(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, int)
   */
  public Object notEquals(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, long)
   */
  public Object notEquals(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(float, short)
   */
  public Object notEquals(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, java.math.BigDecimal)
   */
  public Object notEquals(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, java.math.BigInteger)
   */
  public Object notEquals(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, byte)
   */
  public Object notEquals(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, char)
   */
  public Object notEquals(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, double)
   */
  public Object notEquals(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, float)
   */
  public Object notEquals(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, int)
   */
  public Object notEquals(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, long)
   */
  public Object notEquals(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(int, short)
   */
  public Object notEquals(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, java.math.BigDecimal)
   */
  public Object notEquals(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, java.math.BigInteger)
   */
  public Object notEquals(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, byte)
   */
  public Object notEquals(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, char)
   */
  public Object notEquals(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, double)
   */
  public Object notEquals(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, float)
   */
  public Object notEquals(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, int)
   */
  public Object notEquals(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, long)
   */
  public Object notEquals(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(long, short)
   */
  public Object notEquals(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, java.math.BigDecimal)
   */
  public Object notEquals(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object notEquals(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, byte)
   */
  public Object notEquals(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, char)
   */
  public Object notEquals(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, double)
   */
  public Object notEquals(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, float)
   */
  public Object notEquals(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, int)
   */
  public Object notEquals(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, long)
   */
  public Object notEquals(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#notEquals(java.lang.Object, java.lang.Object)
   */
  public Object notEquals(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(java.lang.Object, short)
   */
  public Object notEquals(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().notEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, java.math.BigDecimal)
   */
  public Object notEquals(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, java.math.BigInteger)
   */
  public Object notEquals(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, byte)
   */
  public Object notEquals(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, char)
   */
  public Object notEquals(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, double)
   */
  public Object notEquals(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, float)
   */
  public Object notEquals(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, int)
   */
  public Object notEquals(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, long)
   */
  public Object notEquals(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#notEquals(short, short)
   */
  public Object notEquals(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.math.BigInteger, java.math.BigInteger)
   */
  public Object or(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.math.BigInteger, byte)
   */
  public Object or(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.math.BigInteger, char)
   */
  public Object or(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.math.BigInteger, int)
   */
  public Object or(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.math.BigInteger, long)
   */
  public Object or(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.math.BigInteger, short)
   */
  public Object or(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(byte, java.math.BigInteger)
   */
  public Object or(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(byte, byte)
   */
  public Object or(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(byte, char)
   */
  public Object or(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(byte, int)
   */
  public Object or(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(byte, long)
   */
  public Object or(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(byte, short)
   */
  public Object or(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(char, java.math.BigInteger)
   */
  public Object or(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(char, byte)
   */
  public Object or(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(char, char)
   */
  public Object or(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(char, int)
   */
  public Object or(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(char, long)
   */
  public Object or(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(char, short)
   */
  public Object or(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(int, java.math.BigInteger)
   */
  public Object or(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(int, byte)
   */
  public Object or(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(int, char)
   */
  public Object or(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(int, int)
   */
  public Object or(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(int, long)
   */
  public Object or(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(int, short)
   */
  public Object or(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(long, java.math.BigInteger)
   */
  public Object or(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(long, byte)
   */
  public Object or(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(long, char)
   */
  public Object or(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(long, int)
   */
  public Object or(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(long, long)
   */
  public Object or(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(long, short)
   */
  public Object or(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.lang.Object, java.math.BigInteger)
   */
  public Object or(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().or(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.lang.Object, byte)
   */
  public Object or(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().or(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.lang.Object, char)
   */
  public Object or(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().or(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.lang.Object, int)
   */
  public Object or(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().or(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.lang.Object, long)
   */
  public Object or(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().or(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#or(java.lang.Object, java.lang.Object)
   */
  public Object or(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().or(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(java.lang.Object, short)
   */
  public Object or(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().or(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(short, java.math.BigInteger)
   */
  public Object or(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(short, byte)
   */
  public Object or(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(short, char)
   */
  public Object or(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(short, int)
   */
  public Object or(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(short, long)
   */
  public Object or(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#or(short, short)
   */
  public Object or(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object orEquals(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.math.BigInteger, byte)
   */
  public Object orEquals(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.math.BigInteger, char)
   */
  public Object orEquals(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.math.BigInteger, int)
   */
  public Object orEquals(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.math.BigInteger, long)
   */
  public Object orEquals(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.math.BigInteger, short)
   */
  public Object orEquals(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(byte, java.math.BigInteger)
   */
  public Object orEquals(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(byte, byte)
   */
  public Object orEquals(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(byte, char)
   */
  public Object orEquals(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(byte, int)
   */
  public Object orEquals(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(byte, long)
   */
  public Object orEquals(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(byte, short)
   */
  public Object orEquals(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(char, java.math.BigInteger)
   */
  public Object orEquals(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(char, byte)
   */
  public Object orEquals(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(char, char)
   */
  public Object orEquals(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(char, int)
   */
  public Object orEquals(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(char, long)
   */
  public Object orEquals(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(char, short)
   */
  public Object orEquals(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(int, java.math.BigInteger)
   */
  public Object orEquals(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(int, byte)
   */
  public Object orEquals(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(int, char)
   */
  public Object orEquals(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(int, int)
   */
  public Object orEquals(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(int, long)
   */
  public Object orEquals(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(int, short)
   */
  public Object orEquals(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(long, java.math.BigInteger)
   */
  public Object orEquals(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(long, byte)
   */
  public Object orEquals(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(long, char)
   */
  public Object orEquals(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(long, int)
   */
  public Object orEquals(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(long, long)
   */
  public Object orEquals(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(long, short)
   */
  public Object orEquals(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object orEquals(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().orEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.lang.Object, byte)
   */
  public Object orEquals(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().orEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.lang.Object, char)
   */
  public Object orEquals(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().orEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.lang.Object, int)
   */
  public Object orEquals(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().orEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.lang.Object, long)
   */
  public Object orEquals(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().orEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#orEquals(java.lang.Object, java.lang.Object)
   */
  public Object orEquals(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().orEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(java.lang.Object, short)
   */
  public Object orEquals(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().orEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(short, java.math.BigInteger)
   */
  public Object orEquals(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(short, byte)
   */
  public Object orEquals(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(short, char)
   */
  public Object orEquals(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(short, int)
   */
  public Object orEquals(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(short, long)
   */
  public Object orEquals(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#orEquals(short, short)
   */
  public Object orEquals(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixDecrement(java.math.BigDecimal)
   */
  public Object postfixDecrement(BigDecimal instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixDecrement(java.math.BigInteger)
   */
  public Object postfixDecrement(BigInteger instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixDecrement(double)
   */
  public Object postfixDecrement(double instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixDecrement(float)
   */
  public Object postfixDecrement(float instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixDecrement(int)
   */
  public Object postfixDecrement(int instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixDecrement(long)
   */
  public Object postfixDecrement(long instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param operand
   * @return
   * @see ng.runtime.MetaClass#postfixDecrement(java.lang.Object)
   */
  public Object postfixDecrement(Object operand) {
    return this.delegate.getRuntimeMetaClass().postfixDecrement(operand);
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixIncrement(java.math.BigDecimal)
   */
  public Object postfixIncrement(BigDecimal instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixIncrement(java.math.BigInteger)
   */
  public Object postfixIncrement(BigInteger instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixIncrement(double)
   */
  public Object postfixIncrement(double instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixIncrement(float)
   */
  public Object postfixIncrement(float instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixIncrement(int)
   */
  public Object postfixIncrement(int instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#postfixIncrement(long)
   */
  public Object postfixIncrement(long instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param operand
   * @return
   * @see ng.runtime.MetaClass#postfixIncrement(java.lang.Object)
   */
  public Object postfixIncrement(Object operand) {
    return this.delegate.getRuntimeMetaClass().postfixIncrement(operand);
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixDecrement(java.math.BigDecimal)
   */
  public Object prefixDecrement(BigDecimal instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixDecrement(java.math.BigInteger)
   */
  public Object prefixDecrement(BigInteger instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixDecrement(double)
   */
  public Object prefixDecrement(double instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixDecrement(float)
   */
  public Object prefixDecrement(float instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixDecrement(int)
   */
  public Object prefixDecrement(int instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixDecrement(long)
   */
  public Object prefixDecrement(long instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param operand
   * @return
   * @see ng.runtime.MetaClass#prefixDecrement(java.lang.Object)
   */
  public Object prefixDecrement(Object operand) {
    return this.delegate.getRuntimeMetaClass().prefixDecrement(this.instance);
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixIncrement(java.math.BigDecimal)
   */
  public Object prefixIncrement(BigDecimal instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixIncrement(java.math.BigInteger)
   */
  public Object prefixIncrement(BigInteger instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixIncrement(double)
   */
  public Object prefixIncrement(double instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixIncrement(float)
   */
  public Object prefixIncrement(float instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixIncrement(int)
   */
  public Object prefixIncrement(int instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#prefixIncrement(long)
   */
  public Object prefixIncrement(long instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param operand
   * @return
   * @see ng.runtime.MetaClass#prefixIncrement(java.lang.Object)
   */
  public Object prefixIncrement(Object operand) {
    return this.delegate.getRuntimeMetaClass().prefixIncrement(this.instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#putAt(java.lang.Object, java.math.BigInteger)
   */
  public Object putAt(Object instance, BigInteger index) {
    return this.delegate.getRuntimeMetaClass().putAt(this.instance, index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.RuntimeMetaClass#putAt(java.lang.Object, int)
   */
  public Object putAt(Object instance, int index) {
    return this.delegate.getRuntimeMetaClass().putAt(this.instance, index);
  }

  /**
   * @param instance
   * @param index
   * @return
   * @see ng.runtime.MetaClass#putAt(java.lang.Object, java.lang.Object)
   */
  public Object putAt(Object instance, Object index) {
    return this.delegate.getRuntimeMetaClass().putAt(this.instance, index);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.math.BigInteger, java.math.BigInteger)
   */
  public Object remainder(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.math.BigInteger, byte)
   */
  public Object remainder(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.math.BigInteger, char)
   */
  public Object remainder(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.math.BigInteger, int)
   */
  public Object remainder(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.math.BigInteger, long)
   */
  public Object remainder(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.math.BigInteger, short)
   */
  public Object remainder(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(byte, java.math.BigInteger)
   */
  public Object remainder(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(byte, byte)
   */
  public Object remainder(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(byte, char)
   */
  public Object remainder(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(byte, int)
   */
  public Object remainder(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(byte, long)
   */
  public Object remainder(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(byte, short)
   */
  public Object remainder(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(char, java.math.BigInteger)
   */
  public Object remainder(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(char, byte)
   */
  public Object remainder(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(char, char)
   */
  public Object remainder(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(char, int)
   */
  public Object remainder(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(char, long)
   */
  public Object remainder(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(char, short)
   */
  public Object remainder(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(int, java.math.BigInteger)
   */
  public Object remainder(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(int, byte)
   */
  public Object remainder(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(int, char)
   */
  public Object remainder(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(int, int)
   */
  public Object remainder(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(int, long)
   */
  public Object remainder(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(int, short)
   */
  public Object remainder(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(long, java.math.BigInteger)
   */
  public Object remainder(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(long, byte)
   */
  public Object remainder(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(long, char)
   */
  public Object remainder(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(long, int)
   */
  public Object remainder(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(long, long)
   */
  public Object remainder(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(long, short)
   */
  public Object remainder(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.lang.Object, java.math.BigInteger)
   */
  public Object remainder(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().remainder(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.lang.Object, byte)
   */
  public Object remainder(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().remainder(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.lang.Object, char)
   */
  public Object remainder(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().remainder(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.lang.Object, int)
   */
  public Object remainder(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().remainder(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.lang.Object, long)
   */
  public Object remainder(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().remainder(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#remainder(java.lang.Object, java.lang.Object)
   */
  public Object remainder(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().remainder(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(java.lang.Object, short)
   */
  public Object remainder(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().remainder(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(short, java.math.BigInteger)
   */
  public Object remainder(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(short, byte)
   */
  public Object remainder(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(short, char)
   */
  public Object remainder(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(short, int)
   */
  public Object remainder(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(short, long)
   */
  public Object remainder(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainder(short, short)
   */
  public Object remainder(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object remainderEquals(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.math.BigInteger, byte)
   */
  public Object remainderEquals(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.math.BigInteger, char)
   */
  public Object remainderEquals(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.math.BigInteger, int)
   */
  public Object remainderEquals(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.math.BigInteger, long)
   */
  public Object remainderEquals(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.math.BigInteger, short)
   */
  public Object remainderEquals(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(byte, java.math.BigInteger)
   */
  public Object remainderEquals(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(byte, byte)
   */
  public Object remainderEquals(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(byte, char)
   */
  public Object remainderEquals(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(byte, int)
   */
  public Object remainderEquals(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(byte, long)
   */
  public Object remainderEquals(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(byte, short)
   */
  public Object remainderEquals(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(char, java.math.BigInteger)
   */
  public Object remainderEquals(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(char, byte)
   */
  public Object remainderEquals(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(char, char)
   */
  public Object remainderEquals(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(char, int)
   */
  public Object remainderEquals(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(char, long)
   */
  public Object remainderEquals(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(char, short)
   */
  public Object remainderEquals(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(int, java.math.BigInteger)
   */
  public Object remainderEquals(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(int, byte)
   */
  public Object remainderEquals(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(int, char)
   */
  public Object remainderEquals(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(int, int)
   */
  public Object remainderEquals(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(int, long)
   */
  public Object remainderEquals(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(int, short)
   */
  public Object remainderEquals(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(long, java.math.BigInteger)
   */
  public Object remainderEquals(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(long, byte)
   */
  public Object remainderEquals(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(long, char)
   */
  public Object remainderEquals(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(long, int)
   */
  public Object remainderEquals(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(long, long)
   */
  public Object remainderEquals(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(long, short)
   */
  public Object remainderEquals(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object remainderEquals(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().remainderEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.lang.Object, byte)
   */
  public Object remainderEquals(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().remainderEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.lang.Object, char)
   */
  public Object remainderEquals(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().remainderEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.lang.Object, int)
   */
  public Object remainderEquals(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().remainderEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.lang.Object, long)
   */
  public Object remainderEquals(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().remainderEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#remainderEquals(java.lang.Object, java.lang.Object)
   */
  public Object remainderEquals(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().remainderEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(java.lang.Object, short)
   */
  public Object remainderEquals(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().remainderEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(short, java.math.BigInteger)
   */
  public Object remainderEquals(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(short, byte)
   */
  public Object remainderEquals(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(short, char)
   */
  public Object remainderEquals(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(short, int)
   */
  public Object remainderEquals(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(short, long)
   */
  public Object remainderEquals(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#remainderEquals(short, short)
   */
  public Object remainderEquals(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseAdd(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseAdd(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(byte, java.lang.Object)
   */
  public Object reverseAdd(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(char, java.lang.Object)
   */
  public Object reverseAdd(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(double, java.lang.Object)
   */
  public Object reverseAdd(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(float, java.lang.Object)
   */
  public Object reverseAdd(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(int, java.lang.Object)
   */
  public Object reverseAdd(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(long, java.lang.Object)
   */
  public Object reverseAdd(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAdd(short, java.lang.Object)
   */
  public Object reverseAdd(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAdd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseAddEquals(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseAddEquals(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(byte, java.lang.Object)
   */
  public Object reverseAddEquals(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(char, java.lang.Object)
   */
  public Object reverseAddEquals(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(double, java.lang.Object)
   */
  public Object reverseAddEquals(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(float, java.lang.Object)
   */
  public Object reverseAddEquals(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(int, java.lang.Object)
   */
  public Object reverseAddEquals(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(long, java.lang.Object)
   */
  public Object reverseAddEquals(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAddEquals(short, java.lang.Object)
   */
  public Object reverseAddEquals(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAddEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAnd(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseAnd(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAnd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAnd(byte, java.lang.Object)
   */
  public Object reverseAnd(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAnd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAnd(char, java.lang.Object)
   */
  public Object reverseAnd(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAnd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAnd(int, java.lang.Object)
   */
  public Object reverseAnd(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAnd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAnd(long, java.lang.Object)
   */
  public Object reverseAnd(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAnd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAnd(short, java.lang.Object)
   */
  public Object reverseAnd(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAnd(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAndEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseAndEquals(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAndEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAndEquals(byte, java.lang.Object)
   */
  public Object reverseAndEquals(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAndEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAndEquals(char, java.lang.Object)
   */
  public Object reverseAndEquals(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAndEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAndEquals(int, java.lang.Object)
   */
  public Object reverseAndEquals(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAndEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAndEquals(long, java.lang.Object)
   */
  public Object reverseAndEquals(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAndEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseAndEquals(short, java.lang.Object)
   */
  public Object reverseAndEquals(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseAndEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShift(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseArithmeticRightShift(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShift(byte, java.lang.Object)
   */
  public Object reverseArithmeticRightShift(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShift(char, java.lang.Object)
   */
  public Object reverseArithmeticRightShift(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShift(int, java.lang.Object)
   */
  public Object reverseArithmeticRightShift(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShift(long, java.lang.Object)
   */
  public Object reverseArithmeticRightShift(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShift(short, java.lang.Object)
   */
  public Object reverseArithmeticRightShift(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShiftEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseArithmeticRightShiftEquals(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShiftEquals(byte, java.lang.Object)
   */
  public Object reverseArithmeticRightShiftEquals(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShiftEquals(char, java.lang.Object)
   */
  public Object reverseArithmeticRightShiftEquals(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShiftEquals(int, java.lang.Object)
   */
  public Object reverseArithmeticRightShiftEquals(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShiftEquals(long, java.lang.Object)
   */
  public Object reverseArithmeticRightShiftEquals(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseArithmeticRightShiftEquals(short, java.lang.Object)
   */
  public Object reverseArithmeticRightShiftEquals(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseArithmeticRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseCompare(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseCompare(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(byte, java.lang.Object)
   */
  public Object reverseCompare(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(char, java.lang.Object)
   */
  public Object reverseCompare(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(double, java.lang.Object)
   */
  public Object reverseCompare(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(float, java.lang.Object)
   */
  public Object reverseCompare(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(int, java.lang.Object)
   */
  public Object reverseCompare(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(long, java.lang.Object)
   */
  public Object reverseCompare(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseCompare(short, java.lang.Object)
   */
  public Object reverseCompare(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseCompare(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseDivide(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseDivide(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(byte, java.lang.Object)
   */
  public Object reverseDivide(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(char, java.lang.Object)
   */
  public Object reverseDivide(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(double, java.lang.Object)
   */
  public Object reverseDivide(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(float, java.lang.Object)
   */
  public Object reverseDivide(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(int, java.lang.Object)
   */
  public Object reverseDivide(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(long, java.lang.Object)
   */
  public Object reverseDivide(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivide(short, java.lang.Object)
   */
  public Object reverseDivide(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseDivideEquals(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseDivideEquals(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(byte, java.lang.Object)
   */
  public Object reverseDivideEquals(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(char, java.lang.Object)
   */
  public Object reverseDivideEquals(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(double, java.lang.Object)
   */
  public Object reverseDivideEquals(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(float, java.lang.Object)
   */
  public Object reverseDivideEquals(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(int, java.lang.Object)
   */
  public Object reverseDivideEquals(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(long, java.lang.Object)
   */
  public Object reverseDivideEquals(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseDivideEquals(short, java.lang.Object)
   */
  public Object reverseDivideEquals(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseEquals(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseEquals(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(byte, java.lang.Object)
   */
  public Object reverseEquals(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(char, java.lang.Object)
   */
  public Object reverseEquals(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(double, java.lang.Object)
   */
  public Object reverseEquals(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(float, java.lang.Object)
   */
  public Object reverseEquals(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(int, java.lang.Object)
   */
  public Object reverseEquals(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(long, java.lang.Object)
   */
  public Object reverseEquals(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseEquals(short, java.lang.Object)
   */
  public Object reverseEquals(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseGreaterThan(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseGreaterThan(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(byte, java.lang.Object)
   */
  public Object reverseGreaterThan(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(char, java.lang.Object)
   */
  public Object reverseGreaterThan(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(double, java.lang.Object)
   */
  public Object reverseGreaterThan(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(float, java.lang.Object)
   */
  public Object reverseGreaterThan(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(int, java.lang.Object)
   */
  public Object reverseGreaterThan(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(long, java.lang.Object)
   */
  public Object reverseGreaterThan(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThan(short, java.lang.Object)
   */
  public Object reverseGreaterThan(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(byte, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(char, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(double, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(float, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(int, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(long, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseGreaterThanOrEquals(short, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseGreaterThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseIntegerDivide(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseIntegerDivide(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(byte, java.lang.Object)
   */
  public Object reverseIntegerDivide(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(char, java.lang.Object)
   */
  public Object reverseIntegerDivide(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(double, java.lang.Object)
   */
  public Object reverseIntegerDivide(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(float, java.lang.Object)
   */
  public Object reverseIntegerDivide(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(int, java.lang.Object)
   */
  public Object reverseIntegerDivide(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(long, java.lang.Object)
   */
  public Object reverseIntegerDivide(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivide(short, java.lang.Object)
   */
  public Object reverseIntegerDivide(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivide(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(byte, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(char, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(double, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(float, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(int, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(long, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseIntegerDivideEquals(short, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseIntegerDivideEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShift(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseLeftShift(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLeftShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShift(byte, java.lang.Object)
   */
  public Object reverseLeftShift(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLeftShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShift(char, java.lang.Object)
   */
  public Object reverseLeftShift(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLeftShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShift(int, java.lang.Object)
   */
  public Object reverseLeftShift(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLeftShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShift(long, java.lang.Object)
   */
  public Object reverseLeftShift(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLeftShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShift(short, java.lang.Object)
   */
  public Object reverseLeftShift(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLeftShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShiftEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseLeftShiftEquals(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLeftShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShiftEquals(byte, java.lang.Object)
   */
  public Object reverseLeftShiftEquals(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLeftShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShiftEquals(char, java.lang.Object)
   */
  public Object reverseLeftShiftEquals(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLeftShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShiftEquals(int, java.lang.Object)
   */
  public Object reverseLeftShiftEquals(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLeftShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShiftEquals(long, java.lang.Object)
   */
  public Object reverseLeftShiftEquals(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLeftShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLeftShiftEquals(short, java.lang.Object)
   */
  public Object reverseLeftShiftEquals(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLeftShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseLessThan(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseLessThan(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(byte, java.lang.Object)
   */
  public Object reverseLessThan(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(char, java.lang.Object)
   */
  public Object reverseLessThan(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(double, java.lang.Object)
   */
  public Object reverseLessThan(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(float, java.lang.Object)
   */
  public Object reverseLessThan(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(int, java.lang.Object)
   */
  public Object reverseLessThan(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(long, java.lang.Object)
   */
  public Object reverseLessThan(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThan(short, java.lang.Object)
   */
  public Object reverseLessThan(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThan(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(byte, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(char, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(double, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(float, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(int, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(long, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLessThanOrEquals(short, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLessThanOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShift(byte, java.lang.Object)
   */
  public Object reverseLogicalRightShift(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShift(char, java.lang.Object)
   */
  public Object reverseLogicalRightShift(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShift(int, java.lang.Object)
   */
  public Object reverseLogicalRightShift(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShift(long, java.lang.Object)
   */
  public Object reverseLogicalRightShift(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShift(short, java.lang.Object)
   */
  public Object reverseLogicalRightShift(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShift(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShiftEquals(byte, java.lang.Object)
   */
  public Object reverseLogicalRightShiftEquals(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShiftEquals(char, java.lang.Object)
   */
  public Object reverseLogicalRightShiftEquals(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShiftEquals(int, java.lang.Object)
   */
  public Object reverseLogicalRightShiftEquals(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShiftEquals(long, java.lang.Object)
   */
  public Object reverseLogicalRightShiftEquals(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseLogicalRightShiftEquals(short, java.lang.Object)
   */
  public Object reverseLogicalRightShiftEquals(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseLogicalRightShiftEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseMultiply(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseMultiply(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(byte, java.lang.Object)
   */
  public Object reverseMultiply(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(char, java.lang.Object)
   */
  public Object reverseMultiply(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(double, java.lang.Object)
   */
  public Object reverseMultiply(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(float, java.lang.Object)
   */
  public Object reverseMultiply(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(int, java.lang.Object)
   */
  public Object reverseMultiply(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(long, java.lang.Object)
   */
  public Object reverseMultiply(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiply(short, java.lang.Object)
   */
  public Object reverseMultiply(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiply(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseMultiplyEquals(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseMultiplyEquals(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(byte, java.lang.Object)
   */
  public Object reverseMultiplyEquals(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(char, java.lang.Object)
   */
  public Object reverseMultiplyEquals(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(double, java.lang.Object)
   */
  public Object reverseMultiplyEquals(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(float, java.lang.Object)
   */
  public Object reverseMultiplyEquals(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(int, java.lang.Object)
   */
  public Object reverseMultiplyEquals(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(long, java.lang.Object)
   */
  public Object reverseMultiplyEquals(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseMultiplyEquals(short, java.lang.Object)
   */
  public Object reverseMultiplyEquals(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseMultiplyEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseNotEquals(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseNotEquals(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(byte, java.lang.Object)
   */
  public Object reverseNotEquals(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(char, java.lang.Object)
   */
  public Object reverseNotEquals(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(double, java.lang.Object)
   */
  public Object reverseNotEquals(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(float, java.lang.Object)
   */
  public Object reverseNotEquals(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(int, java.lang.Object)
   */
  public Object reverseNotEquals(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(long, java.lang.Object)
   */
  public Object reverseNotEquals(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseNotEquals(short, java.lang.Object)
   */
  public Object reverseNotEquals(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseNotEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOr(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseOr(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseOr(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOr(byte, java.lang.Object)
   */
  public Object reverseOr(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseOr(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOr(char, java.lang.Object)
   */
  public Object reverseOr(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseOr(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOr(int, java.lang.Object)
   */
  public Object reverseOr(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseOr(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOr(long, java.lang.Object)
   */
  public Object reverseOr(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseOr(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOr(short, java.lang.Object)
   */
  public Object reverseOr(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseOr(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOrEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseOrEquals(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOrEquals(byte, java.lang.Object)
   */
  public Object reverseOrEquals(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOrEquals(char, java.lang.Object)
   */
  public Object reverseOrEquals(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOrEquals(int, java.lang.Object)
   */
  public Object reverseOrEquals(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOrEquals(long, java.lang.Object)
   */
  public Object reverseOrEquals(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseOrEquals(short, java.lang.Object)
   */
  public Object reverseOrEquals(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseOrEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainder(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseRemainder(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseRemainder(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainder(byte, java.lang.Object)
   */
  public Object reverseRemainder(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseRemainder(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainder(char, java.lang.Object)
   */
  public Object reverseRemainder(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseRemainder(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainder(int, java.lang.Object)
   */
  public Object reverseRemainder(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseRemainder(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainder(long, java.lang.Object)
   */
  public Object reverseRemainder(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseRemainder(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainder(short, java.lang.Object)
   */
  public Object reverseRemainder(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseRemainder(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainderEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseRemainderEquals(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseRemainderEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainderEquals(byte, java.lang.Object)
   */
  public Object reverseRemainderEquals(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseRemainderEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainderEquals(char, java.lang.Object)
   */
  public Object reverseRemainderEquals(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseRemainderEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainderEquals(int, java.lang.Object)
   */
  public Object reverseRemainderEquals(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseRemainderEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainderEquals(long, java.lang.Object)
   */
  public Object reverseRemainderEquals(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseRemainderEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseRemainderEquals(short, java.lang.Object)
   */
  public Object reverseRemainderEquals(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseRemainderEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseSubtract(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseSubtract(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(byte, java.lang.Object)
   */
  public Object reverseSubtract(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(char, java.lang.Object)
   */
  public Object reverseSubtract(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(double, java.lang.Object)
   */
  public Object reverseSubtract(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(float, java.lang.Object)
   */
  public Object reverseSubtract(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(int, java.lang.Object)
   */
  public Object reverseSubtract(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(long, java.lang.Object)
   */
  public Object reverseSubtract(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtract(short, java.lang.Object)
   */
  public Object reverseSubtract(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtract(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(java.math.BigDecimal, java.lang.Object)
   */
  public Object reverseSubtractEquals(BigDecimal lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseSubtractEquals(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(byte, java.lang.Object)
   */
  public Object reverseSubtractEquals(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(char, java.lang.Object)
   */
  public Object reverseSubtractEquals(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(double, java.lang.Object)
   */
  public Object reverseSubtractEquals(double lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(float, java.lang.Object)
   */
  public Object reverseSubtractEquals(float lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(int, java.lang.Object)
   */
  public Object reverseSubtractEquals(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(long, java.lang.Object)
   */
  public Object reverseSubtractEquals(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseSubtractEquals(short, java.lang.Object)
   */
  public Object reverseSubtractEquals(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseSubtractEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXor(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseXor(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseXor(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXor(byte, java.lang.Object)
   */
  public Object reverseXor(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseXor(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXor(char, java.lang.Object)
   */
  public Object reverseXor(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseXor(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXor(int, java.lang.Object)
   */
  public Object reverseXor(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseXor(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXor(long, java.lang.Object)
   */
  public Object reverseXor(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseXor(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXor(short, java.lang.Object)
   */
  public Object reverseXor(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseXor(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXorEquals(java.math.BigInteger, java.lang.Object)
   */
  public Object reverseXorEquals(BigInteger lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseXorEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXorEquals(byte, java.lang.Object)
   */
  public Object reverseXorEquals(byte lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseXorEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXorEquals(char, java.lang.Object)
   */
  public Object reverseXorEquals(char lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseXorEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXorEquals(int, java.lang.Object)
   */
  public Object reverseXorEquals(int lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseXorEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXorEquals(long, java.lang.Object)
   */
  public Object reverseXorEquals(long lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseXorEquals(lhs, this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#reverseXorEquals(short, java.lang.Object)
   */
  public Object reverseXorEquals(short lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().reverseXorEquals(lhs, this.instance);
  }

  /**
   * @param instance
   * @param fieldName
   * @param newValue
   * @return
   * @see ng.runtime.MetaClass#setField(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setField(Object instance, String fieldName, Object newValue) {
    return this.delegate.getRuntimeMetaClass().setField(this.instance, fieldName, newValue);
  }

  /**
   * @param internalMetaClass
   * @see ng.runtime.RuntimeMetaClass#setInternalMetaClass(ng.runtime.InternalMetaClass)
   */
  public void setInternalMetaClass(InternalMetaClass internalMetaClass) {
    this.delegate.getRuntimeMetaClass().setInternalMetaClass(internalMetaClass);
  }

  /**
   * @param instance
   * @param propertyName
   * @param newValue
   * @return
   * @see ng.runtime.MetaClass#setProperty(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setProperty(Object instance, String propertyName, Object newValue) {
    return this.delegate.getRuntimeMetaClass().setProperty(this.instance, propertyName, newValue);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object subtract(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object subtract(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, byte)
   */
  public Object subtract(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, char)
   */
  public Object subtract(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, double)
   */
  public Object subtract(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, float)
   */
  public Object subtract(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, int)
   */
  public Object subtract(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, long)
   */
  public Object subtract(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigDecimal, short)
   */
  public Object subtract(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object subtract(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, java.math.BigInteger)
   */
  public Object subtract(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, byte)
   */
  public Object subtract(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, char)
   */
  public Object subtract(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, double)
   */
  public Object subtract(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, float)
   */
  public Object subtract(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, int)
   */
  public Object subtract(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, long)
   */
  public Object subtract(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.math.BigInteger, short)
   */
  public Object subtract(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, java.math.BigDecimal)
   */
  public Object subtract(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, java.math.BigInteger)
   */
  public Object subtract(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, byte)
   */
  public Object subtract(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, char)
   */
  public Object subtract(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, double)
   */
  public Object subtract(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, float)
   */
  public Object subtract(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, int)
   */
  public Object subtract(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, long)
   */
  public Object subtract(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(byte, short)
   */
  public Object subtract(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, java.math.BigDecimal)
   */
  public Object subtract(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, java.math.BigInteger)
   */
  public Object subtract(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, byte)
   */
  public Object subtract(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, char)
   */
  public Object subtract(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, double)
   */
  public Object subtract(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, float)
   */
  public Object subtract(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, int)
   */
  public Object subtract(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, long)
   */
  public Object subtract(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(char, short)
   */
  public Object subtract(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, java.math.BigDecimal)
   */
  public Object subtract(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, java.math.BigInteger)
   */
  public Object subtract(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, byte)
   */
  public Object subtract(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, char)
   */
  public Object subtract(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, double)
   */
  public Object subtract(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, float)
   */
  public Object subtract(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, int)
   */
  public Object subtract(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, long)
   */
  public Object subtract(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(double, short)
   */
  public Object subtract(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, java.math.BigDecimal)
   */
  public Object subtract(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, java.math.BigInteger)
   */
  public Object subtract(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, byte)
   */
  public Object subtract(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, char)
   */
  public Object subtract(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, double)
   */
  public Object subtract(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, float)
   */
  public Object subtract(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, int)
   */
  public Object subtract(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, long)
   */
  public Object subtract(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(float, short)
   */
  public Object subtract(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, java.math.BigDecimal)
   */
  public Object subtract(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, java.math.BigInteger)
   */
  public Object subtract(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, byte)
   */
  public Object subtract(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, char)
   */
  public Object subtract(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, double)
   */
  public Object subtract(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, float)
   */
  public Object subtract(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, int)
   */
  public Object subtract(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, long)
   */
  public Object subtract(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(int, short)
   */
  public Object subtract(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, java.math.BigDecimal)
   */
  public Object subtract(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, java.math.BigInteger)
   */
  public Object subtract(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, byte)
   */
  public Object subtract(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, char)
   */
  public Object subtract(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, double)
   */
  public Object subtract(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, float)
   */
  public Object subtract(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, int)
   */
  public Object subtract(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, long)
   */
  public Object subtract(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(long, short)
   */
  public Object subtract(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, java.math.BigDecimal)
   */
  public Object subtract(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, java.math.BigInteger)
   */
  public Object subtract(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, byte)
   */
  public Object subtract(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, char)
   */
  public Object subtract(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, double)
   */
  public Object subtract(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, float)
   */
  public Object subtract(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, int)
   */
  public Object subtract(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, long)
   */
  public Object subtract(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#subtract(java.lang.Object, java.lang.Object)
   */
  public Object subtract(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(java.lang.Object, short)
   */
  public Object subtract(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().subtract(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, java.math.BigDecimal)
   */
  public Object subtract(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, java.math.BigInteger)
   */
  public Object subtract(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, byte)
   */
  public Object subtract(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, char)
   */
  public Object subtract(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, double)
   */
  public Object subtract(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, float)
   */
  public Object subtract(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, int)
   */
  public Object subtract(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, long)
   */
  public Object subtract(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtract(short, short)
   */
  public Object subtract(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, java.math.BigDecimal)
   */
  public Object subtractEquals(BigDecimal lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, java.math.BigInteger)
   */
  public Object subtractEquals(BigDecimal lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, byte)
   */
  public Object subtractEquals(BigDecimal lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, char)
   */
  public Object subtractEquals(BigDecimal lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, double)
   */
  public Object subtractEquals(BigDecimal lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, float)
   */
  public Object subtractEquals(BigDecimal lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, int)
   */
  public Object subtractEquals(BigDecimal lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, long)
   */
  public Object subtractEquals(BigDecimal lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigDecimal, short)
   */
  public Object subtractEquals(BigDecimal lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, java.math.BigDecimal)
   */
  public Object subtractEquals(BigInteger lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object subtractEquals(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, byte)
   */
  public Object subtractEquals(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, char)
   */
  public Object subtractEquals(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, double)
   */
  public Object subtractEquals(BigInteger lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, float)
   */
  public Object subtractEquals(BigInteger lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, int)
   */
  public Object subtractEquals(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, long)
   */
  public Object subtractEquals(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.math.BigInteger, short)
   */
  public Object subtractEquals(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, java.math.BigDecimal)
   */
  public Object subtractEquals(byte lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, java.math.BigInteger)
   */
  public Object subtractEquals(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, byte)
   */
  public Object subtractEquals(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, char)
   */
  public Object subtractEquals(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, double)
   */
  public Object subtractEquals(byte lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, float)
   */
  public Object subtractEquals(byte lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, int)
   */
  public Object subtractEquals(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, long)
   */
  public Object subtractEquals(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(byte, short)
   */
  public Object subtractEquals(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, java.math.BigDecimal)
   */
  public Object subtractEquals(char lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, java.math.BigInteger)
   */
  public Object subtractEquals(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, byte)
   */
  public Object subtractEquals(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, char)
   */
  public Object subtractEquals(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, double)
   */
  public Object subtractEquals(char lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, float)
   */
  public Object subtractEquals(char lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, int)
   */
  public Object subtractEquals(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, long)
   */
  public Object subtractEquals(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(char, short)
   */
  public Object subtractEquals(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, java.math.BigDecimal)
   */
  public Object subtractEquals(double lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, java.math.BigInteger)
   */
  public Object subtractEquals(double lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, byte)
   */
  public Object subtractEquals(double lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, char)
   */
  public Object subtractEquals(double lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, double)
   */
  public Object subtractEquals(double lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, float)
   */
  public Object subtractEquals(double lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, int)
   */
  public Object subtractEquals(double lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, long)
   */
  public Object subtractEquals(double lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(double, short)
   */
  public Object subtractEquals(double lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, java.math.BigDecimal)
   */
  public Object subtractEquals(float lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, java.math.BigInteger)
   */
  public Object subtractEquals(float lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, byte)
   */
  public Object subtractEquals(float lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, char)
   */
  public Object subtractEquals(float lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, double)
   */
  public Object subtractEquals(float lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, float)
   */
  public Object subtractEquals(float lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, int)
   */
  public Object subtractEquals(float lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, long)
   */
  public Object subtractEquals(float lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(float, short)
   */
  public Object subtractEquals(float lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, java.math.BigDecimal)
   */
  public Object subtractEquals(int lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, java.math.BigInteger)
   */
  public Object subtractEquals(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, byte)
   */
  public Object subtractEquals(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, char)
   */
  public Object subtractEquals(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, double)
   */
  public Object subtractEquals(int lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, float)
   */
  public Object subtractEquals(int lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, int)
   */
  public Object subtractEquals(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, long)
   */
  public Object subtractEquals(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(int, short)
   */
  public Object subtractEquals(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, java.math.BigDecimal)
   */
  public Object subtractEquals(long lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, java.math.BigInteger)
   */
  public Object subtractEquals(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, byte)
   */
  public Object subtractEquals(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, char)
   */
  public Object subtractEquals(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, double)
   */
  public Object subtractEquals(long lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, float)
   */
  public Object subtractEquals(long lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, int)
   */
  public Object subtractEquals(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, long)
   */
  public Object subtractEquals(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(long, short)
   */
  public Object subtractEquals(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, java.math.BigDecimal)
   */
  public Object subtractEquals(Object lhs, BigDecimal rhs) {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object subtractEquals(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, byte)
   */
  public Object subtractEquals(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, char)
   */
  public Object subtractEquals(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, double)
   */
  public Object subtractEquals(Object lhs, double rhs) {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, float)
   */
  public Object subtractEquals(Object lhs, float rhs) {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, int)
   */
  public Object subtractEquals(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, long)
   */
  public Object subtractEquals(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#subtractEquals(java.lang.Object, java.lang.Object)
   */
  public Object subtractEquals(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(java.lang.Object, short)
   */
  public Object subtractEquals(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().subtractEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, java.math.BigDecimal)
   */
  public Object subtractEquals(short lhs, BigDecimal rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, java.math.BigInteger)
   */
  public Object subtractEquals(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, byte)
   */
  public Object subtractEquals(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, char)
   */
  public Object subtractEquals(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, double)
   */
  public Object subtractEquals(short lhs, double rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, float)
   */
  public Object subtractEquals(short lhs, float rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, int)
   */
  public Object subtractEquals(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, long)
   */
  public Object subtractEquals(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#subtractEquals(short, short)
   */
  public Object subtractEquals(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryMinus(java.math.BigDecimal)
   */
  public Object unaryMinus(BigDecimal instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryMinus(java.math.BigInteger)
   */
  public Object unaryMinus(BigInteger instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryMinus(double)
   */
  public Object unaryMinus(double instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryMinus(float)
   */
  public Object unaryMinus(float instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryMinus(int)
   */
  public Object unaryMinus(int instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryMinus(long)
   */
  public Object unaryMinus(long instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param operand
   * @return
   * @see ng.runtime.MetaClass#unaryMinus(java.lang.Object)
   */
  public Object unaryMinus(Object operand) {
    return this.delegate.getRuntimeMetaClass().unaryMinus(this.instance);
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryPlus(java.math.BigDecimal)
   */
  public Object unaryPlus(BigDecimal instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryPlus(java.math.BigInteger)
   */
  public Object unaryPlus(BigInteger instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryPlus(double)
   */
  public Object unaryPlus(double instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryPlus(float)
   */
  public Object unaryPlus(float instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryPlus(int)
   */
  public Object unaryPlus(int instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param instance
   * @return
   * @see ng.runtime.RuntimeMetaClass#unaryPlus(long)
   */
  public Object unaryPlus(long instance) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param operand
   * @return
   * @see ng.runtime.MetaClass#unaryPlus(java.lang.Object)
   */
  public Object unaryPlus(Object operand) {
    return this.delegate.getRuntimeMetaClass().unaryPlus(this.instance);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.math.BigInteger, java.math.BigInteger)
   */
  public Object xor(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.math.BigInteger, byte)
   */
  public Object xor(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.math.BigInteger, char)
   */
  public Object xor(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.math.BigInteger, int)
   */
  public Object xor(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.math.BigInteger, long)
   */
  public Object xor(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.math.BigInteger, short)
   */
  public Object xor(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(byte, java.math.BigInteger)
   */
  public Object xor(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(byte, byte)
   */
  public Object xor(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(byte, char)
   */
  public Object xor(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(byte, int)
   */
  public Object xor(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(byte, long)
   */
  public Object xor(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(byte, short)
   */
  public Object xor(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(char, java.math.BigInteger)
   */
  public Object xor(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(char, byte)
   */
  public Object xor(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(char, char)
   */
  public Object xor(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(char, int)
   */
  public Object xor(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(char, long)
   */
  public Object xor(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(char, short)
   */
  public Object xor(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(int, java.math.BigInteger)
   */
  public Object xor(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(int, byte)
   */
  public Object xor(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(int, char)
   */
  public Object xor(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(int, int)
   */
  public Object xor(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(int, long)
   */
  public Object xor(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(int, short)
   */
  public Object xor(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(long, java.math.BigInteger)
   */
  public Object xor(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(long, byte)
   */
  public Object xor(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(long, char)
   */
  public Object xor(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(long, int)
   */
  public Object xor(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(long, long)
   */
  public Object xor(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(long, short)
   */
  public Object xor(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.lang.Object, java.math.BigInteger)
   */
  public Object xor(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().xor(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.lang.Object, byte)
   */
  public Object xor(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().xor(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.lang.Object, char)
   */
  public Object xor(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().xor(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.lang.Object, int)
   */
  public Object xor(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().xor(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.lang.Object, long)
   */
  public Object xor(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().xor(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#xor(java.lang.Object, java.lang.Object)
   */
  public Object xor(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().xor(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(java.lang.Object, short)
   */
  public Object xor(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().xor(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(short, java.math.BigInteger)
   */
  public Object xor(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(short, byte)
   */
  public Object xor(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(short, char)
   */
  public Object xor(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(short, int)
   */
  public Object xor(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(short, long)
   */
  public Object xor(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xor(short, short)
   */
  public Object xor(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.math.BigInteger, java.math.BigInteger)
   */
  public Object xorEquals(BigInteger lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.math.BigInteger, byte)
   */
  public Object xorEquals(BigInteger lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.math.BigInteger, char)
   */
  public Object xorEquals(BigInteger lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.math.BigInteger, int)
   */
  public Object xorEquals(BigInteger lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.math.BigInteger, long)
   */
  public Object xorEquals(BigInteger lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.math.BigInteger, short)
   */
  public Object xorEquals(BigInteger lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(byte, java.math.BigInteger)
   */
  public Object xorEquals(byte lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(byte, byte)
   */
  public Object xorEquals(byte lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(byte, char)
   */
  public Object xorEquals(byte lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(byte, int)
   */
  public Object xorEquals(byte lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(byte, long)
   */
  public Object xorEquals(byte lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(byte, short)
   */
  public Object xorEquals(byte lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(char, java.math.BigInteger)
   */
  public Object xorEquals(char lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(char, byte)
   */
  public Object xorEquals(char lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(char, char)
   */
  public Object xorEquals(char lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(char, int)
   */
  public Object xorEquals(char lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(char, long)
   */
  public Object xorEquals(char lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(char, short)
   */
  public Object xorEquals(char lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(int, java.math.BigInteger)
   */
  public Object xorEquals(int lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(int, byte)
   */
  public Object xorEquals(int lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(int, char)
   */
  public Object xorEquals(int lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(int, int)
   */
  public Object xorEquals(int lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(int, long)
   */
  public Object xorEquals(int lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(int, short)
   */
  public Object xorEquals(int lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(long, java.math.BigInteger)
   */
  public Object xorEquals(long lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(long, byte)
   */
  public Object xorEquals(long lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(long, char)
   */
  public Object xorEquals(long lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(long, int)
   */
  public Object xorEquals(long lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(long, long)
   */
  public Object xorEquals(long lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(long, short)
   */
  public Object xorEquals(long lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.lang.Object, java.math.BigInteger)
   */
  public Object xorEquals(Object lhs, BigInteger rhs) {
    return this.delegate.getRuntimeMetaClass().xorEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.lang.Object, byte)
   */
  public Object xorEquals(Object lhs, byte rhs) {
    return this.delegate.getRuntimeMetaClass().xorEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.lang.Object, char)
   */
  public Object xorEquals(Object lhs, char rhs) {
    return this.delegate.getRuntimeMetaClass().xorEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.lang.Object, int)
   */
  public Object xorEquals(Object lhs, int rhs) {
    return this.delegate.getRuntimeMetaClass().xorEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.lang.Object, long)
   */
  public Object xorEquals(Object lhs, long rhs) {
    return this.delegate.getRuntimeMetaClass().xorEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.MetaClass#xorEquals(java.lang.Object, java.lang.Object)
   */
  public Object xorEquals(Object lhs, Object rhs) {
    return this.delegate.getRuntimeMetaClass().xorEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(java.lang.Object, short)
   */
  public Object xorEquals(Object lhs, short rhs) {
    return this.delegate.getRuntimeMetaClass().xorEquals(this.instance, rhs);
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(short, java.math.BigInteger)
   */
  public Object xorEquals(short lhs, BigInteger rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(short, byte)
   */
  public Object xorEquals(short lhs, byte rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(short, char)
   */
  public Object xorEquals(short lhs, char rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(short, int)
   */
  public Object xorEquals(short lhs, int rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(short, long)
   */
  public Object xorEquals(short lhs, long rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }

  /**
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.RuntimeMetaClass#xorEquals(short, short)
   */
  public Object xorEquals(short lhs, short rhs) {
    throw new NgRuntimeException("Operation not allowed on NgTyped");
  }
}
