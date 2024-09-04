class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        if digits[-1] == 9:
            if len(digits) == 1:
                digits[-1] = 0
                digits.insert(0, 1)
            else:
                digits[-1] = 0
                digits[:-1] = self.plusOne(digits[:-1])
        else:
            digits[-1] += 1
        return digits

    def plusOneNew(self, digits: List[int]) -> List[int]:
        digits = [0] + digits
        digits[len(digits) - 1] += 1
        for i in range(len(digits) - 1, 0, -1):
            if digits[i] != 10:
                break
            else:
                digits[i] = 0
                digits[i - 1] += 1

        if digits[0] == 0:
            return digits[1:]
        else:
            return digits
