class Solution:
    from collections import Counter
    def singleNumber(self, nums: List[int]) -> int:
        dict = Counter(nums)
        return [num for num,freq in dict.items() if freq == 1][0]
        