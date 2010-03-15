package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

import junit.framework.TestCase;
import ng.runtime.metaclass.util.PrimitiveMetaClasses;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 * 
 */
public class StringTest extends TestCase {
  public void testCatenation() {
    final ThreadContext tc = ThreadContext.getThreadContext();
    assertEquals(tc.add().apply("", tc.wrap('0')), "0");
    assertEquals(tc.add().apply(tc.wrap('1'), ""), "1");
    assertEquals(tc.add().apply("", tc.wrap((byte) 2)), "2");
    assertEquals(tc.add().apply(tc.wrap((byte) 3), ""), "3");
    assertEquals(tc.add().apply("", tc.wrap((short) 4)), "4");
    assertEquals(tc.add().apply(tc.wrap((short) 5), ""), "5");
    assertEquals(tc.add().apply("", tc.wrap(6)), "6");
    assertEquals(tc.add().apply(tc.wrap(7), ""), "7");
    assertEquals(tc.add().apply("", tc.wrap((long) 8)), "8");
    assertEquals(tc.add().apply(tc.wrap((long) 9), ""), "9");
    assertEquals(tc.add().apply("", tc.wrap((float) 10.5)), "10.5");
    assertEquals(tc.add().apply(tc.wrap((float) 11.5), ""), "11.5");
    assertEquals(tc.add().apply("", tc.wrap(12.5)), "12.5");
    assertEquals(tc.add().apply(tc.wrap(13.5), ""), "13.5");
    assertEquals(tc.add().apply("", '0'), "0");
    assertEquals(tc.add().apply('1', ""), "1");
    assertEquals(tc.add().apply("", (byte) 2), "2");
    assertEquals(tc.add().apply((byte) 3, ""), "3");
    assertEquals(tc.add().apply("", (short) 4), "4");
    assertEquals(tc.add().apply((short) 5, ""), "5");
    assertEquals(tc.add().apply("", 6), "6");
    assertEquals(tc.add().apply(7, ""), "7");
    assertEquals(tc.add().apply("", (long) 8), "8");
    assertEquals(tc.add().apply((long) 9, ""), "9");
    assertEquals(tc.add().apply("", (float) 10.5), "10.5");
    assertEquals(tc.add().apply((float) 11.5, ""), "11.5");
    assertEquals(tc.add().apply("", 12.5), "12.5");
    assertEquals(tc.add().apply(13.5, ""), "13.5");
    assertEquals(tc.add().apply("", BigInteger.valueOf(14)), "14");
    assertEquals(tc.add().apply(BigInteger.valueOf(15), ""), "15");
    assertEquals(tc.add().apply("", BigDecimal.valueOf(16.5)), "16.5");
    assertEquals(tc.add().apply(BigDecimal.valueOf(17.5), ""), "17.5");
    assertEquals(tc.add().apply("18.5", ""), "18.5");
    assertEquals(tc.add().apply("19.5", PrimitiveMetaClasses.getStringMetaClass(), ""), "19.5");
    assertEquals(tc.add().apply(tc.wrap(13.5), PrimitiveMetaClasses.getStringMetaClass(), ""), "13.5");
    assertEquals(tc.add().apply("", PrimitiveMetaClasses.getDoubleMetaClass(), tc.wrap(12.5)), "12.5");
  }
}
