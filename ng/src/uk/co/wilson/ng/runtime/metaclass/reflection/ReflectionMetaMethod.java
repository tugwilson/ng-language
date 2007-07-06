package uk.co.wilson.ng.runtime.metaclass.reflection;

import ng.runtime.RuntimeMetaClass;
import ng.runtime.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.methods.BaseMetaMethod;
import uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection;

/**
 * @author John
 *
 */
public abstract class ReflectionMetaMethod extends BaseMetaMethod {
  private static final Class NO_PARAMETERS[] = new Class[0];
  protected final Class parameterTypes[];
  
  public ReflectionMetaMethod() {
    super(0);
    this.parameterTypes = NO_PARAMETERS;
  }
  
  /**
   * @param numberOfParameters
   */
  public ReflectionMetaMethod(final Class parameterTypes[]) {
    super(parameterTypes.length);
    this.parameterTypes = parameterTypes;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, ng.runtime.RuntimeMetaClass[])
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, final MetaMethodSelection currentSelection, final RuntimeMetaClass[] argumentMetaClasses) {
  int score = 0;
  
    for (int i = 0; i != argumentMetaClasses.length; i++) {
      score += tc.calculateConversionCost(argumentMetaClasses[i], this.parameterTypes[i]);
    }
    
    if (currentSelection.score > score) {
      currentSelection.score = score;
      currentSelection.metaMethod = this;
    }
    
    return currentSelection;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection)
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, final MetaMethodSelection currentSelection) {
    currentSelection.score = 0;
    currentSelection.metaMethod = this;
    
    return currentSelection;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, final MetaMethodSelection currentSelection, final RuntimeMetaClass p1) {
  final int score = tc.calculateConversionCost(p1, this.parameterTypes[0]);
    
    if (currentSelection.score > score) {
      currentSelection.score = score;
      currentSelection.metaMethod = this;
    }
    
    return currentSelection;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, final MetaMethodSelection currentSelection, final RuntimeMetaClass p1, final RuntimeMetaClass p2) {
  final int score = tc.calculateConversionCost(p1, this.parameterTypes[0])
                   + tc.calculateConversionCost(p2, this.parameterTypes[1]);
    
    if (currentSelection.score > score) {
      currentSelection.score = score;
      currentSelection.metaMethod = this;
    }
    
    return currentSelection;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, final MetaMethodSelection currentSelection, final RuntimeMetaClass p1, final RuntimeMetaClass p2, final RuntimeMetaClass p3) {
  final int score = tc.calculateConversionCost(p1, this.parameterTypes[0])
                  + tc.calculateConversionCost(p2, this.parameterTypes[1])
                  + tc.calculateConversionCost(p3, this.parameterTypes[2]);
    
    if (currentSelection.score > score) {
      currentSelection.score = score;
      currentSelection.metaMethod = this;
    }
    
    return currentSelection;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, final MetaMethodSelection currentSelection, final RuntimeMetaClass p1, final RuntimeMetaClass p2, final RuntimeMetaClass p3, final RuntimeMetaClass p4) {
  final int score = tc.calculateConversionCost(p1, this.parameterTypes[0])
                  + tc.calculateConversionCost(p2, this.parameterTypes[1])
                  + tc.calculateConversionCost(p3, this.parameterTypes[2])
                  + tc.calculateConversionCost(p4, this.parameterTypes[3]);
    
    if (currentSelection.score > score) {
      currentSelection.score = score;
      currentSelection.metaMethod = this;
    }
    
    return currentSelection;
  }
}
