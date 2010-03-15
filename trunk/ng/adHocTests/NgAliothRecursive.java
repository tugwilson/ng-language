import ng.runtime.BaseNgObject;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.CompiledNgObjectMethodContainer;

/*
 * Created on 3 Mar 2008
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

/*
 * 
 * NOTE: this is very much work in progress it does not represent how method
 * dispatch will be done in the final version
 * 
 * This is just fiddling with a dispatch mechanism
 */
public class NgAliothRecursive extends BaseNgObject {
  /*
   * (non-JavaDoc)
   * 
   * @see ng.lang.NgObject#getMetaClass()
   */
  public MetaClass getMetaClass() {
    return null;
  }

  private static CompiledNgObjectMethodContainer c0 = new CompiledNgObjectMethodContainer(0X01000000);

  private static CompiledNgObjectMethodContainer c1 = new CompiledNgObjectMethodContainer(0X01000001);

  public static void main(final String args[]) {
    final long start = System.currentTimeMillis();
    int n = Integer.parseInt(args[0]);
    final NgAliothRecursive self = new NgAliothRecursive();

    System.out.printf("Ack(3,%d): %d\n", n, self.ack(3, n));
    System.out.printf("Fib(%.1f): %.1f\n", 27.0 + n, self.fib(27.0 + n));

    n -= 1;
    System.out.printf("Tak(%d,%d,%d): %d\n", n * 3, n * 2, n, self.tak(n * 3, n * 2, n));

    System.out.printf("Fib(3): %d\n", self.fib(3));
    System.out.printf("Tak(3.0,2.0,1.0): %.1f\n", self.tak(3.0, 2.0, 1.0));
    System.out.println("Time: " + (System.currentTimeMillis() - start) + "ms");
  }

