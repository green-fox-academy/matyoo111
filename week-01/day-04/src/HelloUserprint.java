import java.util.Scanner;
public class HelloUserprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userinputname = scanner.nextLine();
        System.out.println("Hello, " + userinputname);
    }
}
