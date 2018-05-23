public class Animal {
  int Thirst;
  int Hunger;

  public Animal(int Thirst, int Hunger) {
    this.Thirst = Thirst;
    this.Hunger = Hunger;
  }

  public void drink() {
    this.Thirst -= 2;
  }
  public void eat() {
    this.Hunger -= 2;
  }
  public void play() {
    this.Hunger++;
    this.Thirst++;
  }
}
