package uk.co.wilson.ng.runtime.metaclass;

import java.lang.reflect.Method;
/*
 * Created on 25 Jan 2008
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

import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public abstract class BaseSingletonStaticMethod extends BaseStaticMethodProxy {
  
  protected final Method method;
  protected final int returnType;
  
  public BaseSingletonStaticMethod(final Method method) {
    this.method = method;
    final Class returnedClass = method.getReturnType();
    
    if (returnedClass.equals(boolean.class)) {
      this.returnType = 0;
    } else if (returnedClass.equals(char.class)) {
      this.returnType = 1;
    } else if (returnedClass.equals(byte.class)) {
      this.returnType = 2;
    } else if (returnedClass.equals(short.class)) {
      this.returnType = 3;
    } else if (returnedClass.equals(int.class)) {
      this.returnType = 4;
    } else if (returnedClass.equals(long.class)) {
      this.returnType = 5;
    } else if (returnedClass.equals(float.class)) {
      this.returnType = 6;
    } else if (returnedClass.equals(double.class)) {
      this.returnType = 7;
    } else {
      this.returnType = -1;
    }
  }
  
  protected Object wrapReturnValue(final ThreadContext tc, final Object result) {
    switch(this.returnType) {
      case 0:
        return tc.wrap(((Boolean)result).booleanValue());
      case 1:
        return tc.wrap(((Character)result).charValue());
      case 2:
        return tc.wrap(((Byte)result).byteValue());
      case 3:
        return tc.wrap(((Short)result).shortValue());
      case 4:
        return tc.wrap(((Integer)result).intValue());
      case 5:
        return tc.wrap(((Long)result).longValue());
      case 6:
        return tc.wrap(((Float)result).floatValue());
      case 7:
        return tc.wrap(((Double)result).doubleValue());
      default:
        return result;
    }
  }
}
