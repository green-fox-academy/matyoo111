import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {



  int Budget;
  List<Animal> animals;
  List<String> adopters;

  public AnimalShelter() {
    animals = new ArrayList<>();
    adopters = new ArrayList<>();
    Budget = 50;
  }

  public int rescue(Animal animal) {
    animals.add(animal);
    return animals.size();
  }

  public int heal() {
    for (Animal animal : animals) {
      if (!(animal.isHealthy) && animal.healCost < Budget) {
        animal.heal();
        Budget -= animal.healCost;
        return 1;
      }
    }
    return 0;
  }

  public void addAdopter(String adopterName) {
    adopters.add(adopterName);
  }

  public void findNewOwner() {
    int randomAnimal = (int) Math.random() * animals.size() + 0;
    int randomAdopter = (int) Math.random() * adopters.size() + 0;
    if (animals.get(randomAnimal).isHealthy) {
      animals.remove(randomAnimal);
      adopters.remove(randomAdopter);
    }
  }

  public int earnDonation(int donation) {
    Budget += donation;
    return Budget;
  }

  @Override
  public String toString() {
    String status = "Budget: " + Budget + "€, There are " + animals.size() + " animal(s) and " + adopters.size() + " potential adopter(s)\n";
    for (Animal animal : animals) {
      if (!animal.isAdoptable()) {
        status += animal.toString();
      } else {
        status += animal.toString();
      }
    }
    return status;
  }
}
