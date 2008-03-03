package ng.runtime.threadcontext;

import ng.runtime.metaclass.ShiftCategorySupport;


/**
 * @author John
 *
 */
public interface BinaryShiftOperation extends ShiftCategorySupport, BinaryIntegralOperation {
  int intApply(char lhs, long rhs) throws NotPerformed;

  int intApply(byte lhs, long rhs) throws NotPerformed;

  int intApply(short lhs, long rhs) throws NotPerformed;

  int intApply(int lhs, long rhs) throws NotPerformed;
}
