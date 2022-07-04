class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        d={}
        for i in nums:
            if i in d:                    
                return i                 
            else:                       
                d[i]=0
        