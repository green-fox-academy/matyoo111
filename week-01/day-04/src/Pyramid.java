public class Pyramid {
    public static void main(String[] args) {
        int diagnum = 10;
        for (int a = 0; a < diagnum; a++) {
            int b;
            for (b = 0; b < diagnum - a; b++) {
                System.out.print(" ");
            }
            for (b = diagnum - a + 1; b <= diagnum + a; b++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
