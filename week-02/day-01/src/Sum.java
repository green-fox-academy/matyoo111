public class Sum {
  public static void main(String[] args) {
    int toSum = 10;
    System.out.println(sum(toSum));
  }

  public static int sum(int numbers) {
    int sum = 0;
    for (int i = 0; i <= numbers; i++) {
      sum = sum + i;
    }
    return sum;
  }
}