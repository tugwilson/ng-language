package ng.runtime.threadcontext;

import java.math.BigInteger;



/**
 * @author John
 *
 */
public interface BinaryLogicalOperation extends BinaryIntegralOperation {
  long longApply(char lhs, long rhs) throws NotPerformed;
  BigInteger bigIntegerApply(char lhs, BigInteger rhs) throws NotPerformed;

  long longApply(byte lhs, long rhs) throws NotPerformed;
  BigInteger bigIntegerApply(byte lhs, BigInteger rhs) throws NotPerformed;

  long longApply(short lhs, long rhs) throws NotPerformed;
  BigInteger bigIntegerApply(short lhs, BigInteger rhs) throws NotPerformed;

  long longApply(int lhs, long rhs) throws NotPerformed;
  BigInteger bigIntegerApply(int lhs, BigInteger rhs) throws NotPerformed;
}
