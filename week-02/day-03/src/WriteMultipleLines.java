import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args) {
    writeToLinesToFile("mynewfile.txt", "apple", 5 );
  }
  public static void writeToLinesToFile(String filepath, String word, int numLines) {
    List<String> filecontent = new ArrayList<>();
    for (int i = 0; i < numLines; i++) {
      filecontent.add(word);
    }
    try {
      Path path = Paths.get(filepath);
      Files.write(path, filecontent);
    }
    catch (Exception e) {
      System.out.println("could not write file");
    }
  }
}
