import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise8 {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));


    System.out.println(numbers.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

    Map<Integer, Long> frequencyOfNumbers = numbers.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    System.out.println(frequencyOfNumbers);
  }
}
