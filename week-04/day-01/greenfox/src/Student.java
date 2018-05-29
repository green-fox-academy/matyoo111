public class Student extends Person {

  String previousOrganization;
  int skippedDays;

  public Student() {
    super("Jane Doe", 30, "female");
    previousOrganization = "The School of life";
    skippedDays = 0;
  }

  public Student (String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    super.introduce();
    System.out.println(" from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays (int skippedDays) {
    this.skippedDays++;
  }
}
