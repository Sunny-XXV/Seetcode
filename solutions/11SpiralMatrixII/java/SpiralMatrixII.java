class SpiralMatrixII {
  public int[][] generateMatrix(int n) {
    int index = 1, left = 0, right = n - 1, top = 0, down = n - 1;
    int[][] mat = new int[n][n];

    while (left <= right && top <= down) {
      for (int j = left; j < right + 1; j++) {
        mat[top][j] = index++;
      }
      top++;
      for (int i = top; i < down + 1; i++) {
        mat[i][right] = index++;
      }
      right--;
      if (top <= down) {
        for (int j = right; j > left - 1; j--) {
          mat[down][j] = index++;
        }
        down--;
      }
      if (left <= right) {
        for (int i = down; i > top - 1; i--) {
          mat[i][left] = index++;
        }
        left++;
      }
    }
    return mat;
  }
}
