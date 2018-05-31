import java.util.ArrayList;

public class Sum {

  public int sumNumbers(ArrayList<Integer> values) {
    int sum = 0;
    if (values.get(0) == null) {
      return 0;
    }
    for (int numbers : values) {
      sum += numbers;
    }
    return sum;
  }
}
