class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        w=0
        for i in range(0,len(accounts)):
            s=0
            for j in accounts[i]:
                s+=j
            if s>=w:
                w=s
        return w
                