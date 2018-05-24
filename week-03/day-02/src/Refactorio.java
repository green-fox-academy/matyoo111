public class Refactorio {
  public static void main(String[] args) {
    int reFactorio = factorial(4);
    System.out.println(reFactorio);
  }

  private static int factorial(int factorial) {
    if (factorial == 0) {
      return 1;
    } else {
      factorial *= factorial(factorial -1);
      return factorial;
    }
  }
}
