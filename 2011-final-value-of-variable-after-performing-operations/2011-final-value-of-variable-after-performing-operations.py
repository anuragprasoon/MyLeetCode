class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        operations=[-1 if operations[i] == "--X" or operations[i]=="X--" else 1 for i in range(len(operations)) ]
        return sum(operations)
    """   s=0
        for i in range(0,len(operations)):
            if operations[i]=="--X" or operations[i]=="X--":
                operations[i]=-1
                s-=1
            else:
               s+=1
        return s"""
            