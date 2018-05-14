public class PrintParams {
  public static void main(String[] args) {
    printParams("kutya", "cica", "eger", "lo ", "beka");

  }
  public static void printParams(String... params) {
    for (String param : params) {
      System.out.println(param);
    }
  }
}
