import java.io.BufferedOutputStream;
import java.io.IOException;

class AliothMandelbrot {
  static int check = 0;

  final static double limitSquared = 4.0;

  final static int iterations = 50;

  public static void main(final String[] args) throws Exception {
    final long start = System.currentTimeMillis();
    final int size = Integer.parseInt(args[0]);
    final Mandelbrot m = new Mandelbrot(size);
    m.compute();

    System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms");
    System.out.println("Check: " + AliothMandelbrot.check);
  }

  public static class Mandelbrot {
    public Mandelbrot(final int size) {
      this.size = size;
      this.fac = 2.0 / size;
      this.out = new BufferedOutputStream(System.out);

      final int offset = size % 8;
      this.shift = offset == 0 ? 0 : (8 - offset);
    }

    final int size;

    final BufferedOutputStream out;

    final double fac;

    final int shift;

    public void compute() throws IOException {
      System.out.format("P4\n%d %d\n", this.size, this.size);
      for (int y = 0; y < this.size; y++) {
        computeRow(y);
      }
      // this.out.close();
    }

    private void computeRow(final int y) throws IOException {
      int bits = 0;

      for (int x = 0; x < this.size; x++) {
        double Zr = 0.0;
        double Zi = 0.0;
        final double Cr = (x * this.fac - 1.5);
        final double Ci = (y * this.fac - 1.0);

        int i = AliothMandelbrot.iterations;
        double ZrN = 0;
        double ZiN = 0;
        do {
          Zi = 2.0 * Zr * Zi + Ci;
          Zr = ZrN - ZiN + Cr;
          ZiN = Zi * Zi;
          ZrN = Zr * Zr;
        } while (!(ZiN + ZrN > AliothMandelbrot.limitSquared) && --i > 0);

        bits = bits << 1;
        if (i == 0) {
          bits++;
        }

        if (x % 8 == 7) {
          AliothMandelbrot.check ^= bits;
          // this.out.write((byte)bits);
          bits = 0;
        }
      }
      if (this.shift != 0) {
        bits = bits << this.shift;
        AliothMandelbrot.check ^= bits;
        // this.out.write((byte)bits);
      }
    }
  }
}
