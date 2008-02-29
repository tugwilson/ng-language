package ng.runtime.threadcontext;

import ng.runtime.metaclass.BaseShiftOperation;


/**
 * @author John
 *
 */
public interface BinaryShiftOperation extends BaseShiftOperation, BinaryIntegralOperation {
  int intApply(char lhs, long rhs) throws NotPerformed;

  int intApply(byte lhs, long rhs) throws NotPerformed;

  int intApply(short lhs, long rhs) throws NotPerformed;

  int intApply(int lhs, long rhs) throws NotPerformed;
}
