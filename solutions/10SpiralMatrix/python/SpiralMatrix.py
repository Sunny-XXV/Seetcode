class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        left, right, top, down = 0, len(matrix[0]) - 1, 0, len(matrix) - 1
        ans = []

        while left <= right & top <= down:
            for j in range(left, right + 1):
                ans.append(matrix[top][j])
            top += 1

            for i in range(top, down + 1):
                ans.append(matrix[i][right])
            right -= 1

            if top <= down:
                for j in range(right, left - 1, -1):
                    ans.append(matrix[down][j])
                down -= 1

            if left <= right:
                for i in range(down, top - 1, -1):
                    ans.append(matrix[i][left])
                left += 1

        return ans
