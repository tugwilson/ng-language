package ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;

/**
 * @author John
 * 
 */
public interface BinaryOperation {
  Object apply(Object lhs, Object rhs);

  Object apply(MetaClass lhsMetaClass, Object lhs, Object rhs);

  Object apply(Object lhs, MetaClass rhsMetaClass, Object rhs);

  Object apply(MetaClass lhsMetaClass, Object lhs, MetaClass rhsMetaClass, Object rhs);

  Object apply(Object lhs, char rhs);

  Object apply(Object lhs, byte rhs);

  Object apply(Object lhs, short rhs);

  Object apply(Object lhs, int rhs);

  Object apply(Object lhs, long rhs);

  Object apply(Object lhs, float rhs);

  Object apply(Object lhs, double rhs);

  Object apply(Object lhs, BigInteger rhs);

  Object apply(Object lhs, BigDecimal rhs);

  Object apply(MetaClass lhsMetaClass, Object lhs, char rhs);

  Object apply(MetaClass lhsMetaClass, Object lhs, byte rhs);

  Object apply(MetaClass lhsMetaClass, Object lhs, short rhs);

  Object apply(MetaClass lhsMetaClass, Object lhs, int rhs);

  Object apply(MetaClass lhsMetaClass, Object lhs, long rhs);

  Object apply(MetaClass lhsMetaClass, Object lhs, float rhs);

  Object apply(MetaClass lhsMetaClass, Object lhs, double rhs);

  Object apply(MetaClass lhsMetaClass, Object lhs, BigInteger rhs);

  Object apply(MetaClass lhsMetaClass, Object lhs, BigDecimal rhs);

  Object apply(char lhs, MetaClass rhsMetaClass, Object rhs);

  Object apply(byte lhs, MetaClass rhsMetaClass, Object rhs);

  Object apply(short lhs, MetaClass rhsMetaClass, Object rhs);

  Object apply(int lhs, MetaClass rhsMetaClass, Object rhs);

  Object apply(long lhs, MetaClass rhsMetaClass, Object rhs);

  Object apply(float lhs, MetaClass rhsMetaClass, Object rhs);

  Object apply(double lhs, MetaClass rhsMetaClass, Object rhs);

  Object apply(BigInteger lhs, MetaClass rhsMetaClass, Object rhs);

  Object apply(BigDecimal lhs, MetaClass rhsMetaClass, Object rhs);

  Object apply(char lhs, Object rhs);

  Object apply(byte lhs, Object rhs);

  Object apply(short lhs, Object rhs);

  Object apply(int lhs, Object rhs);

  Object apply(long lhs, Object rhs);

  Object apply(float lhs, Object rhs);

  Object apply(double lhs, Object rhs);

  Object apply(BigInteger lhs, Object rhs);

  Object apply(BigDecimal lhs, Object rhs);

  Object apply(char lhs, char rhs);

  Object apply(char lhs, byte rhs);

  Object apply(char lhs, short rhs);

  Object apply(char lhs, int rhs);

  Object apply(char lhs, long rhs);

  Object apply(char lhs, float rhs);

  Object apply(char lhs, double rhs);

  Object apply(char lhs, BigInteger rhs);

  Object apply(char lhs, BigDecimal rhs);

  Object apply(byte lhs, char rhs);

  Object apply(byte lhs, byte rhs);

  Object apply(byte lhs, short rhs);

  Object apply(byte lhs, int rhs);

  Object apply(byte lhs, long rhs);

  Object apply(byte lhs, float rhs);

  Object apply(byte lhs, double rhs);

  Object apply(byte lhs, BigInteger rhs);

  Object apply(byte lhs, BigDecimal rhs);

  Object apply(short lhs, char rhs);

  Object apply(short lhs, byte rhs);

  Object apply(short lhs, short rhs);

  Object apply(short lhs, int rhs);

  Object apply(short lhs, long rhs);

  Object apply(short lhs, float rhs);

  Object apply(short lhs, double rhs);

  Object apply(short lhs, BigInteger rhs);

  Object apply(short lhs, BigDecimal rhs);

  Object apply(int lhs, char rhs);

  Object apply(int lhs, byte rhs);

  Object apply(int lhs, short rhs);

  Object apply(int lhs, int rhs);

  Object apply(int lhs, long rhs);

  Object apply(int lhs, float rhs);

  Object apply(int lhs, double rhs);

  Object apply(int lhs, BigInteger rhs);

  Object apply(int lhs, BigDecimal rhs);

  Object apply(long lhs, char rhs);

  Object apply(long lhs, byte rhs);

  Object apply(long lhs, short rhs);

  Object apply(long lhs, int rhs);

  Object apply(long lhs, long rhs);

  Object apply(long lhs, float rhs);

  Object apply(long lhs, double rhs);

  Object apply(long lhs, BigInteger rhs);

  Object apply(long lhs, BigDecimal rhs);

  Object apply(float lhs, char rhs);

  Object apply(float lhs, byte rhs);

  Object apply(float lhs, short rhs);

  Object apply(float lhs, int rhs);

  Object apply(float lhs, long rhs);

  Object apply(float lhs, float rhs);

  Object apply(float lhs, double rhs);

  Object apply(float lhs, BigInteger rhs);

  Object apply(float lhs, BigDecimal rhs);

  Object apply(double lhs, char rhs);

  Object apply(double lhs, byte rhs);

  Object apply(double lhs, short rhs);

  Object apply(double lhs, int rhs);

  Object apply(double lhs, long rhs);

  Object apply(double lhs, float rhs);

  Object apply(double lhs, double rhs);

  Object apply(double lhs, BigInteger rhs);

  Object apply(double lhs, BigDecimal rhs);

  Object apply(BigInteger lhs, char rhs);

  Object apply(BigInteger lhs, byte rhs);

  Object apply(BigInteger lhs, short rhs);

  Object apply(BigInteger lhs, int rhs);

  Object apply(BigInteger lhs, long rhs);

  Object apply(BigInteger lhs, float rhs);

  Object apply(BigInteger lhs, double rhs);

  Object apply(BigInteger lhs, BigInteger rhs);

  Object apply(BigInteger lhs, BigDecimal rhs);

  Object apply(BigDecimal lhs, char rhs);

  Object apply(BigDecimal lhs, byte rhs);

  Object apply(BigDecimal lhs, short rhs);

  Object apply(BigDecimal lhs, int rhs);

  Object apply(BigDecimal lhs, long rhs);

  Object apply(BigDecimal lhs, float rhs);

  Object apply(BigDecimal lhs, double rhs);

  Object apply(BigDecimal lhs, BigInteger rhs);

  Object apply(BigDecimal lhs, BigDecimal rhs);
}
