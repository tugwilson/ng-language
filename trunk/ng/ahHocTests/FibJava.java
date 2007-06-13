/*
 * Created on 24 May 2007
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
public class FibJava {
    int series;
    
    public static void main(String args[]) {
      new FibJava(10).calculate();
      long start = System.currentTimeMillis();
      int result = new FibJava(35).calculate();
      System.out.println(System.currentTimeMillis() - start);
      System.out.println(result);
    }

    FibJava(int x) {
           this.series = x;
       }
      
       int calculate() {
           return fib(this.series);
       }
      
       int fib(int x) {
           if (x <= 0) {
               return 0;
           }
      
           if (x == 1) {
               return 1;
           }
      
           return (fib(x-1) + fib(x-2));
       }
}

