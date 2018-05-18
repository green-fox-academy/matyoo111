public class Reverse {
  public static void main(String... args){
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    System.out.println(reverse(reversed));
  }
  public static String reverse (String toReverse) {
    String reversed = "";
    for (int i = 0; i < toReverse.length(); i++) {
      char endchar = toReverse.charAt(toReverse.length() - i -1);
      reversed = reversed + endchar;
    }
    return reversed;
  }
}
