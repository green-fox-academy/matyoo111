import java.util.*;
import java.util.ArrayList;
public class SolarSystem {
  public static void main(String... args){
    ArrayList<String> planetList = new ArrayList<>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

    System.out.println(putSaturn(planetList));
  }

  public static ArrayList putSaturn(ArrayList putSaturn) {
    putSaturn.add(5, "Saturn");
    return putSaturn;
  }
}
