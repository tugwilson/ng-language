import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.NgInt;

/*
 * Created on 2 Mar 2008
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
public class UntypedNgAliothMandelbrot {
  static int check = 0;

  final static double limitSquared = 4.0d;

  final static Object iterations = ThreadContext.getThreadContext().wrap(50);

  public static void main(final String[] args) throws Exception {
    final long start = System.currentTimeMillis();
    final int size = Integer.parseInt(args[0]);
    final Mandelbrot m = new Mandelbrot();
    final int offset = size % 8;
    m.compute(ThreadContext.getThreadContext(), size, 2.0 / size, offset == 0 ? 0 : (8 - offset), new BufferedOutputStream(System.out));

    System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    System.out.println("Check: " + UntypedNgAliothMandelbrot.check);
  }

  public static class Mandelbrot {
    public void compute(final ThreadContext tc, final int size, final double fac, final int shift, final OutputStream out) throws IOException {
      System.out.format("P4\n%d %d\n", size, size);
      for (int y = 0; y < size; y++) {
        computeRow(tc, tc.wrap(size), tc.wrap(y), tc.wrap(fac), tc.wrap(shift), out);
      }
      // this.out.close();
    }

    private void computeRow(final ThreadContext tc, final Object size, final Object y, final Object fac, final Object shift, final OutputStream out) throws IOException {
      Object bits = tc.wrap(0);

      // for (int x = 0; x < size; x = x + 1) {
      Object x = tc.wrap(0);
      while (tc.lessThan().applyBoolean(x, size)) {
        Object Zr = tc.wrap(0.0d);
        Object Zi = tc.wrap(0.0d);
        // final double Cr = (x*fac - 1.5);
        final Object Cr = tc.subtract().apply(tc.multiply().apply(x, fac), 1.5);
        // final double Ci = (y*fac - 1.0);
        final Object Ci = tc.subtract().apply(tc.multiply().apply(y, fac), 1.0);

        Object i = UntypedNgAliothMandelbrot.iterations;
        Object ZrN = tc.wrap(0.0d);
        Object ZiN = tc.wrap(0.0d);
        do {
          // Zi = 2.0 * Zr * Zi + Ci;
          Zi = tc.add().apply(tc.multiply().apply(tc.multiply().apply(2.0, Zr), Zi), Ci);
          // Zr = ZrN - ZiN + Cr;
          Zr = tc.add().apply(tc.subtract().apply(ZrN, ZiN), Cr);
          // ZiN = Zi * Zi;
          ZiN = tc.multiply().apply(Zi, Zi);
          // ZrN = Zr * Zr;
          ZrN = tc.multiply().apply(Zr, Zr);
          // } while (!(ZiN + ZrN > limitSquared) && --i > 0);
        } while (!(tc.greaterThan().applyBoolean(tc.add().apply(ZiN, ZrN), UntypedNgAliothMandelbrot.limitSquared)) && tc.greaterThan().applyBoolean((i = tc.subtract().apply(i, 1)), 0));

        // bits = bits << 1;
        bits = tc.leftShift().apply(bits, 1);

        // if (i == 0) {
        if (tc.equals().applyBoolean(i, 0)) {
          // bits++;
          bits = tc.add().apply(bits, 1);
        }

        // if (x%8 == 7) {

        if (tc.equals().applyBoolean(tc.remainderDivide().apply(x, 8), 7)) {
          UntypedNgAliothMandelbrot.check ^= ((NgInt) bits).getIntValue();
          // this.out.write((byte)bits);
          bits = tc.wrap(0);
        }

        // x = x + 1;
        x = tc.add().apply(x, 1);
      }

      // if (shift!=0) {
      if (tc.notEquals().applyBoolean(shift, 0)) {
        // bits = bits << shift;
        bits = tc.leftShift().apply(bits, shift);
        UntypedNgAliothMandelbrot.check ^= ((NgInt) bits).getIntValue();
        // this.out.write((byte)bits);
      }
    }
  }
}
