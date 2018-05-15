import java.util.*;

public class MatchMaking {
  public static void main(String... args){
    ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));


    System.out.println(makingMatches(girls, boys));
  }
  public static ArrayList<String> makingMatches(ArrayList<String> boys, ArrayList<String> girls) {
    ArrayList<String> girlsAndBoys = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      girlsAndBoys.add(boys.get(i));
      girlsAndBoys.add(girls.get(i));
    }
    return girlsAndBoys;
  }
}
