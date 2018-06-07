import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWords {

  public static void main(String[] args) {
    ArrayList<String> offensiveWords = new ArrayList<> (Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss"));
    String fileURL = "content.txt";
    String newFileURL = "newcontent.txt";
    List<String> unsortedFileContent = readFile(fileURL);
    List<String> sortedFileContent = stringSplitter(unsortedFileContent);
    System.out.println(removeSwearWords(sortedFileContent, offensiveWords));



  }

  public static int removeSwearWords(List<String> content, ArrayList<String> swearWords) {
    int counter = 0;
    for (int i = 0; i < content.size(); i++) {
      for (int j = 0; j < swearWords.size(); j++) {
        if (content.get(i).equalsIgnoreCase(swearWords.get(j))) {
          //if (content.get(i).equalsIgnoreCase(swearWords.get(j)) || content.get(i).equalsIgnoreCase(swearWords.get(j) + ".") || content.get(i).equalsIgnoreCase(swearWords.get(j) + ",")) {
          counter++;
          content.remove(i);
        }
      }
    }
    return counter;
  }

  public static List<String> stringSplitter(List<String> fileContent) {
    List<String> separatedFileContent = new ArrayList<>();
    for (int i = 0; i < fileContent.size(); i++) {
      for (String string : fileContent.get(i).split("[ .,]")) {
        separatedFileContent.add(string);
      }
    }
    return separatedFileContent;
  }

  public static List<String> readFile(String fileURL) {
      List<String> fileContent = new ArrayList<>();
      try {
        Path filepath = Paths.get(fileURL);
        fileContent = Files.readAllLines(filepath);
      } catch (IOException e) {
        System.out.println("File cannot be read");
      }
      return fileContent;
  }
}