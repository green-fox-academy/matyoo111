import java.util.List;

public class ScoreEvaluator {



  public static int scoreGiver(List<Card> cards) {
    if (CardEvaluator.check_royal_flush(cards)) {
      return 10;
    } else if (CardEvaluator.check_straight_flush(cards)) {
      return 9;
    } else if (CardEvaluator.check_poker(cards)) {
      return 8;
    } else if (CardEvaluator.check_full_house(cards)) {
      return 7;
    } else if (CardEvaluator.check_flush(cards)) {
      return 6;
    } else if (CardEvaluator.check_straight(cards)) {
      return 5;
    } else if (CardEvaluator.check_drill(cards)) {
      return 4;
    } else if (CardEvaluator.check_two_pairs(cards)) {
      return 3;
    } else if (CardEvaluator.check_pair(cards)) {
      return 2;
    }
    return 0;
  }

  public static String typeTeller(List<Card> cards) {
    if (CardEvaluator.check_royal_flush(cards)) {
      return "with royal flush";
    } else if (CardEvaluator.check_straight_flush(cards)) {
      return "with straight flush";
    } else if (CardEvaluator.check_poker(cards)) {
      return "with poker";
    } else if (CardEvaluator.check_full_house(cards)) {
      return "with full house";
    } else if (CardEvaluator.check_flush(cards)) {
      return "with flush";
    } else if (CardEvaluator.check_straight(cards)) {
      return "with straight";
    } else if (CardEvaluator.check_drill(cards)) {
      return "with drill";
    } else if (CardEvaluator.check_two_pairs(cards)) {
      return "with two pairs";
    } else if (CardEvaluator.check_pair(cards)) {
      return "with pair";
    }
    return "nothing happened";
  }


}
