class Solution(object):
    def gameOfLife(self, board):
        """
        :type board: List[List[int]]
        :rtype: None Do not return anything, modify board in-place instead.
        """
        # use: 2 for d2d, 3 for l2l, 4 for d2l, 5 for l2d
        rows, cols = len(board), len(board[0])
        for i in range(rows):
            for j in range(cols):
                board[i][j] = Solution.changeState(i, j, board)

        for i in range(rows):
            for j in range(cols):
                if board[i][j] in (2, 5):
                    board[i][j] = 0
                else:
                    board[i][j] = 1

    @staticmethod
    def changeState(i, j, board):
        state, liveNbr = board[i][j], 0
        rows, cols = len(board), len(board[0])

        for x in range(max(i - 1, 0), min(i + 2, rows)):
            for y in range(max(j - 1, 0), min(j + 2, cols)):
                if (x, y) != (i, j) and board[i][j] in (1, 3, 5):
                    liveNbr += 1

        if state == 0:
            if liveNbr == 3:
                return 4
            else:
                return 2
        else:
            if liveNbr in (2, 3):
                return 3
            else:
                return 5
