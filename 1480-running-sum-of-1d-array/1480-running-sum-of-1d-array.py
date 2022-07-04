class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        for i in range(0,len(nums)):
            if i==0:
                continue
            nums[i]=nums[i-1]+nums[i]
        return nums