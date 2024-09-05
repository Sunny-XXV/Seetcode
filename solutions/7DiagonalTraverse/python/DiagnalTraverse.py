class Solution(object):
    def findDiagonalOrder(self, mat):
        rows = len(mat)
        cols = len(mat[0])
        answer = []
        x = y = 0

        for i in range(rows * cols):
            answer.append(mat[x][y])
            if (x + y) % 2 == 0:
                if y == cols - 1:
                    x += 1
                elif x == 0:
                    y += 1
                else:
                    x -= 1
                    y += 1
            else:
                if x == rows - 1:
                    y += 1
                elif y == 0:
                    x += 1
                else:
                    x += 1
                    y -= 1
        return answer
