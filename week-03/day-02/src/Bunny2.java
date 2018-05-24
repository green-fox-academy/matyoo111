public class Bunny2 {
  public static void main(String[] args) {
    int numOfEars = earCounter(4);
    System.out.println(numOfEars);
  }

  private static int earCounter(int bunnyNum) {
    int earNum = 0;
    if (bunnyNum == 0) {
      return 0;
    } else {
      if (bunnyNum % 2 == 1) {
        earNum += 2 + earCounter(bunnyNum - 1);
      } else {
        earNum += 3 + earCounter(bunnyNum -1);
      }
      return earNum;
    }
  }
}
