class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        s=0
        for i in range(0,len(operations)):
            if operations[i]=="--X" or operations[i]=="X--":
                operations[i]=-1
                s-=1
            if operations[i]=="++X" or operations[i]=="X++":
               operations[i]=1
               s+=1
        return s
            