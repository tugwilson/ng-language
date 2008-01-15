import java.math.BigInteger;

import ng.runtime.threadcontext.ThreadContext;


public class AdHocTest1 {

  /**
   * @param args
   */
  public static void main(final String[] args) {
    final ThreadContext tc = ThreadContext.getThreadContext();

    final Object a = tc.wrap(14);
    final Object b = tc.wrap(1.4d);
    System.out.println("a + b = " + tc.unwrapToDouble(tc.add().apply(a, b)));
    System.out.println("b + a = " + tc.unwrapToDouble(tc.add().apply(b, a)));
    System.out.println("14 + b = " + tc.unwrapToDouble(tc.add().apply(14, b)));
    System.out.println("b + 14 = " + tc.unwrapToDouble(tc.add().apply(b, 14)));
    System.out.println("a + 1.4d = " + tc.unwrapToDouble(tc.add().apply(a, 1.4d)));
    System.out.println("1.4d + a = " + tc.unwrapToDouble(tc.add().apply(1.4d, a)));
    System.out.println("14 + 1.4d = " + tc.unwrapToDouble(tc.add().apply(14, 1.4d)));
    System.out.println("1.4d + 14 = " + tc.unwrapToDouble(tc.add().apply(1.4d, 14)));
    System.out.println(tc.add().apply(0, new BigInteger("10000000000000000000000000000000000000000")));
  }
}
