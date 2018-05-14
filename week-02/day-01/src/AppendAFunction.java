public class AppendAFunction {
  public static void main(String[] args) {
    String am = "macsk";
    System.out.println(appendA(am));

  }
  public static String appendA (String toAppend) {
    toAppend = toAppend + "a";
    return toAppend;
  }
}
