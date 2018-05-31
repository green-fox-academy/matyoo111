import java.util.HashMap;
import java.util.Map;

public class CountLetters {
  public static void main(String[] args) {

    String word = "count the letter in this stringxxx";
    System.out.println(countLetter(word).toString());

  }

  public static Map<Character, Integer> countLetter(String word) {
    Map<Character, Integer> dictionary = new HashMap<>();
    for (int i = 0; i < word.length(); i++) {
      int counter = 0;
      for (int j = 0; j < word.length(); j++) {
        if (word.charAt(i) == word.charAt(j)) {
          counter++;
        }
        dictionary.put(word.charAt(i), counter);
      }
    }
    return dictionary;
  }
}
