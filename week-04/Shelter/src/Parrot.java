public class Parrot extends Animal {


  public Parrot(String name) {
    super(name);
    healCost = randomNumGenerator();
  }

  public Parrot() {
    super();
    healCost = randomNumGenerator();
  }

  public int randomNumGenerator() {
    return (int) (Math.random() * 10 + 4);
  }
}
