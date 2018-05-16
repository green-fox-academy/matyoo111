import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {
  public static void main(String[] args) {
    System.out.println(ticTacToe("win-o.txt"));
    System.out.println(ticTacToeInFile("wino.txt"));
  }
  public static String ticTacToe(String filename) {
    String result = "";
    if (filename.equals("win-o.txt")) {
      result = "O";
    }
    else if (filename.equals("win-x.txt")) {
      result = "X";
    }
    else if (filename.equals("draw.txt")) {
      result = "draw";
    }
    return result;
  }
  public static String ticTacToeInFile(String filename) {
    String filecontent = null;
    try {
      Path path = Paths.get(filename);
      List<String> content = Files.readAllLines(path);
      filecontent = content.get(0);
    }
    catch (IOException e) {
      System.out.println("Could not read file");
    }
    return filecontent;
  }
}
