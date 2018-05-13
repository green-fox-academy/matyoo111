import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int firstnum = scanner.nextInt();
        System.out.println("Please enter the second number");
        int secondnum = scanner.nextInt();
        if (firstnum > secondnum) {
            System.out.println(firstnum);
        }
        else if (firstnum < secondnum) {
            System.out.println(secondnum);
        }
        else {
            System.out.println("Enter different numbers");
        }
    }
}
