public class Diamond {
    public static void main(String[] args) {
        int diamondnum = 8;
        int b = diamondnum;
        int a = diamondnum;
        for (a = 0; a < diamondnum; a++) {
            for (b = 0; b < diamondnum - a; b++) {
                System.out.print(" ");
            }
            for (b = diamondnum - a + 1; b < diamondnum + a; b++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        for (a = diamondnum; a < diamondnum * 2; a++) {
            for (b = 0; b < a - diamondnum; b++) {
                System.out.print(" ");
            }
            for (b = diamondnum - a + 1; b < diamondnum *2; b++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
