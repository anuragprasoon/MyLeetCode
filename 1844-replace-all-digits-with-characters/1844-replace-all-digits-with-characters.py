class Solution:
    def replaceDigits(self, s: str) -> str:
        chr="abcdefghijklmnopqrstuvwxyz"
        s=[chr[chr.index(s[i-1])+int(s[i])] if s[i] in "0123456789" else s[i] for i in range(len(s))]
        return "".join(s)
        