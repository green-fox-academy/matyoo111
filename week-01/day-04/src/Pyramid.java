public class Pyramid {
    public static void main(String[] args) {
        int diagnum = 6;
        int b = diagnum;
        for (int a = 1; a <= diagnum; a++) {
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
