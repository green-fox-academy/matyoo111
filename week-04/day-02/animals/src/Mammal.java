public class Mammal extends Animal {


public Mammal(String name) {
  this.name = name;
}

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String breed() {
    return "pushing miniature versions out.";
  }

  @Override
  public void move() {

  }

  @Override
  public void feed() {

  }
}
