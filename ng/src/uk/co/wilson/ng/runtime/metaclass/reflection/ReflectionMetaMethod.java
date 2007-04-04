package uk.co.wilson.ng.runtime.metaclass.reflection;

import ng.runtime.RuntimeMetaClass;
import uk.co.wilson.ng.runtime.metaclass.methods.BaseMetaMethod;
/*
 * Created on 2 Apr 2007
 *
 * Copyright 2007 John G. Wilson
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

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
   * @see ng.runtime.MetaMethod#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, ng.runtime.RuntimeMetaClass[])
   */
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final RuntimeMetaClass[] argumentMetaClasses) {
  int score = 0;
  
    for (int i = 0; i != argumentMetaClasses.length; i++) {
      score += argumentMetaClasses[i].calculateConversionCost(this.parameterTypes[i]);
    }
    
    if (currentSelection.score > score) {
      currentSelection.score = score;
      currentSelection.metaMethod = this;
    }
    
    return currentSelection;
  }
  
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection) {
    currentSelection.score = 0;
    currentSelection.metaMethod = this;
    
    return currentSelection;
  }
  
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final RuntimeMetaClass p1) {
  int score = p1.calculateConversionCost(this.parameterTypes[0]);
    
    if (currentSelection.score > score) {
      currentSelection.score = score;
      currentSelection.metaMethod = this;
    }
    
    return currentSelection;
  }
  
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final RuntimeMetaClass p1, final RuntimeMetaClass p2) {
  int score = p1.calculateConversionCost(this.parameterTypes[0])
              + p2.calculateConversionCost(this.parameterTypes[1]);
    
    if (currentSelection.score > score) {
      currentSelection.score = score;
      currentSelection.metaMethod = this;
    }
    
    return currentSelection;
  }
  
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final RuntimeMetaClass p1, final RuntimeMetaClass p2, final RuntimeMetaClass p3) {
  int score = p1.calculateConversionCost(this.parameterTypes[0])
              + p2.calculateConversionCost(this.parameterTypes[1])
              + p3.calculateConversionCost(this.parameterTypes[2]);
    
    if (currentSelection.score > score) {
      currentSelection.score = score;
      currentSelection.metaMethod = this;
    }
    
    return currentSelection;
  }
  
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final RuntimeMetaClass p1, final RuntimeMetaClass p2, final RuntimeMetaClass p3, final RuntimeMetaClass p4) {
  int score = p1.calculateConversionCost(this.parameterTypes[0])
              + p2.calculateConversionCost(this.parameterTypes[1])
              + p3.calculateConversionCost(this.parameterTypes[2])
              + p4.calculateConversionCost(this.parameterTypes[3]);
    
    if (currentSelection.score > score) {
      currentSelection.score = score;
      currentSelection.metaMethod = this;
    }
    
    return currentSelection;
  }
}
