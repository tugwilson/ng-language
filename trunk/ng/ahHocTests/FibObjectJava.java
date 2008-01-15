/*
 * Created on 22 Aug 2007
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
 * @author John
 *
 */
public class FibObjectJava {
  Integer series;
  
  public static void main(final String args[]) {
    new FibJava(10).calculate();
    final long start = System.currentTimeMillis();
    final Integer result = new FibJava(Integer.valueOf(35).calculate();
    System.out.println(System.currentTimeMillis() - start);
    System.out.println(result);
  }

  FibObjectJava(final Integer x) {
         this.series = x;
     }
    
     Integer calculate() {
         return fib(this.series);
     }
    
     Integer fib(final Integer x) {
         if (x.intValue() <= 0) {
             return Integer.valueOf(0);
         }
    
         if (x.intValue() == 1) {
             return Integer.valueOf(1);
         }
    
         return Integer.valueOf(fib(Integer.valueOf(x.intValue() - 1)).intValue()
                + fib(Integer.valueOf(x.intValue() - 2)).intValue());
     }
}
