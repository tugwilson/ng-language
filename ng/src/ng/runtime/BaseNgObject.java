package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.NgObject;
import ng.lang.NgRuntimeException;
import ng.runtime.threadcontext.ExtendedThreadContext;

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
  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber) throws Throwable {
    switch (methodNumber) {
    case 0:
      return tc.wrap(super.hashCode());

    case 1:
      super.notify();
      return null;

    case 2:
      super.notifyAll();
      return null;

    case 3:
      return super.toString();

    case 4:
      super.wait();
      return null;

    case 5:
      return super.clone();

    case 6:
      super.finalize();
      return null;

    case 7:
      return getMetaClass();

    default:
      throw new NgRuntimeException("Invalid call");
    }
  }

  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final boolean p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }

  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final char p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }

  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final byte p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }

  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final short p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }

  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final int p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }

  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final long p1) throws Throwable {
    switch (methodNumber) {
    case 0:
      super.wait(p1);
      return null;

    default:
      throw new NgRuntimeException("Invalid call");
    }
  }

  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final float p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }

  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final double p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }

  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final BigInteger p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }

  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final BigDecimal p1) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }

  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final Object params[]) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }

  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final Object p1) throws Throwable {
    switch (methodNumber) {
    case 0:
      super.wait(tc.convert().asLong(p1));
      return null;

    default:
      throw new NgRuntimeException("Invalid call");
    }
  }

  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final Object p1, final Object p2) throws Throwable {
    switch (methodNumber) {
    case 0:
      super.wait(tc.convert().asLong(p1), tc.convert().asInt(p2));
      return null;

    default:
      throw new NgRuntimeException("Invalid call");
    }
  }

  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final Object p1, final Object p2, final Object p3) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }

  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    throw new NgRuntimeException("Invalid call");
  }
}
