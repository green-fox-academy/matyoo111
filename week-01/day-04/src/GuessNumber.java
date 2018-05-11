import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        int storedNumber = 8;
        System.out.println("Guess a number:");
        Scanner scanner = new Scanner(System.in);
        int guessedNumber = scanner.nextInt();
        if (storedNumber > guessedNumber) {
            System.out.println("The stored number is highter");
        }
        else if (storedNumber < guessedNumber) {
            System.out.println("The stored number is lower");
        }
        else {
            System.out.println("You found the number: " + storedNumber);
        }
    }
}
