import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    System.out.println(logIP("log.txt"));
    System.out.println(getpostratio("log.txt"));

  }
  public static List<String> logIP(String filename) {
    try {
      Path logpath = Paths.get(filename);
      List<String> lineslogtxt = Files.readAllLines(logpath);
      ArrayList<String> IPaddresses = new ArrayList<>();
      for (int i = 0; i < lineslogtxt.size(); i++) {
        IPaddresses.add(i, lineslogtxt.get(i).split(" ")[8]);
      }
      Collections.sort(IPaddresses);
      for (int i = 0; i < IPaddresses.size() -1; i++) {
        for (int j = i + 1; j < IPaddresses.size() - 1; j++) {
          if (IPaddresses.get(i).equals(IPaddresses.get(j))) {
            IPaddresses.remove(j);
            j--;
          }
        }
      }
      return IPaddresses;
    }
    catch (IOException e) {
      System.out.println("Could not read file");
      List<String> notfound = new ArrayList<>();
      return notfound;
    }
  }
  public static float getpostratio(String filename) {
    try {
      Path logpath = Paths.get(filename);
      List<String> lineslogtxt = Files.readAllLines(logpath);
      ArrayList<String> getpost = new ArrayList<>();
      for (int i = 0; i < lineslogtxt.size(); i++) {
        getpost.add(i, lineslogtxt.get(i).split(" ")[11]);
      }
      int get = 0;
      for (int i = 0; i < getpost.size(); i++) {
        if (getpost.get(i).equals("GET")) {
          get = get + 1;
        }
      }
      float post = (float)getpost.size() - (float)get;
      float ratio = get / post;
      return ratio;
    }
    catch (Exception e) {
      System.out.println("Could not read file");
      return 0;
    }
  }
}
