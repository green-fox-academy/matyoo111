import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PokerAppTest {


  PokerApp pokerApp = new PokerApp();


  @Test
  public void highest_card() {
    List<String> cards_white = Arrays.asList("2H", "3D", "5S", "9C", "KD");

    int expectedResult = 13;
    //int result = pokerApp.hand_highest(List<String> cards_white);

    //assertEquals(expectedResult, result);




  }
  @Test
  public void contains_pair() {
    List<String> cards_white = Arrays.asList("2H", "3D", "5S", "9C", "KD");
    //List<String> cards_black = Arrays.asList("2C", "3H", "4S", "8C", "AH");

    int expectedResult = 0;
    //int result = pokerApp.hand_highestpair(List<String> cards_white);

    //assertEquals(expectedResult, result);

  }



}