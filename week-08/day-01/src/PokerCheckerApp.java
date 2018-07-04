import java.util.Arrays;
import java.util.List;

public class PokerCheckerApp {

  public static void main(String[] args) {

    List<Card> black = Arrays.asList(
            new Card("H", 6),
            new Card("D", 6),
            new Card("S", 3),
            new Card("C", 5),
            new Card("H", 5));

    List<Card> white = Arrays.asList(
            new Card("H", 14),
            new Card("H", 13),
            new Card("H", 12),
            new Card("H", 11),
            new Card("H", 10));

    System.out.println(winner_evaluator(black, white));

    }

    public static String winner_evaluator(List<Card> cards_black, List<Card> cards_white) {
    cards_black = CardEvaluator.card_sorter(cards_black);
    cards_white = CardEvaluator.card_sorter(cards_white);
    int blackScore = ScoreEvaluator.scoreGiver(cards_black);
    int whiteScore = ScoreEvaluator.scoreGiver(cards_white);
    String whoIsWinner;
    if (blackScore > whiteScore) {
      whoIsWinner = "Black wins " + ScoreEvaluator.typeTeller(cards_black);
    } else if (whiteScore > blackScore) {
      whoIsWinner = "White wins " + ScoreEvaluator.typeTeller(cards_white);
    } else {
      whoIsWinner = "Tie";
    }
    return whoIsWinner;
    }

}
