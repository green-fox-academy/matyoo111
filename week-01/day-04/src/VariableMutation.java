public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 10;


        System.out.println(a);




        int b = 100;
        b -= 7;
        // make it smaller by 7


        System.out.println(b);




        int c = 44;
        c *= 2;
        // please double c's value


        System.out.println(c);




        int d = 125;
        d /= 5;
        // please divide by 5 d's value


        System.out.println(d);




        int e = 8;
        e = e^3;
        // please cube of e's value


        System.out.println(e);




        int f1 = 123;
        int f2 = 345;
        boolean greaterThan = f1 > f2;
        System.out.println(greaterThan);
        // tell if f1 is bigger than f2 (print as a boolean)





        int g1 = 350;
        int g2 = 200;
        boolean g2g1 = g2*2 > g1;
        System.out.println(g2g1);
        // tell if the double of g2 is bigger than g1 (print as a boolean)




        int h = 135798745;
        boolean h11divisor = h % 11 ==0;
        System.out.println(h11divisor);
        // tell if it has 11 as a divisor (print as a boolean)





        int i1 = 10;
        int i2 = 3;
        boolean i1i2square = (i2^2) < i1;
        boolean i1i2cube = (i2^3) > i1;
        boolean andi1i2 = i1i2cube && i1i2square;
        System.out.println(andi1i2);
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)




        int j = 1521;
        boolean jdiv3 = j % 3 ==0;
        boolean jdiv5 = j % 5 ==0;
        boolean jdiv3or5 = jdiv5 || jdiv3;
        System.out.println(jdiv3or5);
        // tell if j is dividable by 3 or 5 (print as a boolean)




        String k = "Apple";
        int kmulti = 2;
        for (int i =0; i < kmulti; i++) {
            k = k + k;
        }
        System.out.println(k);
        //fill the k variable with its cotnent 4 times
    }
}
