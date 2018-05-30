import com.sun.tools.javac.comp.Flow;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  List<Plant> flowers = new ArrayList<>();
  List<Plant> trees = new ArrayList<>();

  public Garden (List<Plant> trees, List<Plant> flowers) {
    this.trees = trees;
    this.flowers = flowers;
  }
  List<Plant> plants = new ArrayList<>();
  plants.addAll(flowers);
  plants.addAll(trees);

  public void watering(int waterAmount) {
    for (Plant plant : plants
         ) {

    }
  }
}