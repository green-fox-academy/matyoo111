public class Bird extends Animal implements Flyable {

public Bird(String name) {
  this.name = name;
}

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }

  @Override
  public void move() {

  }

  @Override
  public void feed() {

  }
}
