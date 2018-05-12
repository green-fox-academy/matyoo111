public class Pyramid {
    public static void main(String[] args) {
        int diagnum = 10;
        for (int a = 1; a <= diagnum; a++) {
            int b;
            for (b = 1; b < diagnum - a + 1; b++) {
                System.out.print(" ");
            }
            for (b = diagnum - a + 2; b < diagnum + a; b++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
