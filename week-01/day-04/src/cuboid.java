public class cuboid {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 50;

        int volume = a * b * c;

        int sideab = a * b;
        int sideac = a * c;
        int sidebc = b * c;

        int surfacearea = 2 * (sideab + sideac + sidebc);
        System.out.println("Surface area is " + surfacearea);
        System.out.println("Volume is " + volume);

    }
}
