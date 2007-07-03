import java.util.Date;

import ng.lang.NgSystem;
import ng.runtime.NgBaseObject;
import ng.runtime.NgFloat;
import ng.runtime.NgInt;
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

/**
 * @author tug
 *
 */
public class MandelbrotNgUntyped extends NgBaseObject {
  private final static RuntimeMetaClass ngMetaClass = NgSystem.metaClassRegistry.getRuntimeMetaClass(NgBaseObject.class).createMetaClassFor(MandelbrotNgUntyped.class);
  static int BAILOUT = 16;
  static int MAX_ITERATIONS = 1000;
  
  private Object iterate(Object x, Object y) throws Throwable {
      final ThreadContext $tc = NgSystem.metaClassRegistry.getThreadContext();
      Object $tmp;
      Object cr = NgSystem.metaClassRegistry.getRuntimeMetaClass(y).subtract(y, 0.5f);
      Object ci = x;
      Object zi = NgFloat.valueOf(0.0f);
      Object zr = NgFloat.valueOf(0.0f);
      Object i = NgInt.valueOf(0);
      while (true) {
          // i++;
           i = NgSystem.metaClassRegistry.getRuntimeMetaClass($tc, i).postfixIncrement(i);
          
          //  def temp = zr * zi;
          Object temp = NgSystem.metaClassRegistry.getRuntimeMetaClass($tc, zr).multiply(zr, zi);
          
          //  def zr2 = zr * zr;
          Object zr2 = NgSystem.metaClassRegistry.getRuntimeMetaClass($tc, zr).multiply(zr, zr);
          
          //  def zi2 = zi * zi;          
          Object zi2 = NgSystem.metaClassRegistry.getRuntimeMetaClass($tc, zi).multiply(zi, zi);
          
          //  zr = zr2 - zi2 + cr;
          $tmp = NgSystem.metaClassRegistry.getRuntimeMetaClass($tc, zr2).subtract(zr2, zi2);
          zr = NgSystem.metaClassRegistry.getRuntimeMetaClass($tc, $tmp).add($tmp, cr);
          
          // zi = temp + temp + ci;
          $tmp = NgSystem.metaClassRegistry.getRuntimeMetaClass($tc, temp).add(temp, temp);
          zi = NgSystem.metaClassRegistry.getRuntimeMetaClass($tc, $tmp).add($tmp, ci);
          
          // if (zi2 + zr2 > BAILOUT)
          //    return i;
          $tmp = NgSystem.ngFloatMetaClass.add(zi2, zr2);
          if (NgSystem.metaClassRegistry.getRuntimeMetaClass($tc, $tmp).greaterThanBoolean($tmp, BAILOUT)) return i;
          
          // if (i > MAX_ITERATIONS)
          //    return 0;
          if (NgSystem.ngIntMetaClass.greaterThanBoolean(i, MAX_ITERATIONS)) return NgInt.valueOf(0);
          
      }
  }
  
  public MandelbrotNgUntyped() {
    super(ngMetaClass);
  }

  public static void main(String args[]) throws Throwable {
      Date d1 = new Date();
      MandelbrotNgUntyped instance = new MandelbrotNgUntyped();
      int x,y;
      for (y = -39; y < 39; y++) {
;//          System.out.print("\n");
          for (x = -39; x < 39; x++) {
              Object tmp = instance.iterate(NgSystem.ngIntMetaClass.divide(x, 40.0f), NgSystem.ngIntMetaClass.divide(y, 40.0f)) ;
              if (NgSystem.metaClassRegistry.getRuntimeMetaClass(tmp).asInt(tmp) == 0) 
;//                  System.out.print("*");
              else
;//                  System.out.print(" ");

          }
      }
      Date d2 = new Date();
      long diff = d2.getTime() - d1.getTime();
      System.out.println("\nNg untyped Elapsed " + diff/1000.0f);
      
  }
}
