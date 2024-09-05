import java.util.Arrays;

public class DiagonalTraverse {
  public static void main(String[] args) {
    int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    System.out.println(Arrays.toString(findDiagonalOrder(mat)));
  }

  public static int[] findDiagonalOrder(int[][] mat) {
    int rows = mat.length;
    int cols = mat[0].length;
    int[] a = new int[rows * cols];
    int x = 0, y = 0;
    for (int i = 0; i < rows * cols; i++) {
      a[i] = mat[x][y];
      if ((x + y) % 2 == 0) {
        if (y == cols - 1) {
          x += 1;
        } else if (x == 0) {
          y += 1;
        } else {
          x -= 1;
          y += 1;
        }
      } else {
        if (x == rows - 1) {
          y += 1;
        } else if (y == 0) {
          x += 1;
        } else {
          x += 1;
          y -= 1;
        }
      }
    }
    return a;
  }
}
