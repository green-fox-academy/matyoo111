public class DrawDiagonal {
    public static void main(String[] args) {
        int number = 10;
        for (int a = 0; a < number; a++) {
                for (int b = 0; b < number; b++) {
                    if (a == 0 || b == a || b == 0 || a == number -1) {
                            System.out.print("% ");
                    } else {
                            System.out.print("  ");
                    }
                }
            System.out.println("%");
        }
    }
}
