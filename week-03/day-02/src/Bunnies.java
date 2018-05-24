public class Bunnies {
  public static void main(String[] args) {
    int numberOfBunniesEars = earCounter(34);
    System.out.println(numberOfBunniesEars);
  }

  private static int earCounter(int numBunnies) {
    int earNum = 0;
    if (numBunnies == 1) {
      return 2;
    } else {
      earNum += 2 + earCounter(numBunnies - 1);
      return earNum;
    }
  }
}
