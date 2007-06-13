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
import ng.runtime.NgInt;

public class BigDecimalMetaClass extends RuntimeMetaClassImpl {
  public BigDecimalMetaClass() {
    super(BigDecimal.class, new BigDecimalInternalMetaClass(BigDecimal.class));
  }
}

class BigDecimalInternalMetaClass extends InternalMetaClassImpl {
  public BigDecimalInternalMetaClass(final Class theClass) {
    super(theClass);
  }
  
  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl#doCalculateConversionCost(java.lang.Class)
   */
  @Override
  public int doCalculateConversionCost(final Class parameterType) {
    if (parameterType == char.class) return 7;
    
    if (parameterType == byte.class) return 7;
    
    if (parameterType == short.class) return 6;
    
    if (parameterType == int.class) return 5;
    
    if (parameterType == long.class) return 4;
    
    if (parameterType == BigInteger.class) return 3;
    
    if (parameterType == float.class) return 2;
    
    if (parameterType == double.class) return 1;
    
    if (parameterType == BigDecimal.class) return 0;
    
    return super.doCalculateConversionCost(parameterType);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl#doGetParamObject(java.lang.Object, java.lang.Class)
   */
  @Override
 public Object doGetParamObject(final Object instance, final Class parameterType) {   
    if (parameterType == BigDecimal.class) return instance;
    
    if (parameterType == char.class) return new Character((char)((BigDecimal)instance).intValue());
    
    if (parameterType == byte.class) return new Byte(((BigDecimal)instance).byteValue());
    
    if (parameterType == short.class) return new Short(((BigDecimal)instance).shortValue());
    
    if (parameterType == int.class) return new Integer(((BigDecimal)instance).intValue());
    
    if (parameterType == long.class) return new Long(((BigDecimal)instance).longValue());
    
    if (parameterType == BigInteger.class) return BigInteger.valueOf(((BigDecimal)instance).longValue());
    
    if (parameterType == float.class) return new Float(((BigDecimal)instance).floatValue());
    
    if (parameterType == double.class) return new Double(((BigDecimal)instance).doubleValue());
    
    return super.doGetParamObject(instance, parameterType);
  }

  @Override
  public Object doUnaryPlus(final BigDecimal instance) {
    return instance;
  }
  
  @Override
  public Object doUnaryPlus(final Object instance) {
    return instance;
  }
  
  @Override
  public Object doUnaryMinus(final BigDecimal instance) {
    return instance.negate();
  }
  
  @Override
  public Object doUnaryMinus(final Object instance) {
    return ((BigDecimal)instance).negate();
  }

  @Override
  public Object doPostfixIncrement(final BigDecimal instance) {
    return instance.add(BigDecimal.ONE);
  }

  @Override
  public Object doPostfixIncrement(final Object instance) {
    return ((BigDecimal)instance).add(BigDecimal.ONE);
  }

  @Override
  public Object doPostfixDecrement(final BigDecimal instance) {
    return instance.subtract(BigDecimal.ONE);
  }

  @Override
  public Object doPostfixDecrement(final Object instance) {
    return ((BigDecimal)instance).subtract(BigDecimal.ONE);
  }

  @Override
  public Object doPrefixIncrement(final BigDecimal instance) {
    return instance.add(BigDecimal.ONE);
  }

  @Override
  public Object doPrefixIncrement(final Object instance) {
    return ((BigDecimal)instance).add(BigDecimal.ONE);
  }

  @Override
  public Object doPrefixDecrement(final BigDecimal instance) {
    return instance.subtract(BigDecimal.ONE);
  }

  @Override
  public Object doPrefixDecrement(final Object instance) {
    return ((BigDecimal)instance).subtract(BigDecimal.ONE);
  }

  @Override
  public Object doAdd(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAdd(final BigDecimal lhs, final byte rhs) throws Throwable {
    return lhs.add(new BigDecimal(rhs));
  }

  @Override
  public Object doAdd(final BigDecimal lhs, final char rhs) throws Throwable {
    return lhs.add(new BigDecimal(rhs));
  }

  @Override
  public Object doAdd(final BigDecimal lhs, final short rhs) throws Throwable {
    return lhs.add(new BigDecimal(rhs));
  }

  @Override
  public Object doAdd(final BigDecimal lhs, final int rhs) throws Throwable {
    return lhs.add(new BigDecimal(rhs));
  }

  @Override
  public Object doAdd(final BigDecimal lhs, final long rhs) throws Throwable {
    return lhs.add(new BigDecimal(rhs));
  }

  @Override
  public Object doAdd(final BigDecimal lhs, final float rhs) throws Throwable {
    return lhs.add(new BigDecimal(rhs));
  }

  @Override
  public Object doAdd(final BigDecimal lhs, final double rhs) throws Throwable {
    return lhs.add(new BigDecimal(rhs));
  }

  @Override
  public Object doAdd(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return lhs.add(new BigDecimal(rhs));
  }

  @Override
  public Object doAdd(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return lhs.add(rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final byte rhs) throws Throwable {
    return doAdd(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final char rhs) throws Throwable {
    return doAdd(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final short rhs) throws Throwable {
    return doAdd(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final int rhs) throws Throwable {
    return doAdd(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final long rhs) throws Throwable {
    return doAdd(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final float rhs) throws Throwable {
    return doAdd(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final double rhs) throws Throwable {
    return doAdd(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final BigInteger rhs) throws Throwable {
    return doAdd(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doAdd(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doReverseAdd(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAdd(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseAdd(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAdd(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseAdd(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAdd(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseAdd(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAdd(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseAdd(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAdd(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseAdd(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAdd(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseAdd(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAdd(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseAdd(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAdd(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseAdd(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAdd(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doAddEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    return lhs.add(new BigDecimal(rhs));
  }

  @Override
  public Object doAddEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    return lhs.add(new BigDecimal(rhs));
  }

  @Override
  public Object doAddEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    return lhs.add(new BigDecimal(rhs));
  }

  @Override
  public Object doAddEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    return lhs.add(new BigDecimal(rhs));
  }

  @Override
  public Object doAddEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    return lhs.add(new BigDecimal(rhs));
  }

  @Override
  public Object doAddEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    return lhs.add(new BigDecimal(rhs));
  }

  @Override
  public Object doAddEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    return lhs.add(new BigDecimal(rhs));
  }

  @Override
  public Object doAddEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return lhs.add(new BigDecimal(rhs));
  }

  @Override
  public Object doAddEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return lhs.add(rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final byte rhs) throws Throwable {
    return doAddEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final char rhs) throws Throwable {
    return doAddEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final short rhs) throws Throwable {
    return doAddEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final int rhs) throws Throwable {
    return doAddEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final long rhs) throws Throwable {
    return doAddEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final float rhs) throws Throwable {
    return doAddEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final double rhs) throws Throwable {
    return doAddEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doAddEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doAddEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doReverseAddEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAddEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseAddEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAddEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseAddEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAddEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseAddEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAddEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseAddEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAddEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseAddEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAddEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseAddEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAddEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseAddEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAddEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseAddEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAddEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doSubtract(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtract(final BigDecimal lhs, final byte rhs) throws Throwable {
    return lhs.subtract(new BigDecimal(rhs));
  }

  @Override
  public Object doSubtract(final BigDecimal lhs, final char rhs) throws Throwable {
    return lhs.subtract(new BigDecimal(rhs));
  }

  @Override
  public Object doSubtract(final BigDecimal lhs, final short rhs) throws Throwable {
    return lhs.subtract(new BigDecimal(rhs));
  }

  @Override
  public Object doSubtract(final BigDecimal lhs, final int rhs) throws Throwable {
    return lhs.subtract(new BigDecimal(rhs));
  }

  @Override
  public Object doSubtract(final BigDecimal lhs, final long rhs) throws Throwable {
    return lhs.subtract(new BigDecimal(rhs));
  }

  @Override
  public Object doSubtract(final BigDecimal lhs, final float rhs) throws Throwable {
    return lhs.subtract(new BigDecimal(rhs));
  }

  @Override
  public Object doSubtract(final BigDecimal lhs, final double rhs) throws Throwable {
    return lhs.subtract(new BigDecimal(rhs));
  }

  @Override
  public Object doSubtract(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return lhs.subtract(new BigDecimal(rhs));
  }

  @Override
  public Object doSubtract(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return lhs.subtract(rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final byte rhs) throws Throwable {
    return doSubtract(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final char rhs) throws Throwable {
    return doSubtract(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final short rhs) throws Throwable {
    return doSubtract(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final int rhs) throws Throwable {
    return doSubtract(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final long rhs) throws Throwable {
    return doSubtract(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final float rhs) throws Throwable {
    return doSubtract(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final double rhs) throws Throwable {
    return doSubtract(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final BigInteger rhs) throws Throwable {
    return doSubtract(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doSubtract(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doReverseSubtract(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtract(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseSubtract(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtract(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseSubtract(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtract(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseSubtract(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtract(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseSubtract(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtract(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseSubtract(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtract(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseSubtract(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtract(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseSubtract(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtract(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseSubtract(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtract(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    return lhs.subtract(new BigDecimal(rhs));
  }

  @Override
  public Object doSubtractEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    return lhs.subtract(new BigDecimal(rhs));
  }

  @Override
  public Object doSubtractEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    return lhs.subtract(new BigDecimal(rhs));
  }

  @Override
  public Object doSubtractEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    return lhs.subtract(new BigDecimal(rhs));
  }

  @Override
  public Object doSubtractEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    return lhs.subtract(new BigDecimal(rhs));
  }

  @Override
  public Object doSubtractEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    return lhs.subtract(new BigDecimal(rhs));
  }

  @Override
  public Object doSubtractEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    return lhs.subtract(new BigDecimal(rhs));
  }

  @Override
  public Object doSubtractEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return lhs.subtract(new BigDecimal(rhs));
  }

  @Override
  public Object doSubtractEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return lhs.subtract(rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final byte rhs) throws Throwable {
    return doSubtractEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final char rhs) throws Throwable {
    return doSubtractEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final short rhs) throws Throwable {
    return doSubtractEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final int rhs) throws Throwable {
    return doSubtractEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final long rhs) throws Throwable {
    return doSubtractEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final float rhs) throws Throwable {
    return doSubtractEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final double rhs) throws Throwable {
    return doSubtractEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doSubtractEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doSubtractEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doReverseSubtractEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtractEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseSubtractEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtractEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseSubtractEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtractEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseSubtractEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtractEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseSubtractEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtractEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseSubtractEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtractEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseSubtractEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtractEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseSubtractEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtractEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseSubtractEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtractEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doMultiply(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiply(final BigDecimal lhs, final byte rhs) throws Throwable {
    return lhs.multiply(new BigDecimal(rhs));
  }

  @Override
  public Object doMultiply(final BigDecimal lhs, final char rhs) throws Throwable {
    return lhs.multiply(new BigDecimal(rhs));
  }

  @Override
  public Object doMultiply(final BigDecimal lhs, final short rhs) throws Throwable {
    return lhs.multiply(new BigDecimal(rhs));
  }

  @Override
  public Object doMultiply(final BigDecimal lhs, final int rhs) throws Throwable {
    return lhs.multiply(new BigDecimal(rhs));
  }

  @Override
  public Object doMultiply(final BigDecimal lhs, final long rhs) throws Throwable {
    return lhs.multiply(new BigDecimal(rhs));
  }

  @Override
  public Object doMultiply(final BigDecimal lhs, final float rhs) throws Throwable {
    return lhs.multiply(new BigDecimal(rhs));
  }

  @Override
  public Object doMultiply(final BigDecimal lhs, final double rhs) throws Throwable {
    return lhs.multiply(new BigDecimal(rhs));
  }

  @Override
  public Object doMultiply(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return lhs.multiply(new BigDecimal(rhs));
  }

  @Override
  public Object doMultiply(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return lhs.multiply(rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final byte rhs) throws Throwable {
    return doMultiply(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final char rhs) throws Throwable {
    return doMultiply(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final short rhs) throws Throwable {
    return doMultiply(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final int rhs) throws Throwable {
    return doMultiply(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final long rhs) throws Throwable {
    return doMultiply(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final float rhs) throws Throwable {
    return doMultiply(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final double rhs) throws Throwable {
    return doMultiply(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final BigInteger rhs) throws Throwable {
    return doMultiply(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doMultiply(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doReverseMultiply(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiply(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseMultiply(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiply(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseMultiply(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiply(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseMultiply(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiply(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseMultiply(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiply(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseMultiply(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiply(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseMultiply(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiply(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseMultiply(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiply(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseMultiply(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiply(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    return lhs.multiply(new BigDecimal(rhs));
  }

  @Override
  public Object doMultiplyEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    return lhs.multiply(new BigDecimal(rhs));
  }

  @Override
  public Object doMultiplyEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    return lhs.multiply(new BigDecimal(rhs));
  }

  @Override
  public Object doMultiplyEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    return lhs.multiply(new BigDecimal(rhs));
  }

  @Override
  public Object doMultiplyEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    return lhs.multiply(new BigDecimal(rhs));
  }

  @Override
  public Object doMultiplyEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    return lhs.multiply(new BigDecimal(rhs));
  }

  @Override
  public Object doMultiplyEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    return lhs.multiply(new BigDecimal(rhs));
  }

  @Override
  public Object doMultiplyEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return lhs.multiply(new BigDecimal(rhs));
  }

  @Override
  public Object doMultiplyEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return lhs.multiply(rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final byte rhs) throws Throwable {
    return doMultiplyEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final char rhs) throws Throwable {
    return doMultiplyEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final short rhs) throws Throwable {
    return doMultiplyEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final int rhs) throws Throwable {
    return doMultiplyEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final long rhs) throws Throwable {
    return doMultiplyEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final float rhs) throws Throwable {
    return doMultiplyEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final double rhs) throws Throwable {
    return doMultiplyEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doMultiplyEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doMultiplyEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doReverseMultiplyEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiplyEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseMultiplyEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiplyEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseMultiplyEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiplyEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseMultiplyEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiplyEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseMultiplyEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiplyEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseMultiplyEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiplyEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseMultiplyEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiplyEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseMultiplyEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiplyEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseMultiplyEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiplyEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doDivide(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivide(final BigDecimal lhs, final byte rhs) throws Throwable {
    return lhs.divide(new BigDecimal(rhs));
  }

  @Override
  public Object doDivide(final BigDecimal lhs, final char rhs) throws Throwable {
    return lhs.divide(new BigDecimal(rhs));
  }

  @Override
  public Object doDivide(final BigDecimal lhs, final short rhs) throws Throwable {
    return lhs.divide(new BigDecimal(rhs));
  }

  @Override
  public Object doDivide(final BigDecimal lhs, final int rhs) throws Throwable {
    return lhs.divide(new BigDecimal(rhs));
  }

  @Override
  public Object doDivide(final BigDecimal lhs, final long rhs) throws Throwable {
    return lhs.divide(new BigDecimal(rhs));
  }

  @Override
  public Object doDivide(final BigDecimal lhs, final float rhs) throws Throwable {
    return lhs.divide(new BigDecimal(rhs));
  }

  @Override
  public Object doDivide(final BigDecimal lhs, final double rhs) throws Throwable {
    return lhs.divide(new BigDecimal(rhs));
  }

  @Override
  public Object doDivide(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return lhs.divide(new BigDecimal(rhs));
  }

  @Override
  public Object doDivide(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return lhs.divide(rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final byte rhs) throws Throwable {
    return doDivide(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final char rhs) throws Throwable {
    return doDivide(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final short rhs) throws Throwable {
    return doDivide(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final int rhs) throws Throwable {
    return doDivide(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final long rhs) throws Throwable {
    return doDivide(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final float rhs) throws Throwable {
    return doDivide(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final double rhs) throws Throwable {
    return doDivide(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final BigInteger rhs) throws Throwable {
    return doDivide(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doDivide(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doReverseDivide(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivide(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseDivide(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivide(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseDivide(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivide(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseDivide(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivide(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseDivide(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivide(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseDivide(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivide(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseDivide(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivide(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseDivide(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivide(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseDivide(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivide(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doDivideEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    return lhs.divide(new BigDecimal(rhs));
  }

  @Override
  public Object doDivideEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    return lhs.divide(new BigDecimal(rhs));
  }

  @Override
  public Object doDivideEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    return lhs.divide(new BigDecimal(rhs));
  }

  @Override
  public Object doDivideEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    return lhs.divide(new BigDecimal(rhs));
  }

  @Override
  public Object doDivideEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    return lhs.divide(new BigDecimal(rhs));
  }

  @Override
  public Object doDivideEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    return lhs.divide(new BigDecimal(rhs));
  }

  @Override
  public Object doDivideEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    return lhs.divide(new BigDecimal(rhs));
  }

  @Override
  public Object doDivideEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return lhs.divide(new BigDecimal(rhs));
  }

  @Override
  public Object doDivideEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return lhs.divide(rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final byte rhs) throws Throwable {
    return doDivideEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final char rhs) throws Throwable {
    return doDivideEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final short rhs) throws Throwable {
    return doDivideEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final int rhs) throws Throwable {
    return doDivideEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final long rhs) throws Throwable {
    return doDivideEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final float rhs) throws Throwable {
    return doDivideEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final double rhs) throws Throwable {
    return doDivideEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doDivideEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doDivideEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doReverseDivideEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivideEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseDivideEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivideEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseDivideEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivideEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseDivideEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivideEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseDivideEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivideEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseDivideEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivideEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseDivideEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivideEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseDivideEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivideEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseDivideEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivideEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doIntegerDivide(final BigDecimal lhs, final byte rhs) throws Throwable {
    return lhs.divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivide(final BigDecimal lhs, final char rhs) throws Throwable {
    return lhs.divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivide(final BigDecimal lhs, final short rhs) throws Throwable {
    return lhs.divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivide(final BigDecimal lhs, final int rhs) throws Throwable {
    return lhs.divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivide(final BigDecimal lhs, final long rhs) throws Throwable {
    return lhs.divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivide(final BigDecimal lhs, final float rhs) throws Throwable {
    return lhs.divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivide(final BigDecimal lhs, final double rhs) throws Throwable {
    return lhs.divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivide(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return lhs.divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivide(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return lhs.divideToIntegralValue(rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final byte rhs) throws Throwable {
    return doIntegerDivide((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final char rhs) throws Throwable {
    return doIntegerDivide((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final short rhs) throws Throwable {
    return doIntegerDivide((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final int rhs) throws Throwable {
    return doIntegerDivide((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final long rhs) throws Throwable {
    return doIntegerDivide((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final float rhs) throws Throwable {
    return doIntegerDivide((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final double rhs) throws Throwable {
    return doIntegerDivide((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final BigInteger rhs) throws Throwable {
    return doIntegerDivide((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doIntegerDivide((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doReverseIntegerDivide(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivide(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doReverseIntegerDivide(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivide(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doReverseIntegerDivide(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivide(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doReverseIntegerDivide(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivide(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doReverseIntegerDivide(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivide(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doReverseIntegerDivide(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doReverseIntegerDivide(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doReverseIntegerDivide(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivide(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doReverseIntegerDivide(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivide(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    return lhs.divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    return lhs.divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    return lhs.divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    return lhs.divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    return lhs.divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    return lhs.divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    return lhs.divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return lhs.divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return lhs.divideToIntegralValue(rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final byte rhs) throws Throwable {
    return doIntegerDivideEquals((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final char rhs) throws Throwable {
    return doIntegerDivideEquals((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final short rhs) throws Throwable {
    return doIntegerDivideEquals((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final int rhs) throws Throwable {
    return doIntegerDivideEquals((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final long rhs) throws Throwable {
    return doIntegerDivideEquals((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final float rhs) throws Throwable {
    return doIntegerDivideEquals((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final double rhs) throws Throwable {
    return doIntegerDivideEquals((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doIntegerDivideEquals((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doIntegerDivideEquals((BigDecimal)lhs, rhs);
  }

  @Override
  public Object doReverseIntegerDivideEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivideEquals(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doReverseIntegerDivideEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivideEquals(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doReverseIntegerDivideEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivideEquals(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doReverseIntegerDivideEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivideEquals(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doReverseIntegerDivideEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivideEquals(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doReverseIntegerDivideEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doReverseIntegerDivideEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doReverseIntegerDivideEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivideEquals(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doReverseIntegerDivideEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivideEquals(lhs, (BigDecimal)rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doCompare(final BigDecimal lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs.compareTo(new BigDecimal(rhs)));
  }

  @Override
  public Object doCompare(final BigDecimal lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs.compareTo(new BigDecimal(rhs)));
  }

  @Override
  public Object doCompare(final BigDecimal lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs.compareTo(new BigDecimal(rhs)));
  }

  @Override
  public Object doCompare(final BigDecimal lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs.compareTo(new BigDecimal(rhs)));
  }

  @Override
  public Object doCompare(final BigDecimal lhs, final long rhs) throws Throwable {
    return NgInt.valueOf(lhs.compareTo(new BigDecimal(rhs)));
  }

  @Override
  public Object doCompare(final BigDecimal lhs, final float rhs) throws Throwable {
    return NgInt.valueOf(lhs.compareTo(new BigDecimal(rhs)));
  }

  @Override
  public Object doCompare(final BigDecimal lhs, final double rhs) throws Throwable {
    return NgInt.valueOf(lhs.compareTo(new BigDecimal(rhs)));
  }

  @Override
  public Object doCompare(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return NgInt.valueOf(lhs.compareTo(new BigDecimal(rhs)));
  }

  @Override
  public Object doCompare(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return NgInt.valueOf(lhs.compareTo(rhs));
  }

  @Override
  public Object doCompare(final Object lhs, final byte rhs) throws Throwable {
    return doCompare(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final char rhs) throws Throwable {
    return doCompare(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final short rhs) throws Throwable {
    return doCompare(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final int rhs) throws Throwable {
    return doCompare(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final long rhs) throws Throwable {
    return doCompare(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final float rhs) throws Throwable {
    return doCompare(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final double rhs) throws Throwable {
    return doCompare(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final BigInteger rhs) throws Throwable {
    return doCompare(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doCompare(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doReverseCompare(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doCompare(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseCompare(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doCompare(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseCompare(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doCompare(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseCompare(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doCompare(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseCompare(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doCompare(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseCompare(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doCompare(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseCompare(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doCompare(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseCompare(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doCompare(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseCompare(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doCompare(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return (lhs.compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final Object lhs, final byte rhs) throws Throwable {
    return doEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final char rhs) throws Throwable {
    return doEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final short rhs) throws Throwable {
    return doEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final int rhs) throws Throwable {
    return doEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final long rhs) throws Throwable {
    return doEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final float rhs) throws Throwable {
    return doEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final double rhs) throws Throwable {
    return doEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doReverseEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final BigDecimal lhs, final byte rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final BigDecimal lhs, final char rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final BigDecimal lhs, final short rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final BigDecimal lhs, final int rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final BigDecimal lhs, final long rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final BigDecimal lhs, final float rhs) throws Throwable {
    return lhs.compareTo(new BigDecimal(rhs)) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final BigDecimal lhs, final double rhs) throws Throwable {
    return lhs.compareTo(new BigDecimal(rhs)) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return lhs.compareTo(new BigDecimal(rhs)) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return lhs.compareTo(rhs) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return doEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return doEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return doEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return doEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return doEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return doEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doReverseEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doNotEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return (lhs.compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final Object lhs, final byte rhs) throws Throwable {
    return doNotEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final char rhs) throws Throwable {
    return doNotEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final short rhs) throws Throwable {
    return doNotEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final int rhs) throws Throwable {
    return doNotEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final long rhs) throws Throwable {
    return doNotEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final float rhs) throws Throwable {
    return doNotEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final double rhs) throws Throwable {
    return doNotEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doNotEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doNotEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doReverseNotEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doNotEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseNotEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doNotEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseNotEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doNotEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseNotEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doNotEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseNotEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doNotEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseNotEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doNotEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseNotEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doNotEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseNotEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doNotEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseNotEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doNotEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final BigDecimal lhs, final byte rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) != 0;
  }

  @Override
  public boolean doNotEqualsBoolean(final BigDecimal lhs, final char rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) != 0;
  }

  @Override
  public boolean doNotEqualsBoolean(final BigDecimal lhs, final short rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) != 0;
  }

  @Override
  public boolean doNotEqualsBoolean(final BigDecimal lhs, final int rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) != 0;
  }

  @Override
  public boolean doNotEqualsBoolean(final BigDecimal lhs, final long rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) != 0;
  }

  @Override
  public boolean doNotEqualsBoolean(final BigDecimal lhs, final float rhs) throws Throwable {
    return lhs.compareTo(new BigDecimal(rhs)) != 0;
  }

  @Override
  public boolean doNotEqualsBoolean(final BigDecimal lhs, final double rhs) throws Throwable {
    return lhs.compareTo(new BigDecimal(rhs)) != 0;
  }

  @Override
  public boolean doNotEqualsBoolean(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return lhs.compareTo(new BigDecimal(rhs)) != 0;
  }

  @Override
  public boolean doNotEqualsBoolean(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return lhs.compareTo(rhs) != 0;
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doNotEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return doNotEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return doNotEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return doNotEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return doNotEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return doNotEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return doNotEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doNotEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doNotEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doNotEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doNotEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doNotEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doNotEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doNotEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doNotEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doNotEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doNotEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doNotEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doLessThan(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThan(final BigDecimal lhs, final byte rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final BigDecimal lhs, final char rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final BigDecimal lhs, final short rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final BigDecimal lhs, final int rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final BigDecimal lhs, final long rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final BigDecimal lhs, final float rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final BigDecimal lhs, final double rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return (lhs.compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final Object lhs, final byte rhs) throws Throwable {
    return doLessThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final char rhs) throws Throwable {
    return doLessThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final short rhs) throws Throwable {
    return doLessThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final int rhs) throws Throwable {
    return doLessThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final long rhs) throws Throwable {
    return doLessThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final float rhs) throws Throwable {
    return doLessThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final double rhs) throws Throwable {
    return doLessThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLessThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doLessThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doReverseLessThan(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseLessThan(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseLessThan(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseLessThan(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseLessThan(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseLessThan(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseLessThan(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseLessThan(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseLessThan(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return (lhs.compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final byte rhs) throws Throwable {
    return doLessThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final char rhs) throws Throwable {
    return doLessThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final short rhs) throws Throwable {
    return doLessThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final int rhs) throws Throwable {
    return doLessThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final long rhs) throws Throwable {
    return doLessThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final float rhs) throws Throwable {
    return doLessThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final double rhs) throws Throwable {
    return doLessThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLessThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doLessThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doReverseLessThanOrEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseLessThanOrEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseLessThanOrEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseLessThanOrEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseLessThanOrEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseLessThanOrEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseLessThanOrEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseLessThanOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseLessThanOrEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigDecimal lhs, final byte rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigDecimal lhs, final char rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigDecimal lhs, final short rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigDecimal lhs, final int rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigDecimal lhs, final long rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigDecimal lhs, final float rhs) throws Throwable {
    return lhs.compareTo(new BigDecimal(rhs)) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigDecimal lhs, final double rhs) throws Throwable {
    return lhs.compareTo(new BigDecimal(rhs)) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return lhs.compareTo(new BigDecimal(rhs)) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return lhs.compareTo(rhs) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanOrEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanOrEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanOrEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanOrEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanOrEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanOrEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanOrEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanOrEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanOrEqualsBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doGreaterThan(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final BigDecimal lhs, final byte rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final BigDecimal lhs, final char rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final BigDecimal lhs, final short rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final BigDecimal lhs, final int rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final BigDecimal lhs, final long rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final BigDecimal lhs, final float rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final BigDecimal lhs, final double rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return (lhs.compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final Object lhs, final byte rhs) throws Throwable {
    return doGreaterThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final char rhs) throws Throwable {
    return doGreaterThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final short rhs) throws Throwable {
    return doGreaterThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final int rhs) throws Throwable {
    return doGreaterThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final long rhs) throws Throwable {
    return doGreaterThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final float rhs) throws Throwable {
    return doGreaterThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final double rhs) throws Throwable {
    return doGreaterThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final BigInteger rhs) throws Throwable {
    return doGreaterThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doGreaterThan(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doReverseGreaterThan(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseGreaterThan(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseGreaterThan(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseGreaterThan(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseGreaterThan(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseGreaterThan(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseGreaterThan(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseGreaterThan(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseGreaterThan(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThan(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final BigDecimal lhs, final byte rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) > 0;
  }

  @Override
  public boolean doGreaterThanBoolean(final BigDecimal lhs, final char rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) > 0;
  }

  @Override
  public boolean doGreaterThanBoolean(final BigDecimal lhs, final short rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) > 0;
  }

  @Override
  public boolean doGreaterThanBoolean(final BigDecimal lhs, final int rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) > 0;
  }

  @Override
  public boolean doGreaterThanBoolean(final BigDecimal lhs, final long rhs) throws Throwable {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) > 0;
  }

  @Override
  public boolean doGreaterThanBoolean(final BigDecimal lhs, final float rhs) throws Throwable {
    return lhs.compareTo(new BigDecimal(rhs)) > 0;
  }

  @Override
  public boolean doGreaterThanBoolean(final BigDecimal lhs, final double rhs) throws Throwable {
    return lhs.compareTo(new BigDecimal(rhs)) > 0;
  }

  @Override
  public boolean doGreaterThanBoolean(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return lhs.compareTo(new BigDecimal(rhs)) > 0;
  }

  @Override
  public boolean doGreaterThanBoolean(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return lhs.compareTo(rhs) > 0;
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doGreaterThanBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final char rhs) throws Throwable {
    return doGreaterThanBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final short rhs) throws Throwable {
    return doGreaterThanBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final int rhs) throws Throwable {
    return doGreaterThanBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final long rhs) throws Throwable {
    return doGreaterThanBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final float rhs) throws Throwable {
    return doGreaterThanBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final double rhs) throws Throwable {
    return doGreaterThanBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doGreaterThanBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doGreaterThanBoolean(((BigDecimal)lhs), rhs);
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThanBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThanBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThanBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThanBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThanBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThanBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThanBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThanBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThanBoolean(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final BigDecimal lhs, final char rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final BigDecimal lhs, final short rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final BigDecimal lhs, final int rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final BigDecimal lhs, final long rhs) throws Throwable {
    return (lhs.compareTo(BigDecimal.valueOf(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final BigDecimal lhs, final float rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final BigDecimal lhs, final double rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return (lhs.compareTo(new BigDecimal(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return (lhs.compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final byte rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final char rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final short rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final int rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final long rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final float rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final double rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doGreaterThanOrEquals(((BigDecimal)lhs), rhs);
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThanOrEquals(lhs, ((BigDecimal)rhs));
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThanOrEquals(lhs, ((BigDecimal)rhs));
  }

}
