import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {
        int numint = 5;
        Scanner in = new Scanner(System.in);
        double num[] = new double[numint];
        double average;
        double sum = 0;
        for (int i = 0; i < numint; i++) {
            System.out.println("Enter a number");
            num[i] = in.nextInt();
            sum = sum + num[i];
        }
        average = sum/numint;
        System.out.println("Average = " + average);
    }
}
