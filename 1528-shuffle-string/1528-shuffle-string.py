class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        st={}
        for i in range(len(s)):
            st[indices[i]]=s[i]
        st=[st[i] for i in range(len(s)) ]
        s=""
        for i in st:
            s+=i
        return s
        