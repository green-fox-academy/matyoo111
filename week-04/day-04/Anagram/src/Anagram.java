import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {

  public static void main(String[] args) {

    String word1 = "William Shakespeare";
    String word2 = "I am a weakish speller";


    System.out.println(anagramChecker2(word1, word2));

  }

  public static boolean anagramChecker2(String word1, String word2) {
    List<Character> word1char = new ArrayList<>();
    List<Character> word2char = new ArrayList<>();
    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();
    for (int i = 0; i < word1.length(); i++) {
      if (word1.charAt(i) != ' ') {
        word1char.add(word1.charAt(i));
      }
    }
    for (int i = 0; i < word2.length(); i++) {
      if (word2.charAt(i) != ' ') {
        word2char.add(word2.charAt(i));
      }
    }
    Collections.sort(word1char);
    Collections.sort(word2char);
    if (word1char.equals(word2char)) {
      return true;
    } else {
      return false;
    }
  }
}

/*public static boolean anagramChecker(String word1, String word2) {
    boolean iftrue = false;
    //if (word1.length() != word2.length()) {
      //return iftrue;
    //} else {
      int checkernum = 0;
      for (int i = 0; i < word1.length(); i++) {
        for (int j = 0; j < word2.length(); j++) {
          if (word1.charAt(i) == word2.charAt(j)) {
            checkernum++;
          }
        }
      }
      if (checkernum >= word1.length()) {
        iftrue = true;
      }
    //}
    return iftrue;
  }*/
