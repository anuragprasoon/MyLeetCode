class Solution:
    def toLowerCase(self, s: str) -> str:
        l=''
        for i in s:
            if  ord(i)>=65 and ord(i)<=90:
                l+=chr(ord(i)+32)
            else:
                l+=i
        return l