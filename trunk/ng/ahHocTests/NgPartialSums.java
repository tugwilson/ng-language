import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import ng.runtime.NgDouble;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

/*
 * Created on 21 Jan 2008
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
public class NgPartialSums {
  static final double twothirds = 2.0/3.0;

  public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
    long start = System.currentTimeMillis();
    ThreadContext tc = ThreadContext.getThreadContext();
    
    Method sin = Math.class.getMethod("sin", new Class[]{double.class});
    Method cos = Math.class.getMethod("cos", new Class[]{double.class});
    
     int n = Integer.parseInt(args[0]);
     
     int k=1;
     
     double a1 = 0.0, a2 = 0.0, a3 = 0.0, a4 = 0.0, a5 = 0.0;
     double a6 = 0.0, a7 = 0.0, a8 = 0.0, a9 = 0.0, alt = -1.0;

     while (tc.lessThanOrEquals().applyBoolean(k, n)) {
        double k2;
        try {
          k2 = tc.multiply().doubleApply((double)k, (double)k);
        } catch (NotPerformed e10) {
          k2 = tc.convert().asDouble(tc.multiply().apply((double)k, (double)k));
        }
        
        double k3;
        try {
          k3 = tc.multiply().doubleApply(k2, k);
        } catch (NotPerformed e10) {
          k3 = tc.convert().asDouble(tc.multiply().apply(k2, k));
        }
        
        //
        // Note: I do not yet support static calls so I can't compile these calls to sin() and cos()
        // but this is roughly what would happen
        //
        double sk = tc.convert().asDouble(NgDouble.valueOf(((Double)sin.invoke(null, new Object[]{new Double(k)})).doubleValue()));
        double ck = tc.convert().asDouble(NgDouble.valueOf(((Double)cos.invoke(null, new Object[]{new Double(k)})).doubleValue()));
        
        try {
          alt = tc.subtract().doubleApply(0.0, alt);
        } catch (NotPerformed e9) {
          alt = tc.convert().asDouble(tc.subtract().apply(0.0, alt));
        }

        try {
          a1 = tc.add().doubleApply(a1, tc.power().doubleApply(twothirds, tc.subtract().doubleApply(k, 1.0)));
        } catch (NotPerformed e8) {
          a1 = tc.convert().asDouble(tc.add().apply(a1, tc.power().apply(twothirds, tc.subtract().apply(k, 1.0))));
        }
        
        try {
          a2 = tc.add().doubleApply(a2, tc.power().doubleApply(k, -0.5));
        } catch (NotPerformed e7) {
          a2 = tc.convert().asDouble(tc.add().apply(a2, tc.power().apply(k, -0.5)));
        }
        
        try {
          a3 = tc.add().doubleApply(a3, tc.divide().doubleApply(1.0, tc.multiply().doubleApply(k, tc.add().doubleApply(k, 1.0))));
        } catch (NotPerformed e6) {
          a3 = tc.convert().asDouble(tc.add().apply(a3, tc.divide().apply(1.0, tc.multiply().apply(k, tc.add().apply(k, 1.0)))));
        }
        
        try {
          a4 = tc.add().doubleApply(a4, tc.divide().doubleApply(1.0,(tc.multiply().doubleApply(k3, tc.multiply().doubleApply(sk, sk)))));
        } catch (NotPerformed e5) {
          a4 = tc.convert().asDouble(tc.add().apply(a4, tc.divide().apply(1.0,(tc.multiply().apply(k3, tc.multiply().apply(sk, sk))))));
        }
        
        try {
          a5 = tc.add().doubleApply(a5, tc.divide().doubleApply(1.0, (tc.multiply().doubleApply(k3, tc.multiply().doubleApply(ck, ck)))));
        } catch (NotPerformed e4) {
          a5 = tc.convert().asDouble(tc.add().apply(a5, tc.divide().apply(1.0, (tc.multiply().apply(k3, tc.multiply().apply(ck, ck))))));
        }
        
        try {
          a6 = tc.add().doubleApply(a6, tc.divide().doubleApply(1.0, k));
        } catch (NotPerformed e3) {
          a6 = tc.convert().asDouble(tc.add().apply(a6, tc.divide().apply(1.0, k)));
        }
        
        try {
          a7 = tc.add().doubleApply(a7, tc.divide().doubleApply(1.0, k2));
        } catch (NotPerformed e2) {
          a7 = tc.convert().asDouble(tc.add().apply(a7, tc.divide().apply(1.0, k2)));
        }
        
        try {
          a8 = tc.add().doubleApply(a8, tc.divide().doubleApply(alt, k));
        } catch (NotPerformed e1) {
          a8 = tc.convert().asDouble(tc.add().apply(a8, tc.divide().apply(alt, k)));
        }
        
        try {
          a9 = tc.add().doubleApply(a9, tc.divide().doubleApply(alt, (tc.subtract().doubleApply(tc.multiply().doubleApply(2.0, k), 1.0))));
        } catch (NotPerformed e) {
          a9 = tc.convert().asDouble(tc.add().apply(a9, tc.divide().apply(alt, (tc.subtract().apply(tc.multiply().apply(2.0, k), 1.0)))));
        }
        
        try {
          k = tc.add().intApply(k, 1);
        } catch (NotPerformed e) {
          k = tc.convert().asInt(tc.add().apply(k, 1));
        }
     }
     System.out.printf("%.9f\t(2/3)^k\n", a1);
     System.out.printf("%.9f\tk^-0.5\n", a2);
     System.out.printf("%.9f\t1/k(k+1)\n", a3);
     System.out.printf("%.9f\tFlint Hills\n", a4);
     System.out.printf("%.9f\tCookson Hills\n", a5);
     System.out.printf("%.9f\tHarmonic\n", a6);
     System.out.printf("%.9f\tRiemann Zeta\n", a7);
     System.out.printf("%.9f\tAlternating Harmonic\n", a8);
     System.out.printf("%.9f\tGregory\n", a9);
     
     System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
  }
}
