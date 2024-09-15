class Solution(object):
    def largestNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: str
        """
        nums = map(str, nums)
        nums.sort(cmp=lambda x, y: cmp(y + x, x + y))
        return "".join(nums).lstrip("0") or "0"
