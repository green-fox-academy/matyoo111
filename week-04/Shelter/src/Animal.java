public class Animal {

  String name;
  boolean isHealthy;
  int healCost;


  public Animal(String name) {
    this.name = name;
  }

  public Animal(){
    name = getClass().getName();
  }


  public void heal() {
    isHealthy = true;
  }

  public boolean isAdoptable () {
    if (isHealthy) {
      return true;
    }
    return false;
  }


  public String toString() {
    String status;
    if (!isHealthy) {
      status = name + " is not healthy (" + healCost + " €) and not adoptable\n";
    } else {
      status = name + " is healthy, and adoptable\n";
    }
    return status;
  }

}
