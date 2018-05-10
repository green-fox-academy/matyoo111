import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberinput = scanner.nextInt();
        boolean oddoreven = numberinput % 2 == 0;
        if (oddoreven) {
            System.out.println(numberinput + "is even");
        }
        else {
            System.out.println(numberinput + "is odd");
        }
    }
}
