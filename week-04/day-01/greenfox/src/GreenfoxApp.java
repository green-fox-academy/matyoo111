import java.util.ArrayList;

public class GreenfoxApp {
  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<>();

    //Person mark = new Person("Mark", 46, "male");
    //people.add(mark);
    //Person jane = new Person();
    //people.add(jane);
    Student john = new Student("John Doe", 20, "male", "BME");
    people.add(john);
    Student john2 = john.clone();

    System.out.println(john2.age);
    System.out.println(john2.name);
    System.out.println(john2.previousOrganization);

    System.out.println(john.clone().equals(john));

    System.out.println(john2.equals(john));
    //john.stringstudent = john;



    /*Student student = new Student();
    people.add(student);
    student.introduce();
    jane.introduce();

    student.getGoal();
    john.introduce();
    Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
    people.add(gandhi);
    Mentor mentor = new Mentor();
    people.add(mentor);
    Sponsor sponsor = new Sponsor();
    people.add(sponsor);
    Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
    people.add(elon);

    student.skipDays(3);

    for (int i = 0; i < 5; i++) {
      elon.hire();
    }

    for (int i = 0; i < 3; i++) {
      sponsor.hire();
    }

    for(Person person : people) {
      person.introduce();
      person.getGoal();
    }

    Cohort awesome = new Cohort("AWESOME");
    awesome.addStudent(student);
    awesome.addStudent(john);
    awesome.addMentor(mentor);
    awesome.addMentor(gandhi);
    awesome.info();*/
  }
}
