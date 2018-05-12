import java.util.Scanner;
public class animalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell us how many chickens you have!");
        int chickens = scanner.nextInt();
        System.out.println("Tell us how many pigs you have!");
        int pigs = scanner.nextInt();
        int legs = chickens * 2 + pigs * 4;
        System.out.println("Your livestock has " + legs + " legs.");
    }
}
