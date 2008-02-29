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
    assertEquals(tc.add().apply("", NgChar.valueOf('0')), "0");
    assertEquals(tc.add().apply(NgChar.valueOf('1'), ""), "1");
    assertEquals(tc.add().apply("", NgByte.valueOf((byte)2)), "2");
    assertEquals(tc.add().apply(NgByte.valueOf((byte)3), ""), "3");
    assertEquals(tc.add().apply("", NgShort.valueOf((short)4)), "4");
    assertEquals(tc.add().apply(NgShort.valueOf((short)5), ""), "5");
    assertEquals(tc.add().apply("", NgInt.valueOf(6)), "6");
    assertEquals(tc.add().apply(NgInt.valueOf(7), ""), "7");
    assertEquals(tc.add().apply("", NgLong.valueOf(8)), "8");
    assertEquals(tc.add().apply(NgLong.valueOf(9), ""), "9");
    assertEquals(tc.add().apply("", NgFloat.valueOf((float)10.5)), "10.5");
    assertEquals(tc.add().apply(NgFloat.valueOf((float)11.5), ""), "11.5");
    assertEquals(tc.add().apply("", NgDouble.valueOf(12.5)), "12.5");
    assertEquals(tc.add().apply(NgDouble.valueOf(13.5), ""), "13.5");
    assertEquals(tc.add().apply("", '0'), "0");
    assertEquals(tc.add().apply('1', ""), "1");
    assertEquals(tc.add().apply("", (byte)2), "2");
    assertEquals(tc.add().apply((byte)3, ""), "3");
    assertEquals(tc.add().apply("", (short)4), "4");
    assertEquals(tc.add().apply((short)5, ""), "5");
    assertEquals(tc.add().apply("", 6), "6");
    assertEquals(tc.add().apply(7, ""), "7");
    assertEquals(tc.add().apply("", (long)8), "8");
    assertEquals(tc.add().apply((long)9, ""), "9");
    assertEquals(tc.add().apply("", (float)10.5), "10.5");
    assertEquals(tc.add().apply((float)11.5, ""), "11.5");
    assertEquals(tc.add().apply("", 12.5), "12.5");
    assertEquals(tc.add().apply(13.5, ""), "13.5");
    assertEquals(tc.add().apply("", BigInteger.valueOf(14)), "14");
    assertEquals(tc.add().apply(BigInteger.valueOf(15), ""), "15");
    assertEquals(tc.add().apply("", BigDecimal.valueOf(16.5)), "16.5");
    assertEquals(tc.add().apply(BigDecimal.valueOf(17.5), ""), "17.5");
    assertEquals(tc.add().apply("18.5", ""), "18.5");
    assertEquals(tc.add().apply("19.5", PrimitiveMetaClasses.getStringMetaClass(), ""), "19.5");
    assertEquals(tc.add().apply(NgDouble.valueOf(13.5), PrimitiveMetaClasses.getStringMetaClass(), ""), "13.5");
    assertEquals(tc.add().apply("", PrimitiveMetaClasses.getDoubleMetaClass(), NgDouble.valueOf(12.5)), "12.5");
  }
}
