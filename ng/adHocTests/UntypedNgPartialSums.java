import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;

/*
 * Created on 9 Feb 2008
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
public class UntypedNgPartialSums {
  static final Object twothirds = ThreadContext.getThreadContext().wrap(2.0/3.0);

  public static void main(final String[] args) throws Throwable {
    final long start = System.currentTimeMillis();
    final ThreadContext tc = ThreadContext.getThreadContext();
    final MetaClass mathMetaClass = tc.getMetaClassFor(Math.class);

     final Object n = tc.wrap(Integer.parseInt(args[0]));

     Object k = tc.wrap(1);

     Object a1 = tc.wrap(0.0), a2 = tc.wrap(0.0), a3 = tc.wrap(0.0), a4 = tc.wrap(0.0), a5 = tc.wrap(0.0);
     Object a6 = tc.wrap(0.0), a7 = tc.wrap(0.0), a8 = tc.wrap(0.0), a9 = tc.wrap(0.0), alt = tc.wrap(-1.0);

     while (tc.lessThanOrEquals().applyBoolean(k, n)) {
        final Object k2 = tc.power().apply(tc.convert().asDouble(k), 2);
        final Object k3 = tc.multiply().apply(k2, k);
        final Object sk = tc.staticMethodCall().applyQuick(mathMetaClass, "sin", k);
        final Object ck = tc.staticMethodCall().applyQuick(mathMetaClass, "cos", k);

        alt = tc.subtract().apply(0.0, alt);
        a1 = tc.add().apply(a1, tc.power().apply(twothirds, tc.subtract().apply(k, 1.0)));
        a2 = tc.add().apply(a2, tc.power().apply(k, -0.5));
        a3 = tc.add().apply(a3, tc.divide().apply(1.0, tc.multiply().apply(k, tc.add().apply(k, 1.0))));
        a4 = tc.add().apply(a4, tc.divide().apply(1.0,(tc.multiply().apply(k3, tc.multiply().apply(sk, sk)))));
        a5 = tc.add().apply(a5, tc.divide().apply(1.0, (tc.multiply().apply(k3, tc.multiply().apply(ck, ck)))));
        a6 = tc.add().apply(a6, tc.divide().apply(1.0, k));
        a7 = tc.add().apply(a7, tc.divide().apply(1.0, k2));
        a8 = tc.add().apply(a8, tc.divide().apply(alt, k));
        a9 = tc.add().apply(a9, tc.divide().apply(alt, (tc.subtract().apply(tc.multiply().apply(2.0, k), 1.0))));

        k = tc.add().apply(k, 1);
     }

     System.out.printf("%.9f\t(2/3)^k\n", tc.convert().asDouble(a1));
     System.out.printf("%.9f\tk^-0.5\n", tc.convert().asDouble(a2));
     System.out.printf("%.9f\t1/k(k+1)\n", tc.convert().asDouble(a3));
     System.out.printf("%.9f\tFlint Hills\n", tc.convert().asDouble(a4));
     System.out.printf("%.9f\tCookson Hills\n", tc.convert().asDouble(a5));
     System.out.printf("%.9f\tHarmonic\n", tc.convert().asDouble(a6));
     System.out.printf("%.9f\tRiemann Zeta\n", tc.convert().asDouble(a7));
     System.out.printf("%.9f\tAlternating Harmonic\n", tc.convert().asDouble(a8));
     System.out.printf("%.9f\tGregory\n", tc.convert().asDouble(a9));

     System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
  }
}
