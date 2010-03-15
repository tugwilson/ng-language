import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

/*
 * Created on 1 Mar 2008
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
public class NgAliothMandelbrot {
  static int check = 0;

  final static double limitSquared = 4.0;

  final static int iterations = 50;

  public static void main(final String[] args) throws Exception {
    final long start = System.currentTimeMillis();
    final int size = Integer.parseInt(args[0]);
    final Mandelbrot m = new Mandelbrot();
    final int offset = size % 8;
    m.compute(ThreadContext.getThreadContext(), size, 2.0 / size, offset == 0 ? 0 : (8 - offset), new BufferedOutputStream(System.out));

    System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    System.out.println("Check: " + NgAliothMandelbrot.check);
  }

  public static class Mandelbrot {
    public void compute(final ThreadContext tc, final int size, final double fac, final int shift, final OutputStream out) throws IOException {
      System.out.format("P4\n%d %d\n", size, size);
      for (int y = 0; y < size; y++) {
        computeRow(tc, size, y, fac, shift, out);
      }
      // this.out.close();
    }

    private void computeRow(final ThreadContext tc, final int size, final int y, final double fac, final int shift, final OutputStream out) throws IOException {
      int bits = 0;

      // for (int x = 0; x < size; x = x + 1) {
      int x = 0;
      while (tc.lessThan().applyBoolean(x, size)) {
        double Zr = 0.0;
        double Zi = 0.0;
        // final double Cr = (x*fac - 1.5);
        double Cr;
        try {
          Cr = tc.subtract().doubleApply(tc.multiply().doubleApply(x, fac), 1.5);
        } catch (final NotPerformed e) {
          Cr = tc.convert().asDouble(tc.subtract().apply(tc.multiply().apply(x, fac), 1.5));
        }
        // final double Ci = (y*fac - 1.0);
        double Ci;
        try {
          Ci = tc.subtract().doubleApply(tc.multiply().doubleApply(y, fac), 1.0);
        } catch (final NotPerformed e) {
          Ci = tc.convert().asDouble(tc.subtract().apply(tc.multiply().apply(y, fac), 1.0));
        }

        int i = NgAliothMandelbrot.iterations;
        double ZrN = 0;
        double ZiN = 0;
        do {
          // Zi = 2.0 * Zr * Zi + Ci;
          try {
            Zi = tc.add().doubleApply(tc.multiply().doubleApply(tc.multiply().doubleApply(2.0, Zr), Zi), Ci);
          } catch (final NotPerformed e) {
            Zi = tc.convert().asDouble(tc.add().apply(tc.multiply().apply(tc.multiply().apply(2.0, Zr), Zi), Ci));
          }
          // Zr = ZrN - ZiN + Cr;
          try {
            Zr = tc.add().doubleApply(tc.subtract().doubleApply(ZrN, ZiN), Cr);
          } catch (final NotPerformed e) {
            Zr = tc.convert().asDouble(tc.add().apply(tc.subtract().apply(ZrN, ZiN), Cr));
          }
          // ZiN = Zi * Zi;
          try {
            ZiN = tc.multiply().doubleApply(Zi, Zi);
          } catch (final NotPerformed e) {
            ZiN = tc.convert().asDouble(tc.multiply().apply(Zi, Zi));
          }
          // ZrN = Zr * Zr;
          try {
            ZrN = tc.multiply().doubleApply(Zr, Zr);
          } catch (final NotPerformed e) {
            ZrN = tc.convert().asDouble(tc.multiply().apply(Zr, Zr));
          }
          // } while (!(ZiN + ZrN > limitSquared) && --i > 0);
        } while (!(tc.greaterThan().applyBoolean(tc.add().apply(ZiN, ZrN), NgAliothMandelbrot.limitSquared)) && tc.greaterThan().applyBoolean((i = tc.convert().asInt(tc.subtract().apply(i, 1))), 0));

        // bits = bits << 1;
        try {
          bits = tc.leftShift().intApply(bits, 1);
        } catch (final NotPerformed e1) {
          bits = tc.convert().asInt(tc.leftShift().apply(bits, 1));
        }

        // if (i == 0) {
        if (tc.equals().applyBoolean(i, 0)) {
          // bits++;
          try {
            bits = tc.add().intApply(bits, 1);
          } catch (final NotPerformed e) {
            bits = tc.convert().asInt(tc.add().apply(bits, 1));
          }
        }

        // if (x%8 == 7) {
        int tmp;
        try {
          tmp = tc.remainderDivide().intApply(x, 8);
        } catch (final NotPerformed e1) {
          tmp = tc.convert().asInt(tc.remainderDivide().apply(x, 8));
        }

        if (tc.equals().applyBoolean(tmp, 7)) {
          NgAliothMandelbrot.check ^= bits;
          // this.out.write((byte)bits);
          bits = 0;
        }

        // x = x + 1;
        try {
          x = tc.add().intApply(x, 1);
        } catch (final NotPerformed e) {
          x = tc.convert().asInt(tc.add().apply(x, 1));
        }
      }

      // if (shift!=0) {
      if (tc.notEquals().applyBoolean(shift, 0)) {
        // bits = bits << shift;
        try {
          bits = tc.leftShift().intApply(bits, shift);
        } catch (final NotPerformed e) {
          bits = tc.convert().asInt(tc.leftShift().apply(bits, shift));
        }
        NgAliothMandelbrot.check ^= bits;
        // this.out.write((byte)bits);
      }
    }
  }
}
