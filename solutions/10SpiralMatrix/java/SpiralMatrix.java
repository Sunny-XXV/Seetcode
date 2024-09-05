import java.util.ArrayList;

public class SpiralMatrix {
  public List<Integer> spiralOrder(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    boolean[] colViewed = new boolean[cols];
    boolean[] rowViewed = new boolean[rows];
    boolean right = true, down = false, left = false, up = false;

    int x = 0, y = 0, index = 0;
    List<Integer> answer = new ArrayList<>();

    while (true) {
      answer.add(matrix[x][y]);
      if (right && y < cols - 1 && !colViewed[y + 1]) {
        y += 1;
        continue;
      } else if (right && (y >= cols || colViewed[y + 1]) && (x < rows - 1 && !colViewed[x + 1])) {
        right = false;
        down = true;
        x += 1;
        rowViewed[x] = true;
        continue;
      } else if (down && x < rows - 1 && !rowViewed[x + 1]) {
        x += 1;
        continue;
      } else if (down && (x >= rows || rowViewed[x + 1]) && (y > 0 && !colViewed[y - 1])) {
        down = false;
        left = true;
        x -= 1;
        colViewed[y] = true;
        continue;
      } else if (left && y > 0 && !colViewed[y - 1]) {
        y -= 1;
        continue;
      } else if (left && (y <= 0 || colViewed[y - 1]) && (x > 0 && !rowViewed[x - 1])) {
        left = false;
        up = true;
        x -= 1;
        rowViewed[x] = true;
        continue;
      } else if (up && x > 0 && !rowViewed[x - 1]) {
        x -= 1;
        continue;
      } else if (up && (x <= 0 || rowViewed[x - 1]) && (y < cols - 1 && !colViewed[y + 1])) {
        up = false;
        right = true;
        y += 1;
        colViewed[y] = true;
        continue;
      } else {
        return answer;
      }
    }
  }
}
