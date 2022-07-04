class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        gain=[0,]+gain
        h=0
        for i in range(1,len(gain)):
            gain[i]=gain[i-1]+gain[i]
            if gain[i]>h:
                h=gain[i]
                   
        return h
        