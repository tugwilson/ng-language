/*
 * Created on Feb 23, 2007
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


public class NgInt extends NgBaseObject {
  public static final RuntimeMetaClass ngMetaClass = NgSystem.ngIntMetaClass;
  public static final NgInt MINUS_ONE = new NgInt(-1);
  public static final NgInt ZERO = new NgInt(0);
  public static final NgInt ONE = new NgInt(1);
  private static final NgInt preAllocatedValues[] = new NgInt[]{MINUS_ONE, ZERO, ONE};
  
  public static NgInt valueOf(final int value) {
    if (value < -1 || value > 1) return new NgInt(value);
    return preAllocatedValues[value + 1];
  }

  private final int value;

  private NgInt(final int value) {
    super(ngMetaClass);
    this.value = value;
  }

  public int getIntValue() {
    return this.value;
  }
}
