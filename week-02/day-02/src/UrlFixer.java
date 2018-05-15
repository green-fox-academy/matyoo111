public class UrlFixer {
  public static void main(String... args){
    String url = "https//www.reddit.com/r/nevertellmethebots";

    String replacedurl = url.replace("bots", "odds");
    String finaurl = replacedurl.substring(0,4) + ":" + replacedurl.substring(5);

    System.out.println(finaurl);

    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!


  }

}
