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
  
  /**
   * @param numberOfParameters
   */
  public ReflectionMetaMethod(int numberOfParameters) {
    super(numberOfParameters);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, ng.runtime.RuntimeMetaClass[])
   */
  public MetaMethodSelection selectMethod(final MetaMethodSelection currentSelection, final RuntimeMetaClass[] argumentMetaClasses) {
    // TODO Calculate the match factor for the paremeters of this method
    currentSelection.metaMethod = this;
    return currentSelection;
  }
}
