class Solution:
    def reverseVowels(self, s: str) -> str:
        l,r=0,len(s)-1
        s=list(s)

        while l<r:
            if s[l] not in set('aeiouAEIOU'):
                l+=1
            elif s[r] not in set('aeiouAEIOU'):
                r-=1
            else:
                s[l],s[r]=s[r],s[l]
                r=r-1
                l=l+1
        return ''.join(s)
        