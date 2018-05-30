public class Student extends Person implements Cloneable {

  String previousOrganization;
  int skippedDays;

  public Student(String name, int age, String gender) {
    super("Jane Doe", 30, "female");
    previousOrganization = "The School of life";
    skippedDays = 0;
  }

  public Student (String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student clone() {
    return new Student(name, age, gender, previousOrganization);
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
