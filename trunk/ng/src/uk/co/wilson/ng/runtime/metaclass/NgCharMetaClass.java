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
import ng.runtime.NgChar;
import ng.runtime.NgDouble;
import ng.runtime.NgFloat;
import ng.runtime.NgInt;
import ng.runtime.NgLong;

public class NgCharMetaClass extends RuntimeMetaClassImpl {
  public NgCharMetaClass() {
    super(char.class, new NgCharInternalMetaClass(char.class));
  }
}

class NgCharInternalMetaClass extends InternalMetaClassImpl {
  public NgCharInternalMetaClass(final Class theClass) {
    super(theClass);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl#doGetParamObject(java.lang.Object, java.lang.Class)
   */
  public Object doGetParamObject(final Object instance, final Class theClass) {
    return new Character(((NgChar)instance).getCharValue());
  }

  public Object doComplement(final int instance) {
    return new NgInt(~instance);
  }
  
  public Object doComplement(final Object instance) {
    return new NgInt(~((NgChar)instance).getCharValue());
  }

  public Object doUnaryPlus(final int instance) {
    return new NgInt(instance);
  }
  
  public Object doUnaryPlus(final Object instance) {
    return new NgInt(((NgChar)instance).getCharValue());
  }
  
  public Object doUnaryMinus(final int instance) {
    return new NgInt(-instance);
  }
  
  public Object doUnaryMinus(final Object instance) {
    return new NgInt(-((NgChar)instance).getCharValue());
  }

  public Object doPostfixIncrement(final int instance) {
    return new NgInt(instance + 1);
  }

  public Object doPostfixIncrement(final Object instance) {
    return new NgInt(((NgChar)instance).getCharValue() + 1);
  }

  public Object doPostfixDecrement(final int instance) {
    return new NgInt(instance - 1);
  }

  public Object doPostfixDecrement(final Object instance) {
    return new NgInt(((NgChar)instance).getCharValue() - 1);
  }

  public Object doPrefixIncrement(final int instance) {
    return new NgInt(instance + 1);
  }

  public Object doPrefixIncrement(final Object instance) {
    return new NgInt(((NgChar)instance).getCharValue() + 1);
  }

  public Object doPrefixDecrement(final int instance) {
    return new NgInt(instance - 1);
  }

  public Object doPrefixDecrement(final Object instance) {
    return new NgInt(((NgChar)instance).getCharValue() - 1);
  }

  public Object doAdd(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAdd(final char lhs, final byte rhs) {
    return new NgInt(lhs + rhs);
  }

  public Object doAdd(final char lhs, final char rhs) {
    return new NgInt(lhs + rhs);
  }

  public Object doAdd(final char lhs, final short rhs) {
    return new NgInt(lhs + rhs);
  }

  public Object doAdd(final char lhs, final int rhs) {
    return new NgInt(lhs + rhs);
  }

  public Object doAdd(final char lhs, final long rhs) {
    return new NgLong(lhs + rhs);
  }

  public Object doAdd(final char lhs, final float rhs) {
    return new NgFloat(lhs + rhs);
  }

  public Object doAdd(final char lhs, final double rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAdd(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).add(rhs);
  }

  public Object doAdd(final char lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).add(rhs);
  }

  public Object doAdd(final Object lhs, final byte rhs) {
    return doAdd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAdd(final Object lhs, final char rhs) {
    return doAdd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAdd(final Object lhs, final short rhs) {
    return doAdd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAdd(final Object lhs, final int rhs) {
    return doAdd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAdd(final Object lhs, final long rhs) {
    return doAdd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAdd(final Object lhs, final float rhs) {
    return doAdd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAdd(final Object lhs, final double rhs) {
    return doAdd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAdd(final Object lhs, final BigInteger rhs) {
    return doAdd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAdd(final Object lhs, final BigDecimal rhs) {
    return doAdd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseAdd(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAdd(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAdd(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAdd(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAdd(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAdd(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAdd(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAdd(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAdd(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAdd(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAdd(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAdd(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAdd(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAdd(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAdd(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAdd(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAdd(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAdd(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doAddEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAddEquals(final char lhs, final byte rhs) {
    return new NgInt(lhs + rhs);
  }

  public Object doAddEquals(final char lhs, final char rhs) {
    return new NgInt(lhs + rhs);
  }

  public Object doAddEquals(final char lhs, final short rhs) {
    return new NgInt(lhs + rhs);
  }

  public Object doAddEquals(final char lhs, final int rhs) {
    return new NgInt(lhs + rhs);
  }

  public Object doAddEquals(final char lhs, final long rhs) {
    return new NgLong(lhs + rhs);
  }

  public Object doAddEquals(final char lhs, final float rhs) {
    return new NgFloat(lhs + rhs);
  }

  public Object doAddEquals(final char lhs, final double rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAddEquals(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).add(rhs);
  }

  public Object doAddEquals(final char lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).add(rhs);
  }

  public Object doAddEquals(final Object lhs, final byte rhs) {
    return doAddEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final char rhs) {
    return doAddEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final short rhs) {
    return doAddEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final int rhs) {
    return doAddEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final long rhs) {
    return doAddEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final float rhs) {
    return doAddEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final double rhs) {
    return doAddEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final BigInteger rhs) {
    return doAddEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final BigDecimal rhs) {
    return doAddEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseAddEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAddEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAddEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAddEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAddEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAddEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAddEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAddEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAddEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAddEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAddEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAddEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAddEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAddEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAddEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAddEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAddEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAddEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doSubtract(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtract(final char lhs, final byte rhs) {
    return new NgInt(lhs - rhs);
  }

  public Object doSubtract(final char lhs, final char rhs) {
    return new NgInt(lhs - rhs);
  }

  public Object doSubtract(final char lhs, final short rhs) {
    return new NgInt(lhs - rhs);
  }

  public Object doSubtract(final char lhs, final int rhs) {
    return new NgInt(lhs - rhs);
  }

  public Object doSubtract(final char lhs, final long rhs) {
    return new NgLong(lhs - rhs);
  }

  public Object doSubtract(final char lhs, final float rhs) {
    return new NgFloat(lhs - rhs);
  }

  public Object doSubtract(final char lhs, final double rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtract(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).subtract(rhs);
  }

  public Object doSubtract(final char lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).subtract(rhs);
  }

  public Object doSubtract(final Object lhs, final byte rhs) {
    return doSubtract(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final char rhs) {
    return doSubtract(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final short rhs) {
    return doSubtract(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final int rhs) {
    return doSubtract(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final long rhs) {
    return doSubtract(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final float rhs) {
    return doSubtract(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final double rhs) {
    return doSubtract(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final BigInteger rhs) {
    return doSubtract(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final BigDecimal rhs) {
    return doSubtract(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseSubtract(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtract(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseSubtract(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtract(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseSubtract(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtract(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseSubtract(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtract(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseSubtract(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtract(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseSubtract(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtract(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseSubtract(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtract(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseSubtract(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtract(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseSubtract(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtract(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doSubtractEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtractEquals(final char lhs, final byte rhs) {
    return new NgInt(lhs - rhs);
  }

  public Object doSubtractEquals(final char lhs, final char rhs) {
    return new NgInt(lhs - rhs);
  }

  public Object doSubtractEquals(final char lhs, final short rhs) {
    return new NgInt(lhs - rhs);
  }

  public Object doSubtractEquals(final char lhs, final int rhs) {
    return new NgInt(lhs - rhs);
  }

  public Object doSubtractEquals(final char lhs, final long rhs) {
    return new NgLong(lhs - rhs);
  }

  public Object doSubtractEquals(final char lhs, final float rhs) {
    return new NgFloat(lhs - rhs);
  }

  public Object doSubtractEquals(final char lhs, final double rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtractEquals(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).subtract(rhs);
  }

  public Object doSubtractEquals(final char lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).subtract(rhs);
  }

  public Object doSubtractEquals(final Object lhs, final byte rhs) {
    return doSubtractEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final char rhs) {
    return doSubtractEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final short rhs) {
    return doSubtractEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final int rhs) {
    return doSubtractEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final long rhs) {
    return doSubtractEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final float rhs) {
    return doSubtractEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final double rhs) {
    return doSubtractEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final BigInteger rhs) {
    return doSubtractEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final BigDecimal rhs) {
    return doSubtractEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseSubtractEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtractEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseSubtractEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtractEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseSubtractEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtractEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseSubtractEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtractEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseSubtractEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtractEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseSubtractEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtractEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseSubtractEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtractEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseSubtractEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtractEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseSubtractEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtractEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doMultiply(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiply(final char lhs, final byte rhs) {
    return new NgInt(lhs * rhs);
  }

  public Object doMultiply(final char lhs, final char rhs) {
    return new NgInt(lhs * rhs);
  }

  public Object doMultiply(final char lhs, final short rhs) {
    return new NgInt(lhs * rhs);
  }

  public Object doMultiply(final char lhs, final int rhs) {
    return new NgInt(lhs * rhs);
  }

  public Object doMultiply(final char lhs, final long rhs) {
    return new NgLong(lhs * rhs);
  }

  public Object doMultiply(final char lhs, final float rhs) {
    return new NgFloat(lhs * rhs);
  }

  public Object doMultiply(final char lhs, final double rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiply(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).multiply(rhs);
  }

  public Object doMultiply(final char lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).multiply(rhs);
  }

  public Object doMultiply(final Object lhs, final byte rhs) {
    return doMultiply(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final char rhs) {
    return doMultiply(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final short rhs) {
    return doMultiply(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final int rhs) {
    return doMultiply(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final long rhs) {
    return doMultiply(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final float rhs) {
    return doMultiply(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final double rhs) {
    return doMultiply(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final BigInteger rhs) {
    return doMultiply(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final BigDecimal rhs) {
    return doMultiply(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseMultiply(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiply(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseMultiply(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiply(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseMultiply(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiply(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseMultiply(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiply(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseMultiply(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiply(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseMultiply(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiply(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseMultiply(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiply(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseMultiply(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiply(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseMultiply(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiply(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doMultiplyEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiplyEquals(final char lhs, final byte rhs) {
    return new NgInt(lhs * rhs);
  }

  public Object doMultiplyEquals(final char lhs, final char rhs) {
    return new NgInt(lhs * rhs);
  }

  public Object doMultiplyEquals(final char lhs, final short rhs) {
    return new NgInt(lhs * rhs);
  }

  public Object doMultiplyEquals(final char lhs, final int rhs) {
    return new NgInt(lhs * rhs);
  }

  public Object doMultiplyEquals(final char lhs, final long rhs) {
    return new NgLong(lhs * rhs);
  }

  public Object doMultiplyEquals(final char lhs, final float rhs) {
    return new NgFloat(lhs * rhs);
  }

  public Object doMultiplyEquals(final char lhs, final double rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiplyEquals(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).multiply(rhs);
  }

  public Object doMultiplyEquals(final char lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).multiply(rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final byte rhs) {
    return doMultiplyEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final char rhs) {
    return doMultiplyEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final short rhs) {
    return doMultiplyEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final int rhs) {
    return doMultiplyEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final long rhs) {
    return doMultiplyEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final float rhs) {
    return doMultiplyEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final double rhs) {
    return doMultiplyEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final BigInteger rhs) {
    return doMultiplyEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final BigDecimal rhs) {
    return doMultiplyEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseMultiplyEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiplyEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseMultiplyEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiplyEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseMultiplyEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiplyEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseMultiplyEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiplyEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseMultiplyEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiplyEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseMultiplyEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiplyEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseMultiplyEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiplyEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseMultiplyEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiplyEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseMultiplyEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiplyEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doDivide(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivide(final char lhs, final byte rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doDivide(final char lhs, final char rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doDivide(final char lhs, final short rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doDivide(final char lhs, final int rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doDivide(final char lhs, final long rhs) {
    return new NgLong(lhs / rhs);
  }

  public Object doDivide(final char lhs, final float rhs) {
    return new NgFloat(lhs / rhs);
  }

  public Object doDivide(final char lhs, final double rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivide(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  public Object doDivide(final char lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divide(rhs);
  }

  public Object doDivide(final Object lhs, final byte rhs) {
    return doDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivide(final Object lhs, final char rhs) {
    return doDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivide(final Object lhs, final short rhs) {
    return doDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivide(final Object lhs, final int rhs) {
    return doDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivide(final Object lhs, final long rhs) {
    return doDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivide(final Object lhs, final float rhs) {
    return doDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivide(final Object lhs, final double rhs) {
    return doDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivide(final Object lhs, final BigInteger rhs) {
    return doDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivide(final Object lhs, final BigDecimal rhs) {
    return doDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseDivide(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseDivide(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseDivide(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseDivide(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseDivide(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseDivide(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseDivide(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseDivide(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseDivide(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doDivideEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivideEquals(final char lhs, final byte rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doDivideEquals(final char lhs, final char rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doDivideEquals(final char lhs, final short rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doDivideEquals(final char lhs, final int rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doDivideEquals(final char lhs, final long rhs) {
    return new NgLong(lhs / rhs);
  }

  public Object doDivideEquals(final char lhs, final float rhs) {
    return new NgFloat(lhs / rhs);
  }

  public Object doDivideEquals(final char lhs, final double rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivideEquals(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  public Object doDivideEquals(final char lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divide(rhs);
  }

  public Object doDivideEquals(final Object lhs, final byte rhs) {
    return doDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final char rhs) {
    return doDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final short rhs) {
    return doDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final int rhs) {
    return doDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final long rhs) {
    return doDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final float rhs) {
    return doDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final double rhs) {
    return doDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final BigInteger rhs) {
    return doDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final BigDecimal rhs) {
    return doDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseDivideEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivideEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseDivideEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivideEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseDivideEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivideEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseDivideEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivideEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseDivideEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivideEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseDivideEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivideEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseDivideEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivideEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseDivideEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivideEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseDivideEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivideEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doRemainder(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doRemainder(final char lhs, final byte rhs) {
    return new NgInt(lhs % rhs);
  }

  public Object doRemainder(final char lhs, final char rhs) {
    return new NgInt(lhs % rhs);
  }

  public Object doRemainder(final char lhs, final short rhs) {
    return new NgInt(lhs % rhs);
  }

  public Object doRemainder(final char lhs, final int rhs) {
    return new NgInt(lhs % rhs);
  }

  public Object doRemainder(final char lhs, final long rhs) {
    return new NgLong(lhs % rhs);
  }

  public Object doRemainder(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).mod(rhs);
  }

  public Object doRemainder(final Object lhs, final byte rhs) {
    return doRemainder(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doRemainder(final Object lhs, final char rhs) {
    return doRemainder(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doRemainder(final Object lhs, final short rhs) {
    return doRemainder(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doRemainder(final Object lhs, final int rhs) {
    return doRemainder(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doRemainder(final Object lhs, final long rhs) {
    return doRemainder(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doRemainder(final Object lhs, final BigInteger rhs) {
    return doRemainder(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseRemainder(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doRemainder(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseRemainder(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doRemainder(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseRemainder(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doRemainder(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseRemainder(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doRemainder(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseRemainder(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doRemainder(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseRemainder(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doRemainder(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doRemainderEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doRemainderEquals(final char lhs, final byte rhs) {
    return new NgInt(lhs % rhs);
  }

  public Object doRemainderEquals(final char lhs, final char rhs) {
    return new NgInt(lhs % rhs);
  }

  public Object doRemainderEquals(final char lhs, final short rhs) {
    return new NgInt(lhs % rhs);
  }

  public Object doRemainderEquals(final char lhs, final int rhs) {
    return new NgInt(lhs % rhs);
  }

  public Object doRemainderEquals(final char lhs, final long rhs) {
    return new NgLong(lhs % rhs);
  }

  public Object doRemainderEquals(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).mod(rhs);
  }

  public Object doRemainderEquals(final Object lhs, final byte rhs) {
    return doRemainderEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final char rhs) {
    return doRemainderEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final short rhs) {
    return doRemainderEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final int rhs) {
    return doRemainderEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final long rhs) {
    return doRemainderEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final BigInteger rhs) {
    return doRemainderEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseRemainderEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doRemainderEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseRemainderEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doRemainderEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseRemainderEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doRemainderEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseRemainderEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doRemainderEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseRemainderEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doRemainderEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseRemainderEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doRemainderEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doIntegerDivide(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivide(final char lhs, final byte rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doIntegerDivide(final char lhs, final char rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doIntegerDivide(final char lhs, final short rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doIntegerDivide(final char lhs, final int rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doIntegerDivide(final char lhs, final long rhs) {
    return new NgLong(lhs / rhs);
  }

  public Object doIntegerDivide(final char lhs, final float rhs) {
    return new NgFloat((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final char lhs, final double rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  public Object doIntegerDivide(final char lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(rhs);
  }

  public Object doIntegerDivide(final Object lhs, final byte rhs) {
    return doIntegerDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final char rhs) {
    return doIntegerDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final short rhs) {
    return doIntegerDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final int rhs) {
    return doIntegerDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final long rhs) {
    return doIntegerDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final float rhs) {
    return doIntegerDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final double rhs) {
    return doIntegerDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final BigInteger rhs) {
    return doIntegerDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final BigDecimal rhs) {
    return doIntegerDivide(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseIntegerDivide(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseIntegerDivide(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseIntegerDivide(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseIntegerDivide(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseIntegerDivide(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseIntegerDivide(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseIntegerDivide(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseIntegerDivide(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseIntegerDivide(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doIntegerDivideEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivideEquals(final char lhs, final byte rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doIntegerDivideEquals(final char lhs, final char rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doIntegerDivideEquals(final char lhs, final short rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doIntegerDivideEquals(final char lhs, final int rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doIntegerDivideEquals(final char lhs, final long rhs) {
    return new NgLong(lhs / rhs);
  }

  public Object doIntegerDivideEquals(final char lhs, final float rhs) {
    return new NgFloat((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final char lhs, final double rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  public Object doIntegerDivideEquals(final char lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final byte rhs) {
    return doIntegerDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final char rhs) {
    return doIntegerDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final short rhs) {
    return doIntegerDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final int rhs) {
    return doIntegerDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final long rhs) {
    return doIntegerDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final float rhs) {
    return doIntegerDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final double rhs) {
    return doIntegerDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseIntegerDivideEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivideEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseIntegerDivideEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivideEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseIntegerDivideEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivideEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseIntegerDivideEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivideEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseIntegerDivideEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivideEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseIntegerDivideEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseIntegerDivideEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseIntegerDivideEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivideEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseIntegerDivideEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivideEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doAnd(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAnd(final char lhs, final byte rhs) {
    return new NgInt(lhs & rhs);
  }

  public Object doAnd(final char lhs, final char rhs) {
    return new NgInt(lhs & rhs);
  }

  public Object doAnd(final char lhs, final short rhs) {
    return new NgInt(lhs & rhs);
  }

  public Object doAnd(final char lhs, final int rhs) {
    return new NgInt(lhs & rhs);
  }

  public Object doAnd(final char lhs, final long rhs) {
    return new NgLong(lhs & rhs);
  }

  public Object doAnd(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).and(rhs);
  }

  public Object doAnd(final Object lhs, final byte rhs) {
    return doAnd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAnd(final Object lhs, final char rhs) {
    return doAnd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAnd(final Object lhs, final short rhs) {
    return doAnd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAnd(final Object lhs, final int rhs) {
    return doAnd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAnd(final Object lhs, final long rhs) {
    return doAnd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAnd(final Object lhs, final BigInteger rhs) {
    return doAnd(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseAnd(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAnd(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAnd(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAnd(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAnd(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAnd(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAnd(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAnd(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAnd(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAnd(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAnd(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAnd(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doAndEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAndEquals(final char lhs, final byte rhs) {
    return new NgInt(lhs & rhs);
  }

  public Object doAndEquals(final char lhs, final char rhs) {
    return new NgInt(lhs & rhs);
  }

  public Object doAndEquals(final char lhs, final short rhs) {
    return new NgInt(lhs & rhs);
  }

  public Object doAndEquals(final char lhs, final int rhs) {
    return new NgInt(lhs & rhs);
  }

  public Object doAndEquals(final char lhs, final long rhs) {
    return new NgLong(lhs & rhs);
  }

  public Object doAndEquals(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).and(rhs);
  }

  public Object doAndEquals(final Object lhs, final byte rhs) {
    return doAndEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAndEquals(final Object lhs, final char rhs) {
    return doAndEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAndEquals(final Object lhs, final short rhs) {
    return doAndEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAndEquals(final Object lhs, final int rhs) {
    return doAndEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAndEquals(final Object lhs, final long rhs) {
    return doAndEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doAndEquals(final Object lhs, final BigInteger rhs) {
    return doAndEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseAndEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAndEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAndEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAndEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAndEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAndEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAndEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAndEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAndEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAndEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseAndEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAndEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doOr(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doOr(final char lhs, final byte rhs) {
    return new NgInt(lhs | rhs);
  }

  public Object doOr(final char lhs, final char rhs) {
    return new NgInt(lhs | rhs);
  }

  public Object doOr(final char lhs, final short rhs) {
    return new NgInt(lhs | rhs);
  }

  public Object doOr(final char lhs, final int rhs) {
    return new NgInt(lhs | rhs);
  }

  public Object doOr(final char lhs, final long rhs) {
    return new NgLong(lhs | rhs);
  }

  public Object doOr(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).or(rhs);
  }

  public Object doOr(final Object lhs, final byte rhs) {
    return doOr(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doOr(final Object lhs, final char rhs) {
    return doOr(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doOr(final Object lhs, final short rhs) {
    return doOr(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doOr(final Object lhs, final int rhs) {
    return doOr(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doOr(final Object lhs, final long rhs) {
    return doOr(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doOr(final Object lhs, final BigInteger rhs) {
    return doOr(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseOr(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doOr(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseOr(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doOr(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseOr(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doOr(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseOr(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doOr(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseOr(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doOr(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseOr(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doOr(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doOrEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doOrEquals(final char lhs, final byte rhs) {
    return new NgInt(lhs | rhs);
  }

  public Object doOrEquals(final char lhs, final char rhs) {
    return new NgInt(lhs | rhs);
  }

  public Object doOrEquals(final char lhs, final short rhs) {
    return new NgInt(lhs | rhs);
  }

  public Object doOrEquals(final char lhs, final int rhs) {
    return new NgInt(lhs | rhs);
  }

  public Object doOrEquals(final char lhs, final long rhs) {
    return new NgLong(lhs | rhs);
  }

  public Object doOrEquals(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).or(rhs);
  }

  public Object doOrEquals(final Object lhs, final byte rhs) {
    return doOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doOrEquals(final Object lhs, final char rhs) {
    return doOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doOrEquals(final Object lhs, final short rhs) {
    return doOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doOrEquals(final Object lhs, final int rhs) {
    return doOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doOrEquals(final Object lhs, final long rhs) {
    return doOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doOrEquals(final Object lhs, final BigInteger rhs) {
    return doOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseOrEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseOrEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseOrEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseOrEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseOrEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseOrEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doXor(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doXor(final char lhs, final byte rhs) {
    return new NgInt(lhs ^ rhs);
  }

  public Object doXor(final char lhs, final char rhs) {
    return new NgInt(lhs ^ rhs);
  }

  public Object doXor(final char lhs, final short rhs) {
    return new NgInt(lhs ^ rhs);
  }

  public Object doXor(final char lhs, final int rhs) {
    return new NgInt(lhs ^ rhs);
  }

  public Object doXor(final char lhs, final long rhs) {
    return new NgLong(lhs ^ rhs);
  }

  public Object doXor(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).xor(rhs);
  }

  public Object doXor(final Object lhs, final byte rhs) {
    return doXor(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doXor(final Object lhs, final char rhs) {
    return doXor(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doXor(final Object lhs, final short rhs) {
    return doXor(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doXor(final Object lhs, final int rhs) {
    return doXor(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doXor(final Object lhs, final long rhs) {
    return doXor(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doXor(final Object lhs, final BigInteger rhs) {
    return doXor(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseXor(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doXor(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseXor(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doXor(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseXor(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doXor(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseXor(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doXor(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseXor(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doXor(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseXor(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doXor(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doXorEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doXorEquals(final char lhs, final byte rhs) {
    return new NgInt(lhs ^ rhs);
  }

  public Object doXorEquals(final char lhs, final char rhs) {
    return new NgInt(lhs ^ rhs);
  }

  public Object doXorEquals(final char lhs, final short rhs) {
    return new NgInt(lhs ^ rhs);
  }

  public Object doXorEquals(final char lhs, final int rhs) {
    return new NgInt(lhs ^ rhs);
  }

  public Object doXorEquals(final char lhs, final long rhs) {
    return new NgLong(lhs ^ rhs);
  }

  public Object doXorEquals(final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).xor(rhs);
  }

  public Object doXorEquals(final Object lhs, final byte rhs) {
    return doXorEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doXorEquals(final Object lhs, final char rhs) {
    return doXorEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doXorEquals(final Object lhs, final short rhs) {
    return doXorEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doXorEquals(final Object lhs, final int rhs) {
    return doXorEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doXorEquals(final Object lhs, final long rhs) {
    return doXorEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doXorEquals(final Object lhs, final BigInteger rhs) {
    return doXorEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseXorEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doXorEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseXorEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doXorEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseXorEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doXorEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseXorEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doXorEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseXorEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doXorEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseXorEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doXorEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doLeftShift(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLeftShift(final char lhs, final byte rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShift(final char lhs, final char rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShift(final char lhs, final short rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShift(final char lhs, final int rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShift(final char lhs, final long rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShift(final char lhs, final BigInteger rhs) {
    return new NgInt(lhs << rhs.intValue());
  }

  public Object doLeftShift(final Object lhs, final byte rhs) {
    return doLeftShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLeftShift(final Object lhs, final char rhs) {
    return doLeftShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLeftShift(final Object lhs, final short rhs) {
    return doLeftShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLeftShift(final Object lhs, final int rhs) {
    return doLeftShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLeftShift(final Object lhs, final long rhs) {
    return doLeftShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLeftShift(final Object lhs, final BigInteger rhs) {
    return doLeftShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseLeftShift(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLeftShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLeftShift(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLeftShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLeftShift(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLeftShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLeftShift(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLeftShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLeftShift(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLeftShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLeftShift(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLeftShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doLeftShiftEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLeftShiftEquals(final char lhs, final byte rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShiftEquals(final char lhs, final char rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShiftEquals(final char lhs, final short rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShiftEquals(final char lhs, final int rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShiftEquals(final char lhs, final long rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShiftEquals(final char lhs, final BigInteger rhs) {
    return new NgInt(lhs << rhs.intValue());
  }

  public Object doLeftShiftEquals(final Object lhs, final byte rhs) {
    return doLeftShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final char rhs) {
    return doLeftShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final short rhs) {
    return doLeftShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final int rhs) {
    return doLeftShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final long rhs) {
    return doLeftShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final BigInteger rhs) {
    return doLeftShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseLeftShiftEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLeftShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLeftShiftEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLeftShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLeftShiftEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLeftShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLeftShiftEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLeftShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLeftShiftEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLeftShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLeftShiftEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLeftShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doArithmeticRightShift(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doArithmeticRightShift(final char lhs, final byte rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShift(final char lhs, final char rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShift(final char lhs, final short rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShift(final char lhs, final int rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShift(final char lhs, final long rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShift(final char lhs, final BigInteger rhs) {
    return new NgInt(lhs >> rhs.intValue());
  }

  public Object doArithmeticRightShift(final Object lhs, final byte rhs) {
    return doArithmeticRightShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final char rhs) {
    return doArithmeticRightShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final short rhs) {
    return doArithmeticRightShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final int rhs) {
    return doArithmeticRightShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final long rhs) {
    return doArithmeticRightShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final BigInteger rhs) {
    return doArithmeticRightShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseArithmeticRightShift(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doArithmeticRightShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseArithmeticRightShift(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doArithmeticRightShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseArithmeticRightShift(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doArithmeticRightShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseArithmeticRightShift(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doArithmeticRightShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseArithmeticRightShift(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doArithmeticRightShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseArithmeticRightShift(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doArithmeticRightShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final byte rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final char rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final short rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final int rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final long rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShiftEquals(final char lhs, final BigInteger rhs) {
    return new NgInt(lhs >> rhs.intValue());
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final byte rhs) {
    return doArithmeticRightShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final char rhs) {
    return doArithmeticRightShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final short rhs) {
    return doArithmeticRightShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final int rhs) {
    return doArithmeticRightShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final long rhs) {
    return doArithmeticRightShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final BigInteger rhs) {
    return doArithmeticRightShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseArithmeticRightShiftEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doArithmeticRightShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseArithmeticRightShiftEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doArithmeticRightShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseArithmeticRightShiftEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doArithmeticRightShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseArithmeticRightShiftEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doArithmeticRightShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseArithmeticRightShiftEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doArithmeticRightShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseArithmeticRightShiftEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doArithmeticRightShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doLogicalRightShift(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLogicalRightShift(final char lhs, final byte rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShift(final char lhs, final char rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShift(final char lhs, final short rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShift(final char lhs, final int rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShift(final char lhs, final long rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShift(final char lhs, final BigInteger rhs) {
    return new NgInt(lhs >>> rhs.intValue());
  }

  public Object doLogicalRightShift(final Object lhs, final byte rhs) {
    return doLogicalRightShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final char rhs) {
    return doLogicalRightShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final short rhs) {
    return doLogicalRightShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final int rhs) {
    return doLogicalRightShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final long rhs) {
    return doLogicalRightShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final BigInteger rhs) {
    return doLogicalRightShift(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseLogicalRightShift(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLogicalRightShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLogicalRightShift(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLogicalRightShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLogicalRightShift(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLogicalRightShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLogicalRightShift(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLogicalRightShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLogicalRightShift(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLogicalRightShift(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final char lhs, final byte rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShiftEquals(final char lhs, final char rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShiftEquals(final char lhs, final short rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShiftEquals(final char lhs, final int rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShiftEquals(final char lhs, final long rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShiftEquals(final char lhs, final BigInteger rhs) {
    return new NgInt(lhs >>> rhs.intValue());
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final byte rhs) {
    return doLogicalRightShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final char rhs) {
    return doLogicalRightShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final short rhs) {
    return doLogicalRightShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final int rhs) {
    return doLogicalRightShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final long rhs) {
    return doLogicalRightShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final BigInteger rhs) {
    return doLogicalRightShiftEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseLogicalRightShiftEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLogicalRightShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLogicalRightShiftEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLogicalRightShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLogicalRightShiftEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLogicalRightShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLogicalRightShiftEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLogicalRightShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLogicalRightShiftEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLogicalRightShiftEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doCompare(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doCompare(final char lhs, final byte rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final char lhs, final char rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final char lhs, final short rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final char lhs, final int rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final char lhs, final long rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final char lhs, final float rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final char lhs, final double rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final char lhs, final BigInteger rhs) {
    return new NgInt(BigInteger.valueOf(lhs).compareTo(rhs));
  }

  public Object doCompare(final char lhs, final BigDecimal rhs) {
    return new NgInt(new BigDecimal(lhs).compareTo(rhs));
  }

  public Object doCompare(final Object lhs, final byte rhs) {
    return doCompare(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doCompare(final Object lhs, final char rhs) {
    return doCompare(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doCompare(final Object lhs, final short rhs) {
    return doCompare(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doCompare(final Object lhs, final int rhs) {
    return doCompare(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doCompare(final Object lhs, final long rhs) {
    return doCompare(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doCompare(final Object lhs, final float rhs) {
    return doCompare(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doCompare(final Object lhs, final double rhs) {
    return doCompare(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doCompare(final Object lhs, final BigInteger rhs) {
    return doCompare(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doCompare(final Object lhs, final BigDecimal rhs) {
    return doCompare(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseCompare(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doCompare(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseCompare(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doCompare(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseCompare(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doCompare(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseCompare(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doCompare(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseCompare(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doCompare(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseCompare(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doCompare(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseCompare(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doCompare(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseCompare(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doCompare(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseCompare(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doCompare(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doEquals(final char lhs, final byte rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final char lhs, final char rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final char lhs, final short rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final char lhs, final int rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final char lhs, final long rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final char lhs, final float rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final char lhs, final double rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final char lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final char lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final Object lhs, final byte rhs) {
    return doEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doEquals(final Object lhs, final char rhs) {
    return doEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doEquals(final Object lhs, final short rhs) {
    return doEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doEquals(final Object lhs, final int rhs) {
    return doEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doEquals(final Object lhs, final long rhs) {
    return doEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doEquals(final Object lhs, final float rhs) {
    return doEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doEquals(final Object lhs, final double rhs) {
    return doEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doEquals(final Object lhs, final BigInteger rhs) {
    return doEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doEquals(final Object lhs, final BigDecimal rhs) {
    return doEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doNotEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doNotEquals(final char lhs, final byte rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final char lhs, final char rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final char lhs, final short rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final char lhs, final int rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final char lhs, final long rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final char lhs, final float rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final char lhs, final double rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final char lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final char lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final Object lhs, final byte rhs) {
    return doNotEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final char rhs) {
    return doNotEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final short rhs) {
    return doNotEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final int rhs) {
    return doNotEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final long rhs) {
    return doNotEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final float rhs) {
    return doNotEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final double rhs) {
    return doNotEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final BigInteger rhs) {
    return doNotEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final BigDecimal rhs) {
    return doNotEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseNotEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doNotEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseNotEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doNotEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseNotEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doNotEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseNotEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doNotEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseNotEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doNotEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseNotEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doNotEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseNotEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doNotEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseNotEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doNotEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseNotEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doNotEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doLessThan(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThan(final char lhs, final byte rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final char lhs, final char rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final char lhs, final short rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final char lhs, final int rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final char lhs, final long rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final char lhs, final float rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final char lhs, final double rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final char lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final char lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final Object lhs, final byte rhs) {
    return doLessThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final char rhs) {
    return doLessThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final short rhs) {
    return doLessThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final int rhs) {
    return doLessThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final long rhs) {
    return doLessThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final float rhs) {
    return doLessThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final double rhs) {
    return doLessThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final BigInteger rhs) {
    return doLessThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final BigDecimal rhs) {
    return doLessThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseLessThan(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLessThan(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLessThan(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLessThan(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLessThan(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLessThan(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLessThan(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLessThan(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLessThan(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doLessThanOrEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThanOrEquals(final char lhs, final byte rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final char lhs, final char rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final char lhs, final short rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final char lhs, final int rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final char lhs, final long rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final char lhs, final float rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final char lhs, final double rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final char lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final char lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final Object lhs, final byte rhs) {
    return doLessThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final char rhs) {
    return doLessThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final short rhs) {
    return doLessThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final int rhs) {
    return doLessThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final long rhs) {
    return doLessThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final float rhs) {
    return doLessThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final double rhs) {
    return doLessThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final BigInteger rhs) {
    return doLessThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseLessThanOrEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLessThanOrEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLessThanOrEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLessThanOrEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLessThanOrEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLessThanOrEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLessThanOrEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLessThanOrEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseLessThanOrEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doGreaterThan(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThan(final char lhs, final byte rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final char lhs, final char rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final char lhs, final short rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final char lhs, final int rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final char lhs, final long rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final char lhs, final float rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final char lhs, final double rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final char lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final char lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final Object lhs, final byte rhs) {
    return doGreaterThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final char rhs) {
    return doGreaterThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final short rhs) {
    return doGreaterThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final int rhs) {
    return doGreaterThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final long rhs) {
    return doGreaterThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final float rhs) {
    return doGreaterThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final double rhs) {
    return doGreaterThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final BigInteger rhs) {
    return doGreaterThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final BigDecimal rhs) {
    return doGreaterThan(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseGreaterThan(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseGreaterThan(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseGreaterThan(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseGreaterThan(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseGreaterThan(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseGreaterThan(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseGreaterThan(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseGreaterThan(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseGreaterThan(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThan(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doGreaterThanOrEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final char lhs, final byte rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final char lhs, final char rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final char lhs, final short rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final char lhs, final int rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final char lhs, final long rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final char lhs, final float rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final char lhs, final double rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final char lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final char lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final Object lhs, final byte rhs) {
    return doGreaterThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final char rhs) {
    return doGreaterThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final short rhs) {
    return doGreaterThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final int rhs) {
    return doGreaterThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final long rhs) {
    return doGreaterThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final float rhs) {
    return doGreaterThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final double rhs) {
    return doGreaterThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(((NgChar)lhs).getCharValue(), rhs);
  }

  public Object doReverseGreaterThanOrEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseGreaterThanOrEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseGreaterThanOrEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseGreaterThanOrEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseGreaterThanOrEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseGreaterThanOrEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseGreaterThanOrEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseGreaterThanOrEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

  public Object doReverseGreaterThanOrEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThanOrEquals(lhs, ((NgChar)rhs).getCharValue());
  }

}
