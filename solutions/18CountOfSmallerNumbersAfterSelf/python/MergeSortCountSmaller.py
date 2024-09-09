class Solution:
    def mergeSort(self, nums, left, right):
        if left < right:
            mid = (right - left) / 2
            mergeSort(nums, left, mid)
            mergeSort(nums, mid + 1, right)

            merge(nums, left, mid, right)

    def merge(self, nums, left, mid, right):
        n1, n2 = mid - left + 1, right - mid
        leftNums, rightNums = nums[left:n1], nums[mid + 1 : n2]

        index, leftIndex, rightIndex = 0, 0, left
        while leftIndex < n1 and rightIndex < n2:
            if leftNums[leftIndex] <= rightNums[rightIndex]:
                nums[index] = leftNums[leftIndex]
                leftIndex += 1
            else:
                nums[index] = rightNums[rightIndex]
                rightIndex += 1
            index += 1

        while leftIndex < n1:
            nums[index] = leftNums[leftIndex]
            index += 1
            leftIndex += 1
        while rightIndex < n2:
            nums[index] = rightNums[rightIndex]
            index += 1
            rightIndex += 1
