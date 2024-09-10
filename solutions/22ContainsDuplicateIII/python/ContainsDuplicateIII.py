from typing import List


class Solution(object):
    def containsNearbyAlmostDuplicate(
        self, nums: List[int], indexDiff: int, valueDiff: int
    ) -> bool:
        # n = len(nums)
        # for i in range(n):
        #     for j in range(i + 1, min(i + indexDiff + 1, n)):
        #         if abs(nums[i] - nums[j]) <= valueDiff:
        #             return True
        # return False
        bucket_dict = dict()
        for i in range(len(nums)):
            num = nums[i] // (valueDiff + 1)
            if num in bucket_dict:
                return True
            bucket_dict[num] = nums[i]

            if (num - 1) in bucket_dict and abs(
                bucket_dict[num - 1] - nums[i]
            ) <= valueDiff:
                return True
            if (num + 1) in bucket_dict and abs(
                bucket_dict[num + 1] - nums[i]
            ) <= valueDiff:
                return True
            if i >= indexDiff:
                bucket_dict.pop(nums[i - indexDiff] // (valueDiff + 1))
        return False
