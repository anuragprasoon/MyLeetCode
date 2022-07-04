class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        words=[words[x] for x in range(len(words))if words[x]==words[x][::-1]]
        if len(words)==0:
            return ""
        else:
            return words[0]