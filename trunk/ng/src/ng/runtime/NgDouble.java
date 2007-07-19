/*
 * Created on Feb 25, 2007
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
package ng.runtime;

import ng.lang.NgObject;
import ng.lang.NgSystem;


public class NgDouble implements NgObject {
  /**
   * @return
   */
  public static RuntimeMetaClass get$MetaClass() {
    return NgSystem.ngDoubleMetaClass;
  }
  
  /**
   * @param value
   * @return
   */
  public static NgDouble valueOf(final double value) {
    return new NgDouble(value);
  }
  
  private final double value;

  private NgDouble(final double value) {
    this.value = value;
  }
  
  /* (non-JavaDoc)
   * @see ng.lang.NgObject#getMetaClass()
   */
  public RuntimeMetaClass getMetaClass() {
    return get$MetaClass();
  }

  /**
   * @return
   */
  public double getDoubleValue() {
    return this.value;
  }
}
