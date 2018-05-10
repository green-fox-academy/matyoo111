import java.util.Scanner;
public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstnum = scanner.nextInt();
        int secnum = scanner.nextInt();
        boolean secsnotbigger = secnum <= firstnum;


        if (secsnotbigger) {
            System.out.println("The second number should be bigger");
        }
        else {
            int a;
            for (a = firstnum; a < secnum; a++) {
                System.out.println(a);
            }
        }
    }
}
