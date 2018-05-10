import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userinputkm = scanner.nextInt();
        double miles = userinputkm / 1.6;
        System.out.println(userinputkm + " is approximately" + miles + " miles");
    }
}
