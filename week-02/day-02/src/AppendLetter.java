import java.util.*;

public class AppendLetter{
  public static void main(String... args){
    List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.

    System.out.println(appendA(far));
  }

  public static List<String> appendA(List<String> appended) {
    for (int i = 0; i < appended.size(); i++) {
      appended.set(i, appended.get(i) + "a");
    }
    return appended;
  }
}

