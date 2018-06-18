import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    List<Integer> positiveSquaredNumbers =
            numbers.stream()
            .filter(n -> n > 0)
            .mapToInt(n -> n)
            .map(n -> n * n)
            .boxed()
            .collect(Collectors.toList());

    System.out.println(positiveSquaredNumbers);
  }
}
