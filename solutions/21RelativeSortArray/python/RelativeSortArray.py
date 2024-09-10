from typing import List


class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        arr_max, arr_min = max(arr1), min(arr1)
        counts = [0 for _ in range(arr_max - arr_min + 1)]

        for num in arr1:
            counts[num - arr_min] += 1

        relativeSort = []
        for num in arr2:
            while counts[num - arr_min] > 0:
                relativeSort.append(num)
                counts[num - arr_min] -= 1
        for i in range(arr_max - arr_min + 1):
            while counts[i] > 0:
                relativeSort.append(arr_min + i)
                counts[i] -= 1
        return relativeSort
