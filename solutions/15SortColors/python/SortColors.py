class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        lastRed, firstBlue, index = 0, n - 1, 0
        while index <= firstBlue:
            if index < lastRed:
                index += 1
            elif nums[index] == 0:
                nums[index], nums[lastRed] = nums[lastRed], nums[index]
                lastRed += 1
            elif nums[index] == 2:
                nums[index], nums[firstBlue] = nums[firstBlue], nums[index]
                firstBlue -= 1
            else:
                index += 1
