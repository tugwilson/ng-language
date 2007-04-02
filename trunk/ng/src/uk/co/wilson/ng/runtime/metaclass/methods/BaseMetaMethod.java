package uk.co.wilson.ng.runtime.metaclass.methods;

import uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection;
import ng.runtime.MetaMethod;
import ng.runtime.RuntimeMetaClass;

/**
 * @author John
 *
 */
public abstract class BaseMetaMethod implements MetaMethod {
  protected final int numberOfParameters;

  public BaseMetaMethod(final int numberOfParameters) {
    this.numberOfParameters = numberOfParameters;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.RuntimeMetaClass[])
   */
  public MetaMethodSelection selectMethod(final RuntimeMetaClass[] argumentMetaClasses) {
    return this.selectMethod(new MetaMethodSelection(), argumentMetaClasses);
  }
    
  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#addMetaMethod(ng.runtime.MetaMethod)
   */
  public MetaMethod addMetaMethod(final MetaMethod metaMethod) {
  final MetaMultiMethod multi = new MetaMultiMethod(this);
  
    multi.addMetaMethod(metaMethod);
    
    return multi;
  }
}
