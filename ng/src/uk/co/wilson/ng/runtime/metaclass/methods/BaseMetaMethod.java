package uk.co.wilson.ng.runtime.metaclass.methods;

import ng.runtime.MetaMethod;

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
   * @see ng.runtime.MetaMethod#addMetaMethod(ng.runtime.MetaMethod)
   */
  public MetaMethod addMetaMethod(final MetaMethod metaMethod) {
  final MetaMultiMethod multi = new MetaMultiMethod(this);
  
    multi.addMetaMethod(metaMethod);
    
    return multi;
  }
}
