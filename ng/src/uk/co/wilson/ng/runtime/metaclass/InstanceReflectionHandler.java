package uk.co.wilson.ng.runtime.metaclass;

import ng.lang.NgRuntimeException;
import ng.runtime.InstanceHandler;
/*
 * Created on 21 Mar 2007
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
 * @author tug
 *
 */
public class InstanceReflectionHandler implements InstanceHandler {
  private final Class theClass;

  /**
   * @param theClass
   */
  public InstanceReflectionHandler(final Class theClass) {
    this.theClass = theClass;
  }

  /**
   * @return the theClass
   */
  public Class getTheClass() {
    return this.theClass;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeConstructor(java.lang.Class, java.lang.Object[])
   */
  public Object invokeConstructor(Class theClass, Object[] arguments) {
    return RuntimeMetaClassImpl.NOT_CONSTRUCTED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object[])
   */
  public Object invokeMethod(Object instance, String methodName, Object[] arguments) {
    if(arguments.length <= 4)
      throw new NgRuntimeException("Internal Error invokeMethod called with an array of " + arguments.length +" parameters");
    
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String)
   */
  public Object invokeMethod(Object instance, String methodName) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object invokeMethod(Object instance, String methodName, Object p1) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethod(Object instance, String methodName, Object p1, Object p2) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethod(Object instance, String methodName, Object p1, Object p2, Object p3) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethod(Object instance, String methodName, Object p1, Object p2, Object p3, Object p4) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getProperty(java.lang.Object, java.lang.String)
   */
  public Object getProperty(Object instance, String propertyName) {
    return RuntimeMetaClassImpl.NO_PROPERTY;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#setProperty(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setProperty(Object instance, String propertyName, Object newValue) {
    return RuntimeMetaClassImpl.NO_PROPERTY;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getField(java.lang.Object, java.lang.String)
   */
  public Object getField(Object instance, String fieldName) {
    return RuntimeMetaClassImpl.NO_FIELD;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#setField(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setField(Object instance, String fieldName, Object newValue) {
    return RuntimeMetaClassImpl.NO_FIELD;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object, java.lang.Object[])
   */
  public Object call(Object instance, Object[] arguments) {
    if(arguments.length <= 4)
      throw new NgRuntimeException("Internal Error call called with an array of " + arguments.length +" parameters");
    
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object)
   */
  public Object call(Object instance) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object, java.lang.Object)
   */
  public Object call(Object instance, Object p1) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(Object instance, Object p1, Object p2) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(Object instance, Object p1, Object p2, Object p3) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(Object instance, Object p1, Object p2, Object p3, Object p4) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }
}
