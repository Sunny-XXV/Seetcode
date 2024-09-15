import random


class Solution(object):
    def __init__(self, nums):
        """
        :type nums: List[int]
        """
        self.nums = nums
        self.original = list(nums)

    def reset(self):
        """
        Resets the array to its original configuration and return it.
        :rtype: List[int]
        """
        self.nums = list(self.original)
        return self.nums

    def shuffle(self):
        """
        Returns a random shuffling of the array.
        :rtype: List[int]
        """
        random.shuffle(self.nums)
        return self.nums
