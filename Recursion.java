public class Recursion{
  public static double sqrt(double n, double tolerance){
    return sqrt(n, n/2, tolerance);
  }

  public static double sqrt(double n, double guess, double tolerance){
    if (Math.abs((n - (guess * guess)) / n) < (tolerance / 100)){
      return guess;
    }
    return sqrt(n, (n / guess + guess) / 2, tolerance);
  }

  public static void main(String args[]){
    System.out.println("2 = " + sqrt(4, 0.1));
    System.out.println("15 = " + sqrt(225, 0.0001));
    System.out.println("0.0316 = " + sqrt(0.001, 0.0003));
    System.out.println("20044.677 = " + sqrt(401789078, 0.005));
    System.out.println("0.94528 = " + sqrt(0.89356272, 0.02376));
    System.out.println("3.58711 = " + sqrt(12.86738, 0.00001));
  }
}
