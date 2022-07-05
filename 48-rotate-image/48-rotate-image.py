class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        matrix[:]=matrix[::-1]
        m=[]
        for j in range(len(matrix)):            
            m.append([matrix[i][j] for i in range(len(matrix))])
        matrix[:]=m
        """
        Do not return anything, modify matrix in-place instead.
        """
        