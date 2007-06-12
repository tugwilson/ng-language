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

public class BigIntegerMetaClass extends RuntimeMetaClassImpl {
  public BigIntegerMetaClass() {
    super(BigInteger.class, new BigIntegerInternalMetaClass(BigInteger.class));
  }
}

class BigIntegerInternalMetaClass extends InternalMetaClassImpl {
  public BigIntegerInternalMetaClass(final Class theClass) {
    super(theClass);
  }
  
  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl#doCalculateConversionCost(java.lang.Class)
   */
  @Override
  public int doCalculateConversionCost(final Class parameterType) {
    if (parameterType == char.class) return 3;
    
    if (parameterType == byte.class) return 3;
    
    if (parameterType == short.class) return 3;
    
    if (parameterType == int.class) return 2;
    
    if (parameterType == long.class) return 1;
    
    if (parameterType == BigInteger.class) return 0;
    
    if (parameterType == float.class) return 3;
    
    if (parameterType == double.class) return 2;
    
    if (parameterType == BigDecimal.class) return 1;
    
    return super.doCalculateConversionCost(parameterType);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl#doGetParamObject(java.lang.Object, java.lang.Class)
   */
  @Override
 public Object doGetParamObject(final Object instance, final Class parameterType) {   
    if (parameterType == BigInteger.class) return instance;
    
    if (parameterType == char.class) return new Character((char)((BigInteger)instance).intValue());
    
    if (parameterType == byte.class) return new Byte(((BigInteger)instance).byteValue());
    
    if (parameterType == short.class) return new Short(((BigInteger)instance).shortValue());
    
    if (parameterType == int.class) return new Integer(((BigInteger)instance).intValue());
    
    if (parameterType == long.class) return new Long(((BigInteger)instance).longValue());
    
    if (parameterType == float.class) return new Float(((BigInteger)instance).floatValue());
    
    if (parameterType == double.class) return new Double(((BigInteger)instance).doubleValue());
    
    if (parameterType == BigDecimal.class) return BigDecimal.valueOf(((BigInteger)instance).longValue());
    
    return super.doGetParamObject(instance, parameterType);
  }

  @Override
  public Object doComplement(final BigInteger instance) {
    return instance.not();
  }
  
  @Override
  public Object doComplement(final Object instance) {
    return ((BigInteger)instance).not();
  }

  @Override
  public Object doUnaryPlus(final BigInteger instance) {
    return instance;
  }
  
  @Override
  public Object doUnaryPlus(final Object instance) {
    return instance;
  }
  
  @Override
  public Object doUnaryMinus(final BigInteger instance) {
    return instance.negate();
  }
  
  @Override
  public Object doUnaryMinus(final Object instance) {
    return ((BigInteger)instance).negate();
  }

  @Override
  public Object doPostfixIncrement(final BigInteger instance) {
    return instance.add(BigInteger.ONE);
  }

  @Override
  public Object doPostfixIncrement(final Object instance) {
    return ((BigInteger)instance).add(BigInteger.ONE);
  }

  @Override
  public Object doPostfixDecrement(final BigInteger instance) {
    return instance.subtract(BigInteger.ONE);
  }

  @Override
  public Object doPostfixDecrement(final Object instance) {
    return ((BigInteger)instance).subtract(BigInteger.ONE);
  }

  @Override
  public Object doPrefixIncrement(final BigInteger instance) {
    return instance.add(BigInteger.ONE);
  }

  @Override
  public Object doPrefixIncrement(final Object instance) {
    return ((BigInteger)instance).add(BigInteger.ONE);
  }

  @Override
  public Object doPrefixDecrement(final BigInteger instance) {
    return instance.subtract(BigInteger.ONE);
  }

  @Override
  public Object doPrefixDecrement(final Object instance) {
    return ((BigInteger)instance).subtract(BigInteger.ONE);
  }

  @Override
  public Object doAdd(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAdd(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAdd(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAdd(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAdd(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAdd(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAdd(final BigInteger lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs.floatValue() + rhs);
  }

  @Override
  public Object doAdd(final BigInteger lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs.doubleValue() + rhs);
  }

  @Override
  public Object doAdd(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.add(rhs);
  }

  @Override
  public Object doAdd(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).add(rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final byte rhs) throws Throwable {
    return doAdd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final char rhs) throws Throwable {
    return doAdd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final short rhs) throws Throwable {
    return doAdd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final int rhs) throws Throwable {
    return doAdd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final long rhs) throws Throwable {
    return doAdd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final float rhs) throws Throwable {
    return doAdd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final double rhs) throws Throwable {
    return doAdd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final BigInteger rhs) throws Throwable {
    return doAdd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doAdd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseAdd(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAdd(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAdd(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAdd(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAdd(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAdd(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAdd(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAdd(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAdd(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAdd(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAdd(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAdd(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAdd(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAdd(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAdd(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAdd(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAdd(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAdd(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doAddEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAddEquals(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAddEquals(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAddEquals(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAddEquals(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAddEquals(final BigInteger lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs.floatValue() + rhs);
  }

  @Override
  public Object doAddEquals(final BigInteger lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs.doubleValue() + rhs);
  }

  @Override
  public Object doAddEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.add(rhs);
  }

  @Override
  public Object doAddEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).add(rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final byte rhs) throws Throwable {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final char rhs) throws Throwable {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final short rhs) throws Throwable {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final int rhs) throws Throwable {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final long rhs) throws Throwable {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final float rhs) throws Throwable {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final double rhs) throws Throwable {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseAddEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAddEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAddEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAddEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAddEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAddEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAddEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAddEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAddEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doSubtract(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtract(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doSubtract(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doSubtract(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doSubtract(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doSubtract(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doSubtract(final BigInteger lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs.floatValue() - rhs);
  }

  @Override
  public Object doSubtract(final BigInteger lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs.doubleValue() - rhs);
  }

  @Override
  public Object doSubtract(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.subtract(rhs);
  }

  @Override
  public Object doSubtract(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).subtract(rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final byte rhs) throws Throwable {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final char rhs) throws Throwable {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final short rhs) throws Throwable {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final int rhs) throws Throwable {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final long rhs) throws Throwable {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final float rhs) throws Throwable {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final double rhs) throws Throwable {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final BigInteger rhs) throws Throwable {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseSubtract(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseSubtract(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseSubtract(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseSubtract(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseSubtract(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseSubtract(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseSubtract(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseSubtract(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseSubtract(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doSubtractEquals(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doSubtractEquals(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doSubtractEquals(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doSubtractEquals(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doSubtractEquals(final BigInteger lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs.floatValue() - rhs);
  }

  @Override
  public Object doSubtractEquals(final BigInteger lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs.doubleValue() - rhs);
  }

  @Override
  public Object doSubtractEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.subtract(rhs);
  }

  @Override
  public Object doSubtractEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).subtract(rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final byte rhs) throws Throwable {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final char rhs) throws Throwable {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final short rhs) throws Throwable {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final int rhs) throws Throwable {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final long rhs) throws Throwable {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final float rhs) throws Throwable {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final double rhs) throws Throwable {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseSubtractEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseSubtractEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseSubtractEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseSubtractEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseSubtractEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseSubtractEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseSubtractEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseSubtractEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseSubtractEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doMultiply(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiply(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doMultiply(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doMultiply(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doMultiply(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doMultiply(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doMultiply(final BigInteger lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs.floatValue() * rhs);
  }

  @Override
  public Object doMultiply(final BigInteger lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs.doubleValue() * rhs);
  }

  @Override
  public Object doMultiply(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.multiply(rhs);
  }

  @Override
  public Object doMultiply(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).multiply(rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final byte rhs) throws Throwable {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final char rhs) throws Throwable {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final short rhs) throws Throwable {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final int rhs) throws Throwable {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final long rhs) throws Throwable {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final float rhs) throws Throwable {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final double rhs) throws Throwable {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final BigInteger rhs) throws Throwable {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseMultiply(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseMultiply(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseMultiply(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseMultiply(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseMultiply(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseMultiply(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseMultiply(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseMultiply(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseMultiply(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doMultiplyEquals(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doMultiplyEquals(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doMultiplyEquals(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doMultiplyEquals(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doMultiplyEquals(final BigInteger lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs.floatValue() * rhs);
  }

  @Override
  public Object doMultiplyEquals(final BigInteger lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs.doubleValue() * rhs);
  }

  @Override
  public Object doMultiplyEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.multiply(rhs);
  }

  @Override
  public Object doMultiplyEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).multiply(rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final byte rhs) throws Throwable {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final char rhs) throws Throwable {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final short rhs) throws Throwable {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final int rhs) throws Throwable {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final long rhs) throws Throwable {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final float rhs) throws Throwable {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final double rhs) throws Throwable {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseMultiplyEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseMultiplyEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseMultiplyEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseMultiplyEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseMultiplyEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseMultiplyEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseMultiplyEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseMultiplyEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseMultiplyEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doDivide(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivide(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doDivide(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doDivide(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doDivide(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doDivide(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doDivide(final BigInteger lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs.floatValue() / rhs);
  }

  @Override
  public Object doDivide(final BigInteger lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs.doubleValue() / rhs);
  }

  @Override
  public Object doDivide(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.divide(rhs);
  }

  @Override
  public Object doDivide(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).divide(rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final byte rhs) throws Throwable {
    return doDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final char rhs) throws Throwable {
    return doDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final short rhs) throws Throwable {
    return doDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final int rhs) throws Throwable {
    return doDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final long rhs) throws Throwable {
    return doDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final float rhs) throws Throwable {
    return doDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final double rhs) throws Throwable {
    return doDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final BigInteger rhs) throws Throwable {
    return doDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseDivide(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseDivide(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseDivide(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseDivide(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseDivide(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseDivide(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseDivide(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseDivide(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseDivide(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doDivideEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doDivideEquals(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doDivideEquals(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doDivideEquals(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doDivideEquals(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doDivideEquals(final BigInteger lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs.floatValue() / rhs);
  }

  @Override
  public Object doDivideEquals(final BigInteger lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs.doubleValue() / rhs);
  }

  @Override
  public Object doDivideEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.divide(rhs);
  }

  @Override
  public Object doDivideEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).divide(rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final byte rhs) throws Throwable {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final char rhs) throws Throwable {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final short rhs) throws Throwable {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final int rhs) throws Throwable {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final long rhs) throws Throwable {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final float rhs) throws Throwable {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final double rhs) throws Throwable {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseDivideEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseDivideEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseDivideEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseDivideEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseDivideEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseDivideEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseDivideEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseDivideEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseDivideEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doRemainder(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doRemainder(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doRemainder(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doRemainder(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doRemainder(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doRemainder(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doRemainder(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.mod(rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final byte rhs) throws Throwable {
    return doRemainder(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final char rhs) throws Throwable {
    return doRemainder(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final short rhs) throws Throwable {
    return doRemainder(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final int rhs) throws Throwable {
    return doRemainder(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final long rhs) throws Throwable {
    return doRemainder(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final BigInteger rhs) throws Throwable {
    return doRemainder(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseRemainder(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doRemainder(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseRemainder(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doRemainder(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseRemainder(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doRemainder(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseRemainder(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doRemainder(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseRemainder(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doRemainder(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseRemainder(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doRemainder(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doRemainderEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doRemainderEquals(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doRemainderEquals(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doRemainderEquals(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doRemainderEquals(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doRemainderEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.mod(rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final byte rhs) throws Throwable {
    return doRemainderEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final char rhs) throws Throwable {
    return doRemainderEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final short rhs) throws Throwable {
    return doRemainderEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final int rhs) throws Throwable {
    return doRemainderEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final long rhs) throws Throwable {
    return doRemainderEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doRemainderEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseRemainderEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doRemainderEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseRemainderEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doRemainderEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseRemainderEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doRemainderEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseRemainderEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doRemainderEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseRemainderEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doRemainderEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseRemainderEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doRemainderEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivide(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doIntegerDivide(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doIntegerDivide(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doIntegerDivide(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doIntegerDivide(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doIntegerDivide(final BigInteger lhs, final float rhs) throws Throwable {
    return (new BigDecimal(lhs)).divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  @Override
  public Object doIntegerDivide(final BigInteger lhs, final double rhs) throws Throwable {
    return (new BigDecimal(lhs)).divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  @Override
  public Object doIntegerDivide(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.divide(rhs);
  }

  @Override
  public Object doIntegerDivide(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs)).divideToIntegralValue(rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final byte rhs) throws Throwable {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final char rhs) throws Throwable {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final short rhs) throws Throwable {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final int rhs) throws Throwable {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final long rhs) throws Throwable {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final float rhs) throws Throwable {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final double rhs) throws Throwable {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final BigInteger rhs) throws Throwable {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseIntegerDivide(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseIntegerDivide(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseIntegerDivide(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseIntegerDivide(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseIntegerDivide(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseIntegerDivide(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseIntegerDivide(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseIntegerDivide(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseIntegerDivide(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final BigInteger lhs, final float rhs) throws Throwable {
    return (new BigDecimal(lhs)).divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final BigInteger lhs, final double rhs) throws Throwable {
    return (new BigDecimal(lhs)).divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.divide(rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs)).divideToIntegralValue(rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final byte rhs) throws Throwable {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final char rhs) throws Throwable {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final short rhs) throws Throwable {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final int rhs) throws Throwable {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final long rhs) throws Throwable {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final float rhs) throws Throwable {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final double rhs) throws Throwable {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseIntegerDivideEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseIntegerDivideEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseIntegerDivideEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseIntegerDivideEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseIntegerDivideEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseIntegerDivideEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseIntegerDivideEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseIntegerDivideEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseIntegerDivideEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doAnd(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAnd(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAnd(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAnd(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAnd(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAnd(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAnd(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.and(rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final byte rhs) throws Throwable {
    return doAnd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final char rhs) throws Throwable {
    return doAnd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final short rhs) throws Throwable {
    return doAnd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final int rhs) throws Throwable {
    return doAnd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final long rhs) throws Throwable {
    return doAnd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final BigInteger rhs) throws Throwable {
    return doAnd(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseAnd(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAnd(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAnd(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAnd(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAnd(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAnd(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAnd(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAnd(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAnd(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAnd(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAnd(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAnd(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doAndEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAndEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAndEquals(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAndEquals(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAndEquals(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAndEquals(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doAndEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.and(rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final byte rhs) throws Throwable {
    return doAndEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final char rhs) throws Throwable {
    return doAndEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final short rhs) throws Throwable {
    return doAndEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final int rhs) throws Throwable {
    return doAndEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final long rhs) throws Throwable {
    return doAndEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doAndEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseAndEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAndEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAndEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAndEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAndEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAndEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAndEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAndEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAndEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAndEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseAndEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAndEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doOr(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doOr(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doOr(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doOr(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doOr(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doOr(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doOr(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.or(rhs);
  }

  @Override
  public Object doOr(final Object lhs, final byte rhs) throws Throwable {
    return doOr(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doOr(final Object lhs, final char rhs) throws Throwable {
    return doOr(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doOr(final Object lhs, final short rhs) throws Throwable {
    return doOr(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doOr(final Object lhs, final int rhs) throws Throwable {
    return doOr(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doOr(final Object lhs, final long rhs) throws Throwable {
    return doOr(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doOr(final Object lhs, final BigInteger rhs) throws Throwable {
    return doOr(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseOr(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doOr(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseOr(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doOr(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseOr(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doOr(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseOr(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doOr(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseOr(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doOr(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseOr(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doOr(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doOrEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doOrEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doOrEquals(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doOrEquals(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doOrEquals(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doOrEquals(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doOrEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.or(rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final byte rhs) throws Throwable {
    return doOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final char rhs) throws Throwable {
    return doOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final short rhs) throws Throwable {
    return doOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final int rhs) throws Throwable {
    return doOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final long rhs) throws Throwable {
    return doOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseOrEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseOrEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseOrEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseOrEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseOrEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doXor(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doXor(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doXor(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doXor(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doXor(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doXor(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doXor(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.xor(rhs);
  }

  @Override
  public Object doXor(final Object lhs, final byte rhs) throws Throwable {
    return doXor(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doXor(final Object lhs, final char rhs) throws Throwable {
    return doXor(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doXor(final Object lhs, final short rhs) throws Throwable {
    return doXor(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doXor(final Object lhs, final int rhs) throws Throwable {
    return doXor(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doXor(final Object lhs, final long rhs) throws Throwable {
    return doXor(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doXor(final Object lhs, final BigInteger rhs) throws Throwable {
    return doXor(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseXor(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doXor(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseXor(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doXor(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseXor(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doXor(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseXor(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doXor(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseXor(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doXor(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseXor(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doXor(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doXorEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doXorEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doXorEquals(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doXorEquals(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doXorEquals(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doXorEquals(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  @Override
  public Object doXorEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.xor(rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final byte rhs) throws Throwable {
    return doXorEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final char rhs) throws Throwable {
    return doXorEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final short rhs) throws Throwable {
    return doXorEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final int rhs) throws Throwable {
    return doXorEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final long rhs) throws Throwable {
    return doXorEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doXorEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseXorEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doXorEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseXorEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doXorEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseXorEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doXorEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseXorEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doXorEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseXorEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doXorEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseXorEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doXorEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doLeftShift(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLeftShift(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.shiftLeft(rhs);
  }

  @Override
  public Object doLeftShift(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.shiftLeft(rhs);
  }

  @Override
  public Object doLeftShift(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.shiftLeft(rhs);
  }

  @Override
  public Object doLeftShift(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.shiftLeft(rhs);
  }

  @Override
  public Object doLeftShift(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.shiftLeft((int)rhs);
  }

  @Override
  public Object doLeftShift(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.shiftLeft(rhs.intValue());
  }

  @Override
  public Object doLeftShift(final Object lhs, final byte rhs) throws Throwable {
    return doLeftShift(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLeftShift(final Object lhs, final char rhs) throws Throwable {
    return doLeftShift(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLeftShift(final Object lhs, final short rhs) throws Throwable {
    return doLeftShift(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLeftShift(final Object lhs, final int rhs) throws Throwable {
    return doLeftShift(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLeftShift(final Object lhs, final long rhs) throws Throwable {
    return doLeftShift(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLeftShift(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLeftShift(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseLeftShift(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLeftShift(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLeftShift(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLeftShift(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLeftShift(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLeftShift(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLeftShift(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLeftShift(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLeftShift(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLeftShift(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLeftShift(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLeftShift(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.shiftLeft(rhs);
  }

  @Override
  public Object doLeftShiftEquals(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.shiftLeft(rhs);
  }

  @Override
  public Object doLeftShiftEquals(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.shiftLeft(rhs);
  }

  @Override
  public Object doLeftShiftEquals(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.shiftLeft(rhs);
  }

  @Override
  public Object doLeftShiftEquals(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.shiftLeft((int)rhs);
  }

  @Override
  public Object doLeftShiftEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.shiftLeft(rhs.intValue());
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final byte rhs) throws Throwable {
    return doLeftShiftEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final char rhs) throws Throwable {
    return doLeftShiftEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final short rhs) throws Throwable {
    return doLeftShiftEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final int rhs) throws Throwable {
    return doLeftShiftEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final long rhs) throws Throwable {
    return doLeftShiftEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLeftShiftEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseLeftShiftEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLeftShiftEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLeftShiftEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLeftShiftEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLeftShiftEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLeftShiftEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLeftShiftEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLeftShiftEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLeftShiftEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLeftShiftEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLeftShiftEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLeftShiftEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.shiftRight(rhs);
  }

  @Override
  public Object doArithmeticRightShift(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.shiftRight(rhs);
  }

  @Override
  public Object doArithmeticRightShift(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.shiftRight(rhs);
  }

  @Override
  public Object doArithmeticRightShift(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.shiftRight(rhs);
  }

  @Override
  public Object doArithmeticRightShift(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.shiftRight((int)rhs);
  }

  @Override
  public Object doArithmeticRightShift(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.shiftRight(rhs.intValue());
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final byte rhs) throws Throwable {
    return doArithmeticRightShift(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final char rhs) throws Throwable {
    return doArithmeticRightShift(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final short rhs) throws Throwable {
    return doArithmeticRightShift(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final int rhs) throws Throwable {
    return doArithmeticRightShift(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final long rhs) throws Throwable {
    return doArithmeticRightShift(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final BigInteger rhs) throws Throwable {
    return doArithmeticRightShift(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseArithmeticRightShift(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doArithmeticRightShift(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseArithmeticRightShift(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doArithmeticRightShift(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseArithmeticRightShift(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doArithmeticRightShift(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseArithmeticRightShift(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doArithmeticRightShift(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseArithmeticRightShift(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doArithmeticRightShift(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseArithmeticRightShift(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doArithmeticRightShift(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.shiftRight(rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.shiftRight(rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.shiftRight(rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.shiftRight(rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.shiftRight((int)rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.shiftRight(rhs.intValue());
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final byte rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final char rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final short rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final int rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final long rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doArithmeticRightShiftEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doArithmeticRightShiftEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doArithmeticRightShiftEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doArithmeticRightShiftEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doArithmeticRightShiftEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doArithmeticRightShiftEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doCompare(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doCompare(final BigInteger lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs.compareTo(BigInteger.valueOf(rhs)));
  }

  @Override
  public Object doCompare(final BigInteger lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs.compareTo(BigInteger.valueOf(rhs)));
  }

  @Override
  public Object doCompare(final BigInteger lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs.compareTo(BigInteger.valueOf(rhs)));
  }

  @Override
  public Object doCompare(final BigInteger lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs.compareTo(BigInteger.valueOf(rhs)));
  }

  @Override
  public Object doCompare(final BigInteger lhs, final long rhs) throws Throwable {
    return NgInt.valueOf(lhs.compareTo(BigInteger.valueOf(rhs)));
  }

  @Override
  public Object doCompare(final BigInteger lhs, final float rhs) throws Throwable {
    return NgInt.valueOf(new BigDecimal(lhs).compareTo(new BigDecimal(rhs)));
  }

  @Override
  public Object doCompare(final BigInteger lhs, final double rhs) throws Throwable {
    return NgInt.valueOf(new BigDecimal(lhs).compareTo(new BigDecimal(rhs)));
  }

  @Override
  public Object doCompare(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return NgInt.valueOf(lhs.compareTo(rhs));
  }

  @Override
  public Object doCompare(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return NgInt.valueOf(new BigDecimal(lhs).compareTo(rhs));
  }

  @Override
  public Object doCompare(final Object lhs, final byte rhs) throws Throwable {
    return doCompare(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final char rhs) throws Throwable {
    return doCompare(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final short rhs) throws Throwable {
    return doCompare(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final int rhs) throws Throwable {
    return doCompare(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final long rhs) throws Throwable {
    return doCompare(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final float rhs) throws Throwable {
    return doCompare(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final double rhs) throws Throwable {
    return doCompare(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final BigInteger rhs) throws Throwable {
    return doCompare(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doCompare(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseCompare(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doCompare(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseCompare(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doCompare(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseCompare(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doCompare(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseCompare(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doCompare(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseCompare(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doCompare(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseCompare(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doCompare(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseCompare(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doCompare(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseCompare(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doCompare(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseCompare(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doCompare(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final BigInteger lhs, final char rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final BigInteger lhs, final short rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final BigInteger lhs, final int rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final BigInteger lhs, final long rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final BigInteger lhs, final float rhs) throws Throwable {
    return (lhs.floatValue() == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final BigInteger lhs, final double rhs) throws Throwable {
    return (lhs.doubleValue() == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return (lhs.compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final Object lhs, final byte rhs) throws Throwable {
    return doEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final char rhs) throws Throwable {
    return doEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final short rhs) throws Throwable {
    return doEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final int rhs) throws Throwable {
    return doEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final long rhs) throws Throwable {
    return doEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final float rhs) throws Throwable {
    return doEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final double rhs) throws Throwable {
    return doEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.compareTo(BigInteger.valueOf(rhs)) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.compareTo(BigInteger.valueOf(rhs)) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.compareTo(BigInteger.valueOf(rhs)) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.compareTo(BigInteger.valueOf(rhs)) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.compareTo(BigInteger.valueOf(rhs)) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final BigInteger lhs, final float rhs) throws Throwable {
    return lhs.floatValue() == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final BigInteger lhs, final double rhs) throws Throwable {
    return lhs.doubleValue() == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.compareTo(rhs) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).compareTo(rhs) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return doEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return doEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return doEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return doEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return doEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return doEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doReverseEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doReverseEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doReverseEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doReverseEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doReverseEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doReverseEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doReverseEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doReverseEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doReverseEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doNotEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final BigInteger lhs, final char rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final BigInteger lhs, final short rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final BigInteger lhs, final int rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final BigInteger lhs, final long rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final BigInteger lhs, final float rhs) throws Throwable {
    return (lhs.floatValue() != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final BigInteger lhs, final double rhs) throws Throwable {
    return (lhs.doubleValue() != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return (lhs.compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final Object lhs, final byte rhs) throws Throwable {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final char rhs) throws Throwable {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final short rhs) throws Throwable {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final int rhs) throws Throwable {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final long rhs) throws Throwable {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final float rhs) throws Throwable {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final double rhs) throws Throwable {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseNotEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseNotEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseNotEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseNotEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseNotEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseNotEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseNotEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseNotEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseNotEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doLessThan(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThan(final BigInteger lhs, final byte rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final BigInteger lhs, final char rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final BigInteger lhs, final short rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final BigInteger lhs, final int rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final BigInteger lhs, final long rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final BigInteger lhs, final float rhs) throws Throwable {
    return (lhs.floatValue() < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final BigInteger lhs, final double rhs) throws Throwable {
    return (lhs.doubleValue() < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return (lhs.compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final Object lhs, final byte rhs) throws Throwable {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final char rhs) throws Throwable {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final short rhs) throws Throwable {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final int rhs) throws Throwable {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final long rhs) throws Throwable {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final float rhs) throws Throwable {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final double rhs) throws Throwable {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseLessThan(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLessThan(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLessThan(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLessThan(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLessThan(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLessThan(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLessThan(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLessThan(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLessThan(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final BigInteger lhs, final char rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final BigInteger lhs, final short rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final BigInteger lhs, final int rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final BigInteger lhs, final long rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final BigInteger lhs, final float rhs) throws Throwable {
    return (lhs.floatValue() <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final BigInteger lhs, final double rhs) throws Throwable {
    return (lhs.doubleValue() <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return (lhs.compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final byte rhs) throws Throwable {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final char rhs) throws Throwable {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final short rhs) throws Throwable {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final int rhs) throws Throwable {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final long rhs) throws Throwable {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final float rhs) throws Throwable {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final double rhs) throws Throwable {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseLessThanOrEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLessThanOrEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLessThanOrEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLessThanOrEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLessThanOrEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLessThanOrEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLessThanOrEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLessThanOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseLessThanOrEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigInteger lhs, final byte rhs) throws Throwable {
    return lhs.compareTo(BigInteger.valueOf(rhs)) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigInteger lhs, final char rhs) throws Throwable {
    return lhs.compareTo(BigInteger.valueOf(rhs)) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigInteger lhs, final short rhs) throws Throwable {
    return lhs.compareTo(BigInteger.valueOf(rhs)) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigInteger lhs, final int rhs) throws Throwable {
    return lhs.compareTo(BigInteger.valueOf(rhs)) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigInteger lhs, final long rhs) throws Throwable {
    return lhs.compareTo(BigInteger.valueOf(rhs)) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigInteger lhs, final float rhs) throws Throwable {
    return lhs.floatValue() <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigInteger lhs, final double rhs) throws Throwable {
    return lhs.doubleValue() <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return lhs.compareTo(rhs) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).compareTo(rhs) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigInteger)lhs), rhs);
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanOrEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanOrEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanOrEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanOrEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanOrEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanOrEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanOrEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanOrEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanOrEqualsBoolean(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doGreaterThan(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final BigInteger lhs, final byte rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final BigInteger lhs, final char rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final BigInteger lhs, final short rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final BigInteger lhs, final int rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final BigInteger lhs, final long rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final BigInteger lhs, final float rhs) throws Throwable {
    return (lhs.floatValue() > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final BigInteger lhs, final double rhs) throws Throwable {
    return (lhs.doubleValue() > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return (lhs.compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final Object lhs, final byte rhs) throws Throwable {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final char rhs) throws Throwable {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final short rhs) throws Throwable {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final int rhs) throws Throwable {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final long rhs) throws Throwable {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final float rhs) throws Throwable {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final double rhs) throws Throwable {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final BigInteger rhs) throws Throwable {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseGreaterThan(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseGreaterThan(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseGreaterThan(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseGreaterThan(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseGreaterThan(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseGreaterThan(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseGreaterThan(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseGreaterThan(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseGreaterThan(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final BigInteger lhs, final byte rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final BigInteger lhs, final char rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final BigInteger lhs, final short rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final BigInteger lhs, final int rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final BigInteger lhs, final long rhs) throws Throwable {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final BigInteger lhs, final float rhs) throws Throwable {
    return (lhs.floatValue() >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final BigInteger lhs, final double rhs) throws Throwable {
    return (lhs.doubleValue() >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return (lhs.compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final byte rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final char rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final short rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final int rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final long rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final float rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final double rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

}
