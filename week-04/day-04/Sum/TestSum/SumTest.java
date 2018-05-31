import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  static Sum sum;

  @BeforeClass
  public static void init() {
    sum = new Sum();
  }

  @Test
  public void should_return_sum_when_arrayOfNumbersInput() {

    //Assignment
    ArrayList<Integer> testValues1 = new ArrayList<>(Arrays.asList(3, 4, 5));
    int expectedResult1 = 12;

    //Act
    int actualResult1 = sum.sumNumbers(testValues1);

    //Assertion
    assertEquals(expectedResult1, actualResult1);
  }

  @Test
  public void should_return_zero_when_emptyListInput() {

    //Assignment
    ArrayList<Integer> testValues2 = new ArrayList<>(Arrays.asList());
    int expectedResult2 = 0;

    //Act
    int actualResult2 = sum.sumNumbers(testValues2);

    //Assertion
    assertEquals(expectedResult2, actualResult2);
  }

  @Test
  public void should_return_zero_when_oneElementListInput() {

    //Assignment
    ArrayList<Integer> testValues3 = new ArrayList<>(Arrays.asList(4));
    int expectedResult3 = 4;

    //Act
    int actualResult3 = sum.sumNumbers(testValues3);

    //Assertion
    assertEquals(expectedResult3, actualResult3);

  }

  @Test
  public void should_return_zero_when_nullInput() {

    //Assignment
    ArrayList<Integer> testValues4 = new ArrayList<>();
    testValues4.add(null);
    int expectedResult4 = 0;

    //Act
    int actualResult4 = sum.sumNumbers(testValues4);

    //Assertion
    assertEquals(expectedResult4, actualResult4);

  }
}