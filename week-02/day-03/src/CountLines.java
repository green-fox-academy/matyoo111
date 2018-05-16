import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    System.out.println(numOfLines("filename.txt"));
  }
  public static int numOfLines(String filename) {
    try {
      Path filepath = Paths.get(filename);
      List<String> linesofile = Files.readAllLines(filepath);
      int numlines = linesofile.size();
      return numlines;
    }
    finally {
      return 0;
    }
  }
}
