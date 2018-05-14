public class SumAll {
  public static void main(String[] args) {
    int[] ai = {3, 4, 5, 6, 7};
    int sumai = 0;
    for (int i = 0; i < ai.length; i++) {
      sumai = sumai + ai[i];
    }
    System.out.println(sumai);
  }
}
