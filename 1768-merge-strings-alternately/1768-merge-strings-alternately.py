class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        s=[]
        word1=list(word1)
        word2=list(word2)
        if len(word2)>=len(word1):
            for i in range(len(word1)):
                s.append(word1[i]+word2[i])
            s=s+word2[len(word1):]
        if len(word2)<len(word1):
            for i in range(len(word2)):
                s.append(word1[i]+word2[i])
            s=s+word1[len(word2):]
            
        return "".join(s)
            
        