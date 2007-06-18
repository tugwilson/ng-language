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
package ng.lang;

import ng.runtime.MetaClassRegistry;
import ng.runtime.RuntimeMetaClass;
import uk.co.wilson.ng.runtime.metaclass.*;

public final class NgSystem {
  private NgSystem() {
    // Ensure that the class can never be instantitated
  }

  /**
   * The MetaClass for java.lang.Object
   * 
   * This is the root of the MetaClass tree an is used to load all the other
   * MetaClasses directly or indirectly.
   */
  public static final RuntimeMetaClass objectMetaClass;

  /**
   * The MetaClass for ng.lang.NgBoolean
   * 
   */
  public static final RuntimeMetaClass ngBooleanMetaClass;

  /**
   * The MetaClass for ng.lang.NgByte
   * 
   */
  public static final RuntimeMetaClass ngByteMetaClass;

  /**
   * The MetaClass for ng.lang.NgChar
   * 
   */
  public static final RuntimeMetaClass ngCharMetaClass;

  /**
   * The MetaClass for ng.lang.NgShort
   * 
   */
  public static final RuntimeMetaClass ngShortMetaClass;

  /**
   * The MetaClass for ng.lang.NgInt
   * 
   */
  public static final RuntimeMetaClass ngIntMetaClass;

  /**
   * The MetaClass for ng.lang.NgLong
   * 
   */
  public static final RuntimeMetaClass ngLongMetaClass;

  /**
   * The MetaClass for ng.lang.NgFloat
   * 
   */
  public static final RuntimeMetaClass ngFloatMetaClass;

  /**
   * The MetaClass for ng.lang.NgDouble
   * 
   */
  public static final RuntimeMetaClass ngDoubleMetaClass;

  /**
   * The MetaClass for java.math.BigInteger
   * 
   */
  public static final RuntimeMetaClass bigIntegerMetaClass;

  /**
   * The MetaClass for java.math.BigDicimal
   * 
   */
  public static final RuntimeMetaClass bigDecimalMetaClass;

  /**
   * The MetaClass for ng.lang.Closure
   * 
   */
  public static final RuntimeMetaClass closureMetaClass;

  /**
   * The registry used to map Classes to MetaClasses
   */
  public static final MetaClassRegistry metaClassRegistry;

  static {
    objectMetaClass = new ObjectMetaClassImpl();
  }

  static {
    ngBooleanMetaClass = new NgBooleanMetaClass();
  }

  static {
    ngByteMetaClass = new NgByteMetaClass();
  }

  static {
    ngCharMetaClass = new NgCharMetaClass();
  }

  static {
    ngShortMetaClass = new NgShortMetaClass();
  }

  static {
    ngIntMetaClass = new NgIntMetaClass();
  }

  static {
    ngLongMetaClass = new NgLongMetaClass();
  }

  static {
    ngFloatMetaClass = new NgFloatMetaClass();
  }

  static {
    ngDoubleMetaClass = new NgDoubleMetaClass();
  }

  static {
    bigIntegerMetaClass = new BigIntegerMetaClass();
  }

  static {
    closureMetaClass = new ClosureMetaClass();
  }

  static {
    bigDecimalMetaClass = new BigDecimalMetaClass();
  }

  static {
    metaClassRegistry = new MetaClassRegistryImpl();
  }
}
