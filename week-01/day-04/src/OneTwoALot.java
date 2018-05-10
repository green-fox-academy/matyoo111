import java.util.Scanner;
public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberinput = scanner.nextInt();
        if (numberinput <= 0) {
            System.out.println("Not enough");
        }
        else if (numberinput == 1) {
            System.out.println("One");
        }
        else if (numberinput == 2) {
            System.out.println("Two");
        }
        else {
            System.out.println("A lot");
        }
    }
}
