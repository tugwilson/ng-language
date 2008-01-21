package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.threadcontext.PrimitiveMetaClasses;

import ng.runtime.threadcontext.ThreadContext;
import junit.framework.TestCase;
/*
 * Created on 21 Jan 2008
 *
 * Copyright 2008 John G. Wilson
 *
 *   Licensed under the Apache License, Version 2.0 (the "License", "1");
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
public class StringTest extends TestCase {
  public void testCatenation() {
    final ThreadContext tc = ThreadContext.getThreadContext();
    assertEquals(tc.add().apply("", '0'), "0");
    assertEquals(tc.add().apply('1', ""), "1");
    assertEquals(tc.add().apply("", (byte)2), "2");
    assertEquals(tc.add().apply((byte)3, ""), "3");
    assertEquals(tc.add().apply("", (short)4), "4");
    assertEquals(tc.add().apply((short)5, ""), "5");
    assertEquals(tc.add().apply("", (int)6), "6");
    assertEquals(tc.add().apply((int)7, ""), "7");
    assertEquals(tc.add().apply("", (long)8), "8");
    assertEquals(tc.add().apply((long)9, ""), "9");
    assertEquals(tc.add().apply("", (float)10.5), "10.5");
    assertEquals(tc.add().apply((float)11.5, ""), "11.5");
    assertEquals(tc.add().apply("", (double)12.5), "12.5");
    assertEquals(tc.add().apply((double)13.5, ""), "13.5");
    assertEquals(tc.add().apply("", BigInteger.valueOf(14)), "14");
    assertEquals(tc.add().apply(BigInteger.valueOf(15), ""), "15");
    assertEquals(tc.add().apply("", BigDecimal.valueOf(16.5)), "16.5");
    assertEquals(tc.add().apply(BigDecimal.valueOf(17.5), ""), "17.5");
    assertEquals(tc.add().apply("18.5", ""), "18.5");
    assertEquals(tc.add().apply("19.5", PrimitiveMetaClasses.getStringMetaClass(), ""), "19.5");
  }
}
