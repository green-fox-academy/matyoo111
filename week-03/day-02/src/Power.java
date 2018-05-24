public class Power {
  public static void main(String[] args) {
    int resultNumber = powerFunction(5, 2);
    System.out.println(resultNumber);
  }

  private static int powerFunction(int base, int power) {
    if (power == 0) {
      return 1;
    } else {
      base *= powerFunction(base, power -1);
      return base;
    }
  }
}
