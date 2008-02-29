package uk.co.wilson.ng.runtime.metaclass.primitives;

import ng.runtime.metaclass.BinaryOperation;
import ng.runtime.metaclass.LogicalBinaryOperation;
import ng.runtime.metaclass.ShiftOperation;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.BinaryLogicalOperationNoopImpl;
import uk.co.wilson.ng.runtime.metaclass.ShiftOperationNoopImpl;

/*
 * Created on 29 Feb 2008
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
public abstract class FractionalNumberMetaClassImpl extends BaseMetaClass {
  
  protected volatile LogicalBinaryOperation modifiedAnd = null;
  protected volatile LogicalBinaryOperation modifiedOr = null;
  protected volatile LogicalBinaryOperation modifiedXor = null;
  protected volatile ShiftOperation modifiedLeftShift = null;
  protected volatile ShiftOperation modifiedRightShift = null;
  protected volatile ShiftOperation modifiedUnsignedRightShift = null;

  /**
   * @param theClass
   */
  protected FractionalNumberMetaClassImpl(Class<?> theClass) {
    super(theClass);
  }

  public void modifyAnd(LogicalBinaryOperation modifiedAnd) {
    this.modifiedAnd = modifiedAnd;
  }

  public BinaryOperation getOriginalAnd() {
    return BinaryLogicalOperationNoopImpl.instance;
  }

  public void modifyOr(LogicalBinaryOperation modifiedOr) {
    this.modifiedOr = modifiedOr;
  }

  public BinaryOperation getOriginalOr() {
    return BinaryLogicalOperationNoopImpl.instance;
  }

  public void modifyXor(LogicalBinaryOperation modifiedXor) {
    this.modifiedXor = modifiedXor;
  }

  public BinaryOperation getOriginalXor() {
    return BinaryLogicalOperationNoopImpl.instance;
  }

  public void modifyLeftShift(ShiftOperation modifiedLeftShift) {
    this.modifiedLeftShift = modifiedLeftShift;
  }

  public BinaryOperation getOriginalLeftShift() {
    return ShiftOperationNoopImpl.instance;
  }

  public void modifyRightShift(ShiftOperation modifiedRightShift) {
    this.modifiedRightShift = modifiedRightShift;
  }

  public ShiftOperation getOriginalRightShift() {
    return ShiftOperationNoopImpl.instance;
  }

  public void modifyUnsignedRightShift(ShiftOperation modifiedUnsignedRightShift) {
    this.modifiedUnsignedRightShift = modifiedUnsignedRightShift;
  }

  public ShiftOperation getOriginalUnsignedRightShift() {
    return ShiftOperationNoopImpl.instance;
  }
}
