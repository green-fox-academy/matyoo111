import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    //System.out.println(copyFile("mynewfile.txt", "copymynewfile.txt"));
    System.out.println(copyFileSimple("mynewfile.txt", "mynewfilesecondcopy"));
  }

  public static boolean copyFile(String fileCopy, String filePaste) {
    try {
      Path pathCopy = Paths.get(fileCopy);
      List<String> content = Files.readAllLines(pathCopy);
      Path pathPaste = Paths.get(filePaste);
      Files.write(pathPaste, content);
      return true;
    } catch (IOException e) {
      return false;
    }
  }
  public static boolean copyFileSimple(String copyfile, String pastfile) {
    try {
      Path pathCopy = Paths.get(copyfile);
      Path pathPast = Paths.get(pastfile);
      Files.copy(pathCopy, pathPast);
      return true;
    } catch (IOException e) {
      return false;
    }
  }
}
