class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        s=0
        for i in range(0,len(mat)):
            if (len(mat)+1)/2==i+1:
                s=s+mat[i][i]
                continue
            s=s+mat[i][i]+mat[i][-1-i]
            print(s)
        return s   
        