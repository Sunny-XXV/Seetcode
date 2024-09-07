class GameOfLife {
  public void gameOfLife(int[][] board) {
    // use: 2 for d2d, 3 for l2l, 4 for d2l, 5 for l2d
    int rows = board.length, cols = board[0].length;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j] = stateCalc(i, j, board);
      }
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (board[i][j] == 2 || board[i][j] == 5) {
          board[i][j] = 0;
          continue;
        }

        if (board[i][j] == 3 || board[i][j] == 4) {
          board[i][j] = 1;
          continue;
        }
      }
    }
  }

  public static int stateCalc(int x, int y, int[][] board) {
    int state = board[x][y], activeCnt = 0;
    int rows = board.length, cols = board[0].length;
    for (int i = x - 1; i < x + 2; i++) {
      for (int j = y - 1; j < y + 2; j++) {
        if (i < 0 || i >= rows || j < 0 || j >= cols) {
          continue;
        } else if (board[i][j] == 1 || board[i][j] == 3 || board[i][j] == 5) {
          activeCnt += 1;
        }
      }
    }

    if (state == 1) {
      activeCnt--;
    }
    // use: 2 for d2d, 3 for l2l, 4 for d2l, 5 for l2d
    if (board[x][y] == 0) {
      if (activeCnt == 3) {
        return 4;
      } else {
        return 2;
      }
    } else {
      if (activeCnt == 2 || activeCnt == 3) {
        return 3;
      } else {
        return 5;
      }
    }
  }
}
