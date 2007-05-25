/*
 * Created on Feb 24, 2007
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

import ng.lang.NgSystem;


public class NgLong extends NgBaseObject {
  public static final RuntimeMetaClass ngMetaClass = NgSystem.ngLongMetaClass;
  
  public static NgLong valueOf(final long value) {
    return new NgLong(value);
  }
  
  private final long value;

  public NgLong(final long value) {
    super(ngMetaClass);
    this.value = value;
  }

  public long getLongValue() {
    return this.value;
  }
}
