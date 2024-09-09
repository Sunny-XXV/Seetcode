class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        numDict = dict()
        for num in nums:
            if num in numDict:
                numDict[num] += 1
            else:
                numDict[num] = 1

        max, max_index = float("-inf"), -1
        for num in numDict:
            if numDict[num] > max:
                max = numDict[num]
                max_index = num

        return max_index
