import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardEvaluator {


  public static boolean check_poker(List<Card> cards) {
    for (int i = 0; i < cards.size() - 3; i++) {
      if (cards.get(i).number == cards.get(i + 1).number && cards.get(i).number == cards.get(i + 2).number && cards.get(i).number == cards.get(i + 3).number) {
        return true;
      }
    }
    return false;
  }

  public static String hight_card(List<Card> cards_black, List<Card> cards_white) {
    if (cards_black.get(0).number > cards_white.get(0).number) {
      return "black";
    } else if (cards_black.get(0).number < cards_white.get(0).number) {
      return "white";
    } else {
      cards_black.remove(0);
      cards_white.remove(0);
      hight_card(cards_black, cards_white);
    }
    return "tie";
  }

  public static boolean check_royal_flush(List<Card> cards) {
    if (check_straight_flush(cards) && cards.get(0).number == 14) {
      return true;
    }
    return false;
  }

  public static boolean check_straight(List<Card> cards) {
    int counter = 0;
    for (int i = 0; i < cards.size() - 1; i++) {
      if (cards.get(i).number == cards.get(i + 1).number + 1) {
        counter++;
      }
    }
    if (counter == 4) {
      return true;
    }
    return false;
  }

  public static boolean check_straight_flush(List<Card> cards) {
    if (check_straight(cards) && check_flush(cards)) {
      return true;
    }
    return false;
  }

  public static boolean check_flush(List<Card> cards) {
    int counter = 0;
    String color = cards.get(0).color;
    for (Card card : cards) {
      if (card.color == color) {
        counter++;
      }
    }
    if (counter == 5) {
      return true;
    }
    return false;
  }

  public static boolean check_pair(List<Card> cards) {
    int counter = 0;
    for (int i = 0; i < cards.size() - 3; i++) {
      if (cards.get(i).number == cards.get(i + 1).number && cards.get(i).number != cards.get(i + 2).number ) {
        counter++;
      }
    }
    for (int i = cards.size() - 2; i < cards.size() - 1; i++) {
      if (cards.get(i).number == cards.get(i + 1).number) {
        counter++;
      }
    }
    if (counter == 1) {
      return true;
    }
    return false;
  }

  public static boolean check_drill(List<Card> cards) {
    int counter = 0;
    for (int i = 0; i < cards.size() - 4; i++) {
      if (cards.get(i).number == cards.get(i + 1).number && cards.get(i).number == cards.get(i + 2).number && cards.get(i).number != cards.get(i + 3).number ) {
        counter++;
      }
    }
    for (int i = cards.size() - 4; i < cards.size() - 2; i++) {
      if (cards.get(i).number == cards.get(i + 1).number && cards.get(i).number == cards.get(i + 2).number) {
        counter++;
      }
    }
    if (counter == 2) {
      return true;
    }
    return false;
  }

  public static boolean check_full_house(List<Card> cards) {
    int counter = 0;
    for (int i = 0; i < cards.size() - 3; i++) {
      if (cards.get(i).number == cards.get(i + 1).number && cards.get(i).number == cards.get(i + 2).number) {
        counter++;
      }
    }
    for (int i = cards.size() - 3; i < cards.size() - 1; i++) {
      if (cards.get(i).number == cards.get(i + 1).number) {
        counter++;
      }
    }
    if (counter == 2) {
      return true;
    }
    return false;
  }

  public static boolean check_two_pairs(List<Card> cards) {
    int counter = 0;
    for (int i = 0; i < cards.size() - 3; i++) {
      if (cards.get(i).number == cards.get(i + 1).number && cards.get(i).number != cards.get(i + 2).number) {
        counter++;
      }
    }
    for (int i = cards.size() - 3; i < cards.size() - 1; i++) {
      if (cards.get(i).number == cards.get(i + 1).number) {
        counter++;
      }
    }
    if (counter == 2) {
      return true;
    }
    return false;
  }

  public static List<Card> card_sorter(List<Card> cards) {
    Collections.sort(cards, new Comparator<Card>() {
              @Override
              public int compare(Card o1, Card o2) {
                return o2.number - o1.number;
              }
            }
    );
    return cards;
  }
}



