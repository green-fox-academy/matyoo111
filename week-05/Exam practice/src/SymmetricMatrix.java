import java.util.ArrayList;
import java.util.Arrays;

public class SymmetricMatrix {

  public static void main(String[] args) {
    // Create a function named `isSymmetric` that takes an n×n integer matrix (list of lists) as parameter
    // and returns true, if is that matrix is symmetric (diagonally from top-left to bottom-right)
    // or false if it is not
    //
    // example for symmetric matrix:
    // 1 0 1
    // 0 2 2
    // 1 2 5
    //
    // example for not symmetric matrix
    // 7 7 7
    // 6 5 7
    // 1 2 1

    ArrayList<ArrayList<Integer>> symmetricMatrix = new ArrayList<ArrayList<Integer>>();

    symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(1, 0, 1, 1)));
    symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(0, 1, 3, 3)));
    symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(1, 3, 5, 5)));
    symmetricMatrix.add(new ArrayList<Integer> (Arrays.asList(1, 3, 5, 4)));

    System.out.println(isSymmetric(symmetricMatrix)); // should print out true
  }

  public static boolean isSymmetric(ArrayList<ArrayList<Integer>> symmetricMatrix) {
    int counter = 0;
    for (int i = 0; i < symmetricMatrix.size(); i++) {
      for (int j = 0; j < symmetricMatrix.get(i).size(); j++) {
        if (symmetricMatrix.get(i).get(j) == symmetricMatrix.get(j).get(i)) {
          counter++;
        }
      }
    }
    if (counter == symmetricMatrix.size()*symmetricMatrix.get(0).size()){
      return true;
    } else {
      return false;
    }
  }
}
