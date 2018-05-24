public class Counter {
  public static void main(String[] args) {
    int countDownNum = countDown(30);
  }

  private static int countDown(int initialNum) {
    if (initialNum == 1) {
      System.out.println(initialNum);
      return 1;
    } else {
      System.out.println(initialNum);
      countDown(initialNum - 1);
      return initialNum;
    }
  }
}
