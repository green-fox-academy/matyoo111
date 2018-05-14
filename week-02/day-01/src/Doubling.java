public class Doubling {
  public static void main(String[] args) {
    int baseNum = 123;
    baseNum = doubling(baseNum);
    System.out.println(baseNum);
  }
  public static int doubling (int num) {
    num = num * 2;
    return num;
  }
}
