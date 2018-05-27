public class String1 {
  public static void main(String[] args) {
    String changedWord = "renoxoxos";
    int wordLenghLastindex = changedWord.length() - 1;
    changedWord = replaceXToY(changedWord, wordLenghLastindex);
    System.out.println(wordLenghLastindex);
    System.out.println(changedWord);
    System.out.println(changedWord.substring(6, 7));
  }

  private static String replaceXToY(String toBeReplaced, int wordLastIndex) {
    if (wordLastIndex == 0) {
      return toBeReplaced;
    } else {
        if (toBeReplaced.substring(wordLastIndex, wordLastIndex + 1).equals("x")) {
          String tempStringStart = toBeReplaced.substring(0, wordLastIndex - 1);
          String tempStringEnd = toBeReplaced.substring(wordLastIndex + 1);
          toBeReplaced = tempStringStart + "y" + tempStringEnd;
          replaceXToY(toBeReplaced, wordLastIndex -1);
        } else {
        replaceXToY(toBeReplaced, wordLastIndex - 1);
        }
      return toBeReplaced;
    }
  }
}
