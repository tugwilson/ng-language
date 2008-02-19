package ng.runtime.threadcontext;

import java.math.BigInteger;

/*
 * Created on 14 Feb 2008
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
public interface BinaryIntegralOperation extends BinaryOperation {

  int intApply(char lhs, char rhs) throws NotPerformed;
  int intApply(char lhs, byte rhs) throws NotPerformed;
  int intApply(char lhs, short rhs) throws NotPerformed;
  int intApply(char lhs, int rhs) throws NotPerformed;

  int intApply(byte lhs, char rhs) throws NotPerformed;
  int intApply(byte lhs, byte rhs) throws NotPerformed;
  int intApply(byte lhs, short rhs) throws NotPerformed;
  int intApply(byte lhs, int rhs) throws NotPerformed;

  int intApply(short lhs, char rhs) throws NotPerformed;
  int intApply(short lhs, byte rhs) throws NotPerformed;
  int intApply(short lhs, short rhs) throws NotPerformed;
  int intApply(short lhs, int rhs) throws NotPerformed;

  int intApply(int lhs, char rhs) throws NotPerformed;
  int intApply(int lhs, byte rhs) throws NotPerformed;
  int intApply(int lhs, short rhs) throws NotPerformed;
  int intApply(int lhs, int rhs) throws NotPerformed;

  long longApply(long lhs, char rhs) throws NotPerformed;
  long longApply(long lhs, byte rhs) throws NotPerformed;
  long longApply(long lhs, short rhs) throws NotPerformed;
  long longApply(long lhs, int rhs) throws NotPerformed;
  long longApply(long lhs, long rhs) throws NotPerformed;

  BigInteger bigIntegerApply(BigInteger lhs, char rhs) throws NotPerformed;
  BigInteger bigIntegerApply(BigInteger lhs, byte rhs) throws NotPerformed;
  BigInteger bigIntegerApply(BigInteger lhs, short rhs) throws NotPerformed;
  BigInteger bigIntegerApply(BigInteger lhs, int rhs) throws NotPerformed;
  BigInteger bigIntegerApply(BigInteger lhs, long rhs) throws NotPerformed;
  BigInteger bigIntegerApply(BigInteger lhs, BigInteger rhs) throws NotPerformed;
}
