import java.util.Date;

import ng.lang.NgSystem;
import ng.runtime.NgBaseObject;
import ng.runtime.RuntimeMetaClass;
import ng.runtime.ThreadContext;

/*
 * Created on Jun 8, 2007
 *
 * Copyright 2007 John G. Wilson
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

public class MandelbrotNgTyped extends NgBaseObject {
  private final static RuntimeMetaClass ngMetaClass = NgSystem.metaClassRegistry.getRuntimeMetaClass(NgBaseObject.class).createMetaClassFor(MandelbrotNgTyped.class);
  static int BAILOUT = 16;
  static int MAX_ITERATIONS = 1000;
  
  private int iterate(final float x, final float y) throws Throwable
  {
      final ThreadContext $tc = NgSystem.metaClassRegistry.getThreadContext();
      final float cr = $tc.asFloat(NgSystem.ngFloatMetaClass.subtract(y, 0.5f));
      final float ci = x;
      float zi = 0.0f;
      float zr = 0.0f;
      int i = 0;
      while (true) {
          // i++;
          i = $tc.asInt(NgSystem.ngIntMetaClass.postfixIncrement(i));
          
          //  float temp = zr * zi;
          final float temp = $tc.asFloat(NgSystem.ngFloatMetaClass.multiply(zr, zi));
          
          //  float zr2 = zr * zr;
          final float zr2 = $tc.asFloat(NgSystem.ngFloatMetaClass.multiply(zr, zr));
          
          //  float zi2 = zi * zi;          
          final float zi2 = $tc.asFloat(NgSystem.ngFloatMetaClass.multiply(zi, zi));
          
          //  zr = zr2 - zi2 + cr;
          Object $tmp = NgSystem.ngFloatMetaClass.subtract(zr2, zi2);
          zr = $tc.asFloat(NgSystem.metaClassRegistry.getRuntimeMetaClass($tc, $tmp).add($tmp, cr));
          
          // zi = temp + temp + ci;
          $tmp = NgSystem.ngFloatMetaClass.add(temp, temp);
          zi = $tc.asFloat(NgSystem.metaClassRegistry.getRuntimeMetaClass($tc, $tmp).add($tmp, ci));
          
          // if (zi2 + zr2 > BAILOUT)
          //    return i;
          $tmp = NgSystem.ngFloatMetaClass.add(zi2, zr2);
          if (NgSystem.metaClassRegistry.getRuntimeMetaClass($tc, $tmp).greaterThanBoolean($tmp, BAILOUT)) return i;
          
          // if (i > MAX_ITERATIONS)
          //    return 0;
          if (NgSystem.ngIntMetaClass.greaterThanBoolean(i, MAX_ITERATIONS)) return 0;
          
      }
  }
  
  public MandelbrotNgTyped() {
    super(ngMetaClass);
  }

  public static void main(final String args[]) throws Throwable
  {
    final ThreadContext $tc = NgSystem.metaClassRegistry.getThreadContext();
      final Date d1 = new Date();
      final MandelbrotNgTyped instance = new MandelbrotNgTyped();
      int x,y;
      for (y = -39; y < 39; y++) {
;//          System.out.print("\n");
          for (x = -39; x < 39; x++) {
              final Object tmp1 = NgSystem.ngIntMetaClass.divide(x, 40.0f);
              final Object tmp2 = NgSystem.ngIntMetaClass.divide(y, 40.0f);
              if (instance.iterate($tc.asFloat(tmp1), $tc.asFloat(tmp2)) == 0) 
;//                  System.out.print("*");
              else
;//                  System.out.print(" ");

          }
      }
      final Date d2 = new Date();
      final long diff = d2.getTime() - d1.getTime();
      System.out.println("\nNg typed Elapsed " + diff/1000.0f);
      
  }
}
