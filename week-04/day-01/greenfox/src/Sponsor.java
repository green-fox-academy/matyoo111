public class Sponsor extends Person{

  String company;
  int hiredStudents;

  public Sponsor () {
    super("Jane Doe", 30, "female");
    company = "Google";
    hiredStudents = 0;
  }

  public Sponsor (String name, int age, String gender, String company) {
    super();
    this.company = company;
    this.hiredStudents = 0;
  }

  public void introduce () {
    super.introduce();
    System.out.println(" who represents" + company + " and hired " + hiredStudents + " students so far.");
  }

  public void hire() {
    hiredStudents++;
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
}
