import java.util.List;

public class Plant{

  private int waterLevel;
  private int minimumWater;

  public void setWaterlevel(int waterlevel) {
    this.waterLevel = waterlevel;
  }

  public int getWaterlevel() {
    return waterLevel;
  }

  public void setMinimumWater(int minimumWater) {
    this.minimumWater = minimumWater;
  }

  public int getMinimumWater() {
    return minimumWater;
  }

  public boolean checkIfNeedWatering(Plant plant) {
    if (plant.waterLevel < plant.minimumWater) {
      System.out.println(plant + "need water");
      return true;
    } else {
      System.out.println(plant + "doesn`t need water");
      return false;
    }
  }

}