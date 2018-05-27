public class String2 {
  public static void main(String[] args) {
    String changedWord = "renoxoxos";
    int wordLenghLastindex = changedWord.length() - 1;
    changedWord = replaceXToY(changedWord, wordLenghLastindex);
    System.out.println(changedWord);
  }

  private static String replaceXToY(String toBeReplaced, int wordLastIndex) {
    if (wordLastIndex == 0) {
      return toBeReplaced;
    } else {
      if (toBeReplaced.substring(wordLastIndex, wordLastIndex + 1).equals("x")) {
        String tempStringStart = toBeReplaced.substring(0, wordLastIndex);
        String tempStringEnd = toBeReplaced.substring(wordLastIndex + 1);
        toBeReplaced = tempStringStart + tempStringEnd;
        toBeReplaced = replaceXToY(toBeReplaced, wordLastIndex -1);
      } else {
        toBeReplaced = replaceXToY(toBeReplaced, wordLastIndex - 1);
      }
      return toBeReplaced;
    }
  }
}
