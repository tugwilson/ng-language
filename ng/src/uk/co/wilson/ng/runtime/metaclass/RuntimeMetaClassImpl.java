package uk.co.wilson.ng.runtime.metaclass;

/*
 * Created on Feb 23, 2007
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

import ng.lang.NgRuntimeException;
import ng.lang.NgSystem;
import ng.runtime.InternalMetaClass;
import ng.runtime.RuntimeMetaClass;

public class RuntimeMetaClassImpl extends MetaClassImpl implements RuntimeMetaClass {
  protected static class NgPrefixUnaryOperatorException extends NgRuntimeException {
    private static final long serialVersionUID = 1L;

    public NgPrefixUnaryOperatorException(final String operator, final String name) {
      super("Operation '" + operator + "x' not available on " + name);
    }
  }

  protected static class NgPostfixUnaryOperatorException extends NgRuntimeException {
    private static final long serialVersionUID = 1L;

    public NgPostfixUnaryOperatorException(final String operator, final String name) {
      super("Operation 'x" + operator + "' not available on " + name);
    }
  }

  protected static class NgBinaryOperatorException extends NgRuntimeException {
    private static final long serialVersionUID = 1L;

    public NgBinaryOperatorException(final Class lhsClass, final String operator, final String rhsClassName) {
      super("Operation 'x " + operator + " y' not available between " + lhsClass.getName() + " and " + rhsClassName);
    }

    public NgBinaryOperatorException(final Class lhsClass, final String operator, final Class rhsClass) {
      this(lhsClass, operator, rhsClass.getName());
    }

    public NgBinaryOperatorException(final Class lhsClass, final String operator, final Object rhs) throws Throwable {
      this(lhsClass, operator, ((rhs == null) ? "null" : NgSystem.metaClassRegistry.getRuntimeMetaClass(rhs).getTheClass(rhs).getName()));
    }
  }
  protected static class NgMetaClassConstuctionException extends NgRuntimeException {
    private static final long serialVersionUID = 1L;

    public NgMetaClassConstuctionException(final Class expecting, final Class got) {
      throw new NgRuntimeException("Error when trying to create the MetaClass for " + expecting.getName()
                                   + " the class passed to the constuctor is " + got.getName());
    }
  }

  /**
   * @param theClass
   * @param internalMetaClass
   */
  public RuntimeMetaClassImpl(final Class theClass, final InternalMetaClass internalMetaClass) {
    super(theClass, internalMetaClass);
  }
  
  /**
   * @param theClass
   */
  public RuntimeMetaClassImpl(final Class theClass) {
    super(theClass);
  }

  public Object complement(final int instance) throws  Throwable {
  final Object result = getInternalMetaClass().doComplement(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("~", "int");

    return result;
  }

  public Object complement(final long instance) throws  Throwable {
  final Object result = getInternalMetaClass().doComplement(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("~", "long");

    return result;
  }

  public Object complement(final BigInteger instance) throws  Throwable {
  final Object result = getInternalMetaClass().doComplement(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("~", this.getTheClass(instance).getName());

    return result;
  }

  public Object not(final boolean instance) throws  Throwable {
  final Object result = getInternalMetaClass().doNot(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("!", "boolean");

    return result;
  }

  public Object unaryPlus(final int instance) throws  Throwable {
  final Object result = getInternalMetaClass().doUnaryPlus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("+", "int");

    return result;
  }

  public Object unaryPlus(final long instance) throws  Throwable {
  final Object result = getInternalMetaClass().doUnaryPlus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("+", "long");

    return result;
  }

  public Object unaryPlus(final float instance) throws  Throwable {
  final Object result = getInternalMetaClass().doUnaryPlus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("+", "float");

    return result;
  }

  public Object unaryPlus(final double instance) throws  Throwable {
  final Object result = getInternalMetaClass().doUnaryPlus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("+", "double");

    return result;
  }

  public Object unaryPlus(final BigInteger instance) throws  Throwable {
  final Object result = getInternalMetaClass().doUnaryPlus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("+", this.getTheClass(instance).getName());

    return result;
  }

  public Object unaryPlus(final BigDecimal instance) throws Throwable {
  final Object result = getInternalMetaClass().doUnaryPlus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("+", this.getTheClass(instance).getName());

    return result;
  }

  public Object unaryMinus(final int instance) throws Throwable {
  final Object result = getInternalMetaClass().doUnaryMinus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("-", "int");

    return result;
  }

  public Object unaryMinus(final long instance) throws Throwable {
  final Object result = getInternalMetaClass().doUnaryMinus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("-", "long");

    return result;
  }

  public Object unaryMinus(final float instance) throws Throwable {
  final Object result = getInternalMetaClass().doUnaryMinus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("-", "float");

    return result;
  }

  public Object unaryMinus(final double instance) throws Throwable {
  final Object result = getInternalMetaClass().doUnaryMinus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("-", "double");

    return result;
  }

  public Object unaryMinus(final BigInteger instance) throws Throwable {
  final Object result = getInternalMetaClass().doUnaryMinus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("-", this.getTheClass(instance).getName());

    return result;
  }

  public Object unaryMinus(final BigDecimal instance) throws Throwable {
  final Object result = getInternalMetaClass().doUnaryMinus(instance);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("-", this.getTheClass(instance).getName());

    return result;
  }

  public Object prefixIncrement(final int operand) throws Throwable {
  final Object result = getInternalMetaClass().doPrefixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("++", "int");

    return result;
  }

  public Object prefixIncrement(final long operand) throws Throwable {
  final Object result = getInternalMetaClass().doPrefixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("++", "long");

    return result;
  }

  public Object prefixIncrement(final float operand) throws Throwable {
  final Object result = getInternalMetaClass().doPrefixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("++", "float");

    return result;
  }

  public Object prefixIncrement(final double operand) throws Throwable {
  final Object result = getInternalMetaClass().doPrefixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("++", "double");

    return result;
  }

  public Object prefixIncrement(final BigInteger operand) throws Throwable {
  final Object result = getInternalMetaClass().doPrefixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("++", this.getTheClass(operand).getName());

    return result;
  }

  public Object prefixIncrement(final BigDecimal operand) throws Throwable {
  final Object result = getInternalMetaClass().doPrefixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("++", this.getTheClass(operand).getName());

    return result;
  }

  public Object prefixDecrement(final int operand) throws Throwable {
  final Object result = getInternalMetaClass().doPrefixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("--", "int");

    return result;
  }

  public Object prefixDecrement(final long operand) throws Throwable {
  final Object result = getInternalMetaClass().doPrefixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("--", "long");

    return result;
  }

  public Object prefixDecrement(final float operand) throws Throwable {
  final Object result = getInternalMetaClass().doPrefixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("--", "float");

    return result;
  }

  public Object prefixDecrement(final double operand) throws Throwable {
  final Object result = getInternalMetaClass().doPrefixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("--", "double");

    return result;
  }

  public Object prefixDecrement(final BigInteger operand) throws Throwable {
  final Object result = getInternalMetaClass().doPrefixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("--", this.getTheClass(operand).getName());

    return result;
  }

  public Object prefixDecrement(final BigDecimal operand) throws Throwable {
  final Object result = getInternalMetaClass().doPrefixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("--", this.getTheClass(operand).getName());

    return result;
  }

  public Object postfixIncrement(final int operand) throws Throwable {
  final Object result = getInternalMetaClass().doPostfixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("++", "int");

    return result;
  }

  public Object postfixIncrement(final long operand) throws Throwable {
  final Object result = getInternalMetaClass().doPostfixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("++", "long");

    return result;
  }

  public Object postfixIncrement(final float operand) throws Throwable {
  final Object result = getInternalMetaClass().doPostfixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("++", "float");

    return result;
  }

  public Object postfixIncrement(final double operand) throws Throwable {
  final Object result = getInternalMetaClass().doPostfixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("++", "double");

    return result;
  }

  public Object postfixIncrement(final BigInteger operand) throws Throwable {
  final Object result = getInternalMetaClass().doPostfixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("++", this.getTheClass(operand).getName());

    return result;
  }

  public Object postfixIncrement(final BigDecimal operand) throws Throwable {
  final Object result = getInternalMetaClass().doPostfixIncrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("++", this.getTheClass(operand).getName());

    return result;
  }

  public Object postfixDecrement(final int operand) throws Throwable {
  final Object result = getInternalMetaClass().doPostfixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("--", "int");

    return result;
  }

  public Object postfixDecrement(final long operand) throws Throwable {
  final Object result = getInternalMetaClass().doPostfixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("--", "long");

    return result;
  }

  public Object postfixDecrement(final float operand) throws Throwable {
  final Object result = getInternalMetaClass().doPostfixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("--", "float");

    return result;
  }

  public Object postfixDecrement(final double operand) throws Throwable {
  final Object result = getInternalMetaClass().doPostfixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("--", "double");

    return result;
  }

  public Object postfixDecrement(final BigInteger operand) throws Throwable {
  final Object result = getInternalMetaClass().doPostfixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("--", this.getTheClass(operand).getName());

    return result;
  }

  public Object postfixDecrement(final BigDecimal operand) throws Throwable {
  final Object result = getInternalMetaClass().doPostfixDecrement(operand);

    // TODO: make this error more detailed.
    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("--", this.getTheClass(operand).getName());
    return result;
  }


  //
  //   Methods callable from compiler generated code for operator +
  //
  
  public Object add(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", byte.class);
      
    return result;
  }

  public Object add(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", char.class);
      
    return result;
  }

  public Object add(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", short.class);
      
    return result;
  }

  public Object add(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", int.class);
      
    return result;
  }

  public Object add(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", long.class);
      
    return result;
  }

  public Object add(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", float.class);
      
    return result;
  }

  public Object add(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", double.class);
      
    return result;
  }

  public Object add(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", BigInteger.class);
      
    return result;
  }

  public Object add(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", byte.class);
      
    return result;
  }

  public Object add(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", char.class);
      
    return result;
  }

  public Object add(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", short.class);
      
    return result;
  }

  public Object add(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", int.class);
      
    return result;
  }

  public Object add(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", long.class);
      
    return result;
  }

  public Object add(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", float.class);
      
    return result;
  }

  public Object add(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", double.class);
      
    return result;
  }

  public Object add(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", BigInteger.class);
      
    return result;
  }

  public Object add(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", byte.class);
      
    return result;
  }

  public Object add(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", char.class);
      
    return result;
  }

  public Object add(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", short.class);
      
    return result;
  }

  public Object add(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", int.class);
      
    return result;
  }

  public Object add(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", long.class);
      
    return result;
  }

  public Object add(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", float.class);
      
    return result;
  }

  public Object add(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", double.class);
      
    return result;
  }

  public Object add(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", BigInteger.class);
      
    return result;
  }

  public Object add(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", byte.class);
      
    return result;
  }

  public Object add(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", char.class);
      
    return result;
  }

  public Object add(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", short.class);
      
    return result;
  }

  public Object add(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", int.class);
      
    return result;
  }

  public Object add(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", long.class);
      
    return result;
  }

  public Object add(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", float.class);
      
    return result;
  }

  public Object add(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", double.class);
      
    return result;
  }

  public Object add(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", BigInteger.class);
      
    return result;
  }

  public Object add(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", byte.class);
      
    return result;
  }

  public Object add(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", char.class);
      
    return result;
  }

  public Object add(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", short.class);
      
    return result;
  }

  public Object add(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", int.class);
      
    return result;
  }

  public Object add(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", long.class);
      
    return result;
  }

  public Object add(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", float.class);
      
    return result;
  }

  public Object add(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", double.class);
      
    return result;
  }

  public Object add(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", BigInteger.class);
      
    return result;
  }

  public Object add(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", byte.class);
      
    return result;
  }

  public Object add(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", char.class);
      
    return result;
  }

  public Object add(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", short.class);
      
    return result;
  }

  public Object add(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", int.class);
      
    return result;
  }

  public Object add(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", long.class);
      
    return result;
  }

  public Object add(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", float.class);
      
    return result;
  }

  public Object add(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", double.class);
      
    return result;
  }

  public Object add(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", BigInteger.class);
      
    return result;
  }

  public Object add(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", byte.class);
      
    return result;
  }

  public Object add(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", char.class);
      
    return result;
  }

  public Object add(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", short.class);
      
    return result;
  }

  public Object add(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", int.class);
      
    return result;
  }

  public Object add(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", long.class);
      
    return result;
  }

  public Object add(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", float.class);
      
    return result;
  }

  public Object add(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", double.class);
      
    return result;
  }

  public Object add(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", BigInteger.class);
      
    return result;
  }

  public Object add(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", byte.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", char.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", short.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", int.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", long.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", float.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", double.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", BigInteger.class);
      
    return result;
  }

  public Object add(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", byte.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", char.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", short.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", int.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", long.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", float.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", double.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", BigInteger.class);
      
    return result;
  }

  public Object add(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", BigDecimal.class);
      
    return result;
  }

  public Object add(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", byte.class);
        
    return result;
  }

  public Object add(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", char.class);
        
    return result;
  }

  public Object add(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", short.class);
        
    return result;
  }

  public Object add(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", int.class);
        
    return result;
  }

  public Object add(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", long.class);
        
    return result;
  }

  public Object add(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", float.class);
        
    return result;
  }

  public Object add(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", double.class);
        
    return result;
  }

  public Object add(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", BigInteger.class);
        
    return result;
  }

  public Object add(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", BigDecimal.class);
        
    return result;
  }

  public Object reverseAdd(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAdd(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAdd(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAdd(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAdd(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAdd(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAdd(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAdd(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAdd(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator +=
  //
  
  public Object addEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", char.class);
      
    return result;
  }

  public Object addEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", short.class);
      
    return result;
  }

  public Object addEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", int.class);
      
    return result;
  }

  public Object addEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", long.class);
      
    return result;
  }

  public Object addEquals(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", float.class);
      
    return result;
  }

  public Object addEquals(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", double.class);
      
    return result;
  }

  public Object addEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", char.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", short.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", int.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", long.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", float.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", double.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", char.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", short.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", int.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", long.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", float.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", double.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", char.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", short.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", int.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", long.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", float.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", double.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", char.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", short.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", int.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", long.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", float.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", double.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", char.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", short.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", int.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", long.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", float.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", double.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", char.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", short.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", int.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", long.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", float.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", double.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", char.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", short.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", int.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", long.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", float.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", double.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", byte.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", char.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", short.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", int.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", long.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", float.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", double.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", BigInteger.class);
      
    return result;
  }

  public Object addEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", BigDecimal.class);
      
    return result;
  }

  public Object addEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", byte.class);
        
    return result;
  }

  public Object addEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", char.class);
        
    return result;
  }

  public Object addEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", short.class);
        
    return result;
  }

  public Object addEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", int.class);
        
    return result;
  }

  public Object addEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", long.class);
        
    return result;
  }

  public Object addEquals(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", float.class);
        
    return result;
  }

  public Object addEquals(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", double.class);
        
    return result;
  }

  public Object addEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", BigInteger.class);
        
    return result;
  }

  public Object addEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", BigDecimal.class);
        
    return result;
  }

  public Object reverseAddEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAddEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAddEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAddEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAddEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAddEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAddEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAddEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAddEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator -
  //
  
  public Object subtract(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", byte.class);
      
    return result;
  }

  public Object subtract(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", char.class);
      
    return result;
  }

  public Object subtract(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", short.class);
      
    return result;
  }

  public Object subtract(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", int.class);
      
    return result;
  }

  public Object subtract(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", long.class);
      
    return result;
  }

  public Object subtract(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", float.class);
      
    return result;
  }

  public Object subtract(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", double.class);
      
    return result;
  }

  public Object subtract(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", byte.class);
      
    return result;
  }

  public Object subtract(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", char.class);
      
    return result;
  }

  public Object subtract(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", short.class);
      
    return result;
  }

  public Object subtract(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", int.class);
      
    return result;
  }

  public Object subtract(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", long.class);
      
    return result;
  }

  public Object subtract(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", float.class);
      
    return result;
  }

  public Object subtract(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", double.class);
      
    return result;
  }

  public Object subtract(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", byte.class);
      
    return result;
  }

  public Object subtract(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", char.class);
      
    return result;
  }

  public Object subtract(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", short.class);
      
    return result;
  }

  public Object subtract(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", int.class);
      
    return result;
  }

  public Object subtract(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", long.class);
      
    return result;
  }

  public Object subtract(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", float.class);
      
    return result;
  }

  public Object subtract(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", double.class);
      
    return result;
  }

  public Object subtract(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", byte.class);
      
    return result;
  }

  public Object subtract(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", char.class);
      
    return result;
  }

  public Object subtract(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", short.class);
      
    return result;
  }

  public Object subtract(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", int.class);
      
    return result;
  }

  public Object subtract(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", long.class);
      
    return result;
  }

  public Object subtract(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", float.class);
      
    return result;
  }

  public Object subtract(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", double.class);
      
    return result;
  }

  public Object subtract(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", byte.class);
      
    return result;
  }

  public Object subtract(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", char.class);
      
    return result;
  }

  public Object subtract(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", short.class);
      
    return result;
  }

  public Object subtract(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", int.class);
      
    return result;
  }

  public Object subtract(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", long.class);
      
    return result;
  }

  public Object subtract(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", float.class);
      
    return result;
  }

  public Object subtract(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", double.class);
      
    return result;
  }

  public Object subtract(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", byte.class);
      
    return result;
  }

  public Object subtract(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", char.class);
      
    return result;
  }

  public Object subtract(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", short.class);
      
    return result;
  }

  public Object subtract(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", int.class);
      
    return result;
  }

  public Object subtract(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", long.class);
      
    return result;
  }

  public Object subtract(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", float.class);
      
    return result;
  }

  public Object subtract(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", double.class);
      
    return result;
  }

  public Object subtract(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", byte.class);
      
    return result;
  }

  public Object subtract(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", char.class);
      
    return result;
  }

  public Object subtract(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", short.class);
      
    return result;
  }

  public Object subtract(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", int.class);
      
    return result;
  }

  public Object subtract(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", long.class);
      
    return result;
  }

  public Object subtract(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", float.class);
      
    return result;
  }

  public Object subtract(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", double.class);
      
    return result;
  }

  public Object subtract(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", byte.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", char.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", short.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", int.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", long.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", float.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", double.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", byte.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", char.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", short.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", int.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", long.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", float.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", double.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", BigInteger.class);
      
    return result;
  }

  public Object subtract(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", BigDecimal.class);
      
    return result;
  }

  public Object subtract(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", byte.class);
        
    return result;
  }

  public Object subtract(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", char.class);
        
    return result;
  }

  public Object subtract(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", short.class);
        
    return result;
  }

  public Object subtract(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", int.class);
        
    return result;
  }

  public Object subtract(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", long.class);
        
    return result;
  }

  public Object subtract(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", float.class);
        
    return result;
  }

  public Object subtract(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", double.class);
        
    return result;
  }

  public Object subtract(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", BigInteger.class);
        
    return result;
  }

  public Object subtract(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", BigDecimal.class);
        
    return result;
  }

  public Object reverseSubtract(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtract(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtract(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtract(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtract(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtract(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtract(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtract(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtract(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator -=
  //
  
  public Object subtractEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", byte.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", char.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", short.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", int.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", long.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", float.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", double.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", BigInteger.class);
      
    return result;
  }

  public Object subtractEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", BigDecimal.class);
      
    return result;
  }

  public Object subtractEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", byte.class);
        
    return result;
  }

  public Object subtractEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", char.class);
        
    return result;
  }

  public Object subtractEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", short.class);
        
    return result;
  }

  public Object subtractEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", int.class);
        
    return result;
  }

  public Object subtractEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", long.class);
        
    return result;
  }

  public Object subtractEquals(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", float.class);
        
    return result;
  }

  public Object subtractEquals(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", double.class);
        
    return result;
  }

  public Object subtractEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", BigInteger.class);
        
    return result;
  }

  public Object subtractEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", BigDecimal.class);
        
    return result;
  }

  public Object reverseSubtractEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtractEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtractEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtractEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtractEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtractEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtractEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtractEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseSubtractEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator *
  //
  
  public Object multiply(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", byte.class);
      
    return result;
  }

  public Object multiply(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", char.class);
      
    return result;
  }

  public Object multiply(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", short.class);
      
    return result;
  }

  public Object multiply(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", int.class);
      
    return result;
  }

  public Object multiply(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", long.class);
      
    return result;
  }

  public Object multiply(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", float.class);
      
    return result;
  }

  public Object multiply(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", double.class);
      
    return result;
  }

  public Object multiply(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", byte.class);
      
    return result;
  }

  public Object multiply(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", char.class);
      
    return result;
  }

  public Object multiply(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", short.class);
      
    return result;
  }

  public Object multiply(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", int.class);
      
    return result;
  }

  public Object multiply(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", long.class);
      
    return result;
  }

  public Object multiply(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", float.class);
      
    return result;
  }

  public Object multiply(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", double.class);
      
    return result;
  }

  public Object multiply(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", byte.class);
      
    return result;
  }

  public Object multiply(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", char.class);
      
    return result;
  }

  public Object multiply(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", short.class);
      
    return result;
  }

  public Object multiply(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", int.class);
      
    return result;
  }

  public Object multiply(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", long.class);
      
    return result;
  }

  public Object multiply(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", float.class);
      
    return result;
  }

  public Object multiply(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", double.class);
      
    return result;
  }

  public Object multiply(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", byte.class);
      
    return result;
  }

  public Object multiply(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", char.class);
      
    return result;
  }

  public Object multiply(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", short.class);
      
    return result;
  }

  public Object multiply(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", int.class);
      
    return result;
  }

  public Object multiply(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", long.class);
      
    return result;
  }

  public Object multiply(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", float.class);
      
    return result;
  }

  public Object multiply(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", double.class);
      
    return result;
  }

  public Object multiply(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", byte.class);
      
    return result;
  }

  public Object multiply(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", char.class);
      
    return result;
  }

  public Object multiply(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", short.class);
      
    return result;
  }

  public Object multiply(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", int.class);
      
    return result;
  }

  public Object multiply(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", long.class);
      
    return result;
  }

  public Object multiply(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", float.class);
      
    return result;
  }

  public Object multiply(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", double.class);
      
    return result;
  }

  public Object multiply(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", byte.class);
      
    return result;
  }

  public Object multiply(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", char.class);
      
    return result;
  }

  public Object multiply(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", short.class);
      
    return result;
  }

  public Object multiply(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", int.class);
      
    return result;
  }

  public Object multiply(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", long.class);
      
    return result;
  }

  public Object multiply(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", float.class);
      
    return result;
  }

  public Object multiply(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", double.class);
      
    return result;
  }

  public Object multiply(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", byte.class);
      
    return result;
  }

  public Object multiply(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", char.class);
      
    return result;
  }

  public Object multiply(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", short.class);
      
    return result;
  }

  public Object multiply(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", int.class);
      
    return result;
  }

  public Object multiply(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", long.class);
      
    return result;
  }

  public Object multiply(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", float.class);
      
    return result;
  }

  public Object multiply(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", double.class);
      
    return result;
  }

  public Object multiply(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", byte.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", char.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", short.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", int.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", long.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", float.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", double.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", byte.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", char.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", short.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", int.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", long.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", float.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", double.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", BigInteger.class);
      
    return result;
  }

  public Object multiply(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", BigDecimal.class);
      
    return result;
  }

  public Object multiply(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", byte.class);
        
    return result;
  }

  public Object multiply(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", char.class);
        
    return result;
  }

  public Object multiply(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", short.class);
        
    return result;
  }

  public Object multiply(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", int.class);
        
    return result;
  }

  public Object multiply(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", long.class);
        
    return result;
  }

  public Object multiply(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", float.class);
        
    return result;
  }

  public Object multiply(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", double.class);
        
    return result;
  }

  public Object multiply(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", BigInteger.class);
        
    return result;
  }

  public Object multiply(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", BigDecimal.class);
        
    return result;
  }

  public Object reverseMultiply(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiply(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiply(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiply(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiply(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiply(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiply(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiply(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiply(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator *=
  //
  
  public Object multiplyEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", byte.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", char.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", short.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", int.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", long.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", float.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", double.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", BigInteger.class);
      
    return result;
  }

  public Object multiplyEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", BigDecimal.class);
      
    return result;
  }

  public Object multiplyEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", byte.class);
        
    return result;
  }

  public Object multiplyEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", char.class);
        
    return result;
  }

  public Object multiplyEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", short.class);
        
    return result;
  }

  public Object multiplyEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", int.class);
        
    return result;
  }

  public Object multiplyEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", long.class);
        
    return result;
  }

  public Object multiplyEquals(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", float.class);
        
    return result;
  }

  public Object multiplyEquals(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", double.class);
        
    return result;
  }

  public Object multiplyEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", BigInteger.class);
        
    return result;
  }

  public Object multiplyEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", BigDecimal.class);
        
    return result;
  }

  public Object reverseMultiplyEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiplyEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiplyEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiplyEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiplyEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiplyEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiplyEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiplyEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseMultiplyEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator /
  //
  
  public Object divide(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", byte.class);
      
    return result;
  }

  public Object divide(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", char.class);
      
    return result;
  }

  public Object divide(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", short.class);
      
    return result;
  }

  public Object divide(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", int.class);
      
    return result;
  }

  public Object divide(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", long.class);
      
    return result;
  }

  public Object divide(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", float.class);
      
    return result;
  }

  public Object divide(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", double.class);
      
    return result;
  }

  public Object divide(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", byte.class);
      
    return result;
  }

  public Object divide(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", char.class);
      
    return result;
  }

  public Object divide(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", short.class);
      
    return result;
  }

  public Object divide(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", int.class);
      
    return result;
  }

  public Object divide(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", long.class);
      
    return result;
  }

  public Object divide(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", float.class);
      
    return result;
  }

  public Object divide(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", double.class);
      
    return result;
  }

  public Object divide(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", byte.class);
      
    return result;
  }

  public Object divide(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", char.class);
      
    return result;
  }

  public Object divide(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", short.class);
      
    return result;
  }

  public Object divide(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", int.class);
      
    return result;
  }

  public Object divide(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", long.class);
      
    return result;
  }

  public Object divide(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", float.class);
      
    return result;
  }

  public Object divide(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", double.class);
      
    return result;
  }

  public Object divide(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", byte.class);
      
    return result;
  }

  public Object divide(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", char.class);
      
    return result;
  }

  public Object divide(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", short.class);
      
    return result;
  }

  public Object divide(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", int.class);
      
    return result;
  }

  public Object divide(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", long.class);
      
    return result;
  }

  public Object divide(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", float.class);
      
    return result;
  }

  public Object divide(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", double.class);
      
    return result;
  }

  public Object divide(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", byte.class);
      
    return result;
  }

  public Object divide(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", char.class);
      
    return result;
  }

  public Object divide(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", short.class);
      
    return result;
  }

  public Object divide(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", int.class);
      
    return result;
  }

  public Object divide(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", long.class);
      
    return result;
  }

  public Object divide(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", float.class);
      
    return result;
  }

  public Object divide(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", double.class);
      
    return result;
  }

  public Object divide(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", byte.class);
      
    return result;
  }

  public Object divide(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", char.class);
      
    return result;
  }

  public Object divide(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", short.class);
      
    return result;
  }

  public Object divide(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", int.class);
      
    return result;
  }

  public Object divide(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", long.class);
      
    return result;
  }

  public Object divide(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", float.class);
      
    return result;
  }

  public Object divide(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", double.class);
      
    return result;
  }

  public Object divide(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", byte.class);
      
    return result;
  }

  public Object divide(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", char.class);
      
    return result;
  }

  public Object divide(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", short.class);
      
    return result;
  }

  public Object divide(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", int.class);
      
    return result;
  }

  public Object divide(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", long.class);
      
    return result;
  }

  public Object divide(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", float.class);
      
    return result;
  }

  public Object divide(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", double.class);
      
    return result;
  }

  public Object divide(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", byte.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", char.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", short.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", int.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", long.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", float.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", double.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", byte.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", char.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", short.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", int.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", long.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", float.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", double.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", BigInteger.class);
      
    return result;
  }

  public Object divide(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", BigDecimal.class);
      
    return result;
  }

  public Object divide(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", byte.class);
        
    return result;
  }

  public Object divide(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", char.class);
        
    return result;
  }

  public Object divide(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", short.class);
        
    return result;
  }

  public Object divide(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", int.class);
        
    return result;
  }

  public Object divide(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", long.class);
        
    return result;
  }

  public Object divide(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", float.class);
        
    return result;
  }

  public Object divide(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", double.class);
        
    return result;
  }

  public Object divide(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", BigInteger.class);
        
    return result;
  }

  public Object divide(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", BigDecimal.class);
        
    return result;
  }

  public Object reverseDivide(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivide(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivide(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivide(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivide(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivide(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivide(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivide(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivide(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator /=
  //
  
  public Object divideEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", byte.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", char.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", short.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", int.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", long.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", float.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", double.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", BigInteger.class);
      
    return result;
  }

  public Object divideEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", BigDecimal.class);
      
    return result;
  }

  public Object divideEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", byte.class);
        
    return result;
  }

  public Object divideEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", char.class);
        
    return result;
  }

  public Object divideEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", short.class);
        
    return result;
  }

  public Object divideEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", int.class);
        
    return result;
  }

  public Object divideEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", long.class);
        
    return result;
  }

  public Object divideEquals(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", float.class);
        
    return result;
  }

  public Object divideEquals(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", double.class);
        
    return result;
  }

  public Object divideEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", BigInteger.class);
        
    return result;
  }

  public Object divideEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", BigDecimal.class);
        
    return result;
  }

  public Object reverseDivideEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivideEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivideEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivideEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivideEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivideEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivideEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivideEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseDivideEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator %
  //
  
  public Object remainder(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%", byte.class);
      
    return result;
  }

  public Object remainder(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%", char.class);
      
    return result;
  }

  public Object remainder(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%", short.class);
      
    return result;
  }

  public Object remainder(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%", int.class);
      
    return result;
  }

  public Object remainder(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%", long.class);
      
    return result;
  }

  public Object remainder(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%", BigInteger.class);
      
    return result;
  }

  public Object remainder(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%", byte.class);
      
    return result;
  }

  public Object remainder(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%", char.class);
      
    return result;
  }

  public Object remainder(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%", short.class);
      
    return result;
  }

  public Object remainder(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%", int.class);
      
    return result;
  }

  public Object remainder(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%", long.class);
      
    return result;
  }

  public Object remainder(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%", BigInteger.class);
      
    return result;
  }

  public Object remainder(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%", byte.class);
      
    return result;
  }

  public Object remainder(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%", char.class);
      
    return result;
  }

  public Object remainder(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%", short.class);
      
    return result;
  }

  public Object remainder(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%", int.class);
      
    return result;
  }

  public Object remainder(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%", long.class);
      
    return result;
  }

  public Object remainder(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%", BigInteger.class);
      
    return result;
  }

  public Object remainder(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%", byte.class);
      
    return result;
  }

  public Object remainder(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%", char.class);
      
    return result;
  }

  public Object remainder(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%", short.class);
      
    return result;
  }

  public Object remainder(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%", int.class);
      
    return result;
  }

  public Object remainder(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%", long.class);
      
    return result;
  }

  public Object remainder(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%", BigInteger.class);
      
    return result;
  }

  public Object remainder(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%", byte.class);
      
    return result;
  }

  public Object remainder(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%", char.class);
      
    return result;
  }

  public Object remainder(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%", short.class);
      
    return result;
  }

  public Object remainder(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%", int.class);
      
    return result;
  }

  public Object remainder(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%", long.class);
      
    return result;
  }

  public Object remainder(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%", BigInteger.class);
      
    return result;
  }

  public Object remainder(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", byte.class);
      
    return result;
  }

  public Object remainder(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", char.class);
      
    return result;
  }

  public Object remainder(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", short.class);
      
    return result;
  }

  public Object remainder(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", int.class);
      
    return result;
  }

  public Object remainder(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", long.class);
      
    return result;
  }

  public Object remainder(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", BigInteger.class);
      
    return result;
  }

  public Object remainder(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", byte.class);
        
    return result;
  }

  public Object remainder(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", char.class);
        
    return result;
  }

  public Object remainder(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", short.class);
        
    return result;
  }

  public Object remainder(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", int.class);
        
    return result;
  }

  public Object remainder(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", long.class);
        
    return result;
  }

  public Object remainder(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", BigInteger.class);
        
    return result;
  }

  public Object reverseRemainder(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainder(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainder(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainder(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainder(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainder(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator %=
  //
  
  public Object remainderEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%=", byte.class);
      
    return result;
  }

  public Object remainderEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%=", char.class);
      
    return result;
  }

  public Object remainderEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%=", short.class);
      
    return result;
  }

  public Object remainderEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%=", int.class);
      
    return result;
  }

  public Object remainderEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%=", long.class);
      
    return result;
  }

  public Object remainderEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%=", BigInteger.class);
      
    return result;
  }

  public Object remainderEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%=", byte.class);
      
    return result;
  }

  public Object remainderEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%=", char.class);
      
    return result;
  }

  public Object remainderEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%=", short.class);
      
    return result;
  }

  public Object remainderEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%=", int.class);
      
    return result;
  }

  public Object remainderEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%=", long.class);
      
    return result;
  }

  public Object remainderEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%=", BigInteger.class);
      
    return result;
  }

  public Object remainderEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%=", byte.class);
      
    return result;
  }

  public Object remainderEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%=", char.class);
      
    return result;
  }

  public Object remainderEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%=", short.class);
      
    return result;
  }

  public Object remainderEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%=", int.class);
      
    return result;
  }

  public Object remainderEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%=", long.class);
      
    return result;
  }

  public Object remainderEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%=", BigInteger.class);
      
    return result;
  }

  public Object remainderEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%=", byte.class);
      
    return result;
  }

  public Object remainderEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%=", char.class);
      
    return result;
  }

  public Object remainderEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%=", short.class);
      
    return result;
  }

  public Object remainderEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%=", int.class);
      
    return result;
  }

  public Object remainderEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%=", long.class);
      
    return result;
  }

  public Object remainderEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%=", BigInteger.class);
      
    return result;
  }

  public Object remainderEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%=", byte.class);
      
    return result;
  }

  public Object remainderEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%=", char.class);
      
    return result;
  }

  public Object remainderEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%=", short.class);
      
    return result;
  }

  public Object remainderEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%=", int.class);
      
    return result;
  }

  public Object remainderEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%=", long.class);
      
    return result;
  }

  public Object remainderEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%=", BigInteger.class);
      
    return result;
  }

  public Object remainderEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", byte.class);
      
    return result;
  }

  public Object remainderEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", char.class);
      
    return result;
  }

  public Object remainderEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", short.class);
      
    return result;
  }

  public Object remainderEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", int.class);
      
    return result;
  }

  public Object remainderEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", long.class);
      
    return result;
  }

  public Object remainderEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", BigInteger.class);
      
    return result;
  }

  public Object remainderEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", byte.class);
        
    return result;
  }

  public Object remainderEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", char.class);
        
    return result;
  }

  public Object remainderEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", short.class);
        
    return result;
  }

  public Object remainderEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", int.class);
        
    return result;
  }

  public Object remainderEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", long.class);
        
    return result;
  }

  public Object remainderEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", BigInteger.class);
        
    return result;
  }

  public Object reverseRemainderEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "%=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainderEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "%=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainderEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "%=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainderEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "%=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainderEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "%=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseRemainderEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "%=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator �
  //
  
  public Object integerDivide(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�", byte.class);
      
    return result;
  }

  public Object integerDivide(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�", char.class);
      
    return result;
  }

  public Object integerDivide(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�", short.class);
      
    return result;
  }

  public Object integerDivide(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�", int.class);
      
    return result;
  }

  public Object integerDivide(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�", long.class);
      
    return result;
  }

  public Object integerDivide(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�", float.class);
      
    return result;
  }

  public Object integerDivide(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�", double.class);
      
    return result;
  }

  public Object integerDivide(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�", byte.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�", char.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�", short.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�", int.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�", long.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�", float.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�", double.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�", byte.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�", char.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�", short.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�", int.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�", long.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�", float.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�", double.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�", byte.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�", char.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�", short.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�", int.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�", long.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�", float.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�", double.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�", byte.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�", char.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�", short.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�", int.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�", long.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�", float.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�", double.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�", byte.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�", char.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�", short.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�", int.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�", long.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�", float.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�", double.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�", byte.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�", char.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�", short.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�", int.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�", long.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�", float.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�", double.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", byte.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", char.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", short.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", int.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", long.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", float.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", double.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", byte.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", char.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", short.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", int.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", long.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", float.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", double.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", BigInteger.class);
      
    return result;
  }

  public Object integerDivide(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", BigDecimal.class);
      
    return result;
  }

  public Object integerDivide(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", byte.class);
        
    return result;
  }

  public Object integerDivide(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", char.class);
        
    return result;
  }

  public Object integerDivide(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", short.class);
        
    return result;
  }

  public Object integerDivide(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", int.class);
        
    return result;
  }

  public Object integerDivide(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", long.class);
        
    return result;
  }

  public Object integerDivide(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", float.class);
        
    return result;
  }

  public Object integerDivide(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", double.class);
        
    return result;
  }

  public Object integerDivide(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", BigInteger.class);
        
    return result;
  }

  public Object integerDivide(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", BigDecimal.class);
        
    return result;
  }

  public Object reverseIntegerDivide(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivide(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivide(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivide(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivide(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivide(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivide(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivide(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivide(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator �=
  //
  
  public Object integerDivideEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", byte.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", char.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", short.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", int.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", long.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", float.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", double.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", BigInteger.class);
      
    return result;
  }

  public Object integerDivideEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", BigDecimal.class);
      
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", byte.class);
        
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", char.class);
        
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", short.class);
        
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", int.class);
        
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", long.class);
        
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", float.class);
        
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", double.class);
        
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", BigInteger.class);
        
    return result;
  }

  public Object integerDivideEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", BigDecimal.class);
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "�=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "�=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "�=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "�=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "�=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "�=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "�=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseIntegerDivideEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "�=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator <<
  //
  
  public Object leftShift(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<", byte.class);
      
    return result;
  }

  public Object leftShift(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<", char.class);
      
    return result;
  }

  public Object leftShift(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<", short.class);
      
    return result;
  }

  public Object leftShift(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<", int.class);
      
    return result;
  }

  public Object leftShift(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<", long.class);
      
    return result;
  }

  public Object leftShift(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<", BigInteger.class);
      
    return result;
  }

  public Object leftShift(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<", byte.class);
      
    return result;
  }

  public Object leftShift(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<", char.class);
      
    return result;
  }

  public Object leftShift(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<", short.class);
      
    return result;
  }

  public Object leftShift(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<", int.class);
      
    return result;
  }

  public Object leftShift(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<", long.class);
      
    return result;
  }

  public Object leftShift(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<", BigInteger.class);
      
    return result;
  }

  public Object leftShift(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<", byte.class);
      
    return result;
  }

  public Object leftShift(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<", char.class);
      
    return result;
  }

  public Object leftShift(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<", short.class);
      
    return result;
  }

  public Object leftShift(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<", int.class);
      
    return result;
  }

  public Object leftShift(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<", long.class);
      
    return result;
  }

  public Object leftShift(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<", BigInteger.class);
      
    return result;
  }

  public Object leftShift(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<", byte.class);
      
    return result;
  }

  public Object leftShift(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<", char.class);
      
    return result;
  }

  public Object leftShift(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<", short.class);
      
    return result;
  }

  public Object leftShift(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<", int.class);
      
    return result;
  }

  public Object leftShift(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<", long.class);
      
    return result;
  }

  public Object leftShift(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<", BigInteger.class);
      
    return result;
  }

  public Object leftShift(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<", byte.class);
      
    return result;
  }

  public Object leftShift(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<", char.class);
      
    return result;
  }

  public Object leftShift(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<", short.class);
      
    return result;
  }

  public Object leftShift(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<", int.class);
      
    return result;
  }

  public Object leftShift(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<", long.class);
      
    return result;
  }

  public Object leftShift(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<", BigInteger.class);
      
    return result;
  }

  public Object leftShift(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", byte.class);
      
    return result;
  }

  public Object leftShift(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", char.class);
      
    return result;
  }

  public Object leftShift(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", short.class);
      
    return result;
  }

  public Object leftShift(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", int.class);
      
    return result;
  }

  public Object leftShift(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", long.class);
      
    return result;
  }

  public Object leftShift(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", BigInteger.class);
      
    return result;
  }

  public Object leftShift(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", byte.class);
        
    return result;
  }

  public Object leftShift(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", char.class);
        
    return result;
  }

  public Object leftShift(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", short.class);
        
    return result;
  }

  public Object leftShift(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", int.class);
        
    return result;
  }

  public Object leftShift(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", long.class);
        
    return result;
  }

  public Object leftShift(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", BigInteger.class);
        
    return result;
  }

  public Object reverseLeftShift(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShift(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShift(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShift(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShift(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShift(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator <<=
  //
  
  public Object leftShiftEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<=", byte.class);
      
    return result;
  }

  public Object leftShiftEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<=", char.class);
      
    return result;
  }

  public Object leftShiftEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<=", short.class);
      
    return result;
  }

  public Object leftShiftEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<=", int.class);
      
    return result;
  }

  public Object leftShiftEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<=", long.class);
      
    return result;
  }

  public Object leftShiftEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<=", BigInteger.class);
      
    return result;
  }

  public Object leftShiftEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<=", byte.class);
      
    return result;
  }

  public Object leftShiftEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<=", char.class);
      
    return result;
  }

  public Object leftShiftEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<=", short.class);
      
    return result;
  }

  public Object leftShiftEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<=", int.class);
      
    return result;
  }

  public Object leftShiftEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<=", long.class);
      
    return result;
  }

  public Object leftShiftEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<=", BigInteger.class);
      
    return result;
  }

  public Object leftShiftEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<=", byte.class);
      
    return result;
  }

  public Object leftShiftEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<=", char.class);
      
    return result;
  }

  public Object leftShiftEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<=", short.class);
      
    return result;
  }

  public Object leftShiftEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<=", int.class);
      
    return result;
  }

  public Object leftShiftEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<=", long.class);
      
    return result;
  }

  public Object leftShiftEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<=", BigInteger.class);
      
    return result;
  }


  public Object leftShiftEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<=", byte.class);
      
    return result;
  }

  public Object leftShiftEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<=", char.class);
      
    return result;
  }

  public Object leftShiftEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<=", short.class);
      
    return result;
  }

  public Object leftShiftEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<=", int.class);
      
    return result;
  }

  public Object leftShiftEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<=", long.class);
      
    return result;
  }

  public Object leftShiftEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<=", BigInteger.class);
      
    return result;
  }

  public Object leftShiftEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<=", byte.class);
      
    return result;
  }

  public Object leftShiftEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<=", char.class);
      
    return result;
  }

  public Object leftShiftEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<=", short.class);
      
    return result;
  }

  public Object leftShiftEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<=", int.class);
      
    return result;
  }

  public Object leftShiftEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<=", long.class);
      
    return result;
  }

  public Object leftShiftEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<=", BigInteger.class);
      
    return result;
  }

  public Object leftShiftEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", byte.class);
      
    return result;
  }

  public Object leftShiftEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", char.class);
      
    return result;
  }

  public Object leftShiftEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", short.class);
      
    return result;
  }

  public Object leftShiftEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", int.class);
      
    return result;
  }

  public Object leftShiftEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", long.class);
      
    return result;
  }

  public Object leftShiftEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", BigInteger.class);
      
    return result;
  }

  public Object leftShiftEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", byte.class);
        
    return result;
  }

  public Object leftShiftEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", char.class);
        
    return result;
  }

  public Object leftShiftEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", short.class);
        
    return result;
  }

  public Object leftShiftEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", int.class);
        
    return result;
  }

  public Object leftShiftEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", long.class);
        
    return result;
  }

  public Object leftShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", BigInteger.class);
        
    return result;
  }

  public Object reverseLeftShiftEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShiftEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShiftEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShiftEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShiftEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLeftShiftEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator >>>
  //
  
  public Object logicalRightShift(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>", byte.class);
      
    return result;
  }

  public Object logicalRightShift(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>", char.class);
      
    return result;
  }

  public Object logicalRightShift(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>", short.class);
      
    return result;
  }

  public Object logicalRightShift(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>", int.class);
      
    return result;
  }

  public Object logicalRightShift(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>", long.class);
      
    return result;
  }

  public Object logicalRightShift(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShift(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>", byte.class);
      
    return result;
  }

  public Object logicalRightShift(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>", char.class);
      
    return result;
  }

  public Object logicalRightShift(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>", short.class);
      
    return result;
  }

  public Object logicalRightShift(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>", int.class);
      
    return result;
  }

  public Object logicalRightShift(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>", long.class);
      
    return result;
  }

  public Object logicalRightShift(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShift(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>", byte.class);
      
    return result;
  }

  public Object logicalRightShift(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>", char.class);
      
    return result;
  }

  public Object logicalRightShift(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>", short.class);
      
    return result;
  }

  public Object logicalRightShift(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>", int.class);
      
    return result;
  }

  public Object logicalRightShift(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>", long.class);
      
    return result;
  }

  public Object logicalRightShift(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShift(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>", byte.class);
      
    return result;
  }

  public Object logicalRightShift(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>", char.class);
      
    return result;
  }

  public Object logicalRightShift(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>", short.class);
      
    return result;
  }

  public Object logicalRightShift(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>", int.class);
      
    return result;
  }

  public Object logicalRightShift(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>", long.class);
      
    return result;
  }

  public Object logicalRightShift(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShift(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>", byte.class);
      
    return result;
  }

  public Object logicalRightShift(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>", char.class);
      
    return result;
  }

  public Object logicalRightShift(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>", short.class);
      
    return result;
  }

  public Object logicalRightShift(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>", int.class);
      
    return result;
  }

  public Object logicalRightShift(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>", long.class);
      
    return result;
  }

  public Object logicalRightShift(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShift(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>", byte.class);
        
    return result;
  }

  public Object logicalRightShift(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>", char.class);
        
    return result;
  }

  public Object logicalRightShift(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>", short.class);
        
    return result;
  }

  public Object logicalRightShift(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>", int.class);
        
    return result;
  }

  public Object logicalRightShift(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>", long.class);
        
    return result;
  }

  public Object logicalRightShift(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>", BigInteger.class);
        
    return result;
  }

  public Object reverseLogicalRightShift(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLogicalRightShift(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLogicalRightShift(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLogicalRightShift(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLogicalRightShift(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator >>>=
  //
  
  public Object logicalRightShiftEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>=", byte.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>=", char.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>=", short.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>=", int.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>=", long.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>=", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>=", byte.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>=", char.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>=", short.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>=", int.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>=", long.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>=", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>=", byte.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>=", char.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>=", short.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>=", int.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>=", long.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>=", BigInteger.class);
      
    return result;
  }


  public Object logicalRightShiftEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>=", byte.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>=", char.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>=", short.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>=", int.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>=", long.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>=", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>=", byte.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>=", char.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>=", short.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>=", int.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>=", long.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>=", BigInteger.class);
      
    return result;
  }

  public Object logicalRightShiftEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>=", byte.class);
        
    return result;
  }

  public Object logicalRightShiftEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>=", char.class);
        
    return result;
  }

  public Object logicalRightShiftEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>=", short.class);
        
    return result;
  }

  public Object logicalRightShiftEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>=", int.class);
        
    return result;
  }

  public Object logicalRightShiftEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>=", long.class);
        
    return result;
  }

  public Object logicalRightShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>>=", BigInteger.class);
        
    return result;
  }

  public Object reverseLogicalRightShiftEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLogicalRightShiftEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLogicalRightShiftEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLogicalRightShiftEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLogicalRightShiftEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator >>
  //
  
  public Object arithmeticRightShift(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>", byte.class);
      
    return result;
  }

  public Object arithmeticRightShift(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>", char.class);
      
    return result;
  }

  public Object arithmeticRightShift(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>", short.class);
      
    return result;
  }

  public Object arithmeticRightShift(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>", int.class);
      
    return result;
  }

  public Object arithmeticRightShift(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>", long.class);
      
    return result;
  }

  public Object arithmeticRightShift(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShift(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>", byte.class);
      
    return result;
  }

  public Object arithmeticRightShift(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>", char.class);
      
    return result;
  }

  public Object arithmeticRightShift(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>", short.class);
      
    return result;
  }

  public Object arithmeticRightShift(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>", int.class);
      
    return result;
  }

  public Object arithmeticRightShift(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>", long.class);
      
    return result;
  }

  public Object arithmeticRightShift(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShift(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>", byte.class);
      
    return result;
  }

  public Object arithmeticRightShift(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>", char.class);
      
    return result;
  }

  public Object arithmeticRightShift(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>", short.class);
      
    return result;
  }

  public Object arithmeticRightShift(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>", int.class);
      
    return result;
  }

  public Object arithmeticRightShift(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>", long.class);
      
    return result;
  }

  public Object arithmeticRightShift(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShift(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>", byte.class);
      
    return result;
  }

  public Object arithmeticRightShift(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>", char.class);
      
    return result;
  }

  public Object arithmeticRightShift(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>", short.class);
      
    return result;
  }

  public Object arithmeticRightShift(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>", int.class);
      
    return result;
  }

  public Object arithmeticRightShift(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>", long.class);
      
    return result;
  }

  public Object arithmeticRightShift(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShift(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>", byte.class);
      
    return result;
  }

  public Object arithmeticRightShift(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>", char.class);
      
    return result;
  }

  public Object arithmeticRightShift(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>", short.class);
      
    return result;
  }

  public Object arithmeticRightShift(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>", int.class);
      
    return result;
  }

  public Object arithmeticRightShift(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>", long.class);
      
    return result;
  }

  public Object arithmeticRightShift(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShift(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", byte.class);
      
    return result;
  }

  public Object arithmeticRightShift(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", char.class);
      
    return result;
  }

  public Object arithmeticRightShift(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", short.class);
      
    return result;
  }

  public Object arithmeticRightShift(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", int.class);
      
    return result;
  }

  public Object arithmeticRightShift(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", long.class);
      
    return result;
  }

  public Object arithmeticRightShift(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShift(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", byte.class);
        
    return result;
  }

  public Object arithmeticRightShift(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", char.class);
        
    return result;
  }

  public Object arithmeticRightShift(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", short.class);
        
    return result;
  }

  public Object arithmeticRightShift(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", int.class);
        
    return result;
  }

  public Object arithmeticRightShift(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", long.class);
        
    return result;
  }

  public Object arithmeticRightShift(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", BigInteger.class);
        
    return result;
  }

  public Object reverseArithmeticRightShift(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShift(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShift(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShift(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShift(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShift(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator >>=
  //
  
  public Object arithmeticRightShiftEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>=", byte.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>=", char.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>=", short.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>=", int.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>=", long.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>=", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>=", byte.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>=", char.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>=", short.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>=", int.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>=", long.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>=", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>=", byte.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>=", char.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>=", short.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>=", int.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>=", long.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>=", BigInteger.class);
      
    return result;
  }


  public Object arithmeticRightShiftEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>=", byte.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>=", char.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>=", short.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>=", int.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>=", long.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>=", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>=", byte.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>=", char.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>=", short.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>=", int.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>=", long.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>=", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", byte.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", char.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", short.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", int.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", long.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", BigInteger.class);
      
    return result;
  }

  public Object arithmeticRightShiftEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", byte.class);
        
    return result;
  }

  public Object arithmeticRightShiftEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", char.class);
        
    return result;
  }

  public Object arithmeticRightShiftEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", short.class);
        
    return result;
  }

  public Object arithmeticRightShiftEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", int.class);
        
    return result;
  }

  public Object arithmeticRightShiftEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", long.class);
        
    return result;
  }

  public Object arithmeticRightShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", BigInteger.class);
        
    return result;
  }

  public Object reverseArithmeticRightShiftEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShiftEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShiftEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShiftEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShiftEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseArithmeticRightShiftEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator |
  //
  
  public Object or(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|", byte.class);
      
    return result;
  }

  public Object or(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|", char.class);
      
    return result;
  }

  public Object or(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|", short.class);
      
    return result;
  }

  public Object or(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|", int.class);
      
    return result;
  }

  public Object or(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|", long.class);
      
    return result;
  }

  public Object or(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|", BigInteger.class);
      
    return result;
  }

  public Object or(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|", byte.class);
      
    return result;
  }

  public Object or(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|", char.class);
      
    return result;
  }

  public Object or(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|", short.class);
      
    return result;
  }

  public Object or(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|", int.class);
      
    return result;
  }

  public Object or(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|", long.class);
      
    return result;
  }

  public Object or(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|", BigInteger.class);
      
    return result;
  }

  public Object or(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|", byte.class);
      
    return result;
  }

  public Object or(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|", char.class);
      
    return result;
  }

  public Object or(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|", short.class);
      
    return result;
  }

  public Object or(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|", int.class);
      
    return result;
  }

  public Object or(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|", long.class);
      
    return result;
  }

  public Object or(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|", BigInteger.class);
      
    return result;
  }

  public Object or(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|", byte.class);
      
    return result;
  }

  public Object or(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|", char.class);
      
    return result;
  }

  public Object or(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|", short.class);
      
    return result;
  }

  public Object or(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|", int.class);
      
    return result;
  }

  public Object or(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|", long.class);
      
    return result;
  }

  public Object or(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|", BigInteger.class);
      
    return result;
  }

  public Object or(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|", byte.class);
      
    return result;
  }

  public Object or(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|", char.class);
      
    return result;
  }

  public Object or(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|", short.class);
      
    return result;
  }

  public Object or(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|", int.class);
      
    return result;
  }

  public Object or(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|", long.class);
      
    return result;
  }

  public Object or(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|", BigInteger.class);
      
    return result;
  }

  public Object or(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", byte.class);
      
    return result;
  }

  public Object or(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", char.class);
      
    return result;
  }

  public Object or(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", short.class);
      
    return result;
  }

  public Object or(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", int.class);
      
    return result;
  }

  public Object or(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", long.class);
      
    return result;
  }

  public Object or(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", BigInteger.class);
      
    return result;
  }

  public Object or(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", byte.class);
        
    return result;
  }

  public Object or(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", char.class);
        
    return result;
  }

  public Object or(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", short.class);
        
    return result;
  }

  public Object or(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", int.class);
        
    return result;
  }

  public Object or(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", long.class);
        
    return result;
  }

  public Object or(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", BigInteger.class);
        
    return result;
  }

  public Object reverseOr(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOr(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOr(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOr(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOr(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOr(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator |=
  //
  
  public Object orEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|=", byte.class);
      
    return result;
  }

  public Object orEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|=", char.class);
      
    return result;
  }

  public Object orEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|=", short.class);
      
    return result;
  }

  public Object orEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|=", int.class);
      
    return result;
  }

  public Object orEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|=", long.class);
      
    return result;
  }

  public Object orEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|=", BigInteger.class);
      
    return result;
  }

  public Object orEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|=", byte.class);
      
    return result;
  }

  public Object orEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|=", char.class);
      
    return result;
  }

  public Object orEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|=", short.class);
      
    return result;
  }

  public Object orEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|=", int.class);
      
    return result;
  }

  public Object orEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|=", long.class);
      
    return result;
  }

  public Object orEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|=", BigInteger.class);
      
    return result;
  }

  public Object orEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|=", byte.class);
      
    return result;
  }

  public Object orEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|=", char.class);
      
    return result;
  }

  public Object orEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|=", short.class);
      
    return result;
  }

  public Object orEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|=", int.class);
      
    return result;
  }

  public Object orEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|=", long.class);
      
    return result;
  }

  public Object orEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|=", BigInteger.class);
      
    return result;
  }

  public Object orEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|=", byte.class);
      
    return result;
  }

  public Object orEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|=", char.class);
      
    return result;
  }

  public Object orEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|=", short.class);
      
    return result;
  }

  public Object orEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|=", int.class);
      
    return result;
  }

  public Object orEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|=", long.class);
      
    return result;
  }

  public Object orEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|=", BigInteger.class);
      
    return result;
  }

  public Object orEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|=", byte.class);
      
    return result;
  }

  public Object orEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|=", char.class);
      
    return result;
  }

  public Object orEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|=", short.class);
      
    return result;
  }

  public Object orEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|=", int.class);
      
    return result;
  }

  public Object orEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|=", long.class);
      
    return result;
  }

  public Object orEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|=", BigInteger.class);
      
    return result;
  }

  public Object orEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", byte.class);
      
    return result;
  }

  public Object orEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", char.class);
      
    return result;
  }

  public Object orEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", short.class);
      
    return result;
  }

  public Object orEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", int.class);
      
    return result;
  }

  public Object orEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", long.class);
      
    return result;
  }

  public Object orEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", BigInteger.class);
      
    return result;
  }

  public Object orEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", byte.class);
        
    return result;
  }

  public Object orEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", char.class);
        
    return result;
  }

  public Object orEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", short.class);
        
    return result;
  }

  public Object orEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", int.class);
        
    return result;
  }

  public Object orEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", long.class);
        
    return result;
  }

  public Object orEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", BigInteger.class);
        
    return result;
  }

  public Object reverseOrEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "|=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOrEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "|=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOrEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "|=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOrEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "|=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOrEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "|=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "|=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator ^
  //
  
  public Object xor(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^", byte.class);
      
    return result;
  }

  public Object xor(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^", char.class);
      
    return result;
  }

  public Object xor(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^", short.class);
      
    return result;
  }

  public Object xor(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^", int.class);
      
    return result;
  }

  public Object xor(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^", long.class);
      
    return result;
  }

  public Object xor(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^", BigInteger.class);
      
    return result;
  }

  public Object xor(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^", byte.class);
      
    return result;
  }

  public Object xor(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^", char.class);
      
    return result;
  }

  public Object xor(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^", short.class);
      
    return result;
  }

  public Object xor(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^", int.class);
      
    return result;
  }

  public Object xor(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^", long.class);
      
    return result;
  }

  public Object xor(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^", BigInteger.class);
      
    return result;
  }

  public Object xor(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^", byte.class);
      
    return result;
  }

  public Object xor(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^", char.class);
      
    return result;
  }

  public Object xor(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^", short.class);
      
    return result;
  }

  public Object xor(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^", int.class);
      
    return result;
  }

  public Object xor(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^", long.class);
      
    return result;
  }

  public Object xor(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^", BigInteger.class);
      
    return result;
  }

  public Object xor(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^", byte.class);
      
    return result;
  }

  public Object xor(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^", char.class);
      
    return result;
  }

  public Object xor(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^", short.class);
      
    return result;
  }

  public Object xor(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^", int.class);
      
    return result;
  }

  public Object xor(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^", long.class);
      
    return result;
  }

  public Object xor(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^", BigInteger.class);
      
    return result;
  }

  public Object xor(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^", byte.class);
      
    return result;
  }

  public Object xor(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^", char.class);
      
    return result;
  }

  public Object xor(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^", short.class);
      
    return result;
  }

  public Object xor(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^", int.class);
      
    return result;
  }

  public Object xor(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^", long.class);
      
    return result;
  }
  
  public Object xor(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^", BigInteger.class);
      
    return result;
  }

  public Object xor(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", byte.class);
      
    return result;
  }

  public Object xor(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", char.class);
      
    return result;
  }

  public Object xor(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", short.class);
      
    return result;
  }

  public Object xor(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", int.class);
      
    return result;
  }

  public Object xor(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", long.class);
      
    return result;
  }

  public Object xor(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", BigInteger.class);
      
    return result;
  }

  public Object xor(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", byte.class);
        
    return result;
  }

  public Object xor(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", char.class);
        
    return result;
  }

  public Object xor(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", short.class);
        
    return result;
  }

  public Object xor(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", int.class);
        
    return result;
  }

  public Object xor(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", long.class);
        
    return result;
  }

  public Object xor(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", BigInteger.class);
        
    return result;
  }

  public Object reverseXor(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXor(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXor(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXor(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXor(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXor(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator ^=
  //
  
  public Object xorEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^=", byte.class);
      
    return result;
  }

  public Object xorEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^=", char.class);
      
    return result;
  }

  public Object xorEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^=", short.class);
      
    return result;
  }

  public Object xorEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^=", int.class);
      
    return result;
  }

  public Object xorEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^=", long.class);
      
    return result;
  }

  public Object xorEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^=", BigInteger.class);
      
    return result;
  }

  public Object xorEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^=", byte.class);
      
    return result;
  }

  public Object xorEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^=", char.class);
      
    return result;
  }

  public Object xorEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^=", short.class);
      
    return result;
  }

  public Object xorEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^=", int.class);
      
    return result;
  }

  public Object xorEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^=", long.class);
      
    return result;
  }

  public Object xorEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^=", BigInteger.class);
      
    return result;
  }

  public Object xorEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^=", byte.class);
      
    return result;
  }

  public Object xorEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^=", char.class);
      
    return result;
  }

  public Object xorEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^=", short.class);
      
    return result;
  }

  public Object xorEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^=", int.class);
      
    return result;
  }

  public Object xorEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^=", long.class);
      
    return result;
  }

  public Object xorEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^=", BigInteger.class);
      
    return result;
  }

  public Object xorEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^=", byte.class);
      
    return result;
  }

  public Object xorEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^=", char.class);
      
    return result;
  }

  public Object xorEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^=", short.class);
      
    return result;
  }

  public Object xorEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^=", int.class);
      
    return result;
  }

  public Object xorEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^=", long.class);
      
    return result;
  }

  public Object xorEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^=", BigInteger.class);
      
    return result;
  }

  public Object xorEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^=", byte.class);
      
    return result;
  }

  public Object xorEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^=", char.class);
      
    return result;
  }

  public Object xorEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^=", short.class);
      
    return result;
  }

  public Object xorEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^=", int.class);
      
    return result;
  }

  public Object xorEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^=", long.class);
      
    return result;
  }

  public Object xorEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^=", BigInteger.class);
      
    return result;
  }

  public Object xorEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", byte.class);
      
    return result;
  }

  public Object xorEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", char.class);
      
    return result;
  }

  public Object xorEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", short.class);
      
    return result;
  }

  public Object xorEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", int.class);
      
    return result;
  }

  public Object xorEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", long.class);
      
    return result;
  }

  public Object xorEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", BigInteger.class);
      
    return result;
  }

  public Object xorEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", byte.class);
        
    return result;
  }

  public Object xorEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", char.class);
        
    return result;
  }

  public Object xorEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", short.class);
        
    return result;
  }

  public Object xorEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", int.class);
        
    return result;
  }

  public Object xorEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", long.class);
        
    return result;
  }

  public Object xorEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", BigInteger.class);
        
    return result;
  }

  public Object reverseXorEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "^=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXorEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "^=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXorEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "^=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXorEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "^=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXorEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "^=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseXorEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "^=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator &
  //
  
  public Object and(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&", byte.class);
      
    return result;
  }

  public Object and(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&", char.class);
      
    return result;
  }

  public Object and(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&", short.class);
      
    return result;
  }

  public Object and(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&", int.class);
      
    return result;
  }

  public Object and(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&", long.class);
      
    return result;
  }

  public Object and(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&", BigInteger.class);
      
    return result;
  }

  public Object and(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&", byte.class);
      
    return result;
  }

  public Object and(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&", char.class);
      
    return result;
  }

  public Object and(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&", short.class);
      
    return result;
  }

  public Object and(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&", int.class);
      
    return result;
  }

  public Object and(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&", long.class);
      
    return result;
  }

  public Object and(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&", BigInteger.class);
      
    return result;
  }

  public Object and(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&", byte.class);
      
    return result;
  }

  public Object and(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&", char.class);
      
    return result;
  }

  public Object and(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&", short.class);
      
    return result;
  }

  public Object and(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&", int.class);
      
    return result;
  }

  public Object and(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&", long.class);
      
    return result;
  }

  public Object and(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&", BigInteger.class);
      
    return result;
  }

  public Object and(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&", byte.class);
      
    return result;
  }

  public Object and(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&", char.class);
      
    return result;
  }

  public Object and(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&", short.class);
      
    return result;
  }

  public Object and(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&", int.class);
      
    return result;
  }

  public Object and(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&", long.class);
      
    return result;
  }

  public Object and(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&", BigInteger.class);
      
    return result;
  }

  public Object and(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&", byte.class);
      
    return result;
  }

  public Object and(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&", char.class);
      
    return result;
  }

  public Object and(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&", short.class);
      
    return result;
  }

  public Object and(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&", int.class);
      
    return result;
  }

  public Object and(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&", long.class);
      
    return result;
  }

  public Object and(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&", BigInteger.class);
      
    return result;
  }

  public Object and(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", byte.class);
      
    return result;
  }

  public Object and(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", char.class);
      
    return result;
  }

  public Object and(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", short.class);
      
    return result;
  }

  public Object and(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", int.class);
      
    return result;
  }

  public Object and(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", long.class);
      
    return result;
  }

  public Object and(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", BigInteger.class);
      
    return result;
  }

  public Object and(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", byte.class);
        
    return result;
  }

  public Object and(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", char.class);
        
    return result;
  }

  public Object and(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", short.class);
        
    return result;
  }

  public Object and(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", int.class);
        
    return result;
  }

  public Object and(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", long.class);
        
    return result;
  }

  public Object and(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", BigInteger.class);
        
    return result;
  }

  public Object reverseAnd(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAnd(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAnd(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAnd(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAnd(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAnd(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator &=
  //
  
  public Object andEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&=", byte.class);
      
    return result;
  }

  public Object andEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&=", char.class);
      
    return result;
  }

  public Object andEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&=", short.class);
      
    return result;
  }

  public Object andEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&=", int.class);
      
    return result;
  }

  public Object andEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&=", long.class);
      
    return result;
  }

  public Object andEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&=", BigInteger.class);
      
    return result;
  }

  public Object andEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&=", byte.class);
      
    return result;
  }

  public Object andEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&=", char.class);
      
    return result;
  }

  public Object andEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&=", short.class);
      
    return result;
  }

  public Object andEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&=", int.class);
      
    return result;
  }

  public Object andEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&=", long.class);
      
    return result;
  }

  public Object andEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&=", BigInteger.class);
      
    return result;
  }

  public Object andEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&=", byte.class);
      
    return result;
  }

  public Object andEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&=", char.class);
      
    return result;
  }

  public Object andEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&=", short.class);
      
    return result;
  }

  public Object andEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&=", int.class);
      
    return result;
  }

  public Object andEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&=", long.class);
      
    return result;
  }

  public Object andEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&=", BigInteger.class);
      
    return result;
  }


  public Object andEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&=", byte.class);
      
    return result;
  }

  public Object andEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&=", char.class);
      
    return result;
  }

  public Object andEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&=", short.class);
      
    return result;
  }

  public Object andEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&=", int.class);
      
    return result;
  }

  public Object andEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&=", long.class);
      
    return result;
  }

  public Object andEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&=", BigInteger.class);
      
    return result;
  }

  public Object andEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&=", byte.class);
      
    return result;
  }

  public Object andEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&=", char.class);
      
    return result;
  }

  public Object andEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&=", short.class);
      
    return result;
  }

  public Object andEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&=", int.class);
      
    return result;
  }

  public Object andEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&=", long.class);
      
    return result;
  }

  public Object andEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&=", BigInteger.class);
      
    return result;
  }

  public Object andEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", byte.class);
      
    return result;
  }

  public Object andEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", char.class);
      
    return result;
  }

  public Object andEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", short.class);
      
    return result;
  }

  public Object andEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", int.class);
      
    return result;
  }

  public Object andEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", long.class);
      
    return result;
  }

  public Object andEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", BigInteger.class);
      
    return result;
  }

  public Object andEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", byte.class);
        
    return result;
  }

  public Object andEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", char.class);
        
    return result;
  }

  public Object andEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", short.class);
        
    return result;
  }

  public Object andEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", int.class);
        
    return result;
  }

  public Object andEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", long.class);
        
    return result;
  }

  public Object andEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", BigInteger.class);
        
    return result;
  }

  public Object reverseAndEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "&=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAndEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "&=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAndEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "&=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAndEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "&=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAndEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "&=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseAndEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "&=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator <=>
  //
  
  public Object compare(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", byte.class);
      
    return result;
  }

  public Object compare(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", char.class);
      
    return result;
  }

  public Object compare(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", short.class);
      
    return result;
  }

  public Object compare(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", int.class);
      
    return result;
  }

  public Object compare(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", long.class);
      
    return result;
  }

  public Object compare(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", float.class);
      
    return result;
  }

  public Object compare(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", double.class);
      
    return result;
  }

  public Object compare(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", byte.class);
      
    return result;
  }

  public Object compare(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", char.class);
      
    return result;
  }

  public Object compare(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", short.class);
      
    return result;
  }

  public Object compare(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", int.class);
      
    return result;
  }

  public Object compare(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", long.class);
      
    return result;
  }

  public Object compare(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", float.class);
      
    return result;
  }

  public Object compare(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", double.class);
      
    return result;
  }

  public Object compare(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", byte.class);
      
    return result;
  }

  public Object compare(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", char.class);
      
    return result;
  }

  public Object compare(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", short.class);
      
    return result;
  }

  public Object compare(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", int.class);
      
    return result;
  }

  public Object compare(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", long.class);
      
    return result;
  }

  public Object compare(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", float.class);
      
    return result;
  }

  public Object compare(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", double.class);
      
    return result;
  }

  public Object compare(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", byte.class);
      
    return result;
  }

  public Object compare(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", char.class);
      
    return result;
  }

  public Object compare(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", short.class);
      
    return result;
  }

  public Object compare(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", int.class);
      
    return result;
  }

  public Object compare(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", long.class);
      
    return result;
  }

  public Object compare(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", float.class);
      
    return result;
  }

  public Object compare(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", double.class);
      
    return result;
  }

  public Object compare(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", byte.class);
      
    return result;
  }

  public Object compare(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", char.class);
      
    return result;
  }

  public Object compare(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", short.class);
      
    return result;
  }

  public Object compare(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", int.class);
      
    return result;
  }

  public Object compare(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", long.class);
      
    return result;
  }

  public Object compare(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", float.class);
      
    return result;
  }

  public Object compare(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", double.class);
      
    return result;
  }

  public Object compare(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", byte.class);
      
    return result;
  }

  public Object compare(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", char.class);
      
    return result;
  }

  public Object compare(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", short.class);
      
    return result;
  }

  public Object compare(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", int.class);
      
    return result;
  }

  public Object compare(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", long.class);
      
    return result;
  }

  public Object compare(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", float.class);
      
    return result;
  }

  public Object compare(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", double.class);
      
    return result;
  }

  public Object compare(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", byte.class);
      
    return result;
  }

  public Object compare(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", char.class);
      
    return result;
  }

  public Object compare(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", short.class);
      
    return result;
  }

  public Object compare(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", int.class);
      
    return result;
  }

  public Object compare(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", long.class);
      
    return result;
  }

  public Object compare(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", float.class);
      
    return result;
  }

  public Object compare(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", double.class);
      
    return result;
  }

  public Object compare(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", byte.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", char.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", short.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", int.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", long.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", float.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", double.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", byte.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", char.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", short.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", int.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", long.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", float.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", double.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", BigInteger.class);
      
    return result;
  }

  public Object compare(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", BigDecimal.class);
      
    return result;
  }

  public Object compare(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", byte.class);
        
    return result;
  }

  public Object compare(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", char.class);
        
    return result;
  }

  public Object compare(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", short.class);
        
    return result;
  }

  public Object compare(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", int.class);
        
    return result;
  }

  public Object compare(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", long.class);
        
    return result;
  }

  public Object compare(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", float.class);
        
    return result;
  }

  public Object compare(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", double.class);
        
    return result;
  }

  public Object compare(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", BigInteger.class);
        
    return result;
  }

  public Object compare(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", BigDecimal.class);
        
    return result;
  }

  public Object reverseCompare(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseCompare(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseCompare(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseCompare(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseCompare(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseCompare(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseCompare(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseCompare(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseCompare(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  //
  //   Methods callable from compiler generated code for operator ==
  //
  
  public Object equals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", byte.class);
      
    return result;
  }

  public Object equals(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", char.class);
      
    return result;
  }

  public Object equals(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", short.class);
      
    return result;
  }

  public Object equals(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", int.class);
      
    return result;
  }

  public Object equals(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", long.class);
      
    return result;
  }

  public Object equals(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", float.class);
      
    return result;
  }

  public Object equals(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", double.class);
      
    return result;
  }

  public Object equals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", byte.class);
      
    return result;
  }

  public Object equals(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", char.class);
      
    return result;
  }

  public Object equals(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", short.class);
      
    return result;
  }

  public Object equals(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", int.class);
      
    return result;
  }

  public Object equals(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", long.class);
      
    return result;
  }

  public Object equals(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", float.class);
      
    return result;
  }

  public Object equals(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", double.class);
      
    return result;
  }

  public Object equals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", byte.class);
      
    return result;
  }

  public Object equals(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", char.class);
      
    return result;
  }

  public Object equals(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", short.class);
      
    return result;
  }

  public Object equals(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", int.class);
      
    return result;
  }

  public Object equals(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", long.class);
      
    return result;
  }

  public Object equals(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", float.class);
      
    return result;
  }

  public Object equals(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", double.class);
      
    return result;
  }

  public Object equals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", byte.class);
      
    return result;
  }

  public Object equals(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", char.class);
      
    return result;
  }

  public Object equals(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", short.class);
      
    return result;
  }

  public Object equals(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", int.class);
      
    return result;
  }

  public Object equals(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", long.class);
      
    return result;
  }

  public Object equals(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", float.class);
      
    return result;
  }

  public Object equals(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", double.class);
      
    return result;
  }

  public Object equals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", byte.class);
      
    return result;
  }

  public Object equals(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", char.class);
      
    return result;
  }

  public Object equals(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", short.class);
      
    return result;
  }

  public Object equals(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", int.class);
      
    return result;
  }

  public Object equals(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", long.class);
      
    return result;
  }

  public Object equals(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", float.class);
      
    return result;
  }

  public Object equals(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", double.class);
      
    return result;
  }

  public Object equals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", byte.class);
      
    return result;
  }

  public Object equals(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", char.class);
      
    return result;
  }

  public Object equals(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", short.class);
      
    return result;
  }

  public Object equals(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", int.class);
      
    return result;
  }

  public Object equals(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", long.class);
      
    return result;
  }

  public Object equals(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", float.class);
      
    return result;
  }

  public Object equals(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", double.class);
      
    return result;
  }

  public Object equals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", byte.class);
      
    return result;
  }

  public Object equals(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", char.class);
      
    return result;
  }

  public Object equals(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", short.class);
      
    return result;
  }

  public Object equals(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", int.class);
      
    return result;
  }

  public Object equals(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", long.class);
      
    return result;
  }

  public Object equals(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", float.class);
      
    return result;
  }

  public Object equals(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", double.class);
      
    return result;
  }

  public Object equals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", byte.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", char.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", short.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", int.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", long.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", float.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", double.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", byte.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", char.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", short.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", int.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", long.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", float.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", double.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", BigInteger.class);
      
    return result;
  }

  public Object equals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", BigDecimal.class);
      
    return result;
  }

  public Object equals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", byte.class);
        
    return result;
  }

  public Object equals(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", char.class);
        
    return result;
  }

  public Object equals(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", short.class);
        
    return result;
  }

  public Object equals(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", int.class);
        
    return result;
  }

  public Object equals(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", long.class);
        
    return result;
  }

  public Object equals(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", float.class);
        
    return result;
  }

  public Object equals(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", double.class);
        
    return result;
  }

  public Object equals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", BigInteger.class);
        
    return result;
  }

  public Object equals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", BigDecimal.class);
        
    return result;
  }

  public Object reverseEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public boolean equalsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }
  
  public boolean equalsBoolean(final byte lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final byte lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final byte lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final byte lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final byte lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final byte lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final byte lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final byte lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final byte lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final char lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final short lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final int lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final long lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final float lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final double lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean equalsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseEqualsBoolean(lhs, rhs);
  }

  public boolean reverseEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseEqualsBoolean(lhs, rhs);
  }

  //
  //   Methods callable from compiler generated code for operator !=
  //
  
  public Object notEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", char.class);
      
    return result;
  }

  public Object notEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", short.class);
      
    return result;
  }

  public Object notEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", int.class);
      
    return result;
  }

  public Object notEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", long.class);
      
    return result;
  }

  public Object notEquals(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", float.class);
      
    return result;
  }

  public Object notEquals(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", double.class);
      
    return result;
  }

  public Object notEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", char.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", short.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", int.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", long.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", float.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", double.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", char.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", short.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", int.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", long.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", float.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", double.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", char.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", short.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", int.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", long.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", float.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", double.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", char.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", short.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", int.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", long.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", float.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", double.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", char.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", short.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", int.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", long.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", float.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", double.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", char.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", short.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", int.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", long.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", float.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", double.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", char.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", short.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", int.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", long.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", float.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", double.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", byte.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", char.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", short.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", int.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", long.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", float.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", double.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", BigInteger.class);
      
    return result;
  }

  public Object notEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", BigDecimal.class);
      
    return result;
  }

  public Object notEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", byte.class);
        
    return result;
  }

  public Object notEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", char.class);
        
    return result;
  }

  public Object notEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", short.class);
        
    return result;
  }

  public Object notEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", int.class);
        
    return result;
  }

  public Object notEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", long.class);
        
    return result;
  }

  public Object notEquals(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", float.class);
        
    return result;
  }

  public Object notEquals(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", double.class);
        
    return result;
  }

  public Object notEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", BigInteger.class);
        
    return result;
  }

  public Object notEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", BigDecimal.class);
        
    return result;
  }

  public Object reverseNotEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseNotEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseNotEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseNotEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseNotEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseNotEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseNotEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseNotEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseNotEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public boolean notEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }
  
  public boolean notEqualsBoolean(final byte lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final byte lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final byte lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final byte lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final byte lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final byte lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final byte lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final byte lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final byte lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final char lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final char lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final char lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final char lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final char lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final char lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final char lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final char lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final char lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final short lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final short lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final short lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final short lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final short lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final short lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final short lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final short lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final short lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final int lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final int lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final int lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final int lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final int lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final int lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final int lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final int lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final int lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final long lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final long lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final long lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final long lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final long lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final long lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final long lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final long lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final long lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final float lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final float lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final float lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final float lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final float lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final float lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final float lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final float lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final float lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final double lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final double lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final double lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final double lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final double lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final double lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final double lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final double lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final double lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigInteger lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigInteger lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigInteger lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigInteger lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigInteger lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigInteger lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigInteger lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigDecimal lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigDecimal lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigDecimal lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigDecimal lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigDecimal lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigDecimal lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigDecimal lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean notEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doNotEqualsBoolean(lhs, rhs);
  }

  public boolean reverseNotEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseNotEqualsBoolean(lhs, rhs);
  }

  public boolean reverseNotEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseNotEqualsBoolean(lhs, rhs);
  }

  public boolean reverseNotEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseNotEqualsBoolean(lhs, rhs);
  }

  public boolean reverseNotEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseNotEqualsBoolean(lhs, rhs);
  }

  public boolean reverseNotEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseNotEqualsBoolean(lhs, rhs);
  }

  public boolean reverseNotEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseNotEqualsBoolean(lhs, rhs);
  }

  public boolean reverseNotEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseNotEqualsBoolean(lhs, rhs);
  }

  public boolean reverseNotEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseNotEqualsBoolean(lhs, rhs);
  }

  public boolean reverseNotEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseNotEqualsBoolean(lhs, rhs);
  }

  //
  //   Methods callable from compiler generated code for operator <
  //
  
  public Object lessThan(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", byte.class);
      
    return result;
  }

  public Object lessThan(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", char.class);
      
    return result;
  }

  public Object lessThan(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", short.class);
      
    return result;
  }

  public Object lessThan(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", int.class);
      
    return result;
  }

  public Object lessThan(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", long.class);
      
    return result;
  }

  public Object lessThan(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", float.class);
      
    return result;
  }

  public Object lessThan(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", double.class);
      
    return result;
  }

  public Object lessThan(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", byte.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", char.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", short.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", int.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", long.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", float.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", double.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", byte.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", char.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", short.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", int.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", long.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", float.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", double.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", byte.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", char.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", short.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", int.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", long.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", float.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", double.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", byte.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", char.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", short.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", int.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", long.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", float.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", double.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", byte.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", char.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", short.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", int.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", long.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", float.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", double.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", byte.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", char.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", short.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", int.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", long.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", float.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", double.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", byte.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", char.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", short.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", int.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", long.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", float.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", double.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", byte.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", char.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", short.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", int.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", long.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", float.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", double.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", BigInteger.class);
      
    return result;
  }

  public Object lessThan(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", BigDecimal.class);
      
    return result;
  }

  public Object lessThan(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", byte.class);
        
    return result;
  }

  public Object lessThan(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", char.class);
        
    return result;
  }

  public Object lessThan(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", short.class);
        
    return result;
  }

  public Object lessThan(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", int.class);
        
    return result;
  }

  public Object lessThan(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", long.class);
        
    return result;
  }

  public Object lessThan(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", float.class);
        
    return result;
  }

  public Object lessThan(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", double.class);
        
    return result;
  }

  public Object lessThan(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", BigInteger.class);
        
    return result;
  }

  public Object lessThan(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", BigDecimal.class);
        
    return result;
  }

  public Object reverseLessThan(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThan(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThan(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThan(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThan(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThan(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThan(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThan(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThan(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public boolean lessThanBoolean(final Object lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }
  
  public boolean lessThanBoolean(final byte lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final byte lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final byte lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final byte lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final byte lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final byte lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final byte lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final byte lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final byte lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final char lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final char lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final char lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final char lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final char lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final char lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final char lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final char lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final char lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final short lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final short lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final short lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final short lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final short lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final short lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final short lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final short lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final short lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final int lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final int lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final int lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final int lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final int lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final int lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final int lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final int lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final int lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final long lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final long lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final long lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final long lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final long lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final long lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final long lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final long lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final long lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final float lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final float lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final float lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final float lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final float lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final float lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final float lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final float lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final float lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final double lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final double lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final double lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final double lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final double lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final double lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final double lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final double lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final double lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigInteger lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigInteger lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigInteger lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigInteger lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigInteger lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigInteger lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigInteger lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigDecimal lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigDecimal lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigDecimal lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigDecimal lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigDecimal lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigDecimal lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigDecimal lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final Object lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final Object lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final Object lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final Object lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final Object lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final Object lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final Object lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean lessThanBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanBoolean(lhs, rhs);
  }

  public boolean reverseLessThanBoolean(final byte lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanBoolean(lhs, rhs);
  }

  public boolean reverseLessThanBoolean(final char lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanBoolean(lhs, rhs);
  }

  public boolean reverseLessThanBoolean(final short lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanBoolean(lhs, rhs);
  }

  public boolean reverseLessThanBoolean(final int lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanBoolean(lhs, rhs);
  }

  public boolean reverseLessThanBoolean(final long lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanBoolean(lhs, rhs);
  }

  public boolean reverseLessThanBoolean(final float lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanBoolean(lhs, rhs);
  }

  public boolean reverseLessThanBoolean(final double lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanBoolean(lhs, rhs);
  }

  public boolean reverseLessThanBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanBoolean(lhs, rhs);
  }

  public boolean reverseLessThanBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanBoolean(lhs, rhs);
  }

  //
  //   Methods callable from compiler generated code for operator <=
  //
  
  public Object lessThanOrEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", byte.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", char.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", short.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", int.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", long.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", float.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", double.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", BigInteger.class);
      
    return result;
  }

  public Object lessThanOrEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", BigDecimal.class);
      
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", byte.class);
        
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", char.class);
        
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", short.class);
        
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", int.class);
        
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", long.class);
        
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", float.class);
        
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", double.class);
        
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", BigInteger.class);
        
    return result;
  }

  public Object lessThanOrEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", BigDecimal.class);
        
    return result;
  }

  public Object reverseLessThanOrEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThanOrEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThanOrEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThanOrEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThanOrEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThanOrEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThanOrEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThanOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseLessThanOrEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public boolean lessThanOrEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }
  
  public boolean lessThanOrEqualsBoolean(final byte lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final byte lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final byte lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final byte lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final byte lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final byte lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final byte lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final byte lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final byte lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final char lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final char lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final char lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final char lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final char lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final char lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final char lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final char lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final char lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final short lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final short lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final short lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final short lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final short lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final short lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final short lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final short lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final short lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final int lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final int lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final int lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final int lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final int lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final int lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final int lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final int lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final int lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final long lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final long lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final long lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final long lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final long lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final long lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final long lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final long lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final long lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final float lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final float lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final float lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final float lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final float lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final float lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final float lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final float lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final float lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final double lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final double lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final double lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final double lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final double lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final double lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final double lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final double lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final double lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean lessThanOrEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseLessThanOrEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseLessThanOrEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseLessThanOrEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseLessThanOrEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseLessThanOrEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseLessThanOrEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseLessThanOrEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseLessThanOrEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseLessThanOrEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseLessThanOrEqualsBoolean(lhs, rhs);
  }

  //
  //   Methods callable from compiler generated code for operator >
  //
  
  public Object greaterThan(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", char.class);
      
    return result;
  }

  public Object greaterThan(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", short.class);
      
    return result;
  }

  public Object greaterThan(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", int.class);
      
    return result;
  }

  public Object greaterThan(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", long.class);
      
    return result;
  }

  public Object greaterThan(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", float.class);
      
    return result;
  }

  public Object greaterThan(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", double.class);
      
    return result;
  }

  public Object greaterThan(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", char.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", short.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", int.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", long.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", float.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", double.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", char.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", short.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", int.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", long.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", float.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", double.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", char.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", short.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", int.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", long.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", float.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", double.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", char.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", short.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", int.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", long.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", float.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", double.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", char.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", short.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", int.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", long.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", float.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", double.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", char.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", short.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", int.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", long.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", float.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", double.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", char.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", short.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", int.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", long.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", float.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", double.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", byte.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", char.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", short.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", int.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", long.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", float.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", double.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", BigInteger.class);
      
    return result;
  }

  public Object greaterThan(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", BigDecimal.class);
      
    return result;
  }

  public Object greaterThan(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", byte.class);
        
    return result;
  }

  public Object greaterThan(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", char.class);
        
    return result;
  }

  public Object greaterThan(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", short.class);
        
    return result;
  }

  public Object greaterThan(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", int.class);
        
    return result;
  }

  public Object greaterThan(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", long.class);
        
    return result;
  }

  public Object greaterThan(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", float.class);
        
    return result;
  }

  public Object greaterThan(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", double.class);
        
    return result;
  }

  public Object greaterThan(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", BigInteger.class);
        
    return result;
  }

  public Object greaterThan(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", BigDecimal.class);
        
    return result;
  }

  public Object reverseGreaterThan(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThan(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThan(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThan(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThan(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThan(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThan(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThan(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThan(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public boolean greaterThanBoolean(final Object lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }
  
  public boolean greaterThanBoolean(final byte lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final byte lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final byte lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final byte lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final byte lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final byte lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final byte lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final byte lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final byte lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final char lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final char lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final char lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final char lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final char lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final char lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final char lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final char lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final char lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final short lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final short lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final short lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final short lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final short lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final short lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final short lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final short lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final short lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final int lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final int lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final int lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final int lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final int lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final int lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final int lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final int lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final int lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final long lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final long lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final long lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final long lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final long lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final long lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final long lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final long lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final long lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final float lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final float lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final float lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final float lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final float lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final float lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final float lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final float lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final float lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final double lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final double lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final double lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final double lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final double lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final double lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final double lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final double lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final double lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigInteger lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigInteger lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigInteger lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigInteger lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigInteger lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigInteger lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigInteger lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigDecimal lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigDecimal lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigDecimal lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigDecimal lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigDecimal lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigDecimal lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigDecimal lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final Object lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final Object lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final Object lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final Object lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final Object lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final Object lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final Object lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean greaterThanBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanBoolean(final byte lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanBoolean(final char lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanBoolean(final short lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanBoolean(final int lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanBoolean(final long lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanBoolean(final float lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanBoolean(final double lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanBoolean(lhs, rhs);
  }

  //
  //   Methods callable from compiler generated code for operator >=
  //
  
  public Object greaterThanOrEquals(final byte lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final byte lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final byte lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final byte lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final byte lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final byte lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final byte lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final byte lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final byte lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final char lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final short lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final int lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final long lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final float lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final double lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", byte.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", char.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", short.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", int.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", long.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", float.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", double.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", BigInteger.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", BigDecimal.class);
      
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final byte rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", byte.class);
        
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final char rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", char.class);
        
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final short rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", short.class);
        
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final int rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", int.class);
        
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final long rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", long.class);
        
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final float rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", float.class);
        
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final double rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", double.class);
        
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", BigInteger.class);
        
    return result;
  }

  public Object greaterThanOrEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", BigDecimal.class);
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final byte lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(byte.class, ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final char lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(char.class, ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final short lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(short.class, ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final int lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(int.class, ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final long lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(long.class, ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final float lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(float.class, ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final double lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(double.class, ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public Object reverseGreaterThanOrEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doReverseGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(NgSystem.metaClassRegistry.getMetaClass(lhs).getTheClass(lhs), ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
        
    return result;
  }

  public boolean greaterThanOrEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }
  
  public boolean greaterThanOrEqualsBoolean(final byte lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final byte lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final byte lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final byte lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final byte lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final byte lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final byte lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final byte lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final byte lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final char lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final char lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final char lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final char lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final char lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final char lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final char lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final char lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final char lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final short lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final short lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final short lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final short lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final short lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final short lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final short lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final short lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final short lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final int lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final int lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final int lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final int lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final int lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final int lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final int lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final int lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final int lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final long lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final long lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final long lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final long lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final long lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final long lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final long lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final long lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final long lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final float lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final float lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final float lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final float lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final float lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final float lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final float lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final float lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final float lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final double lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final double lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final double lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final double lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final double lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final double lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final double lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final double lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final double lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigInteger lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigInteger lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigInteger lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigInteger lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigInteger lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigInteger lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigInteger lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigInteger lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigInteger lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigDecimal lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigDecimal lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigDecimal lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigDecimal lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigDecimal lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigDecimal lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigDecimal lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigDecimal lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final BigDecimal lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean greaterThanOrEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return getInternalMetaClass().doGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanOrEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanOrEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanOrEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanOrEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanOrEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanOrEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanOrEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanOrEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanOrEqualsBoolean(lhs, rhs);
  }

  public boolean reverseGreaterThanOrEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return getInternalMetaClass().doReverseGreaterThanOrEqualsBoolean(lhs, rhs);
  }
}
