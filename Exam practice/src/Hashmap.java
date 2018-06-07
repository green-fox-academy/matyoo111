import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Hashmap {

  public static void main(String[] args) {

    String fileURL = "info.txt";
    List<String> fileContentRaw = readFile(fileURL);
    List<String> fileContentYearsExtracted = yearChecker(fileContentRaw);
    Map<String, Integer> yearFrequencies = getYearFrequenies(fileContentYearsExtracted);


    String mostFrequentYear = greatestYearFrequency(yearFrequencies);
    System.out.println(mostFrequentYear);


  }

  public static String greatestYearFrequency(Map<String, Integer> years) {
    String mostFrequentYear = "";
    int tempLargest = 0;
    for (String key : years.keySet()) {
      if (years.get(key) > tempLargest) {
        tempLargest = years.get(key);
        mostFrequentYear = key;
      }

    }
    return mostFrequentYear;
  }



  public static Map<String, Integer> getYearFrequenies(List<String> years) {
    Map<String, Integer> yearfrequencies = new HashMap<>();
    for (int i = 0; i < years.size(); i++) {
      int counter = 0;
      for (int j = 0; j < years.size(); j++) {
        if (years.get(i).equals(years.get(j))) {
          counter++;
        }
        yearfrequencies.put(years.get(i), counter);
      }
    }
    return yearfrequencies;
  }


  public static List<String> yearChecker(List<String> fileContent) {
    Map<String, Integer> map = new HashMap<>();
    List<String> data = new ArrayList<>();
    for (int i = 0; i < fileContent.size(); i++) {
      String[] year = fileContent.get(i).split("[-;]");
      for (String birthyear : year) {
        data.add(year[1]);
      }
    }
    return data;
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
