public class Cat extends Animal{



  public Cat(String name) {
    super(name);
    healCost = randomNumGenerator();
  }

  public Cat() {
    super();
    healCost = randomNumGenerator();
  }

  public int randomNumGenerator() {
    return (int) (Math.random() * 6 + 0);
  }

}
