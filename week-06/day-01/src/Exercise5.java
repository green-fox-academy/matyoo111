import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {

  public static void main(String[] args) {

    String exampleString = "Find the UpperCase Characters IN A STRING";

    exampleString.chars()
            .mapToObj(n -> (char) n)
            .filter(n -> n.toString().equals(n.toString().toUpperCase()) && !(n.equals(' ')))
            .forEach(System.out::print);

    String[] splittedString = exampleString.split("");

    System.out.println(" or ");

    String result = Arrays.stream(splittedString)
            .map(c -> c.charAt(0))
            .filter(c -> c.isUpperCase(c))
            .map(c -> Character.toString(c))
            .reduce((uppercase, letter) -> uppercase + letter)
            .get();
    System.out.println(result);

  }
}