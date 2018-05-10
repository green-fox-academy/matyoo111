import java.util.Scanner;
public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfGirls = scanner.nextInt();
        System.out.println("The number of girls is " + numberOfGirls);
        int numberOfBoys = scanner.nextInt();
        System.out.println("The number of boys is " + numberOfBoys);
        int allPeople = numberOfBoys + numberOfBoys;

        boolean girlsBoys = numberOfBoys == numberOfGirls;
        boolean more20 = numberOfBoys + numberOfGirls >= 20;
        boolean partyExcellent = girlsBoys && more20;
        boolean partyCool = more20 && !(girlsBoys) && numberOfGirls != 0;
        boolean sausage = numberOfGirls == 0;

        if (partyExcellent) {
            System.out.println("The party is excellent");
        }
        else if (partyCool) {
            System.out.println("The party is quite cool");
        }
        else if (!(more20)) {
            System.out.println("Average party..");
        }
        else if (sausage) {
            System.out.println("Sausage party");
        }
    }
}
