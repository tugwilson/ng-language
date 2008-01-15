package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author John
 *
 */
public interface Callable {
  /**
   * @param instance
   * @param arguments
   * @return
   */
  Object doCall(ThreadContext tc, Object instance, Object[] arguments) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object doCallQuick(ThreadContext tc, Object instance) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object doCallQuick(ThreadContext tc, Object instance, Object p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object doCallQuick(ThreadContext tc, Object instance, boolean p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(ThreadContext tc, Object instance, char p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(ThreadContext tc, Object instance, byte p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(ThreadContext tc, Object instance, short p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object doCallQuick(ThreadContext tc, Object instance, int p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(ThreadContext tc, Object instance, long p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(ThreadContext tc, Object instance, float p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(ThreadContext tc, Object instance, double p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(ThreadContext tc, Object instance, BigInteger p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(ThreadContext tc, Object instance, BigDecimal p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @return
   */
  Object callQuick(ThreadContext tc, Object instance, Object p1, Object p2) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object callQuick(ThreadContext tc, Object instance, Object p1, Object p2, Object p3) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object callQuick(ThreadContext tc, Object instance, Object p1, Object p2, Object p3, Object p4) throws Throwable;
}
