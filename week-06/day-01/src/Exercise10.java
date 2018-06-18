import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise10 {

  public static void main(String[] args) {

    Fox roka1 = new Fox("rokakoma", "arcticfox", "green");
    Fox roka2 = new Fox("vuk", "redfox", "orange");
    Fox roka3 = new Fox("karak", "redfox", "black");
    Fox roka4 = new Fox("roooka", "palefox", "green");
    Fox roka5 = new Fox("bengali", "palefox", "orange");

    List<Fox> foxes = new ArrayList<>(Arrays.asList(roka1, roka2, roka3, roka4, roka5));

    foxes.stream()
            .filter(n -> n.color.equals("green") || n.type.equals("pale"))
            .forEach(n -> System.out.println(n.name));
  }
}
