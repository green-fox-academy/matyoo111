import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Hand {
  List<Card> hand;

  public Hand(List<Card> cards) {
    this.hand = sortedhand(cards);
}

  public static List<Integer> hand_pairs(List<Card> cards) {
    List<Integer> pairs = new ArrayList<>();
    for (int i = 0; i < cards.size() - 1; i++) {
      if (cards.get(i).getNumber() == cards.get(i + 1).getNumber()) {
        if (pairs.size() == 0) {
          pairs.add(cards.get(i).getNumber());
        } else if (pairs.get(0) != cards.get(i).getNumber()) {
          pairs.add(cards.get(i).getNumber());
        }
      }
    }

    return pairs;
  }

  public static int hand_drill(List<Card> cards) {
    int drill = 0;
    for (int i = 0; i < cards.size() - 2; i++) {
      if (cards.get(i).getNumber() == cards.get(i + 1).getNumber() && cards.get(i).getNumber() == cards.get(i + 2).getNumber()) {
          drill = cards.get(i).getNumber();
      }
    }

    return drill;
  }

  public static int hand_poker(List<Card> cards) {
    int poker = 0;
    for (int i = 0; i < cards.size() - 3; i++) {
      if (cards.get(i).getNumber() == cards.get(i + 1).getNumber() && cards.get(i).getNumber() == cards.get(i + 2).getNumber() && cards.get(i).getNumber() == cards.get(i + 3).getNumber()) {
        poker = cards.get(i).getNumber();
      }
    }
    return poker;
  }

  public static int hand_full(List<Card> cards) {
    int poker = 0;
    for (int i = 0; i < cards.size() - 3; i++) {
      if (cards.get(i).getNumber() == cards.get(i + 1).getNumber() && cards.get(i).getNumber() == cards.get(i + 2).getNumber() && cards.get(i).getNumber() == cards.get(i + 3).getNumber()) {
        poker = cards.get(i).getNumber();
      }
    }
    return poker;
  }



  public Card get_max(List<Card> cards) {
    int currentmax = 0;
    Card currentmaxCard = null;
    for (int i = 0; i < cards.size() ; i++) {
      if (cards.get(i).getNumber() > currentmax){
        currentmax = cards.get(i).getNumber();
        currentmaxCard = cards.get(i);
      }
    }
    return currentmaxCard;
  }

  public List<Card> sortedhand(List<Card> cards){
    List<Card> sortedhand = new ArrayList<>(cards.size());
    for (int i = 0; i <cards.size(); i++) {
      Card maxcard = get_max(cards);
      sortedhand.add(maxcard);
      cards.remove(cards.get(cards.indexOf(maxcard)));
    }
    return sortedhand;
  }

}
