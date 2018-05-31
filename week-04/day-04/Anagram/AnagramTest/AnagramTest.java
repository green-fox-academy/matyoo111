import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  static Anagram anagram;

  @BeforeClass
  public static void init() {
    anagram = new Anagram();
  }

  @Test
  public void anagramChecker2() {

    //Assignment
    String word1 = "William Shakespeare";
    String word2 = "I am a weakish speller";
    String word3 = "retek";
    boolean expectedResult = true;
    boolean expectedResult2 = false;

    //Act
    boolean actualResult = anagram.anagramChecker2(word1, word2);
    boolean actualResult2 = anagram.anagramChecker2(word3, word2);

    //Assertion
    assertEquals(expectedResult, actualResult);
    assertEquals(expectedResult2, actualResult2);
  }
}