package uk.co.wilson.ng.ast;

import ng.ast.DoubleConstant;
/*
 * Created on 16 Jan 2008
 *
 * Copyright 2008 John G. Wilson
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
import ng.runtime.NgDouble;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;


/**
 * @author John
 *
 */
public class DoubleConstantImpl extends NodeImpl implements DoubleConstant {
  private final NgDouble value;
  
  /* (non-JavaDoc)
   * @see ng.ast.Node#evaluate(java.lang.Object, ng.runtime.metaclass.MetaClass, ng.runtime.threadcontext.ThreadContext)
   */
  /**
   * @param value
   */
  public DoubleConstantImpl(double value) {
    this.value = NgDouble.valueOf(value);
  }


  public Object evaluate(Object instance, MetaClass metaClass, ThreadContext tc) {
    return this.value;
  }
}
