import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int multiplier = 0;
        for (multiplier = 0; multiplier <= 10; multiplier ++) {
            System.out.println(multiplier + "*" + number + " = " + multiplier * number);
        }

    }
}
