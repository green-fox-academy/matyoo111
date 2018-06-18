import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise7 {

  public static void main(String[] args) {

    String words = "Write a Stream Expression to find the frequency of characters in a given string!";

    String[] characters = words.split("");

    Map<String, Long> mapping = Arrays.stream(characters)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    System.out.println(mapping);

    }
}
