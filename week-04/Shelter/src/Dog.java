public class Dog extends Animal {


  public Dog(String name) {
    super(name);
    healCost = randomNumGenerator();
  }


  public Dog() {
    super();
    healCost = randomNumGenerator();
  }

  public int randomNumGenerator() {
    return (int) (Math.random() * 8 + 1);
  }
}
