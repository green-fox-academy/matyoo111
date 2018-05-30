public class Reptile extends Animal {

public Reptile(String name) {
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
