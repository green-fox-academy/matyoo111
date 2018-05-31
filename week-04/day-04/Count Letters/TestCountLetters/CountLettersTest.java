import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {

  static CountLetters countLetters;

  @BeforeClass
  public static void init() {
    countLetters = new CountLetters();
  }

  @Test
  public void main() {
  }

  @Test
  public void countLetter() {

    //Assignment
    String input = "test";
    Map<Character, Integer> expectedOutput = new HashMap<>();
    expectedOutput.put('t', 2);
    expectedOutput.put('e', 1);
    expectedOutput.put('s', 1);

    //Act
    Map<Character, Integer> actualResutl = countLetters.countLetter(input);

    //Assertion
    assertEquals(expectedOutput, actualResutl);



  }
}