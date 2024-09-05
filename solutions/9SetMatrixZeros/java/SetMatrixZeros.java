import java.util.Arrays;

public class SetMatrixZeros {
  public void setZeros(int[][] matrix) {
    boolean[] rowZero = new boolean[matrix.length];
    boolean[] colZero = new boolean[matrix[0].length];
    Arrays.fill(rowZero, false);
    Arrays.fill(colZero, false);

    for (int i = 0; i < matrix[0].length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (matrix[i][j] == 0) {
          rowZero[i] = true;
          colZero[j] = true;
        }
      }
    }
    for (int i = 0; i < matrix[0].length; i++) {
      if (rowZero[i]) {
        for (int j = 0; j < colZero.length; j++) {
          matrix[i][j] = 0;
        }
      }
    }
    for (int i = 0; i < colZero.length; i++) {
      if (colZero[i]) {
        for (int j = 0; j < rowZero.length; j++) {
          matrix[i][j] = 0;
        }
      }
    }
  }
}
