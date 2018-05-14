public class Factorio {
  public static void main(String[] args) {
    int factorial = 5;
    System.out.println(factorio(factorial));

  }
  public static int factorio(int factnum) {
    int factorioNum = 1;
    for (int i = 1; i <= factnum; i++) {
      factorioNum = factorioNum * i;
    }
    return factorioNum;
  }
}
