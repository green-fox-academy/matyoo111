import com.sun.tools.hat.internal.util.ArraySorter;

import java.util.Arrays;

public class Unique {
  public static void main(String[] args) {
    int[] uniquelist = {23, 23, 34, 56, 12, 12, 11, 2, 3};
    System.out.println(Arrays.toString(unique(uniquelist)));
  }
  public static int[] unique(int[] uniquelist) {
    Arrays.sort(uniquelist);
    int [] sortedArray = new int[uniquelist.length];
    for (int i = 0; i < uniquelist.length - 1; i++) {
      int j = i;
      if (uniquelist[i] == uniquelist[i + 1]) {
        //sortedArray[j] = uniquelist[i];
      }
      else {
        sortedArray[j] = uniquelist[i];
      }
    }
    return sortedArray;
  }
}
