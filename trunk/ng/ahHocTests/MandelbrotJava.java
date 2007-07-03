/// by Erik Wrenholt
import java.util.*;

class MandelbrotJava
{  
  static int BAILOUT = 16;
  static int MAX_ITERATIONS = 1000;
  
  private static int iterate(final float x, final float y)
  {
    final float cr = y-0.5f;
    final float ci = x;
    float zi = 0.0f;
    float zr = 0.0f;
    int i = 0;
    while (true) {
      i++;
      final float temp = zr * zi;
      final float zr2 = zr * zr;
      final float zi2 = zi * zi;
      zr = zr2 - zi2 + cr;
      zi = temp + temp + ci;
      if (zi2 + zr2 > BAILOUT)
        return i;
      if (i > MAX_ITERATIONS)
        return 0;
    }
  }

  public static void main(final String args[])
  {
    final Date d1 = new Date();
    int x,y;
    for (y = -39; y < 39; y++) {
//      System.out.print("\n");
      for (x = -39; x < 39; x++) {
        if (iterate(x/40.0f,y/40.0f) == 0) 
;//          System.out.print("*");
        else
;//          System.out.print(" ");

      }
    }
    final Date d2 = new Date();
    final long diff = d2.getTime() - d1.getTime();
    System.out.println("\nJava Elapsed " + diff/1000.0f);
    
  }
}