public class ChessTable {
    public static void main(String[] args) {
        int number = 8;
        for (int a = 0; a < number; a++) {
            for (int b = 0; b < number; b++ ) {
                if ((a % 2 == 1 && b % 2 == 0) || (a % 2 == 0 && b % 2 == 1)) {
                    System.out.print("%");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
