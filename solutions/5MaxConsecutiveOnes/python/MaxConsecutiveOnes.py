class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        streak = 0
        cnt = 0
        for num in nums:
            if num == 1:
                cnt += 1
            else:
                cnt = 0
            if cnt > streak:
                streak = cnt
        return streak
