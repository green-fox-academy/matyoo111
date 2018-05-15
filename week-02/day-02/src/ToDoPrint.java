public class ToDoPrint {
  public static void main(String... args){
    String todoText = "- Buy milk\n";

    todoText = "My todo:\n" + todoText.substring(0, 11) + "- Download games\n" + "\t- Diablo";

    System.out.println(todoText);
  }
}
