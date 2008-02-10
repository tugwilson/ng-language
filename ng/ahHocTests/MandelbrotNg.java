import java.util.Date;

import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

/*
 * Created on 8 Feb 2008
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
public class MandelbrotNg {
  static int BAILOUT = 16;
  static int MAX_ITERATIONS = 1000;

  private static int iterate(final ThreadContext tc, final float x, final float y)
  {
    float cr;
    try {
      cr = tc.subtract().floatApply(y, 0.5f);
    } catch (final NotPerformed e) {
      cr = tc.convert().asFloat(tc.subtract().apply(y, 0.5f));
    }
    final float ci = x;
    float zi = 0.0f;
    float zr = 0.0f;
    int i = 0;
    while (true) {
      //   i++;
      try {
        i = tc.add().intApply(i, 1);
      } catch (final NotPerformed e) {
        i = tc.convert().asInt(tc.add().apply(i, 1));
      }

      //  float temp = zr * zi;
      float temp;
      try {
        temp = tc.multiply().floatApply(zr, zi);
      } catch (final NotPerformed e) {
        temp = tc.convert().asFloat(tc.multiply().apply(zr, zi));
      }

      //  float zr2 = zr * zr;
      float zr2;
      try {
        zr2 = tc.multiply().floatApply(zr, zr);
      } catch (final NotPerformed e) {
        zr2 = tc.convert().asFloat(tc.multiply().apply(zr, zr));
      }

      //  float zi2 = zi * zi;
     float zi2;
      try {
        zi2 = tc.multiply().floatApply(zi, zi);
      } catch (final NotPerformed e) {
        zi2 = tc.convert().asFloat(tc.multiply().apply(zi, zi));
      }

      //  zr = zr2 - zi2 + cr;
      try {
        zr = tc.add().floatApply(tc.subtract().floatApply(zr2, zi2), cr);
      } catch (final NotPerformed e) {
        zr = tc.convert().asFloat(tc.add().apply(tc.subtract().apply(zr2, zi2), cr));
      }

      //  zi = temp + temp + ci;
      zi = temp + temp + ci;
      try {
        zi = tc.add().floatApply(temp, tc.add().floatApply(temp, ci));
      } catch (final NotPerformed e) {
        zi = tc.convert().asFloat(tc.add().apply(temp, tc.add().apply(temp, ci)));
      }

      //  if (zi2 + zr2 > BAILOUT) return i;
      boolean tmpBool;
      try {
        tmpBool = tc.greaterThan().applyBoolean(tc.add().floatApply(zi2, zr2), BAILOUT);
      } catch (final NotPerformed e) {
        tmpBool = tc.greaterThan().applyBoolean(tc.add().apply(zi2, zr2), BAILOUT);
      }
      if (tmpBool) {
        return i;
      }

      //  if (i > MAX_ITERATIONS) return 0;
      if (tc.greaterThan().applyBoolean(i, MAX_ITERATIONS)) {
        return 0;
      }
    }
  }

  public static void main(final String args[])
  {
    final ThreadContext tc = ThreadContext.getThreadContext();
    final Date d1 = new Date();
    int x,y;
    //  for (y = -39; y < 39; y++) {
    for (y = -39; tc.lessThan().applyBoolean(y, 39);) {
    // System.out.print("\n");
      //  for (x = -39; x < 39; x++) {
      for (x = -39; tc.lessThan().applyBoolean(x, 39);) {
        float t1;
        try {
          t1 = tc.divide().floatApply(x, 40.0f);
        } catch (final NotPerformed e1) {
          t1 = tc.convert().asFloat(tc.divide().apply(x, 40.0f));
        }

        float t2;
        try {
          t2 = tc.divide().floatApply(y, 40.0f);
        } catch (final NotPerformed e1) {
          t2 = tc.convert().asFloat(tc.divide().apply(y, 40.0f));
        }

        if (tc.equals().applyBoolean(iterate(tc, t1, t2), 0)) {
          ;// System.out.print("*");
        } else {
          ;// System.out.print(" ");
        }

        try {
          x = tc.add().intApply(x, 1);
        } catch (final NotPerformed e) {
          x = tc.convert().asInt(tc.add().apply(x, 1));
        }
      }
      try {
        y = tc.add().intApply(y, 1);
      } catch (final NotPerformed e) {
        y = tc.convert().asInt(tc.add().apply(y, 1));
      }
    }
    final Date d2 = new Date();
    final long diff = d2.getTime() - d1.getTime();
    System.out.println("\nNgElapsed " + diff/1000.0f);

  }
}
