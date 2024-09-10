from typing import List


class Solution(object):
    def findKthLargest(self, nums: List[int], k: int) -> int:
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        # 耍赖呢
        # nums.sort()
        # return nums[len(nums)-k]
        n = len(nums)
        return self.quickSort(nums, 0, n - 1, k, n)

    def quickSort(self, nums: List[int], low: int, high: int, k: int, size: int) -> int:
        if low < high:
            pivot = self.partition(nums, low, high)
            if pivot == size - k:
                return nums[size - k]
            if pivot > size - k:
                self.quickSort(nums, low, pivot - 1, k, size)
            if pivot < size - k:
                self.quickSort(nums, pivot + 1, high, k, size)
        return nums[size - k]

    def partition(self, nums: List[int], low: int, high: int) -> int:
        pivot = nums[low]
        i, j = low, high
        while i < j:
            while i < j and nums[j] >= pivot:
                j -= 1
            while j < j and nums[i] <= pivot:
                i += 1
            nums[i], nums[j] = nums[j], nums[i]
        nums[j], nums[low] = nums[low], nums[j]
        return j
