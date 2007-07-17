package uk.co.wilson.ng.runtime.metaclass.methods;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

import ng.runtime.InstanceHandler;
import ng.runtime.MetaClass;
import ng.runtime.MetaMethod;
import ng.runtime.ThreadContext;

/**
 * @author John
 *
 */
public class MetaMultiMethod implements MetaMethod {
  private final List<MetaMethod> methodList = new LinkedList<MetaMethod>();
  
  public MetaMultiMethod(final MetaMethod metaMethod) {
    this.methodList.add(metaMethod);
    
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#addMetaMethod(ng.runtime.MetaMethod)
   */
  public MetaMethod addMetaMethod(final MetaMethod metaMethod) {
    this.methodList.add(metaMethod);
    return this;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object[])
   */
  public Object call(final ThreadContext tc, final Object instance, final Object[] arguments) throws Throwable {
    return selectMethod(arguments).call(tc, instance, arguments);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, ng.runtime.RuntimeMetaClass[])
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection, final MetaClass[] argumentMetaClasses) {
    for (int i = 0; i != this.methodList.size(); i++) {
      currentSelection = this.methodList.get(i).selectMethod(tc, currentSelection, argumentMetaClasses);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    return currentSelection;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection)
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection) {
    for (int i = 0; i != this.methodList.size(); i++) {
      currentSelection = this.methodList.get(i).selectMethod(tc, currentSelection);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    return currentSelection;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection, final MetaClass p1) {
    for (int i = 0; i != this.methodList.size(); i++) {
      currentSelection = this.methodList.get(i).selectMethod(tc, currentSelection, p1);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    return currentSelection;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection, final MetaClass p1, final MetaClass p2) {
    for (int i = 0; i != this.methodList.size(); i++) {
      currentSelection = this.methodList.get(i).selectMethod(tc, currentSelection, p1, p2);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    return currentSelection;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection, final MetaClass p1, final MetaClass p2, final MetaClass p3) {
    for (int i = 0; i != this.methodList.size(); i++) {
      currentSelection = this.methodList.get(i).selectMethod(tc, currentSelection, p1, p2, p3);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    return currentSelection;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection, final MetaClass p1, final MetaClass p2, final MetaClass p3, final MetaClass p4) {
    for (int i = 0; i != this.methodList.size(); i++) {
      currentSelection = this.methodList.get(i).selectMethod(tc, currentSelection, p1, p2, p3, p4);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    return currentSelection;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance) throws Throwable {
    return selectMethod().callQuick(tc, instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1) throws Throwable {
    return selectMethod(p1).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, boolean)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final boolean p1) throws Throwable {
    return selectMethod(p1).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, char)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final char p1) throws Throwable {
    return selectMethod(p1).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, byte)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final byte p1) throws Throwable {
    return selectMethod(p1).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, short)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final short p1) throws Throwable {
    return selectMethod(p1).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, int)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final int p1) throws Throwable {
    return selectMethod(p1).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, long)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final long p1) throws Throwable {
    return selectMethod(p1).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, float)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final float p1) throws Throwable {
    return selectMethod(p1).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, double)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final double p1) throws Throwable {
    return selectMethod(p1).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final BigInteger p1) throws Throwable {
    return selectMethod(p1).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final BigDecimal p1) throws Throwable {
    return selectMethod(p1).callQuick(tc, instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1, final Object p2) throws Throwable {
    return selectMethod(p1, p2).callQuick(tc, instance, p1, p2);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1, final Object p2, final Object p3) throws Throwable {
    return selectMethod(p1, p2, p3).callQuick(tc, instance, p1, p2, p3);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    return selectMethod(p1, p2, p3, p4).callQuick(tc, instance, p1, p2, p3, p4);
  }

  /**
   * @param arguments
   * @return
   */
  private MetaMethod selectMethod(final Object[] arguments) {
    return null;
  }

  /**
   * @return
   */
  private MetaMethod selectMethod() {
    if (this.methodList.size() == 1) {
      return this.methodList.get(0);
    } else {
      return InstanceHandler.noMethod;
    }
  }

  /**
   * @param p1
   * @return
   */
  private MetaMethod selectMethod(final boolean p1) {
    return null;
  }

  /**
   * @param p1
   * @return
   */
  private MetaMethod selectMethod(final char p1) {
    return null;
  }

  /**
   * @param p1
   * @return
   */
  private MetaMethod selectMethod(final byte p1) {
    return null;
  }

  /**
   * @param p1
   * @return
   */
  private MetaMethod selectMethod(final short p1) {
    return null;
  }

  /**
   * @param p1
   * @return
   */
  private MetaMethod selectMethod(final int p1) {
    return null;
  }

  /**
   * @param p1
   * @return
   */
  private MetaMethod selectMethod(final long p1) {
    return null;
  }

  /**
   * @param p1
   * @return
   */
  private MetaMethod selectMethod(final float p1) {
    return null;
  }

  /**
   * @param p1
   * @return
   */
  private MetaMethod selectMethod(final double p1) {
    return null;
  }

  /**
   * @param p1
   * @return
   */
  private MetaMethod selectMethod(final BigInteger p1) {
    return null;
  }

  /**
   * @param p1
   * @return
   */
  private MetaMethod selectMethod(final BigDecimal p1) {
    return null;
  }

  /**
   * @param p1
   * @return
   */
  private MetaMethod selectMethod(final Object p1) {
    return null;
  }

  /**
   * @param p1
   * @param p2
   * @return
   */
  private MetaMethod selectMethod(final Object p1, final Object p2) {
    return null;
  }

  /**
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  private MetaMethod selectMethod(final Object p1, final Object p2, final Object p3) {
    return null;
  }

  /**
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  private MetaMethod selectMethod(final Object p1, final Object p2, final Object p3, final Object p4) {
    return null;
  }
}
