class Solution(object):
    def sortArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        return self.shellSort(nums)

    def shellSort(self, nums):
        size = len(nums)
        gap = size // 2
        while gap > 0:
            for i in range(gap, size):
                tmp = nums[i]
                j = i
                while j >= gap and nums[j - gap] > tmp:
                    nums[j] = nums[j - gap]
                    j -= gap
                nums[j] = tmp
            gap = gap // 2
        return nums

    def mergeSort(self, nums):
        if len(nums) <= 1:
            return nums

        mid = len(nums) // 2
        left_nums = self.mergeSort(nums[0:mid])
        right_nums = self.mergeSort(nums[mid:])
        return self.merge(left_nums, right_nums)

    def merge(self, left_nums, right_nums):
        nums = []
        left_i, right_i = 0, 0
        while left_i < len(left_nums) and right_i < len(right_nums):
            if left_nums[left_i] < right_nums[right_i]:
                nums.append(left_nums[left_i])
                left_i += 1
            else:
                nums.append(right_nums[right_i])
                right_i += 1

        while left_i < len(left_nums):
            nums.append(left_nums[left_i])
            left_i += 1

        while right_i < len(right_nums):
            nums.append(right_nums[right_i])
            right_i += 1

        return nums

    def quickSort(self, nums, low, high):
        if low < high:
            pivot_i = self.partition(nums, low, high)
            self.quickSort(nums, low, pivot_i - 1)
            self.quickSort(nums, pivot_i + 1, high)
        return nums

    def partition(self, nums, low, high):
        pivot = nums[low]
        i, j = low, high
        while i < j:
            while i < j and nums[j] >= pivot:
                j -= 1
            while i < j and nums[i] <= pivot:
                i += 1
            nums[i], nums[j] = nums[j], nums[i]

        nums[j], nums[low] = nums[low], nums[j]
        return j
