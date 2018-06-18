import java.lang.reflect.Array;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise9 {

  public static void main(String[] args) {

    char[] charArray = new char[] { 'a', 'b', 'c', 'd'};

    Character[] characterArray = new Character[] { 'a', 'b', 'c', 'd'};

    String attached = CharBuffer.wrap(charArray)
            .chars()
            .mapToObj(n -> (char) n)
            .map(n -> n.toString())
            .collect(Collectors.joining(""));

    System.out.println(attached);

    String attached2 = Arrays.stream(characterArray)
            .map(n -> Character.toString(n))
            .reduce((word, letter) -> word + letter)
            .get();
    System.out.println(attached2);
  }
}
