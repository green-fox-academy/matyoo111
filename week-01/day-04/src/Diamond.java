public class Diamond {
    public static void main(String[] args) {
        int diamondnum = 5;
        int b = diamondnum;
        int a = diamondnum;
        for (a = 0; a < diamondnum; a++) {
            for (b = 0; b < diamondnum - a; b++) {
                System.out.print(" ");
            }
            for (b = diamondnum - a; b < diamondnum + a; b++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        for (a = diamondnum; a < diamondnum * 2 + 1; a++) {
            for (b = 0; b < a - diamondnum; b++) {
                System.out.print(" ");
            }
            for (b = a - diamondnum -1; b < diamondnum * 3 -a ; b++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
