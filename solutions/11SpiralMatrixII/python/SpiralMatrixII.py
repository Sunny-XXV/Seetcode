class Solution(object):
    def generateMatrix(self, n):
        """
        :type n: int
        :rtype: List[List[int]]
        """
        left, right, top, down = 0, n - 1, 0, n - 1
        mat = [[0 for _ in range(n)] for _ in range(n)]
        index = 1
        while left <= right and top <= down:
            for i in range(left, right + 1):
                mat[top][i] = index
                index += 1
            top += 1
            for j in range(top, down + 1):
                mat[j][right] = index
                index += 1
            right -= 1
            if top <= down:
                for i in range(right, left - 1, -1):
                    mat[down][i] = index
                    index += 1
                down -= 1
            if left <= right:
                for j in range(down, top - 1, -1):
                    mat[j][left] = index
                    index += 1
                left += 1
        return mat
