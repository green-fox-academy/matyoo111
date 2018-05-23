import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    dominoes = sortBySnake(dominoes);


    System.out.println(dominoes);
  }
  public static List<Domino> sortBySnake(List<Domino> dominoes) {
    List<Domino> newList = new ArrayList<>();
    newList.add(dominoes.get(0));
    while (dominoes.size() != newList.size()) {
      for (int i = 1; i < dominoes.size(); i++) {
        if (dominoes.get(i).getValues()[0] == newList.get(newList.size() - 1).getValues()[1]) {
        newList.add(dominoes.get(i));
        }
      }
    }
    return newList;
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}