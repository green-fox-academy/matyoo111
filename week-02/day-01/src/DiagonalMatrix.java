import java.lang.reflect.Array;
import java.util.Arrays;
public class DiagonalMatrix {
  public static void main(String[] args) {
    int matrixNum = 5;
    int[][] array = new int[matrixNum][matrixNum];
    for (int i = 0; i < matrixNum; i++) {
      for (int j = 0; j < matrixNum; j++) {
        if (i == j) {
          array[i][j] = 1;
        }
        else {
          array[i][j] = 0;
        }
      }
    }
    //System.out.println(Arrays.deepToString(array));
    for (int i = 0; i < matrixNum; i++) {
      for (int j = 0; j < matrixNum; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println("");

    }
  }
}
