public class PrintEven {
    public static void main(String[] args) {
        int i = 0;
        for (i =0; i <= 500; i ++) {
            boolean even = i % 2 == 0;
            if (even) {
                System.out.println(i);
            }
        }
    }
}
