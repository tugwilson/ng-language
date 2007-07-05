package uk.co.wilson.ng.runtime.metaclass.methods;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

import ng.runtime.InstanceHandler;
import ng.runtime.MetaMethod;
import ng.runtime.RuntimeMetaClass;
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
   * @see ng.runtime.MetaMethod#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, ng.runtime.RuntimeMetaClass[])
   */
  public MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, final RuntimeMetaClass[] argumentMetaClasses) {
    for (int i = 0; i != this.methodList.size(); i++) {
      currentSelection = this.methodList.get(i).selectMethod(currentSelection, argumentMetaClasses);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    return currentSelection;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection)
   */
  public MetaMethodSelection selectMethod(MetaMethodSelection currentSelection) {
    for (int i = 0; i != this.methodList.size(); i++) {
      currentSelection = this.methodList.get(i).selectMethod(currentSelection);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    return currentSelection;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, final RuntimeMetaClass p1) {
    for (int i = 0; i != this.methodList.size(); i++) {
      currentSelection = this.methodList.get(i).selectMethod(currentSelection, p1);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    return currentSelection;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, final RuntimeMetaClass p1, final RuntimeMetaClass p2) {
    for (int i = 0; i != this.methodList.size(); i++) {
      currentSelection = this.methodList.get(i).selectMethod(currentSelection, p1, p2);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    return currentSelection;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, final RuntimeMetaClass p1, final RuntimeMetaClass p2, final RuntimeMetaClass p3) {
    for (int i = 0; i != this.methodList.size(); i++) {
      currentSelection = this.methodList.get(i).selectMethod(currentSelection, p1, p2, p3);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    return currentSelection;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, final RuntimeMetaClass p1, final RuntimeMetaClass p2, final RuntimeMetaClass p3, final RuntimeMetaClass p4) {
    for (int i = 0; i != this.methodList.size(); i++) {
      currentSelection = this.methodList.get(i).selectMethod(currentSelection, p1, p2, p3, p4);
      
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

  private MetaMethod selectMethod(final Object[] arguments) {
    return null;
  }

  private MetaMethod selectMethod() {
    if (this.methodList.size() == 1) {
      return this.methodList.get(0);
    } else {
      return InstanceHandler.noMethod;
    }
  }

  private MetaMethod selectMethod(final Object p1) {
    return null;
  }

  private MetaMethod selectMethod(final Object p1, final Object p2) {
    return null;
  }

  private MetaMethod selectMethod(final Object p1, final Object p2, final Object p3) {
    return null;
  }

  private MetaMethod selectMethod(final Object p1, final Object p2, final Object p3, final Object p4) {
    return null;
  }
}
