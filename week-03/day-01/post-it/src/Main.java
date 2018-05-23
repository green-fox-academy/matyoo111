import java.awt.*;

public class Main {
  public static void main(String[] args) {
    PostIt post1 = new PostIt();
    post1.backgroudColor = Color.orange;
    post1.text = "Idea 1";
    post1.textColor = Color.blue;

    PostIt post2 = new PostIt();
    post2.backgroudColor = Color.pink;
    post2.text = "Awesome";
    post2.textColor = Color.black;

    PostIt post3 = new PostIt();
    post3.backgroudColor = Color.yellow;
    post3.text = "Superb!";
    post3.textColor = Color.green;
  }
}
