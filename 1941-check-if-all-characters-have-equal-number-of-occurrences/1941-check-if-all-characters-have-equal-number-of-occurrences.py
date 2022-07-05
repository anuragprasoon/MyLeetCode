class Solution:
    from collections import Counter
    def areOccurrencesEqual(self, s: str) -> bool:
        s=list(Counter(s).values())
        for i in s:
            if i!= s[0]:
                return False
            else:
                continue
        return True
        
        