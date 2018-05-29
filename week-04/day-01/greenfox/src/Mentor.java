public class Mentor extends Person {
  String level;

  public Mentor () {
    super("Jane Doe", 30, "female");
    level = "Intermediate";
  }

  public Mentor (String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  @Override
  public void getGoal () {
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce () {
    super.introduce();
    System.out.println(level + " mentor.");
  }

}
