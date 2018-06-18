import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {

  public static void main(String[] args) {

    String exampleString = "Find the UpperCase Characters IN A STRING";
    
    exampleString.chars()
            .mapToObj(n -> (char) n)
            .filter(n -> n.toString().equals(n.toString().toUpperCase()))
            .forEach(System.out::println);


  }
}