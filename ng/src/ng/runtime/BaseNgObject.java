package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.NgObject;
import ng.lang.NgRuntimeException;
import ng.runtime.threadcontext.ThreadContext;

/*
 * Created on 2 Mar 2008
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
public abstract class BaseNgObject implements NgObject, CompiledNgObject {
  //
  // Can we make these synthetic?
  //
  public Object ng$Call(ThreadContext tc, int methodNumber) throws Throwable {
    switch(methodNumber) {
      case 0:
        return tc.wrap(hashCode());
        
      case 1:
        notify();
        return null;
        
      case 2:
        notifyAll();
        return null;
        
      case 3:
        return toString();
        
      case 4:
        wait();
        return null;
        
      case 5:
        return clone();
        
      case 6:
        finalize();
        return null;
        
      case 7:
        return getMetaClass();
        
      default:
        throw new NgRuntimeException("Invalid call");
    }
  }
  
  public Object ng$Call(ThreadContext tc, int methodNumber, boolean p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }
  
  public Object ng$Call(ThreadContext tc, int methodNumber, char p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }
  
  public Object ng$Call(ThreadContext tc, int methodNumber, byte p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }
  
  public Object ng$Call(ThreadContext tc, int methodNumber, short p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }
  
  public Object ng$Call(ThreadContext tc, int methodNumber, int p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }
  
  public Object ng$Call(ThreadContext tc, int methodNumber, long p1) throws Throwable {
    switch(methodNumber) {
      case 0:
        wait(p1);
        return null;
        
      default:
        throw new NgRuntimeException("Invalid call");
    }
  }
  
  public Object ng$Call(ThreadContext tc, int methodNumber, float p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }
  
  public Object ng$Call(ThreadContext tc, int methodNumber, double p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }
  
  public Object ng$Call(ThreadContext tc, int methodNumber, BigInteger p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }
  
  public Object ng$Call(ThreadContext tc, int methodNumber, BigDecimal p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }
  
  public Object ng$Call(ThreadContext tc, int methodNumber, Object params[]) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }
  
  public Object ng$Call(ThreadContext tc, int methodNumber, Object p1) throws Throwable {
    switch(methodNumber) {
      case 0:
        wait(tc.convert().asLong(p1));
        return null;
        
      default:
        throw new NgRuntimeException("Invalid call");
    }
  }
  
  public Object ng$Call(ThreadContext tc, int methodNumber, Object p1, Object p2) throws Throwable {
    switch(methodNumber) {
    case 0:
      wait(tc.convert().asLong(p1), tc.convert().asInt(p2));
      return null;
      
    default:
      throw new NgRuntimeException("Invalid call");
    }
  }
  
  public Object ng$Call(ThreadContext tc, int methodNumber, Object p1, Object p2, Object p3) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }
  
  public Object ng$Call(ThreadContext tc, int methodNumber, Object p1, Object p2, Object p3, Object p4) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }
}
