public class FizzBuzz {
    public static void main(String[] args) {
        int a;
        for (a = 1; a <= 100; a++) {
            boolean div3 = a % 3 == 0 && a % 5 != 0;
            boolean div5 = a % 5 == 0 && a % 3 != 0;
            boolean div35 = a % 5 == 0 && a % 3 == 0;
            if (div3) {
                System.out.println("Fizz");
            }
            else if (div5) {
                System.out.println("Buzz");
            }
            else if (div35) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(a);
            }
        }
    }
}
