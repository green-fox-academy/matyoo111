public class AddNumber {
  public static void main(String[] args) {
    int addnum = numAdder(25);
    System.out.println(addnum);
  }

  private static int numAdder(int limit) {
    if (limit == 1) {
      return 1;
    } else {
      limit += numAdder(limit - 1);
      return limit;
    }
  }
}