  @Override
  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final int p1) throws Throwable {
    switch (methodNumber) {
    case 0X01000000:
      return tc.wrap(NgAliothRecursive$fib(tc, this, p1));

    default:
      return super.ng$Call(tc, methodNumber, p1);
    }
  }

  @Override
  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final double p1) throws Throwable {
    switch (methodNumber) {
    case 0X01000000:
      return tc.wrap(NgAliothRecursive$fib(tc, this, p1));

    default:
      return super.ng$Call(tc, methodNumber, p1);
    }
  }

  @Override
  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final Object p1, final Object p2) throws Throwable {
    switch (methodNumber) {
    case 0X01000000:
      return tc.wrap(NgAliothRecursive$ack(tc, this, tc.unwrapToInt(p1), tc.unwrapToInt(p2)));

    default:
      return super.ng$Call(tc, methodNumber, p1);
    }
  }

  @Override
  public Object ng$Call(final ExtendedThreadContext tc, final int methodNumber, final Object p1, final Object p2, final Object p3) throws Throwable {
    switch (methodNumber) {
    case 0X01000000:
      return tc.wrap(NgAliothRecursive$tak(tc, this, tc.unwrapToInt(p1), tc.unwrapToInt(p2), tc.unwrapToInt(p3)));

    case 0X01000001:
      return tc.wrap(NgAliothRecursive$tak(tc, this, tc.unwrapToDouble(p1), tc.unwrapToDouble(p2), tc.unwrapToDouble(p3)));

    default:
      return super.ng$Call(tc, methodNumber, p1);
    }
  }

  public int ack(final int m, final int n) {
    final ThreadContext tc = ThreadContext.getThreadContext();

    try {
      return tc.convert().asInt(NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, this, tc.wrap(m), tc.wrap(n)));
    } catch (final Throwable e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return -1;
    }
  }

  private static int NgAliothRecursive$ack(final ThreadContext tc, final NgAliothRecursive self, final int m, final int n) throws Throwable {
    // if (m == 0) return n + 1;
    if (tc.equals().applyBoolean(m, 0))
      try {
        return tc.add().intApply(n, 1);
      } catch (final NotPerformed e) {
        return tc.convert().asInt(tc.add().apply(n, 1));
      }

    // if (n == 0) return ack(m - 1, 1);
    if (tc.equals().applyBoolean(n, 0))
      return tc.convert().asInt(NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, self, tc.subtract().apply(m, 1), tc.wrap(1)));
    // return ack(m - 1, ack(m, n - 1));
    return tc.convert().asInt(
        NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, self, tc.subtract().apply(m, 1), NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, self, tc.wrap(m), tc.subtract()
            .apply(n, 1))));
  }

  public int fib(final int n) {
    final ThreadContext tc = ThreadContext.getThreadContext();

    try {
      return tc.convert().asInt(NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, this, n));
    } catch (final Throwable e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return -1;
    }
  }

  private static int NgAliothRecursive$fib(final ThreadContext tc, final NgAliothRecursive self, final int n) throws Throwable {
    // if (n < 2) return 1;
    if (tc.lessThan().applyBoolean(n, 2))
      return 1;

    // return fib(n - 2) + fib(n - 1);
    int t1, t2;

    try {
      t1 = tc.convert().asInt(NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, self, tc.subtract().intApply(n, 2)));
    } catch (final NotPerformed e1) {
      t1 = tc.convert().asInt(NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, self, tc.convert().asInt(tc.subtract().apply(n, 2))));
    }

    try {
      t2 = tc.convert().asInt(NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, self, tc.subtract().intApply(n, 1)));
    } catch (final NotPerformed e1) {
      t2 = tc.convert().asInt(NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, self, tc.convert().asInt(tc.subtract().apply(n, 1))));
    }

    try {
      return tc.add().intApply(t1, t2);
    } catch (final NotPerformed e) {
      return tc.convert().asInt(tc.add().apply(t1, t2));
    }
  }

  public double fib(final double n) {
    final ThreadContext tc = ThreadContext.getThreadContext();

    try {
      return tc.convert().asDouble(NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, this, n));
    } catch (final Throwable e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return -1;
    }
  }

  private static double NgAliothRecursive$fib(final ThreadContext tc, final NgAliothRecursive self, final double n) throws Throwable {
    // if (n < 2.0) return 1.0;
    if (tc.lessThan().applyBoolean(n, 2.0))
      return 1.0;

    // return fib(n - 2.0) + fib(n - 1.0);
    double t1, t2;

    try {
      t1 = tc.convert().asDouble(NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, self, tc.subtract().doubleApply(n, 2)));
    } catch (final NotPerformed e1) {
      t1 = tc.convert().asInt(NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, self, tc.convert().asInt(tc.subtract().apply(n, 2))));
    }

    try {
      t2 = tc.convert().asDouble(NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, self, tc.subtract().doubleApply(n, 1)));
    } catch (final NotPerformed e1) {
      t2 = tc.convert().asDouble(NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, self, tc.convert().asInt(tc.subtract().apply(n, 1))));
    }

    try {
      return tc.add().doubleApply(t1, t2);
    } catch (final NotPerformed e) {
      return tc.convert().asDouble(tc.add().apply(t1, t2));
    }
  }

  public int tak(final int x, final int y, final int z) {
    final ThreadContext tc = ThreadContext.getThreadContext();

    try {
      return tc.convert().asInt(NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, this, tc.wrap(x), tc.wrap(y), tc.wrap(z)));
    } catch (final Throwable e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return -1;
    }
  }

  private static int NgAliothRecursive$tak(final ThreadContext tc, final NgAliothRecursive self, final int x, final int y, final int z) throws Throwable {
    // if (y >= x) return z;
    if (tc.greaterThanOrEquals().applyBoolean(y, x))
      return z;

    // return tak(tak(x - 1, y, z), tak(y - 1, z, x), tak(z - 1, x, y));
    int t1, t2, t3;

    try {
      t1 = tc.subtract().intApply(x, 1);
    } catch (final NotPerformed e) {
      t1 = tc.convert().asInt(tc.subtract().apply(x, 1));
    }

    try {
      t2 = tc.subtract().intApply(y, 1);
    } catch (final NotPerformed e) {
      t2 = tc.convert().asInt(tc.subtract().apply(y, 1));
    }

    try {
      t3 = tc.subtract().intApply(z, 1);
    } catch (final NotPerformed e) {
      t3 = tc.convert().asInt(tc.subtract().apply(z, 1));
    }

    return tc.convert().asInt(
        NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, self, NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, self, tc.wrap(t1), tc.wrap(y), tc.wrap(z)),
            NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, self, tc.wrap(t2), tc.wrap(z), tc.wrap(x)), NgAliothRecursive.c0.doCallQuick((ExtendedThreadContext) tc, self, tc.wrap(t3), tc
                .wrap(x), tc.wrap(y))));
  }

  public double tak(final double x, final double y, final double z) {
    final ThreadContext tc = ThreadContext.getThreadContext();

    try {
      return tc.convert().asDouble(NgAliothRecursive.c1.doCallQuick((ExtendedThreadContext) tc, this, tc.wrap(x), tc.wrap(y), tc.wrap(z)));
    } catch (final Throwable e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return -1;
    }
  }

  private static double NgAliothRecursive$tak(final ThreadContext tc, final NgAliothRecursive self, final double x, final double y, final double z) throws Throwable {
    // if (y >= x) return z;
    if (tc.greaterThanOrEquals().applyBoolean(y, x))
      return z;

    // return tak(tak(x - 1.0, y, z), tak(y - 1.0, z, x), tak(z - 1.0, x, y));
    double t1, t2, t3;

    try {
      t1 = tc.subtract().doubleApply(x, 1.0);
    } catch (final NotPerformed e) {
      t1 = tc.convert().asDouble(tc.subtract().apply(x, 1.0));
    }

    try {
      t2 = tc.subtract().doubleApply(y, 1.0);
    } catch (final NotPerformed e) {
      t2 = tc.convert().asDouble(tc.subtract().apply(y, 1.0));
    }

    try {
      t3 = tc.subtract().doubleApply(z, 1.0);
    } catch (final NotPerformed e) {
      t3 = tc.convert().asDouble(tc.subtract().apply(z, 1.0));
    }

    return tc.convert().asDouble(
        NgAliothRecursive.c1.doCallQuick((ExtendedThreadContext) tc, self, NgAliothRecursive.c1.doCallQuick((ExtendedThreadContext) tc, self, tc.wrap(t1), tc.wrap(y), tc.wrap(z)),
            NgAliothRecursive.c1.doCallQuick((ExtendedThreadContext) tc, self, tc.wrap(t2), tc.wrap(z), tc.wrap(x)), NgAliothRecursive.c1.doCallQuick((ExtendedThreadContext) tc, self, tc.wrap(t3), tc
                .wrap(x), tc.wrap(y))));
  }
}
