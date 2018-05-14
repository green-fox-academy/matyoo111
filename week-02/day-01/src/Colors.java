import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Colors {
  public static void main(String[] args) {
    String[] colors0 = {"lime", "forest green", "olive", "pale green", "spring green"};
    String[] colors1 = {"orange red", "red", "tomato"};
    String[] colors2 = {"orchid", "violet", "pink", "hot pink"};
    String[][] colors = {colors0, colors1, colors2};
    System.out.println(Arrays.deepToString(colors));
  }
}
