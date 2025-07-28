class Solution:
    def reverseString(self, s: List[str]) -> None:
        l=0
        r=len(s)-1
        for i in range(0,r):
            if l<r:
                s[l],s[r]=s[r],s[l]
            l=l+1
            r=r-1   
        
        """
        Do not return anything, modify s in-place instead.
        """
        