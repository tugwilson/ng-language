package uk.co.wilson.ng.runtime.metaclass;
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

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.NgSystem;
import ng.runtime.NgBoolean;
import ng.runtime.NgDouble;
import ng.runtime.NgInt;

public class NgDoubleMetaClass extends RuntimeMetaClassImpl {
  public NgDoubleMetaClass() {
    super(double.class, new NgDoubleInternalMetaClass(double.class));
  }
}

class NgDoubleInternalMetaClass extends InternalMetaClassImpl {
  public NgDoubleInternalMetaClass(final Class theClass) {
    super(theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#getParamObject(java.lang.Object)
   */
  public Object doGetParamObject(final Object instance) {
    return new Double(((NgDouble)instance).getDoubleValue());
  }

  public Object doUnaryPlus(final double instance) {
    return new NgDouble(instance);
  }
  
  public Object doUnaryPlus(final Object instance) {
    return instance;
  }
  
  public Object doUnaryMinus(final double instance) {
    return new NgDouble(-instance);
  }
  
  public Object doUnaryMinus(final Object instance) {
    return new NgDouble(-((NgDouble)instance).getDoubleValue());
  }

  public Object doPostfixIncrement(final double instance) {
    return new NgDouble(instance + 1);
  }

  public Object doPostfixIncrement(final Object instance) {
    return new NgDouble(((NgDouble)instance).getDoubleValue() + 1);
  }

  public Object doPostfixDecrement(final double instance) {
    return new NgDouble(instance - 1);
  }

  public Object doPostfixDecrement(final Object instance) {
    return new NgDouble(((NgDouble)instance).getDoubleValue() - 1);
  }

  public Object doPrefixIncrement(final double instance) {
    return new NgDouble(instance + 1);
  }

  public Object doPrefixIncrement(final Object instance) {
    return new NgDouble(((NgDouble)instance).getDoubleValue() + 1);
  }

  public Object doPrefixDecrement(final double instance) {
    return new NgDouble(instance - 1);
  }

  public Object doPrefixDecrement(final Object instance) {
    return new NgDouble(((NgDouble)instance).getDoubleValue() - 1);
  }

  public Object doAdd(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAdd(final double lhs, final byte rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAdd(final double lhs, final char rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAdd(final double lhs, final short rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAdd(final double lhs, final int rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAdd(final double lhs, final long rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAdd(final double lhs, final float rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAdd(final double lhs, final double rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAdd(final double lhs, final BigInteger rhs) {
    return new NgDouble(lhs + rhs.doubleValue());
  }

  public Object doAdd(final double lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).add(rhs);
  }

  public Object doAdd(final Object lhs, final byte rhs) {
    return doAdd(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAdd(final Object lhs, final char rhs) {
    return doAdd(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAdd(final Object lhs, final short rhs) {
    return doAdd(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAdd(final Object lhs, final int rhs) {
    return doAdd(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAdd(final Object lhs, final long rhs) {
    return doAdd(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAdd(final Object lhs, final float rhs) {
    return doAdd(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAdd(final Object lhs, final double rhs) {
    return doAdd(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAdd(final Object lhs, final BigInteger rhs) {
    return doAdd(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAdd(final Object lhs, final BigDecimal rhs) {
    return doAdd(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseAdd(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAdd(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseAdd(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAdd(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseAdd(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAdd(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseAdd(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAdd(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseAdd(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAdd(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseAdd(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAdd(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseAdd(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAdd(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseAdd(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAdd(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseAdd(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAdd(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doAddEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAddEquals(final double lhs, final byte rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAddEquals(final double lhs, final char rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAddEquals(final double lhs, final short rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAddEquals(final double lhs, final int rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAddEquals(final double lhs, final long rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAddEquals(final double lhs, final float rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAddEquals(final double lhs, final double rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAddEquals(final double lhs, final BigInteger rhs) {
    return new NgDouble(lhs + rhs.doubleValue());
  }

  public Object doAddEquals(final double lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).add(rhs);
  }

  public Object doAddEquals(final Object lhs, final byte rhs) {
    return doAddEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final char rhs) {
    return doAddEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final short rhs) {
    return doAddEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final int rhs) {
    return doAddEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final long rhs) {
    return doAddEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final float rhs) {
    return doAddEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final double rhs) {
    return doAddEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final BigInteger rhs) {
    return doAddEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final BigDecimal rhs) {
    return doAddEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseAddEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAddEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseAddEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAddEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseAddEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAddEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseAddEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAddEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseAddEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAddEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseAddEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAddEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseAddEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAddEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseAddEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAddEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseAddEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAddEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doSubtract(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtract(final double lhs, final byte rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtract(final double lhs, final char rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtract(final double lhs, final short rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtract(final double lhs, final int rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtract(final double lhs, final long rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtract(final double lhs, final float rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtract(final double lhs, final double rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtract(final double lhs, final BigInteger rhs) {
    return new NgDouble(lhs - rhs.doubleValue());
  }

  public Object doSubtract(final double lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).subtract(rhs);
  }

  public Object doSubtract(final Object lhs, final byte rhs) {
    return doSubtract(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final char rhs) {
    return doSubtract(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final short rhs) {
    return doSubtract(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final int rhs) {
    return doSubtract(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final long rhs) {
    return doSubtract(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final float rhs) {
    return doSubtract(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final double rhs) {
    return doSubtract(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final BigInteger rhs) {
    return doSubtract(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final BigDecimal rhs) {
    return doSubtract(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseSubtract(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtract(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseSubtract(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtract(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseSubtract(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtract(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseSubtract(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtract(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseSubtract(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtract(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseSubtract(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtract(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseSubtract(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtract(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseSubtract(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtract(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseSubtract(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtract(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doSubtractEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtractEquals(final double lhs, final byte rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtractEquals(final double lhs, final char rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtractEquals(final double lhs, final short rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtractEquals(final double lhs, final int rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtractEquals(final double lhs, final long rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtractEquals(final double lhs, final float rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtractEquals(final double lhs, final double rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtractEquals(final double lhs, final BigInteger rhs) {
    return new NgDouble(lhs - rhs.doubleValue());
  }

  public Object doSubtractEquals(final double lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).subtract(rhs);
  }

  public Object doSubtractEquals(final Object lhs, final byte rhs) {
    return doSubtractEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final char rhs) {
    return doSubtractEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final short rhs) {
    return doSubtractEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final int rhs) {
    return doSubtractEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final long rhs) {
    return doSubtractEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final float rhs) {
    return doSubtractEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final double rhs) {
    return doSubtractEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final BigInteger rhs) {
    return doSubtractEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final BigDecimal rhs) {
    return doSubtractEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseSubtractEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtractEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseSubtractEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtractEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseSubtractEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtractEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseSubtractEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtractEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseSubtractEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtractEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseSubtractEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtractEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseSubtractEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtractEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseSubtractEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtractEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseSubtractEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtractEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doMultiply(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiply(final double lhs, final byte rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiply(final double lhs, final char rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiply(final double lhs, final short rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiply(final double lhs, final int rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiply(final double lhs, final long rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiply(final double lhs, final float rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiply(final double lhs, final double rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiply(final double lhs, final BigInteger rhs) {
    return new NgDouble(lhs * rhs.doubleValue());
  }

  public Object doMultiply(final double lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).multiply(rhs);
  }

  public Object doMultiply(final Object lhs, final byte rhs) {
    return doMultiply(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final char rhs) {
    return doMultiply(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final short rhs) {
    return doMultiply(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final int rhs) {
    return doMultiply(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final long rhs) {
    return doMultiply(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final float rhs) {
    return doMultiply(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final double rhs) {
    return doMultiply(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final BigInteger rhs) {
    return doMultiply(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final BigDecimal rhs) {
    return doMultiply(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseMultiply(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiply(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseMultiply(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiply(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseMultiply(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiply(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseMultiply(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiply(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseMultiply(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiply(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseMultiply(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiply(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseMultiply(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiply(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseMultiply(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiply(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseMultiply(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiply(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doMultiplyEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiplyEquals(final double lhs, final byte rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiplyEquals(final double lhs, final char rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiplyEquals(final double lhs, final short rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiplyEquals(final double lhs, final int rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiplyEquals(final double lhs, final long rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiplyEquals(final double lhs, final float rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiplyEquals(final double lhs, final double rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiplyEquals(final double lhs, final BigInteger rhs) {
    return new NgDouble(lhs * rhs.doubleValue());
  }

  public Object doMultiplyEquals(final double lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).multiply(rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final byte rhs) {
    return doMultiplyEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final char rhs) {
    return doMultiplyEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final short rhs) {
    return doMultiplyEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final int rhs) {
    return doMultiplyEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final long rhs) {
    return doMultiplyEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final float rhs) {
    return doMultiplyEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final double rhs) {
    return doMultiplyEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final BigInteger rhs) {
    return doMultiplyEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final BigDecimal rhs) {
    return doMultiplyEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseMultiplyEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiplyEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseMultiplyEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiplyEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseMultiplyEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiplyEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseMultiplyEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiplyEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseMultiplyEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiplyEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseMultiplyEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiplyEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseMultiplyEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiplyEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseMultiplyEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiplyEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseMultiplyEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiplyEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doDivide(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivide(final double lhs, final byte rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivide(final double lhs, final char rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivide(final double lhs, final short rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivide(final double lhs, final int rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivide(final double lhs, final long rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivide(final double lhs, final float rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivide(final double lhs, final double rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivide(final double lhs, final BigInteger rhs) {
    return new NgDouble(lhs / rhs.doubleValue());
  }

  public Object doDivide(final double lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divide(rhs);
  }

  public Object doDivide(final Object lhs, final byte rhs) {
    return doDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivide(final Object lhs, final char rhs) {
    return doDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivide(final Object lhs, final short rhs) {
    return doDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivide(final Object lhs, final int rhs) {
    return doDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivide(final Object lhs, final long rhs) {
    return doDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivide(final Object lhs, final float rhs) {
    return doDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivide(final Object lhs, final double rhs) {
    return doDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivide(final Object lhs, final BigInteger rhs) {
    return doDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivide(final Object lhs, final BigDecimal rhs) {
    return doDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseDivide(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseDivide(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseDivide(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseDivide(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseDivide(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseDivide(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseDivide(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseDivide(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseDivide(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doDivideEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivideEquals(final double lhs, final byte rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivideEquals(final double lhs, final char rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivideEquals(final double lhs, final short rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivideEquals(final double lhs, final int rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivideEquals(final double lhs, final long rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivideEquals(final double lhs, final float rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivideEquals(final double lhs, final double rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivideEquals(final double lhs, final BigInteger rhs) {
    return new NgDouble(lhs / rhs.doubleValue());
  }

  public Object doDivideEquals(final double lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divide(rhs);
  }

  public Object doDivideEquals(final Object lhs, final byte rhs) {
    return doDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final char rhs) {
    return doDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final short rhs) {
    return doDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final int rhs) {
    return doDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final long rhs) {
    return doDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final float rhs) {
    return doDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final double rhs) {
    return doDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final BigInteger rhs) {
    return doDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final BigDecimal rhs) {
    return doDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseDivideEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseDivideEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseDivideEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseDivideEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseDivideEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseDivideEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseDivideEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseDivideEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseDivideEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doIntegerDivide(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivide(final double lhs, final byte rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final double lhs, final char rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final double lhs, final short rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final double lhs, final int rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final double lhs, final long rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final double lhs, final float rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final double lhs, final double rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final double lhs, final BigInteger rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(new BigDecimal(rhs));
  }

  public Object doIntegerDivide(final double lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divideToIntegralValue(rhs);
  }

  public Object doIntegerDivide(final Object lhs, final byte rhs) {
    return doIntegerDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final char rhs) {
    return doIntegerDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final short rhs) {
    return doIntegerDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final int rhs) {
    return doIntegerDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final long rhs) {
    return doIntegerDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final float rhs) {
    return doIntegerDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final double rhs) {
    return doIntegerDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final BigInteger rhs) {
    return doIntegerDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final BigDecimal rhs) {
    return doIntegerDivide(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseIntegerDivide(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseIntegerDivide(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseIntegerDivide(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseIntegerDivide(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseIntegerDivide(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseIntegerDivide(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseIntegerDivide(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseIntegerDivide(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseIntegerDivide(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivide(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doIntegerDivideEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivideEquals(final double lhs, final byte rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final char rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final short rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final int rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final long rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final float rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final double rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final BigInteger rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(new BigDecimal(rhs));
  }

  public Object doIntegerDivideEquals(final double lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divideToIntegralValue(rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final byte rhs) {
    return doIntegerDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final char rhs) {
    return doIntegerDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final short rhs) {
    return doIntegerDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final int rhs) {
    return doIntegerDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final long rhs) {
    return doIntegerDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final float rhs) {
    return doIntegerDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final double rhs) {
    return doIntegerDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseIntegerDivideEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseIntegerDivideEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseIntegerDivideEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseIntegerDivideEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseIntegerDivideEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseIntegerDivideEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseIntegerDivideEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseIntegerDivideEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseIntegerDivideEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivideEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doCompare(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doCompare(final double lhs, final byte rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final double lhs, final char rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final double lhs, final short rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final double lhs, final int rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final double lhs, final long rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final double lhs, final float rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final double lhs, final double rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final double lhs, final BigInteger rhs) {
    return new NgInt(new BigDecimal(lhs).compareTo(new BigDecimal(rhs)));
  }

  public Object doCompare(final double lhs, final BigDecimal rhs) {
    return new NgInt(new BigDecimal(lhs).compareTo(rhs));
  }

  public Object doCompare(final Object lhs, final byte rhs) {
    return doCompare(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doCompare(final Object lhs, final char rhs) {
    return doCompare(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doCompare(final Object lhs, final short rhs) {
    return doCompare(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doCompare(final Object lhs, final int rhs) {
    return doCompare(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doCompare(final Object lhs, final long rhs) {
    return doCompare(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doCompare(final Object lhs, final float rhs) {
    return doCompare(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doCompare(final Object lhs, final double rhs) {
    return doCompare(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doCompare(final Object lhs, final BigInteger rhs) {
    return doCompare(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doCompare(final Object lhs, final BigDecimal rhs) {
    return doCompare(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseCompare(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doCompare(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseCompare(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doCompare(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseCompare(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doCompare(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseCompare(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doCompare(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseCompare(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doCompare(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseCompare(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doCompare(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseCompare(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doCompare(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseCompare(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doCompare(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseCompare(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doCompare(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doEquals(final double lhs, final byte rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final double lhs, final char rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final double lhs, final short rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final double lhs, final int rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final double lhs, final long rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final double lhs, final float rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final double lhs, final double rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final double lhs, final BigInteger rhs) {
    return (lhs == rhs.doubleValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final double lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final Object lhs, final byte rhs) {
    return doEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doEquals(final Object lhs, final char rhs) {
    return doEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doEquals(final Object lhs, final short rhs) {
    return doEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doEquals(final Object lhs, final int rhs) {
    return doEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doEquals(final Object lhs, final long rhs) {
    return doEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doEquals(final Object lhs, final float rhs) {
    return doEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doEquals(final Object lhs, final double rhs) {
    return doEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doEquals(final Object lhs, final BigInteger rhs) {
    return doEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doEquals(final Object lhs, final BigDecimal rhs) {
    return doEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doNotEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doNotEquals(final double lhs, final byte rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final double lhs, final char rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final double lhs, final short rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final double lhs, final int rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final double lhs, final long rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final double lhs, final float rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final double lhs, final double rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final double lhs, final BigInteger rhs) {
    return (lhs != rhs.doubleValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final double lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final Object lhs, final byte rhs) {
    return doNotEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final char rhs) {
    return doNotEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final short rhs) {
    return doNotEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final int rhs) {
    return doNotEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final long rhs) {
    return doNotEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final float rhs) {
    return doNotEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final double rhs) {
    return doNotEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final BigInteger rhs) {
    return doNotEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final BigDecimal rhs) {
    return doNotEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseNotEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doNotEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseNotEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doNotEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseNotEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doNotEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseNotEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doNotEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseNotEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doNotEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseNotEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doNotEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseNotEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doNotEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseNotEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doNotEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseNotEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doNotEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doLessThan(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThan(final double lhs, final byte rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final double lhs, final char rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final double lhs, final short rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final double lhs, final int rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final double lhs, final long rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final double lhs, final float rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final double lhs, final double rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final double lhs, final BigInteger rhs) {
    return (lhs < rhs.doubleValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final double lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final Object lhs, final byte rhs) {
    return doLessThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final char rhs) {
    return doLessThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final short rhs) {
    return doLessThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final int rhs) {
    return doLessThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final long rhs) {
    return doLessThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final float rhs) {
    return doLessThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final double rhs) {
    return doLessThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final BigInteger rhs) {
    return doLessThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final BigDecimal rhs) {
    return doLessThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseLessThan(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseLessThan(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseLessThan(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseLessThan(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseLessThan(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseLessThan(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseLessThan(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseLessThan(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseLessThan(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doLessThanOrEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThanOrEquals(final double lhs, final byte rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final double lhs, final char rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final double lhs, final short rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final double lhs, final int rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final double lhs, final long rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final double lhs, final float rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final double lhs, final double rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final double lhs, final BigInteger rhs) {
    return (lhs <= rhs.doubleValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final double lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final Object lhs, final byte rhs) {
    return doLessThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final char rhs) {
    return doLessThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final short rhs) {
    return doLessThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final int rhs) {
    return doLessThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final long rhs) {
    return doLessThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final float rhs) {
    return doLessThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final double rhs) {
    return doLessThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final BigInteger rhs) {
    return doLessThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseLessThanOrEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseLessThanOrEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseLessThanOrEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseLessThanOrEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseLessThanOrEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseLessThanOrEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseLessThanOrEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseLessThanOrEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseLessThanOrEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doGreaterThan(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThan(final double lhs, final byte rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final double lhs, final char rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final double lhs, final short rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final double lhs, final int rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final double lhs, final long rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final double lhs, final float rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final double lhs, final double rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final double lhs, final BigInteger rhs) {
    return (lhs > rhs.doubleValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final double lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final Object lhs, final byte rhs) {
    return doGreaterThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final char rhs) {
    return doGreaterThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final short rhs) {
    return doGreaterThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final int rhs) {
    return doGreaterThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final long rhs) {
    return doGreaterThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final float rhs) {
    return doGreaterThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final double rhs) {
    return doGreaterThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final BigInteger rhs) {
    return doGreaterThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final BigDecimal rhs) {
    return doGreaterThan(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseGreaterThan(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseGreaterThan(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseGreaterThan(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseGreaterThan(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseGreaterThan(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseGreaterThan(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseGreaterThan(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseGreaterThan(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseGreaterThan(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThan(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doGreaterThanOrEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final double lhs, final byte rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final double lhs, final char rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final double lhs, final short rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final double lhs, final int rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final double lhs, final long rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final double lhs, final float rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final double lhs, final double rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final double lhs, final BigInteger rhs) {
    return (lhs >= rhs.doubleValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final double lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final Object lhs, final byte rhs) {
    return doGreaterThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final char rhs) {
    return doGreaterThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final short rhs) {
    return doGreaterThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final int rhs) {
    return doGreaterThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final long rhs) {
    return doGreaterThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final float rhs) {
    return doGreaterThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final double rhs) {
    return doGreaterThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(((NgDouble)lhs).getDoubleValue(), rhs);
  }

  public Object doReverseGreaterThanOrEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseGreaterThanOrEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseGreaterThanOrEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseGreaterThanOrEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseGreaterThanOrEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseGreaterThanOrEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseGreaterThanOrEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseGreaterThanOrEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

  public Object doReverseGreaterThanOrEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThanOrEquals(lhs, ((NgDouble)rhs).getDoubleValue());
  }

}
