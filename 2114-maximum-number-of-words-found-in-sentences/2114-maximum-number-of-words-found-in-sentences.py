class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        sentences=[len(sentences[i].split(" ")) for i in range(len(sentences)) ]
        return max(sentences)
        