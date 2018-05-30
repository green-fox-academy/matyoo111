public class Bird extends Animal {

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
