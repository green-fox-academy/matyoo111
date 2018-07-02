public class Card {

  String suit;
  int number;

  public String getSuit() {
    return suit;
  }

  public int getNumber() {
    return number;
  }

  public Card(String card) {
    number = get_card_number(card);
    suit = card.substring(1, 1);
  }

  public int get_card_number(String card) {
    try{
      number = Integer.parseInt(card.substring(0, 0));
    } catch (Exception e) {
      switch (card.substring(0, 0)){
        case ("J"):
          number =11;
          break;
        case ("Q"):
          number =12;
          break;
        case("K"):
          number = 13;
          break;
        case ("A"):
          number = 14;
          break;
      }
    }
    return number;
  }
}
