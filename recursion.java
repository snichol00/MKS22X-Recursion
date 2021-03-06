import java.util.ArrayList;

public class recursion{
  public static double sqrt(double n, double tolerance){
    return sqrt(n, n/2, tolerance);
  }

  public static double sqrt(double n, double guess, double tolerance){
    if (n == 0){
      return 0;
    }
    if (Math.abs((n - (guess * guess)) / n) < (tolerance / 100)){
      return guess;
    }
    return sqrt(n, (n / guess + guess) / 2, tolerance);
  }

  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> sums = new ArrayList<Integer>();
    return makeSums(n, sums, 0);
  }

  public static ArrayList<Integer> makeSums(int n, ArrayList<Integer> sums, int sum){
    if (n > 0){
      //if the number n is included, it adds n to the total and keeps summing
      makeSums(n-1, sums, sum + n);
      //other case, if n isn't included, keeps summing
      makeSums(n-1, sums, sum);
    }
    else{
      sums.add(sum);
    }
    return sums;
  }

  public static int fib(int n){
    return fib(n, 0, 1);
  }

  public static int fib(int n, int prev2, int prev1){
    if (n == 0){
      return prev2;
    }
    if (n == 1){
      return prev1;
    }
    return fib(n-1, prev1, prev1 + prev2);
  }

    public static void main(String args[]){
      //sqrt
      System.out.println("2 = " + sqrt(4, 0.1));
      System.out.println("15 = " + sqrt(225, 0.0001));
      System.out.println("0.0316 = " + sqrt(0.001, 0.0003));
      System.out.println("20044.677 = " + sqrt(401789078, 0.005));
      System.out.println("0.94528 = " + sqrt(0.89356272, 0.02376));
      System.out.println("3.58711 = " + sqrt(12.86738, 0.00001));
      System.out.println("0 = " + sqrt(0, 0.00001));
      //makeAllSums
      System.out.println("[0, 3, 2, 5, 1, 4, 3, 6] = " + makeAllSums(3));
      System.out.println("[10, 9, 8, 7, 7, 6, 6, 5, 5, 4, 4, 3, 3, 2, 1, 0] = " + makeAllSums(4));
      System.out.println("[0, 1] = " + makeAllSums(1));
      //fib
      System.out.println("5 = " + fib(5));
      System.out.println("0 = " + fib(0));
      System.out.println("1 = " + fib(1));
      System.out.println("377 = " + fib(14));
  }
}
