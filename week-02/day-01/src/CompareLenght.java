public class CompareLenght {
  public static void main(String[] args) {
    int[] p1 = {1, 2, 3};
    int[] p2 = {3, 4};
    if (p2.length > p1.length) {
      System.out.println("p2 has more elements");
    }
    else {
      System.out.println("p2 has not more elements than p1");
    }
  }
}
