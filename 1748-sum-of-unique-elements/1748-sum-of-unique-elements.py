class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        nums=[nums[i] for i in range(0,len(nums)) if nums.count(nums[i])==1 ]
        s=0
        for i  in nums:
            s+=i
        return s