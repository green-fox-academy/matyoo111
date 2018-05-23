public class Animals {
  public static void main(String[] args) {
    Animal dog = new Animal(50, 50);
    dog.eat();
    dog.drink();
    dog.play();

    System.out.println(dog.Hunger);
    System.out.println(dog.Thirst);
  }
}
