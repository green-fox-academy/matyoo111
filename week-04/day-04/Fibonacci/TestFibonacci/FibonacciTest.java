import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  static Fibonacci fibonacci;

  @BeforeClass
  public static void init() {
    fibonacci = new Fibonacci();
  }

  @Test
  public void test_fibonacci_with_negative() {
    int inputnumber = -3;
    int expectedOutPut = 0;

    int actualOutPut = fibonacci.fibonacciCounter(inputnumber);

    assertEquals(expectedOutPut, actualOutPut);
  }

  @Test
  public void test_fibonacci_with_largeNumber() {
    int inputnumber = 48;
    int expectedOutPut = 0;

    int actualOutPut = fibonacci.fibonacciCounter(inputnumber);

    assertEquals(expectedOutPut, actualOutPut);
  }
}