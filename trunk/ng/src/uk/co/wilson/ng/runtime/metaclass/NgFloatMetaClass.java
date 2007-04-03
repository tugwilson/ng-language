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
import ng.runtime.NgFloat;
import ng.runtime.NgInt;

public class NgFloatMetaClass extends RuntimeMetaClassImpl {
  public NgFloatMetaClass() {
    super(float.class, new NgFloatInternalMetaClass(float.class));
  }
}

class NgFloatInternalMetaClass extends InternalMetaClassImpl {
  public NgFloatInternalMetaClass(final Class theClass) {
    super(theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#getParamObject(java.lang.Object)
   */
  public Object doGetParamObject(final Object instance) {
    return new Float(((NgFloat)instance).getFloatValue());
  }

  public Object doUnaryPlus(final float instance) {
    return new NgFloat(instance);
  }
  
  public Object doUnaryPlus(final Object instance) {
    return instance;
  }
  
  public Object doUnaryMinus(final float instance) {
    return new NgFloat(-instance);
  }
  
  public Object doUnaryMinus(final Object instance) {
    return new NgFloat(-((NgFloat)instance).getFloatValue());
  }

  public Object doPostfixIncrement(final float instance) {
    return new NgFloat(instance + 1);
  }

  public Object doPostfixIncrement(final Object instance) {
    return new NgFloat(((NgFloat)instance).getFloatValue() + 1);
  }

  public Object doPostfixDecrement(final float instance) {
    return new NgFloat(instance - 1);
  }

  public Object doPostfixDecrement(final Object instance) {
    return new NgFloat(((NgFloat)instance).getFloatValue() - 1);
  }

  public Object doPrefixIncrement(final float instance) {
    return new NgFloat(instance + 1);
  }

  public Object doPrefixIncrement(final Object instance) {
    return new NgFloat(((NgFloat)instance).getFloatValue() + 1);
  }

  public Object doPrefixDecrement(final float instance) {
    return new NgFloat(instance - 1);
  }

  public Object doPrefixDecrement(final Object instance) {
    return new NgFloat(((NgFloat)instance).getFloatValue() - 1);
  }

  public Object doAdd(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAdd(final float lhs, final byte rhs) {
    return new NgFloat(lhs + rhs);
  }

  public Object doAdd(final float lhs, final char rhs) {
    return new NgFloat(lhs + rhs);
  }

  public Object doAdd(final float lhs, final short rhs) {
    return new NgFloat(lhs + rhs);
  }

  public Object doAdd(final float lhs, final int rhs) {
    return new NgFloat(lhs + rhs);
  }

  public Object doAdd(final float lhs, final long rhs) {
    return new NgFloat(lhs + rhs);
  }

  public Object doAdd(final float lhs, final float rhs) {
    return new NgFloat(lhs + rhs);
  }

  public Object doAdd(final float lhs, final double rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAdd(final float lhs, final BigInteger rhs) {
    return new NgFloat(lhs + rhs.floatValue());
  }

  public Object doAdd(final float lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).add(rhs);
  }

  public Object doAdd(final Object lhs, final byte rhs) {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAdd(final Object lhs, final char rhs) {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAdd(final Object lhs, final short rhs) {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAdd(final Object lhs, final int rhs) {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAdd(final Object lhs, final long rhs) {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAdd(final Object lhs, final float rhs) {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAdd(final Object lhs, final double rhs) {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAdd(final Object lhs, final BigInteger rhs) {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAdd(final Object lhs, final BigDecimal rhs) {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseAdd(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseAdd(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseAdd(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseAdd(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseAdd(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseAdd(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseAdd(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseAdd(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseAdd(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doAddEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAddEquals(final float lhs, final byte rhs) {
    return new NgFloat(lhs + rhs);
  }

  public Object doAddEquals(final float lhs, final char rhs) {
    return new NgFloat(lhs + rhs);
  }

  public Object doAddEquals(final float lhs, final short rhs) {
    return new NgFloat(lhs + rhs);
  }

  public Object doAddEquals(final float lhs, final int rhs) {
    return new NgFloat(lhs + rhs);
  }

  public Object doAddEquals(final float lhs, final long rhs) {
    return new NgFloat(lhs + rhs);
  }

  public Object doAddEquals(final float lhs, final float rhs) {
    return new NgFloat(lhs + rhs);
  }

  public Object doAddEquals(final float lhs, final double rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAddEquals(final float lhs, final BigInteger rhs) {
    return new NgFloat(lhs + rhs.floatValue());
  }

  public Object doAddEquals(final float lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).add(rhs);
  }

  public Object doAddEquals(final Object lhs, final byte rhs) {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final char rhs) {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final short rhs) {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final int rhs) {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final long rhs) {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final float rhs) {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final double rhs) {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final BigInteger rhs) {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final BigDecimal rhs) {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseAddEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseAddEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseAddEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseAddEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseAddEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseAddEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseAddEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseAddEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseAddEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doSubtract(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtract(final float lhs, final byte rhs) {
    return new NgFloat(lhs - rhs);
  }

  public Object doSubtract(final float lhs, final char rhs) {
    return new NgFloat(lhs - rhs);
  }

  public Object doSubtract(final float lhs, final short rhs) {
    return new NgFloat(lhs - rhs);
  }

  public Object doSubtract(final float lhs, final int rhs) {
    return new NgFloat(lhs - rhs);
  }

  public Object doSubtract(final float lhs, final long rhs) {
    return new NgFloat(lhs - rhs);
  }

  public Object doSubtract(final float lhs, final float rhs) {
    return new NgFloat(lhs - rhs);
  }

  public Object doSubtract(final float lhs, final double rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtract(final float lhs, final BigInteger rhs) {
    return new NgFloat(lhs - rhs.floatValue());
  }

  public Object doSubtract(final float lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).subtract(rhs);
  }

  public Object doSubtract(final Object lhs, final byte rhs) {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final char rhs) {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final short rhs) {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final int rhs) {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final long rhs) {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final float rhs) {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final double rhs) {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final BigInteger rhs) {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final BigDecimal rhs) {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseSubtract(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseSubtract(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseSubtract(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseSubtract(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseSubtract(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseSubtract(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseSubtract(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseSubtract(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseSubtract(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doSubtractEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtractEquals(final float lhs, final byte rhs) {
    return new NgFloat(lhs - rhs);
  }

  public Object doSubtractEquals(final float lhs, final char rhs) {
    return new NgFloat(lhs - rhs);
  }

  public Object doSubtractEquals(final float lhs, final short rhs) {
    return new NgFloat(lhs - rhs);
  }

  public Object doSubtractEquals(final float lhs, final int rhs) {
    return new NgFloat(lhs - rhs);
  }

  public Object doSubtractEquals(final float lhs, final long rhs) {
    return new NgFloat(lhs - rhs);
  }

  public Object doSubtractEquals(final float lhs, final float rhs) {
    return new NgFloat(lhs - rhs);
  }

  public Object doSubtractEquals(final float lhs, final double rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtractEquals(final float lhs, final BigInteger rhs) {
    return new NgFloat(lhs - rhs.floatValue());
  }

  public Object doSubtractEquals(final float lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).subtract(rhs);
  }

  public Object doSubtractEquals(final Object lhs, final byte rhs) {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final char rhs) {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final short rhs) {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final int rhs) {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final long rhs) {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final float rhs) {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final double rhs) {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final BigInteger rhs) {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final BigDecimal rhs) {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseSubtractEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseSubtractEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseSubtractEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseSubtractEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseSubtractEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseSubtractEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseSubtractEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseSubtractEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseSubtractEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doMultiply(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiply(final float lhs, final byte rhs) {
    return new NgFloat(lhs * rhs);
  }

  public Object doMultiply(final float lhs, final char rhs) {
    return new NgFloat(lhs * rhs);
  }

  public Object doMultiply(final float lhs, final short rhs) {
    return new NgFloat(lhs * rhs);
  }

  public Object doMultiply(final float lhs, final int rhs) {
    return new NgFloat(lhs * rhs);
  }

  public Object doMultiply(final float lhs, final long rhs) {
    return new NgFloat(lhs * rhs);
  }

  public Object doMultiply(final float lhs, final float rhs) {
    return new NgFloat(lhs * rhs);
  }

  public Object doMultiply(final float lhs, final double rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiply(final float lhs, final BigInteger rhs) {
    return new NgFloat(lhs * rhs.floatValue());
  }

  public Object doMultiply(final float lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).multiply(rhs);
  }

  public Object doMultiply(final Object lhs, final byte rhs) {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final char rhs) {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final short rhs) {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final int rhs) {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final long rhs) {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final float rhs) {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final double rhs) {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final BigInteger rhs) {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final BigDecimal rhs) {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseMultiply(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseMultiply(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseMultiply(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseMultiply(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseMultiply(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseMultiply(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseMultiply(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseMultiply(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseMultiply(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doMultiplyEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiplyEquals(final float lhs, final byte rhs) {
    return new NgFloat(lhs * rhs);
  }

  public Object doMultiplyEquals(final float lhs, final char rhs) {
    return new NgFloat(lhs * rhs);
  }

  public Object doMultiplyEquals(final float lhs, final short rhs) {
    return new NgFloat(lhs * rhs);
  }

  public Object doMultiplyEquals(final float lhs, final int rhs) {
    return new NgFloat(lhs * rhs);
  }

  public Object doMultiplyEquals(final float lhs, final long rhs) {
    return new NgFloat(lhs * rhs);
  }

  public Object doMultiplyEquals(final float lhs, final float rhs) {
    return new NgFloat(lhs * rhs);
  }

  public Object doMultiplyEquals(final float lhs, final double rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiplyEquals(final float lhs, final BigInteger rhs) {
    return new NgFloat(lhs * rhs.floatValue());
  }

  public Object doMultiplyEquals(final float lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).multiply(rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final byte rhs) {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final char rhs) {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final short rhs) {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final int rhs) {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final long rhs) {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final float rhs) {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final double rhs) {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final BigInteger rhs) {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final BigDecimal rhs) {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseMultiplyEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseMultiplyEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseMultiplyEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseMultiplyEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseMultiplyEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseMultiplyEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseMultiplyEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseMultiplyEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseMultiplyEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doDivide(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivide(final float lhs, final byte rhs) {
    return new NgFloat(lhs / rhs);
  }

  public Object doDivide(final float lhs, final char rhs) {
    return new NgFloat(lhs / rhs);
  }

  public Object doDivide(final float lhs, final short rhs) {
    return new NgFloat(lhs / rhs);
  }

  public Object doDivide(final float lhs, final int rhs) {
    return new NgFloat(lhs / rhs);
  }

  public Object doDivide(final float lhs, final long rhs) {
    return new NgFloat(lhs / rhs);
  }

  public Object doDivide(final float lhs, final float rhs) {
    return new NgFloat(lhs / rhs);
  }

  public Object doDivide(final float lhs, final double rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivide(final float lhs, final BigInteger rhs) {
    return new NgFloat(lhs / rhs.floatValue());
  }

  public Object doDivide(final float lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divide(rhs);
  }

  public Object doDivide(final Object lhs, final byte rhs) {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivide(final Object lhs, final char rhs) {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivide(final Object lhs, final short rhs) {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivide(final Object lhs, final int rhs) {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivide(final Object lhs, final long rhs) {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivide(final Object lhs, final float rhs) {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivide(final Object lhs, final double rhs) {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivide(final Object lhs, final BigInteger rhs) {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivide(final Object lhs, final BigDecimal rhs) {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseDivide(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseDivide(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseDivide(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseDivide(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseDivide(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseDivide(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseDivide(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseDivide(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseDivide(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doDivideEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivideEquals(final float lhs, final byte rhs) {
    return new NgFloat(lhs / rhs);
  }

  public Object doDivideEquals(final float lhs, final char rhs) {
    return new NgFloat(lhs / rhs);
  }

  public Object doDivideEquals(final float lhs, final short rhs) {
    return new NgFloat(lhs / rhs);
  }

  public Object doDivideEquals(final float lhs, final int rhs) {
    return new NgFloat(lhs / rhs);
  }

  public Object doDivideEquals(final float lhs, final long rhs) {
    return new NgFloat(lhs / rhs);
  }

  public Object doDivideEquals(final float lhs, final float rhs) {
    return new NgFloat(lhs / rhs);
  }

  public Object doDivideEquals(final float lhs, final double rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivideEquals(final float lhs, final BigInteger rhs) {
    return new NgFloat(lhs / rhs.floatValue());
  }

  public Object doDivideEquals(final float lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divide(rhs);
  }

  public Object doDivideEquals(final Object lhs, final byte rhs) {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final char rhs) {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final short rhs) {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final int rhs) {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final long rhs) {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final float rhs) {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final double rhs) {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final BigInteger rhs) {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final BigDecimal rhs) {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseDivideEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseDivideEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseDivideEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseDivideEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseDivideEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseDivideEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseDivideEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseDivideEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseDivideEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doIntegerDivide(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivide(final float lhs, final byte rhs) {
    return new NgFloat((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final float lhs, final char rhs) {
    return new NgFloat((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final float lhs, final short rhs) {
    return new NgFloat((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final float lhs, final int rhs) {
    return new NgFloat((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final float lhs, final long rhs) {
    return new NgFloat((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final float lhs, final float rhs) {
    return new NgFloat((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final float lhs, final double rhs) {
    return new NgDouble((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final float lhs, final BigInteger rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(new BigDecimal(rhs));
  }

  public Object doIntegerDivide(final float lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divideToIntegralValue(rhs);
  }

  public Object doIntegerDivide(final Object lhs, final byte rhs) {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final char rhs) {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final short rhs) {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final int rhs) {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final long rhs) {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final float rhs) {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final double rhs) {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final BigInteger rhs) {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final BigDecimal rhs) {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseIntegerDivide(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseIntegerDivide(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseIntegerDivide(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseIntegerDivide(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseIntegerDivide(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseIntegerDivide(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseIntegerDivide(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseIntegerDivide(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseIntegerDivide(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doIntegerDivideEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivideEquals(final float lhs, final byte rhs) {
    return new NgFloat((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final char rhs) {
    return new NgFloat((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final short rhs) {
    return new NgFloat((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final int rhs) {
    return new NgFloat((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final long rhs) {
    return new NgFloat((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final float rhs) {
    return new NgFloat((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final double rhs) {
    return new NgDouble((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final BigInteger rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(new BigDecimal(rhs));
  }

  public Object doIntegerDivideEquals(final float lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divideToIntegralValue(rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final byte rhs) {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final char rhs) {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final short rhs) {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final int rhs) {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final long rhs) {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final float rhs) {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final double rhs) {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseIntegerDivideEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseIntegerDivideEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseIntegerDivideEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseIntegerDivideEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseIntegerDivideEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseIntegerDivideEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseIntegerDivideEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseIntegerDivideEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseIntegerDivideEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doCompare(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doCompare(final float lhs, final byte rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final float lhs, final char rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final float lhs, final short rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final float lhs, final int rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final float lhs, final long rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final float lhs, final float rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final float lhs, final double rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final float lhs, final BigInteger rhs) {
    return new NgInt(new BigDecimal(lhs).compareTo(new BigDecimal(rhs)));
  }

  public Object doCompare(final float lhs, final BigDecimal rhs) {
    return new NgInt(new BigDecimal(lhs).compareTo(rhs));
  }

  public Object doCompare(final Object lhs, final byte rhs) {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doCompare(final Object lhs, final char rhs) {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doCompare(final Object lhs, final short rhs) {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doCompare(final Object lhs, final int rhs) {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doCompare(final Object lhs, final long rhs) {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doCompare(final Object lhs, final float rhs) {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doCompare(final Object lhs, final double rhs) {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doCompare(final Object lhs, final BigInteger rhs) {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doCompare(final Object lhs, final BigDecimal rhs) {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseCompare(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseCompare(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseCompare(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseCompare(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseCompare(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseCompare(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseCompare(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseCompare(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseCompare(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doEquals(final float lhs, final byte rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final float lhs, final char rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final float lhs, final short rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final float lhs, final int rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final float lhs, final long rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final float lhs, final float rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final float lhs, final double rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final float lhs, final BigInteger rhs) {
    return (lhs == rhs.floatValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final float lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final Object lhs, final byte rhs) {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doEquals(final Object lhs, final char rhs) {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doEquals(final Object lhs, final short rhs) {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doEquals(final Object lhs, final int rhs) {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doEquals(final Object lhs, final long rhs) {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doEquals(final Object lhs, final float rhs) {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doEquals(final Object lhs, final double rhs) {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doEquals(final Object lhs, final BigInteger rhs) {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doEquals(final Object lhs, final BigDecimal rhs) {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doNotEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doNotEquals(final float lhs, final byte rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final float lhs, final char rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final float lhs, final short rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final float lhs, final int rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final float lhs, final long rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final float lhs, final float rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final float lhs, final double rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final float lhs, final BigInteger rhs) {
    return (lhs != rhs.floatValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final float lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final Object lhs, final byte rhs) {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final char rhs) {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final short rhs) {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final int rhs) {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final long rhs) {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final float rhs) {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final double rhs) {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final BigInteger rhs) {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final BigDecimal rhs) {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseNotEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseNotEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseNotEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseNotEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseNotEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseNotEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseNotEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseNotEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseNotEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doLessThan(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThan(final float lhs, final byte rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final float lhs, final char rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final float lhs, final short rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final float lhs, final int rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final float lhs, final long rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final float lhs, final float rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final float lhs, final double rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final float lhs, final BigInteger rhs) {
    return (lhs < rhs.floatValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final float lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final Object lhs, final byte rhs) {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final char rhs) {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final short rhs) {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final int rhs) {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final long rhs) {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final float rhs) {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final double rhs) {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final BigInteger rhs) {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final BigDecimal rhs) {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseLessThan(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseLessThan(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseLessThan(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseLessThan(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseLessThan(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseLessThan(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseLessThan(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseLessThan(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseLessThan(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doLessThanOrEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThanOrEquals(final float lhs, final byte rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final float lhs, final char rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final float lhs, final short rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final float lhs, final int rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final float lhs, final long rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final float lhs, final float rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final float lhs, final double rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final float lhs, final BigInteger rhs) {
    return (lhs <= rhs.floatValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final float lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final Object lhs, final byte rhs) {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final char rhs) {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final short rhs) {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final int rhs) {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final long rhs) {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final float rhs) {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final double rhs) {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final BigInteger rhs) {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseLessThanOrEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseLessThanOrEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseLessThanOrEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseLessThanOrEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseLessThanOrEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseLessThanOrEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseLessThanOrEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseLessThanOrEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseLessThanOrEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doGreaterThan(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThan(final float lhs, final byte rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final float lhs, final char rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final float lhs, final short rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final float lhs, final int rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final float lhs, final long rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final float lhs, final float rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final float lhs, final double rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final float lhs, final BigInteger rhs) {
    return (lhs > rhs.floatValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final float lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final Object lhs, final byte rhs) {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final char rhs) {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final short rhs) {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final int rhs) {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final long rhs) {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final float rhs) {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final double rhs) {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final BigInteger rhs) {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final BigDecimal rhs) {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseGreaterThan(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseGreaterThan(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseGreaterThan(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseGreaterThan(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseGreaterThan(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseGreaterThan(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseGreaterThan(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseGreaterThan(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseGreaterThan(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doGreaterThanOrEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final float lhs, final byte rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final float lhs, final char rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final float lhs, final short rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final float lhs, final int rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final float lhs, final long rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final float lhs, final float rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final float lhs, final double rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final float lhs, final BigInteger rhs) {
    return (lhs >= rhs.floatValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final float lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final Object lhs, final byte rhs) {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final char rhs) {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final short rhs) {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final int rhs) {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final long rhs) {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final float rhs) {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final double rhs) {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  public Object doReverseGreaterThanOrEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseGreaterThanOrEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseGreaterThanOrEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseGreaterThanOrEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseGreaterThanOrEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseGreaterThanOrEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseGreaterThanOrEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseGreaterThanOrEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  public Object doReverseGreaterThanOrEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

}
