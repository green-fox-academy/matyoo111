import java.util.ArrayList;
import java.util.List;

public class GardenApp{

  public static void main(String[] args) {
    Tree tree1 = new Tree();
    Tree tree2 = new Tree();
    Flower flower1 = new Flower();
    Flower flower2 = new Flower();

    List<Plant> trees = new ArrayList<>();
    List<Plant> flowers = new ArrayList<>();

    Garden garden1 = new Garden(trees, flowers);

  }
}