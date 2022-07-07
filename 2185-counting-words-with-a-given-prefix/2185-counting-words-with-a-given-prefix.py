class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        c=0
        for i in words:
            if i[:len(pref)]==pref:
                c+=1
        return c
        