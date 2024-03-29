// ---------------------------------------------------------------------
// The Great Computer Language Shootout
// http://shootout.alioth.debian.org/
//
// Code based on / inspired by existing, relevant Shootout submissions
//
// Contributed by Anthony Borla
// ---------------------------------------------------------------------

public class AliothRecursive {
  public static void main(final String args[]) {
    final long start = System.currentTimeMillis();
    int n = Integer.parseInt(args[0]);

    System.out.printf("Ack(3,%d): %d\n", n, ack(3, n));
    System.out.printf("Fib(%.1f): %.1f\n", 27.0 + n, fib(27.0 + n));

    n -= 1;
    System.out.printf("Tak(%d,%d,%d): %d\n", n * 3, n * 2, n, tak(n * 3, n * 2, n));

    System.out.printf("Fib(3): %d\n", fib(3));
    System.out.printf("Tak(3.0,2.0,1.0): %.1f\n", tak(3.0, 2.0, 1.0));
    System.out.println("Time: " + (System.currentTimeMillis() - start) + "ms");
  }

  public static int ack(final int m, final int n) {
    if (m == 0)
      return n + 1;
    if (n == 0)
      return ack(m - 1, 1);
    return ack(m - 1, ack(m, n - 1));
  }

  public static int fib(final int n) {
    if (n < 2)
      return 1;
    return fib(n - 2) + fib(n - 1);
  }

  public static double fib(final double n) {
    if (n < 2.0)
      return 1.0;
    return fib(n - 2.0) + fib(n - 1.0);
  }

  public static int tak(final int x, final int y, final int z) {
    if (y >= x)
      return z;
    return tak(tak(x - 1, y, z), tak(y - 1, z, x), tak(z - 1, x, y));
  }

  public static double tak(final double x, final double y, final double z) {
    if (y >= x)
      return z;
    return tak(tak(x - 1.0, y, z), tak(y - 1.0, z, x), tak(z - 1.0, x, y));
  }
}
