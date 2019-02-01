public class Recursion{
  public static double sqrt(double n){
    return sqrt(n, n/2);
  }

  public static double sqrt(double n, double guess){
    if (Math.abs((n - (guess * guess)) / n) < 0.01){
      return guess;
    }
    return sqrt(n, (n / guess + guess) / 2);
  }

  public static void main(String args[]){
    System.out.println("2 = " + sqrt(4));
    System.out.println("15 = " + sqrt(225));
    System.out.println("0.0316 = " + sqrt(0.001));
    System.out.println("20044.677 = " + sqrt(401789078));
    System.out.println("0.94528 = " + sqrt(0.89356272));
    System.out.println("3.58711 = " + sqrt(12.86738));
  }
}
