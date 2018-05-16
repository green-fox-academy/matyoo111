import java.util.Scanner;
public class DivideByZero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    try {
      int result = 10 / number;
      System.out.println(result);
    }
    catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }
}
