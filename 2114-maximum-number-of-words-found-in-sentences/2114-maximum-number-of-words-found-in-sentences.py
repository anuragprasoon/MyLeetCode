class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        h=0
        for i in sentences:
            if len(i.split(" "))>h:
                h=len(i.split(" "))
        return h
        """return max([len(sentences[i].split(" ")) for i in range(len(sentences)) ])"""
        
        