class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        nonZeroIndex = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[nonZeroIndex], nums[i] = nums[i], nums[nonZeroIndex]
                nonZeroIndex += 1
        # 这也叫快慢指针，i是快指针，nonZeroIndex叫慢指针
