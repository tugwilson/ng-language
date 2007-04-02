package uk.co.wilson.ng.runtime.metaclass.methods;

import java.util.LinkedList;
import java.util.List;

import uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection;

import ng.runtime.InstanceHandler;
import ng.runtime.MetaMethod;
import ng.runtime.RuntimeMetaClass;

/**
 * @author John
 *
 */
public class MetaMultiMethod implements MetaMethod {
  private List<MetaMethod> methodList = new LinkedList<MetaMethod>();
  
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
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object[])
   */
  public Object call(final Object instance, final Object[] arguments) {
    return selectMethod(arguments).call(instance, arguments);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.RuntimeMetaClass[])
   */
  public MetaMethodSelection selectMethod(final RuntimeMetaClass[] argumentMetaClasses) {
    return this.selectMethod(new MetaMethodSelection(), argumentMetaClasses);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, ng.runtime.RuntimeMetaClass[])
   */
  public MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, final RuntimeMetaClass[] argumentMetaClasses) {
    for (int i = 0; i != this.methodList.size(); i++) {
      currentSelection = this.methodList.get(i).selectMethod(currentSelection, argumentMetaClasses);
    }
    
    return currentSelection;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object)
   */
  public Object call(final Object instance) {
    return selectMethod().call(instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object)
   */
  public Object call(final Object instance, final Object p1) {
    return selectMethod(p1).call(instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(final Object instance, final Object p1, final Object p2) {
    return selectMethod(p1, p2).call(instance, p1, p2);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(final Object instance, final Object p1, final Object p2, final Object p3) {
    return selectMethod(p1, p2, p3).call(instance, p1, p2, p3);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) {
    return selectMethod(p1, p2, p3, p4).call(instance, p1, p2, p3, p4);
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
