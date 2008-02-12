package ng.runtime.threadcontext;

import ng.runtime.metaclass.MetaClass;
import uk.co.wilson.ng.runtime.threadcontext.ThreadContextImpl;
/*
 * Created on 12 Feb 2008
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

/**
 * @author John
 *
 */
public abstract class ThreadContext {
  private static final ThreadLocal<ExtendedThreadContext> contexts = new ThreadLocal<ExtendedThreadContext>() {

    /* (non-JavaDoc)
     * @see java.lang.ThreadLocal#initialValue()
     */
    @Override
    protected ExtendedThreadContext initialValue() {
      return new ThreadContextImpl();
    }

  };

  public static ThreadContext getThreadContext() {
    return contexts.get();
  }
  
  public abstract MetaClass getMetaClassFor(Object instance);
  public abstract MetaClass getMetaClassFor(Class<?> type);

  //
  // Select Message Types
  //
  public abstract Misc misc();

  public abstract InterpreterSupport interpreterSupport();

  public abstract StaticMethodCall staticMethodCall();

  public abstract ValueAccess propertyAccess();

  public abstract ValueAccess fieldAccess();

  public abstract Coversion convert();

  public abstract BinaryArithmeticOperation add();

  public abstract BinaryArithmeticOperation subtract();

  public abstract BinaryArithmeticOperation multiply();

  public abstract BinaryArithmeticOperation divide();

  public abstract BinaryArithmeticOperation remainderDivide();

  public abstract BinaryArithmeticOperation modulo();

  public abstract BinaryArithmeticOperation power();

  public abstract BooleanComparison equals();

  public abstract BooleanComparison notEquals();

  public abstract BooleanComparison lessThan();

  public abstract BooleanComparison greaterThan();

  public abstract BooleanComparison lessThanOrEquals();

  public abstract BooleanComparison greaterThanOrEquals();
}
