import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

  static Apples apple;

  @BeforeClass
  public static void init() {
    apple = new Apples();
  }

  @Test
  public void should_return_apple_when_empty() {

    //Assignment
    String input = "Apple";
    String expectedResult = "Apple";

    //Act
    String actualResult = apple.getApple(input);

    //Assertion
    assertEquals(expectedResult, actualResult);
  }
}