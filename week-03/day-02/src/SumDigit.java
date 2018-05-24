public class SumDigit {
  public static void main(String[] args) {
    int sumOfDigits = sumdigit(1993);
    System.out.println(sumOfDigits);
  }

  private static int sumdigit(int number) {
    int sum = 0;
    if (number < 10) {
      return  number;
    } else {
      sum += number % 10 + sumdigit(number / 10);
      return sum;
    }
  }
}