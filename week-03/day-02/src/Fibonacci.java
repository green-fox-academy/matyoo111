public class Fibonacci {
  public static void main(String[] args) {
    int fibonacciNthValue = fibonacciCounter(4);
    System.out.println(fibonacciNthValue);
  }

  private static int fibonacciCounter(int fibonaccinNumber) {
    int counter = 0;
    if (fibonaccinNumber == 0) {
      return 0;
    }
    else if (fibonaccinNumber == 1) {
      return 1;
    } else {
      counter += fibonacciCounter(fibonaccinNumber - 1) + fibonacciCounter(fibonaccinNumber -2);
      return counter;
    }
  }
}