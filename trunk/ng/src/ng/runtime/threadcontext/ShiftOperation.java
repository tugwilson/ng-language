package ng.runtime.threadcontext;


/**
 * @author John
 *
 */
public interface ShiftOperation extends BinaryIntegralOperation { 
  int intApply(char lhs, long rhs) throws NotPerformed;
  
  int intApply(byte lhs, long rhs) throws NotPerformed;

  int intApply(short lhs, long rhs) throws NotPerformed;

  int intApply(int lhs, long rhs) throws NotPerformed;
}
