import java.util.ArrayList;

public class Recursion{
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

  public static void main(String args[]){
    //sqrt
    System.out.println("2 = " + sqrt(4, 0.1));
    System.out.println("15 = " + sqrt(225, 0.0001));
    System.out.println("0.0316 = " + sqrt(0.001, 0.0003));
    System.out.println("20044.677 = " + sqrt(401789078, 0.005));
    System.out.println("0.94528 = " + sqrt(0.89356272, 0.02376));
    System.out.println("3.58711 = " + sqrt(12.86738, 0.00001));

    //testing from website

    System.out.println("TESTING NEWTON'S SQUARE ROOT APPROXIMATION");
    System.out.println("Square root of 100 is " + java.lang.Math.sqrt(100) + ". You got: " + sqrt(100, 0.001));
    System.out.println("Square root of 0.0002 is " + java.lang.Math.sqrt(0.0002) + ". You got: " + sqrt(0.0002, 0.001));
    System.out.println("Square root of 18947 is " + java.lang.Math.sqrt(18947) + ". You got: " + sqrt(18947, 0.001));
    System.out.println("Square root of 8.3774 is " + java.lang.Math.sqrt(8.3774) + ". You got: " + sqrt(8.3774, 0.001));
    System.out.println("Square root of 0 is " + java.lang.Math.sqrt(0) + ". You got: " + sqrt(0, 0.001));
    System.out.println();


    System.out.println("TESTING MAKEALLSUMS");
    System.out.println("makeAllSums of 0 is [0]. You got: " + makeAllSums(0).toString());
    System.out.println("makeAllSums of 3 is [0, 3, 2, 5, 1, 4, 3, 6]. You got: " + makeAllSums(3).toString());
    System.out.println("makeAllSums of 4 is [10, 9, 8, 7, 7, 6, 6, 5, 5, 4, 4, 3, 3, 2, 1, 0]. You got: " + makeAllSums(4).toString());
    System.out.println("makeAllSums of 1 is [0, 1]. You got: " + makeAllSums(1).toString());
  }
}
