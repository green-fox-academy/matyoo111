public class DrawTriangle {
    public static void main(String[] args) {
        int trianglenumber = 6;
        int a;
        for (a = 1; a <= trianglenumber; a++) {
            int b;
            for (b = 1; b < a; b++) {
                System.out.print("*");
            }
            System.out.println("*");
        }


    }
}
