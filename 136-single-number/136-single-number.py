class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        result = Counter(nums)
        for i in result:
            if result[i] == 1:
                return i
        